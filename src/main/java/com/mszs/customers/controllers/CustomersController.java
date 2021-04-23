package com.mszs.customers.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/customerController")
public class CustomersController {
	
	private static final Logger log = LoggerFactory.getLogger(CustomersController.class);
	
	@Autowired
	private RestTemplate rt;
	
	@GetMapping("/customerReq")
	public String customerReq() {
		log.info("Entered - CustomersController :: customerReq()");
		String res = rt.getForObject("http://localhost:0401/employeeController/employeeReq/", String.class);
		log.info("Ended -CustomersController :: customerReq()"+res);
		return "Succefully Completed";
	}

}
