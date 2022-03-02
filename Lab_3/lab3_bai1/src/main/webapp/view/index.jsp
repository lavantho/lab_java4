<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="index.php" method="POST" enctype="multipart/form-data">
<label>Hình ảnh</label>
<input type="file" name="photo_file" />
<br>
<label>Tài liệu</label>
<input type="file" name="doc_file"/>
<br>
<hr>
<button type="submit">Upload</button> 
</form>
</body>
</html>