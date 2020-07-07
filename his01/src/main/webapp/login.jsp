<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>东软云his--用户登录</title>
<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="css/login.css">
<link rel="stylesheet" href="css/common.css">
</head>
<body>
<div id="logindiv">
 <h3>东软云his系统用户登录</h3>
<form class="form-horizontal" action="" method="post">
  <div class="form-group">
    <label for="inputEmail3" class="col-sm-3 control-label">用户名</label>
    <div class="col-sm-9">
      <input type="text" class="form-control" id="inputEmail3" placeholder="请输入用户名">
    </div>
  </div>
  <div class="form-group">
    <label for="inputPassword3" class="col-sm-3 control-label">密码</label>
    <div class="col-sm-9">
      <input type="password" class="form-control" id="inputPassword3" placeholder="请输入密码">
    </div>
  </div>
  <div class="form-group">
    <div class="col-sm-offset-3 col-sm-9">
      <div class="checkbox">
        <label>
          <input type="checkbox"> 记住密码
        </label>
      </div>
    </div>
  </div>
  <div class="form-group">
    <div class="col-sm-offset-4 col-sm-8">
      <button type="submit" class="btn btn-success">登录</button>
       <button type="reset" class="btn btn-info">取消</button>
    </div>
  </div>
</form>
</div>
</body>
</html>