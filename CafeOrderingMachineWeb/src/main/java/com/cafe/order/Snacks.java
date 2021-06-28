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


@WebServlet("/Snacks")
public class Snacks extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String snk_item1=request.getParameter("snk_item1");
			String snk_item2=request.getParameter("snk_item2");
			String snk_item3=request.getParameter("snk_item3");
			String snk_item4=request.getParameter("snk_item4");
			String snk_item5=request.getParameter("snk_item5");
			int order_number=0;
			order_number=+1;
			
			String query="create table snk_order"+order_number+"(item_1 varchar(20), item_2 varchar(20), item_3 varchar(20), item_4 varchar(20), item_5 varchar(20))";
			String sql="insert into  snk_order"+order_number+" values('"+snk_item1+"', '"+snk_item2+"', '"+snk_item3+"', '"+snk_item4+"', '"+snk_item5+"')";	
			try {
				Connection con=Connector.connect();
				PreparedStatement pst=con.prepareStatement(query);
				PreparedStatement ps=con.prepareStatement(sql);
				pst.executeUpdate();
				ps.executeUpdate();
				RequestDispatcher red=request.getRequestDispatcher("ShowOrder.jsp");
				
				request.setAttribute("snk_item1", snk_item1);
				request.setAttribute("snk_item2", snk_item2);
				request.setAttribute("snk_item3", snk_item3);
				request.setAttribute("snk_item4", snk_item4);
				request.setAttribute("snk_item5", snk_item5);
				red.forward(request, response);
				
			}catch(Exception e) {
				System.out.println(e);
			}
	}

}
