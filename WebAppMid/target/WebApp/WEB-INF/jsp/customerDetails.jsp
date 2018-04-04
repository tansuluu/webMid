<%--
  Created by IntelliJ IDEA.
  User: acer
  Date: 31.03.2018
  Time: 6:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>customerDetails</title>
</head>
<body>
<table>
    <tr>
        <th>Firstname</th>
        <th>Lastname</th>
        <th>email_address</th>
        <th>job_title</th>
        <th>mobile_phone</th>
        <th>city</th>
        <th>web_page</th>
        <th>Firstname</th>
        <th>Lastname</th>
        <th>email_address</th>
        <th>job_title</th>
        <th>mobile_phone</th>
        <th>city</th>
        <th>web_page</th>


    </tr>
<tr>
    <td>${customer.id}</td>
    <td>${customer.company}</td>
    <td>${customer.last_name}</td>
    <td>${customer.first_name}</td>
    <td>${customer.email_address}</td>
    <td>${customer.job_title}</td>
    <td>${customer.business_phone}</td>
    <td>${customer.home_phone}</td>
    <td>${customer.mobile_phone}</td>
    <td>${customer.fax_number}</td>
    <td>${customer.address}</td>
    <td>${customer.city}</td>
    <td>${customer.state_province}</td>
    <td>${customer.zip_postal_code}</td>
    <td>${customer.country_region}</td>
    <td>${customer.web_page}</td>
    <td>${customer.notes}</td>
</tr>
</table>
</body>
</html>
