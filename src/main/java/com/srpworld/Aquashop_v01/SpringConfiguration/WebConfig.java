package com.srpworld.Aquashop_v01.SpringConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

//    @Override
//    public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/**") // Allowing all paths
//                .allowedOrigins("http://localhost:3000") // Allowing specific origin
//                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Specify allowed methods
//                .allowedHeaders("*") // Allowing all headers
//                .allowCredentials(true) // Allow credentials like cookies
//                .maxAge(3600); // Cache preflight response for 1 hour
//    }
}
