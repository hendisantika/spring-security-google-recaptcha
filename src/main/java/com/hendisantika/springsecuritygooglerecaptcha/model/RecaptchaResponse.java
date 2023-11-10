package com.hendisantika.springsecuritygooglerecaptcha.model;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-security-google-recaptcha
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 11/10/23
 * Time: 07:43
 * To change this template use File | Settings | File Templates.
 */
public record RecaptchaResponse(Boolean success, String challenge, String hostname, Double score, String action) {
}
