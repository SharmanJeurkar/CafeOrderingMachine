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

@WebServlet("/Starters")
public class Starters extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String str_item1=request.getParameter("str_item1");
		String str_item2=request.getParameter("str_item2");
		String str_item3=request.getParameter("str_item3");
		String str_item4=request.getParameter("str_item4");
		String str_item5=request.getParameter("str_item5");
		int order_number=0;
		order_number=+1;
		
		String query="create table str_order"+order_number+"(item_1 varchar(20), item_2 varchar(20), item_3 varchar(20), item_4 varchar(20), item_5 varchar(20))";
		String sql="insert into  str_order"+order_number+" values('"+str_item1+"', '"+str_item2+"', '"+str_item3+"', '"+str_item4+"', '"+str_item5+"')";	
		try {
			Connection con=Connector.connect();
			PreparedStatement pst=con.prepareStatement(query);
			PreparedStatement ps=con.prepareStatement(sql);
			pst.executeUpdate();
			ps.executeUpdate();
			RequestDispatcher red=request.getRequestDispatcher("ShowOrder.jsp");
			
			request.setAttribute("str_item1", str_item1);
			request.setAttribute("str_item2", str_item2);
			request.setAttribute("str_item3", str_item3);
			request.setAttribute("str_item4", str_item4);
			request.setAttribute("str_item5", str_item5);
			red.forward(request, response);
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
