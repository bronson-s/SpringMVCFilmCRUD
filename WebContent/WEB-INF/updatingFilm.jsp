<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

     <form action="updatingFilm.do" method="POST">
    Title:
    <input type="text" name="title"/> <br>
    Description:
    <input type="text" name="description"/> <br>
    Release year:
    <input type="text" name="releaseYear"/> <br> 
    Language id:
    <input type="text" name="languageId"/> <br>
    Rental duration:
    <input type="text" name="rentalDuration"/> <br>
    Rental rate:
    <input type="text" name="rentalRate"/> <br>
    Length:
    <input type="text" name="length"/> <br>
    Replacement cost:
    <input type="text" name="replacementCost"/> <br>
    Rating:
    <input type="text" name="rating"/> <br> 
    Special features:
    <input type="text" name="specialFeatures"/> <br>
    
    <input type="submit" value="Update Film " />
  </form>
</body>
</html>