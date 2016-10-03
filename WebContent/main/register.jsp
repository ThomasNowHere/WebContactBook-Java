<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<s:include value="header.html"/>
<table class="view" ><caption class="d">User Registration</caption></table>
         

<s:form action="registerUser" method="post" theme="simple">
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
       <td>Email</td>   
       <td><s:textfield key="email" maxlength="10" /></td>  
   </tr>
   <tr>
       <td>Address</td>   
       <td><s:textfield key="address" maxlength="10"/></td>  
   </tr>
   <tr>
       <td></td>   
       <td><s:submit value="Register"/></td>  
   </tr>
   <tr>
        <td><s:if test="hasActionMessages()">
                  Registered Successfully  <a href="homeMenu">  Click Here </a> to start !
               </s:if></td>
        <td>Back to login page <a href="login.jsp">login</a></td>
   </tr>
   <tr>
       <td></td>   
       <td><s:actionerror cssClass="error"/>
<s:actionmessage cssClass="message"/></td>  
   </tr>
</table>  
      </s:form>              