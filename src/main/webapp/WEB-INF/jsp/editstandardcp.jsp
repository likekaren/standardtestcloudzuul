<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<LINK rel="stylesheet" type="text/css"
	href="${baseurl}js/easyui/styles/default.css">
<%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
<link rel="stylesheet" type="text/css"
	href="${baseurl}/jEasyUIcustom/uimaker/easyui.css">
<link rel="stylesheet" type="text/css"
	href="${baseurl}/jEasyUIcustom/uimaker/icon.css">
<title>修改</title>
<script type="text/javascript">

	function goodssave() {
		jquerySubByFId('goodsform', goodssave_callback, null, "json");
	}
	
	//ajax调用的回调函数，ajax请求完成调用此函数，传入的参数是action返回的结果
	function goodssave_callback(data) {

		message_alert(data);
		//如果成功自动关闭
		if (data.resultInfo.type == "1") {
			// 设置延迟关闭
			setTimeout("close()",1000);
		}
	}
	
	//回显页面
	function close(){
		if(parent.parent.parent){
			parent.location = '${baseurl}standardtest/makestandard.action';
		}
	}
	
</script>
</head>
<body>
	<form id="goodsform" action="${baseurl}standardtest/editstandardcpsubmit.action?id=${standardcpCustom.id}"
		method="post">
		<!-- 更新用户的id -->
		<input type="hidden" name="standardcpCustom.id" value="${standardcpCustom.id}" />
		<TBODY>
			<table cellpadding="5">
				<tr>
					<td>标准编号:</td>
					<td><input class="easyui-textbox" type="text"
						name="standardcpCustom.sid" value="${standardcpCustom.sid}"
						style="height: 35px;" id="auto"></input></td>
					<td>标准名称:</td>
					<td><input class="easyui-textbox" type="text" required
						name="standardcpCustom.sname" value="${standardcpCustom.sname}"
						style="height: 35px;"></input></td>

					<td>负责人:</td>
					<td><input class="easyui-textbox" type="text" required
						name="standardcpCustom.muser" value="${standardcpCustom.muser}"
						style="height: 35px;"></input></td>
					
				</tr>
				<tr>
 					<td>附件:</td>
 					<td><input type="file" name="ex1" value="ex1">
    				</td>
     			</tr>
				<tr>
					<td colspan=4 align=right class=category><a id="submitbtn"
						style="margin-left: 100px" class="easyui-linkbutton"
						iconCls="icon-ok" href="#" onclick="goodssave()">保存</a> <a
						id="closebtn" style="margin-left: 100px" class="easyui-linkbutton"
						iconCls="icon-cancel" href="#" onclick="parent.closemodalwindow()">取消</a>
					</td>
				</tr>
			</table>
	</form>
</body>
</html>