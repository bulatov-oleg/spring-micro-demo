package ru.bob.eclient2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Eclient2Application {

	public static void main(String[] args) {
		SpringApplication.run(Eclient2Application.class, args);
	}

}
