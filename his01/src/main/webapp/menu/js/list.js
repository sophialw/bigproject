/**
 * 
 */

function fAddRoleView(){
	$("#addRoleModal").modal("show");
}

function doAddMenu(){
//	var mname = $("#mname").val();
//	var url= $("#url").val();
	$.ajax({
		url:"/his01/menu/addMenu.do",
		type:"post",
		data: $('#addMenuForm').serialize(),
		success:function(d){
			if(d == "ok"){
				alert("权限添加成功！")
				window.location.reload();
			}
			
		},
		error:function(){
			alert("error")
		}
//		data:{"mname":mname,}
	})
	
}