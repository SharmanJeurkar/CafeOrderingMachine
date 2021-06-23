<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ShowOrder</title>
<link rel="stylesheet" href="ShowOrder.css">
</head>
<body>

This is your Order.........

<%  
response.setContentType("text/html");

out.print("<html> <body>");
out.println("<table> <tr> <th>Items in The Order</th></tr>");

String item1=(String)request.getAttribute("item1");
String item2=(String)request.getAttribute("item2");
String item3=(String)request.getAttribute("item3");
String item4=(String)request.getAttribute("item4");
String item5=(String)request.getAttribute("item5");


if(item1 !=null &&  item1 !="") 
	out.println("<tr><td>");
	out.println(item1);
	out.println("</tr></td>");
	
if(item2 !=null &&  item2 !="")
	out.println("<tr><td>");
	out.println(item2);
	out.println("</tr></td>");

if(item3 !=null && item3 !="") 
	out.println("<tr><td>");
	out.println(item3);
	out.println("</tr></td>");

if(item4 !=null && item4 !="") 
	out.println("<tr><td>");
	out.println(item4);
	out.println("</tr></td>");

if(item5!=null && item5 !="") 
	out.println("<tr><td>");
	out.println(item5);
	out.println("</tr></td>");

out.print("</table> </body> </html>");
%>

<br>
<a href="Thanks.html">Confirm Order</a>
</body>
</html>
