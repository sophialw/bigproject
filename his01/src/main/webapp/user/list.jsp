<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-3.5.1.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/common.css">
</head>
<body>
<div class="dataContainer">
		<h1 class="dataContainer title">用户信息</h1>
		<form class="form-inline"
			action="${pageContext.request.contextPath}/user/list.do"
			method="post">
			<div class="form-group">
				<input type="text" class="form-control" id="username" name="username"
					placeholder="请输入用户名">
			</div>
			<div class="form-group">
				<input type="text" class="form-control" id="realname" name="realname"
					placeholder="请输入姓名">
			</div>
			
			<button type="submit" class="btn btn-info">查询</button>
			<button type="button" class="btn btn-success"
				onclick="fAddDeptView()">新增</button>
		</form>

		<table class="table table-bordered table-striped " style="width: 80%">
			<thead>
				<tr>
					<th><input type="checkbox" id="qx"></th>
					<th>用户名</th>
					<th>姓名</th>
					<th>用户类型</th>
					<th>所在科室</th>
					<th>职称</th>
					<th>是否排班</th>
					<th>操作</th>
				</tr>

			</thead>
			<tbody>
				<c:forEach items="${page.pageData }" var="u">
					<tr>
						<td><input type="checkbox" name="all"></td>
						<td>${u.username}</td>
						<td>${u.realname }</td>
						<td>${u.yhlx}</td>
						<td>${u.deptname}</td>
						<td>${u.yszc}</td>
						<td>${u.isscheduling == 1?"是":"否"}</td>
						<td><a href="">修改</a> &nbsp;&nbsp;&nbsp; <a href="">删除</a>
						 &nbsp;&nbsp;&nbsp; <a href="">查看角色</a>
						 &nbsp;&nbsp;&nbsp; <a href="">设置角色</a>
						 </td>
					</tr>

				</c:forEach>

			</tbody>
		</table>
		<div>
			<a href="">首页</a> <a href="">下一页</a> <a href="">上一页</a> <a href="">末页</a>
			当前第${page.currentPage } 页，总共${page.totalPage }页

		</div>

	</div>

</body>
</html>