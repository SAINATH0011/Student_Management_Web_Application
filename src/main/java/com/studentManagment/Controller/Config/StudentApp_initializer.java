package com.studentManagment.Controller.Config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class StudentApp_initializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class[] configFiles = {StudentAppConfig.class};
		
		
		return configFiles;
	}

	@Override
	protected String[] getServletMappings() {
		String[] mappings = {"/"};
		
		
		return mappings;
	}

}
