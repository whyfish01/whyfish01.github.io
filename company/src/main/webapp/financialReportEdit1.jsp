<%@ page language="java" %>
<%@ page pageEncoding="UTF-8" %>
<%@ page contentType="text/html"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="company" %>
<%@ page import="report.bean.entity.*" %>
<%@ page import="report.bean.daolmp.*" %>
<%@ page import="java.util.ArrayList" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="isf" class="report.bean.entity.IncomeStatementFormated" scope="request"/>
<jsp:useBean id="is1" class="report.bean.entity.IncomeStatement" scope="request"/>
<jsp:useBean id="bs" class="report.bean.entity.BalanceSheet" scope="request"/>
<jsp:useBean id="rdi" class="report.bean.daolmp.ReportDaoImp" scope="request"/>
<html>
<head>
<meta charset="utf-8">
<title>财报数据修改</title>
<link href="${contextPath}styles/mid.css?v=<%=System.currentTimeMillis()%>"  rel="stylesheet" type="text/css">
</head>

<body>
	<div><company:head></company:head></div>
	<div class="mid_kong"></div>
	<table class="mid_table">
	<tr>
	<td style="width:140px;vertical-align:text-top;"><company:left02></company:left02></td>
	<td style="vertical-align:text-top;">
	
	<c:forEach var="hd" items="${hdList}">
	<div class="mid_title">财报数据修改
		<a href="CashflowSupplementDetailForEdit?financialReportingNo=${hd.financialReportingNo}" target="_self"><input type="button" class="mid_an01a" value="现金流量表补充"></a>
		<a href="CashflowStatementDetailForEdit?financialReportingNo=${hd.financialReportingNo}" target="_self"><input type="button" class="mid_an01" value="现金流量表"></a>
		<a href="IncomeStatementDetailForEdit?financialReportingNo=${hd.financialReportingNo}" target="_self"><input type="button" class="mid_an01" value="利润表"></a>
		<a href="BalanceSheetDetailForEdit?financialReportingNo=${hd.financialReportingNo}" target="_self"><input type="button" class="mid_an01" value="资产负债表"></a>
	</div>
	<div class="mid_title1">基本信息</div>
	<div class="mid_div">
		<div class="mid_div01a">财报编号：</div>
		<div class="mid_div03">${hd.financialReportingNo}</div>
		<div class="mid_div01a">A股简称：</div>
		<div class="mid_div03">${hd.AShareName}</div>
		<div class="mid_div01a">审计意见：</div>
		<div class="mid_div04">${hd.auditOpinion}</div>
	</div>
	</c:forEach>
	<form style="margin:0px;" action="EditIncomeStatement" method="post">
	<c:forEach var="is" items="${isList}">
	<div class="mid_title1">利润表（单位：元人民币）</div>
	<div class="mid_div">
		<div class="mid_div01a">营业总收入：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="grossRevenue" value="${is.grossRevenueFormated}"></div>
		<div class="mid_div01a">营业收入：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="operatingRevenue" value="${is.operatingRevenueFormated}"></div>
		<div class="mid_div01a">利息收入：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="interestIncome" value="${is.interestIncomeFormated}"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">已赚保费：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="earnedPremium" value="${is.earnedPremiumFormated}"></div>
		<div class="mid_div01a">手续费及佣金收入：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="feeAndCommissionIncome" value="${is.feeAndCommissionIncomeFormated}"></div>
		<div class="mid_div01a">营业总成本：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="totalOperatingCost" value="${is.totalOperatingCostFormated}"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">营业成本：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="operatingCosts" value="${is.operatingCostsFormated}"></div>
		<div class="mid_div01a">利息支出：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="interestExpense" value="${is.interestExpenseFormated}"></div>
		<div class="mid_div01a">手续费及佣金支出：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="handlingFeesAndCommissionExpenses" value="${is.handlingFeesAndCommissionExpensesFormated}"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">退保金：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="surrender" value="${is.surrenderFormated}"></div>
		<div class="mid_div01a">赔付支出净额：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="netCompensationExpenses" value="${is.netCompensationExpensesFormated}"></div>
		<div class="mid_div01a">保单红利支出：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="expendituresDividendPolicy" value="${is.expendituresDividendPolicyFormated}"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">提取保险责任合同准备金：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="withdrawalOfReserveFundsForInsuranceLiabilityContracts" value="${is.withdrawalOfReserveFundsForInsuranceLiabilityContractsFormated}"></div>
		<div class="mid_div01a">分保费用：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="reinsuranceExpenses" value="${is.reinsuranceExpensesFormated}"></div>
		<div class="mid_div01a">税金及附加：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="taxesAndSurcharges" value="${is.taxesAndSurchargesFormated}"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">销售费用：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="sellingExpenses" value="${is.sellingExpensesFormated}"></div>
		<div class="mid_div01a">管理费用：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="overhead" value="${is.overheadFormated}"></div>
		<div class="mid_div01a">研发费用：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="researchAndDevelopment" value="${is.researchAndDevelopmentFormated}"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">财务费用：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="financialExpenses" value="${is.financialExpensesFormated}"></div>
		<div class="mid_div01a">其中：利息费用：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="financialExpensesInterestExpenses" value="${is.financialExpensesInterestExpensesFormated}"></div>
		<div class="mid_div01a">利息收入：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="financialExpensesInterestIncome" value="${is.financialExpensesInterestIncomeFormated}"></div>
	</div>

	<div class="mid_div">
		<div class="mid_div01d">加：其他收益：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="otherIncome" value="${is.otherIncomeFormated}"></div>
		<div class="mid_div01d">投资收益（损失以“－”号填列）：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="incomeFromInvestment" value="${is.incomeFromInvestmentFormated}"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">其中：对联营企业和合营企业的投资收益：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="investmentIncomeFromAssociatesAndJointVentures" value="${is.investmentIncomeFromAssociatesAndJointVenturesFormated}"></div>
		<div class="mid_div01d">汇兑收益（损失以“-”号填列）：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="exchangeGains" value="${is.exchangeGainsFormated}"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">以摊余成本计量的金融资产终止确认收益：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="incomeFromDerecognitionOfFinancialAssetsMeasuredAtAmortizedCost" value="${is.incomeFromDerecognitionOfFinancialAssetsMeasuredAtAmortizedCostFormated}"></div>
		<div class="mid_div01d">净敞口套期收益（损失以“－”号填列）：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="netExposureHedgingIncome" value="${is.netExposureHedgingIncomeFormated}"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">公允价值变动收益（损失“－”号填列）：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="incomeFromChangesInFairValue" value="${is.incomeFromChangesInFairValueFormated}"></div>
		<div class="mid_div01d">信用减值损失（损失以“-”号填列）：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="creditImpairmentLoss" value="${is.creditImpairmentLossFormated}"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">资产减值损失（损失以“-”号填列）：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="impairmentLoss" value="${is.impairmentLossFormated}"></div>
		<div class="mid_div01d">资产处置收益（损失以“-”号填列）：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="assetDisposalIncome" value="${is.assetDisposalIncomeFormated}"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">营业利润：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="operatingProfit" value="${is.operatingProfitFormated}"></div>
		<div class="mid_div01a">加：营业外收入：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="nonOperatingIncome" value="${is.nonOperatingIncomeFormated}"></div>
		<div class="mid_div01a">减：营业外支出：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="nonOperatingExpenses" value="${is.nonOperatingExpensesFormated}"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">利润总额：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="totalProfit" value="${is.totalProfitFormated}"></div>
		<div class="mid_div01a">减：所得税费用：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="incomeTaxExpense" value="${is.incomeTaxExpenseFormated}"></div>
		<div class="mid_div01a">净利润：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="netProfit" value="${is.netProfitFormated}"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">持续经营净利润：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="netProfitFromContinuingOperations" value="${is.netProfitFromContinuingOperationsFormated}"></div>
		<div class="mid_div01d">终止经营净利润：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="netProfitFromDiscontinuedOperations" value="${is.netProfitFromDiscontinuedOperationsFormated}"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">归属于母公司股东的净利润：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="netIncomeAttributableToShareholders" value="${is.netIncomeAttributableToShareholdersFormated}"></div>
		<div class="mid_div01d">少数股东损益：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="minorityInterest" value="${is.minorityInterestFormated}"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">归属母公司所有者其他综合收益税后净额：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="afterTaxNetAmountOfOtherComprehensiveIncomeAttributable" value="${is.afterTaxNetAmountOfOtherComprehensiveIncomeAttributableFormated}"></div>
		<div class="mid_div01d">不能重分类进损益的其他综合收益：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="otherComprehensiveIncomeCannotBeReclassifiedIntoProfitOrLoss" value="${is.otherComprehensiveIncomeCannotBeReclassifiedIntoProfitOrLossFormated}"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">重新计量设定受益计划变动额：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="remeasureChangesInDefinedBenefitPlans" value="${is.remeasureChangesInDefinedBenefitPlansFormated}"></div>
		<div class="mid_div01d">权益法下不能转损益的其他综合收益：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="otherIncomeCannotBeConvertedToProfitOrLossUnderTheEquityMethod" value="${is.otherIncomeCannotBeConvertedToProfitOrLossUnderTheEquityMethodFormated}"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">其他权益工具投资公允价值变动：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="changesInFairValueOfOtherEquityInstrumentInvestments" value="${is.changesInFairValueOfOtherEquityInstrumentInvestmentsFormated}"></div>
		<div class="mid_div01d">企业自身信用风险公允价值变动：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="changesInFairValueOfCorporateCreditRisk" value="${is.changesInFairValueOfCorporateCreditRiskFormated}"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">其他：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="others" value="${is.othersFormated}"></div>
		<div class="mid_div01d">将重分类进损益的其他综合收益：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="otherIncomeReclassifiedToProfitOrLoss" value="${is.otherIncomeReclassifiedToProfitOrLossFormated}"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">权益法下可转损益的其他综合收益：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="otherIncomeCanBeConvertedToProfitOrLossUnderTheEquityMethod" value="${is.otherIncomeCanBeConvertedToProfitOrLossUnderTheEquityMethodFormated}"></div>
		<div class="mid_div01d">其他债权投资公允价值变动：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="changesInFairValueOfOtherDebtInvestments" value="${is.changesInFairValueOfOtherDebtInvestmentsFormated}"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">金融资产重分类计入其他综合收益的金额：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="reclassificationOfFinancialAssetsInOtherComprehensiveIncome" value="${is.reclassificationOfFinancialAssetsInOtherComprehensiveIncomeFormated}"></div>
		<div class="mid_div01d">其他债权投资信用减值准备：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="provisionForOtherDebtInvestments" value="${is.provisionForOtherDebtInvestmentsFormated}"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">现金流量套期储备：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="cashFlowHedgingReserves" value="${is.cashFlowHedgingReservesFormated}"></div>
		<div class="mid_div01a">外币财报折算差额：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="currencyTranslationDifferences" value="${is.currencyTranslationDifferencesFormated}"></div>
		<div class="mid_div01a">其他：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="others1" value="${is.others1Formated}"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">归属少数股东的其他综合收益税后净额：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="otherIncomeAfterTaxAttributableToMinorityShareholders" value="${is.otherIncomeAfterTaxAttributableToMinorityShareholdersFormated}"></div>
		<div class="mid_div01d">综合收益总额：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="totalComprehensiveIncome" value="${is.totalComprehensiveIncomeFormated}"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">归属于母公司所有者的综合收益总额：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="totalComprehensiveIncomeToTheOwnersOfTheParentCompany" value="${is.totalComprehensiveIncomeToTheOwnersOfTheParentCompanyFormated}"></div>
		<div class="mid_div01d">归属于少数股东的综合收益总额：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="totalComprehensiveIncomeToMinorityShareholders" value="${is.totalComprehensiveIncomeToMinorityShareholdersFormated}"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">基本每股收益：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="basicEarningsPerShare" value="${is.basicEarningsPerShareFormated}"></div>
		<div class="mid_div01d">稀释每股收益：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="dilutedEarningsPerShare" value="${is.dilutedEarningsPerShareFormated}"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01underline">ROE：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="ROE" value="${is.ROEFormated}"></div>
		<div class="mid_div01d">财报分红金额：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="financialReportDividends" value="${is.financialReportDividendsFormated}"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div06"><input type="submit" class="mid_an" value="保存"></div>	
		<input type="hidden" name="financialReportingNo" value="${is.financialReportingNo}">
	
	</div>
	
	</c:forEach>
	</form>
	<div class='message_font'>${a}</div>
	</td>
	</tr>
	</table>
	
	<div class="mid_kong"></div>
	
<div><company:end></company:end></div>
</body>
</html>
