<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/common.css">
</head>
<body>

	<div class="dataContainer">
		<h1 class="dataContainer title">权限信息</h1>
		<form class="form-inline" action="${pageContext.request.contextPath}/menu/list.do" method="post">
			<div class="form-group">
				 <input type="text"
					class="form-control" id="rolename" name="mname" placeholder="请输入权限角色名称">
			</div>
			
			<button type="submit" class="btn btn-info">查询</button>
			<button type="button" class="btn btn-success">新增</button>
		</form>

        <table class="table table-bordered table-striped " style="width:80%"  >
        	<thead>
        		<tr>
        			<th><input type="checkbox" id="qx" ></th>
        			<th>权限名称</th>
        			<th>请求路径</th>
        			<th>图标</th>
        			<th>状态</th>
        			<th>操作</th>
        		</tr>
        	
        	</thead>
        	<tbody>
        		<c:forEach items="${page.pageData }" var="m">
        			<tr>
        				<td><input type="checkbox" name="all" ></td>
        				<td>${m.mname }</td>
        				<td>
        					${m.mname }
        				</td>
        				<td>${m.icon}</td>
        				<td>
        				<c:if test="${m.delmark eq 0 }">
        						<span style="color:green;">可用</span>
        				</c:if>
        				
        				<c:if test="${m.delmark ne 0 }">
        						<span style="color:red;">不可用</span>
        				</c:if>
        				</td>
        				<td>
        				<a href="">修改</a>
        				&nbsp;&nbsp;&nbsp;
        				<a href="">删除</a>
        				</td>
        			</tr>
        			
        		</c:forEach>
        	
        	</tbody>
        </table>
        <div> 
         <a href="">首页</a>
         <a href="">下一页</a> 
         <a href="">上一页</a> 
         <a href="">末页</a>
         当前第${page.currentPage } 页，总共${page.totalPage }页
         
         </div>
        
	</div>




</body>
</html>