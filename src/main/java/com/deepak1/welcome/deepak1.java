package com.deepak1.welcome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class}) class will not be autoconfigured thus bean will be manually created
@SpringBootApplication  //main class
public class deepak1 {

	public static void main(String[] args) {

		SpringApplication.run(deepak1.class, args);
	}

}
