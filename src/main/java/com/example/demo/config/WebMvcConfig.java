package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer{
    private static final long MAX_AGE_SECONDS = 3600;

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedMethods("GET","POST","PUT","DELETE")
                .allowedHeaders("*")
                .allowedOrigins("*") // 추후 특정 포트만 허용하도록 변경해야함 
                .allowCredentials(false) // true: 특정 포트만 허용, 운영에서는 true로 하고 특정 포트 명시해야함
                .maxAge(MAX_AGE_SECONDS);
    }
}
