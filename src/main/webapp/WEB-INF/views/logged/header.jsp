<%--
  Created by IntelliJ IDEA.
  User: maciej
  Date: 05/05/2023
  Time: 23:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Twoja książka mechanika</title>
</head>
<body>
<header>
    <nav>
        <ul>
            <li><a href="/main_page">Strona główna</a></li>
            <li><a href="#">Twoja książka mechanika</a></li>
            <li><a href="/addTask">Dodaj nowe zadanie do książki mechanika</a></li>
            <li><a href="#">Zmień dane</a></li>
            <li><a href="#">Zmień hasło</a></li>
            <li><form action="<c:url value="/title_page"/>" method="post">
                <input class="fa fa-id-badge" type="submit" value="Wyloguj">
                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
            </form></li>
        </ul>
    </nav>
</header>
</body>
</html>
