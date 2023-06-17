package com.shop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping(value="/test")
    public UserDTO test(){
        UserDTO userDTO = new UserDTO();
        userDTO.setAge(20);
        userDTO.setName("LEE");

        return userDTO;
    }
}
