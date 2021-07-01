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


@WebServlet("/Desserts")
public class Desserts extends HttpServlet {
	private static final long serialVersionUID = 1L;


		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String des_item1=request.getParameter("des_item1");
			String des_item2=request.getParameter("des_item2");
			String des_item3=request.getParameter("des_item3");
			String des_item4=request.getParameter("des_item4");
			String des_item5=request.getParameter("des_item5");
			
			
			
			String sql="insert into  des_order values('"+des_item1+"', '"+des_item2+"', '"+des_item3+"', '"+des_item4+"', '"+des_item5+"')";	
			try {
				Connection con=Connector.connect();
				
				PreparedStatement ps=con.prepareStatement(sql);
			
				ps.executeUpdate();
				HttpSession session= request.getSession();
				
				session.setAttribute("des_item1", des_item1);
				session.setAttribute("des_item2", des_item2);
				session.setAttribute("des_item3", des_item3);
				session.setAttribute("des_item4", des_item4);
				request.setAttribute("des_item5", des_item5);
				
				
				response.sendRedirect("ShowOrder.jsp");
			}catch(Exception e) {
				System.out.println(e);
			}
	}

}
