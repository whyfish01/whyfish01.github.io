<%@ tag pageEncoding="utf-8"%>
<html>
<head>
<meta charset="utf-8">
<title>end</title>
<link href="styles/end.css" rel="stylesheet" type="text/css">
</head>

<body>
	<div class="mid_div">
		<a href="GetTotalAssetsForYears?AShareCode=${rf.AShareCode}&AShareName=${rf.AShareName}" target="_self"><input type="button" class="mid_an04" value="总资产情况"></a>
		<a href="GetAssetLiabilityRatioForYears?AShareCode=${rf.AShareCode}&AShareName=${rf.AShareName}" target="_self"><input type="button" class="mid_an04" value="资产负债率情况"></a>
		<a href="GetDebtRepaymentRiskForYears?AShareCode=${rf.AShareCode}&AShareName=${rf.AShareName}" target="_self"><input type="button" class="mid_an04" value="有息负债与货币资金"></a>
		<a href="GetQuasiMonetaryForYears?AShareCode=${rf.AShareCode}&AShareName=${rf.AShareName}" target="_self"><input type="button" class="mid_an04" value="准货币资金"></a>
		<a href="GetOccupySomeoneElseFundsForYears?AShareCode=${rf.AShareCode}&AShareName=${rf.AShareName}" target="_self"><input type="button" class="mid_an04" value="应收预付和应付预收"></a>
		<a href="GetTotalTFxedAssetsForYears?AShareCode=${rf.AShareCode}&AShareName=${rf.AShareName}" target="_self"><input type="button" class="mid_an04" value="固定资产"></a>
		<a href="GetInvestmentAssetRatioForYears?AShareCode=${rf.AShareCode}&AShareName=${rf.AShareName}" target="_self"><input type="button" class="mid_an04" value="投资类资产"></a>
	</div>
	<div class="mid_div">
		<a href="GetProportionOfOtherAssetsForYears?AShareCode=${rf.AShareCode}&AShareName=${rf.AShareName}" target="_self"><input type="button" class="mid_an04" value="其他资产"></a>
		<a href="GetPayrollPayableForYears?AShareCode=${rf.AShareCode}&AShareName=${rf.AShareName}" target="_self"><input type="button" class="mid_an04" value="职工薪酬"></a>
		<a href="GetRevenueGrowthRateForYears?AShareCode=${rf.AShareCode}&AShareName=${rf.AShareName}" target="_self"><input type="button" class="mid_an04" value="营业收入及增长"></a>
		<a href="GetGrossMarginForYears?AShareCode=${rf.AShareCode}&AShareName=${rf.AShareName}" target="_self"><input type="button" class="mid_an04" value="毛利率"></a>
		<a href="GetExpenseForYears?AShareCode=${rf.AShareCode}&AShareName=${rf.AShareName}" target="_self"><input type="button" class="mid_an04" value="费用率"></a>
		<a href="GetOperatingMarginForYears?AShareCode=${rf.AShareCode}&AShareName=${rf.AShareName}" target="_self"><input type="button" class="mid_an04" value="利润构成分析"></a>
		<a href="GetNetProfitForYears?AShareCode=${rf.AShareCode}&AShareName=${rf.AShareName}" target="_self"><input type="button" class="mid_an04" value="净利润"></a>
	</div>
	<div class="mid_div">
		<a href="GetRoeForYears?AShareCode=${rf.AShareCode}&AShareName=${rf.AShareName}" target="_self"><input type="button" class="mid_an04" value="归母净利润"></a>
		<a href="GetRemainingCashForYears?AShareCode=${rf.AShareCode}&AShareName=${rf.AShareName}" target="_self"><input type="button" class="mid_an04" value="现金流量净额"></a>
		<a href="GetcashPaidAndReceivedForYears?AShareCode=${rf.AShareCode}&AShareName=${rf.AShareName}" target="_self"><input type="button" class="mid_an04" value="现金收支比较"></a>
		<a href="GetDividendRateForYears?AShareCode=${rf.AShareCode}&AShareName=${rf.AShareName}" target="_self"><input type="button" class="mid_an04" value="分红率"></a>
		<a href="GetCompanyTypeForYears?AShareCode=${rf.AShareCode}&AShareName=${rf.AShareName}" target="_self"><input type="button" class="mid_an04" value="公司类型"></a>
		<a href="GetNetIncreaseInCashForYears?AShareCode=${rf.AShareCode}&AShareName=${rf.AShareName}" target="_self"><input type="button" class="mid_an04" value="现金及等价物净增额"></a>
	</div>
</body>
</html>
