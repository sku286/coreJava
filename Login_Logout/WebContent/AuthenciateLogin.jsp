<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
</head>
<body>
<%-- <c:out value="${param.username}"></c:out> --%>
<c:set var="username" value="${param.username }"></c:set>
<c:set var="password" value="${param.password }"></c:set>

    <c:if test="${empty username and empty password}">
      <c:redirect url="Login.jsp"></c:redirect>
    </c:if>
    <%-- <c:if test="${not empty username and not empty password}"> --%>
      <c:if test="${username eq 'ravi' and password eq 'ravi' }">
            <c:set scope="session"
                   var="user"
                   value="${param.username}"/>
            <c:redirect url="Home.jsp"/>
      </c:if>
     <%--  <c:otherwise>
         <c:param name="errmsg" value="Username or password does not match" />
         <c:redirect url="Login.jsp"></c:redirect>
      </c:otherwise>
    </c:if> --%>
</body>
</html>