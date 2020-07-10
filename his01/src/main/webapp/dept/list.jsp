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
		<h1 class="dataContainer title">科室信息</h1>
		<form class="form-inline"
			action="${pageContext.request.contextPath}/dept/list.do"
			method="post">
			<div class="form-group">
				<input type="text" class="form-control" id="deptname" name="deptname"
					placeholder="请输入科室名称">
			</div>

			<button type="submit" class="btn btn-info">查询</button>
			<button type="button" class="btn btn-success"
				onclick="fAddDeptView()">新增</button>
		</form>

		<table class="table table-bordered table-striped " style="width: 80%">
			<thead>
				<tr>
					<th><input type="checkbox" id="qx"></th>
					<th>科室编号</th>
					<th>科室名称</th>
					<th>科室分类</th>
					<th>科室类型</th>
					<th>操作</th>
				</tr>

			</thead>
			<tbody>
				<c:forEach items="${page.pageData }" var="d">
					<tr>
						<td><input type="checkbox" name="all"></td>
						<td>${d.deptcode}</td>
						<td>${d.deptname }</td>
						<td>${d.ksfl}</td>
						<td>${d.kslx}</td>
						<td><a href="">修改</a> &nbsp;&nbsp;&nbsp; <a href="">删除</a></td>
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