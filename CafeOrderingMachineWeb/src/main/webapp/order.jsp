<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Order Page</title>
</head>
<body>


<div class="menu_card">
		<p class="title">**Menu**</p>
	<div class="beverages">
		Beverages
		<li>Tea
		<li>Coffee
		<li>Ice-Tea
		<li>Cold-Coffee
	</div>
	
	<div class="snacks">
		Snacks
		<li>Idli
		<li>Dosa
		<li>Pohe
		<li>Upma
	</div>
	
	<div class ="starters">
		Starters
		<li>Tomato Soup
		<li>Dry Manchurian
		<li>Spring Roll
		<li>Harabhara Kabab	
	</div>
	
	<div class="main_menu">
		Main menu
		<li>Butter Roti
		<li>Butter Naan
		<li>Paneer Butter Masala
		<li>Veg Kholapuri
	</div>
	
	<div class="dessert">
		Desserts
		<li>Ice-Cream
		<li>GulabJam
		<li>Ras Malai
		<li>Galebi
	</div>

</div>

<form action="order">

Item1 to order: <input type="text" name="item1"><br>
<br>
Item2 to order: <input type="text" name="item2"><br>
<br>
Item3 to order: <input type="text" name="item3"><br>
<br>
Item4 to order: <input type="text" name="item4"><br>
<br>
Item5 to order: <input type="text" name="item5"><br>
<br>

<input type="submit" value="Place Order"><br>
</form>
    
</body>
</html>
