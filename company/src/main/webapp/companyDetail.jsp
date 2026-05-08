<%@ page language="java" %>
<%@ page pageEncoding="UTF-8" %>
<%@ page contentType="text/html"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="company" %>
<%@ page import="report.bean.entity.*" %>
<%@ page import="report.bean.daolmp.*" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="ib" class="report.bean.entity.Industry" scope="request"/>
<jsp:useBean id="irb" class="report.bean.daolmp.IndustryDaoImp" scope="request"/>
<jsp:useBean id="cp" class="report.bean.entity.Company" scope="request"/>
<jsp:useBean id="cdi" class="report.bean.daolmp.CompanyDaoImp" scope="request"/>


<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script src="script/getIndustry.js"></script>
<html>
<head>
<meta charset="utf-8">
<title>企业详细信息</title>
<link href="${contextPath}styles/mid.css?v=<%=System.currentTimeMillis()%>"  rel="stylesheet" type="text/css">
</head>

<body>
	<div><company:head></company:head></div>
	<div class="mid_kong"></div>
	<table class="mid_table">
	<tr>
	<td style="width:140px;vertical-align:text-top;"><company:left01></company:left01></td>
	<td>
	<div class="mid_title">企业详细信息</div>
	<div class="mid_kong"></div>
	<c:forEach var="clt" items="${cpdList}">
	<div class="mid_div">
		<div class="mid_div01_red">企业全称：</div>
		<div class="mid_div02">${clt.companyName}</div>
		<div class="mid_div01_red">A股简称：</div>
		<div class="mid_div03">${clt.AShareName}</div>
		<div class="mid_div01_red">A股代码：</div>
		<div class="mid_div03">${clt.AShareCode}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01">注册地址：</div>
		<div class="mid_div02">${clt.companyAddress}</div>
		<div class="mid_div01">所属地区：</div>
		<div class="mid_div03">${clt.region}</div>
		<div class="mid_div01">注册日期：</div>
		<div class="mid_div03">${clt.establishedDate}</div>
	</div>
	<div class="mid_div">
    <div class="mid_div01_red">一级行业：</div>
    <div class="mid_div04"> ${clt.primaryIndustry}</div>

    <div class="mid_div01_red">二级行业：</div>
    <div class="mid_div04">${clt.secondaryIndustry}</div>

    <div class="mid_div01_red">三级行业：</div>
    <div class="mid_div04">${clt.thirdLevelIndustry}</div>
</div>
	<div class="mid_div">
		<div class="mid_div01">上市类型：</div>
		<div class="mid_div04">${clt.listingType}</div>
		<div class="mid_div01">上市日期：</div>
		<div class="mid_div04">${clt.listingDate}</div>
		<div class="mid_div01">注册资本：</div>
		<div class="mid_div04">${clt.registeredCapital}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01">经营范围：</div>
		<div class="mid_div05a">${clt.businessScope}</div>
		<div class="mid_div01">法定代表：</div>
		<div class="mid_div03">${clt.legalRepresentative}</div>
	</div>

	</c:forEach>

	</td>
	</tr>
	</table>
<div class="mid_div05a"></div>
	<div class="mid_kong"></div>
<div><company:end></company:end></div>
</body>
</html>

