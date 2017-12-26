package com.o2.controller;

import com.o2.dao.MongoDBConnection;
import com.o2.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class UserController {
    @Autowired
    MongoDBConnection mongodbconnection;

    @RequestMapping("/viewMprofile/{associateId}")
    public ModelAndView getEmployeeDetails(@PathVariable(value = "associateId") String associateId) {
        System.out.println("display view mentor profile");
        ModelAndView mv = new ModelAndView("aProfile");
        UserInfo userInfo = new UserInfo();
        userInfo= mongodbconnection.getUserInfo(associateId);
        mv.addObject("userInfo", userInfo);
        return mv;
    }
}