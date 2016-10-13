<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<table class="view" ><caption class="d">Address Modify</caption></table>



<s:form action="updateAddress" method="post" theme="simple">
<b id="error">
             <s:actionerror cssClass="error"/>
             
             <s:actionmessage cssClass="message"/>
 </b>
 <table class="input">
 <s:hidden key="id"/>
    <tr>
        <td>First Name</td>
        <td><s:textfield key="first_name" maxlength="17"/></td>
   </tr>
   <tr>
       <td>Last Name</td>
       <td><s:textfield key="last_name" maxlength="17"/></td>     
   </tr>
   <tr>
       <td>Phone</td>
       <td><s:textfield key="phone" maxlength="17"/></td>     
   </tr>
   <tr>
        <td>Email</td>
        <td><s:textfield key="email" maxlength="17" /></td>
   </tr>
   <tr>
       <td>Gender</td>
       <td><s:radio label="Gender" name="gender" list="#{'1':'Male','2':'Female'}"  onclick="genderValue(this.value)" /></td>     
   </tr>
   <tr>
       <td>Country</td>
       <td><s:select  label="Country" id='country' headerKey="-1" headerValue="--------Select Country--------" 
             value="" list="#{'1':'Australia', '2':'Canada', '3':'Croatia' , '4':'England', '5':'USA'}" 
		          onclick='countryValue(this.value)' onchange='countryChanged(this.value);'/>  </td>     
   </tr>
   <tr>
        <td>Alpha2</td>
        <td><s:textfield style="width:40px" id="alp2" readonly="true" /></td>
   </tr>
   <tr>
        <td>Alpha3</td>
        <td><s:textfield style="width:60px" id="alp3" readonly="true" /></td>
   </tr>
   <tr>
        <td>City</td>
        <td><s:select label="City" id='cities' headerKey="-1" headerValue="-----------Select City----------" 
             list="#{}"   onclick='cityValue(this.value)'   onchange='cityChanged(this.value)'/></td>
   </tr>
   <tr>
        <td>Zip Code</td>
        <td><s:textfield  key="zip_code" id="zip" readonly="true" /></td>
   </tr>
   <tr>
        <td>Street Name</td>
        <td><s:textfield label="Street Name" key="street" maxlength="17"/></td>
   </tr>
   <tr>
        <td>StreetNo</td>
        <td><s:textfield label="Street No" key="street_no" maxlength="5"/></td>
   </tr>
   <tr>
        <td>Gender id</td>
        <td><s:textfield id="gender"  readonly="true" key="sex_id"/></td>
   </tr>
   <tr>
        <td>Country id</td>
        <td><s:textfield id="coun"  readonly="true" key="country_id"/></td>
   </tr>
   <tr>
        <td>city Id</td>
        <td><s:textfield id="cit"   readonly="true" key="city_id"/></td>
   </tr>
   <tr>
        <td></td>
        <td><s:submit value="Modify Address" /></td>
   </tr>
</table>   
</s:form> 
<script type="text/javascript" src="${pageContext.request.contextPath}/js/logic.js"></script>

 
   