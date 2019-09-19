<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Scriptlet for Date</h1>
<p>
<%
   java.util.Date today=new java.util.Date();
		out.println("Date : "+today);
%>
</p>
<p>
<h2>Looping process</h2>
<%
   
   for(int c=0;c<5;c++)
	   out.println("  "+c);
%>
</p>
<p>
  <%! int a, b,c; %>
  <% a=10;
     b=20;
     c=a+b; %>
     <%=c %>
     
     10+20=<%= (10+20) %>
</p>
</body>
</html>