
<%@ page import="java.util.*,com.training.entity.*" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Show Books</title>
</head>
<body>

<%!  HashMap<Long,Book> booklist=null;%>
<%   booklist=(HashMap<Long,Book>)request.getAttribute("foundbooks"); %>


<table border="1">
<% Set<Long> keys=booklist.keySet(); %>
<% for (Long key:keys){ %>
<tr>
<td><%=booklist.get(key).getBookNumber()%></td>
<td><%=booklist.get(key).getBookName()%></td>
<td><%=booklist.get(key).getAuthor()%></td>
<td><%=booklist.get(key).getPrice()%></td>

</tr>
<%} %>
</table>

</body>
</html>