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

			<!-- 查询列表 -->
			<TABLE border=0 cellSpacing=0 cellPadding=0 width="99%" align=center>
	

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
			action="${baseurl}standardtest/deletestandardcp.action" method="post">
			<input type="hidden" id="delete_id" name="id" />
		</form>
		<form id="submittestresultform"
			action="${baseurl}standardtest/submitcargm.action" method="post">
			<input type="hidden" id="submityt_tid" name="tid" />
		</form>
		
</body>
<script type="text/javascript">
/* window.onload = function(){
	   window.location.reload();
	   
	}; */

	//datagrid列定义
	var columns_v = [ [
			{
				field : 'sfid',//对应json中的key
				title : '身份证',
				width : 135
			},
			
			{
				field : 'cid',//对应json中的key
				title : '车牌号 ',
				width : 150
			}, 
			
			 {
				field : 'state',//对应json中的key
				title : '状态',
				width : 135
			}, 
			{
				field : 'name',//对应json中的key
				title : '姓名',
				width : 70
			},
			{
				field : 'age',//对应json中的key
				title : '年龄',
				width : 70
			},
			{
				field : 'sex',//对应json中的key
				title : '性别',
				width : 70
			},
			{
				field : 'ttime',//对应json中的key
				title : '测试时间',
				width : 135
			},
			{
				field : 'opt0',
				title : '操作',
				width : 105,
				formatter : function(value, row, index) {
					return "<a href=javascript:openyeart('" + row.tid
							+ "')>查看详情</a>";
				}
			},
			
			
			{
				field : 'opt3',
				title : '提交车管所',
				width : 105,
				formatter : function(value, row, index) {
					return "<a href=javascript:submitcargm('" + row.tid
							+ "')>提交车管所</a>";
				}
			
			} ,
			
			] ];

	//datagrid 加载数据
	$(function() {
		$('#goodslist').datagrid({
			title : '年审检测信息',//数据列表标题
			nowrap : true,//单元格中的数据不换行，如果为true表示不换行，不换行情况下数据加载性能高，如果为false就是换行，换行数据加载性能不高
			striped : true,//条纹显示效果
			url : '${baseurl}standardtest/yeart_hege.action',//加载数据的连接，引连接请求过来是json数据
			idField : 'id',//此字段很重要，数据结果集的唯一约束(重要)，如果写错影响 获取当前选中行的方法执行
			loadMsg : '',
			columns : columns_v,
			pagination : true,//是否显示分页
			rownumbers : true,//是否显示行号
			pageList : [ 18, 30, 45 ],
		});
	});

	//查询方法
	function querygoods2qu() {
		//datagrid的方法load方法要求传入json数据，最终将 json转成key/value数据传入action
		//将form表单数据提取出来，组成一个json
		var formdata = $("#goodsqueryForm").serializeJson();
		$('#goodslist').datagrid('load', formdata);
	}

	//删除方法
	function deletestandardcp(id) {
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
	function addstandardcp() {
		createmodalwindow("添加符合性测试标准", 850, 350,
				'${baseurl}standardtest/addstandardcp.action');
	}
	
	//出库
	function outgoods2(id) {
		createmodalwindow("出库", 850, 350,
				'${baseurl}goodssystem/outgoods2.action?id=' + id);
	}
	//修改商品信息
	function opentestctv(tid) {
		//打开修改窗口
		createmodalwindow("修改商品信息", 900,350,
				'${baseurl}standardtest/opentestctv.action?tid=' + tid);
	}
	//查看标准信息
	function openyeart(tid) {
		//打开信息窗口
		createmodalwindow("年审检测", 1000,350,
				'${baseurl}standardtest/openyeart.action?tid=' + tid);
	}
	
	//提交标准进行符合性测试
	
	function submitcargm(tid) {
		//第一个参数是提示信息，第二个参数，取消执行的函数指针，第三个参是，确定执行的函数指针
		_confirm('您确认提交吗？', null,
				function() {

					//将要删除的id赋值给deleteid，deleteid在goodsdeleteform中
					$("#submityt_tid").val(tid);
					//使用ajax的from提交执行删除
					//goodsdeleteform：form的id，goodsdel_callback：删除回调函数，
					//第三个参数是url的参数
					//第四个参数是datatype，表示服务器返回的类型
					jquerySubByFId('submittestresultform', submittest_callback, null,
							"json");
				});
	}
	function submitytr(id) {
		//第一个参数是提示信息，第二个参数，取消执行的函数指针，第三个参是，确定执行的函数指针
		_confirm('您确认提交吗？', null,
				function() {

					//将要删除的id赋值给deleteid，deleteid在goodsdeleteform中
					$("#submitytr_id").val(id);
					//使用ajax的from提交执行删除
					//goodsdeleteform：form的id，goodsdel_callback：删除回调函数，
					//第三个参数是url的参数
					//第四个参数是datatype，表示服务器返回的类型
					jquerySubByFId('submittestresult2form', submittest_callback, null,
							"json");
				});
	}
	//回调
	function submittest_callback(data) {
		
		message_alert(data);
		//如果成功自动关闭
		if (data.resultInfo.type == "1") {
			// 设置延迟关闭
			setTimeout("close()",1000);
		}
	}
	
	//回显页面
	function close(tid){
		/* var sid = ${standardcpCustom.sid}; */
		if(parent.parent.parent){
			
			setTimeout("querygoods2qu()", 1000);
		}
	}
	
	$('#goodslist').datagrid({
		rowStyler:function(index,row){
			if (row.state=='不合格'){
				return 'background-color:pink;color:blue;font-weight:bold;';
			}
		}
	});
	
</script>

</html>