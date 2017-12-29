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
    	userSelectedmentor.setAssociateId(associateId);
    	mongodbconnection.saveUserSelectedmentor(userSelectedmentor);
    	System.out.println("User successfully selected mentor");
    	return "redirect:/dashbordotherthanlogin";
    }
    @RequestMapping("/viewallassociate")
    public ModelAndView displayAllAssociateToMentor(ModelMap model) {
    	ModelAndView mv=new ModelAndView("viewallassociate");
    	String mentorId=(String) model.get("logininfo");
    	ArrayList<UserSelectedMentor> userList=mongodbconnection.getAllAssociateForMentor(mentorId);
    	ArrayList<UserInfo> userInfo = new ArrayList<UserInfo>();
    	 UserInfo userinfo = new UserInfo();
    	for(UserSelectedMentor userlist:userList) {
    		userinfo= mongodbconnection.getUserInfo(userlist.getAssociateId());
    		System.out.println("nmae:"+userinfo.getName());
    		userInfo.add(userinfo);
    	}
    	mv.addObject("userList",userInfo);
    	System.out.println("userList"+userList);
    	return mv;
    }
}