<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
        String title=new String();
        int age;
        Integer value1=new Integer(0);
        String countkey=new String("sessions");
        
        if(session.isNew())
        {
        	 title="Welcome to my website";
        	session.setAttribute(countkey, value1);
        	out.println("New Session");
        	out.println(" Key : "+countkey+ " Value : "+value1);
        	
        }
        
        value1=(Integer)session.getAttribute(countkey);
        value1++;
        session.setAttribute(countkey,value1);
        out.println("Re visiting");
    	out.println(" Key : "+countkey+ " Value : "+value1);

        
        if(value1>4)
        {
        	out.println("Congrats.....");
        }
        else
        	out.println("If ypu visit above 4 times gift is waiting");
        
        
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% out.println(title); %>
Number of visits : <% out.println(value1); %>
</body>
</html>