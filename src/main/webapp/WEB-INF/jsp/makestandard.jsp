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
<title>查询</title>
</head>
<body> 
<div id="main">
		<!-- html的静态布局 -->
		<form id="goodsqueryForm">
			<!-- 查询条件 -->
			<!-- <TABLE class="table_search">
				
			</TABLE> -->
			<!-- 查询列表 -->
			<TABLE border=0 cellSpacing=0 cellPadding=0 width="99%" align=center>
				<div class="table">
					<div class="opt ue-clear">
										<span class="optarea"> <a href="javascript:addstandardcp();"
					class="add"> <i class="icon"></i> <span class="text">添加</span>
						 
						
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
			action="${baseurl}standardtest/deletestandardcp.action" method="post">
			<input type="hidden" id="delete_id" name="id" />
		</form>
		<form id="submittestform"
			action="${baseurl}standardtest/submittest.action" method="post">
			<input type="hidden" id="submittest_id" name="id" />
		</form>
		
		
		<form id="resultList">
			<!-- 查询条件 -->
			<!-- <TABLE class="table_search">
				
			</TABLE> -->
			
				

				<TBODY>
					<TR>
						<TD>
							<table id="resultlist"></table>
						</TD>
					</TR>
				</TBODY>
			</TABLE>
		</form>	
			
			
		<form id="testdeleteform"
			action="${baseurl}standardtest/deletetestresult.action" method="post">
			<input type="hidden" id="testdelete_id" name="id" />
		</form>
		<form id="submittestform"
			action="${baseurl}standardtest/submittest.action" method="post">
			<input type="hidden" id="submittest_id" name="id" />
		</form>
		<form id="submitstandardresultform"
			action="${baseurl}standardtest/submitstandardresult.action" method="post">
			<input type="hidden" id="submitstandardresult_tid" name="tid" />
		</form>
		

</body>
<script type="text/javascript">
	//datagrid列定义
	var columns_v = [ [
			{
				field : 'sid',//对应json中的key
				title : '标准编号',
				width : 135
			},
			
			{
				field : 'sname',//对应json中的key
				title : '标准名称 ',
				width : 250
			}, 
			{
				field : 'muser',//对应json中的key
				title : '负责人',
				width : 100
			}, 
			{
				field : 'stime',//对应json中的key
				title : '时间',
				width : 135
			},
			{
				field : 'opt0',
				title : '操作',
				width : 105,
				formatter : function(value, row, index) {
					return "<a href=javascript:openstandardcpv('" + row.id
							+ "')>指标管理</a>";
				}
			},
			{
				field : 'opt5',
				title : '操作',
				width : 105,
				formatter : function (value, row, index){
					return "<a href=javascript:download('" + row.id
					+ "')>下载</a>";
				}
			}, 
			{
				field : 'opt1',
				title : '删除',
				width : 105,
				formatter : function(value, row, index) {
					return "<a href=javascript:deletestandardcp('" + row.id
							+ "')>删除</a>";
				}
			} ,{
				field : 'opt2',
				title : '修改',
				width : 105,
				formatter : function(value, row, index) {
					return "<a href=javascript:editstandardcp('" + row.id
							+ "')>修改</a>";
				} 
			},
			{
				field : 'opt3',
				title : '提交符合性测试',
				width : 105,
				formatter : function(value, row, index) {
					return "<a href=javascript:submittest('" + row.id
							+ "')>提交</a>";
				}
			
			} 
			] ];
	
	
	var columns_r = [ [
	       			{
	       				field : 'sid',//对应json中的key
	       				title : '标准编号',
	       				width : 135
	       			},
	       			
	       			{
	       				field : 'sname',//对应json中的key
	       				title : '标准名称 ',
	       				width : 250
	       			}, 
	       			/* {
	       				field : 'muser',//对应json中的key
	       				title : '负责人',
	       				width : 150
	       			},  */
	       			
	       		
	       			/* {
	       				field : 'state',//对应json中的key
	       				title : '状态',
	       				width : 135
	       			}, */
	       			{
	       				field : 'ttime',//对应json中的key
	       				title : '时间',
	       				width : 135
	       			},
	       			{
	    				field : 'opt5',
	    				title : '操作',
	    				width : 105,
	    				formatter : function (value, row, index){
	    					return "<a href=javascript:trdownload('" + row.id
	    					+ "')>下载</a>";
	    				}
	    			},
	       			{
	       				field : 'opt0',
	       				title : '操作',
	       				width : 105,
	       				formatter : function(value, row, index) {
	       					return "<a href=javascript:opentestvalue('" + row.tid
	       							+ "')>查看测试结果</a>";
	       				}
	       			},
	       			{
	       				field : 'opt1',
	       				title : '删除',
	       				width : 105,
	       				formatter : function(value, row, index) {
	       					return "<a href=javascript:deletetestresult('" + row.id
	       							+ "')>删除</a>";
	       				}
	       			} ,{
	       				field : 'opt2',
	       				title : '修改',
	       				width : 105,
	       				formatter : function(value, row, index) {
	       					return "<a href=javascript:edittestresult('" + row.id
	       							+ "')>修改</a>";
	       				} 
	       			},
	       			{
	       				field : 'opt3',
	       				title : '标准发布',
	       				width : 105,
	       				formatter : function(value, row, index) {
	       					return "<a href=javascript:submitstandardresult('" + row.tid
	       							+ "')>标准发布</a>";
	       				}
	       			
	       			} 
	       			] ];

	//datagrid 加载数据
	$(function() {
		$('#goodslist').datagrid({
			title : '符合性测试标准',//数据列表标题
			nowrap : true,//单元格中的数据不换行，如果为true表示不换行，不换行情况下数据加载性能高，如果为false就是换行，换行数据加载性能不高
			striped : true,//条纹显示效果
			url : '${baseurl}standardtest/makestandard_result.action',//加载数据的连接，引连接请求过来是json数据
			idField : 'id',//此字段很重要，数据结果集的唯一约束(重要)，如果写错影响 获取当前选中行的方法执行
			loadMsg : '',
			columns : columns_v,
			pagination : true,//是否显示分页
			rownumbers : true,//是否显示行号
			pageList : [ 18, 30, 45 ],
		});
	});
	
	//datagrid 加载数据
	$(function() {
		$('#resultlist').datagrid({
			title : '符合性测试标准结果',//数据列表标题
			nowrap : true,//单元格中的数据不换行，如果为true表示不换行，不换行情况下数据加载性能高，如果为false就是换行，换行数据加载性能不高
			striped : true,//条纹显示效果
			url : '${baseurl}standardtest/test_result.action',//加载数据的连接，引连接请求过来是json数据
			idField : 'id',//此字段很重要，数据结果集的唯一约束(重要)，如果写错影响 获取当前选中行的方法执行
			loadMsg : '',
			columns : columns_r,
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
	//删除方法
	function deletetestresult(id) {
		//第一个参数是提示信息，第二个参数，取消执行的函数指针，第三个参是，确定执行的函数指针
		_confirm('您确认删除吗？', null,
				function() {

					//将要删除的id赋值给deleteid，deleteid在goodsdeleteform中
					$("#testdelete_id").val(id);
					//使用ajax的from提交执行删除
					//goodsdeleteform：form的id，goodsdel_callback：删除回调函数，
					//第三个参数是url的参数
					//第四个参数是datatype，表示服务器返回的类型
					jquerySubByFId('testdeleteform', goodsdel_callback, null,
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
		createmodalwindow("添加符合性测试标准", 700, 350,
				'${baseurl}standardtest/addstandardcp.action');
	}
	
	//出库
	function outgoods2(id) {
		createmodalwindow("出库", 850, 350,
				'${baseurl}goodssystem/outgoods2.action?id=' + id);
	}
	//修改商品信息
	function editstandardcp(id) {
		//打开修改窗口
		createmodalwindow("修改标准信息", 900,350,
				'${baseurl}standardtest/editstandardcp.action?id=' + id);
	}
	//修改商品信息
	function edittestresult(id) {
		//打开修改窗口
		createmodalwindow("修改标准信息", 900,350,
				'${baseurl}standardtest/edittestresult.action?id=' + id);
	}
	//查看标准信息
	function openstandardcpv(id) {
		//打开信息窗口
		createmodalwindow("添加标准信息", 1000,350,
				'${baseurl}standardtest/openstandardcpv.action?id=' + id);
	}
	//查看标准信息
	function opentestvalue(tid) {
		//打开信息窗口
		createmodalwindow("符合性测试结果信息", 1000,350,
				'${baseurl}standardtest/opentestvalue.action?tid=' + tid);
	}
	//提交标准进行符合性测试
	
	function submittest(id) {
		//第一个参数是提示信息，第二个参数，取消执行的函数指针，第三个参是，确定执行的函数指针
		_confirm('您确认提交吗？', null,
				function() {

					//将要删除的id赋值给deleteid，deleteid在goodsdeleteform中
					$("#submittest_id").val(id);
					//使用ajax的from提交执行删除
					//goodsdeleteform：form的id，goodsdel_callback：删除回调函数，
					//第三个参数是url的参数
					//第四个参数是datatype，表示服务器返回的类型
					jquerySubByFId('submittestform', submittest_callback, null,
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
	
	function submitstandardresult(tid) {
		//第一个参数是提示信息，第二个参数，取消执行的函数指针，第三个参是，确定执行的函数指针
		_confirm('您确认提交吗？', null,
				function() {

					//将要删除的id赋值给deleteid，deleteid在goodsdeleteform中
					$("#submitstandardresult_tid").val(tid);
					//使用ajax的from提交执行删除
					//goodsdeleteform：form的id，goodsdel_callback：删除回调函数，
					//第三个参数是url的参数
					//第四个参数是datatype，表示服务器返回的类型
					jquerySubByFId('submitstandardresultform', submitstandardresult_callback, null,
							"json");
				});
	}
	//回调
	function submitstandardresult_callback(data) {
		
		message_alert(data);
		//如果成功自动关闭
		if (data.resultInfo.type == "1") {
			// 设置延迟关闭
			setTimeout("close()",1000);
		}
	}
	
	//回显页面
	function close(id){
		/* var sid = ${standardcpCustom.sid}; */
		if(parent.parent.parent){
			
			setTimeout("querygoods2qu()", 1000);
		}
	}
	function download(id) {
		window.location = '${baseurl}standardtest/download.action?id=' + id;
		
	}
	function trdownload(id) {
		window.location = '${baseurl}standardtest/trdownload.action?id=' + id;
		
	}
</script>

</html>