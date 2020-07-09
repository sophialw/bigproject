<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.5.1.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/role/js/list.js"></script>
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

        <table class="table table-bordered table-striped" style="width:80%" >
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
        				&nbsp;&nbsp;&nbsp;
        				<a href="javascript:fshowMenuView(${r.roleid},'${r.rolename }')">查看权限</a>
        				&nbsp;&nbsp;&nbsp;
        				<a href="javascript:fNoUsedMenuView(${r.roleid},'${r.rolename }')">添加权限</a>
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


    <!-- 查看权限管理模态框 begin -->
    <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
	  <div class="modal-dialog" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	        <h4 class="modal-title" id="myModalLabel">权限管理</h4>
	      </div>
	      <div class="modal-body">
	        <h5>当前角色名称：<span id="modal_rolename" style="color:blue;"></span>
	         </h5>
	        <table class="table table-bordered">
	        	<thead>
	        		<tr>
	        			<th>权限名称</th>
	        			<th>请求路径</th>
	        			<th>操作</th>
	        		</tr>
	        	</thead>
	        	<tbody id="menu_data">
	        		
	        	</tbody>
	        </table>
	      </div>
	      
	    </div>
	  </div>
	</div>
    
    
    <!-- 查看权限管理模态框 end-->
    
    
     <!-- 添加权限模态框 begin -->
    <div class="modal fade" id="addRoleMenuModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
	  <div class="modal-dialog" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	        <h4 class="modal-title" id="myModalLabel">添加权限</h4>
	      </div>
	      <div class="modal-body">
	        <h5>当前角色名称：<span id="addRole_modal_rolename" style="color:blue;"></span>
	         </h5>
	        <table class="table table-bordered">
	        	<thead>
	        		<tr>
	        			<th>权限名称</th>
	        			<th>请求路径</th>
	        			<th>操作</th>
	        		</tr>
	        	</thead>
	        	<tbody id="add_menu_data">
	        		
	        	</tbody>
	        </table>
	      </div>
	      
	    </div>
	  </div>
	</div>
    
    
    <!-- 添加权限模态框 end-->

</body>
</html>