package com.oliveira.javalab;

import org.springframework.boot.SpringApplication;

public class TestJavalabApplication {

	public static void main(String[] args) {
		SpringApplication.from(JavalabApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
