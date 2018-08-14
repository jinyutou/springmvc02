package com.xuejp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController{

	@RequestMapping(value="/hello.do")
	public String hello(String hello,Model model){
		model.addAttribute("hello",hello);
		return "index";
	}

}
