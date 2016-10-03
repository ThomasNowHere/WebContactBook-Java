<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<s:include value="header.html"/>
<table class="view" ><caption class="d">Login Page</caption></table>

<s:form action="loginUser" method="post" theme="simple">
<table class="input">
    <tr>
        <td>Username</td>
        <td><s:textfield key="uname" maxlength="10"/></td>
   </tr>
   <tr>
       <td>Password</td>
       <td><s:password key="pwd" maxlength="10"/></td>     
   </tr>
   <tr>
       <td></td>   
       <td><s:submit value="Login"/></td>  
   </tr>
   <tr>
        <td><a href="register.jsp">Sing Up</a></td>
        <td><a href="register.jsp">If you don't have account,click here</a></td>
   </tr>
   <tr>
       <td></td>   
       <td><s:actionerror cssClass="error"/>
<s:actionmessage cssClass="message"/></td>  
   </tr>
</table>    
</s:form>

      