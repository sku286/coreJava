<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>My First Scriptless JSP</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
</head>
<body>

<%-- <% pageContext.setAttribute("name", "Welcome To Jstl Programming"); %> --%>
<c:set var="name" value="Welcome To Jstl Programming" scope="page"></c:set>
<span style="color: red"><c:out value="${name}"></c:out></span>
<!-- <a href="NameServlet">Show Names</a> -->

<c:url value="NameServlet" var="link"></c:url>
 <a href="<c:out value='${link}'/>">print Names</a>


</body>
</html>