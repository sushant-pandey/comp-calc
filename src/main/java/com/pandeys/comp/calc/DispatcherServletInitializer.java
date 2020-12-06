package com.pandeys.comp.calc;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class[] classes = {ContextConfig.class};
		return classes;
	}

	@Override
	protected String[] getServletMappings() {
		String[] mappings = {"/"};
		return mappings;
	}

}
