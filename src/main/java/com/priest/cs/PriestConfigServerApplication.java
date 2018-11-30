package com.priest.cs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class PriestConfigServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(PriestConfigServerApplication.class, args);
	}
}
