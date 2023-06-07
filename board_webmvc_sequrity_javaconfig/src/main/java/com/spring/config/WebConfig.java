package com.spring.config;

import javax.servlet.Filter;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

@Configuration
public class WebConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
	//web.xml 대신
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		//<!-- The definition of the Root Spring Container shared by all Servlets and Filters -->
		return new Class[] {RootConfig.class, SecurityConfig.class};
	}

	
	@Override
	protected Class<?>[] getServletConfigClasses() {
		//<!-- Processes application requests -->
		return new Class[] {ServletConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		//	<servlet-mapping> -- <url-pattern>/</url-pattern>
		return new String[] {"/"};
	}

	//한글처리 필터
	@Override
	protected Filter[] getServletFilters() {
		CharacterEncodingFilter filter = new CharacterEncodingFilter();
		filter.setEncoding("utf-8");
		filter.setForceEncoding(true);
		return new Filter[] {filter};
	}
}
