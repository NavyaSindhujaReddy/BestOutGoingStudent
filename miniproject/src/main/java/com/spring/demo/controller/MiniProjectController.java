package com.spring.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class MiniProjectController {
	@RequestMapping("/")
	public String home()
	{
		return "home";
	}
}
