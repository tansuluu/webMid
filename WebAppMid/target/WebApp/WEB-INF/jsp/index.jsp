<%--
  Created by IntelliJ IDEA.
  User: snowleopard
  Date: 3/22/18
  Time: 5:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Students page</title>
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
        <th>link</th>

    </tr>
    <c:forEach items="${customers}" var="customer">
        <tr><td>${customer.first_name}</td>
            <td>${customer.last_name}</td>
            <td>${customer.email_address}</td>
            <td>${customer.job_title}</td>
            <td>${customer.mobile_phone}</td>
            <td>${customer.city}</td>
            <td>${(customer.web_page==null) ? "No WEB Page" : "fff"}</td>
            <td>
                <a href="/customerDetail?id=${customer.id}">WEB page</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
