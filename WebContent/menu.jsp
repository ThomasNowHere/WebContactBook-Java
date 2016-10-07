<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<link href="styles.css" rel="stylesheet"/>
<b class="welcome">Welcome <s:property value="#session['uname']"/></b>

<table class="menu" >
	<thead>
	<tr>
        <th><a href="homeMenu">Home</a></th>

        <th><a href="addMenu">Add Address</a></th>
   
        <th><a href="viewDetails">View Address</a></th>
 
        <th><a href="logout">LogoutMenu</a></th>
    </tr>
</table>