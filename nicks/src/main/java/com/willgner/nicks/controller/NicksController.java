package com.willgner.nicks.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.willgner.nicks.model.Nicks;

@RestController
public class NicksController {

	@RequestMapping("/nicks/generate")
	public String generate()
	{
		Nicks.generateNicks();
		
		return "";
	}
}
