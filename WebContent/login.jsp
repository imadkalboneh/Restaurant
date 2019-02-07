<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Demo1 - Login</title>
</head>
<body>

<jsp:include page='refs/header.jsp'/>

<form action='Login' method='post'>
	Email address: <input type='text' name='email'/>
	<br><br>
	Password: <input type='password' name='pass'/>
	<br>
	<font size='2'><a href=''>Forgot your password?</a></font>
	<br><br>
	<input type='submit' value='Login'/>
</form>

<jsp:include page='refs/footer.jsp'/>

</body>
</html>