package com.shop.config;

import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import java.net.Authenticator;
import java.util.Optional;

public class AuditorAwareIml implements AuditorAware<String> {
    @Override
    public Optional<String> getCurrentAuditor() {
        Authentication authentication =
                SecurityContextHolder.getContext().getAuthentication();
        String userId = "";
        if(authentication != null) {
            userId = authentication.getName();
        }
        return Optional.of(userId);
    }
}
