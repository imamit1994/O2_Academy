package com.o2.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.o2.model.UserInfo;

@Service
public class MongoDBConnection {
	public ArrayList<UserInfo> getUserInfo(){
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
	public void saveUserInfo(UserInfo userinfo) {
try{
			
			MongoClient client = new MongoClient("localhost",27017); //with default server and port adress
			System.out.println("Sucessfully connected with database !!!!!!!!");
			DB db = client.getDB( "O2Academy" );
			DBCollection collection = db.getCollection("UserInfo");
			BasicDBObject document = new BasicDBObject();
			document.put("userName",userinfo.getUserName());
			document.put("associateId", userinfo.getAssociateId());
			document.put("emailId",userinfo.getEmailId());
			document.put("name", userinfo.getName());
			document.put("password",userinfo.getPassword());
			document.put("role",userinfo.getRole());
			collection.insert(document);
			client.close();
	      }catch(Exception e){
	         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      }
	}
}
