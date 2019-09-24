package com.fantastic.four.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;

import com.fantastic.four.boot.interceptors.FourInterceptor;

@SpringBootApplication
public class BootApplication extends SpringBootServletInitializer{
	
	public static void main(String[] args) {
		SpringApplication.run(BootApplication.class, args);
	}
	
	// In case of local - CORS error
	/*public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new FourInterceptor());
	}*/
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(BootApplication.class);
	}
	
	

}
