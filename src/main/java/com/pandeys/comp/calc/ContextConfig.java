package com.pandeys.comp.calc;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.core.env.Environment;
import org.springframework.format.FormatterRegistry;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.pandeys.comp.calc.convertor.CreditCardToString;
import com.pandeys.comp.calc.convertor.ToCreditCardConvertor;
import com.pandeys.comp.calc.formatter.PhoneNumberFormatter;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.pandeys.comp.calc")
@PropertySource("classpath:email.properties")
public class ContextConfig implements WebMvcConfigurer{
	
	@Autowired
	private Environment env;
	
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
	
	@Override
	public void addFormatters(FormatterRegistry registry) {
		registry.addFormatter(new PhoneNumberFormatter());
//		registry.addFormatter(new CreditCardFormatter());
		registry.addConverter(new ToCreditCardConvertor());
		registry.addConverter(new CreditCardToString());
	}
	
	@Bean(name = "messageSource")
	public MessageSource getMessageSource() {
		ResourceBundleMessageSource msgSource = new ResourceBundleMessageSource();
		msgSource.setBasename("messages");
		return msgSource;
	}
	
	@Bean(name = "validator")
	public LocalValidatorFactoryBean validator() {
		LocalValidatorFactoryBean localValidatorFactoryBean = new LocalValidatorFactoryBean();
		localValidatorFactoryBean.setValidationMessageSource(getMessageSource());
		return localValidatorFactoryBean;
	}
	
		@Override
		public Validator getValidator() {
			return validator();
		}
		
		@Bean(name = "javaMailSender")
		public JavaMailSender getJavaMailSender() {
			JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
			mailSender.setHost(env.getProperty("mail.smtp.host"));
			mailSender.setPort(getIntProperty("mail.smtp.port"));
			mailSender.setUsername(env.getProperty("mail.username"));
			mailSender.setPassword(env.getProperty("mail.password"));
			
			mailSender.setJavaMailProperties(getMailProperty());
			return mailSender;
		}

		private int getIntProperty(String propertyName) {
			return Integer.parseInt(env.getProperty(propertyName));
		}

		private Properties getMailProperty() {
			Properties mailProperties = new Properties();
			mailProperties.put("mail.smtp.starttls.enable", true);
			mailProperties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
			return mailProperties;
		}
}
