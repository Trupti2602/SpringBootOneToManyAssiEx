package com.cg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.core.net.SyslogOutputStream;

@SpringBootApplication
public class SpringBootOneToManyExApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootOneToManyExApplication.class, args);
		System.out.println("App Start");
	}

}
