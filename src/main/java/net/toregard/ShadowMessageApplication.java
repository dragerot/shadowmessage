package net.toregard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@SpringBootApplication
public class ShadowMessageApplication {

	public static void main(String[] args) {

		SpringApplication.run(ShadowMessageApplication.class, args);
		//SpringApplication.run(new Class[] { ShadowMessageApplication.class, WebAppInitializer.class }, args);
	}

//	@Bean
//	public InternalResourceViewResolver getInternalResourceViewResolver(){
//		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
//		resolver.setPrefix("/WEB-INF/jsp/");
//		resolver.setSuffix(".jsp");
//		return resolver;
//	}
}
