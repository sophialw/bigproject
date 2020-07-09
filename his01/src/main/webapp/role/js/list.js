/**
 * 
 */

function fshowMenuView(roleid,rolename){
   
	//异步获取指定角色的所有的权限，
	$.ajax({
		url:"/his01/menu/findMenuByRoleid.do",
		type:"post",
		data:{"roleid":roleid},
		success:function(menus){
			if(menus.length != 0){
				//填充到弹框中tbody中
				for(var i=0;i<menus.length;i++){
					var m = menus[i];
					//创建tr， td填充内容， 填充到tbody
				}
			} else{
				alert("当前角色没有设置权限！")
			}
		},
		error:function(){
			alert("服务端出错！")
		}
	})
	
	
	
	
	
	//将弹窗显示
	
//	$("#modal_rolename").text(rolename);
//	$('#myModal').modal('show');
	
	
}