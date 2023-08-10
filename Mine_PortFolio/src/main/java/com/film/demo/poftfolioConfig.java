package com.film.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.film.demo.filter.poftfolioFilter;


@Configuration
public class poftfolioConfig implements WebMvcConfigurer {
	
	@Bean
	public poftfolioFilter getFilter() {
		return new poftfolioFilter();
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(getFilter()).addPathPatterns("/*");
	}
}
