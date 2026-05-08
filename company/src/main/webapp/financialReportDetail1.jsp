<%@ page language="java" %>
<%@ page pageEncoding="UTF-8" %>
<%@ page contentType="text/html"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="company" %>
<%@ page import="report.bean.entity.*" %>
<%@ page import="report.bean.daolmp.*" %>
<%@ page import="java.util.ArrayList" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="is" class="report.bean.entity.IncomeStatementFormated" scope="request"/>
<jsp:useBean id="bs" class="report.bean.entity.BalanceSheet" scope="request"/>
<jsp:useBean id="rdi" class="report.bean.daolmp.ReportDaoImp" scope="request"/>
<html>
<head>
<meta charset="utf-8">
<title>财报数据查看</title>
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
	<div class="mid_title">查看财报数据
		<a href="CashflowSupplementDetail?financialReportingNo=${hd.financialReportingNo}" target="_self"><input type="button" class="mid_an01a" value="现金流量表补充"></a>
		<a href="CashflowStatementDetail?financialReportingNo=${hd.financialReportingNo}" target="_self"><input type="button" class="mid_an01" value="现金流量表"></a>
		<a href="IncomeStatementDetail?financialReportingNo=${hd.financialReportingNo}" target="_self"><input type="button" class="mid_an01" value="利润表"></a>
		<a href="BalanceSheetDetail?financialReportingNo=${hd.financialReportingNo}" target="_self"><input type="button" class="mid_an01" value="资产负债表"></a>
	</div>
	
	<div class="mid_title1">基本信息：</div>
	<div class="mid_div">
		<div class="mid_div01a">财报编号：</div>
		<div class="mid_div03">${hd.financialReportingNo}</div>
		<div class="mid_div01a">A股简称：</div>
		<div class="mid_div03">${hd.AShareName}</div>
		<div class="mid_div01a">审计意见：</div>
		<div class="mid_div04">${hd.auditOpinion}</div>
	</div>
	</c:forEach>
	<c:forEach var="is" items="${isList}">
	<div class="mid_title1">利润表（单位：元人民币）</div>
	<div class="mid_div">
		<div class="mid_div01a">营业总收入：</div>
		<div class="mid_div03">${is.grossRevenueFormated}</div>
		<div class="mid_div01a">营业收入：</div>
		<div class="mid_div03">${is.operatingRevenueFormated}</div>
		<div class="mid_div01a">利息收入：</div>
		<div class="mid_div03">${is.interestIncomeFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">已赚保费：</div>
		<div class="mid_div03">${is.earnedPremiumFormated}</div>
		<div class="mid_div01a">手续费及佣金收入：</div>
		<div class="mid_div03">${is.feeAndCommissionIncomeFormated}</div>
		<div class="mid_div01a">营业总成本：</div>
		<div class="mid_div03">${is.totalOperatingCostFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">营业成本：</div>
		<div class="mid_div03">${is.operatingCostsFormated}</div>
		<div class="mid_div01a">利息支出：</div>
		<div class="mid_div03">${is.interestExpenseFormated}</div>
		<div class="mid_div01a">手续费及佣金支出：</div>
		<div class="mid_div03">${is.handlingFeesAndCommissionExpensesFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">退保金：</div>
		<div class="mid_div03">${is.surrenderFormated}</div>
		<div class="mid_div01a">赔付支出净额：</div>
		<div class="mid_div03">${is.netCompensationExpensesFormated}</div>
		<div class="mid_div01a">保单红利支出：</div>
		<div class="mid_div03">${is.expendituresDividendPolicyFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">提取保险责任合同准备金：</div>
		<div class="mid_div03">${is.withdrawalOfReserveFundsForInsuranceLiabilityContractsFormated}</div>
		<div class="mid_div01a">分保费用：</div>
		<div class="mid_div03">${is.reinsuranceExpensesFormated}</div>
		<div class="mid_div01a">税金及附加：</div>
		<div class="mid_div03">${is.taxesAndSurchargesFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">销售费用：</div>
		<div class="mid_div03">${is.sellingExpensesFormated}</div>
		<div class="mid_div01a">管理费用：</div>
		<div class="mid_div03">${is.overheadFormated}</div>
		<div class="mid_div01a">研发费用：</div>
		<div class="mid_div03">${is.researchAndDevelopmentFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">财务费用：</div>
		<div class="mid_div03">${is.financialExpensesFormated}</div>
		<div class="mid_div01a">其中：利息费用：</div>
		<div class="mid_div03">${is.financialExpensesInterestExpensesFormated}</div>
		<div class="mid_div01a">利息收入：</div>
		<div class="mid_div03">${is.financialExpensesInterestIncomeFormated}</div>
	</div>

	<div class="mid_div">
		<div class="mid_div01d">加：其他收益：</div>
		<div class="mid_div03">${is.otherIncomeFormated}</div>
		<div class="mid_div01d">投资收益（损失以“－”号填列）：</div>
		<div class="mid_div03">${is.incomeFromInvestmentFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">其中：对联营企业和合营企业的投资收益：</div>
		<div class="mid_div03">${is.investmentIncomeFromAssociatesAndJointVenturesFormated}</div>
		<div class="mid_div01d">汇兑收益（损失以“-”号填列）：</div>
		<div class="mid_div03">${is.exchangeGainsFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">以摊余成本计量的金融资产终止确认收益：</div>
		<div class="mid_div03">${is.incomeFromDerecognitionOfFinancialAssetsMeasuredAtAmortizedCostFormated}</div>
		<div class="mid_div01d">净敞口套期收益（损失以“－”号填列）：</div>
		<div class="mid_div03">${is.netExposureHedgingIncomeFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">公允价值变动收益（损失“－”号填列）：</div>
		<div class="mid_div03">${is.incomeFromChangesInFairValueFormated}</div>
		<div class="mid_div01d">信用减值损失（损失以“-”号填列）：</div>
		<div class="mid_div03">${is.creditImpairmentLossFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">资产减值损失（损失以“-”号填列）：</div>
		<div class="mid_div03">${is.impairmentLossFormated}</div>
		<div class="mid_div01d">资产处置收益（损失以“-”号填列）：</div>
		<div class="mid_div03">${is.assetDisposalIncomeFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">营业利润：</div>
		<div class="mid_div03">${is.operatingProfitFormated}</div>
		<div class="mid_div01a">加：营业外收入：</div>
		<div class="mid_div03">${is.nonOperatingIncomeFormated}</div>
		<div class="mid_div01a">减：营业外支出：</div>
		<div class="mid_div03">${is.nonOperatingExpensesFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">利润总额：</div>
		<div class="mid_div03">${is.totalProfitFormated}</div>
		<div class="mid_div01a">减：所得税费用：</div>
		<div class="mid_div03">${is.incomeTaxExpenseFormated}</div>
		<div class="mid_div01a">净利润：</div>
		<div class="mid_div03">${is.netProfitFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">持续经营净利润：</div>
		<div class="mid_div03">${is.netProfitFromContinuingOperationsFormated}</div>
		<div class="mid_div01d">终止经营净利润：</div>
		<div class="mid_div03">${is.netProfitFromDiscontinuedOperationsFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">归属于母公司股东的净利润：</div>
		<div class="mid_div03">${is.netIncomeAttributableToShareholdersFormated}</div>
		<div class="mid_div01d">少数股东损益：</div>
		<div class="mid_div03">${is.minorityInterestFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">归属母公司所有者其他综合收益税后净额：</div>
		<div class="mid_div03">${is.afterTaxNetAmountOfOtherComprehensiveIncomeAttributableFormated}</div>
		<div class="mid_div01d">不能重分类进损益的其他综合收益：</div>
		<div class="mid_div03">${is.otherComprehensiveIncomeCannotBeReclassifiedIntoProfitOrLossFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">重新计量设定受益计划变动额：</div>
		<div class="mid_div03">${is.remeasureChangesInDefinedBenefitPlansFormated}</div>
		<div class="mid_div01d">权益法下不能转损益的其他综合收益：</div>
		<div class="mid_div03">${is.otherIncomeCannotBeConvertedToProfitOrLossUnderTheEquityMethodFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">其他权益工具投资公允价值变动：</div>
		<div class="mid_div03">${is.changesInFairValueOfOtherEquityInstrumentInvestmentsFormated}</div>
		<div class="mid_div01d">企业自身信用风险公允价值变动：</div>
		<div class="mid_div03">${is.changesInFairValueOfCorporateCreditRiskFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">其他：</div>
		<div class="mid_div03">${is.othersFormated}</div>
		<div class="mid_div01d">将重分类进损益的其他综合收益：</div>
		<div class="mid_div03">${is.otherIncomeReclassifiedToProfitOrLossFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">权益法下可转损益的其他综合收益：</div>
		<div class="mid_div03">${is.otherIncomeCanBeConvertedToProfitOrLossUnderTheEquityMethodFormated}</div>
		<div class="mid_div01d">其他债权投资公允价值变动：</div>
		<div class="mid_div03">${is.changesInFairValueOfOtherDebtInvestmentsFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">金融资产重分类计入其他综合收益的金额：</div>
		<div class="mid_div03">${is.reclassificationOfFinancialAssetsInOtherComprehensiveIncomeFormated}</div>
		<div class="mid_div01d">其他债权投资信用减值准备：</div>
		<div class="mid_div03">${is.provisionForOtherDebtInvestmentsFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">现金流量套期储备：</div>
		<div class="mid_div03">${is.cashFlowHedgingReservesFormated}</div>
		<div class="mid_div01a">外币财报折算差额：</div>
		<div class="mid_div03">${is.currencyTranslationDifferencesFormated}</div>
		<div class="mid_div01a">其他：</div>
		<div class="mid_div03">${is.others1Formated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">归属少数股东的其他综合收益税后净额：</div>
		<div class="mid_div03">${is.otherIncomeAfterTaxAttributableToMinorityShareholdersFormated}</div>
		<div class="mid_div01d">综合收益总额：</div>
		<div class="mid_div03">${is.totalComprehensiveIncomeFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">归属于母公司所有者的综合收益总额：</div>
		<div class="mid_div03">${is.totalComprehensiveIncomeToTheOwnersOfTheParentCompanyFormated}</div>
		<div class="mid_div01d">归属于少数股东的综合收益总额：</div>
		<div class="mid_div03">${is.totalComprehensiveIncomeToMinorityShareholdersFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">基本每股收益：</div>
		<div class="mid_div03">${is.basicEarningsPerShareFormated}</div>
		<div class="mid_div01d">稀释每股收益：</div>
		<div class="mid_div03">${is.dilutedEarningsPerShareFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">ROE：</div>
		<div class="mid_div03">${is.ROEFormated}</div>
		<div class="mid_div01d">财报分红金额：</div>
		<div class="mid_div03">${is.financialReportDividendsFormated}</div>
	</div>
	
	</c:forEach>
	</td>
	</tr>
	</table>
	<div class="mid_kong"></div>
	<div class="mid_kong"></div><div class="mid_kong"></div>
<div><company:end></company:end></div>
</body>
</html>
