<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>云his系统-后台主页</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/common.css">

</head>
<body>
<%@ include file="header.jsp" %>
<%@ include file="left.jsp" %>
<iframe  class="main" name="main" src="welcome.jsp" frameborder="no" width="100%" height="100%"></iframe>

</body>
</html>