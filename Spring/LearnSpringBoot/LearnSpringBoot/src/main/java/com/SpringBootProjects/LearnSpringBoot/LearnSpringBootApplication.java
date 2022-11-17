package com.SpringBootProjects.LearnSpringBoot;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;
@SpringBootApplication
public class LearnSpringBootApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(LearnSpringBootApplication.class, args);
	}
	
	  @Bean public LocaleResolver localeResolver() { AcceptHeaderLocaleResolver
	  localeResolver = new AcceptHeaderLocaleResolver();
	  localeResolver.setDefaultLocale(Locale.US); return localeResolver; }
	 
	/*
	 * public void addResourceHandlers(ResourceHandlerRegistry registry) {
	 * registry.addResourceHandler("swagger-ui.html")
	 * .addResourceLocations("classpath:/META-INF/resources/");
	 * 
	 * registry.addResourceHandler("/webjars/**")
	 * .addResourceLocations("classpath:/META-INF/resources/webjars/"); }
	 */
}
