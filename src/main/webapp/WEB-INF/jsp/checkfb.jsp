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
<title>审核发标</title>
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
			parent.location.reload();
		}
	}
	
</script>
</head>
<body>
	<form id="goodsform" action="${baseurl}standardtest/checkfbsubmit.action"
		method="post">
		<!-- 更新用户的id -->
		<input type="hidden" name="cargmCustom.id" value="${cargmCustom.id}" />
		<TBODY>
			<table cellpadding="5">
				<tr>
					<td>审核结果:</td>
					<td>
					<%-- <input class="easyui-textbox" type="text"
						name="cargmCustom.ex1" value="${cargmCustom.ex1}"
						style="height: 35px;" id="auto"></input> --%>
					<select required name="cargmCustom.ex1" style="width:162px; height: 35px;">
							 <option value="">--请选择--</option>
							 <option value="通过">通过</option>
  							 <option value="不通过">不通过</option>
					</select>	
					</td>
					<td>标号:</td>
					<td><input class="easyui-textbox" type="text" 
						name="cargmCustom.ex2" value="${cargmCustom.ex2}"
						style="height: 35px;"></input></td>

					
					
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