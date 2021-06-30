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


@WebServlet("/Snacks")
public class Snacks extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String snk_item1=request.getParameter("snk_item1");
			String snk_item2=request.getParameter("snk_item2");
			String snk_item3=request.getParameter("snk_item3");
			String snk_item4=request.getParameter("snk_item4");
			String snk_item5=request.getParameter("snk_item5");
			
			
			
			
			String sql="insert into  snk_order values('"+snk_item1+"', '"+snk_item2+"', '"+snk_item3+"', '"+snk_item4+"', '"+snk_item5+"')";	
			try {
				Connection con=Connector.connect();
				
				PreparedStatement ps=con.prepareStatement(sql);
				ps.executeUpdate();
				
				
				HttpSession session=request.getSession();
				session.setAttribute("snk_item1", snk_item1);
				session.setAttribute("snk_item2", snk_item2);
				session.setAttribute("snk_item3", snk_item3);
				session.setAttribute("snk_item4", snk_item4);
				session.setAttribute("snk_item5", snk_item5);
				
				response.sendRedirect("Starters.jsp");
				
			}catch(Exception e) {
				System.out.println(e);
			}
	}

}
