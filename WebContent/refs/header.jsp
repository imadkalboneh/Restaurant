<%@page import='objects.Member' %>

<% Member m = (Member) session.getAttribute("m"); %>

<a href='#'>Home</a> 
<a href='#'>About us</a> 
<a href='#'>Menu</a> 
<a href='#'>Locations</a> | 

<% if(m == null) { %>
	<a href='register.jsp'>Register</a> 
	<a href='login.jsp'>Login</a>
<% } else { %>
	Welcome, <%= m.getFname() %>! 
	<a href='#'>Logout</a>
<% } %>

<hr><br>
 
