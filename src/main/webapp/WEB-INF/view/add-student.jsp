<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

<style>
   .container{
      background-color: lightgrey;
      width:450px;
      height:250px;
              position: relative;
              left:0%;
              top:100px;
      
   }
   body{
            background-image: linear-gradient(lightblue,lightgrey);
             min-height: 100vh;
        
        }
</style>
</head>
<body>

<div align="center" class="container">
<h2 >----  ADD STUDENT ----</h2>

  <!-- Create a Spring form -->
  
  <form:form action="save-student" modelAttribute="student" method="POST">
     
     <table>
    <form:hidden path="id"/>
       
       <tr>
    <td><label>Name :</label></td> 
      <td>  <form:input path="name"/><br></td> 
       </tr>
       <br>
        <tr>
      <td>  <label>Mobile :</label></td> 
       <td> <form:input path="mobile"/><br></td> 
       </tr>
       
        <tr>
      <td>  <label>Country :</label></td> 
      <td>  <form:input path="country"/><br> </td>  
       </tr>
           
        <tr>
        <td></td>
     <td>   <input type="submit" value="Add" class="btn btn-success"></td> 
       
        </tr>
        
       </table>
  </form:form>
  </div>
</body>
</html>