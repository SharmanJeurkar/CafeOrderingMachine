package com.cafe.order;

import java.io.IOException;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cafe.dao.Connector;


@WebServlet("/Beverages")
public class Beverages extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String bev_item1=request.getParameter("bev_item1");
		String bev_item2=request.getParameter("bev_item2");
		String bev_item3=request.getParameter("bev_item3");
		String bev_item4=request.getParameter("bev_item4");
		String bev_item5=request.getParameter("bev_item5");
		int order_number=0;
		order_number=+1;
		
		String query="create table bev_order"+order_number+"(item_1 varchar(20), item_2 varchar(20), item_3 varchar(20), item_4 varchar(20), item_5 varchar(20))";
		String sql="insert into  bev_order"+order_number+" values('"+bev_item1+"', '"+bev_item2+"', '"+bev_item3+"', '"+bev_item4+"', '"+bev_item5+"')";	
		try {
			Connection con=Connector.connect();
			PreparedStatement pst=con.prepareStatement(query);
			PreparedStatement ps=con.prepareStatement(sql);
			pst.executeUpdate();
			ps.executeUpdate();
			RequestDispatcher red=request.getRequestDispatcher("ShowOrder.jsp");
			
			request.setAttribute("bev_item1", bev_item1);
			request.setAttribute("bev_item2", bev_item2);
			request.setAttribute("bev_item3", bev_item3);
			request.setAttribute("bev_item4", bev_item4);
			request.setAttribute("bev_item5", bev_item5);
			red.forward(request, response);
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
