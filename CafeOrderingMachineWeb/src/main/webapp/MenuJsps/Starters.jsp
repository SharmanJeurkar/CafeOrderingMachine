<%@page import="com.cafe.dao.Connector"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Starters Option</title>
</head>
<body>

	<%
	try{
		response.setContentType("text/html");
		Connection con=Connector.connect();
		PreparedStatement pst=con.prepareStatement("select *  from Starters");
		ResultSet rs=pst.executeQuery();
		out.println("<html><body><table border='1'><tr><td>Item_Name</td><td>Cost</td></tr>");		
		
		while(rs.next())
		{
			out.println("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getInt(2)+"</td></tr>");
			
		}
			out.println("</table></body></html>");
	}catch(Exception e){
		System.out.println(e);
	}
	%>

</body>
</html>