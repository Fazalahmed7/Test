package com.fantastic.four.boot.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Component
public class FourInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		response.addHeader("Access-Control-Allow-Origin", "http://localhost:4200"); // allows CORS requests only coming
		response.addHeader("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT");
		return true;
	}
		
}	
