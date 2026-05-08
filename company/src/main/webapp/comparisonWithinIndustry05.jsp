<%@ page language="java" %>
<%@ page pageEncoding="UTF-8" %>
<%@ page contentType="text/html"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="company" %>
<%@ page import="report.bean.entity.*" %>
<%@ page import="report.bean.daolmp.*" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="pb" class="report.bean.entity.PageBean" scope="session"/>
<html>

<%
IndustryDaoImp idi = new IndustryDaoImp();
String industry1=request.getParameter("industry1");
List<Industry> ind1List = idi.getIndustry1();
pageContext.setAttribute("ind1List", ind1List);
%>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script src="script/getIndustry.js"></script>
<head>
<meta charset="utf-8">
<title>营收增长及毛利率比较</title>
<link href="${contextPath}styles/mid.css?v=<%=System.currentTimeMillis()%>" rel="stylesheet" type="text/css">
</head>

<body>
	<div><company:head></company:head></div>
	<div class="mid_kong"></div>
	<table class="mid_table">
	<tr>
	<td style="width:140px;vertical-align:text-top;"><company:left03></company:left03></td>
	<td style="vertical-align:text-top;">
	<div class="mid_title">营收增长及毛利率比较</div>
	<div class="mid_kong"></div>
	<form action="GetIndustryReportstatistics05" method="post">

	<div class="mid_div">
		<div class="mid_div01_red">一级行业：</div>
    <div class="mid_div04">
        <select class="mid_box02" name="industry1" id="industry1" onchange="getIndustry2ByInd1()">
            <option></option>
            <c:forEach var="ind1" items="${ind1List}">
                <option value="${ind1.industry1}">${ind1.industry1}</option>
            </c:forEach>
        </select>
    </div>

    <div class="mid_div01">二级行业：</div>
    <div class="mid_div04">
        <select class="mid_box02" name="industry2" id="industry2" onchange="getIndustry3ByInd2()">
            <option></option>
            <c:forEach var="ind2" items="${ind2List}">
                <option value="${ind2.industry2}">${ind2.industry2}</option>
            </c:forEach>
        </select>
    </div>

    <div class="mid_div01">三级行业：</div>
    <div class="mid_div04">
        <select class="mid_box02" name="industry3" id="industry3" >
            <option></option>
            <c:forEach var="ind3" items="${ind3List}">
                <option value="${ind3.industry3}">${ind3.industry3}</option>
            </c:forEach>
        </select>
    </div>
	<div class="mid_div01_red">财报年份：</div>
	<div class="mid_div03a"><input type="text" class="mid_box08" name="financialReportingYear"></div>
		
		<div class="mid_div01"><input type="submit" value="查询"></div>
	</div>

		<div class="mid_kong"></div>
<table class="mid_table">
	  <tbody>
	    <tr>
	      <th scope="col" class="mid_table_title">A股代码</th>
	      <th scope="col" class="mid_table_title">A股简称</th>
	      <th scope="col" class="mid_table_title">财报年份</th>
	      <th scope="col" class="mid_table_title">总资产</th>
		  <th scope="col" class="mid_table_title">营业收入</th>
		  <th scope="col" class="mid_table_title">营收增长率</th>
		  <th scope="col" class="mid_table_title">总资产周转率</th>
		  <th scope="col" class="mid_table_title">营业成本</th>
	      <th scope="col" class="mid_table_title">毛利率</th>
		  <th scope="col" class="mid_table_title">销售商品提供劳务收到现金</th>
		  <th scope="col" class="mid_table_title">销售商品提供劳务收到现金/营收</th>
			<th scope="col" class="mid_table_title">指标分析</th>
        </tr>
        <c:forEach var="rsf" items="${rsfList}">
	    <tr>
	      <td class="mid_table_content"><div>${rsf.AShareCode}</div></td>
	      <td class="mid_table_content"><div>${rsf.AShareName}</div></td>
	      <td class="mid_table_content"><div>${rsf.financialReportingYear}</div></td>
	      <td class="mid_table_content"><div>${rsf.totalAssetsFormated}</div></td>
	      <td class="mid_table_content">${rsf.operatingRevenueFormated}</td>
	      <td class="mid_table_content">${rsf.revenueGrowthRateFormated}</td>
		<td class="mid_table_content">${rsf.totalAssetTurnoverFormated}</td>
		<td class="mid_table_content">${rsf.operatingCostsFormated}</td>
		<td class="mid_table_content">${rsf.grossMarginFormated}</td>
		<td class="mid_table_content">${rsf.cashReceivedFromSellingGoodsAndProvidingServicesFormated}</td>
		<td class="mid_table_content">${rsf.proportionOfCashSellingGoodsProvidingServicesFormated}</td>
		<td class="mid_table_content">
		<a href="GetRevenueGrowthRateForYears?AShareCode=${rsf.AShareCode}&AShareName=${rsf.AShareName}" target="_blank">查看</a>
		</td>
        </tr>
	 </c:forEach>
      </tbody>
</table>
	</form>
</td>
	</tr>
	</table>
<script type="text/javascript">
        window.onload = function() {
            var message = "${a}";
            if (message) {
                alert(message);
            }
        };
    </script>
	<div class="mid_kong"></div>
<div><company:end></company:end></div>
</body>
</html>
