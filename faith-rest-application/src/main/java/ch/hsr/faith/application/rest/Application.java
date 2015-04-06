package ch.hsr.faith.application.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(
				"classpath:/META-INF/rest-services-config.xml", args);
	}

}
