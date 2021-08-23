package com.br.microsserviceexample.microsserviceexample.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusResource {

	@RequestMapping("/status")
	public String teste() {
		return "ok";
	}
	
}
