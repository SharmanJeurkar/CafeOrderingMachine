package com.cafe.order;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cafe.dao.CreateTableTimer;
import com.cafe.dao.DeleteTableTimer;

@WebServlet("/Thanks")
public class Thanks extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CreateTableTimer ctt=new CreateTableTimer();
		DeleteTableTimer dtt=new DeleteTableTimer();
		
		dtt.beverages();
		dtt.desserts();
		dtt.mainMenu();
		dtt.snacks();
		dtt.rice();
		dtt.stareters();
		
		ctt.beverages();
		ctt.desserts();
		ctt.rice();
		ctt.snacks();
		ctt.mainMenu();
		ctt.stareters();
		
		response.sendRedirect("Thanks.html");
	}

}
