<%@ page language="java" %>
<%@ page pageEncoding="UTF-8" %>
<%@ page contentType="text/html"%>

<%@ page import="report.bean.entity.*" %>
<%@ page import="report.bean.daolmp.*" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="company" %>

<html>
<head>
<meta charset="utf-8">
<title>财报数据分析</title>

<link href="${contextPath}styles/mid.css?v=<%=System.currentTimeMillis()%>"  rel="stylesheet" type="text/css">
</head>


<body>
	<div><company:head></company:head></div>
	<div class="mid_kong"></div>
	
	<form>
	<table class="mid_table">
	<tr>
	<td style="width:140px;vertical-align:text-top;"><company:left02></company:left02></td>
	<td>

	<div class="mid_title"><div class="mid_title_text">财报数据分析:</div><div class="mid_title_text">${rf.AShareName}</div></div>

	<div><company:statistics></company:statistics></div>
	<div class="mid_title1">归母净利润情况（金额单位：元人民币）</div>
	<table style="width:97%">
	   <tbody>
	   	<tr>
	   		<th scope="col"  class="mid_table_title" style="width:4%">序号</th>
	     	<th scope="col" class="mid_table_title" style="width:13%">分析项目</th>
	    	<c:forEach var="rsf" items="${rsfList}">
	    	<th scope="col" class="mid_table_title"  style="width:14%"><div>${rsf.reportYear}</div></th>
	    	</c:forEach>
       	</tr>
       	
	   	<tr>
	     	<td class="mid_table_content">1</td>
	     	<td class="mid_table_content"><a href="IndicatorDetailForLook?indicatorID=ID087"  target="_blank">归属于母公司所有者的净利润</a></td>
	    	<c:forEach var="rsf" items="${rsfList}">
	    		<td class="mid_table_content"><div>${rsf.netIncomeAttributableToShareholdersFormated}</div></td>
	    	</c:forEach>
       	</tr>
       	<tr>
		 	<td class="mid_table_content">2</td>
		 	<td class="mid_table_content"><a href="IndicatorDetailForLook?indicatorID=ID088"  target="_blank">归母净利润增长率</a></td>
		 	<c:forEach var="rsf" items="${rsfList}">
		 		<c:set var="scopeOperation" value="0.1" />
		 		<c:set var="growthRateOfNetIncomeAttributableToShareholders" value="${fn:substring(rsf.growthRateOfNetIncomeAttributableToShareholdersFormated, 0, fn:length(rsf.growthRateOfNetIncomeAttributableToShareholdersFormated) - 1)}" /> <!-- 提取百分数中的数字部分 -->
		 		<c:choose>
		 			<c:when test="${growthRateOfNetIncomeAttributableToShareholders/100 < scopeOperation}">
	    			 	<td class="mid_table_content"><div style="color: red; font-weight: bold;">${rsf.growthRateOfNetIncomeAttributableToShareholdersFormated}</div></td>
	    			</c:when>
	    			<c:otherwise>
	    			  	<td class="mid_table_content"><div>${rsf.growthRateOfNetIncomeAttributableToShareholdersFormated}</div></td>
	    			</c:otherwise>
	    		</c:choose>
	    	</c:forEach>
        </tr>
       	<tr>
		 	<td class="mid_table_content">3</td>
		 	<td class="mid_table_content"><a href="IndicatorDetailForLook?indicatorID=ID089"  target="_blank">ROE</a></td>
		 	<c:forEach var="rsf" items="${rsfList}">
		 		<c:set var="scopeOperation" value="0.2" />
		 		<c:set var="ROE" value="${fn:substring(rsf.ROEFormated, 0, fn:length(rsf.ROEFormated) - 1)}" /> <!-- 提取百分数中的数字部分 -->
		 		<c:choose>
		 			<c:when test="${ROE/100 < scopeOperation}">
	    			 	<td class="mid_table_content"><div style="color: red; font-weight: bold;">${rsf.ROEFormated}</div></td>
	    			</c:when>
	    			<c:otherwise>
	    			  	<td class="mid_table_content"><div>${rsf.ROEFormated}</div></td>
	    			</c:otherwise>
	    		</c:choose>
	    	</c:forEach>
        </tr>
       	
        
       </tbody>
</table>

<div class="mid_kong"></div>
<div class="mid_kong"></div>
<table style="width: 98%; border:0px; cellspacing:0px; cellpadding:0px">
  <tbody>
    <tr>
      	<th scope="col" style="width: 50%">
            <canvas id="myChart1"></canvas>
        </th>
     	 <th scope="col">
			<canvas id="myChart2"></canvas>
      	</th>
      	
   	</tr>
 	<tr>
      	<th scope="col" style="width: 50%">
            <canvas id="myChart3"></canvas>
        </th>
     	
   	</tr>


  </tbody>
</table>
<div class="mid_kong"></div>
		<table class="mid_table">
				<tbody>
					<tr>
						<th scope="col"  class="mid_table_title" style="width:5%;">指标ID</th>
						<th scope="col" class="mid_table_title" style="width:15%;">指标名称</th>
						<th scope="col" class="mid_table_title" style="width:15%;">财报年份</th>
						<th scope="col" class="mid_table_title" style="width:10%;">风险等级</th>
						<th scope="col" class="mid_table_title" style="width:68%;">指标分析</th>
					</tr>
					<c:forEach var="anl" items="${anList}" >
	    			<tr>
	    			<c:set var="indicatorID" value="${anl.indicatorID}" />
	     				<td class="mid_table_content"><a href="IndicatorDetailForLook?indicatorID=${anl.indicatorID}"  target="_blank">${anl.indicatorID}</a></td>
	      				<td class="mid_table_content">${anl.indicatorName}</td>
	      				<td class="mid_table_content">${anl.reportYear}</td>
		 				<c:set var="scopeOperation1" value="风险指标" />
	      				<c:set var="scopeOperation2" value="非优质指标" />
		 				<c:set var="statisticsGrade" value="${anl.statisticsGrade}" />
		 				<c:choose>
		 					<c:when test="${statisticsGrade == scopeOperation1}">
	    			 			<td class="mid_table_content"><div style="color: red; font-weight: bold;">${anl.statisticsGrade}</div></td>
	    					</c:when>
	    					<c:when test="${statisticsGrade == scopeOperation2}">
	    			 			<td class="mid_table_content"><div style="color: blue; font-weight: bold;">${anl.statisticsGrade}</div></td>
	    					</c:when>
	    					<c:otherwise>
	    			  			<td class="mid_table_content">${anl.statisticsGrade}</td>
	    					</c:otherwise>
	    				</c:choose>
	      				
	      				
	      				<td class="mid_table_content" style="text-align: left; font-size:13px; line-height:22px; padding-top:10px; padding-bottom:10px;">${anl.abnormalAnalysis}</td>
	      				
        </tr>
	 </c:forEach>
				</tbody>
			</table>
			</tr>
		</tbody>
	</table>
	
	</form>
	<div class="mid_kong"></div>
	<!-- 引入 Chart.js 库 -->
<script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
	<script>
	var chartData1 = ${chartData1}; 
	var chartData2 = ${chartData2}; 
	var chartData3 = ${chartData3}; 


    var yearList = ${yearList}; 

    document.addEventListener("DOMContentLoaded", function() {
             
        
        var ctx1 = document.getElementById('myChart1').getContext('2d');
        var myChart1 = new Chart(ctx1, {
            type: 'bar',
            data: {
                labels: yearList,
                datasets: [{
                    label: '归属于母公司所有者的净利润',
                    data: chartData1.slice(0, yearList.length),
                    backgroundColor: 'rgba(83, 106, 152, 0.3)', // 设置浅蓝透明背景色
                    borderColor: 'rgba(83, 99, 132, 1)',
                    borderWidth: 1
                }]
            },
            options: {
                scales: {
                    y: {
                        beginAtZero: true,
                        title: {
                            display: true,
                            text: '金额'
                        }
                    }
                }
            }
        });

        var ctx2 = document.getElementById('myChart2').getContext('2d');
        var myChart2 = new Chart(ctx2, {
            type: 'line',
            data: {
                labels: yearList,
                datasets: [
                {
                    label: '归母净利润增长率',
                    data: chartData2.slice(0, yearList.length), // 只显示与年份对应的数据
                    borderColor: 'rgba(240, 99, 132, 1)',
                    borderWidth: 1
                }]
            },
            options: {
                scales: {
                    y: {
                        beginAtZero: true,
                        title: {
                            display: true,
                            text: '%'
                        }
                    }
                }
            }
        });
        
        var ctx3 = document.getElementById('myChart3').getContext('2d');
        var myChart3 = new Chart(ctx3, {
            type: 'line',
            data: {
                labels: yearList,
                datasets: [
                {
                    label: 'ROE',
                    data: chartData3.slice(0, yearList.length), // 只显示与年份对应的数据
                    borderColor: 'rgba(240, 99, 132, 1)',
                    borderWidth: 1
                }]
            },
            options: {
                scales: {
                    y: {
                        beginAtZero: true,
                        title: {
                            display: true,
                            text: '%'
                        }
                    }
                }
            }
        });
        
    });
	</script>
<div><company:end></company:end></div>
</body>
</html>
