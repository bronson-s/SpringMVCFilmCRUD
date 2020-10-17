<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Added film</title>
</head>
<body>
<c:choose>
    <c:when test="${! empty film}">

    <p>film added</p>
    </c:when>
    <c:otherwise>
      <p>film not added</p>
    </c:otherwise>
  </c:choose>
</body>
</html>