<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ShowOrder</title>
<link rel="stylesheet" href="css/ShowOrder.css">
</head>
<body>

This is your Order.........

<%  
response.setContentType("text/html");

out.print("<html> <body>");
out.println("<table> <tr> <th>Items in The Order</th></tr>");

String bev_item1=(String)request.getAttribute("bev_item1");
String bev_item2=(String)request.getAttribute("bev_item2");
String bev_item3=(String)request.getAttribute("bev_item3");
String bev_item4=(String)request.getAttribute("bev_item4");
String bev_item5=(String)request.getAttribute("bev_item5");

String snk_item1=(String)request.getAttribute("snk_item1");
String snk_item2=(String)request.getAttribute("snk_item2");
String snk_item3=(String)request.getAttribute("snk_item3");
String snk_item4=(String)request.getAttribute("snk_item4");
String snk_item5=(String)request.getAttribute("snk_item5");

String str_item1=(String)request.getAttribute("str_item1");
String str_item2=(String)request.getAttribute("str_item2");
String str_item3=(String)request.getAttribute("str_item3");
String str_item4=(String)request.getAttribute("str_item4");
String str_item5=(String)request.getAttribute("str_item5");

String mm_item1=(String)request.getAttribute("mm_item1");
String mm_item2=(String)request.getAttribute("mm_item2");
String mm_item3=(String)request.getAttribute("mm_item3");
String mm_item4=(String)request.getAttribute("mm_item4");
String mm_item5=(String)request.getAttribute("mm_item5");

String rice_item1=(String)request.getAttribute("rice_item1");
String rice_item2=(String)request.getAttribute("rice_item2");
String rice_item3=(String)request.getAttribute("rice_item3");
String rice_item4=(String)request.getAttribute("rice_item4");
String rice_item5=(String)request.getAttribute("rice_item5");

String des_item1=(String)request.getAttribute("des_item1");
String des_item2=(String)request.getAttribute("des_item2");
String des_item3=(String)request.getAttribute("item3");
String des_item4=(String)request.getAttribute("item4");
String des_item5=(String)request.getAttribute("item5");

//beverages
if(bev_item1 !=null &&  bev_item1 !="") 
	out.println("<tr><td>"+bev_item1+"</tr></td>");
		
if(bev_item2 !=null &&  bev_item2 !="")
	out.println("<tr><td>"+bev_item2+"</tr></td>");

if(bev_item3 !=null && bev_item3 !="") 
	out.println("<tr><td>"+bev_item3+"</tr></td>");

if(bev_item4 !=null && bev_item4 !="") 
	out.println("<tr><td>"+bev_item4+"</tr></td>");

if(bev_item5!=null && bev_item5 !="") 
	out.println("<tr><td>"+bev_item5+"</tr></td>");
	
	
//snacks	
if(snk_item1 !=null &&  snk_item1 !="") 
	out.println("<tr><td>"+snk_item1+"</tr></td>");
	
if(snk_item2 !=null &&  snk_item2 !="")
	out.println("<tr><td>"+snk_item2+"</tr></td>");

if(snk_item3 !=null && snk_item3 !="") 
	out.println("<tr><td>"+snk_item3+"</tr></td>");

if(snk_item4 !=null && snk_item4 !="") 
	out.println("<tr><td>"+snk_item4+"</tr></td>");

if(snk_item5!=null && snk_item5 !="") 
	out.println("<tr><td>"+snk_item5+"</tr></td>");
	
	
//starters	
if(str_item1 !=null &&  str_item1 !="") 
	out.println("<tr><td>"+str_item1+"</tr></td>");
	
if(str_item2 !=null &&  str_item2 !="")
	out.println("<tr><td>"+str_item2+"</tr></td>");

if(str_item3 !=null && str_item3 !="") 
	out.println("<tr><td>"+str_item3+"</tr></td>");

if(str_item4 !=null && str_item4 !="") 
	out.println("<tr><td>"+str_item4+"</tr></td>");

if(str_item5!=null && str_item5 !="") 
	out.println("<tr><td>"+str_item5+"</tr></td>");
	
	
//Main Menu	
if(mm_item1 !=null &&  mm_item1 !="") 
	out.println("<tr><td>"+mm_item1+"</tr></td>");

if(mm_item2 !=null &&  mm_item2 !="")
	out.println("<tr><td>"+mm_item2+"</tr></td>");

if(mm_item3 !=null && mm_item3 !="") 
	out.println("<tr><td>"+mm_item3+"</tr></td>");

if(mm_item4 !=null && mm_item4 !="") 
	out.println("<tr><td>"+mm_item4+"</tr></td>");

if(mm_item5!=null && mm_item5 !="") 
	out.println("<tr><td>"+mm_item5+"</tr></td>");
	
//Rice
if(rice_item1 !=null &&  rice_item1 !="") 
	out.println("<tr><td>"+rice_item1+"</tr></td>");
	
if(rice_item2 !=null &&  rice_item2 !="")
	out.println("<tr><td>"+rice_item2+"</tr></td>");

if(rice_item3 !=null && rice_item3 !="") 
	out.println("<tr><td>"+rice_item3+"</tr></td>");

if(rice_item4 !=null && rice_item4 !="") 
	out.println("<tr><td>"+rice_item4+"</tr></td>");

if(rice_item5!=null && rice_item5 !="") 
	out.println("<tr><td>"+rice_item5+"</tr></td>");


//Desserts
if(des_item1 !=null &&  des_item1 !="") 
	out.println("<tr><td>"+des_item1+"</tr></td>");
	
if(des_item2 !=null &&  des_item2 !="")
	out.println("<tr><td>"+des_item2+"</tr></td>");

if(des_item3 !=null && des_item3 !="") 
	out.println("<tr><td>"+des_item3+"</tr></td>");

if(des_item4 !=null && des_item4 !="") 
	out.println("<tr><td>"+des_item5+"</tr></td>");

if(des_item5!=null && des_item5 !="") 
	out.println("<tr><td>"+des_item5+"</tr></td>");
	
out.print("</table> </body> </html>");	
%>
<img src="css/img/Cafe.jpg" />
<br>
<a href="Thanks.html">Confirm Order</a>
</body>
</html>
