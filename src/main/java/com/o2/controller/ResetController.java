package com.o2.controller;

import com.o2.dao.MongoDBConnection;
import com.o2.model.ResetPassword;
import com.o2.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
@Controller
@SessionAttributes("logininfo")
public class ResetController {
    @Autowired
    MongoDBConnection mongodbconnection;


    @RequestMapping("/editApassword")
    public ModelAndView showResetPassword(ModelMap model){
        System.out.println("display reset password page");
        String associateId=(String) model.get("logininfo");
        UserInfo userInfo= mongodbconnection.getUserInfo(associateId);
        ResetPassword resetPassword =new ResetPassword();
        ModelAndView mv = new ModelAndView("resetPassword");
        mv.addObject("resetPassword", resetPassword);
       mv.addObject("userInfo", userInfo);
        return mv;
    }

    @RequestMapping("/setNewPassword")
    public String resetPassword(ModelMap model, String password, String newPassword, String confirmPassword){
        String associateId=(String) model.get("logininfo");
        ModelAndView mv =new ModelAndView();
        System.out.println(password+"------->1223");
        System.out.println(associateId+"------->asdf");
       UserInfo userInfo= mongodbconnection.getUserInfo(associateId);
        String output= mongodbconnection.updateUserPassword(associateId,password,newPassword,confirmPassword);
        mv.addObject("result",output);
        mv.addObject("userInfo", userInfo);

        return "redirect:/dashbordotherthanlogin";
    }
}
