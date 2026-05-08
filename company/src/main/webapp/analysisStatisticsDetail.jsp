<%@ page language="java" %>
<%@ page pageEncoding="UTF-8" %>
<%@ page contentType="text/html"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="company" %>
<%@ page import="report.bean.entity.*" %>
<%@ page import="report.bean.daolmp.*" %>
<%@ page import="java.util.ArrayList" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta charset="utf-8">
<title>查看分析指标</title>
<link href="${contextPath}styles/mid.css?v=<%=System.currentTimeMillis()%>"  rel="stylesheet" type="text/css">
</head>

<body>
	<div><company:head></company:head></div>
	<div class="mid_kong"></div>
	<table class="mid_table">
	<tr>
	<td style="width:140px;vertical-align:text-top;"><company:left02></company:left02></td>
	<td style="vertical-align:text-top;">
	<div class="mid_title">查看分析指标</div>
<c:forEach var="idt" items="${idList}">
<div class="mid_kong"></div>
	<div class="mid_analysis">
		<div class="mid_analysis1">指标名称：</div>
		<div class="mid_analysis3">${idt.indicatorName}</div>
		<div class="mid_analysis1">优质边界：</div>
		<div class="mid_analysis3">${idt.scopeOperation}${idt.highQualityBoundaries}</div>
		<div class="mid_analysis1">指标类别：</div>
		<div class="mid_analysis3">${idt.indicatorCategories}</div>
		</div>
	<div class="mid_kong"></div>

<div class="mid_kong"></div>
	<div class="mid_analysis">
		<div class="mid_analysis1">指标说明：</div>
		<div class="mid_analysis2a">${idt.indicatorDescription}</div>
	</div>	

	
	</c:forEach>

	</td>
	</tr>
	</table>
	<div class="mid_kong"></div>
<div><company:end></company:end></div>
</body>
</html>
