package de.livia.mwstrechner;


import org.springframework.cloud.client.ServiceInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Application class
 *
 */
@EnableDiscoveryClient
@SpringBootApplication
public class MwstRechnerApplication {


	@Autowired
	private DiscoveryClient discoveryClient;

	// http://localhost:8282/service-instances/my-first-eureka-client
	@RequestMapping("/service-instances/{applicationName}")
	public List<ServiceInstance> serviceInstancesByApplicationName(
			@PathVariable String applicationName) {
		return this.discoveryClient.getInstances(applicationName);
	}

	public static void main(String[] args) {
		SpringApplication.run(MwstRechnerApplication.class, args);
	}

}
