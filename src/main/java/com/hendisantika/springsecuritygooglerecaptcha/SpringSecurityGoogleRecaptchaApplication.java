package com.hendisantika.springsecuritygooglerecaptcha;

import com.hendisantika.springsecuritygooglerecaptcha.security.RecaptchaProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableConfigurationProperties(RecaptchaProperties.class)
public class SpringSecurityGoogleRecaptchaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityGoogleRecaptchaApplication.class, args);
    }

    @Bean
    RestTemplate restTemplate() {
        return new RestTemplateBuilder().build();
    }

}
