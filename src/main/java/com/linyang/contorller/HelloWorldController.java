package com.linyang.contorller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloWorldController {

	@RequestMapping("/hello")
	String test() {
		return "hello world";
	}
}
