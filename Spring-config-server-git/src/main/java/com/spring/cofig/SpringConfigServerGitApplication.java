package com.spring.cofig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringConfigServerGitApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringConfigServerGitApplication.class, args);
	}
}
