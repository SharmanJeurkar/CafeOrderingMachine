package com.cafe.order;

import java.io.IOException;

import java.sql.Connection;
import java.sql.PreparedStatement;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cafe.dao.Connector;


@WebServlet("/Rice")
public class Rice extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String rice_item1=request.getParameter("rice_item1");
		String rice_item2=request.getParameter("rice_item2");
		String rice_item3=request.getParameter("rice_item3");
		String rice_item4=request.getParameter("rice_item4");
		String rice_item5=request.getParameter("rice_item5");
		
		
		
		String sql="insert into  rice_order values('"+rice_item1+"', '"+rice_item2+"', '"+rice_item3+"', '"+rice_item4+"', '"+rice_item5+"')";	
		try {
			Connection con=Connector.connect();
			
			PreparedStatement ps=con.prepareStatement(sql);
			
			ps.executeUpdate();
			
			
			HttpSession session= request.getSession();
			
			session.setAttribute("rice_item1", rice_item1);
			session.setAttribute("rice_item2", rice_item2);
			session.setAttribute("rice_item3", rice_item3);
			session.setAttribute("rice_item4", rice_item4);
			request.setAttribute("rice_item5", rice_item5);

			
			response.sendRedirect("Desserts.jsp");
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}

	

}
