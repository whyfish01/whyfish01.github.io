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
<title>查看投资信息</title>
<link href="${contextPath}styles/mid.css?v=<%=System.currentTimeMillis()%>"  rel="stylesheet" type="text/css">
</head>

<body>
	<div><company:head></company:head></div>
	<div class="mid_kong"></div>
	<table class="mid_table">
	<tr>
	<td style="width:140px;vertical-align:text-top;"><company:left04></company:left04></td>
	<td style="vertical-align:text-top;">
	<div class="mid_title">查看投资信息</div>
	<div class="mid_kong"></div>
	
	<c:forEach var="ift" items="${ifList}">
	<div class="mid_div">
		<div class="mid_div01a">A股代码：</div>
		<div class="mid_div03">${ift.AShareCode}</div>
		<div class="mid_div01a">A股简称：</div>
		<div class="mid_div03">${ift.AShareName}</div>
		<div class="mid_div01a">财报年份：</div>
		<div class="mid_div03">${ift.reportYear}</div>
	</div>
    
	<div class="mid_div">
    <div class="mid_div01a">买入股票单价：</div>
    <div class="mid_div03">${ift.unitPriceFormated}</div>
    <div class="mid_div01a">持股数量：</div>
    <div class="mid_div03">${ift.numberOfStocks}</div>
    <div class="mid_div01a">买入总成本：</div>
    <div class="mid_div03">${ift.totalCostFormated}</div>
	</div>
	

	<div class="mid_div">
		<div class="mid_div01a">每十股分红：</div>
		<div class="mid_div03">${ift.dividendEveryTenSharesFormated}</div>
		<div class="mid_div01a">分红总收益：</div>
		<div class="mid_div03">${ift.dividendIncomeFormated}</div>
		<div class="mid_div01a">股息率：</div>
		<div class="mid_div03">${ift.yieldFormated}</div>
	</div>

	
	<div class="mid_div">
		<div class="mid_div01a">分红后总成本：</div>
		<div class="mid_div03">${ift.estimatedTotalCostFormated}</div>
		<div class="mid_div01a">分红后单价：</div>
		<div class="mid_div03">${ift.estimatedUnitPriceFormated}</div>
		<div class="mid_div01a">投资标的当前股价：</div>
		<div class="mid_div03">${ift.currentUnitPriceFormated}</div>
		
	</div>
	
	<div class="mid_div">
		<div class="mid_div01a">投资当前市值：</div>
		<div class="mid_div03">${ift.currentTotalCostFormated}</div>
		<div class="mid_div01a">公允价值变动收益：</div>
		<div class="mid_div03">${ift.incomeFromChangesInFairValueFormated}</div>
		<div class="mid_div01a">是否卖出：</div>
		<div class="mid_div03">${ift.whetherToSell}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">卖出时间：</div>
		<div class="mid_div03">${ift.sellTime}</div>
		<div class="mid_div01a">卖出数量：</div>
		<div class="mid_div03">${ift.sellNumbers}</div>
		<div class="mid_div01a">卖出价格：</div>
		<div class="mid_div03">${ift.sellPriceFormated}</div>
	</div>
	
	<div class="mid_div">
		<div class="mid_div01a">投资实际收益：</div>
		<div class="mid_div03">${ift.realReturnFormated}</div>
		<div class="mid_div01a">实际收益率：</div>
		<div class="mid_div03">${ift.rateOfRealReturnFormated}</div>
	</div>

	</c:forEach>
<div class="mid_kong"></div><div class="mid_kong"></div><div class="mid_kong"></div>

	</td>
	</tr>
	</table>

	<div class="mid_kong"></div>
<div><company:end></company:end></div>
</body>
</html>