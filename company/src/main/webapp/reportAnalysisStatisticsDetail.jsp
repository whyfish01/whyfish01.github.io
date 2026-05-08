<%@ page language="java" %>
<%@ page pageEncoding="UTF-8" %>
<%@ page contentType="text/html"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="company" %>
<%@ page import="report.bean.entity.*" %>
<%@ page import="report.bean.daolmp.*" %>
<%@ page import="java.util.ArrayList" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta charset="utf-8">
<title>分析指标查看</title>
<link href="${contextPath}styles/mid.css?v=<%=System.currentTimeMillis()%>"  rel="stylesheet" type="text/css">
</head>
<body>
	<div><company:head></company:head></div>
	<div class="mid_kong"></div>
	<table class="mid_table">
	<tr>
	<td style="width:140px;vertical-align:text-top;"><company:left02></company:left02></td>
	<td style="vertical-align:text-top;">
	<div class="mid_title">分析指标查看</div>

	<div class="mid_title1">企业：</div>
	<c:forEach var="cop" items="${copList}">
	<div class="mid_div">
		<div class="mid_div01d">A股简称：</div>
		<div class="mid_div03">${cop.AShareName}</div>
	
		<div class="mid_div01d">企业全称：</div>
		<div class="mid_div04a">${cop.companyName}</div>
		
	</div>
	</c:forEach>
	<c:forEach var="rsf" items="${rsfList}">
	<div class="mid_div">
		<div class="mid_div01d">A股代码：</div>
		<div class="mid_div03">${rsf.AShareCode}</div>
		<div class="mid_div01d">财报年份：</div>
		<div class="mid_div04a">${rsf.financialReportingYear}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">一级行业：</div>
		<div class="mid_div03">${rsf.primaryIndustry}</div>
		<div class="mid_div01d">二级行业：</div>
		<div class="mid_div04a">${rsf.secondaryIndustry}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">三级行业：</div>
		<div class="mid_div03">${rsf.thirdLevelIndustry}</div>
		<div class="mid_div01d">所属地区：</div>
		<div class="mid_div04a">${rsf.region}</div>
	</div>
	<div class="mid_title1">总资产情况：</div>
	
	<div class="mid_div">
		<div class="mid_div01d">a.总资产：</div>
		<div class="mid_div03">${rsf.totalAssetsFormated}</div>
		<div class="mid_div01d">总资产增长率：</div>
		<div class="mid_div03">${rsf.totalAssetsGrowthRateFormated}</div>
     </div>
	<div class="mid_div">
		<div class="mid_div01d">b.净资产(股东权益合计)：</div>
		<div class="mid_div03">${rsf.totalOwnersEquityFormated}</div>
		<div class="mid_div01d">权益乘数=a/b：</div>
		<div class="mid_div03">${rsf.equityMultiplierFormated}</div>
	</div>
		
		<div class="mid_title1">资产负债率情况：</div>

	<div class="mid_div">
		<div class="mid_div01d">总负债：</div>
		<div class="mid_div03">${rsf.totalLiabilitiesFormated}</div>
		<div class="mid_div01d">资产负债率：</div>
		<div class="mid_div03">${rsf.assetLiabilityRatioFormated}</div>
	</div>

	<div class="mid_title1">有息负债与货币资金：</div>

	<div class="mid_div">
		<div class="mid_div01d">a.货币资金：</div>
		<div class="mid_div03">${rsf.monetaryCapitalFormated}</div>
		<div class="mid_div01d">b.短期借款：</div>
		<div class="mid_div03">${rsf.shortTermBorrowingFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">c.一年内到期的非流动负债：</div>
		<div class="mid_div03">${rsf.nonCurrentLiabilitiesDueWithinOneYearFormated}</div>
		<div class="mid_div01d">d.长期借款：</div>
		<div class="mid_div03">${rsf.longTermLoanFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">e.应付债券：</div>
		<div class="mid_div03">${rsf.bondsPayableFormated}</div>
		<div class="mid_div01d">f.长期应付款：</div>
		<div class="mid_div03">${rsf.longTermPayablesFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">有息负债=b+c+d+e+f：</div>
		<div class="mid_div03">${rsf.interestBearingLiabilitiesFormated}</div>
		<div class="mid_div01d">净现金(货币资金-有息负债)：</div>
		<div class="mid_div03">${rsf.debtRepaymentRiskFormated}</div>
	</div>

	<div class="mid_title1">准货币资金：</div>

	<div class="mid_div">
		<div class="mid_div01d">a.货币资金：</div>
		<div class="mid_div03">${rsf.monetaryCapitalFormated}</div>
		<div class="mid_div01d">b.交易性金融资产中的理财产品：</div>
		<div class="mid_div03">${rsf.tradingFinancialAssetsManagementFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">c.其他流动资产的理财产品：</div>
		<div class="mid_div03">${rsf.otherCurrentAssetsManagementFormated}</div>
		<div class="mid_div01d">d.准货币资金=a+b+c：</div>
		<div class="mid_div03">${rsf.quasiMonetaryFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">e.短期借款：</div>
		<div class="mid_div03">${rsf.shortTermBorrowingFormated}</div>
		<div class="mid_div01d">f.一年内到期的非流动负债：</div>
		<div class="mid_div03">${rsf.nonCurrentLiabilitiesDueWithinOneYearFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">g.短期有息负债=e+f：</div>
		<div class="mid_div03">${rsf.shortTermForeignDebtFormated}</div>
		<div class="mid_div01d">h.准货币资金-短期有息负债=d-g：</div>
		<div class="mid_div03">${rsf.shortTermDebtRepaymentRiskFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">准货币资金占总资产比率：</div>
		<div class="mid_div03">${rsf.quasiMonetaryCapitalRatioFormated}</div>
	</div>

	<div class="mid_title1">“应收预付”和“应付预收”：</div>

	<div class="mid_div">
		<div class="mid_div01d">a.应付票据：</div>
		<div class="mid_div03">${rsf.notesPayableFormated}</div>
		<div class="mid_div01d">b.应付账款：</div>
		<div class="mid_div03">${rsf.accountsPayableFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">c.预收款项：</div>
		<div class="mid_div03">${rsf.advanceReceiptsFormated}</div>
		<div class="mid_div01d">d.合同负债：</div>
		<div class="mid_div03">${rsf.contractLiabilitiesFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">应付预收合计=a+b+c+d：</div>
		<div class="mid_div03">${rsf.totalAccountsPayablePrepaidFormated}</div>
		
	</div>
	<div class="mid_div">
		<div class="mid_div01d">e.应收票据：</div>
		<div class="mid_div03">${rsf.billReceivableFormated}</div>
		<div class="mid_div01d">f.应收账款：</div>
		<div class="mid_div03">${rsf.accountsReceivableFormated}</div>
		
	</div>
	<div class="mid_div">
		<div class="mid_div01d">g.预付款项：</div>
		<div class="mid_div03">${rsf.prepaymentsFormated}</div>
		<div class="mid_div01d">h.应收款项融资：</div>
		<div class="mid_div03">${rsf.accountsReceivableFinancingFormated}</div>
		
	</div>
	<div class="mid_div">
		<div class="mid_div01d">i.合同资产：</div>
		<div class="mid_div03">${rsf.contractAssetsFormated}</div>
		<div class="mid_div01d">应收预付合计=e+f+g+h+i：</div>
		<div class="mid_div03">${rsf.totalAccountsReceivablePrepaymentsFormated}</div>
		
	</div>
	<div class="mid_div">
		<div class="mid_div01d">应付预收合计-应收预付合计：</div>
		<div class="mid_div03">${rsf.occupySomeoneElseFundsFormated}</div>
		
	</div>

<div class="mid_title1">固定资产：</div>
	<div class="mid_div">
		<div class="mid_div01d">a.固定资产：</div>
		<div class="mid_div03">${rsf.fixedAssetsFormated}</div>
		<div class="mid_div01d">b.在建工程：</div>
		<div class="mid_div03">${rsf.constructionInProgressFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">固产合计=a+b+c：</div>
		<div class="mid_div03">${rsf.totalTFxedAssetsFormated}</div>
		<div class="mid_div01d">固产合计占总资产的比率：</div>
		<div class="mid_div03">${rsf.fixedAssetRatioFormated}</div>
	</div>

	<div class="mid_title1">投资类资产：</div>
	<div class="mid_div">
		<div class="mid_div01d">总资产：</div>
		<div class="mid_div03">${rsf.totalAssetsFormated}</div>
		<div class="mid_div01d">a.交易性金融资产：</div>
		<div class="mid_div03">${rsf.tradingFinancialAssetsFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">b.其他非流动金融资产：</div>
		<div class="mid_div03">${rsf.otherNonCurrentFinancialAssetsFormated}</div>
		<div class="mid_div01d">c.投资性房地产：</div>
		<div class="mid_div03">${rsf.investmentRealEstateFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">d.长期股权投资：</div>
		<div class="mid_div03">${rsf.longTermEquityInvestmentFormated}</div>
		<div class="mid_div01d">投资类资产占总资产的比率：</div>
		<div class="mid_div03">${rsf.investmentAssetRatioFormated}</div>
	</div>

	<div class="mid_title1">其他资产：</div>
	
	<div class="mid_div">
		<div class="mid_div01d">商誉：</div>
		<div class="mid_div03">${rsf.goodwillFormated}</div>
		<div class="mid_div01d">商誉/总资产：</div>
		<div class="mid_div03">${rsf.goodwillProportionFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">无形资产：</div>
		<div class="mid_div03">${rsf.intangibleAssetsFormated}</div>
		<div class="mid_div01d">无形资产/总资产：</div>
		<div class="mid_div03">${rsf.theProportionOfIntangibleAssetsFormated}</div>
	</div>
	
	<div class="mid_div">
		<div class="mid_div01d">应收账款：</div>
		<div class="mid_div03">${rsf.accountsReceivableFormated}</div>
		<div class="mid_div01d">应收账款/总资产：</div>
		<div class="mid_div03">${rsf.accountsReceivablePercentageOfRevenueFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">预付款项：</div>
		<div class="mid_div03">${rsf.prepaymentsFormated}</div>
		<div class="mid_div01d">预付款项/总资产：</div>
		<div class="mid_div03">${rsf.prepaymentsPercentageOfRevenueFormated}</div>	
	</div>
		<div class="mid_div">
		<div class="mid_div01d">其他应收款：</div>
		<div class="mid_div03">${rsf.otherReceivablesFormated}</div>
		<div class="mid_div01d">其他应收款/总资产：</div>
		<div class="mid_div03">${rsf.otherReceivablesPercentageOfRevenueFormated}</div>
	</div>
	
	<div class="mid_div">
		<div class="mid_div01d">存货：</div>
		<div class="mid_div03">${rsf.inventoryFormated}</div>
		<div class="mid_div01d">存货/总资产：</div>
		<div class="mid_div03">${rsf.inventoryToRevenueRatioFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">存货增长率：</div>
		<div class="mid_div03">${rsf.inventoryGrowthRateFormated}</div>
		
	</div>

	<div class="mid_title1">职工薪酬：</div>
	
	<div class="mid_div">
		<div class="mid_div01d">a.应付职工薪酬：</div>
		<div class="mid_div03">${rsf.payrollPayableFormated}</div>
		<div class="mid_div01d">b.支付给职工以及为职工支付的现金：</div>
		<div class="mid_div03">${rsf.cashPaidToAndOnBehalfOfEmployeesFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">c.当年职工总薪酬(a+b-去年应付薪酬)：</div>
		<div class="mid_div03">${rsf.totalEmployeeCompensationFormated}</div>
		<div class="mid_div01d">d.总人数：</div>
		<div class="mid_div03">${rsf.totalNumberOfPeople}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">e.人均年薪=c/d：</div>
		<div class="mid_div03">${rsf.perCapitaAnnualSalaryFormated}</div>
		<div class="mid_div01d">f.人均月薪=e/12：</div>
		<div class="mid_div03">${rsf.perCapitaMonthlySalaryFormated}</div>
	</div>

		
<div class="mid_title1">营业收入及增长：</div>

	<div class="mid_div">
		<div class="mid_div01d">b.营业收入：</div>
		<div class="mid_div03">${rsf.operatingRevenueFormated}</div>
		<div class="mid_div01d">营业收入增长率：</div>
		<div class="mid_div03">${rsf.revenueGrowthRateFormated}</div>
	</div>

	<div class="mid_div">
		<div class="mid_div01d">a.总资产：</div>
		<div class="mid_div03">${rsf.totalAssetsFormated}</div>
		
		<div class="mid_div01d">总资产周转率=b/a*100%：</div>
		<div class="mid_div03">${rsf.totalAssetTurnoverFormated}</div>
	</div>

	<div class="mid_div">
		<div class="mid_div01d">c.销售商品、提供劳务收到的现金：</div>
		<div class="mid_div03">${rsf.cashReceivedFromSellingGoodsAndProvidingServicesFormated}</div>
		<div class="mid_div01d">销售商品、提供劳务收到的现金营收占比：</div>
		<div class="mid_div03">${rsf.proportionOfCashSellingGoodsProvidingServicesFormated}</div>
	</div>

<div class="mid_title1">毛利率：</div>

	<div class="mid_div">
		<div class="mid_div01d">a.营业收入：</div>
		<div class="mid_div03">${rsf.operatingRevenueFormated}</div>
		<div class="mid_div01d">b.营业成本：</div>
		<div class="mid_div03">${rsf.operatingCostsFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">毛利率=(a-b)÷a：</div>
		<div class="mid_div03">${rsf.grossMarginFormated}</div>
	</div>

<div class="mid_title1">费用率：</div>

	<div class="mid_div">
		<div class="mid_div01d">a.销售费用：</div>
		<div class="mid_div03">${rsf.sellingExpensesFormated}</div>
		<div class="mid_div01d">销售费用率=a/e*100%：</div>
		<div class="mid_div03">${rsf.salesExpenseRateFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">b.管理费用：</div>
		<div class="mid_div03">${rsf.overheadFormated}</div>
		<div class="mid_div01d">管理费用率：</div>
		<div class="mid_div03">${rsf.managementExpenseRateFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">c.研发费用：</div>
		<div class="mid_div03">${rsf.researchAndDevelopmentFormated}</div>
		<div class="mid_div01d">研发费用率：</div>
		<div class="mid_div03">${rsf.researchAndDevelopmentRateFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">d.财务费用：</div>
		<div class="mid_div03">${rsf.financialExpensesFormated}</div>
		<div class="mid_div01d">e.营业收入：</div>
		<div class="mid_div03">${rsf.operatingRevenueFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">费用率=(a+b+c+d)÷e×100%：</div>
		<div class="mid_div03">${rsf.expenseFormated}</div>
		<div class="mid_div01d">费用率占毛利率的比率：</div>
		<div class="mid_div03">${rsf.expenseRateToGrossProfitMarginFormated}</div>
	</div>

<div class="mid_title1">主营利润和营业利润率：</div>

	<div class="mid_div">
		<div class="mid_div01d">a.营业收入：</div>
		<div class="mid_div03">${rsf.operatingRevenueFormated}</div>
		<div class="mid_div01d">b.营业成本：</div>
		<div class="mid_div03">${rsf.operatingCostsFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">c.税金及附加：</div>
		<div class="mid_div03">${rsf.taxesAndSurchargesFormated}</div>
		<div class="mid_div01d">d.四项费用：</div>
		<div class="mid_div03">${rsf.fourExpensesFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">e.利润总额：</div>
		<div class="mid_div03">${rsf.totalProfitFormated}</div>
		<div class="mid_div01d">f.主营利润=a-b-c-d：</div>
		<div class="mid_div03">${rsf.mainProfitFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">主营利润率=f÷a：</div>
		<div class="mid_div03">${rsf.mainProfitMarginFormated}</div>
		<div class="mid_div01d">主营利润占利润总额比例：</div>
		<div class="mid_div03">${rsf.mainOperatingProfitToTotalProfitFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">g.营业利润：</div>
		<div class="mid_div03">${rsf.operatingProfitFormated}</div>
		<div class="mid_div01d">主营利润占营业利润比例：</div>
		<div class="mid_div03">${rsf.operatingMarginFormated}</div>
	</div>


<div class="mid_title1">净利润：</div>

	<div class="mid_div">
		<div class="mid_div01d">a.净利润：</div>
		<div class="mid_div03">${rsf.netProfitFormated}</div>
		<div class="mid_div01d">净利润增长率：</div>
		<div class="mid_div03">${rsf.netProfitGrowthRateFormated}</div>
	</div>

	<div class="mid_div">
		<div class="mid_div01d">b.营业收入：</div>
		<div class="mid_div03">${rsf.operatingRevenueFormated}</div>
		<div class="mid_div01d">净利润率=a/b*100%：</div>
		<div class="mid_div03">${rsf.netProfitMarginFormated}</div>
	</div>

	<div class="mid_div">
		<div class="mid_div01d">b.经营活动产生的现金流量净额：</div>
		<div class="mid_div03">${rsf.netCashFlowFromOperatingFormated}</div>
		<div class="mid_div01d">净利润现金比率=b÷a×100%：</div>
		<div class="mid_div03">${rsf.netProfitCashRatioFormated}</div>
	</div>


<div class="mid_title1">归母净利润：</div>

	<div class="mid_div">
		<div class="mid_div01d">归属于母公司所有者的净利润：</div>
		<div class="mid_div03">${rsf.netIncomeAttributableToShareholdersFormated}</div>
		<div class="mid_div01d">ROE：</div>
		<div class="mid_div03">${rsf.ROEFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">归母净利润增长率：</div>
		<div class="mid_div03">${rsf.growthRateOfNetIncomeAttributableToShareholdersFormated}</div>
		
	</div>

<div class="mid_title1">经营活动产生的现金流量净额：</div>

	<div class="mid_div">
		<div class="mid_div01d">a.经营活动产生的现金流量净额：</div>
		<div class="mid_div03">${rsf.netCashFlowFromOperatingFormated}</div>
		<div class="mid_div01d">b.固定资产折旧：</div>
		<div class="mid_div03">${rsf.depreciationFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">c.无形资产摊销：</div>
		<div class="mid_div03">${rsf.amortizationOfIntangibleAssetsFormated}</div>
		<div class="mid_div01d">d.现金股利：</div>
		<div class="mid_div03">${rsf.cashPaidForDistributingDividendsProfitsPayingInterestFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">现金流量净额（=a-b-c-d）：</div>
		<div class="mid_div03">${rsf.remainingCashFormated}</div>
	</div>

<div class="mid_title1">购建固定资产、无形资产和其他长期资产支付的现金：</div>

	<div class="mid_div">
		<div class="mid_div01d">a.经营活动产生的现金流量净额：</div>
		<div class="mid_div03">${rsf.netCashFlowFromOperatingFormated}</div>
		<div class="mid_div01d">b.购建固定无形和其他长期资产支付现金：</div>
		<div class="mid_div03">${rsf.cashPaidForPurchaseConstructionFixedIntangibleLongTermAssetsFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">c.处置固定无形和其他长期资产收回现金：</div>
		<div class="mid_div03">${rsf.netCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssetsFormated}</div>
		<div class="mid_div01d">购建固产占经营活动产生的现金比(b÷a)：</div>
		<div class="mid_div03">${rsf.purchaseConstructionFixedIntangibleLongTermAssetsProportionFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">=c÷b：</div>
		<div class="mid_div03">${rsf.netCashReceivedFromDisposalProportionTopurchaseFormated}</div>
	</div>

<div class="mid_title1">分红率：</div>

	<div class="mid_div">
		<div class="mid_div01d">a.现金分红金额：</div>
		<div class="mid_div03">${rsf.financialReportDividendsFormated}</div>
		<div class="mid_div01d">b.归属于上市公司普通股股东的净利润：</div>
		<div class="mid_div03">${rsf.netIncomeAttributableToShareholdersFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">分红率（股利支付率）=a÷b×100%：</div>
		<div class="mid_div03">${rsf.dividendRateFormated}</div>
	</div>

<div class="mid_title1">三大现金流量净额的组合类型：</div>

	<div class="mid_div">
		<div class="mid_div01d">经营活动产生的现金流量净额：</div>
		<div class="mid_div03">${rsf.netCashFlowFromOperatingFormated}</div>
		<div class="mid_div01d">投资活动产生的现金流量净额：</div>
		<div class="mid_div03">${rsf.netCashFlowGeneratedFromInvestmentActivitiesFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">筹资活动产生的现金流量净额：</div>
		<div class="mid_div03">${rsf.netCashFlowGeneratedFromFinancingActivitiesFormated}</div>
		<div class="mid_div01d">公司类型：</div>
		<div class="mid_div03">${rsf.companyType}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">经营活动产生的现金流量净额增长率：</div>
		<div class="mid_div03">${rsf.growthRateOfNetCashFlowFromOperatingFormated}</div>
		
	</div>

<div class="mid_title1">现金及现金等价物的净增加额：</div>

	<div class="mid_div">
		<div class="mid_div01d">a.现金及现金等价物净增加额：</div>
		<div class="mid_div03">${rsf.netIncreaseInCashAndCashEquivalentsFormated}</div>
		<div class="mid_div01d">b.现金分红金额：</div>
		<div class="mid_div03">${rsf.financialReportDividendsFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">加现金分红的现金及现金等价物净增加额=a+b：</div>
		<div class="mid_div03">${rsf.netIncreaseInCashAndCashEquivalentsAddBonusFormated}</div>
		<div class="mid_div01d">期末现金及现金等价物余额：</div>
		<div class="mid_div03">${rsf.closingBalanceOfCashAndCashEquivalentsFormated}</div>
	</div>
</c:forEach>

	</td>
	</tr>
	</table>
	
	<div class="mid_kong"></div>
<div><company:end></company:end></div>
</body>
</html>
