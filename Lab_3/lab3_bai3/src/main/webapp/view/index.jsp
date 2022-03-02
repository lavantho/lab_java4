<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="index" method="POST" enctype="multipart/form-data">
<label>Họ và tên :</label>
<input type="text" name="fullname">
<br>
<label>Ngày sinh</label>
<input type="text" name="ngaysinh">
<br>
<label>Ảnh</label>
<input type="file" name="image">
<label>Quốc tịch</label>
<select name="country">
<option value="us">Mỹ</option>
<option value="vn">Việt Nam</option>
<option value="nga">Nga</option>
<option value="uk">Ukraina</option>
<option value="chi">China</option>
</select>
<br>
<label>Giới tính</label>
<input type="radio" name="gender" value="nam"> <label>Nam</label>
<input type="radio" name="gender" value="nu"> <label>Nữ</label>
<br>
<label>Tình trạng hôn nhân</label>
<input type="checkbox" value="giadinh" name="married"> <label>đã có gia đình</label>
<br>
<label>Sở thích</label>
<input type="checkbox" value="docsach" name="hobbie"> <label>đọc sách</label>
<input type="checkbox" value="dulich" name="hobbie"> <label>du lịch</label>
<input type="checkbox" value="amnhac" name="hobbie"> <label>âm nhạc</label>
<input type="checkbox" value="khac" name="hobbie"> <label>khác</label>
<br>
<label>Ghi chú</label>
<textarea rows="" cols="" name="note"></textarea>
<br>
<hr>
<input type="submit" value="Gửi">
</form>

</body>
</html>