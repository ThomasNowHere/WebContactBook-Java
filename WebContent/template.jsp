<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><tiles:insertAttribute name="title" ignore="true"/></title>
<link href="styles.css" rel="stylesheet"/>
</head>
<body>
<tiles:insertAttribute name="header"/>
<table style="width=100%">
        <tr>
        
                  <tiles:insertAttribute name="menu"/>
        </tr>
        <tr>    
                  <tiles:insertAttribute name="body" />
        </tr> 
        
</table>
</body>
</html>