<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <c:choose>
    <c:when test="${! empty film}">
      <ul>
      <c:forEach var="film" items="${film}">
        <li>${film.title}</li>
        <li>${film.description}</li>
        <li>${film.releaseYear}</li>
        <li>${film.languageId}</li>
        <li>${film.language}</li>
        <li>${film.rentalDuration}</li>
        <li>${film.rentalRate}</li>
        <li>${film.length}</li>
        <li>${film.replacementCost}</li>
        <li>${film.rating}</li>
        <li>${film.specialFeatures}</li>
       
        <li>   <form action="deleteFilm.do" method="POST">
    <input type= "hidden" value="${film.id}" name="id">
         <input type="submit" value="Delete Film" />
	</form> </li>
	
	<li><form action="updatingFilm.do" method="POST">
    <input type= "hidden" value="${film.id}" name="id">
         <input type="submit" value="Update Film" />
	</form></li>
     
     </c:forEach>
      </ul>
    </c:when>
    <c:otherwise>
      <p>No films found</p>
    </c:otherwise>
      </c:choose>
</body>
</html>