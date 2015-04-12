<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>

</head>
<body>

<div>
  <c:forEach items="${guests}" var="guest">
    <c:out value="${guest.name}"/>
  </c:forEach>
</div>

<div>
  <form action="guest" method="post">
    <label> Set name:</label>
    <input type="text" name="name">
    <br>
    <button type="submit">Save</button>
  </form>
</div>

<a href="/event/1">back to event</a>
</body>
</html>