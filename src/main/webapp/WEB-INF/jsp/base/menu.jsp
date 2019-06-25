<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<fmt:setBundle basename="resources.messages" var="messagesBundle" />
<c:set var="baseurl" value="${pageContext.request.contextPath}/"></c:set>
<%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
<html>
<head>
<TITLE>标准管理系统</TITLE>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="content-type" content="text/html; charset=UTF-8">

<link rel="stylesheet" type="text/css" href="${baseurl}css/style.css" />
<link rel="stylesheet" href="${baseurl}css/zTreeStyle/zTreeStyle.css"
	type="text/css">
<link rel="stylesheet" type="text/css"
	href="${baseurl}css/skin_/nav.css" />
<script type="text/javascript">
	$(document)
			.ready(
					function() {
						$("#cut")
								.click(
										function() {
											htmlobj = $
													.ajax({
														url : "${baseurl}/procedurecoding/queryprocedurecoding.action?pc=cut",
														async : true
													});
										});
						$("#punch")
								.click(
										function() {
											htmlobj = $
													.ajax({
														url : "${baseurl}/procedurecoding/queryprocedurecoding.action?pc=punch",
														async : true
													});
										});
						$("#bend")
								.click(
										function() {
											htmlobj = $
													.ajax({
														url : "${baseurl}/procedurecoding/queryprocedurecoding.action?pc=bend",
														async : true
													});
										});
						$("#mfitting")
								.click(
										function() {
											htmlobj = $
													.ajax({
														url : "${baseurl}/procedurecoding/queryprocedurecoding.action?pc=mfitting",
														async : true
													});
										});
						$("#efitting")
								.click(
										function() {
											htmlobj = $
													.ajax({
														url : "${baseurl}/procedurecoding/queryprocedurecoding.action?pc=efitting",
														async : true
													});
										});
						$("#ffitting")
								.click(
										function() {
											htmlobj = $
													.ajax({
														url : "${baseurl}/procedurecoding/queryprocedurecoding.action?pc=ffitting",
														async : true
													});
										});

					});
</script>
</head>
<body>
	<div id="container">
		<div id="bd">
			<div class="sidebar">
				<div class="sidebar-bg"></div>
				<i class="sidebar-hide"></i>
				<h2>
					<a href="javascript:;"><i class="h2-icon" title="切换到树型结构"></i><span>标准管理</span></a>
				</h2>
				<ul class="nav">


					<li class="nav-li"><a href="javascript:;" class="ue-clear"><i
							class="nav-ivon"></i><span class="nav-text">标准信息</span></a>
						<ul class="subnav">
							<li class="subnav-li" href="querystandardList"
								data-id="122"><a href="javascript:;" class="ue-clear"><i
									class="subnav-icon"></i><span class="subnav-text">国家标准查询</span></a></li>
							<li class="subnav-li" href="querymystandard"
								data-id="123"><a href="javascript:;" class="ue-clear"><i
									class="subnav-icon"></i><span class="subnav-text">标准信息管理</span></a></li>
							
						</ul></li>



					<li class="nav-li"><a href="javascript:;" class="ue-clear"><i
							class="nav-ivon"></i><span class="nav-text">符合性测试</span></a>
						<ul class="subnav">


							<li class="subnav-li current"
								href="${baseurl}/standardtest/makestandard.action" data-id="14"><a
								href="javascript:;" class="ue-clear"><i class="subnav-icon"></i><span
									class="subnav-text">指标管理</span></a></li>


							<li class="subnav-li current"
								href="${baseurl}/standardtest/maketest.action" data-id="15"><a
								href="javascript:;" class="ue-clear"><i class="subnav-icon"></i><span
									class="subnav-text">符合性测试</span></a></li>


						</ul></li>

					
					
					<li class="nav-li"><a href="javascript:;" class="ue-clear"><i
							class="nav-ivon"></i><span class="nav-text">年审检测</span></a>
						<ul class="subnav">
							<li class="subnav-li" href="${baseurl}/standardtest/yeartest.action"
								data-id="124"><a href="javascript:;" class="ue-clear"><i
									class="subnav-icon"></i><span class="subnav-text">年审检测</span></a></li>
							<li class="subnav-li" href="${baseurl}/standardtest/queryyeart.action" data-id="210"><a href="javascript:;"
								class="ue-clear"><i class="subnav-icon"></i><span
									class="subnav-text">年审结果管理</span></a></li> 
							<li class="subnav-li" href="${baseurl}/standardtest/submitcgs.action" data-id="211"><a href="javascript:;"
								class="ue-clear"><i class="subnav-icon"></i><span
									class="subnav-text">提交车管所</span></a></li> 
							<li class="subnav-li" href="${baseurl}/standardtest/queryfb.action" data-id="212"><a href="javascript:;"
								class="ue-clear"><i class="subnav-icon"></i><span
									class="subnav-text">查询发标</span></a></li> 
							<li class="subnav-li"
								href="${baseurl}/standardtest/querycarjsz1.action"
								data-id="256"><a href="javascript:;" class="ue-clear"><i
									class="subnav-icon"></i><span class="subnav-text">车主信息查询</span></a></li>
							<li class="subnav-li"
								href="${baseurl}/standardtest/querycarxsz1.action"
								data-id="257"><a href="javascript:;" class="ue-clear"><i
									class="subnav-icon"></i><span class="subnav-text">车辆信息查询</span></a></li>
						</ul></li>
					<li class="nav-li"><a href="javascript:;" class="ue-clear"><i
							class="nav-ivon"></i><span class="nav-text">车主管理</span></a>
						<ul class="subnav">
							<li class="subnav-li"
								href="${baseurl}/standardtest/getjsz.action"
								data-id="139"><a href="javascript:;" class="ue-clear"><i
									class="subnav-icon"></i><span class="subnav-text">车主登记</span></a></li>
							<li class="subnav-li"
								href="${baseurl}/standardtest/getxsz.action"
								data-id="140"><a href="javascript:;" class="ue-clear"><i
									class="subnav-icon"></i><span class="subnav-text">车辆登记</span></a></li>
							<li class="subnav-li"
								href="${baseurl}/standardtest/makecaruser.action"
								data-id="141"><a href="javascript:;" class="ue-clear"><i
									class="subnav-icon"></i><span class="subnav-text">年审预约</span></a></li>
							<li class="subnav-li"
								href="${baseurl}/standardtest/qxcaruser.action"
								data-id="142"><a href="javascript:;" class="ue-clear"><i
									class="subnav-icon"></i><span class="subnav-text">取消预约</span></a></li>
							<li class="subnav-li"
								href="${baseurl}/standardtest/userqueryyeart.action"
								data-id="143"><a href="javascript:;" class="ue-clear"><i
									class="subnav-icon"></i><span class="subnav-text">年审结果查询</span></a></li>
						</ul></li>
					<li class="nav-li"><a href="javascript:;" class="ue-clear"><i
							class="nav-ivon"></i><span class="nav-text">车管所</span></a>
						<ul class="subnav">
							<li class="subnav-li"
								href="${baseurl}/standardtest/opencgs.action"
								data-id="121"><a href="javascript:;" class="ue-clear"><i
									class="subnav-icon"></i><span class="subnav-text">车管所管理</span></a></li>
							<li class="subnav-li"
								href="${baseurl}/standardtest/querycarjsz.action"
								data-id="125"><a href="javascript:;" class="ue-clear"><i
									class="subnav-icon"></i><span class="subnav-text">车主信息查询</span></a></li>
							<li class="subnav-li"
								href="${baseurl}/standardtest/querycarxsz.action"
								data-id="126"><a href="javascript:;" class="ue-clear"><i
									class="subnav-icon"></i><span class="subnav-text">车辆信息查询</span></a></li>
						</ul></li>
						
					
					<li class="nav-li"><a href="javascript:;" class="ue-clear"><i
							class="nav-ivon"></i><span class="nav-text">系统用户</span></a>
						<ul class="subnav">
							<li class="subnav-li"
								href="${baseurl}/user/queryuser.action"
								data-id="199"><a href="javascript:;" class="ue-clear"><i
									class="subnav-icon"></i><span class="subnav-text">用户管理</span></a></li>
							<li class="subnav-li"
								href="${baseurl}/role/queryrole.action"
								data-id="200"><a href="javascript:;" class="ue-clear"><i
									class="subnav-icon"></i><span class="subnav-text">角色管理</span></a></li>
						</ul></li>
					
				<div class="tree-list outwindow">
					<div class="tree ztree"></div>
				</div>
			</div>
			<div class="main">
				<div class="title">
					<i class="sidebar-show"></i>
					<ul class="tab ue-clear">

					</ul>
					<i class="tab-more"></i> <i class="tab-close"></i>
				</div>
				<div class="content"></div>
			</div>
		</div>
	</div>

	<div class="more-bab-list">
		<ul></ul>
		<div class="opt-panel-ml"></div>
		<div class="opt-panel-mr"></div>
		<div class="opt-panel-bc"></div>
		<div class="opt-panel-br"></div>
		<div class="opt-panel-bl"></div>
	</div>
</body>
<script type="text/javascript" src="js/nav.js"></script>
<script type="text/javascript" src="js/Menu.js"></script>
<script type="text/javascript" src="js/jquery.ztree.core-3.5.js"></script>
<script type="text/javascript">
	var menu = new Menu({
		defaultSelect : $('.nav').find('li[data-id="122"]')
	});

	// 左侧树结构加载
 	var setting = {};

/* 	var zNodes = [ {
		name : "操作指南",
	}];  */

	
	//$.fn.zTree.init($(".tree"), setting, zNodes);

/* 	$('.sidebar h2').click(function(e) {
		$('.tree-list').toggleClass('outwindow');
		$('.nav').toggleClass('outwindow');
	}); */

	/* $(document).click(function(e) {
		if (!$(e.target).is('.tab-more')) {
			$('.tab-more').removeClass('active');
			$('.more-bab-list').hide();
		}
	}); */
</script>
</HTML>
