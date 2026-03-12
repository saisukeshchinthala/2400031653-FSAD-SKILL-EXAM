<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Retrieve Data using Hibernate Framework </title>
</head>
<body>
<h1>Student Details Are:</h1>

 <%@page import="java.util.*" %>
 <%@page import="com.model.*"%>
 <% @SuppressWarnings("unchecked") List <Student> list = (List<Student>) request.getAttribute("slist"); %>
 <table border="1">
  <tr>
   <th>Student Id</th>
   <th>Student Name</th>
   <th>Student Marks </th>
  </tr>
  <%for(Student s:list) {%>
  <tr>
   <td><%=s.getSid() %></td>
   <td><%=s.getSname() %></td>
   <td><%=s.getSmarks() %></td>
  </tr>
  <%} %>
 </table>
</body>
</html>