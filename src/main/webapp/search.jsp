<%@page import="java.sql.*"%>
<%@page import="com.Restaurent.dao.Connector"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Order from here</title>
</head>
<body>

<form action="search.jsp">

	<input type="text" name="itemname"/>
	<input type="submit" value="search"/>
	
</form>

<%
    
    //assigning the connection class with .connect() method
    Connection conn=Connector.connect();
    
    //storing the apaprmetre passed by user
    String itemname=request.getParameter("itemname");
   
    //cost parametre
    int cost;
   		try{
   			
   			//calling preparedstatement 
   			PreparedStatement pst=conn.prepareStatement("select itemname and cost from menu where itemname='"+itemname+"'");
   			
   			
   			//calling resultset object
   			ResultSet rs;
   			
   			//html for show the requested data in table
   			out.println("<table border=1><tr> <th>MenuId</th> <th>MenuType</th> <th>ItemName</th> <th>Cost</th> </tr>");
   					
   			//checking if searchid is null or empty		
   			if(itemname== null || itemname.isEmpty()){
   			
   			// passing Query
   			pst=conn.prepareStatement("select* from Menu");
   			
   			// executing query
   			rs=pst.executeQuery();
   			
   			// running while loop so that while there are more resultsets it will print	
   			while(rs.next()){
   				out.println("<tr> <td>"+rs.getInt(1)+"</td> <td>"+rs.getString(2)+"</td> <td>"+rs.getString(3)+"</td> <td>"+rs.getInt(4)+"</td> </tr>");
   			}
   		}else{
   			
   			//passing query
   			pst=conn.prepareStatement("select* from Menu where ItemName='"+itemname+"'");
   			
    		// executing query
   			rs=pst.executeQuery();
   			
   			// running while loop so that while there are more resultsets it will print	
   			while(rs.next()){
   				cost=rs.getInt(4);
   				out.println("<tr> <td>"+rs.getInt(1)+"</td> <td>"+rs.getString(2)+"</td> <td>"+rs.getString(3)+"</td> <td>"+cost+"</td> </tr>");
   			
   	%><br>


<form action="AddToCart">

	Item Name: <input type="text" name="itemname" value=<%=itemname%>>
	Item Cost: <input type="text" name="cost" value=<%=cost%>>
	Number of Items: <input type="text" name="numberofitems">
	<input type="submit" value="add to cart">
	
</form>
	<%		}
   		}	out.println("</table> <br>");		
	}catch(Exception e ){
   			System.out.println("Error: "+e);
   		}
    %><br>

</body>
</html>