package com.o2.controller;

import com.o2.dao.MongoDBConnection;
import com.o2.model.UserInfo;
import com.o2.model.UserSelectedMentor;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;


@Controller
@SessionAttributes("logininfo")
public class UserController {
    @Autowired
    MongoDBConnection mongodbconnection;

    @RequestMapping("/viewMprofile")
    public ModelAndView getEmployeeDetails(ModelMap model) {
        System.out.println("display view mentor profile");
        ModelAndView mv = new ModelAndView("aProfile");
        UserInfo userInfo = new UserInfo();
        String AssociateId=(String) model.get("logininfo");
        System.out.println("AssociateId from session="+AssociateId);
        userInfo= mongodbconnection.getUserInfo(AssociateId);
        mv.addObject("userInfo", userInfo);
        return mv;
    }
    @RequestMapping("/changementor")
    public ModelAndView displayMentorlist()
    {
    	HashMap<String,String> mentor = new HashMap<String,String>();
    	mentor=mongodbconnection.getMentorList();
    	System.out.println(mentor);
    	ModelAndView mv = new ModelAndView("viewmentors");
    	mv.addObject("userSelectedMentor", new UserSelectedMentor());
    	 mv.addObject("mentorlist", mentor);
         return mv;
    }
    @RequestMapping("/mentorselect")
    public String afterMentorSelect(@ModelAttribute UserSelectedMentor userSelectedmentor,ModelMap model) {
    	System.out.println(userSelectedmentor.getMentorId());
    	String associateId=(String) model.get("logininfo");
    	UserInfo userInfo=mongodbconnection.getUserInfo(associateId);
    	userSelectedmentor.setUserInfo(userInfo);
    	mongodbconnection.saveUserSelectedmentor(userSelectedmentor);
    	System.out.println("User successfully selected mentor");
    	return "redirect:/dashbordotherthanlogin";
    }
}