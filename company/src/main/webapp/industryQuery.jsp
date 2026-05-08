<%@ page language="java" contentType="text/html"  pageEncoding="utf-8" isELIgnored="false" %>
<%@ page import="java.util.*" %>
<%@ page import="report.bean.entity.Industry" %>
<%@ page import="report.bean.daolmp.IndustryDaoImp" %>
<%@ page import="analys.servlet.industry.*" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="company" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="ib" class="report.bean.entity.Industry" scope="request"/>
<jsp:useBean id="pb" class="report.bean.entity.PageBean" scope="session"/>
<jsp:useBean id="irb" class="report.bean.daolmp.IndustryDaoImp" scope="request"/>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="Cache-Control" content="no-cache,no-store,must-revalidate">
<title>行业信息维护</title>
<link href="${contextPath}styles/mid.css?v=<%=System.currentTimeMillis()%>"  rel="stylesheet" type="text/css">
</head>

<body>
	<div><company:head></company:head></div>

	<div class="mid_kong"></div>
	<table class="mid_table">
	<tr>
	<td style="width:140px;vertical-align:text-top;"><company:left03></company:left03></td>
	<td style="vertical-align:text-top;">
	<div class="mid_title">行业信息维护</div>
	<div class="mid_kong"></div>

	<!-- 添加数据 -->
	<form action="InsertIndustry" method=post accept-charset="UTF-8">
	<div class="mid_div">
		<div class="mid_div01"><c:out value="一级行业："></c:out></div>
		<div class="mid_div03"><input type="text" name="industry1" class="mid_box06"></div>
		<div class="mid_div01">二级行业：</div>
		<div class="mid_div03"><input type="text" name="industry2" class="mid_box06"></div>
		<div class="mid_div01">三级行业：</div>
		<div class="mid_div03"><input type="text" name="industry3" class="mid_box06"></div>
		<div class="mid_div01"><input type="submit" name="submit" value="添加"></div>
		
	</div>
	
	</form>
	<form action="QueryIndustry" method=post accept-charset="UTF-8">
	<!-- 查询条件 -->
	<div class="mid_div">
		<div class="mid_div01">一级行业：</div>
		<div class="mid_div03"><input type="text" name="industry1" class="mid_box06"></div>
		<div class="mid_div01">二级行业：</div>
		<div class="mid_div03"><input type="text" name="industry2" class="mid_box06"></div>
		<div class="mid_div01">三级行业：</div>
		<div class="mid_div03"><input type="text" name="industry3" class="mid_box06"></div>
		<div class="mid_div01">
		<input type="hidden" name="pageIndex" value="${pageIndex}">	<!-- 当前页码 -->
		<input type="submit" name="submit" value="查询" >
		</div>
	</div>
	
	<div class="mid_kong"></div>
	
	<!-- 列表展示 -->
 <table class='mid_table'>
<tbody>
<tr>
<th scope='col' class='mid_table_title'>系统编码</th>
<th scope='col' class='mid_table_title'>一级行业</th>
<th scope='col' class='mid_table_title'>二级行业</th>
<th scope='col' class='mid_table_title'>三级行业</th>
<th scope='col' class='mid_table_title'>创建日期</th>
<th scope='col' class='mid_table_title'>操作</th>
</tr>
<c:forEach var="ind" items="${indList}" begin="${pb.startRows-1}" end="${pb.endRows}" >
<tr>
<td class='mid_table_content'>${ind.industryID}</td>
<td class='mid_table_content'>${ind.industry1}</td>
<td class='mid_table_content'>${ind.industry2}</td>
<td class='mid_table_content'>${ind.industry3}</td>
<td class='mid_table_content'>${ind.createTime}</td>
<c:set var="indId" value="${ind.industryID}" />
<td class='mid_table_content'><a href="DelIndustry?indId=${indId}">删除</a></td>
</tr>
</c:forEach>
</tbody>
</table>
<div class='message_font'>${a}</div>
<div><company:page></company:page></div>
</form>
</td>
</tr>
</table>
	<div class="mid_kong"></div>

<div><company:end></company:end></div>
</body>
</html>
