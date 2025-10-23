package com.prithvi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MicroserviceUserRegisterApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceUserRegisterApplication.class, args);
	}

}
