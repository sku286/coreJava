<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
</head>
<body>
<%-- <fmt:setLocale value="en"/> --%>
	<fmt:setBundle basename="MessageResources" var="msg" scope="page"/>
	
	<form>
		<label>
			<fmt:message key="forms.label.userName" bundle="${msg }"></fmt:message>
		</label>
		<input type="text" name="userName">
		<label>
			<fmt:message key="forms.label.passWord" bundle="${msg }"></fmt:message>
		</label>
		<input type="passWord" name="passWord">
	
	</form>
</body>
</html>