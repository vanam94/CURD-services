<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to Inventory Page</title>
</head>
<body>
	<center>
	  <form method="post" action="service">
	  <h3 style="color: red"> Inventory Details </h3><hr>
	  <hr>
	  <b>Enter Inventory Id</b> <br>
	  <input  type="text" name="invId"/> <br>
	  <br>
	  <b>Enter Inventory Name</b> <br>
	   <input  type="text" name="invName"/> <br>
	  <br>
	  <b>Please Describe the Inventory</b> <br>
	   <input  type="text" name="intDesc"/> <br>
	  <br>
	  <b>Enter Quantity</b> <br>
	   <input  type="text" name="quantity"/> <br>
	  <br>
	  <input type="submit" value="submit"/>	  
	  </form>
	  </center>
	</body>
</html>