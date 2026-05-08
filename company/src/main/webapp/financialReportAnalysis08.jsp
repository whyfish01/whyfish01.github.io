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
	<div class="mid_title1">其他资产情况（金额单位：元人民币）</div>
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
	     	<td class="mid_table_content"><a href="IndicatorDetailForLook?indicatorID=ID042"  target="_blank">商誉</a></td>
	    	<c:forEach var="rsf" items="${rsfList}">
	    		<td class="mid_table_content"><div>${rsf.goodwillFormated}</div></td>
	    	</c:forEach>
       	</tr>
       	<tr>
		 	<td class="mid_table_content">2</td>
		 	<td class="mid_table_content"><a href="IndicatorDetailForLook?indicatorID=ID043"  target="_blank">商誉/总资产</a></td>
		 	<c:forEach var="rsf" items="${rsfList}">
		 		<c:set var="scopeOperation" value="0.03" />
		 		<c:set var="goodwillProportion" value="${fn:substring(rsf.goodwillProportionFormated, 0, fn:length(rsf.goodwillProportionFormated) - 1)}" /> <!-- 提取百分数中的数字部分 -->
		 		<c:choose>
		 			<c:when test="${goodwillProportion/100 > scopeOperation}">
	    			 	<td class="mid_table_content"><div style="color: red; font-weight: bold;">${rsf.goodwillProportionFormated}</div></td>
	    			</c:when>
	    			<c:otherwise>
	    			  	<td class="mid_table_content"><div>${rsf.goodwillProportionFormated}</div></td>
	    			</c:otherwise>
	    		</c:choose>
	    	</c:forEach>
        	</tr>
       	<tr>
	     	<td class="mid_table_content">3</td>
	     	<td class="mid_table_content"><a href="IndicatorDetailForLook?indicatorID=ID044"  target="_blank">无形资产</a></td>
	    	<c:forEach var="rsf" items="${rsfList}">
	    		<td class="mid_table_content"><div>${rsf.intangibleAssetsFormated}</div></td>
	    	</c:forEach>
       	</tr>
       	<tr>
		 	<td class="mid_table_content">4</td>
		 	<td class="mid_table_content"><a href="IndicatorDetailForLook?indicatorID=ID045"  target="_blank">无形资产/总资产</a></td>
		 	<c:forEach var="rsf" items="${rsfList}">
		 		<c:set var="scopeOperation" value="0.03" />
		 		<c:set var="theProportionOfIntangibleAssets" value="${fn:substring(rsf.theProportionOfIntangibleAssetsFormated, 0, fn:length(rsf.theProportionOfIntangibleAssetsFormated) - 1)}" /> <!-- 提取百分数中的数字部分 -->
		 		<c:choose>
		 			<c:when test="${theProportionOfIntangibleAssets/100 > scopeOperation}">
	    			 	<td class="mid_table_content"><div style="color: red; font-weight: bold;">${rsf.theProportionOfIntangibleAssetsFormated}</div></td>
	    			</c:when>
	    			<c:otherwise>
	    			  	<td class="mid_table_content"><div>${rsf.theProportionOfIntangibleAssetsFormated}</div></td>
	    			</c:otherwise>
	    		</c:choose>
	    	</c:forEach>
        	</tr>
       	<tr>
       	<tr>
	     	<td class="mid_table_content">5</td>
	     	<td class="mid_table_content"><a href="IndicatorDetailForLook?indicatorID=ID027"  target="_blank">应收账款</a></td>
	    	<c:forEach var="rsf" items="${rsfList}">
	    		<td class="mid_table_content"><div>${rsf.accountsReceivableFormated}</div></td>
	    	</c:forEach>
       	</tr>
       	<tr>
		 	<td class="mid_table_content">6</td>
		 	<td class="mid_table_content"><a href="IndicatorDetailForLook?indicatorID=ID046"  target="_blank">应收账款/总资产</a></td>
		 	<c:forEach var="rsf" items="${rsfList}">
		 		<c:set var="scopeOperation" value="0.2" />
		 		<c:set var="accountsReceivablePercentageOfRevenue" value="${fn:substring(rsf.accountsReceivablePercentageOfRevenueFormated, 0, fn:length(rsf.accountsReceivablePercentageOfRevenueFormated) - 1)}" /> <!-- 提取百分数中的数字部分 -->
		 		<c:choose>
		 			<c:when test="${accountsReceivablePercentageOfRevenue/100 > scopeOperation}">
	    			 	<td class="mid_table_content"><div style="color: red; font-weight: bold;">${rsf.accountsReceivablePercentageOfRevenueFormated}</div></td>
	    			</c:when>
	    			<c:otherwise>
	    			  	<td class="mid_table_content"><div>${rsf.accountsReceivablePercentageOfRevenueFormated}</div></td>
	    			</c:otherwise>
	    		</c:choose>
	    	</c:forEach>
        	</tr>
       	<tr>
       	<tr>
	     	<td class="mid_table_content">7</td>
	     	<td class="mid_table_content"><a href="IndicatorDetailForLook?indicatorID=ID028"  target="_blank">预付款项</a></td>
	    	<c:forEach var="rsf" items="${rsfList}">
	    		<td class="mid_table_content"><div>${rsf.prepaymentsPercentageOfRevenueFormated}</div></td>
	    	</c:forEach>
       	</tr>
       	<tr>
		 	<td class="mid_table_content">8</td>
		 	<td class="mid_table_content"><a href="IndicatorDetailForLook?indicatorID=ID047"  target="_blank">预付款项/总资产</a></td>
		 	<c:forEach var="rsf" items="${rsfList}">
		 		<c:set var="scopeOperation" value="0.01" />
		 		<c:set var="prepaymentsPercentageOfRevenue" value="${fn:substring(rsf.prepaymentsPercentageOfRevenueFormated, 0, fn:length(rsf.prepaymentsPercentageOfRevenueFormated) - 1)}" /> <!-- 提取百分数中的数字部分 -->
		 		<c:choose>
		 			<c:when test="${prepaymentsPercentageOfRevenue/100 > scopeOperation}">
	    			 	<td class="mid_table_content"><div style="color: red; font-weight: bold;">${rsf.prepaymentsPercentageOfRevenueFormated}</div></td>
	    			</c:when>
	    			<c:otherwise>
	    			  	<td class="mid_table_content"><div>${rsf.prepaymentsPercentageOfRevenueFormated}</div></td>
	    			</c:otherwise>
	    		</c:choose>
	    	</c:forEach>
        	</tr>
       	<tr>
       	<tr>
		 	<td class="mid_table_content">9</td>
		 	<td class="mid_table_content"><a href="IndicatorDetailForLook?indicatorID=ID048"  target="_blank">其他应收款/总资产</a></td>
		 	<c:forEach var="rsf" items="${rsfList}">
		 		<c:set var="scopeOperation" value="0.1" />
		 		<c:set var="otherReceivablesPercentageOfRevenue" value="${fn:substring(rsf.otherReceivablesPercentageOfRevenueFormated, 0, fn:length(rsf.otherReceivablesPercentageOfRevenueFormated) - 1)}" /> <!-- 提取百分数中的数字部分 -->
		 		<c:choose>
		 			<c:when test="${otherReceivablesPercentageOfRevenue/100 > scopeOperation}">
	    			 	<td class="mid_table_content"><div style="color: red; font-weight: bold;">${rsf.otherReceivablesPercentageOfRevenueFormated}</div></td>
	    			</c:when>
	    			<c:otherwise>
	    			  	<td class="mid_table_content"><div>${rsf.otherReceivablesPercentageOfRevenueFormated}</div></td>
	    			</c:otherwise>
	    		</c:choose>
	    	</c:forEach>
        	</tr>
       	<tr>
       	<tr>
	     	<td class="mid_table_content">10</td>
	     	<td class="mid_table_content"><a href="IndicatorDetailForLook?indicatorID=ID049"  target="_blank">存货</a></td>
	    	<c:forEach var="rsf" items="${rsfList}">
	    		<td class="mid_table_content"><div>${rsf.inventoryFormated}</div></td>
	    	</c:forEach>
       	</tr>
       	<tr>
		 	<td class="mid_table_content">11</td>
		 	<td class="mid_table_content"><a href="IndicatorDetailForLook?indicatorID=ID050"  target="_blank">存货/总资产</a></td>
		 	<c:forEach var="rsf" items="${rsfList}">
		 		<c:set var="scopeOperation" value="0.3" />
		 		<c:set var="inventoryToRevenueRatio" value="${fn:substring(rsf.inventoryToRevenueRatioFormated, 0, fn:length(rsf.inventoryToRevenueRatioFormated) - 1)}" /> <!-- 提取百分数中的数字部分 -->
		 		<c:choose>
		 			<c:when test="${inventoryToRevenueRatio/100 > scopeOperation}">
	    			 	<td class="mid_table_content"><div style="color: red; font-weight: bold;">${rsf.inventoryToRevenueRatioFormated}</div></td>
	    			</c:when>
	    			<c:otherwise>
	    			  	<td class="mid_table_content"><div>${rsf.inventoryToRevenueRatioFormated}</div></td>
	    			</c:otherwise>
	    		</c:choose>
	    	</c:forEach>
        	</tr>
	 		<tr>
		 	<td class="mid_table_content">12</td>
		 	<td class="mid_table_content"><a href="IndicatorDetailForLook?indicatorID=ID051"  target="_blank">存货增长率</a></td>
		 	<c:forEach var="rsf" items="${rsfList}">
		 		<c:set var="scopeOperation" value="0.1" />
		 		<c:set var="inventoryGrowthRate" value="${fn:substring(rsf.inventoryGrowthRateFormated, 0, fn:length(rsf.inventoryGrowthRateFormated) - 1)}" /> <!-- 提取百分数中的数字部分 -->
		 		<c:choose>
		 			<c:when test="${inventoryGrowthRate/100 > scopeOperation}">
	    			 	<td class="mid_table_content"><div style="color: red; font-weight: bold;">${rsf.inventoryGrowthRateFormated}</div></td>
	    			</c:when>
	    			<c:otherwise>
	    			  	<td class="mid_table_content"><div>${rsf.inventoryGrowthRateFormated}</div></td>
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
     	 <th scope="col">
			<canvas id="myChart4"></canvas>
      	</th>
   	</tr>
   	 <tr>
      	<th scope="col" style="width: 50%">
            <canvas id="myChart5"></canvas>
        </th>
     	 <th scope="col">
			<canvas id="myChart6"></canvas>
      	</th>
   	</tr>
   	 <tr>
      	<th scope="col" style="width: 50%">
            <canvas id="myChart7"></canvas>
        </th>
     	 <th scope="col">
			<canvas id="myChart8"></canvas>
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
	var chartData4 = ${chartData4}; 
	var chartData5 = ${chartData5};
	var chartData6 = ${chartData6};
	var chartData7 = ${chartData7};
	var chartData8 = ${chartData8};
    var yearList = ${yearList}; 

    document.addEventListener("DOMContentLoaded", function() {
             
        var ctx1 = document.getElementById('myChart1').getContext('2d');
        var myChart1 = new Chart(ctx1, {
            type: 'line',
            data: {
                labels: yearList,
                datasets: [
                {
                    label: '商誉/总资产',
                    data: chartData1.slice(0, yearList.length), // 只显示与年份对应的数据
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
        var ctx2 = document.getElementById('myChart2').getContext('2d');
        var myChart2 = new Chart(ctx2, {
            type: 'line',
            data: {
                labels: yearList,
                datasets: [
                {
                    label: '无形资产/总资产',
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
                    label: '应收账款/总资产',
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
        var ctx4 = document.getElementById('myChart4').getContext('2d');
        var myChart4 = new Chart(ctx4, {
            type: 'line',
            data: {
                labels: yearList,
                datasets: [
                {
                    label: '预付款项/总资产',
                    data: chartData4.slice(0, yearList.length), // 只显示与年份对应的数据
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
        var ctx5 = document.getElementById('myChart5').getContext('2d');
        var myChart5 = new Chart(ctx5, {
            type: 'line',
            data: {
                labels: yearList,
                datasets: [
                {
                    label: '其他应收款/总资产',
                    data: chartData5.slice(0, yearList.length), // 只显示与年份对应的数据
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
        var ctx6 = document.getElementById('myChart6').getContext('2d');
        var myChart6 = new Chart(ctx6, {
            type: 'line',
            data: {
                labels: yearList,
                datasets: [
                {
                    label: '存货/总资产',
                    data: chartData6.slice(0, yearList.length), // 只显示与年份对应的数据
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
        var ctx7 = document.getElementById('myChart7').getContext('2d');
        var myChart7 = new Chart(ctx7, {
            type: 'bar',
            data: {
                labels: yearList,
                datasets: [{
                    label: '存货',
                    data: chartData7.slice(0, yearList.length),
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
        var ctx8 = document.getElementById('myChart8').getContext('2d');
        var myChart8 = new Chart(ctx8, {
            type: 'line',
            data: {
                labels: yearList,
                datasets: [
                {
                    label: '存货增长率',
                    data: chartData8.slice(0, yearList.length), // 只显示与年份对应的数据
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
