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
<title>财报数据分析</title>
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
<form action="QueryReportStatistics" method="post">
<table class="mid_table">
	<tr>
		<td style="width:140px;vertical-align:text-top;"><company:left02></company:left02></td>
		<td style="vertical-align:text-top;">
			<div class="mid_title">财报数据分析</div>
			<div class="mid_kong"></div>
	
			<div class="mid_div">
			<div class="mid_div01">A股代码：</div>
			<div class="mid_div03a"><input type="text" class="mid_box08" name="AShareCode"></div>
			<div class="mid_div01">A股简称：</div>
			<div class="mid_div03a"><input type="text" class="mid_box08" name="AShareName"></div>
			<div class="mid_div01">财报年份：</div>
			<div class="mid_div03a"><input type="text" class="mid_box08" name="financialReportingYear"></div>
			<div class="mid_div01">总资产></div>
			<div class="mid_div03a"><input type="text" class="mid_box08" name="totalAssets"></div>
			<div class="mid_div01">总资产增长率></div>
			<div class="mid_div03a"><input type="text" class="mid_box08" name="totalAssetsGrowthRate"></div>
			<div class="mid_div01">营收增长率></div>
			<div class="mid_div03a"><input type="text" class="mid_box08"  name="revenueGrowthRate"></div>
			</div>
	<div class="mid_div">
		<div class="mid_div01">资产负债率&lt;</div>
		<div class="mid_div03a"><input type="text" class="mid_box08" name="assetLiabilityRatio"></div>
		<div class="mid_div01">分红率></div>
		<div class="mid_div03a"><input type="text" class="mid_box08"  name="dividendRate"></div>
		<div class="mid_div01">毛利率></div>
		<div class="mid_div03a"><input type="text" class="mid_box08"  name="grossMargin"></div>
		<div class="mid_div01">净利润增长率></div>
		<div class="mid_div03a"><input type="text" class="mid_box08"  name="netProfitGrowthRate"></div>
		<div class="mid_div01">净利润现金比></div>
		<div class="mid_div03a"><input type="text" class="mid_box08"  name="netProfitCashRatio"></div>
		<div class="mid_div01">ROE></div>
		<div class="mid_div03a"><input type="text" class="mid_box08"  name="ROE"></div>
		
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
		<div class="mid_div01">所属区域：</div>
			<div class="mid_div03a"><input type="text" class="mid_box08" name="region"></div>
		
		<div class="mid_div01"><input type="submit" value="查询"></div>
	</div>
		<div class="mid_kong"></div>
<table  class="mid_table">
	  <tbody>
	    <tr>
	      <th scope="col"  class="mid_table_title">序号</th>
	      <th scope="col" class="mid_table_title">财报代码</th>
	      <th scope="col" class="mid_table_title">A股简称</th>
	      <th scope="col" class="mid_table_title">总资产</th>
	      <th scope="col" class="mid_table_title">总资产增长率</th>
	      <th scope="col" class="mid_table_title">营业收入增长率</th>
		  <th scope="col" class="mid_table_title">净利润增长率</th>
		  <th scope="col" class="mid_table_title">净利润现金比</th>
			  <th scope="col" class="mid_table_title">资产负债率</th>
			  <th scope="col" class="mid_table_title">毛利率</th>
			  <th scope="col" class="mid_table_title">ROE</th>
			  <th scope="col" class="mid_table_title">分红率</th>
			  <th scope="col" class="mid_table_title">公司类型</th>
	      <th scope="col" class="mid_table_title">操作</th>
        </tr>
        <c:forEach var="rsf" items="${rsfQueryList}" begin="${pb.startRows-1}" end="${pb.endRows}"  varStatus="status">
	    <tr>
	    <c:set var="AShareCode" value="${rsf.AShareCode}" />
		<c:set var="financialReportingYear" value="${rsf.financialReportingYear}" />
		<c:set var="AShareName" value="${rsf.AShareName}" />
	      <td class="mid_table_content">${status.index + 1}</td>
	      <td class="mid_table_content"><a href="ReportAnalysisForLook?AShareCode=${rsf.AShareCode}&financialReportingYear=${rsf.financialReportingYear}" target="_blank" >${rsf.AShareCode}${rsf.financialReportingYear}</a></td>
	      <td class="mid_table_content">${rsf.AShareName}</td>
	      <td class="mid_table_content">${rsf.totalAssetsFormated}</td>
	      <td class="mid_table_content">${rsf.totalAssetsGrowthRateFormated}</td>
		  <td class="mid_table_content">${rsf.revenueGrowthRateFormated}</td>
		  <td class="mid_table_content">${rsf.netProfitGrowthRateFormated}</td>
		  <td class="mid_table_content">${rsf.netProfitCashRatioFormated}</td>
	      <td class="mid_table_content">${rsf.assetLiabilityRatioFormated}</td>
	      <td class="mid_table_content">${rsf.grossMarginFormated}</td>
	      <td class="mid_table_content">${rsf.ROEFormated}</td>
	      <td class="mid_table_content">${rsf.dividendRateFormated}</td>
	      <td class="mid_table_content">${rsf.companyType}</td>
	      <td class="mid_table_content">

			  <div class="mid_table_operate">  

			  <a href="GetTotalAssetsForYears?AShareCode=${rsf.AShareCode}&AShareName=${rsf.AShareName}" target="_blank">指标</a>
			    |  
			  <a href="GetReportAnalysis?AShareCode=${rsf.AShareCode}&AShareName=${rsf.AShareName}&financialReportingYear=${rsf.financialReportingYear}"  target="_blank">分析</a>
			    |  
			  <a href="DelReportAnalysis?AShareCode=${rsf.AShareCode}&financialReportingYear=${rsf.financialReportingYear}" >删除</a>

			  </div></td>
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
