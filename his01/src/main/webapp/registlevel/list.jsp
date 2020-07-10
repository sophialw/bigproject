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
		<h1 class="dataContainer title">挂号级别管理</h1>
		<form class="form-inline"
			action="${pageContext.request.contextPath}/registlevel/list.do"
			method="post">
			<div class="form-group">
				<input type="text" class="form-control" id="registname" name="registname"
					placeholder="请输入挂号级别名称">
			</div>

			<button type="submit" class="btn btn-info">查询</button>
			<button type="button" class="btn btn-success"
				onclick="fAddRregistlevelnameView()">新增</button>
		</form>

		<table class="table table-bordered table-striped " style="width: 80%">
			<thead>
				<tr>
					<th><input type="checkbox" id="qx"></th>
					<th>挂号级别编码</th>
					<th>挂号级别名称</th>
					<th>挂号限额</th>
					<th>显示顺序</th>
					<th>挂号费</th>
					<th>操作</th>
				</tr>

			</thead>
			<tbody>
				<c:forEach items="${page.pageData }" var="m">
					<tr>
						<td><input type="checkbox" name="all"></td>
						<td>${m.registcode }</td>
						<td>${m.registname }</td>
						<td>${m.registquota}</td>
						<td>${m.sequenceno}</td>
						<td>${m.registfee}</td>
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