package com.o2.controller;

import com.o2.dao.MongoDBConnection;
import com.o2.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.o2.model.LoginForm;

import java.util.ArrayList;


@Controller
public class LoginController {
	@Autowired
	MongoDBConnection mongoDBConnection;
	@RequestMapping("/login")
	public ModelAndView getEmployeeLoginForm(){
		System.out.println("display login page");
		ModelAndView mv = new ModelAndView("login");
		mv.addObject("loginForm", new LoginForm());
        return mv;

	}

    @RequestMapping("/userdashboard")
	public ModelAndView showNext(@ModelAttribute LoginForm loginform) {
        System.out.println("this will execute when user login");
		UserInfo userinfo=mongoDBConnection.getUserInfo(loginform.getAssociateId());
		ModelAndView mv = new ModelAndView();
		if(userinfo.getRole().equalsIgnoreCase("associate")){

			//mv.addObject("userInfo", userinfo);
mv.setViewName("aDashboard");

		}
		if(userinfo.getRole().equalsIgnoreCase("mentor"))
		{
			//mv.addObject("userInfo", userinfo);
			mv.setViewName("mDashboard");

		}
		//System.out.println("associateid="+loginform.getAssociateId()+" password="+loginform.getPassword());
		return mv;
	}


}
