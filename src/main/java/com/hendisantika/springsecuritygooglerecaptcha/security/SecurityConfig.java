package com.hendisantika.springsecuritygooglerecaptcha.security;

import com.hendisantika.springsecuritygooglerecaptcha.service.RecaptchaService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

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

    @Bean
    public AuthenticationManager authManager(UserDetailsService userDetailsService) {
        var authProvider = new DaoAuthenticationProvider();
        authProvider.setUserDetailsService(userDetailsService);
        return new ProviderManager(authProvider);
    }

    @Bean
    public UserDetailsService userDetailsService() {
        return new InMemoryUserDetailsManager(
                User.withUsername("naruto")
                        .password("{noop}password")
                        .authorities("read")
                        .build()
        );
    }
}
