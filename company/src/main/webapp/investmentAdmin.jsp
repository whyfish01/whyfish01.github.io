<%@ page language="java" %>
<%@ page pageEncoding="UTF-8" %>
<%@ page contentType="text/html"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="company" %>
<%@ page import="report.bean.entity.*" %>
<%@ page import="report.bean.daolmp.*" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="pb" class="report.bean.entity.PageBean" scope="session"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>企业投资管理</title>
<link href="${contextPath}styles/mid.css?v=<%=System.currentTimeMillis()%>"  rel="stylesheet" type="text/css">
</head>
<body>
	<div><company:head></company:head></div>
	<div class="mid_kong"></div>
<form action="QueryInvestment" method="post">
<table class="mid_table">
	<tr>
		<td style="width:140px;vertical-align:text-top;"><company:left04></company:left04></td>
		<td style="vertical-align:text-top;">
			<div class="mid_title">企业投资管理
			<a href="investmentAdd.jsp" target="_blank"><input type="button" class="mid_an01a" value="增加投资记录"></a>
			</div>
			<div class="mid_kong"></div>
	
			<div class="mid_div">
			<div class="mid_div01">A股代码：</div>
			<div class="mid_div03a"><input type="text" class="mid_box08" name="AShareCode"></div>
			<div class="mid_div01">A股简称：</div>
			<div class="mid_div03a"><input type="text" class="mid_box08" name="AShareName"></div>
			<div class="mid_div01">财报年份：</div>
			<div class="mid_div03a"><input type="text" class="mid_box08" name="reportingYear"></div>
			<div class="mid_div01"><input type="submit" value="查询"></div>
			</div>
	
		<div class="mid_kong"></div>
<table  class="mid_table">
	  <tbody>
	    <tr>
	      <th scope="col"  class="mid_table_title">序号</th>
	      <th scope="col" class="mid_table_title">A股代码</th>
	      <th scope="col" class="mid_table_title">A股简称</th>
	      <th scope="col" class="mid_table_title">财报年份</th>
	      <th scope="col" class="mid_table_title">买入单价</th>
	      <th scope="col" class="mid_table_title">持股数量</th>
	      <th scope="col" class="mid_table_title">买入成本</th>
	      <th scope="col" class="mid_table_title">每十股分红</th>
	      <th scope="col" class="mid_table_title">分红总金额</th>
	      <th scope="col" class="mid_table_title">股息率</th>
	      <th scope="col" class="mid_table_title">是否卖出</th>
	      <th scope="col" class="mid_table_title">卖出数量</th>
	      <th scope="col" class="mid_table_title">卖出价格</th>
	      <th scope="col" class="mid_table_title">投资收益</th>
	      <th scope="col" class="mid_table_title">投资收益率</th>
	      <th scope="col" class="mid_table_title">操作</th>
        </tr>
        <c:forEach var="ifl" items="${ifList}" begin="${pb.startRows-1}" end="${pb.endRows}"  varStatus="status">
	    <tr>
	    <td class="mid_table_content">${status.index + 1}</td>
	      <c:set var="budgetId" value="${ifl.budgetId}" />
	      <td class="mid_table_content">${ifl.AShareCode}</td>
	      <td class="mid_table_content">${ifl.AShareName}</td>
	      <td class="mid_table_content">${ifl.reportYear}</td>
	      <td class="mid_table_content">${ifl.unitPriceFormated}</td>
	      <td class="mid_table_content">${ifl.numberOfStocks}</td>
	      <td class="mid_table_content">${ifl.totalCostFormated}</td>
	      <td class="mid_table_content">${ifl.dividendEveryTenSharesFormated}</td>
	      <td class="mid_table_content">${ifl.dividendIncomeFormated}</td>
	      <td class="mid_table_content">${ifl.yieldFormated}</td>
	      <td class="mid_table_content">${ifl.whetherToSell}</td>
	      <td class="mid_table_content">${ifl.sellNumbers}</td>
	      <td class="mid_table_content">${ifl.sellPriceFormated}</td>
	      <td class="mid_table_content">${ifl.realReturnFormated}</td>
			<td class="mid_table_content">${ifl.rateOfRealReturnFormated}</td>
			<td class="mid_table_content">
<a href="GetInvestmentDetail?budgetId=${ifl.budgetId}" target="blank">查看</a>
			  			    |  
			<a href="DelInvestment?budgetId=${ifl.budgetId}">删除</a>
</td>

        </tr>
</c:forEach>
      </tbody>
</table>

<script type="text/javascript">
        window.onload = function() {
            var message = "${a}";
            if (message) {
                alert(message);
            }
        };
    </script>
</td>
	</tr>
	</table>
	<div><company:page></company:page></div>
	</form>
	<div class="mid_kong"></div>
<div><company:end></company:end></div>
</body>
</html>