<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title> test page </title>
</head>
<body>
<h3>User Creator</h3>
 
<FORM action="register">
 
      <h4>FirstName: <br><input type="text" name="personBean.firstName" label="First name" required/></h4>
      <h4>LastName: <br><input type="text"  name="personBean.lastName" label="Last name" required /></h4>
      <h4>Email: <br><input type="email" name="personBean.email"  label ="Email" required/> </h4>
      <h4>Address: <br><input type="text" name="personBean.address"  label="Address" required  /></h4>
      <h4>City: <br><input type="checkbox" name="personBean.city" label="City" /></h4> 
      <input type="submit" name="submit"/>
      
       
</form> 
  
	
	<h1>First Struts2 Application</h1>
<s:form action="MessangerAction">
	<s:textfield name="personBean.email" label="Email"/>
	<s:submit/>
</s:form>
<a href="MessangerAction">Messanger Action</a>
<a href="WelcomeAction">Welcome Action</a>
<a href="test">Welcome Action ftl</a>

</body>
</html>