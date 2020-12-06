package com.pandeys.comp.calc;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class ApplicationInit // implements WebApplicationInitializer 
{

	public void onStartup(ServletContext servletContext) throws ServletException {

		//If we are using the xml format of context-config, we can use XmlWebApplicationContext
		//We also have its annotation format.
		AnnotationConfigWebApplicationContext appContext = new AnnotationConfigWebApplicationContext();
		appContext.register(ContextConfig.class);

		//This is equivalent to <servlet> in web.xml
		DispatcherServlet dispatcherServlet = new DispatcherServlet(appContext);
		
		//This is equivalent to <servlet> and <servlet-mapping> in web.xml
		ServletRegistration.Dynamic myDispatcherServlet = servletContext.addServlet("dispatcher", dispatcherServlet);
		myDispatcherServlet.setLoadOnStartup(1);
		myDispatcherServlet.addMapping("/");
	}

}
