<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>

</head>
<body>
<div class="container">
<div class="row">
<header class="text-success" style="height: 100px">
<div class="fs-1"> Online Shopping male</div>
</header>
</div>
<div class="row">
<%@include file="include/menu.jsp" %>
</div>
<div class="row">
<div class="col-9">
<article>
<div class="row">
<div class="col-4 p-2">
<jsp:include page="include/item.jsp" >
 <jsp:param name="hinhAnh" value="https://www.notebookcheck.net/fileadmin/_processed_/0/9/csm_Untitled_2_5_2a2aef7903.jpg"/>
 <jsp:param name="mota" value="Iphone 14"/>
</jsp:include>
</div>
<div class="col-4 p-2">
<jsp:include page="include/item.jsp" >
 <jsp:param name="hinhAnh" value="https://www.notebookcheck.net/fileadmin/_processed_/0/9/csm_Untitled_2_5_2a2aef7903.jpg"/>
 <jsp:param name="mota" value="Iphone 14"/>
</jsp:include>
</div>
<div class="col-4 p-2">
<jsp:include page="include/item.jsp" >
 <jsp:param name="hinhAnh" value="https://www.notebookcheck.net/fileadmin/_processed_/0/9/csm_Untitled_2_5_2a2aef7903.jpg"/>
 <jsp:param name="mota" value="Iphone 14"/>
</jsp:include>
</div>
</div>
<div class="row">
<div class="col-4 p-2">
<jsp:include page="include/item.jsp" >
 <jsp:param name="hinhAnh" value="https://www.notebookcheck.net/fileadmin/_processed_/0/9/csm_Untitled_2_5_2a2aef7903.jpg"/>
 <jsp:param name="mota" value="Iphone 14"/>
</jsp:include>
</div>
<div class="col-4 p-2">
<jsp:include page="include/item.jsp" >
 <jsp:param name="hinhAnh" value="https://www.notebookcheck.net/fileadmin/_processed_/0/9/csm_Untitled_2_5_2a2aef7903.jpg"/>
 <jsp:param name="mota" value="Iphone 14"/>
</jsp:include>
</div>
<div class="col-4 p-2">
<jsp:include page="include/item.jsp" >
 <jsp:param name="hinhAnh" value="https://www.notebookcheck.net/fileadmin/_processed_/0/9/csm_Untitled_2_5_2a2aef7903.jpg"/>
 <jsp:param name="mota" value="Iphone 14"/>
</jsp:include>
</div>
</div>
</article>

</div>
<div class="col-3">
<aside>
<jsp:include page="include/login.jsp"></jsp:include>
<br>
<jsp:include page="include/categori.jsp"></jsp:include>
</aside>
</div>
</div>
</div>

</body>
</html>