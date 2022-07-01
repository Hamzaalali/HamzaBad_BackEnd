package com.example.hamzabad.Configration;

import com.example.hamzabad.interceptor.AuthenticationInterceptor;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration @RequiredArgsConstructor
public class WebConfigurer implements WebMvcConfigurer {
    final private AuthenticationInterceptor authenticationInterceptor;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(authenticationInterceptor);
        WebMvcConfigurer.super.addInterceptors(registry);
    }
}
