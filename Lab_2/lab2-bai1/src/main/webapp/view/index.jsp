<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Tam Giác</h1>
<form action="Form.php" method="POST">
<label>Cạnh a </label>
<input type="text" name="a"><br>
<label>Cạnh b</label>
<input type="text" name="b"><br>
<label>Cạnh c</label>
<input type="text" name="c"><br>


<hr>
<button type="submit" name="dientich">Dien tich</button>
<button type="submit" name="chuvi">Tinh chu vi</button>
</form>

<h4>${data}</h4>
<h4>${error}</h4>
</body>
</html>