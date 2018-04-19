package com.th.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Validator;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.th"}, useDefaultFilters = false, includeFilters = {@ComponentScan.Filter(Controller.class)})
public class WebConfig implements WebMvcConfigurer {
	
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		
		//registry.enableContentNegotiation(new MappingJackson2JsonView());
		
		registry.jsp("/WEB-INF/views/", ".jsp");
		registry.order(2);
		
		WebMvcConfigurer.super.configureViewResolvers(registry);
	}
/*	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
		WebMvcConfigurer.super.configureDefaultServletHandling(configurer);
	}
	
	
	
	@Override
	public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
		configurer.favorPathExtension(false)
				  .favorParameter(true)
				  .parameterName("mediaType")
				  .ignoreAcceptHeader(false)
				  .defaultContentType(MediaType.APPLICATION_JSON)
				  .mediaType("json", MediaType.APPLICATION_JSON);
		
		WebMvcConfigurer.super.configureContentNegotiation(configurer);
	}*/
	@Override
	public Validator getValidator() {
		
		return WebMvcConfigurer.super.getValidator();
	}
	/*
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		
		return viewResolver;
	}
	*/
}
