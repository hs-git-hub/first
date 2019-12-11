package com.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.interceptor.PageInterceptor;
import com.interceptor.ParamsInterceptor;

@Configuration
public class interceporCongif extends WebMvcConfigurerAdapter{

	
	//注册方法，创建的拦截器需注册到这里才能生效
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new PageInterceptor()).addPathPatterns("/**");
		registry.addInterceptor(new ParamsInterceptor()).addPathPatterns("/**");
	}
	
	
	
	
}
