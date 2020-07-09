/**
 * 
 */

/*
 * 查看指定角色的权限菜单列表
 * 
 * */
function fshowMenuView(roleid,rolename){
   
	//异步获取指定角色的所有的权限，
	$.ajax({
		url:"/his01/menu/findMenuByRoleid.do",
		type:"post",
		data:{"roleid":roleid},
		success:function(menus){
			//将menu_data中的所有tr删除
//			$("#menu_data").find("tr").remove();
			
			//将menu_data中的所有子节点删除
			$("#menu_data").children().remove();
			if(menus.length != 0){
				//首先清空menu_data中原有的数据
				
				//填充到弹框中tbody中
				for(var i=0;i<menus.length;i++){
					var m = menus[i];
					//创建tr， td填充内容， 填充到tbody
					var tr = $("<tr></tr>");
					var td1 = $("<td>"+m.mname+"</td>");
					var td2 = $("<td>"+m.url+"</td>");
					var td3 = $("<td><a href='javascript:fdeleteRoleMenu("+m.menuid+","+roleid+")'>删除</a></td>");
					tr.append(td1);
					tr.append(td2);
					tr.append(td3);
					$("#menu_data").append(tr);
				}
			} else{
				//alert("当前角色没有设置权限！")
				
				var tr = $("<tr><td colspan='3' align='center' style='color:red;'>当前角色没有设置权限！</td></tr>");
				$("#menu_data").append(tr);
			}
		},
		error:function(){
			alert("服务端出错！")
		}
	})
	
	//将弹窗显示	
	$("#modal_rolename").text(rolename);
	

	$('#myModal').modal('show');
	
}


/*
 * 删除查看指定角色的当前权限
 * 
 * */
function fdeleteRoleMenu(menuid, roleid){
	var t = confirm("您确定要删除此权限菜单吗？");
	var rolename = $("#modal_rolename").text();
	if(t){
		$.ajax({
			url:"/his01/menu/deleteRoleMenu.do",
			type:"post",
			data:{"menuid":menuid,"roleid":roleid},
			success:function(data){
				if(data =="ok"){
					alert("权限删除成功！");
					window.location.reload();

					
				}
			},
			error:function(){
				alert("服务端出错！")
			}
			
		})
		
	}
}

/*
 * 查看当前角色没有使用的权限列表
 * @param roleid
 * @param rolename
 * @returns
 */
function fNoUsedMenuView(roleid, rolename){

	$.ajax({
		url:"/his01/menu/findNoUsedMenu.do",
		type:"post",
		data:{"roleid":roleid},
		success:function(menus){
			//清除原有数据
			$("#add_menu_data").children().remove();
			for(var i=0;i<menus.length;i++){
				var m = menus[i];
				var tr = $("<tr></tr>");
				var td1 = $("<td>"+m.mname+"</td>");
				var td2 = $("<td>"+m.url+"</td>");
				id="btn"+i;
				var td3 = $("<td></td>");
				var btn = $("<button  type='button' id="+id+"  class='btn btn-info' onclick='fsetRoleMenu("+m.menuid+","+roleid+","+i+")'>设置</button>")
				td3.append(btn);
				tr.append(td1);
				tr.append(td2);
				tr.append(td3);
				$("#add_menu_data").append(tr);
			}
			//将弹窗显示	
			$("#addRole_modal_rolename").text(rolename);
			

			$('#addRoleMenuModal').modal('show');
		},
		error:function (){
			alert("服务端出错！")
		}
	})
}

/**
 * 设置权限
 * @param menuid
 * @param roleid
 * @returns
 */
function fsetRoleMenu(menuid, roleid,i){
	//一旦点击了设置按钮， 则当前按钮不可用
	$("#btn"+i).attr("disabled","disabled");

	$.ajax({
		url:"/his01/menu/addRoleMenu.do",
		type:"post",
		data:{"menuid":menuid,"roleid":roleid},
		success:function(data){
			if(data == "ok"){
				alert(e.target)
				alert("设置成功！");
				
			}
		},
		error:function (){
			alert("服务端出错！")
		}
	})
}