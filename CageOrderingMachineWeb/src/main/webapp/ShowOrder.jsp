<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ShowOrder</title>
</head>
<body>

This is your Order.........
<%  
response.setContentType("text/html");

out.print("<html> <body>");

String item1=(String)request.getAttribute("item1");
String item2=(String)request.getAttribute("item2");
String item3=(String)request.getAttribute("item3");
String item4=(String)request.getAttribute("item4");
String item5=(String)request.getAttribute("item5");

if(item1 !=null) 
	out.println("<br><li>"+item1);
  
if(item2 !=null)
	out.println("<br><li>"+item2);

if(item3 !=null) 
	out.println("<br><li>"+item3);

if(item4 !=null && item4 !=" ") 
	out.println("<br><li>"+item4);

if(item5!=null && item5 !=" ") 
	out.println("<br><li>"+item5);

out.print(" </body> </html>");
%>

</body>
</html>