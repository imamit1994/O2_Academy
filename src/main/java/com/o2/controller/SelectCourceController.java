package com.o2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.o2.dao.MongoDBConnection;
import com.o2.model.SelectCourse;

@Controller
@SessionAttributes("logininfo")
public class SelectCourceController {
	@Autowired
	MongoDBConnection mongodbconnection;
	/*
	 * TODO this will  display the selectCourse page and bind modelattribute selectcourse with SelectCourse class
	 */
	@RequestMapping("/selectCourse")
	public ModelAndView showSelectCourcePage() {
		System.out.println("display Select Cource page");
		ModelAndView mv = new ModelAndView("selectCourse");
		mv.addObject("selectcourse", new SelectCourse());
		return mv;
	}
	
	/*
	 * TODO this will excute after user will select course and submit 
	 * 		all the selected course will save inside SelectCource Collection in Db
	 */
	@RequestMapping("/nexttoselectcourse")
	public ModelAndView afterselectCourse(@ModelAttribute SelectCourse selectcourse,ModelMap model) {
		System.out.println("this will excute after Select course");
		for(String st:selectcourse.getFrontendtrack()) {
			System.out.println(st);
		}
		String AssociateId=(String) model.get("logininfo");
		selectcourse.setAssociateId(AssociateId);
		mongodbconnection.addselectedCourse(selectcourse);
		System.out.println("selected course succesfully saved");
		ModelAndView mv = new ModelAndView("test");
		return mv;
	}
}
