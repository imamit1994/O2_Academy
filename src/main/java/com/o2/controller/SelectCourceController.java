package com.o2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SelectCourceController {
	@RequestMapping("/selectCourse")
	public ModelAndView showSelectCourcePage() {
		System.out.println("display Select Cource page");
		ModelAndView mv = new ModelAndView("selectCourse");
		return mv;
	}
}
