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

<%
IndustryDaoImp idi = new IndustryDaoImp();
String industry1=request.getParameter("industry1");
List<Industry> ind1List = idi.getIndustry1();
pageContext.setAttribute("ind1List", ind1List);
%>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script src="script/getIndustry.js"></script>
<html>
<head>
<meta charset="utf-8">
<title>修改企业信息</title>
<link href="${contextPath}styles/mid.css?v=<%=System.currentTimeMillis()%>"  rel="stylesheet" type="text/css">
</head>

<body>
	<div><company:head></company:head></div>
	<div class="mid_kong"></div>
	<table class="mid_table">
	<tr>
	<td style="width:140px;vertical-align:text-top;"><company:left01></company:left01></td>
	<td>
	<div class="mid_title">修改企业信息</div>
	<div class="mid_kong"></div>
	<form action="EditCompany" method="post">
	<c:forEach var="clt" items="${cpdList}">
	<div class="mid_div">
		<div class="mid_div01_red">企业全称：</div>
		<div class="mid_div02"><input type="text" class="mid_box01" name="companyName" value="${clt.companyName}"></div>
		<div class="mid_div01_red">A股简称：</div>
		<div class="mid_div03"><input type="text" class="mid_box02" name="AShareName" value="${clt.AShareName}" ></div>
		<div class="mid_div01_red">A股代码：</div>
		<div class="mid_div03"><input type="text" class="mid_box02" name="AShareCode" value="${clt.AShareCode}" ></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01">注册地址：</div>
		<div class="mid_div02"><input type="text" class="mid_box01" name="companyAddress" value="${clt.companyAddress}" ></div>
		<div class="mid_div01">所属地区：</div>
		<div class="mid_div03"><input type="text" class="mid_box02" name="region" value="${clt.region}" ></div>
		<div class="mid_div01">注册日期：</div>
		<div class="mid_div03"><input type="text" class="mid_box02" name="establishedDate" value="${clt.establishedDate}" ></div>
	</div>
	<div class="mid_div">
    <div class="mid_div01_red">一级行业：</div>
    <div class="mid_div04">
        <select class="mid_box02" name="industry1" id="industry1" onchange="getIndustry2ByInd1()">
            <option value="${clt.primaryIndustry}" >${clt.primaryIndustry}</option>
            <c:forEach var="ind1" items="${ind1List}">
                <option value="${ind1.industry1}">${ind1.industry1}</option>
            </c:forEach>
        </select>
    </div>

    <div class="mid_div01_red">二级行业：</div>
    <div class="mid_div04">
        <select class="mid_box02" name="industry2" id="industry2" onchange="getIndustry3ByInd2()">
            <option value="${clt.secondaryIndustry}" >${clt.secondaryIndustry}</option>
            <c:forEach var="ind2" items="${ind2List}">
                <option value="${ind2.industry2}">${ind2.industry2}</option>
            </c:forEach>
        </select>
    </div>

    <div class="mid_div01_red">三级行业：</div>
    <div class="mid_div04">
        <select class="mid_box02" name="industry3" id="industry3" >
            <option value="${clt.thirdLevelIndustry}" >${clt.thirdLevelIndustry}</option>
            <c:forEach var="ind3" items="${ind3List}">
                <option value="${ind3.industry3}">${ind3.industry3}</option>
            </c:forEach>
        </select>
    </div>
</div>
	<div class="mid_div">
		<div class="mid_div01">上市类型：</div>
		<div class="mid_div04">
		<select class="mid_box02"  name="listingType">
		<option value="${clt.listingType}" >${clt.listingType}</option>
		<option value="上海证券交易所">上海证券交易所</option>
		<option value="深圳证券交易所">深圳证券交易所</option>
		</select>
		</div>
		<div class="mid_div01">上市日期：</div>
		<div class="mid_div04"><input type="text" class="mid_box02" name="listingDate"  value="${clt.listingDate}" ></div>
		<div class="mid_div01">注册资本：</div>
		<div class="mid_div04"><input type="text" class="mid_box02" name="registeredCapital" value="${clt.registeredCapital}" ></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01">经营范围：</div>
		<div class="mid_div05a"><textarea class="mid_box04c"  name="businessScope" > ${clt.businessScope}</textarea></div>
		<div class="mid_div01">法定代表：</div>
		<div class="mid_div03"><input type="text" class="mid_box02"  name="legalRepresentative"  value="${clt.legalRepresentative}" ></div>
	</div>
	<div class="mid_div">
		<div class="mid_div06"><input type="submit" class="mid_an" value="保存"></div>	
	</div>
	</c:forEach>
		
	</form>
	</td>
	</tr>
	</table>

	<div class="mid_kong"></div>
	<div class='message_font'>${a}</div>
<div><company:end></company:end></div>
</body>
</html>

