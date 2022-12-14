package com.TumbleProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class TumbleProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(TumbleProjectApplication.class, args);
		System.out.println("TumbleProjectApplication.main");
	}


}
