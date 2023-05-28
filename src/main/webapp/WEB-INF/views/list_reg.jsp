<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.ResultSet"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List All Registrations</title>
</head>
<body>
     <h2>List ALL Registrations</h2>
     <table>
     <tr>
     <th>Name</th>
     <th>City</th>
     <th>Email</th>
     <th>Mobile</th>
     <th>delete</th>
     <th>update</th>
     </tr>
     
     
     
     <% ResultSet res=(ResultSet)request.getAttribute("registrations") ;
     while(res.next()){%>
     
     <tr>
     <td><%=res.getString(1) %></td>
     <td><%=res.getString(2) %></td>
     <td><%=res.getString(3) %></td>
     <td><%=res.getString(4) %></td>
     <td><a href="delete?emailId=<%=res.getString(3)%>">delete</a></td>
     <td><a href="delete?emailId=<%=res.getString(3)%>">update</a></td>
     </tr>
     
     
     
     
     <%} %>
     </table>

</body>
</html>