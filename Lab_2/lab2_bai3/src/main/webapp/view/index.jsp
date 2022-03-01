<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Đăng ký</h1>
<form action="index.php" method="POST">
<label>Tên đăng nhập</label>
<input type="text" name="user"><br>
<label>Mật khẩu</label>
<input type="password" name="passwd"><br>
<label>Giới tính</label>
<input type="radio" value="nam" name="gt"> <label>Nam</label>
<input type="radio" value="nu" name="gt"> <label>Nữ</label>
<br>
<input type="checkbox" value="gd" name="gd"><label>Đã có gia đình</label>
<br>
<label>Quốc tịch</label>
<select name="quoctich">
<option value="null">Chọn quốc gia </option>
<option value="vn">Việt Nam</option>
<option value="us">Mỹ</option>
<option value="nga">Russia</option>
<option value="uca">Ukraina</option>
</select>
<br>
<label>Sở thích :</label>
<input type="checkbox" value="game" name="sothich"> <label>chơi Game</label>
<input type="checkbox" value="music" name="sothich"> <label>Nghe nhạc</label>
<input type="checkbox" value="dance" name="sothich"> <label>Múa</label>
<input type="checkbox" value="other" name="sothich"> <label>Khác</label>
<br>
<label>Ghi chú</label>
<textarea name="ghichu"></textarea>
<hr>
<input type="submit" value="Gửi">
</form>


</body>
</html>