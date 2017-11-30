package com.o2.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.o2.model.UserInfo;

@Service
public class MongoDBConnection {
	public ArrayList<UserInfo> MongoDB1(){
		ArrayList<UserInfo> userinfo=new ArrayList<UserInfo>();
		try{
			
			MongoClient client = new MongoClient("localhost",27017); //with default server and port adress
			System.out.println("Sucessfully connected with database!!!!!!!!");
			DB db = client.getDB( "O2Academy" );//database name
			DBCollection collection = db.getCollection("UserInfo");// collection name
			DBCursor cursor = collection.find();
			while(cursor.hasNext()) {
			  DBObject theObj =cursor.next();
			  String userName = (String) theObj.get("userName");
			  String associateId = (String) theObj.get("associateId");
			  String emailId = (String) theObj.get("emailId");
			  String name = (String) theObj.get("name");
			  String password = (String) theObj.get("password");
			  String role = (String) theObj.get("role");
			  System.out.println(role);
			  UserInfo usrinf=new UserInfo(name,associateId,emailId,userName,password,role);
			  //System.out.println(cursor.next());
			   userinfo.add(usrinf);
			}
			client.close();
			//DBObject dbo = collection.findOne();
			//String name = (String) dbo.get();//name and emailId stored in collection for this example
			//String emailId = (String) dbo.get("emailId");
			//System.out.println("Name:"+name+"Branch:"+emailId);
	      }catch(Exception e){
	         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      }
		return userinfo;
	}
}
