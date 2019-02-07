<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Demo1 - Register</title>
</head>
<body>

<jsp:include page='refs/header.jsp'/>

<% 
	String prompt = (String) session.getAttribute("prompt");

	if(prompt != null) 
	{
		out.println(prompt);
		session.setAttribute("prompt", "");
	}
%>

<form action='Register' method='post'>
	First name: <input type='text' name='fname'/>
	<br><br>
	Last name: <input type='text' name='lname'/>
	<br><br>
	Month of birth: <input type='text' size='2' name='month'/> 
	Day of birth: <input type='text' size='2' name='day'/>
	<br><br>
	Email: <input type='text' name='email'/>
	<br><br>
	Phone: <input type='text' name='phone'/>
	<br><br>
	Password: <input type='password' name='pass1'/>
	<br><br>
	Confirm password: <input type='password' name='pass2'/>
	<br><br>
	<input type='submit' value='Sign up'/>
</form>

<jsp:include page='refs/footer.jsp'/>

</body>
</html>