package com.hailong.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMethod;

public class MyFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		    HttpServletResponse response1 = (HttpServletResponse) response;
	        HttpServletRequest request1 = (HttpServletRequest) request;
	        response1.setHeader("Access-Control-Allow-Origin", "*");
	        response1.setHeader("Access-Control-Allow-Credentials", "true");
	        response1.setHeader("Access-Control-Allow-Methods", "*");
	        response1.setHeader("Access-Control-Allow-Headers", "Content-Type,Access-Token");
	        response1.setHeader("Access-Control-Expose-Headers", "*");

	        if (request1.getMethod().equals( RequestMethod.OPTIONS.toString())){
	            System.out.println("-----检查------");
	            return;
	        }
	        chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
		
	}



}
