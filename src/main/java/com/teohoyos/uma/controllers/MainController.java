package com.teohoyos.uma.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
	
	//@RequestMapping(value = "/", method = RequestMethod.GET)
	@GetMapping("/")
	public String showFilesList() {
		return "files";
	}

}
