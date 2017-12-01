package com.o2.restcontroller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.o2.dao.MongoDBConnection;
import com.o2.model.UserInfo;

@RestController
public class UserInfoRest {
	
	@Autowired
	MongoDBConnection mdb;
	
@RequestMapping("/test")	
public ArrayList<UserInfo> test()
{
	ArrayList<UserInfo> userinfo=new ArrayList<UserInfo>();
	userinfo=mdb.getUserInfo();
	return userinfo;
}
}
