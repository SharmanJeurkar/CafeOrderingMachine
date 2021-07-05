package com.Restaurent.order;

import java.io.IOException;
import java.sql.*;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Restaurent.dao.Connector;

/**
 * Servlet implementation class AddToCart
 */
@WebServlet("/AddToCart")
public class AddToCart extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 Random rand = new Random(); 
		 //instance of random class
		 
	      int upperbound = 100000;
	      
	      //generate random values from 0-10000
	      int randomnumber = rand.nextInt(upperbound); 
		
	      
	    //assigning  order number in session
		HttpSession session=request.getSession();
		session.setAttribute("order number",randomnumber);
	      
		//getting the value from session
		int ordernumber=(int) session.getAttribute("order number");
		
		//requesting parameters from order.jsp
		
		//itemname
		String itemname=request.getParameter("itemname");
		
		//cost
		int cost=Integer.parseInt(request.getParameter("cost"));
		
		//multiples
		int numberofitems=Integer.parseInt(request.getParameter("numberofitems"));
		 System.out.println(numberofitems);
		
		try {
			Connection conn=Connector.connect();
			PreparedStatement pst=conn.prepareStatement("insert into bill values(?,?,?,?)");
			
			pst.setInt(1, ordernumber);
			//insert itemname
			pst.setString(2, itemname);
			//insert cost
			pst.setInt(3,cost);
			//insert multiples
			pst.setInt(4, numberofitems);
			//executing insert query 
			pst.executeUpdate();
			
			//redirecting url to order page
			response.sendRedirect("search.jsp");
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}

}
