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
	<div class="mid_title1">费用率情况（金额单位：元人民币）</div>
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
	     	<td class="mid_table_content"><a href="IndicatorDetailForLook?indicatorID=ID064"  target="_blank">a.销售费用</a></td>
	    	<c:forEach var="rsf" items="${rsfList}">
	    		<td class="mid_table_content"><div>${rsf.sellingExpensesFormated}</div></td>
	    	</c:forEach>
       	</tr>
       	<tr>
		 	<td class="mid_table_content">2</td>
		 	<td class="mid_table_content"><a href="IndicatorDetailForLook?indicatorID=ID065"  target="_blank">销售费用率</a></td>
		 	<c:forEach var="rsf" items="${rsfList}">
		 		<c:set var="scopeOperation" value="0.15" />
		 		<c:set var="salesExpenseRate" value="${fn:substring(rsf.salesExpenseRateFormated, 0, fn:length(rsf.salesExpenseRateFormated) - 1)}" /> <!-- 提取百分数中的数字部分 -->
		 		<c:choose>
		 			<c:when test="${salesExpenseRate/100 > scopeOperation}">
	    			 	<td class="mid_table_content"><div style="color: red; font-weight: bold;">${rsf.salesExpenseRateFormated}</div></td>
	    			</c:when>
	    			<c:otherwise>
	    			  	<td class="mid_table_content"><div>${rsf.salesExpenseRateFormated}</div></td>
	    			</c:otherwise>
	    		</c:choose>
	    	</c:forEach>
        	</tr>
       	<tr>
	     	<td class="mid_table_content">3</td>
	     	<td class="mid_table_content"><a href="IndicatorDetailForLook?indicatorID=ID066"  target="_blank">b.管理费用</a></td>
	    	<c:forEach var="rsf" items="${rsfList}">
	    		<td class="mid_table_content"><div>${rsf.overheadFormated}</div></td>
	    	</c:forEach>
       	</tr>
		<tr>
		 	<td class="mid_table_content">4</td>
		 	<td class="mid_table_content"><a href="IndicatorDetailForLook?indicatorID=ID067"  target="_blank">管理费用率</a></td>
		 	<c:forEach var="rsf" items="${rsfList}">
		 		<c:set var="scopeOperation" value="0.1" />
		 		<c:set var="managementExpenseRate" value="${fn:substring(rsf.managementExpenseRateFormated, 0, fn:length(rsf.managementExpenseRateFormated) - 1)}" /> <!-- 提取百分数中的数字部分 -->
		 		<c:choose>
		 			<c:when test="${managementExpenseRate/100 > scopeOperation}">
	    			 	<td class="mid_table_content"><div style="color: red; font-weight: bold;">${rsf.managementExpenseRateFormated}</div></td>
	    			</c:when>
	    			<c:otherwise>
	    			  	<td class="mid_table_content"><div>${rsf.managementExpenseRateFormated}</div></td>
	    			</c:otherwise>
	    		</c:choose>
	    	</c:forEach>
        </tr>
       <tr>
	     	<td class="mid_table_content">5</td>
	     	<td class="mid_table_content"><a href="IndicatorDetailForLook?indicatorID=ID068"  target="_blank">c.研发费用</a></td>
	    	<c:forEach var="rsf" items="${rsfList}">
	    		<td class="mid_table_content"><div>${rsf.researchAndDevelopmentFormated}</div></td>
	    	</c:forEach>
       	</tr>
       	<tr>
	     	<td class="mid_table_content">6</td>
	     	<td class="mid_table_content"><a href="IndicatorDetailForLook?indicatorID=ID069"  target="_blank">研发费用率</a></td>
	    	<c:forEach var="rsf" items="${rsfList}">
	    		<td class="mid_table_content"><div>${rsf.researchAndDevelopmentRateFormated}</div></td>
	    	</c:forEach>
       	</tr>
       	<tr>
	     	<td class="mid_table_content">7</td>
	     	<td class="mid_table_content"><a href="IndicatorDetailForLook?indicatorID=ID070"  target="_blank">d.财务费用</a></td>
	    	<c:forEach var="rsf" items="${rsfList}">
	    		<td class="mid_table_content"><div>${rsf.financialExpensesFormated}</div></td>
	    	</c:forEach>
       	</tr>
       	<tr>
	     	<td class="mid_table_content">8</td>
	     	<td class="mid_table_content"><a href="IndicatorDetailForLook?indicatorID=ID057"  target="_blank">e.营业收入</a></td>
	    	<c:forEach var="rsf" items="${rsfList}">
	    		<td class="mid_table_content"><div>${rsf.operatingRevenueFormated}</div></td>
	    	</c:forEach>
       	</tr>
       	<tr>
		 	<td class="mid_table_content">9</td>
		 	<td class="mid_table_content"><a href="IndicatorDetailForLook?indicatorID=ID071"  target="_blank">费用率=(a+b+c+d)÷e×100%</a></td>
		 	<c:forEach var="rsf" items="${rsfList}">
		 		<c:set var="scopeOperation" value="0.15" />
		 		<c:set var="expense" value="${fn:substring(rsf.expenseFormated, 0, fn:length(rsf.expenseFormated) - 1)}" /> <!-- 提取百分数中的数字部分 -->
		 		<c:choose>
		 			<c:when test="${expense/100 > scopeOperation}">
	    			 	<td class="mid_table_content"><div style="color: red; font-weight: bold;">${rsf.expenseFormated}</div></td>
	    			</c:when>
	    			<c:otherwise>
	    			  	<td class="mid_table_content"><div>${rsf.expenseFormated}</div></td>
	    			</c:otherwise>
	    		</c:choose>
	    	</c:forEach>
        </tr>
        <tr>
		 	<td class="mid_table_content">10</td>
		 	<td class="mid_table_content"><a href="IndicatorDetailForLook?indicatorID=ID072"  target="_blank">费用率占毛利率的比率</a></td>
		 	<c:forEach var="rsf" items="${rsfList}">
		 		<c:set var="scopeOperation" value="0.4" />
		 		<c:set var="expenseRateToGrossProfitMargin" value="${fn:substring(rsf.expenseRateToGrossProfitMarginFormated, 0, fn:length(rsf.expenseRateToGrossProfitMarginFormated) - 1)}" /> <!-- 提取百分数中的数字部分 -->
		 		<c:choose>
		 			<c:when test="${expenseRateToGrossProfitMargin/100 > scopeOperation}">
	    			 	<td class="mid_table_content"><div style="color: red; font-weight: bold;">${rsf.expenseRateToGrossProfitMarginFormated}</div></td>
	    			</c:when>
	    			<c:otherwise>
	    			  	<td class="mid_table_content"><div>${rsf.expenseRateToGrossProfitMarginFormated}</div></td>
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
            type: 'bar',
            data: {
                labels: yearList,
                datasets: [{
                    label: '销售费用',
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
                    label: '销售费用率',
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
            type: 'bar',
            data: {
                labels: yearList,
                datasets: [{
                    label: '管理费用',
                    data: chartData3.slice(0, yearList.length),
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
        var ctx4 = document.getElementById('myChart4').getContext('2d');
        var myChart4 = new Chart(ctx4, {
            type: 'line',
            data: {
                labels: yearList,
                datasets: [
                {
                    label: '管理费用率',
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
            type: 'bar',
            data: {
                labels: yearList,
                datasets: [{
                    label: '研发费用',
                    data: chartData5.slice(0, yearList.length),
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
        var ctx6 = document.getElementById('myChart6').getContext('2d');
        var myChart6 = new Chart(ctx6, {
            type: 'line',
            data: {
                labels: yearList,
                datasets: [
                {
                    label: '研发费用率',
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
            type: 'line',
            data: {
                labels: yearList,
                datasets: [
                {
                    label: '费用率',
                    data: chartData7.slice(0, yearList.length), // 只显示与年份对应的数据
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
        var ctx8 = document.getElementById('myChart8').getContext('2d');
        var myChart8 = new Chart(ctx8, {
            type: 'line',
            data: {
                labels: yearList,
                datasets: [
                {
                    label: '费用率占毛利率的比率',
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
