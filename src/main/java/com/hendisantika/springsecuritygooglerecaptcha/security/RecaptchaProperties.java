package com.hendisantika.springsecuritygooglerecaptcha.security;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-security-google-recaptcha
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 11/10/23
 * Time: 07:48
 * To change this template use File | Settings | File Templates.
 */
@ConfigurationProperties(prefix = "recaptcha")
public record RecaptchaProperties(String verifyUrl, String secretKey) {
}
