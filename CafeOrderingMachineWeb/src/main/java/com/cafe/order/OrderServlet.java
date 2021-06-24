package com.cafe.order;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OrderServlet extends HttpServlet
{
	
	public void doGet( HttpServletRequest req ,HttpServletResponse res) throws IOException, ServletException
	{
		String item1=req.getParameter("item1");
		String item2=req.getParameter("item2");
		String item3=req.getParameter("item3");
		String item4=req.getParameter("item4");
		String item5=req.getParameter("item5");
		
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.print("<html> <head> <title> ShowOrder </title> </head></html>");
		RequestDispatcher red=req.getRequestDispatcher("ShowOrder.jsp");
		
		req.setAttribute("item1", item1);
		req.setAttribute("item2", item2);
		req.setAttribute("item3", item3);
		req.setAttribute("item4", item4);
		req.setAttribute("item5", item5);
		red.forward(req, res);
			

		
	}

}
