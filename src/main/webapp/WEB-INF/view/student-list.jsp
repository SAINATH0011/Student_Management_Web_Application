<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Student Managment System</title>


</head>


<body>
<h1 align="center">Student Managment System</h1>
   
      <div align="center" class="container">
   
    <form action="/Student_Managment_Web/add_Student">
    <input type="submit" value="ADD" class="btn btn-primary">
    </form>
   <br>
   <table border="1"  cellspacing="1px" cellpadding="15px" class="table table-striped">
   <thead >
     <tr>
     <td>id</td>
     <td>name</td>
     <td>mobile</td>
     <td>country</td>
     </tr>
   </thead>
   
   <c:forEach  var="student"  items="${students}">
      <tr>
      <td> ${student.id}</td>
       <td>${student.name}</td>
      <td> ${student.mobile}</td>
      <td> ${student.country}</td>
      <td><a href="/Student_Managment_Web/updateStudent?userId=${student.id}"> Update </a></td>
       <td><a href="/Student_Managment_Web/deleteStudent?userId=${student.id}" onclick=" if(!confirm('Are you sure want to Delete This Student ?')) return false"> Delete </a></td>
     
    </tr>
   </c:forEach>
   
   </table>
     <!--  <img src="/Student_Managment_Web/URLToReachResourcesFolder/images/student.png" alt="Student logo" width="500" height="300">-->
     
   </div>
</body>
</html>