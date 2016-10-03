<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <h2>Login</h2>
    <s:form action="login" method="post">
        <s:textfield name="user.username" label="Username"/>
        <s:password name="user.password" label="Password"/>
        <s:submit value="Login"/>
    </s:form>
    <a href="register.jsp">Register</a>
</body>
</html>
