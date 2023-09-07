package com.example.configserverspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication

@EnableConfigServer
public class ConfigServerSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerSpringApplication.class, args);
	}

}
