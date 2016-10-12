<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<link href="styles.css" rel="stylesheet"/>    
    <s:if test="#count == 0">
        <div style="color:red">No Address Details found..!</div>
    </s:if>
 
<table class="view" >
	<caption class="d">ADDRESS LIST</caption>
	<thead>
	<tr>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Gender</th>
		<th>Phone</th>
		<th>Email</th>
		<th>City Name</th>
		<th>Zip Code</th>
		<th>Street Name</th>
		<th>StreetNo</th>
		<th>Country Name</th>
		<th>Alpha2</th>
		<th>Alpha3</th>
		<th>Modify</th>
		<th>Delete</th>
	</tr>
	</thead>
	<tbody>
	<s:iterator value="list">
           <tr>
               <td><s:property value="first_name"/><td>
               <s:property value="last_name"/>
               <td><s:property value="gender"/><td>
               <s:property value="phone"/>
               <td><s:property value="email"/><td>
               <s:property value="city_name"/>
               <td><s:property value="zip_code"/><td>
               <s:property value="street"/>
               <td><s:property value="street_no"/><td>
               <s:property value="country_name"/>
               <td><s:property value="alpha2"/><td>
               <s:property value="alpha3"/>
               <td><a href='modifyAddress?id=<s:property value="id"/>&first_name=<s:property value="first_name"/>&last_name=<s:property value="last_name"/>&gender=<s:property value="gender"/>&phone=<s:property value="phone"/>&email=<s:property value="email"/>&city_name=<s:property value="city_name"/>&zip_code=<s:property value="zip_code"/>&street=<s:property value="street"/>&street_no=<s:property value="street_no"/>&country_name=<s:property value="country_name"/>&alpha2=<s:property value="alpha2"/>&alpha3=<s:property value="alpha3"/>&sex_id=<s:property value="sex_id"/>&city_id=<s:property value="city_id"/>&country_id=<s:property value="country_id"/>&address_id=<s:property value="address_id"/>'>Modify</a></td>
              
               <td><a href='deleteAddress?id=<s:property value="id"/>'>Delete</a></td>
           </tr>
      </s:iterator>     
	</tbody>
</table> 