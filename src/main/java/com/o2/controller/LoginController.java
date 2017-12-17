package com.o2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.o2.model.LoginForm;


@Controller
public class LoginController {
	@RequestMapping("/login")
	public ModelAndView getEmployeeLoginForm(){
		System.out.println("display login page");
		ModelAndView mv = new ModelAndView("login");
		mv.addObject("loginForm", new LoginForm());
		return mv;
	}
	
	@RequestMapping("/userdashbord")
	public ModelAndView showNext(@ModelAttribute LoginForm loginform) {
		System.out.println("this will excute when user login");
		System.out.println("associateid="+loginform.getAssociateId()+" password="+loginform.getPassword());
		ModelAndView mv = new ModelAndView("test");
		return mv;
	}
}
