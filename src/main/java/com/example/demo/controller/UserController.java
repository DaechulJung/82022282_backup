package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/api/v1/user")
    public String getUser() {
        return "82022282";  // 여기에 자신의 사번을 넣으세요.
    }
}