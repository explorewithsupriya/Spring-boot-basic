package com.supriya.test.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AppRequestRegistry implements WebMvcConfigurer{
	
	@Autowired
	AppRequestHandler appRequestHandler;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(appRequestHandler);
	}

}
