<%--
  Created by IntelliJ IDEA.
  User: Dasha
  Date: 10.04.2015
  Time: 17:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title></title>
</head>
<body>
Hello!
<div><a href="/event/1">Show event info!</a></div>
<p><a href="/index">Show headers</a></p>

<c:forEach items="${headers}" var="h">
    <c:out value="${h}"/>
</c:forEach>

<p>${var}</p>

</body>
</html>
