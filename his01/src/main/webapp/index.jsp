<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>云his系统-后台主页</title>
<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="css/common.css">

</head>
<body>
<ul>
	<c:forEach items="${menus }" var="m">
		<li><a href="${m.url }"><i class="${m.icon }"></i> &nbsp;${m.mname }</a>
	</c:forEach>

</ul>
</body>
</html>