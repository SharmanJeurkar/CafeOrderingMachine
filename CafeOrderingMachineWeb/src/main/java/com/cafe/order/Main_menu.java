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


@WebServlet("/Main_menu")
public class Main_menu extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String mm_item1=request.getParameter("mm_item1");
		String mm_item2=request.getParameter("mm_item2");
		String mm_item3=request.getParameter("mm_item3");
		String mm_item4=request.getParameter("mm_item4");
		String mm_item5=request.getParameter("mm_item5");
		int order_number=0;
		order_number=+1;
		
		String query="create table mm_order"+order_number+"(item_1 varchar(20), item_2 varchar(20), item_3 varchar(20), item_4 varchar(20), item_5 varchar(20))";
		String sql="insert into  mm_order"+order_number+" values('"+mm_item1+"', '"+mm_item2+"', '"+mm_item3+"', '"+mm_item4+"', '"+mm_item5+"')";	
		try {
			Connection con=Connector.connect();
			PreparedStatement pst=con.prepareStatement(query);
			PreparedStatement ps=con.prepareStatement(sql);
			pst.executeUpdate();
			ps.executeUpdate();
			RequestDispatcher red=request.getRequestDispatcher("ShowOrder.jsp");
			
			request.setAttribute("mm_item1", mm_item1);
			request.setAttribute("mm_item2", mm_item2);
			request.setAttribute("mm_item3", mm_item3);
			request.setAttribute("mm_item4", mm_item4);
			request.setAttribute("mm_item5", mm_item5);
			red.forward(request, response);
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
