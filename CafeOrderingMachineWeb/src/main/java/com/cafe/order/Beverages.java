package com.cafe.order;

import java.io.IOException;

import java.sql.*;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cafe.dao.Connector;



@WebServlet("/Beverages")
public class Beverages extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String bev_item1 = request.getParameter("bev_item1");
		String bev_item2 = request.getParameter("bev_item2");
		String bev_item3 = request.getParameter("bev_item3");
		String bev_item4 = request.getParameter("bev_item4");
		String bev_item5 = request.getParameter("bev_item5");

			
		
		String sql = "insert into  bev_order values('" + bev_item1 + "', '" + bev_item2 + "', '" + bev_item3 + "', '"
				+ bev_item4 + "', '" + bev_item5 + "')";

		try {
			Connection con = Connector.connect();

			PreparedStatement ps = con.prepareStatement(sql);
			ps.executeUpdate();
			

			HttpSession session=request.getSession();
			
						
			 session.setAttribute("bev_item1", bev_item1);
			 session.setAttribute("bev_item2", bev_item2);
			 session.setAttribute("bev_item3", bev_item3);
			 session.setAttribute("bev_item4", bev_item4);
			 session.setAttribute("bev_item5", bev_item5);
			
			 response.sendRedirect("Snacks.jsp");	
		

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
