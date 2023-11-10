package com.hendisantika.springsecuritygooglerecaptcha.security;

import com.hendisantika.springsecuritygooglerecaptcha.service.RecaptchaService;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import java.security.interfaces.RSAKey;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-security-google-recaptcha
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 11/10/23
 * Time: 07:49
 * To change this template use File | Settings | File Templates.
 */
@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {

    private final RecaptchaService recaptchaService;
    private RSAKey rsaKey;

    public SecurityConfig(RecaptchaService recaptchaService) {
        this.recaptchaService = recaptchaService;
    }
}
