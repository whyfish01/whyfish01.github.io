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
<title>财报指标分析</title>
<link href="${contextPath}styles/mid.css?v=<%=System.currentTimeMillis()%>"  rel="stylesheet" type="text/css">
</head>

<body>
	<div><company:head></company:head></div>
	<div class="mid_kong"></div>
	
<table class="mid_table">
	<tr>
		<td style="width:140px;vertical-align:text-top;"><company:left02></company:left02></td>
		<td style="vertical-align:text-top;">
			<div class="mid_title">财报指标分析：
			<c:set var="AShareCode" value="${ra.AShareCode}" />
			<c:set var="reportYear" value="${ra.reportYear}" />
			<c:set var="AShareName" value="${ra.AShareName}" />
			
			<a href="GetReportAnalysisForAdd?AShareCode=${ra.AShareCode}&AShareName=${ra.AShareName}&reportYear=${ra.reportYear}" target="_blank"><input type="button" class="mid_an01a" value="增加指标分析"></a>
			</div>
			<div class="mid_title1">${ra.AShareName}   ${ra.reportYear}年财报分析</div>
			<table class="mid_table">
				<tbody>
					<tr>
						<th scope="col"  class="mid_table_title" style="width:5%;">指标ID</th>
						<th scope="col" class="mid_table_title" style="width:15%;">指标名称</th>
						<th scope="col" class="mid_table_title" style="width:10%;">风险等级</th>
						<th scope="col" class="mid_table_title" style="width:68%;">指标分析</th>
						<th scope="col" class="mid_table_title" style="width:2%;">操作</th>
					</tr>
					<c:forEach var="ral" items="${raList}" >
	    			<tr>
	    			<c:set var="indicatorID" value="${ral.indicatorID}" />
	     				<td class="mid_table_content"><a href="IndicatorDetailForLook?indicatorID=${ral.indicatorID}"  target="_blank">${ral.indicatorID}</a></td>
	      				<td class="mid_table_content">${ral.indicatorName}</td>
	      				<c:set var="scopeOperation1" value="风险指标" />
	      				<c:set var="scopeOperation2" value="非优质指标" />
		 				<c:set var="statisticsGrade" value="${ral.statisticsGrade}" />
		 				<c:choose>
		 					<c:when test="${statisticsGrade == scopeOperation1}">
	    			 			<td class="mid_table_content"><div style="color: red; font-weight: bold;">${ral.statisticsGrade}</div></td>
	    					</c:when>
	    					<c:when test="${statisticsGrade == scopeOperation2}">
	    			 			<td class="mid_table_content"><div style="color: blue; font-weight: bold;">${ral.statisticsGrade}</div></td>
	    					</c:when>
	    					<c:otherwise>
	    			  			<td class="mid_table_content">${ral.statisticsGrade}</td>
	    					</c:otherwise>
	    				</c:choose>
	      				
	      				
	      				<td class="mid_table_content" style="text-align: left; font-size:13px; line-height:22px; padding-top:10px; padding-bottom:10px;">${ral.abnormalAnalysis}</td>
	      				<td class="mid_table_content">
			  				<div class="mid_table_operate">  
			  				<c:set var="analysisId" value="${ral.analysisId}" />
			  					<a href="GetReportAnalysisForEdit?analysisId=${ral.analysisId}&AShareCode=${ra.AShareCode}&AShareName=${ra.AShareName}&reportYear=${ra.reportYear}"  target="_blank">修改</a>
			   					 |  
			 					<a href="DelReportAnalysisForOneId?analysisId=${ral.analysisId}"  target="_blank">删除</a>
			  				</div> 
			 			 </td>
        </tr>
	 </c:forEach>
				</tbody>
			</table>
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
