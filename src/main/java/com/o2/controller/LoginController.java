package com.o2.controller;

import com.o2.dao.MongoDBConnection;
import com.o2.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.o2.model.LoginForm;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;


@Controller
@SessionAttributes("logininfo")
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
	public ModelAndView showNext(@ModelAttribute LoginForm loginform,ModelMap model) {
        System.out.println("this will execute when user login");
		UserInfo userinfo=mongoDBConnection.getUserInfo(loginform.getAssociateId());
		ModelAndView mv = new ModelAndView();
		model.addAttribute("logininfo", loginform.getAssociateId());
		if(userinfo.getRole().equalsIgnoreCase("associate")){
         mv.setViewName("aDashboard");
		}
		if(userinfo.getRole().equalsIgnoreCase("mentor"))
		{
			mv.setViewName("mDashboard");
			}

		return mv; }



	@RequestMapping("/dashbordotherthanlogin")
	public ModelAndView onDashbordOtherThanLogin(ModelMap model) {
		String AssociateId=(String) model.get("logininfo");
		UserInfo userinfo = mongoDBConnection.getUserInfo(AssociateId);
		ModelAndView mv = new ModelAndView();
		if (userinfo.getRole().equalsIgnoreCase("associate")) {
			mv.setViewName("aDashboard");
		}
		if (userinfo.getRole().equalsIgnoreCase("mentor")) {
			mv.setViewName("mDashboard");
		}
		return mv;
	}




	@RequestMapping("/signout")
	public String signOutUser(ModelMap model,HttpSession session) {
		model.remove("logininfo");
		session.invalidate();
		return "redirect:/home";
	}


}
