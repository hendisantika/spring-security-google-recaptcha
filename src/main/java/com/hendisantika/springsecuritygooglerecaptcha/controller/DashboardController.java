package com.hendisantika.springsecuritygooglerecaptcha.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-security-google-recaptcha
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 11/10/23
 * Time: 07:55
 * To change this template use File | Settings | File Templates.
 */
@RestController
@RequestMapping("/api/dashboard")
public class DashboardController {

    @GetMapping
    public String welcome() {
        return "This message was generated by Spring Boot! " + LocalDateTime.now();
    }
}
