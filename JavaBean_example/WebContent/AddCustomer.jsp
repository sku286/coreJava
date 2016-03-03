<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Customer</title>
</head>
<body>
<header><%@ include file="Header.jsp" %></header>
<hr>
<section>
<form action="ProcessCustomer.jsp">
<table border="1">
   <tr>
     <td><label>Customer Id</label></td>
    <td> <input type="text" name="customerid"></td></tr>
   <tr><td>  <label>Customer Name</label></td>
     <td><input type="text" name="customerName"></td></tr>
   <tr><td>  <label>Email-Id</label></td>
     <td><input type="email" name="email_id"></td></tr>
  <tr><td>   <label>HandPhone</label></td>
    <td> <input type="tel" name="handPhone" pattern="9999999999" placeholder="9999999999"></td></tr>
    <tr colspan="2"><td > <input type="submit" value="Add"></td></tr>
      </table>
    </form>
</section>
<footer><jsp:include page="Footer.jsp" ></jsp:include></footer>

</body>
</html>