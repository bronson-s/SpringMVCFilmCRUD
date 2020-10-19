<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<link rel="stylesheet" href="main.css">
</head>
<body>

  <form action="updatedFilm.do" method="POST">
     <input type= "hidden" value="${film.id}" name="id">
    Title:
    <input type="text" name="title"/> <br>
    Description:
    <input type="text" name="description"/> <br>

    
    <input type="submit" value="Update Film " />
  </form>
</body>
</html>