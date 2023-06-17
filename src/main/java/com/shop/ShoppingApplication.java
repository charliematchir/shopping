package com.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ShoppingApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoppingApplication.class, args);
    }


    //RestController 의 ResponseBody 가 자바 객체를 http 응답 본문의 객체로 변환해 클라이언트에게 전송
//    @GetMapping(value="/")
//    public String HelloWorld(){
//        return "Hello World";
//    }


}
