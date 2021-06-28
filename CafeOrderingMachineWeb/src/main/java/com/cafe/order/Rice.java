package com.cafe.order;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		int order_number=0;
		order_number=+1;
		
		String query="create table rice_order"+order_number+"(item_1 varchar(20), item_2 varchar(20), item_3 varchar(20), item_4 varchar(20), item_5 varchar(20))";
		String sql="insert into  rice_order"+order_number+" values('"+rice_item1+"', '"+rice_item2+"', '"+rice_item3+"', '"+rice_item4+"', '"+rice_item5+"')";	
		try {
			Connection con=Connector.connect();
			PreparedStatement pst=con.prepareStatement(query);
			PreparedStatement ps=con.prepareStatement(sql);
			pst.executeUpdate();
			ps.executeUpdate();
			RequestDispatcher red=request.getRequestDispatcher("ShowOrder.jsp");
			
			request.setAttribute("rice_item1", rice_item1);
			request.setAttribute("rice_item2", rice_item2);
			request.setAttribute("rice_item3", rice_item3);
			request.setAttribute("rice_item4", rice_item4);
			request.setAttribute("rice_item5", rice_item5);
			red.forward(request, response);
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}

	

}
