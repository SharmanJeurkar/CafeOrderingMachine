package com.Restaurent.dao;

import java.sql.*;

public class Connector {
	Connection conn=null;
	public static Connection connect() {
		try {
			
			//Calling the mysql Driver 
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Creating object of connection class to use it while executing query
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Cafev2", "root", "root");
			
			return conn;
			
		}catch(Exception e) {
			
			System.out.println("Error: "+e);
			
		}
		
		return null;
	}
	

}
