<%@ page language="java" %>
<%@ page pageEncoding="UTF-8" %>
<%@ page contentType="text/html"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="company" %>
<%@ page import="report.bean.entity.*" %>
<%@ page import="report.bean.daolmp.*" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="company" %>
<jsp:useBean id="bs" class="report.bean.entity.BalanceSheet" scope="request"/>
<jsp:useBean id="pb" class="report.bean.entity.PageBean" scope="session"/>
<jsp:useBean id="rdi" class="report.bean.daolmp.ReportDaoImp" scope="request"/>
<html>
<head>
<meta charset="utf-8">
<title>财报数据维护</title>
<link href="${contextPath}styles/mid.css?v=<%=System.currentTimeMillis()%>"  rel="stylesheet" type="text/css">
</head>

<body>
	<div><company:head></company:head></div>
	<div class="mid_kong"></div>
	<table class="mid_table">
	<tr>
	<td style="width:140px;vertical-align:text-top;"><company:left02></company:left02></td>
	<td style="vertical-align:text-top;">
	<div class="mid_title">财报数据维护</div>
	<div class="mid_kong"></div>
	<form action="QueryReport" method="post">
	<div class="mid_div">
		<div class="mid_div01e">A股简称：</div>
		<div class="mid_div03"><input type="text" class="mid_box02" name="AShareName"></div>
		<div class="mid_div01e">A股代码：</div>
		<div class="mid_div03"><input type="text" class="mid_box02" name="AShareCode"></div>
		<div class="mid_div01">财报年份：</div>
	  	<div class="mid_div03"><input type="text" class="mid_box02" name="financialReportingYear"> </div>
	  	<div class="mid_div01">审计意见：</div>
	  	<div class="mid_div03"><input type="text" class="mid_box02" name="auditOpinion"> </div>
		<div class="mid_div01"><input type="submit" value="查询"></div>
	</div>
</form>
		<div class="mid_kong"></div>
<table class="mid_table">
	  <tbody>
	    <tr>
	      <th scope="col"  class="mid_table_title">序号</th>
	      <th scope="col"  class="mid_table_title">财报编号</th>
	      <th scope="col" class="mid_table_title">A股代码</th>
	      <th scope="col" class="mid_table_title">A股简称</th>
	      <th scope="col" class="mid_table_title">财报年份</th>
	      <th scope="col" class="mid_table_title">审计意见</th>
	      <th scope="col" class="mid_table_title" style="width:90px;">操作</th>
        </tr>
        <c:forEach var="rp" items="${bsList}" varStatus="xuhao" begin="${pb.startRows-1}" end="${pb.endRows}" >
	    <tr>
	    
	      <td class="mid_table_content">${xuhao.count}</td>
	      <td class="mid_table_content"><a href="BalanceSheetDetail?financialReportingNo=${rp.financialReportingNo}" target="blank">${rp.financialReportingNo}</a></td>
	      <td class="mid_table_content">${rp.AShareCode}</td>
	      <td class="mid_table_content">${rp.AShareName}</td>
	      <td class="mid_table_content">${rp.financialReportingYear}</td>
	      <td class="mid_table_content">${rp.auditOpinion}</td>
	      <td class="mid_table_content" style="width:90px;">
			  <div class="mid_table_operate">
			  <a href="BalanceSheetDetailForEdit?financialReportingNo=${rp.financialReportingNo}" target="blank">修改</a>
			  			    |  
			  <a href="DelReport?financialReportingNo=${rp.financialReportingNo}">删除</a>
			  </div></td>
        </tr>
	 </c:forEach>
      </tbody>
</table>
</td>
	</tr>
	</table>
	<div class='message_font'>${a}</div>
	<div><company:page></company:page></div>
	<div class="mid_kong"></div>
<div><company:end></company:end></div>
</body>
</html>
