# simplus-api
package com.simplus.gestao;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

    /*
    *
	====== SIMPLUS =======
	API:
	Spring Boot, Hibernate, REST, Angular 6, JWT, S3, MySQL
	openjdk version "1.8.0_171"
    OpenJDK Runtime Environment (build 1.8.0_171-8u171-b11-0ubuntu0.18.04.1-b11)
    OpenJDK 64-Bit Server VM (build 25.171-b11, mixed mode)

	* @author  José R F Junior
	* @version 1.0
	* @since   02/07/2018
	*/


@SpringBootApplication
public class SimplusApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SimplusApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	}
}
