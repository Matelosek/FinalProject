<%--
  Created by IntelliJ IDEA.
  User: maciej
  Date: 05/05/2023
  Time: 23:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Rejestarcja użytkownika</title>
    <style>
      .error {
        color: red;
      }
    </style>
</head>
<body>
<h3>Rejestracja użytkownika</h3>

<form:form method="post" modelAttribute="user">

  <div>Imię: <form:input path="userName"/></div>
  <div>Nazwisko: <form:input path="surname"/></div>
    <div>Login: <form:input path="Login"/></div>
  <div>Email: <form:input path="Email"/></div>
  <div>Hasło (Przynajmniej 8 znaków): <form:input path="password"/></div>
  <input type="submit" value="Dodaj użytkownika">
</form:form>

</body>
</html>
