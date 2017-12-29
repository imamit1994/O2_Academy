package com.o2.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.o2.model.SelectCourse;
import com.o2.model.UserInfo;
import com.o2.model.UserSelectedMentor;

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
	    	List<UserInfo> userinfo=mongoTemplate.find(query,UserInfo.class);
	    	System.out.println("UserInfo"+userinfo);
	    	return (ArrayList<UserInfo>) userinfo;
	    }
	    public void addselectedCourse(SelectCourse selectcourse) {
	    	mongoTemplate.save(selectcourse);
	    }

	    public UserInfo getUserInfo(String associateId){
			Query query = new Query();
			query.addCriteria(Criteria.where("associateId").is(associateId));
			return mongoTemplate.findOne(query,UserInfo.class);

		}
	    public SelectCourse getSelectedCourseInfo(String associateId){
			Query query = new Query();
			query.addCriteria(Criteria.where("associateId").is(associateId));
			return mongoTemplate.findOne(query,SelectCourse.class);

		}
	    public HashMap<String,String> getMentorList() {
	    	HashMap<String,String> mentorlist=new HashMap<String,String>();
	    	Query query = new Query();
	    	query.addCriteria(Criteria.where("role").is("mentor"));
	    	List<UserInfo> userinfo=mongoTemplate.find(query,UserInfo.class);
	    	for(UserInfo user:userinfo) {
	    		mentorlist.put(user.getAssociateId(),user.getName());
	    	}
	    	
	    	return mentorlist;
	    }
	    
	    public void saveUserSelectedmentor(UserSelectedMentor userSelectedMentor) {
	        mongoTemplate.save(userSelectedMentor);
	    }
	    
	    public ArrayList<UserSelectedMentor> getAllAssociateForMentor(String MentorId) {
	    	Query query = new Query();
	    	query.addCriteria(Criteria.where("mentorId").is(MentorId));
	    	List<UserSelectedMentor> userlist=mongoTemplate.find(query,UserSelectedMentor.class);
	    	return (ArrayList<UserSelectedMentor>) userlist;
	    }
}
