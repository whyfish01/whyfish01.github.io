<%@ page language="java" %>
<%@ page pageEncoding="UTF-8" %>
<%@ page contentType="text/html"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="company" %>
<%@ page import="report.bean.entity.*" %>
<%@ page import="report.bean.daolmp.*" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
<head>
<meta charset="utf-8">
<title>补充分红信息</title>
<link href="${contextPath}styles/mid.css?v=<%=System.currentTimeMillis()%>"  rel="stylesheet" type="text/css">
</head>

<body>
	<div><company:head></company:head></div>
	<div class="mid_kong"></div>
	<table class="mid_table">
	<tr>
	<td style="width:140px;vertical-align:text-top;"><company:left04></company:left04></td>
	<td style="vertical-align:text-top;">
	<div class="mid_title">补充分红信息</div>
	<div class="mid_kong"></div>
	
	<div class="mid_div">
		<form action="GetDividendsInAnalysis" method="post">
		<div class="mid_div01g_red">A股代码：</div>
		<div class="mid_div03"><input type="text" class="mid_box02" name="AShareCode"></div>
		<div class="mid_div01g_red">财报年份：</div>
		<div class="mid_div03"><input type="text" class="mid_box02" name="financialReportingYear"></div>
		<div class=mid_div03a><input type="submit" class="mid_an03" value="GO"></div>
		</form>
		
	</div>
	
	<div class="mid_kong"></div>
	<div class="mid_kong"></div>
	<c:forEach var="rsf" items="${rsfList}">
	<form action="InsertDividends" method="post">
		
	<div class="mid_div">
		<div class="mid_div01g">A股代码：</div>
		<div class="mid_div03"><input type="text" class="mid_box02" name="AShareCode" value="${rsf.AShareCode}"></div>
		<div class="mid_div01g">A股简称：</div>
		<div class="mid_div03"><input type="text" class="mid_box02" name="AShareName" value="${rsf.AShareName}"></div>
		<div class="mid_div01g">财报年份：</div>
		<div class="mid_div03"><input type="text" class="mid_box02" name="financialReportingYear" value="${rsf.reportYear}"></div>
		<div class="mid_div01g">所属地区：</div>
		<div class="mid_div03"><input type="text" class="mid_box02" name="region"  value="${rsf.region}"></div>
	</div>
	<div class="mid_div">
    <div class="mid_div01g">一级行业：</div>
    <div class="mid_div03">
        <select class="mid_box02" name="industry1" id="industry1">
            <option value="${rsf.primaryIndustry}" >${rsf.primaryIndustry}</option>
        </select>
    </div>

    <div class="mid_div01g">二级行业：</div>
    <div class="mid_div03">
        <select class="mid_box02" name="industry2" id="industry2">
            <option value="${rsf.secondaryIndustry}" >${rsf.secondaryIndustry}</option>
        </select>
    </div>

    <div class="mid_div01g">三级行业：</div>
    <div class="mid_div03">
        <select class="mid_box02" name="industry3" id="industry3" >
            <option value="${rsf.thirdLevelIndustry}" >${rsf.thirdLevelIndustry}</option>
        </select>
    </div>
    </div>
    
	<div class="mid_div">	
		<div class="mid_div01g">可分配利润：</div>
		<div class="mid_div03"><input type="text" class="mid_box02" name="distributiveProfits" ></div>
		<div class="mid_div01g">归母净利润：</div>
		<div class="mid_div03"><input type="text" class="mid_box02" name="netIncomeAttributableToShareholders"  value="${rsf.netIncomeAttributableToShareholdersFormated}"></div>
		<div class="mid_div01g">归母净利润增长：</div>
		<div class="mid_div03"><input type="text" class="mid_box02" name="growthRateOfNetIncomeAttributableToShareholders" value="${rsf.growthRateOfNetIncomeAttributableToShareholdersFormated}"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01g">现金分红金额：</div>
		<div class="mid_div03"><input type="text" class="mid_box02" name="financialReportDividends"  value="${rsf.financialReportDividendsFormated}"></div>
		<div class="mid_div01g">分红率：</div>
		<div class="mid_div03"><input type="text" class="mid_box02" name="dividendRate"  value="${rsf.dividendRateFormated}"></div>
		<div class="mid_div01g">每十股分红：</div>
		<div class="mid_div03"><input type="text" class="mid_box02" name="dividendEveryTenShares"></div>
	</div>
	<c:forEach var="bsf" items="${bsfList}">
		<div class="mid_div01g">总股本：</div>
		<div class="mid_div03"><input type="text" class="mid_box02" name="equity" value="${bsf.equityFormated}"></div>
		</c:forEach>
	
<div class="mid_kong"></div><div class="mid_kong"></div><div class="mid_kong"></div>

	<div class="mid_div">
		<div class="mid_div06"><input type="submit" class="mid_an" value="保存"></div>	
	</div>
		
		
	</form>
	</c:forEach>
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