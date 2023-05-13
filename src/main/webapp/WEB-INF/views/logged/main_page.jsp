<%--
  Created by IntelliJ IDEA.
  User: maciej
  Date: 05/05/2023
  Time: 23:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="header.jsp" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Wszystkie zadania</h1>
<table>
  <tr>
    <th>Typ samolotu</th>
    <th>Nazwa zadania</th>
    <th>Dodaj zadanie do swojej książki mechanika</th>
    <th>Usuń zadanie</th>
  </tr>
  <c:forEach items="${tasks}" var="task">
    <tr>
      <td>${task.airplaneType.type}</td>
      <td>${task.taskName}</td>
      <td><a href="addToYourBook/${task.id}">Dodaj </a></td>
      <td><a href="deleteTask/${task.id}" onclick="return confirm('Are you sure?')">Usuń </a></td>
    </tr>
  </c:forEach>
</table>
</body>
</html>
