/**
 * 点击设置角色按钮按钮的事件
 */

function fsetRoleview(username,userid){
	$("#userid").val(userid);
	$("#modal_username").text(username);
//	alert(username+","+userid)
//	异步请求，获取所有的角色列表
	$.ajax({
		url:"/his01/role/findAllRoles.do",
		type:"post",
		success:function(roles){
			$("#role_data").children().remove();
			for(var i=0;i<roles.length;i++){
				var r = roles[i];
				var tr =$("<tr></tr>");
				var td = $("<td><input type='radio' name='rolename' value="+r.roleid+">&nbsp;&nbsp;&nbsp;"+r.rolename+"</td>");
				tr.append(td);
				$("#role_data").append(tr);
			}
			
			
			$("#setRoleModal").modal("show");
		},
		error:function(){
			
			alert("服务端出错！")
		}
		
	})
	
	
	
}

/**
 * 点击设置按钮， 完成用户角色的添加
 */
function fsaveUserRole(){
	
	//获取单选按钮组中选中项的值
	var roleid = $("input[name='rolename']:checked").val();
    //获取用户id
	var userid = $("#userid").val();
	
	$.ajax({
		url:"/his01/role/addUserRole.do",
		type:"post",
		data:{"userid":userid,"roleid":roleid},
		success:function(d){
			if(d == "ok"){
				alert("角色设置成功！");
				window.location.reload();
			}
		},
		error:function(){
			
			alert("服务端出错！")
		}
		
	})
	
}