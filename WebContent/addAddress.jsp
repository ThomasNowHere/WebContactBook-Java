<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
    <title>Add Contact</title>
</head>
<body>
    <h2>Add New Contact</h2>
    <s:form action="addAddress" method="post">
        <s:textfield name="address.name" label="Name"/>
        <s:textfield name="address.phone" label="Phone"/>
        <s:textfield name="address.email" label="Email"/>
        <s:submit value="Save"/>
    </s:form>
</body>
</html>
