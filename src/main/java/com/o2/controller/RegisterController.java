package com.o2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.o2.dao.MongoDBConnection;
import com.o2.model.UserInfo;


@Controller
public class RegisterController {
	/*
	 * TODO this will excute once user will click on the signup in home page
	 */
	@Autowired
	MongoDBConnection mongodbconnection;
	@RequestMapping("/register")
	public ModelAndView showRegistrationForm(){
		System.out.println("display Registration page");
		ModelAndView mv = new ModelAndView("register");
		mv.addObject("userInfo", new UserInfo());
		return mv;
	}
	
	/*
	 * TODO this will excute once the user click on submit in user registration page
	 * @Param userinfo Contain the data which is enter by user in signup page
	 */
	@RequestMapping("/usersave")
	public ModelAndView showNext(@ModelAttribute UserInfo userinfo) {
		System.out.println("this will execute after registration");
		ModelAndView mv = new ModelAndView("home");
		mongodbconnection.saveRegistrationData(userinfo);//this will save the UserInfo Data into database
		return mv;
	}
}
