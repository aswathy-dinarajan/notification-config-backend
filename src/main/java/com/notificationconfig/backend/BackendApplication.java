package com.notificationconfig.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@EnableWebMvc
public class BackendApplication {

	public static void main(String[] args) {
		/*System.setProperty("aws.accessKeyId","AKIA2GGHLWE4KPJXEB33");
        System.setProperty("aws.secretKey","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");
        System.setProperty("aws.region","us-west-2");*/
		SpringApplication.run(BackendApplication.class, args);
	}
	
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("*");
			}
		};
	}

}
