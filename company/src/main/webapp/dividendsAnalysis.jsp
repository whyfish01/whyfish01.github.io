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
<head>
<meta charset="utf-8">
<title>分红信息管理</title>
<link href="${contextPath}styles/mid.css?v=<%=System.currentTimeMillis()%>"  rel="stylesheet" type="text/css">
</head>
<%
IndustryDaoImp idi = new IndustryDaoImp();
String industry1=request.getParameter("industry1");
List<Industry> ind1List = idi.getIndustry1();
pageContext.setAttribute("ind1List", ind1List);
%>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script src="script/getIndustry.js"></script>
<body>
	<div><company:head></company:head></div>
	<div class="mid_kong"></div>
<form action="QueryDividends" method="post">
<table class="mid_table">
	<tr>
		<td style="width:140px;vertical-align:text-top;"><company:left04></company:left04></td>
		<td style="vertical-align:text-top;">
			<div class="mid_title">分红信息管理
			<a href="dividendsAdd.jsp" target="_blank"><input type="button" class="mid_an01a" value="补充分红信息"></a>
			</div>
			<div class="mid_kong"></div>
	
			<div class="mid_div">
			<div class="mid_div01">A股代码：</div>
			<div class="mid_div03a"><input type="text" class="mid_box08" name="AShareCode"></div>
			<div class="mid_div01">A股简称：</div>
			<div class="mid_div03a"><input type="text" class="mid_box08" name="AShareName"></div>
			<div class="mid_div01">财报年份：</div>
			<div class="mid_div03a"><input type="text" class="mid_box08" name="reportingYear"></div>
			<div class="mid_div01">所属区域：</div>
			<div class="mid_div03a"><input type="text" class="mid_box08" name="region"></div>
			</div>
	<div class="mid_div">
		<div class="mid_div01">一级行业：</div>
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
	      <th scope="col" class="mid_table_title">总股本</th>
	      <th scope="col" class="mid_table_title">可分配利润</th>
	      <th scope="col" class="mid_table_title">归母净利润</th>
	      <th scope="col" class="mid_table_title">归母净利润增长率</th>
	      <th scope="col" class="mid_table_title">现金分红金额</th>
	      <th scope="col" class="mid_table_title">现金分红率</th>
		  <th scope="col" class="mid_table_title">每10股分红</th>
		  <th scope="col" class="mid_table_title">参考好价格</th>
		  <th scope="col" class="mid_table_title">参考股息</th>
        </tr>
        <c:forEach var="dfl" items="${dfList}" begin="${pb.startRows-1}" end="${pb.endRows}"  varStatus="status">
	    <tr>
	    <td class="mid_table_content">${status.index + 1}</td>
	      <c:set var="netIncome" value="${Double.parseDouble(dfl.netIncomeAttributableToShareholdersFormated.replaceAll('[, ]', ''))}" />
			<c:set var="equity" value="${Double.parseDouble(dfl.equityFormated.replaceAll('[, ]', ''))}" />
			<c:set var="goodPrice" value="${netIncome *15 / equity }" />
			<c:set var="formattedGoodPrice" value="${String.format('%.2f', goodPrice)}" />
			<c:set var="dividendEveryTenShares" value="${Double.parseDouble(dfl.dividendEveryTenSharesFormated.replaceAll('[, ]', ''))}" />
	      	<c:set var="dividend" value="${dividendEveryTenShares/(goodPrice*10)}" />
			<c:set var="dividendFormatted" value="${String.format('%.2f%%', dividend * 100)}" />
	      <td class="mid_table_content">${dfl.AShareCode}</td>
	      <td class="mid_table_content">${dfl.AShareName}</td>
	      <td class="mid_table_content">${dfl.reportYear}</td>
	      <td class="mid_table_content">${dfl.equityFormated}</td>
	      <td class="mid_table_content">${dfl.distributiveProfitsFormated}</td>
		  <td class="mid_table_content">${dfl.netIncomeAttributableToShareholdersFormated}</td>
		  <td class="mid_table_content">${dfl.growthRateOfNetIncomeAttributableToShareholdersFormated}</td>
		  <td class="mid_table_content">${dfl.financialReportDividendsFormated}</td>
	      <td class="mid_table_content">${dfl.dividendRateFormated}</td>
	      <td class="mid_table_content">${dfl.dividendEveryTenSharesFormated}</td>
	      <td class="mid_table_content">${formattedGoodPrice}</td>
	      <td class="mid_table_content">${dividendFormatted}</td>
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
