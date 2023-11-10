package com.hendisantika.springsecuritygooglerecaptcha.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-security-google-recaptcha
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 11/10/23
 * Time: 07:45
 * To change this template use File | Settings | File Templates.
 */
@Service
public class RecaptchaService {

    private final RestTemplate restTemplate;
    @Value("${recaptcha.secretKey}")
    private String secretKey;
    @Value("${recaptcha.verifyUrl}")
    private String verifyUrl;

    public RecaptchaService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
}
