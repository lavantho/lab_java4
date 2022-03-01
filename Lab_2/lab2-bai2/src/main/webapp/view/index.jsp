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
<input type="text" name="user">
<br>
<label>Mật khẩu</label>
<input type="password" name="passwd">
<br>
<label>Giới tính</label>
<input type="radio" value="nam" name="1"> <label>Nam</label>
<input type="radio" value="nu" name="1"> <label>Nữ</label>
<br>
<input type="checkbox" name="giadinh" value="true"> <label>Đã có gia đình?</label>
<br>
<label>Quốc tịch</label>
<select name="quoctich">
<option value="null">Chọn quốc tịch</option>
<option value="vn">Việt Nam</option>
<option value="us">US</option>
<option value="uk">UK</option>
<option value="kr">Korean</option>
</select>
<br>
<label>Ghi chú</label>
<textarea rows="" cols="" name="ghichu"></textarea>
<button type="submit">Gửi</button>
</form>
</body>
</html>