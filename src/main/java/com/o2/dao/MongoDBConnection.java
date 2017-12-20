package com.o2.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.o2.model.SelectCourse;
import com.o2.model.UserInfo;

@Service
public class MongoDBConnection {
	 @Autowired
	    private MongoTemplate mongoTemplate;
	 	
	 /*
	  * TODO to save UserInfo into the database 
	  */
	    public void saveRegistrationData(UserInfo userInfo) {
	        mongoTemplate.save(userInfo);
	    }
	    
	    /*
	     * TODO to get all the entry from inside
	     * you can use query.addCriteria() to give the condition
	     */
	    public ArrayList<UserInfo> getAllUserInfo() {
	    	Query query = new Query();
	    	//query.addCriteria(Criteria.where("name").is("Eric"));
	    	List<UserInfo> userinfo=mongoTemplate.find(query,UserInfo.class);
	    	System.out.println("UserInfo"+userinfo);
	    	return (ArrayList<UserInfo>) userinfo;
	    }
	    public void addselectedCourse(SelectCourse selectcourse) {
	    	mongoTemplate.save(selectcourse);
	    }

}
