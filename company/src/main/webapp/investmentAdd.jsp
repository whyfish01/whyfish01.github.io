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
<title>添加投资信息</title>
<link href="${contextPath}styles/mid.css?v=<%=System.currentTimeMillis()%>"  rel="stylesheet" type="text/css">
</head>

<body>
	<div><company:head></company:head></div>
	<div class="mid_kong"></div>
	<table class="mid_table">
	<tr>
	<td style="width:140px;vertical-align:text-top;"><company:left04></company:left04></td>
	<td style="vertical-align:text-top;">
	<div class="mid_title">添加投资信息</div>
	<div class="mid_kong"></div>
	<form action="InsertInvestment" method="post">
		
	<div class="mid_div">
		<div class="mid_div01a">A股代码：</div>
		<div class="mid_div03"><input type="text" class="mid_box02" name="AShareCode"></div>
		<div class="mid_div01a">A股简称：</div>
		<div class="mid_div03"><input type="text" class="mid_box02" name="AShareName"></div>
		<div class="mid_div01a">财报年份：</div>
		<div class="mid_div03"><input type="text" class="mid_box02" name="reportYear"></div>
	</div>
    
	<div class="mid_div">
    <div class="mid_div01a">买入股票单价：</div>
    <div class="mid_div03"><input type="text" class="mid_box02" name="unitPrice" id="unitPrice" oninput="calculateTotalCost()"></div>
    <div class="mid_div01a">持股数量：</div>
    <div class="mid_div03"><input type="text" class="mid_box02" name="numberOfStocks" id="numberOfStocks" oninput="calculateTotalCost()"></div>

    <div class="mid_div01a">买入总成本：</div>
    <div class="mid_div03"><input type="text" class="mid_box02" name="totalCost" id="totalCost"></div>
	</div>
	
	<script>
    function calculateTotalCost() {
        var unitPrice = parseFloat(document.getElementById("unitPrice").value);
        var numberOfStocks = parseFloat(document.getElementById("numberOfStocks").value);

        var totalCost = unitPrice * numberOfStocks;

        document.getElementById("totalCost").value = totalCost.toFixed(2) ;
        calculateYield();
        calculateEstimatedTotalCost();
        calculateEstimatedUnitPrice();
    }
	</script>

	<div class="mid_div">
		<div class="mid_div01a">每十股分红：</div>
		<div class="mid_div03"><input type="text" class="mid_box02" name="dividendEveryTenShares" id="dividendEveryTenShares" oninput="calculateDividendIncome()"></div>
		<div class="mid_div01a">分红总收益：</div>
		<div class="mid_div03"><input type="text" class="mid_box02" name="dividendIncome" id="dividendIncome"></div>
		<div class="mid_div01a">股息率：</div>
		<div class="mid_div03"><input type="text" class="mid_box02" name="yield" id="yield"></div>
	</div>
	
	<script>
    function calculateDividendIncome() {
        var dividendEveryTenShares = parseFloat(document.getElementById("dividendEveryTenShares").value);
        var numberOfStocks = parseFloat(document.getElementById("numberOfStocks").value);

        var dividendIncome = dividendEveryTenShares/10 * numberOfStocks;

        document.getElementById("dividendIncome").value = dividendIncome.toFixed(2) ;
        
     // Call calculateYield function to update yield value
        calculateYield();
        calculateEstimatedTotalCost();
        calculateEstimatedUnitPrice();
    }
    
    function calculateYield(){
    	var dividendIncome = parseFloat(document.getElementById("dividendIncome").value);
    	var totalCost = parseFloat(document.getElementById("totalCost").value);
    	
    	var yield = (dividendIncome/totalCost) * 100;
    	document.getElementById("yield").value = yield.toFixed(2)+"%";
    }
    function calculateEstimatedTotalCost() {
    	var totalCost = parseFloat(document.getElementById("totalCost").value);
        var dividendIncome = parseFloat(document.getElementById("dividendIncome").value);

        var estimatedTotalCost = totalCost-dividendIncome;

        document.getElementById("estimatedTotalCost").value = estimatedTotalCost.toFixed(2);
        calculateEstimatedUnitPrice();
    }
    
    function calculateEstimatedUnitPrice(){
    	var estimatedTotalCost = parseFloat(document.getElementById("estimatedTotalCost").value);
    	var numberOfStocks = parseFloat(document.getElementById("numberOfStocks").value);
    	
    	var estimatedUnitPrice = estimatedTotalCost/numberOfStocks;
    	document.getElementById("estimatedUnitPrice").value = estimatedUnitPrice.toFixed(2);
    }
    function calculateCurrentTotalCost(){
    	var currentUnitPrice = parseFloat(document.getElementById("currentUnitPrice").value);
    	var numberOfStocks = parseFloat(document.getElementById("numberOfStocks").value);
    	
    	var currentTotalCost = currentUnitPrice*numberOfStocks;
    	document.getElementById("currentTotalCost").value = currentTotalCost.toFixed(2);
    	calculateIncomeFromChangesInFairValue()
    }
	function calculateIncomeFromChangesInFairValue(){
    	var estimatedTotalCost = parseFloat(document.getElementById("estimatedTotalCost").value);
    	var currentTotalCost = parseFloat(document.getElementById("currentTotalCost").value);
    	
    	var incomeFromChangesInFairValue = currentTotalCost-estimatedTotalCost;
    	document.getElementById("incomeFromChangesInFairValue").value = incomeFromChangesInFairValue.toFixed(2);
	}
	</script>
	
	<div class="mid_div">
		<div class="mid_div01a">分红后总成本：</div>
		<div class="mid_div03"><input type="text" class="mid_box02" name="estimatedTotalCost" id="estimatedTotalCost" ></div>
		<div class="mid_div01a">分红后单价：</div>
		<div class="mid_div03"><input type="text" class="mid_box02" name="estimatedUnitPrice" id="estimatedUnitPrice"></div>
		<div class="mid_div01a">投资标的当前股价：</div>
		<div class="mid_div03"><input type="text" class="mid_box02" name="currentUnitPrice" id="currentUnitPrice"   oninput="calculateCurrentTotalCost()"></div>
		
	</div>
	
	<div class="mid_div">
		<div class="mid_div01a">投资当前市值：</div>
		<div class="mid_div03"><input type="text" class="mid_box02" name="currentTotalCost" id="currentTotalCost"></div>
		<div class="mid_div01a">公允价值变动收益：</div>
		<div class="mid_div03"><input type="text" class="mid_box02" name="incomeFromChangesInFairValue" id="incomeFromChangesInFairValue"></div>
		<div class="mid_div01a">是否卖出：</div>
		<div class="mid_div03">
		<select name="whetherToSell" id="whetherToSell" class="mid_box02" oninput="calculateRealReturn()">
		<option></option>
		<option value="是">是</option>
		<option value="否">否</option>
		</select>
		</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">卖出时间：</div>
		<div class="mid_div03"><input type="text" class="mid_box02" name="sellTime"></div>
		<div class="mid_div01a">卖出数量：</div>
		<div class="mid_div03"><input type="text" class="mid_box02" name="sellNumbers" id="sellNumbers" oninput="calculateRealReturn()"></div>
		<div class="mid_div01a">卖出价格：</div>
		<div class="mid_div03"><input type="text" class="mid_box02" name="sellPrice" id="sellPrice" oninput="calculateRealReturn()"></div>
	</div>
	
	<div class="mid_div">
		<div class="mid_div01a">投资实际收益：</div>
		<div class="mid_div03"><input type="text" class="mid_box02" name="realReturn" id="realReturn" ></div>
		<div class="mid_div01a">实际收益率：</div>
		<div class="mid_div03"><input type="text" class="mid_box02" name="rateOfRealReturn" id="rateOfRealReturn"></div>
	</div>
	<script>
	function calculateRealReturn() {
	    var whetherToSell = document.getElementById("whetherToSell").value;
	    var sellNumbers = parseFloat(document.getElementById("sellNumbers").value);
	    var sellPrice = parseFloat(document.getElementById("sellPrice").value);
	    var dividendIncome = parseFloat(document.getElementById("dividendIncome").value);
	    var estimatedUnitPrice = parseFloat(document.getElementById("estimatedUnitPrice").value);
	    var sellNumbers = parseFloat(document.getElementById("sellNumbers").value);
        var sellPrice= parseFloat(document.getElementById("sellPrice").value);
	    var realReturn;

	    if (whetherToSell === "否") {
	        sellNumbers = 0;
	        sellPrice = 0.00;
	        realReturn = dividendIncome;
			
	        document.getElementById("sellPrice").value = 0.00;
	        document.getElementById("sellNumbers").value =0;
	        document.getElementById("realReturn").value = realReturn.toFixed(2);
	        calculateRateOfRealReturn();

	        return; // 提前结束函数执行
	    }
	    
	   

	    // Calculate real return based on sellNumbers and sellPrice
	    var sellTotalPrice = sellPrice * sellNumbers;
	    var cost = estimatedUnitPrice * sellNumbers;
	    realReturn = (sellTotalPrice - cost) + dividendIncome;
		
	    document.getElementById("realReturn").value = realReturn.toFixed(2);
	    calculateRateOfRealReturn();
	}
	</script>
	<script>
	function calculateRateOfRealReturn() {
	    var yield = parseFloat(document.getElementById("yield").value);
	    var realReturn = parseFloat(document.getElementById("realReturn").value);
	    var sellNumbers = parseFloat(document.getElementById("sellNumbers").value);
	    var estimatedUnitPrice = parseFloat(document.getElementById("estimatedUnitPrice").value);
	    var rateOfRealReturn;

	    var whetherToSell = document.getElementById("whetherToSell").value; // 获取是否卖出的值

	    if (whetherToSell === "否") {
	        rateOfRealReturn = yield;
	        document.getElementById("rateOfRealReturn").value = rateOfRealReturn.toFixed(2) + "%";
	        return; // 提前结束函数执行
	    }

	    var cost = estimatedUnitPrice * sellNumbers;
	    rateOfRealReturn = (realReturn / cost) * 100;
	    document.getElementById("rateOfRealReturn").value = rateOfRealReturn.toFixed(2) + "%";
	}
	</script>
<div class="mid_kong"></div><div class="mid_kong"></div><div class="mid_kong"></div>

	<div class="mid_div">
		<div class="mid_div06"><input type="submit" class="mid_an" value="保存"></div>	
	</div>				
	</form>
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