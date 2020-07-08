<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../bootstrap/css/bootstrap.min.css">

</head>
<body>

	<div class="dataContainer">
		<h1 class="dataContainer title">角色信息</h1>
		<form class="form-inline" action="list.do" method="post">
			<div class="form-group">
				 <input type="text"
					class="form-control" id="rolename" name="rolename" placeholder="请输入角色名称">
			</div>
			
			<button type="submit" class="btn btn-info">查询</button>
			<button type="button" class="btn btn-success">新增</button>
		</form>

        <table class="table table-bordered table-striped">
        	<thead>
        		<tr>
        			<th><input type="checkbox" id="qx" ></th>
        			<th>角色名称</th>
        			<th>状态</th>
        			<th>操作</th>
        		</tr>
        	
        	</thead>
        	<tbody>
        		<c:forEach items="${page.pageData }" var="r">
        			<tr>
        				<td><input type="checkbox" name="all" ></td>
        				<td>${r.rolename }</td>
        				<td>
        				<c:if test="${r.delmark eq 0 }">
        						<span style="color:green;">可用</span>
        				</c:if>
        				
        				<c:if test="${r.delmark ne 0 }">
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