package com.ezen.royal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Log4j
@Controller
@RequestMapping("/palace")
public class innerAndInfoController {
	
	@GetMapping("/royalInner") // 내부 건축물 
	
	public String inner() {
		return "/userViews/royal_intro/royal_Inner_view";
	}
	
	@GetMapping("/royalInfo") // 관람안내
	public String info() {
		return "/userViews/royal_intro/guide_view";
	}
	
}