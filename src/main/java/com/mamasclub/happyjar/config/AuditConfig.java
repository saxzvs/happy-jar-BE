package com.mamasclub.happyjar.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

@Configuration
public class AuditConfig implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor(){
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        String userId = request.getHeader("uid");
        if(userId == null) userId = "SWAGGER_TEST";
        return Optional.of(userId);
    }
}
