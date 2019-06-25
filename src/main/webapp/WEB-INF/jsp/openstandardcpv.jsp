<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet" type="text/css"
	href="${baseurl}/css/jquery.grid.css" />
<link rel="stylesheet" type="text/css"
	href="${baseurl}/jEasyUIcustom/uimaker/easyui.css">
<link rel="stylesheet" type="text/css"
	href="${baseurl}/jEasyUIcustom/uimaker/icon.css">
<link rel="stylesheet" type="text/css"
	href="${baseurl}css/skin_/table.css" />
<title>查询商品列表</title>
</head>
<body> 
<div id="main">
		<!-- html的静态布局 -->
		<form id="goodsqueryForm">
			<!-- 查询条件 -->
			<TABLE class="table_search">
				<TBODY>
				
					<TR>
					
						
						<td><INPUT type="hidden" name="standardcpvCustom.sid"  value="${standardcpvCustom.sid}" style="width:120px; height=100px"/></TD>
						<!-- <TD class="left">标准名称：</TD>
						<td><INPUT type="text" name="standardlistCustom.sname" style="width:120px; height=100px"/></TD> -->

						
			
						</select>
						</TD>
						<td>
							<!-- <div class="search-button">
								<input class="button" onclick="querygoods2qu()" type="button"
									value="搜索一下" />
							</div> -->
						
					
				</TBODY>
			</TABLE>
			<!-- 查询列表 -->
			<TABLE border=0 cellSpacing=0 cellPadding=0 width="99%" align=center>
				<div class="table">
					<div class="opt ue-clear">
				
						<span class="optarea"> <a href="javascript:addstandardcpv();"
					class="add"> <i class="icon"></i> <span class="text">添加</span>

					
						 <!-- </a> <a href="javascript:outgoods2();" class="statistics"> <i class="icon"></i>
								<span class="text">出库</span> -->
						</a>  
						</span>
					</div>
				</div>
				

				<TBODY>
					<TR>
						<TD>
							<table id="goodslist"></table>
						</TD>
					</TR>
				</TBODY>
			</TABLE>
		</form>	
			
			<form id="goodsdeleteform"
			action="${baseurl}standardtest/deletestandardcpv.action" method="post">
			<input type="hidden" id="delete_id" name="id" />
		</form>
</body>
<script type="text/javascript">
	//datagrid列定义
	var columns_v = [ [
			
			{
				field : 'projectname',//对应json中的key
				title : '项目名称',
				width : 250
			}, 
			
		
			{
				field : 'standardvalue',//对应json中的key
				title : '标准值（下限）',
				width : 135
			},
			{
				field : 'standardvalue2',//对应json中的key
				title : '标准值（上限）',
				width : 135
			},
			{
				field : 'unit',//对应json中的key
				title : '单位',
				width : 135
			},
			{
				field : 'types',//对应json中的key
				title : '标准描述',
				width : 135
			},
		
			{
				field : 'opt1',
				title : '删除',
				width : 105,
				formatter : function(value, row, index) {
					return "<a href=javascript:deletestandardcpv('" + row.id
							+ "')>删除</a>";
				}
			} ,{
				field : 'opt2',
				title : '修改',
				width : 105,
				formatter : function(value, row, index) {
					return "<a href=javascript:editstandardcpv('" + row.id
							+ "')>修改</a>";
				}
			
			} 
			] ];

	//datagrid 加载数据
	$(function() {
		$('#goodslist').datagrid({
			title : '符合性测试标准数据',//数据列表标题
			nowrap : true,//单元格中的数据不换行，如果为true表示不换行，不换行情况下数据加载性能高，如果为false就是换行，换行数据加载性能不高
			striped : true,//条纹显示效果
			url : '${baseurl}standardtest/standardcpv_result.action',//加载数据的连接，引连接请求过来是json数据
			idField : 'id',//此字段很重要，数据结果集的唯一约束(重要)，如果写错影响 获取当前选中行的方法执行
			loadMsg : '',
			columns : columns_v,
			pagination : true,//是否显示分页
			rownumbers : true,//是否显示行号
			pageList : [ 18, 30, 45 ],
			
		});querygoods2qu();
	});

	//查询方法
	function querygoods2qu() {
		//datagrid的方法load方法要求传入json数据，最终将 json转成key/value数据传入action
		//将form表单数据提取出来，组成一个json
		var formdata = $("#goodsqueryForm").serializeJson();
		$('#goodslist').datagrid('load', formdata);
	}

	//删除方法
	function deletestandardcpv(id) {
		//第一个参数是提示信息，第二个参数，取消执行的函数指针，第三个参是，确定执行的函数指针
		_confirm('您确认删除吗？', null,
				function() {

					//将要删除的id赋值给deleteid，deleteid在goodsdeleteform中
					$("#delete_id").val(id);
					//使用ajax的from提交执行删除
					//goodsdeleteform：form的id，goodsdel_callback：删除回调函数，
					//第三个参数是url的参数
					//第四个参数是datatype，表示服务器返回的类型
					jquerySubByFId('goodsdeleteform', goodsdel_callback, null,
							"json");
				});
	}
	//删除商品的回调
	function goodsdel_callback(data) {
		message_alert(data);
		//刷新 页面
		//在提交成功后重新加载 datagrid
		//取出提交结果
		var type = data.resultInfo.type;
		if (type == 1) {
			//成功结果
			//重新加载 datagrid
			setTimeout("querygoods2qu()", 1000);
		}
	}
	//添加符合性测试标准
	function addstandardcpv(sid) {
		
		createmodalwindow("符合性测试标准", 850, 350,
				'${baseurl}standardtest/addstandardcpv.action?sid=' + "${standardcpvCustom.sid}");
	}
	
	
	//修改
	function editstandardcpv(id) {
		//打开修改窗口
		createmodalwindow("修改商品信息", 900,350,
				'${baseurl}standardtest/editstandardcpv.action?id=' + id);
	}
	
</script>

</html>