<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>   
<!DOCTYPE html>
<html>
<head>
<style>
input[type=text], select {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

input[type=submit] {
  width: 100%;
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #45a049;
}

div {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}
</style>
<meta charset="ISO-8859-1">
<title>User Registration Form</title>
</head>
<body>
    <div align="center">
        <h2>User Registration</h2>
        <form:form action="register" method="post" modelAttribute="user">
            <form:label path="name">Full name:</form:label>
            <form:input path="name"/><br/>
             
            <form:label path="email">E-mail:</form:label>
            <form:input path="email"/><br/>
             
            <form:label path="password">Password:</form:label>
            <form:password path="password"/><br/>      
 
            <form:label path="birthday">Birthday (yyyy-mm-dd):</form:label>
            <form:input path="birthday"/><br/>
             
            <form:label path="gender">Gender:</form:label>
            <form:radiobutton path="gender" value="Male"/>Male
            <form:radiobutton path="gender" value="Female"/>Female<br/>
                     
            <form:label path="employed">Employed?</form:label>
            <form:checkbox path="employed"/><br/>
                 
            <input type="submit" value="Register"/>
        </form:form>
    </div>
</body>
</html>