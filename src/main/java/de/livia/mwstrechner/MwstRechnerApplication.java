package de.livia.mwstrechner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Application class
 *
 */
@SpringBootApplication
@EnableEurekaClient // makes the application act as an Eureka Client
@RestController
public class MwstRechnerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MwstRechnerApplication.class, args);
	}

	@RequestMapping(value = "/")
	public String home(){
		return "Eureka Client Application MwSt";
	}

}
