package com.klasix12.controller;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(OAuth2AuthenticationToken authentication) {
        System.out.println(authentication);
        return "main.html";
    }
}
