package com.client.kidschoice.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

	  private static final String[] CLASSPATH_RESOURCE_LOCATIONS = {
	          "classpath:/META-INF/resources/", "classpath:/resources/",
	          "classpath:/static/", "classpath:/public/" };

	  
	  @Override
	  public void addCorsMappings(CorsRegistry registry) {
	    registry.addMapping("/**").allowedOrigins("*");
	  }

	  @Override
	  public void addResourceHandlers(ResourceHandlerRegistry registry) {
	    if (!registry.hasMappingForPattern("/webjars/**")) {
	      registry.addResourceHandler("/webjars/**").addResourceLocations(
	              "classpath:/META-INF/resources/webjars/");
	    }
	    if (!registry.hasMappingForPattern("/**")) {
	      registry.addResourceHandler("/**").addResourceLocations(
	              CLASSPATH_RESOURCE_LOCATIONS);
	    }
	  }
	
}