<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ include file="header.jsp" %>
<html>
<head>
    <title>Task add form</title>
</head>
<body>

<h3>Dodaj nowe zadanie do swojej książki</h3>

<form:form method="post" modelAttribute="task">

    <div>Nazwa zadania: <form:input path="taskName"/></div>
    <div>Opis zadania: <form:input path="description"/></div>
    <div>Data wykonania: <form:input path="date"/></div>
    <div>Typ samolotu: <form:radiobutton path="airplaneType.id" items="${airplanes}" itemLabel="type" itemValue="id"/></div>
    <div>Znaki rejestracyjne samolotu: <form:input path="reqMarks"/></div>
    <div>Rodzaj zadania:
        WO: <form:radiobutton path="taskType"
                           value="WO"/>
        Usterka: <form:radiobutton path="taskType"
                             value="Usterka"/>
        Usługa warsztatowa: <form:radiobutton path="taskType"
                             value="Usługa warsztatowa"/></div>
    <input type="submit" value="Dodaj zadanie do swojej książki">
</form:form>

</body>
</html>
