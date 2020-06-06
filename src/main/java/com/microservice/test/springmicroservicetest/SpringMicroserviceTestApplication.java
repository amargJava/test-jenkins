package com.microservice.test.springmicroservicetest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class SpringMicroserviceTestApplication {

	@Autowired
	RestTemplate restTemplate;
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringMicroserviceTestApplication.class, args);
	}
	@GetMapping("/testService")
	public String testService() {
		//return this.restTemplate.getForObject("http://localhost:9092/getServerInfo", String.class);
		return "Hi Test";
	}
	 @Bean
	 RestTemplate restTemplate(){
	    return new RestTemplate();
	 }
	
}
