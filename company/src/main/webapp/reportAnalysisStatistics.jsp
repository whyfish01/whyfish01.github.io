<%@ page language="java" %>
<%@ page pageEncoding="UTF-8" %>
<%@ page contentType="text/html"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="company" %>
<%@ page import="report.bean.entity.*" %>
<%@ page import="report.bean.daolmp.*" %>
<%@ page import="java.util.ArrayList" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="cop" class="report.bean.entity.Company" scope="request"/>
<jsp:useBean id="rsy" class="report.bean.entity.Reportsummary" scope="request"/>
<jsp:useBean id="cdi" class="report.bean.daolmp.CompanyDaoImp" scope="request"/>
<jsp:useBean id="adi" class="report.bean.daolmp.AnalysisDaoImp" scope="request"/>
<html>
<head>
<meta charset="utf-8">
<title>分析指标确认</title>
<link href="${contextPath}styles/mid.css?v=<%=System.currentTimeMillis()%>"  rel="stylesheet" type="text/css">
</head>
<body>
	<div><company:head></company:head></div>
	<div class="mid_kong"></div>
	<table class="mid_table">
	<tr>
	<td style="width:140px;vertical-align:text-top;"><company:left02></company:left02></td>
	<td style="vertical-align:text-top;">
	<div class="mid_title">分析指标确认</div>
	<form action="GetReportStatistics" method="post" id="myForm">
	<div class="mid_div">
		<div class="mid_div01d">A股代码：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="AShareCode" id="AShareCode"></div>
		<div class="mid_div01">财报年份：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="financialReportingYear" id="financialReportingYear"></div>
		<div class="mid_div01"><input type="submit" value="确定"></div>
		<div class="mid_div01d_red">${a}</div>
	</div>
	</form>
	<div class="mid_title1">企业：</div>
	<form action="InsertReportStatistics" method="post">
	<div class="mid_div">
		<div class="mid_div01d">A股代码：</div>
		<div class="mid_div03">${ry.AShareCode}</div>
		<div class="mid_div01d">财报年份：</div>
		<div class="mid_div04a">${ry.financialReportingYear}</div>
	</div>
	
	<c:forEach var="cop" items="${copList}">
	<div class="mid_div">
		<div class="mid_div01d">A股简称：</div>
		<div class="mid_div03">${cop.AShareName}</div>
		<input type="hidden" name="AShareName" value="${cop.AShareName}">
		<div class="mid_div01d">企业全称：</div>
		<div class="mid_div04a">${cop.companyName}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">一级行业：</div>
		<div class="mid_div03">${cop.primaryIndustry}</div>
		<input type="hidden" name="primaryIndustry" value="${cop.primaryIndustry}">
		<div class="mid_div01d">二级行业：</div>
		<div class="mid_div04a">${cop.secondaryIndustry}</div>
		<input type="hidden" name="secondaryIndustry" value="${cop.secondaryIndustry}">
	</div>
	<div class="mid_div">
		<div class="mid_div01d">三级行业：</div>
		<div class="mid_div03">${cop.thirdLevelIndustry}</div>
		<input type="hidden" name="thirdLevelIndustry" value="${cop.thirdLevelIndustry}">
		<div class="mid_div01d">所属区域：</div>
		<div class="mid_div04a">${cop.region}</div>
		<input type="hidden" name="region" value="${cop.region}">
	</div>
	</c:forEach>
	<div class="mid_title1">总资产情况：</div>
	<c:forEach var="ry1" items="${ryList1}">
	<div class="mid_div">
		<div class="mid_div01d">a.总资产：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="totalAssets"  value="${ry1.totalAssetsFormated}" readonly></div>
		<div class="mid_div01d">总资产增长率：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="totalAssetsGrowthRate"  value="${ry1.totalAssetsGrowthRateFormated}" readonly></div>
     </div>
     </c:forEach>
     <c:forEach var="ry1a" items="${ryList1a}">
		<div class="mid_div">
		<div class="mid_div01d">b.净资产(股东权益合计)：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="totalOwnersEquity"  value="${ry1a.totalOwnersEquityFormated}" readonly></div>
		<div class="mid_div01d">权益乘数=a/b：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="equityMultiplier" value="${ry1a.equityMultiplierFormated}"  readonly></div>
		</div>
	</c:forEach>
	

		<div class="mid_title1">资产负债率情况：</div>
		<c:forEach var="ry2" items="${ryList2}">
	<div class="mid_div">
		<div class="mid_div01d">总负债：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="totalLiabilities"  value="${ry2.totalLiabilitiesFormated}" readonly></div>
		<div class="mid_div01d">资产负债率：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="assetLiabilityRatio"  value="${ry2.assetLiabilityRatioFormated}"  readonly></div>
	</div>
	</c:forEach>


		<div class="mid_title1">有息负债与货币资金：</div>
		<c:forEach var="ry3" items="${ryList3}">
	<div class="mid_div">
		<div class="mid_div01d">a.货币资金：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="monetaryCapital"  value="${ry3.monetaryCapitalFormated}"  readonly></div>
		<div class="mid_div01d">b.短期借款：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="shortTermBorrowing"  value="${ry3.shortTermBorrowingFormated}"  readonly></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">c.一年内到期的非流动负债：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="nonCurrentLiabilitiesDueWithinOneYear"  value="${ry3.nonCurrentLiabilitiesDueWithinOneYearFormated}" readonly></div>
		<div class="mid_div01d">d.长期借款：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="longTermLoan"  value="${ry3.longTermLoanFormated}" readonly></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">e.应付债券：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="bondsPayable"  value="${ry3.bondsPayableFormated}" readonly></div>
		<div class="mid_div01d">f.长期应付款：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="longTermPayables"  value="${ry3.longTermPayablesFormated}"  readonly></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">有息负债=b+c+d+e+f：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="interestBearingLiabilities"  value="${ry3.interestBearingLiabilitiesFormated}" readonly></div>
		<div class="mid_div01d">净现金(货币资金-有息负债)：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="debtRepaymentRisk"  value="${ry3.debtRepaymentRiskFormated}" readonly></div>
	</div>
		</c:forEach>


	<div class="mid_title1">准货币资金：</div>
	<c:forEach var="ry4" items="${ryList4}">
	<div class="mid_div">
		<div class="mid_div01d">a.货币资金：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="monetaryCapital"  value="${ry4.monetaryCapitalFormated}" readonly></div>
		<div class="mid_div01d">b.交易性金融资产中的理财产品：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="tradingFinancialAssetsManagement" value="${ry4.tradingFinancialAssetsManagementFormated}"  readonly></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">c.其他流动资产的理财产品：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="otherCurrentAssetsManagement"  value="${ry4.otherCurrentAssetsManagementFormated}" readonly></div>
		<div class="mid_div01d">d.准货币资金=a+b+c：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="quasiMonetary" value="${ry4.quasiMonetaryFormated}"  readonly></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">e.短期借款：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="shortTermBorrowing"  value="${ry4.shortTermBorrowingFormated}" readonly></div>
		<div class="mid_div01d">f.一年内到期的非流动负债：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="nonCurrentLiabilitiesDueWithinOneYear"  value="${ry4.nonCurrentLiabilitiesDueWithinOneYearFormated}" readonly></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">g.短期有息负债=e+f：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="shortTermForeignDebt"  value="${ry4.shortTermForeignDebtFormated}" readonly></div>
		<div class="mid_div01d">h.准货币资金-短期有息负债=d-g：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="shortTermDebtRepaymentRisk" value="${ry4.shortTermDebtRepaymentRiskFormated}"  readonly></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">准货币资金占总资产比率：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="quasiMonetaryCapitalRatio" value="${ry4.quasiMonetaryCapitalRatioFormated}"  readonly></div>
	</div>
			</c:forEach>


	<div class="mid_title1">“应收预付”和“应付预收”：</div>
	<c:forEach var="ry5" items="${ryList5}">
	<div class="mid_div">
		<div class="mid_div01d">a.应付票据：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="notesPayable"  value="${ry5.notesPayableFormated}" readonly></div>
		<div class="mid_div01d">b.应付账款：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="accountsPayable"  value="${ry5.accountsPayableFormated}" readonly></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">c.预收款项：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="advanceReceipts"  value="${ry5.advanceReceiptsFormated}" readonly></div>
		<div class="mid_div01d">d.合同负债：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="contractLiabilities"  value="${ry5.contractLiabilitiesFormated}" readonly></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">应付预收合计=a+b+c+d：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="totalAccountsPayablePrepaid"  value="${ry5.totalAccountsPayablePrepaidFormated}" readonly></div>
		
	</div>
	<div class="mid_div">
		<div class="mid_div01d">e.应收票据：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="billReceivable"  value="${ry5.billReceivableFormated}" readonly></div>
		<div class="mid_div01d">f.应收账款：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="accountsReceivable"  value="${ry5.accountsReceivableFormated}" readonly></div>
		
	</div>
	<div class="mid_div">
		<div class="mid_div01d">g.预付款项：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="prepayments"  value="${ry5.prepaymentsFormated}" readonly></div>
		<div class="mid_div01d">h.应收款项融资：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="accountsReceivableFinancing"  value="${ry5.accountsReceivableFinancingFormated}" readonly></div>
		
	</div>
	<div class="mid_div">
		<div class="mid_div01d">i.合同资产：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="contractAssets"  value="${ry5.contractAssetsFormated}" readonly></div>
		<div class="mid_div01d">应收预付合计=e+f+g+h+i：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="totalAccountsReceivablePrepayments"  value="${ry5.totalAccountsReceivablePrepaymentsFormated}" readonly></div>
		
	</div>
	<div class="mid_div">
		<div class="mid_div01d">应付预收合计-应收预付合计：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="occupySomeoneElseFunds"  value="${ry5.occupySomeoneElseFundsFormated}" readonly></div>
		
	</div>
</c:forEach>


<div class="mid_title1">固定资产：</div>
<c:forEach var="ry6" items="${ryList6}">
	<div class="mid_div">
		<div class="mid_div01d">a.固定资产：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="fixedAssets"  value="${ry6.fixedAssetsFormated}" readonly></div>
		<div class="mid_div01d">b.在建工程：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="constructionInProgress"  value="${ry6.constructionInProgressFormated}" readonly></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">固产合计=a+b+c：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="totalTFxedAssets"  value="${ry6.totalTFxedAssetsFormated}" readonly></div>
		<div class="mid_div01d">固产合计占总资产的比率：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="fixedAssetRatio"   value="${ry6.fixedAssetRatioFormated}" readonly></div>
	</div>
</c:forEach>

	<div class="mid_title1">投资类资产：</div>
	<c:forEach var="ry7" items="${ryList7}">
	<div class="mid_div">
		<div class="mid_div01d">总资产：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="totalAssets"  value="${ry7.totalAssetsFormated}"  readonly></div>
		<div class="mid_div01d">a.交易性金融资产：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="tradingFinancialAssets"  value="${ry7.tradingFinancialAssetsFormated}" readonly></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">b.其他非流动金融资产：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="otherNonCurrentFinancialAssets"  value="${ry7.otherNonCurrentFinancialAssetsFormated}" readonly></div>
		<div class="mid_div01d">c.投资性房地产：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="investmentRealEstate"  value="${ry7.investmentRealEstateFormated}" readonly></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">d.长期股权投资：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="longTermEquityInvestment"  value="${ry7.longTermEquityInvestmentFormated}" readonly></div>
		<div class="mid_div01d">投资类资产占总资产的比率：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="investmentAssetRatio"   value="${ry7.investmentAssetRatioFormated}" readonly></div>
	</div>
</c:forEach>
	

	<div class="mid_title1">其他资产：</div>
	<c:forEach var="ry8" items="${ryList8}">
	<div class="mid_div">
		<div class="mid_div01d">商誉：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="goodwill"   value="${ry8.goodwillFormated}" readonly></div>
		<div class="mid_div01d">商誉/总资产：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="goodwillProportion"  value="${ry8.goodwillProportionFormated}" readonly></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">无形资产：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="intangibleAssets"  value="${ry8.intangibleAssetsFormated}" readonly></div>
		<div class="mid_div01d">无形资产/总资产：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="theProportionOfIntangibleAssets"  value="${ry8.theProportionOfIntangibleAssetsFormated}" readonly></div>
	</div>
	</c:forEach>
	<c:forEach var="ry11" items="${ryList11}">
	<div class="mid_div">
		<div class="mid_div01d">应收账款：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="accountsReceivable"  value="${ry11.accountsReceivableFormated}" readonly></div>
		<div class="mid_div01d">应收账款/总资产：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="accountsReceivablePercentageOfRevenue"   value="${ry11.accountsReceivablePercentageOfRevenueFormated}" readonly></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">预付款项：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="prepayments"   value="${ry11.prepaymentsFormated}" readonly></div>
		<div class="mid_div01d">预付款项/总资产：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="prepaymentsPercentageOfRevenue"   value="${ry11.prepaymentsPercentageOfRevenueFormated}" readonly></div>	
	</div>
		<div class="mid_div">
		<div class="mid_div01d">其他应收款：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="otherReceivables"  value="${ry11.otherReceivablesFormated}" readonly></div>
		<div class="mid_div01d">其他应收款/总资产：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="otherReceivablesPercentageOfRevenue"  value="${ry11.otherReceivablesPercentageOfRevenueFormated}" readonly></div>
	</div>
	
	<div class="mid_div">
		<div class="mid_div01d">存货：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="inventory"   value="${ry11.inventoryFormated}" readonly></div>
		<div class="mid_div01d">存货/总资产：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="inventoryToRevenueRatio" value="${ry11.inventoryToRevenueRatioFormated}"  readonly></div>
	</div>
	</c:forEach>
	<c:forEach var="ry11a" items="${ryList11a}">
	<div class="mid_div">
		<div class="mid_div01d">存货增长率：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="inventoryGrowthRate"   value="${ry11a.inventoryGrowthRateFormated}" readonly></div>
	</div>
	</c:forEach>

	<div class="mid_title1">职工薪酬：</div>
	<c:forEach var="ry9" items="${ryList9}">
	<div class="mid_div">
		<div class="mid_div01d">a.应付职工薪酬：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="payrollPayable"   value="${ry9.payrollPayableFormated}" readonly></div>
		<div class="mid_div01d">b.支付给职工以及为职工支付的现金：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="cashPaidToAndOnBehalfOfEmployees"  value="${ry9.cashPaidToAndOnBehalfOfEmployeesFormated}" readonly></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">c.当年职工总薪酬(a+b-去年应付薪酬)：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="totalEmployeeCompensation" value="${ry9.totalEmployeeCompensationFormated}"  readonly></div>
		<div class="mid_div01d">d.总人数：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="totalNumberOfPeople"  value="${ry9.totalNumberOfPeople}" readonly></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">e.人均年薪=c/d：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="perCapitaAnnualSalary"  value="${ry9.perCapitaAnnualSalaryFormated}" readonly></div>
		<div class="mid_div01d">f.人均月薪=e/12：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="perCapitaMonthlySalary"  value="${ry9.perCapitaMonthlySalaryFormated}" readonly></div>
	</div>
		</c:forEach>
		
<div class="mid_title1">营业收入及增长：</div>
	<c:forEach var="ry10" items="${ryList10}">
	<div class="mid_div">
		<div class="mid_div01d">b.营业收入：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="operatingRevenue"  value="${ry10.operatingRevenueFormated}" readonly></div>
		<div class="mid_div01d">营业收入增长率：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="revenueGrowthRate"  value="${ry10.revenueGrowthRateFormated}" readonly></div>
	</div>
	</c:forEach>
	<c:forEach var="ry10a" items="${ryList10a}">
	<div class="mid_div">
		<div class="mid_div01d">a.总资产：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="totalAssets"  value="${ry10a.totalAssetsFormated}"  readonly></div>
		
		<div class="mid_div01d">总资产周转率=b/a*100%：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="totalAssetTurnover"  value="${ry10a.totalAssetTurnoverFormated}" readonly></div>
	</div>
	</c:forEach>
	<c:forEach var="ry10b" items="${ryList10b}">
	<div class="mid_div">
		<div class="mid_div01d">c.销售商品、提供劳务收到的现金：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="cashReceivedFromSellingGoodsAndProvidingServices"  value="${ry10b.cashReceivedFromSellingGoodsAndProvidingServicesFormated}" readonly></div>
		<div class="mid_div01d">销售商品、提供劳务收到的现金营收占比：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="proportionOfCashSellingGoodsProvidingServices"  value="${ry10b.proportionOfCashSellingGoodsProvidingServicesFormated}" readonly></div>
	</div>
	</c:forEach>


<div class="mid_title1">毛利率：</div>
<c:forEach var="ry12" items="${ryList12}">
	<div class="mid_div">
		<div class="mid_div01d">a.营业收入：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="operatingRevenue"  value="${ry12.operatingRevenueFormated}" readonly></div>
		<div class="mid_div01d">b.营业成本：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="operatingCosts"  value="${ry12.operatingCostsFormated}" readonly></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">毛利率=(a-b)÷a：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="grossMargin"  value="${ry12.grossMarginFormated}" readonly></div>
	</div>
	</c:forEach>
<div class="mid_title1">费用率：</div>
<c:forEach var="ry13" items="${ryList13}">
	<div class="mid_div">
		<div class="mid_div01d">a.销售费用：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="sellingExpenses"  value="${ry13.sellingExpensesFormated}" readonly></div>
		<div class="mid_div01d">销售费用率=a/e*100%：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="salesExpenseRate"  value="${ry13.salesExpenseRateFormated}" readonly></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">b.管理费用：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="overhead"  value="${ry13.overheadFormated}" readonly></div>
		<div class="mid_div01d">管理费用率：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="managementExpenseRate"  value="${ry13.managementExpenseRateFormated}" readonly></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">c.研发费用：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="researchAndDevelopment"  value="${ry13.researchAndDevelopmentFormated}" readonly></div>
		<div class="mid_div01d">研发费用率：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="researchAndDevelopmentRate"  value="${ry13.researchAndDevelopmentRateFormated}" readonly></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">d.财务费用：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="financialExpenses"  value="${ry13.financialExpensesFormated}" readonly></div>
		<div class="mid_div01d">e.营业收入：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="operatingRevenue"  value="${ry13.operatingRevenueFormated}" readonly></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">费用率=(a+b+c+d)÷e×100%：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="expense"  value="${ry13.expenseFormated}" readonly></div>
		<div class="mid_div01d">费用率占毛利率的比率：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="expenseRateToGrossProfitMargin"  value="${ry13.expenseRateToGrossProfitMarginFormated}" readonly></div>
	</div>
	</c:forEach>
<div class="mid_title1">主营利润和营业利润率：</div>
<c:forEach var="ry14" items="${ryList14}">
	<div class="mid_div">
		<div class="mid_div01d">a.营业收入：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="operatingRevenue"  value="${ry14.operatingRevenueFormated}" readonly></div>
		<div class="mid_div01d">b.营业成本：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="operatingCosts"  value="${ry14.operatingCostsFormated}" readonly></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">c.税金及附加：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="taxesAndSurcharges"  value="${ry14.taxesAndSurchargesFormated}" readonly></div>
		<div class="mid_div01d">d.四项费用：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="fourExpenses"  value="${ry14.fourExpensesFormated}" readonly></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">e.利润总额：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="totalProfit"  value="${ry14.totalProfitFormated}" readonly></div>
		<div class="mid_div01d">f.主营利润=a-b-c-d：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="mainProfit"  value="${ry14.mainProfitFormated}" readonly></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">主营利润率=f÷a：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="mainProfitMargin"  value="${ry14.mainProfitMarginFormated}" readonly></div>
		<div class="mid_div01d">主营利润占利润总额比例：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="mainOperatingProfitToTotalProfit"  value="${ry14.mainOperatingProfitToTotalProfitFormated}" readonly></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">g.营业利润：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="operatingProfit"  value="${ry14.operatingProfitFormated}" readonly></div>
		<div class="mid_div01d">主营利润占营业利润比例：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="operatingMargin"  value="${ry14.operatingMarginFormated}" readonly></div>
	</div>
		</c:forEach>

<div class="mid_title1">净利润：</div>
	<c:forEach var="ry15" items="${ryList15}">
	<div class="mid_div">
		<div class="mid_div01d">a.净利润：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="netProfit"  value="${ry15.netProfitFormated}" readonly></div>
		<div class="mid_div01d">净利润增长率：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="netProfitGrowthRate"  value="${ry15.netProfitGrowthRateFormated}" readonly></div>
	</div>
	</c:forEach>
	<c:forEach var="ry15a" items="${ryList15a}">
	<div class="mid_div">
		<div class="mid_div01d">b.营业收入：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="operatingRevenue"  value="${ry15a.operatingRevenueFormated}" readonly></div>
		<div class="mid_div01d">净利润率=a/b*100%：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="netProfitMargin"  value="${ry15a.netProfitMarginFormated}" readonly></div>
	</div>
	</c:forEach>
	<c:forEach var="ry15b" items="${ryList15b}">
	<div class="mid_div">
		<div class="mid_div01d">b.经营活动产生的现金流量净额：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="netCashFlowFromOperating"  value="${ry15b.netCashFlowFromOperatingFormated}" readonly></div>
		<div class="mid_div01d">净利润现金比率=b÷a×100%：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="netProfitCashRatio"  value="${ry15b.netProfitCashRatioFormated}" readonly></div>
	</div>
	</c:forEach>

<div class="mid_title1">归母净利润：</div>
<c:forEach var="ry16" items="${ryList16}">
	<div class="mid_div">
		<div class="mid_div01d">归属于母公司所有者的净利润：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="netIncomeAttributableToShareholders"  value="${ry16.netIncomeAttributableToShareholdersFormated}" readonly></div>
		<div class="mid_div01d">ROE：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="ROE" value="${ry16.ROEFormated}"  readonly></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">归母净利润增长率：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="growthRateOfNetIncomeAttributableToShareholders"  value="${ry16.growthRateOfNetIncomeAttributableToShareholdersFormated}" readonly></div>
	</div>
	</c:forEach>
<div class="mid_title1">经营活动产生的现金流量净额：</div>
<c:forEach var="ry17" items="${ryList17}">
	<div class="mid_div">
		<div class="mid_div01d">a.经营活动产生的现金流量净额：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="netCashFlowFromOperating" value="${ry17.netCashFlowFromOperatingFormated}" readonly></div>
		<div class="mid_div01d">b.固定资产折旧：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="depreciation"  value="${ry17.depreciationFormated}" readonly></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">c.无形资产摊销：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="amortizationOfIntangibleAssets"  value="${ry17.amortizationOfIntangibleAssetsFormated}"  readonly></div>
		<div class="mid_div01d">d.现金股利：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="cashPaidForDistributingDividendsProfitsPayingInterest" value="${ry17.cashPaidForDistributingDividendsProfitsPayingInterestFormated}"  readonly></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">现金流量净额（=a-b-c-d）：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="remainingCash" value="${ry17.remainingCashFormated}"  readonly></div>
	</div>
	</c:forEach>
<div class="mid_title1">购建固定资产、无形资产和其他长期资产支付的现金：</div>
<c:forEach var="ry18" items="${ryList18}">
	<div class="mid_div">
		<div class="mid_div01d">a.经营活动产生的现金流量净额：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="netCashFlowFromOperating" value="${ry18.netCashFlowFromOperatingFormated}" readonly></div>
		<div class="mid_div01d">b.购建固定无形和其他长期资产支付现金：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="cashPaidForPurchaseConstructionFixedIntangibleLongTermAssets"  value="${ry18.cashPaidForPurchaseConstructionFixedIntangibleLongTermAssetsFormated}" readonly></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">c.处置固定无形和其他长期资产收回现金：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="netCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssets"  value="${ry18.netCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssetsFormated}" readonly></div>
		<div class="mid_div01d">购建固产占经营活动产生的现金比(b÷a)：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="purchaseConstructionFixedIntangibleLongTermAssetsProportion"  value="${ry18.purchaseConstructionFixedIntangibleLongTermAssetsProportionFormated}" readonly></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">=c÷b：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="netCashReceivedFromDisposalProportionTopurchase"  value="${ry18.netCashReceivedFromDisposalProportionTopurchaseFormated}" readonly></div>
	</div>
</c:forEach>
<div class="mid_title1">分红率：</div>
<c:forEach var="ry19" items="${ryList19}">
	<div class="mid_div">
		<div class="mid_div01d">a.现金分红金额：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="financialReportDividends"  value="${ry19.financialReportDividendsFormated}" readonly></div>
		<div class="mid_div01d">b.归属于上市公司普通股股东的净利润：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="netIncomeAttributableToShareholders"  value="${ry19.netIncomeAttributableToShareholdersFormated}" readonly></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">分红率（股利支付率）=a÷b×100%：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="dividendRate"  value="${ry19.dividendRateFormated}" readonly></div>
	</div>
	</c:forEach>
<div class="mid_title1">三大现金流量净额的组合类型：</div>
<c:forEach var="ry20" items="${ryList20}">
	<div class="mid_div">
		<div class="mid_div01d">经营活动产生的现金流量净额：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="netCashFlowFromOperating"  value="${ry20.netCashFlowFromOperatingFormated}" readonly></div>
		<div class="mid_div01d">投资活动产生的现金流量净额：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="netCashFlowGeneratedFromInvestmentActivities"  value="${ry20.netCashFlowGeneratedFromInvestmentActivitiesFormated}" readonly></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">筹资活动产生的现金流量净额：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="netCashFlowGeneratedFromFinancingActivities"  value="${ry20.netCashFlowGeneratedFromFinancingActivitiesFormated}" readonly></div>
		<div class="mid_div01d">公司类型：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="companyType"  value="${ry20.companyType}" readonly></div>
	</div>
	</c:forEach>
	<c:forEach var="ry20a" items="${ryList20a}">
	<div class="mid_div">
		<div class="mid_div01d">经营活动产生的现金流量净额增长率：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="growthRateOfNetCashFlowFromOperating"  value="${ry20a.growthRateOfNetCashFlowFromOperatingFormated}" readonly></div>
		
	</div>
		</c:forEach>
<div class="mid_title1">现金及现金等价物的净增加额：</div>
<c:forEach var="ry21" items="${ryList21}">
	<div class="mid_div">
		<div class="mid_div01d">a.现金及现金等价物净增加额：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="netIncreaseInCashAndCashEquivalents"  value="${ry21.netIncreaseInCashAndCashEquivalentsFormated}" readonly> </div>
		<div class="mid_div01d">b.现金分红金额：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="financialReportDividends"  value="${ry21.financialReportDividendsFormated}" readonly></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">加现金分红的现金及现金等价物净增加额=a+b：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="netIncreaseInCashAndCashEquivalentsAddBonus"  value="${ry21.netIncreaseInCashAndCashEquivalentsAddBonusFormated}" readonly></div>
		<div class="mid_div01d">期末现金及现金等价物余额：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="closingBalanceOfCashAndCashEquivalents"  value="${ry21.closingBalanceOfCashAndCashEquivalentsFormated}" readonly></div>
	</div>
</c:forEach>
	
	<div class="mid_div">
		<input type="hidden" name="AShareCode" value="${ry.AShareCode}">
		
		
		<input type="hidden" name="financialReportingYear" value="${ry.financialReportingYear}">
		<div class="mid_div06"><input type="submit" class="mid_an" value="保存"></div>	
	</div>

	</form>
	</td>
	</tr>
	</table>
	<div class="mid_kong"></div>
<div><company:end></company:end></div>
</body>
</html>
