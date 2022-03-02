<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="index" method="POST">
<h1>send mail</h1>
<label>From :</label>
<input type="text" name="from">
<br>
<label>to :</label>
<input type="text" name="to">
<br>
<label>Subject</label>
<input type="text" name="subject">
<br>
<label>Body</label>
<textarea rows="" cols="" name="body"></textarea>
<button >Gửi</button></form>

</body>
</html>