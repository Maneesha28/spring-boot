<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 5/5/21
  Time: 9:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customers</title>
</head>
<body>

<style>
    th, td {
        padding: 15px;
        text-align: center;
        border-bottom: 1px solid #000000;
    }
    table {
        border-spacing: 5px;
    }
    th {
        font-family: Helvetica;
        font-size: 28px;
        color: #00316E;
    }
    td {
        font-family: SansSerif;
        font-size: 20px;
        color: brown;
    }
    tr:hover {background-color: #f5f5f5;}

</style>

<table style="width:50%">
    <tr>
        <th>Customer ID</th>
        <th>Name</th>
        <th>Email</th>
    </tr>
    <c:forEach var="customer" items="${customers}">
        <tr>
            <td>${customer.id }</td>
            <td>${customer.name }</td>
            <td>${customer.email }</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
