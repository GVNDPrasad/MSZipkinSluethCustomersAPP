package com.mszs.customers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Zipkin and Sluth example
@SpringBootApplication
public class MszsCustomersApplication {

	private static final Logger log = LoggerFactory.getLogger(MszsCustomersApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(MszsCustomersApplication.class, args);
		log.info("Entered MszipkinsluthCustomersApplication :: main() =");
	}

}
