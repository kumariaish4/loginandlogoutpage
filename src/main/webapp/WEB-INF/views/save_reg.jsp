<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
    <h2>Registration.....</h2>
    <form action="SaveReg" method="post">
    <pre>
    name<input type="text" name="name">
    city<input type="text" name="city">
    email<input type="text" name="email">
    mobile<input type="text" name="mobile">
    <input type="submit" value="save">
    </pre>
    </form>
    

</body>
</html>