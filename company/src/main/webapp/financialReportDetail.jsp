<%@ page language="java" %>
<%@ page pageEncoding="UTF-8" %>
<%@ page contentType="text/html"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="company" %>
<%@ page import="report.bean.entity.*" %>
<%@ page import="report.bean.daolmp.*" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="bsf" class="report.bean.entity.BalanceSheetFormated" scope="request"/>
<jsp:useBean id="bs" class="report.bean.entity.BalanceSheet" scope="request"/>
<jsp:useBean id="rdi" class="report.bean.daolmp.ReportDaoImp" scope="request"/>
<html>
<head>
<meta charset="utf-8">
<title>财报数据查看</title>
<link href="${contextPath}styles/mid.css?v=<%=System.currentTimeMillis()%>" rel="stylesheet" type="text/css">
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
	<c:forEach var="bs" items="${bsList}">
	<div class="mid_title1">资产负债表：（单位：元人民币）</div>
	<div class="mid_title2">流动资产：</div>
	<div class="mid_div">
		<div class="mid_div01a">货币资金：</div>
		<div class="mid_div03">${bs.monetaryCapitalFormated}</div>
		<div class="mid_div01a">结算备付金：</div>
		<div class="mid_div03">${bs.settlementProvisionsFormated}</div>
		<div class="mid_div01a">拆出资金：</div>
		<div class="mid_div03">${bs.lendingFundsFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">交易性金融资产：</div>
		<div class="mid_div03">${bs.tradingFinancialAssetsFormated}</div>
		<div class="mid_div01a">交易性金融资产理财：</div>
		<div class="mid_div03">${bs.tradingFinancialAssetsManagementFormated}</div>
		<div class="mid_div01a">衍生金融资产：</div>
		<div class="mid_div03">${bs.derivativeFinancialAssetsFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">应收票据：</div>
		<div class="mid_div03">${bs.billReceivableFormated}</div>
		<div class="mid_div01a">应收账款：</div>
		<div class="mid_div03">${bs.accountsReceivableFormated}</div>
		<div class="mid_div01a">应收款项融资：</div>
		<div class="mid_div03">${bs.accountsReceivableFinancingFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">预付款项：</div>
		<div class="mid_div03">${bs.prepaymentsFormated}</div>
		<div class="mid_div01a">应收保费：</div>
		<div class="mid_div03">${bs.premiumReceivableFormated}</div>
		<div class="mid_div01a">应收分保账款：</div>
		<div class="mid_div03">${bs.accountsReceivableReinsuranceFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">应收分保合同准备金：</div>
		<div class="mid_div03">${bs.receivableReserveForReinsuranceContractsFormated}</div>
		<div class="mid_div01a">其他应收款：</div>
		<div class="mid_div03">${bs.otherReceivablesFormated}</div>
		<div class="mid_div01a">其中：应收利息：</div>
		<div class="mid_div03">${bs.interestReceivableFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">应收股利：</div>
		<div class="mid_div03">${bs.dividendReceivableFormated}</div>
		<div class="mid_div01a">买入返售金融资产：</div>
		<div class="mid_div03">${bs.buyingBackFinancialAssetsFormated}</div>
		<div class="mid_div01a">存货：</div>
		<div class="mid_div03">${bs.inventoryFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">合同资产：</div>
		<div class="mid_div03">${bs.contractAssetsFormated}</div>
		<div class="mid_div01a">持有待售资产：</div>
		<div class="mid_div03">${bs.assetsHeldForSaleFormated}</div>
		<div class="mid_div01a">一年到期非流动资产：</div>
		<div class="mid_div03">${bs.nonCurrentAssetsDueWithinOneYearFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">其他流动资产：</div>
		<div class="mid_div03">${bs.otherCurrentAssetsFormated}</div>
		<div class="mid_div01a">其他流动资产理财：</div>
		<div class="mid_div03">${bs.otherCurrentAssetsManagementFormated}</div>
		<div class="mid_div01a">流动资产合计：</div>
		<div class="mid_div03">${bs.totalCurrentAssetsFormated}</div>
	</div>
	<div class="mid_title2">非流动资产：</div>
	<div class="mid_div">
		<div class="mid_div01a">发放贷款和垫款：</div>
		<div class="mid_div03">${bs.grantingLoansAndAdvancesFormated}</div>
		<div class="mid_div01a">债权投资：</div>
		<div class="mid_div03">${bs.debtInvestmentFormated}</div>
		<div class="mid_div01a">其他债权投资：</div>
		<div class="mid_div03">${bs.otherDebtInvestmentFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">长期应收款：</div>
		<div class="mid_div03">${bs.longTermReceivablesFormated}</div>
		<div class="mid_div01a">长期股权投资：</div>
		<div class="mid_div03">${bs.longTermEquityInvestmentFormated}</div>
		<div class="mid_div01a">其他权益工具投资：</div>
		<div class="mid_div03">${bs.otherEquityInstrumentInvestmentsFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">其他非流动金融资产：</div>
		<div class="mid_div03">${bs.otherNonCurrentFinancialAssetsFormated}</div>
		<div class="mid_div01a">投资性房地产：</div>
		<div class="mid_div03">${bs.investmentRealEstateFormated}</div>
		<div class="mid_div01a">固定资产：</div>
		<div class="mid_div03">${bs.fixedAssetsFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">在建工程：</div>
		<div class="mid_div03">${bs.constructionInProgressFormated}</div>
		<div class="mid_div01a">生产性生物资产：</div>
		<div class="mid_div03">${bs.productiveBiologicalAssetsFormated}</div>
		<div class="mid_div01a">油气资产：</div>
		<div class="mid_div03">${bs.oilAndGasAssetsFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">使用权资产：</div>
		<div class="mid_div03">${bs.rightOfUseAssetsFormated}</div>
		<div class="mid_div01a">无形资产：</div>
		<div class="mid_div03">${bs.intangibleAssetsFormated}</div>
		<div class="mid_div01a">开发支出：</div>
		<div class="mid_div03">${bs.developmentExpenditureFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">商誉：</div>
		<div class="mid_div03">${bs.goodwillFormated}</div>
		<div class="mid_div01a">长期待摊费用：</div>
		<div class="mid_div03">${bs.longTermDeferredExpenseFormated}</div>
		<div class="mid_div01a">递延所得税资产：</div>
		<div class="mid_div03">${bs.deferredTaxAssetsFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">其他非流动资产：</div>
		<div class="mid_div03">${bs.otherNonCurrentAssetsFormated}</div>
		<div class="mid_div01a">非流动资产合计：</div>
		<div class="mid_div03">${bs.totalNonCurrentAssetsFormated}</div>
		<div class="mid_div01a">资产总计：</div>
		<div class="mid_div03">${bs.totalAssetsFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">与主业无关的长期股权投资：</div>
		<div class="mid_div03">${bs.longTermEquityInvestmentsUnrelatedToMainBusinessFormated}</div>
		<div class="mid_div01c">长期权益投资的收益（权益法核算）：</div>
		<div class="mid_div03">${bs.incomeFromLongTermEquityInvestmentsFormated}</div>
	</div>
	<div class="mid_title2">流动负债：</div>
	<div class="mid_div">
		<div class="mid_div01a">短期借款：</div>
		<div class="mid_div03">${bs.shortTermBorrowingFormated}</div>
		<div class="mid_div01a">向中央银行借款：</div>
		<div class="mid_div03">${bs.borrowingFromTheCentralBankFormated}</div>
		<div class="mid_div01a">拆入资金：</div>
		<div class="mid_div03">${bs.borrowingFundsFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">交易性金融负债：</div>
		<div class="mid_div03">${bs.tradingFinancialLiabilitiesFormated}</div>
		<div class="mid_div01a">衍生金融负债：</div>
		<div class="mid_div03">${bs.derivativeFinancialLiabilitiesFormated}</div>
		<div class="mid_div01a">应付票据：</div>
		<div class="mid_div03">${bs.notesPayableFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">应付账款：</div>
		<div class="mid_div03">${bs.accountsPayableFormated}</div>
		<div class="mid_div01a">预收款项：</div>
		<div class="mid_div03">${bs.advanceReceiptsFormated}</div>
		<div class="mid_div01a">合同负债：</div>
		<div class="mid_div03">${bs.contractLiabilitiesFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">卖出回购金融资产款：</div>
		<div class="mid_div03">${bs.financialAssetsSoldForRepurchaseFormated}</div>
		<div class="mid_div01a">吸收存款及同业存放：</div>
		<div class="mid_div03">${bs.depositAbsorptionAndInterbankDepositsFormated}</div>
		<div class="mid_div01a">代理买卖证券款：</div>
		<div class="mid_div03">${bs.actingTradingSecuritiesFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">代理承销证券款：</div>
		<div class="mid_div03">${bs.actingUnderwritingSecuritiesFormated}</div>
		<div class="mid_div01a">应付职工薪酬：</div>
		<div class="mid_div03">${bs.payrollPayableFormated}</div>
		<div class="mid_div01a">总人数：</div>
		<div class="mid_div03">${bs.totalNumberOfPeople}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">应交税费：</div>
		<div class="mid_div03">${bs.taxPayableFormated}</div>
		<div class="mid_div01a">其他应付款：</div>
		<div class="mid_div03">${bs.otherPayablesFormated}</div>
		<div class="mid_div01a">其中：应付利息：</div>
		<div class="mid_div03">${bs.interestPayableFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">应付股利：</div>
		<div class="mid_div03">${bs.dividendPayableFormated}</div>
		<div class="mid_div01a">应付手续费及佣金：</div>
		<div class="mid_div03">${bs.payableHandlingFeesAndCommissionsFormated}</div>
		<div class="mid_div01a">应付分保账款：</div>
		<div class="mid_div03">${bs.accountsPayableReinsuranceFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">持有待售负债：</div>
		<div class="mid_div03">${bs.heldForSaleLiabilitiesFormated}</div>
		<div class="mid_div01a">一年到期非流动负债：</div>
		<div class="mid_div03">${bs.nonCurrentLiabilitiesDueWithinOneYearFormated}</div>
		<div class="mid_div01a">其他流动负债：</div>
		<div class="mid_div03">${bs.otherCurrentLiabilitiesFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">流动负债合计：</div>
		<div class="mid_div03">${bs.totalCurrentLiabilitiesFormated}</div>
	</div>
	<div class="mid_title2">非流动负债：</div>
	<div class="mid_div">
		<div class="mid_div01a">保险合同准备金：</div>
		<div class="mid_div03">${bs.insuranceContractReservesFormated}</div>
		<div class="mid_div01a">长期借款：</div>
		<div class="mid_div03">${bs.longTermLoanFormated}</div>
		<div class="mid_div01a">应付债券：</div>
		<div class="mid_div03">${bs.bondsPayableFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">其中：优先股：</div>
		<div class="mid_div03">${bs.bondsPayablepreferredSharesFormated}</div>
		<div class="mid_div01a">永续债：</div>
		<div class="mid_div03">${bs.bondsPayableperpetualCapitalSecuritiesFormated}</div>
		<div class="mid_div01a">租赁负债：</div>
		<div class="mid_div03">${bs.leaseLiabilitiesFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">长期应付款：</div>
		<div class="mid_div03">${bs.longTermPayablesFormated}</div>
		<div class="mid_div01a">长期应付职工薪酬：</div>
		<div class="mid_div03">${bs.longTermEmployeeCompensationPayableFormated}</div>
		<div class="mid_div01a">预计负债：</div>
		<div class="mid_div03">${bs.estimatedLiabilitiesFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">递延收益：</div>
		<div class="mid_div03">${bs.deferredIncomeFormated}</div>
		<div class="mid_div01a">递延所得税负债：</div>
		<div class="mid_div03">${bs.deferredIncomeTaxesFormated}</div>
		<div class="mid_div01a">其他非流动负债：</div>
		<div class="mid_div03">${bs.otherNonCurrentLiabilitiesFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">非流动负债合计：</div>
		<div class="mid_div03">${bs.totalNonCurrentLiabilitiesFormated}</div>
		<div class="mid_div01a">负债总计：</div>
		<div class="mid_div03">${bs.totalLiabilitiesFormated}</div>
	</div>
	<div class="mid_title2">所有者权益：</div>
	<div class="mid_div">
		<div class="mid_div01a">股本：</div>
		<div class="mid_div03">${bs.equityFormated}</div>
		<div class="mid_div01a">其他权益工具：</div>
		<div class="mid_div03">${bs.otherEquityInstrumentsFormated}</div>
		<div class="mid_div01a">其中：优先股：</div>
		<div class="mid_div03">${bs.otherEquityInstrumentspreferredSharesFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">永续债：</div>
		<div class="mid_div03">${bs.otherEquityInstrumentspetualCapitalSecuritiesFormated}</div>
		<div class="mid_div01a">资本公积：</div>
		<div class="mid_div03">${bs.capitalReserveFormated}</div>
		<div class="mid_div01a">减：库存股：</div>
		<div class="mid_div03">${bs.treasuryStockFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">其他综合收益：</div>
		<div class="mid_div03">${bs.otherComprehensiveIncomeFormated}</div>
		<div class="mid_div01a">专项储备：</div>
		<div class="mid_div03">${bs.specialReservesFormated}</div>
		<div class="mid_div01a">盈余公积：</div>
		<div class="mid_div03">${bs.surplusReservesFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">一般风险准备：</div>
		<div class="mid_div03">${bs.generalRiskProvisionsFormated}</div>
		<div class="mid_div01a">未分配利润：</div>
		<div class="mid_div03">${bs.undistributedProfitFormated}</div>
		<div class="mid_div01a">归属母公司所有者权益合计：</div>
		<div class="mid_div03">${bs.totalEquityAttributableOfParentCompanyFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">少数股东权益：</div>
		<div class="mid_div03">${bs.minorityInterestFormated}</div>
		<div class="mid_div01a">所有者权益合计：</div>
		<div class="mid_div03">${bs.totalOwnersEquityFormated}</div>
		<div class="mid_div01a">负债和所有者权益总计：</div>
		<div class="mid_div03">${bs.totalLiabilitiesAndOwnersEquityFormated}</div>
	</div>
</c:forEach>
</td>
	</tr>
	</table>
	<div class="mid_kong"></div>
	<div class="mid_kong"></div>
	<div class="mid_kong"></div>
<div><company:end></company:end></div>
</body>
</html>
