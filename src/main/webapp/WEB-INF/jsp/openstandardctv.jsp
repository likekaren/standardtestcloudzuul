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
		<form id="goodsqueryForm" >
			<!-- 查询条件 -->
			<TABLE class="table_search">
				<TBODY>
				
					<TR>
					
						
						<td><INPUT type="hidden" name="standardctvCustom.tid"  value="${standardctvCustom.tid}" style="width:120px; height=100px"/></TD>
						<!-- <TD class="left">标准名称：</TD>
						<td><INPUT type="text" name="standardlistCustom.sname" style="width:120px; height=100px"/></TD> -->

						
			
						</select>
						</TD>
						<td>

				</TBODY>
			</TABLE>
			<!-- 查询列表 -->
			
			<TABLE border=0 cellSpacing=0 cellPadding=0 width="99%" align=center>
				<div class="table">
					<div class="opt ue-clear">
				
						<span class="optarea"> <i class="icon"></i> <span class="text"></span>
						 </a> <a href="javascript:submitctv();" class="statistics"> 
								<span class="text">提交</span> 
								<i class="icon"></i></a>  
						
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
			
			<a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-save',plain:true" onclick="accept()">保存</a>
</div>
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
				title : '标准值(下限)',
				width : 80
			},
			{
				field : 'standardvalue2',//对应json中的key
				title : '标准值(上限)',
				width : 80
			},
			
			{
				field : 'ctvalue',//对应json中的key
				title : '测试值（下限）',
				width : 85,
				editor:'textbox'
			},
			{
				field : 'ctvalue2',//对应json中的key
				title : '测试值（上限）',
				width : 85,
				editor:'textbox'
			},
			{
				field : 'unit',//对应json中的key
				title : '单位',
				width : 40
			},
			{
				field : 'types',//对应json中的key
				title : '标准描述',
				width : 80,
				
			},
			{
				field : 'typet',//对应json中的key
				title : '测试描述',
				width : 80,
				editor:'textbox'
			},
			
			{  
                title: '状态', field: 'state', sortable: true,width : 80,  
                formatter:function(value,row){
					return row.state;
				},
				editor:{
					type:'combobox',
					options:{
						valueField:'state',
						textField:'state',
						
						 data: [{
							 state: '符合'
            		},{
            			state: '不符合'
            		}],  
						required:true
					}
                    }  
                }, 
                {
    				field : 'suggest',//对应json中的key
    				title : '允许误差范围',
    				width : 80,
    				editor:'textbox'
    			}
			] ];

	//datagrid 加载数据
	$(function() {
		$('#goodslist').datagrid({
			title : '符合性测试',//数据列表标题
			nowrap : true,//单元格中的数据不换行，如果为true表示不换行，不换行情况下数据加载性能高，如果为false就是换行，换行数据加载性能不高
			striped : true,//条纹显示效果
			url : '${baseurl}standardtest/standardctv_result.action',//加载数据的连接，引连接请求过来是json数据
			idField : 'id',//此字段很重要，数据结果集的唯一约束(重要)，如果写错影响 获取当前选中行的方法执行
			loadMsg : '',
			columns : columns_v,
			pagination : true,//是否显示分页
			rownumbers : true,//是否显示行号
			pageList : [ 100, 30, 45 ],
			singleSelect:false,
			onClickRow: onClickRow
			
		});querygoods2qu();
	});

	//查询方法
	function querygoods2qu() {
		//datagrid的方法load方法要求传入json数据，最终将 json转成key/value数据传入action
		//将form表单数据提取出来，组成一个json
		var formdata = $("#goodsqueryForm").serializeJson();
		$('#goodslist').datagrid('load', formdata);
	}

	function submitctv() {
		
		var arr = $('#goodslist').datagrid('getSelections');
		
		console.log(arr);
		$.ajax({  
		    type : 'POST',  
		    url: '${baseurl}standardtest/submitctv.action', 
		    contentType : "application/json" ,
		    data : JSON.stringify(arr), 
		    success : function(data) {  
		    	message_alert(data);
		    	if (data.resultInfo.type == "1") {
					// 设置延迟关闭
					setTimeout("close()",1000);
				}
		    }  
		    
		});
		
	}
	//回显页面
	function close(){
		if(parent.parent.parent){
			/* parent.location = '${baseurl}standardtest/makestandard.action'; */
			parent.location.reload();
		}
	}
	
	var editIndex = undefined;
	function endEditing(){
		if (editIndex == undefined){return true}
		if ($('#goodslist').datagrid('validateRow', editIndex)){
			var ed = $('#goodslist').datagrid('getEditor', {index:editIndex,field:'state'});
			var state = $(ed.target).combobox('getText');
			$('#goodslist').datagrid('getRows')[editIndex]['state'] = state;
			$('#goodslist').datagrid('endEdit', editIndex);
			editIndex = undefined;
			return true;
		} else {
			return false;
		}
	}
	function onClickRow(index){
		if (editIndex != index){
			if (endEditing()){
				$('#goodslist').datagrid('selectRow', index)
						.datagrid('beginEdit', index);
				editIndex = index;
			} else {
				$('#goodslist').datagrid('selectRow', editIndex);
			}
		}
	}

	function accept(){
		if (endEditing()){
			$('#goodslist').datagrid('acceptChanges');
			
		}
	}

</script>

</html>