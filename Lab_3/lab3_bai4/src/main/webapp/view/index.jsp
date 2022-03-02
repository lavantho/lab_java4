<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Đăng nhập</h1>
<form action="index" method="POST">
<label for="tk">Tài khoản</label>
<input type="text" name="taikhoan" id="tk" value="${username}">
<br>
<label for="mk">Mật khẩu</label>
<input type="password" name="matkhau" id="mk" value="${password}"><br>
<input type="checkbox" id="remember" name="remember" > <label for="remember"> Nhớ tôi </label>
<hr>
<br>
<input type="submit" value="Đăng nhập">
<h2>${message }</h2>
</form>
</body>
</html>