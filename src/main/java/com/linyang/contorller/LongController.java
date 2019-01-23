package com.linyang.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LongController {

	@RequestMapping("/long")
	public String longpage() {
		return "/long/index";
	}

	@RequestMapping("/")
	public String longpage2() {
		return "index";
	}

	@RequestMapping("/")
	public String longpage3() {
		return "index";
	}
}
