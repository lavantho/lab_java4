<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
Họ tên :${bean.fullname} <br>
Ngày sinh ${bean.ngaysinh}<br>
Giới tính ${bean.gender }<br>
Quốc tịch : ${bean.country}<br>
Tình trạng hôn nhân : ${bean.married }<br>
Sở thích : ${sothich}<br>
Ghi chú :  ${bean.note}
</body>
</html>