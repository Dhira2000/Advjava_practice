<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- <% @
<!--   page -->
<!-- import
directive
 -->
%> --%>
<% 
//scriptlet
			int i=Integer.parseInt(request.getParameter("num1"));
			int j=Integer.parseInt(request.getParameter("num1"));
			int k=i+j;
			k=k*k;
			out.println(k);
%>		

<%=
//expression tag
//out  
%>

<%!

//declration
%>
</body>
</html>



