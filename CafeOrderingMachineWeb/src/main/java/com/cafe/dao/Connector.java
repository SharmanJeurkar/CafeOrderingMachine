package com.cafe.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connector {
	
    public static Connection connect(){
        String url="jdbc:mysql://localhost:3306/CafeOrderWeb";
        String user="Sharman";
        String password="1234";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection(url,user,password);
            return conn;
        } catch (Exception e) {
        	System.out.println(e);
          return null;
        }
    }

}
