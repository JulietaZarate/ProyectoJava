<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="javax.swing.*" %>
<%@page import= "java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ExpressTicket | Venta de pasajes OnLine</title>
<link rel="shorcut icon" type="image/png"  href="images/colec.png">
<link href="NewFile.css" rel="stylesheet">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
	<header>
     <nav class="navbar navbar-expand-lg justify-content-between"  style= "background-color: #e3f2fd">
  	<a class="navbar-brand">
  <img src="images/colec1.png">
  		</a>
  <form class="form-inline" style="margin-right: 50px">
    <button class="btn btn-sm btn-outline-secondary" style= "margin: 10px" type="button">Devolución Pasaje</button>
    <button class="btn btn-sm btn-outline-secondary" style= "margin: 20px" type="button">Comprar Pasaje</button>
    <button class="btn btn-sm btn-outline-secondary" type="button">Comprar Pasaje</button>
  </form>
</nav>
	</header>
	<form>
  <div class="form-group">
    <label for="exampleInputEmail1">Email address</label>
    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Password</label>
    <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
  </div>
  <div class="form-check">
    <input type="checkbox" class="form-check-input" id="exampleCheck1">
    <label class="form-check-label" for="exampleCheck1">Check me out</label>
  </div>
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
	
</body>
</html>