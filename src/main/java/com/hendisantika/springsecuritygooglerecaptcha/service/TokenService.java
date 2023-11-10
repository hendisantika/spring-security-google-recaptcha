package com.hendisantika.springsecuritygooglerecaptcha.service;

import org.springframework.security.oauth2.jwt.JwtEncoder;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-security-google-recaptcha
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 11/10/23
 * Time: 07:46
 * To change this template use File | Settings | File Templates.
 */
@Service
public class TokenService {

    private final JwtEncoder encoder;

    public TokenService(JwtEncoder encoder) {
        this.encoder = encoder;
    }
}
