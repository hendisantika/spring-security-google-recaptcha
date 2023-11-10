package com.hendisantika.springsecuritygooglerecaptcha.security;

import com.hendisantika.springsecuritygooglerecaptcha.model.RecaptchaResponse;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-security-google-recaptcha
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 11/10/23
 * Time: 07:44
 * To change this template use File | Settings | File Templates.
 */
public class RecaptchaFilter extends OncePerRequestFilter {

    private static final Logger LOG = LoggerFactory.getLogger(RecaptchaFilter.class);
    private final RecaptchaService recaptchaService;

    public RecaptchaFilter(RecaptchaService recaptchaService) {
        this.recaptchaService = recaptchaService;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        if (request.getMethod().equals("POST")) {
            String recaptcha = request.getHeader("recaptcha");
            RecaptchaResponse recaptchaResponse = recaptchaService.validateToken(recaptcha);
            if (!recaptchaResponse.success()) {
                LOG.info("Invalid reCAPTCHA token");
                throw new BadCredentialsException("Invalid reCaptcha token");
            }
        }
        filterChain.doFilter(request, response);
    }
}
