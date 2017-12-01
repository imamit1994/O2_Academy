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
	
	@Autowired
	MongoDBConnection mongodbconnection;
	@RequestMapping("/register")
	public ModelAndView showRegistrationForm(){
		System.out.println("display Registration page");
		ModelAndView mv = new ModelAndView("register");
		mv.addObject("userInfo", new UserInfo());
		return mv;
	}
	@RequestMapping("/usersave")
	public ModelAndView showNext(@ModelAttribute UserInfo userinfo) {
		System.out.println("this will excute after registration");
		ModelAndView mv = new ModelAndView("home");
		System.out.println("Name:"+userinfo.getName());
		System.out.println("Email"+userinfo.getEmailId());
		System.out.println("AssociateId:"+userinfo.getAssociateId());
		System.out.println("Password"+userinfo.getPassword());
		System.out.println("Role:"+userinfo.getRole());
		System.out.println("Username:"+userinfo.getUserName());
		mongodbconnection.saveUserInfo(userinfo);
		return mv;
	}
}
