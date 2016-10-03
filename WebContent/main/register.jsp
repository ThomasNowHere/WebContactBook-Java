<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
    <title>Register</title>
</head>
<body>
    <h2>Register</h2>
    <s:form action="register" method="post">
        <s:textfield name="user.username" label="Username"/>
        <s:password name="user.password" label="Password"/>
        <s:textfield name="user.email" label="Email"/>
        <s:submit value="Register"/>
    </s:form>
</body>
</html>
