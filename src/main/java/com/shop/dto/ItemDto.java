package com.shop.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ItemDto {
    private Long id;
    private String ItemName;
    private Integer price;
    private String ItemDetail;
    private String sellStatCd;
    private LocalDateTime regTime;
    private LocalDateTime udpateTime;


}
