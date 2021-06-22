package com.cafe.dao;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class Connector {
	Connection conn=null;
    public static Connection Connector(){
        String url="jdbc:mysql://localhost:3306/School";
        String user="Sharman";
        String password="1234";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection(url,user,password);
            JOptionPane.showMessageDialog(null,"Connection Succesfull");
            return conn;
        } catch (Exception e) {
         JOptionPane.showMessageDialog(null,e);
          return null;
        }
    }

}
