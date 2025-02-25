package com.psr.SpringBoot_AWS_Pipeline.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldApi {
	@GetMapping("/hello")
	public String greetings() {
		return "Hello To ALL";
	}

}
