<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>

</head>
<body>

<div>
    Event: <c:out value="${event.name}"/>
</div>

<div>
    <c:forEach items="${guests}" var="guest">
        <p><c:out value="${guest.name}"/></p>
    </c:forEach>
</div>

<a href="/guest">Show guests!</a>

</body>
</html>