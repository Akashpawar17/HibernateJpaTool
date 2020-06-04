package com.capgemini;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BootApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext context=	SpringApplication.run(BootApplication.class, args);
		Alien a =context.getBean(Alien.class);
		a.show();
	}

}
