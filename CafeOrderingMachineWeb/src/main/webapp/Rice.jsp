<%@page import="com.cafe.dao.Connector"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Rice Option</title>
</head>
<body>

	<%
	try{
		response.setContentType("text/html");
		Connection con=Connector.connect();
		PreparedStatement pst=con.prepareStatement("select *  from Rice");
		ResultSet rs=pst.executeQuery();
		out.println("<html><body><table border='1'><tr><td>Item_Name</td><td>Cost</td></tr>");		
		
		while(rs.next())
		{
			out.println("<tr><td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getInt(3)+"</td></tr>");
			
		}
			out.println("</table></body></html>");
	}catch(Exception e){
		System.out.println(e);
	}
	%>

<form action="Rice">
	Enter item 1: <input type="text" name="rice_item1"><br><br>
	Enter item 2: <input type="text" name="rice_item2"><br><br>
	Enter item 3: <input type="text" name="rice_item3"><br><br>
	Enter item 4: <input type="text" name="rice_item4"><br><br>
	Enter item 5: <input type="text" name="rice_item5"><br><br>
	<input type="submit" value="Submit Order"><br><br>
</form>	

</body>
</html>
