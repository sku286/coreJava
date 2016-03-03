<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="ExceptionHandler.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<title>Using Java Bean</title>
</head>
<body>

<jsp:useBean id="custBean"  class="com.training.beans.Customer" scope="session"></jsp:useBean>
<jsp:setProperty property="*" name="custBean"/>
<%-- Thanks<jsp:getProperty property="customerid" name="custBean"/>
      <jsp:getProperty property="customerName" name="custBean"/>
      <jsp:getProperty property="email_id" name="custBean"/>
      <jsp:getProperty property="handPhone" name="custBean"/> --%>
      
     <%--  <%! String age="four";%>
      <% int age1=Integer.parseInt(age);
      %> --%>
      
      thanks for adding<br>
      
      <c:out value="${custBean.getinfo()}"></c:out>
      
</body>
</html>