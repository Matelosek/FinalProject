<%--
  Created by IntelliJ IDEA.
  User: maciej
  Date: 05/05/2023
  Time: 23:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Logowanie</title>
</head>
<body>
<body>
<h1>Logowanie</h1>
<form method="POST" action="/login">
  Login: <input type="text" name="login">
  Password: <input type="password" name="password">
  <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
  <input type="submit" value="Zaloguj">
</form>
</body>
</body>
</html>
