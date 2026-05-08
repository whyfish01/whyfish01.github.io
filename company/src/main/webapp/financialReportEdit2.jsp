<%@ page language="java" %>
<%@ page pageEncoding="UTF-8" %>
<%@ page contentType="text/html"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="company" %>
<%@ page import="report.bean.entity.*" %>
<%@ page import="report.bean.daolmp.*" %>
<%@ page import="java.util.ArrayList" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="csf" class="report.bean.entity.CashflowStatementFormated" scope="request"/>
<jsp:useBean id="cs1" class="report.bean.entity.CashflowStatement" scope="request"/>
<jsp:useBean id="bs" class="report.bean.entity.BalanceSheet" scope="request"/>
<jsp:useBean id="rdi" class="report.bean.daolmp.ReportDaoImp" scope="request"/>
<html>
<head>
<meta charset="utf-8">
<title>财报数据修改</title>
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
	<form action="EditCashflowStatement" method="post">
	<c:forEach var="cs" items="${csList}">
	<div class="mid_title1">现金流量表（单位：元人民币）</div>
	<div class="mid_title2">经营活动产生的现金流量：</div>

	<div class="mid_div">
		<div class="mid_div01d">销售商品、提供劳务收到的现金：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="cashReceivedFromSellingGoodsAndProvidingServices" value="${cs.cashReceivedFromSellingGoodsAndProvidingServicesFormated}"></div>
		<div class="mid_div01d">客户存款和同业存放款项净增加额：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="netIncreaseInCustomerDepositsAndInterbankDeposits" value="${cs.netIncreaseInCustomerDepositsAndInterbankDepositsFormated}"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">向中央银行借款净增加额：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="netIncreaseInBorrowingFromTheCentralBank" value="${cs.netIncreaseInBorrowingFromTheCentralBankFormated}"></div>
		<div class="mid_div01d">向其他金融机构拆入资金净增加额：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="netIncreaseInBorrowingFundsFromOtherFinancialInstitutions" value="${cs.netIncreaseInBorrowingFundsFromOtherFinancialInstitutionsFormated}"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">收到原保险合同保费取得的现金：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="cashReceivedFromPremiumOfOriginalInsuranceContract" value="${cs.cashReceivedFromPremiumOfOriginalInsuranceContractFormated}"></div>
		<div class="mid_div01d">收到再保业务现金净额：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="receiptOfReinsuranceNetCash" value="${cs.receiptOfReinsuranceNetCashFormated}"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">保户储金及投资款净增加额：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="netIncreaseInDepositsFromPolicyholders" value="${cs.netIncreaseInDepositsFromPolicyholdersFormated}"></div>
		<div class="mid_div01d">收取利息、手续费及佣金的现金：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="cashChargeInterestFeesAndCommissions" value="${cs.cashChargeInterestFeesAndCommissionsFormated}"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">拆入资金净增加额：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="netIncreaseInBorrowedFunds" value="${cs.netIncreaseInBorrowedFundsFormated}"></div>
		<div class="mid_div01d">回购业务资金净增加额：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="netIncreaseInRepurchaseBusinessFunds" value="${cs.netIncreaseInRepurchaseBusinessFundsFormated}"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">代理买卖证券收到的现金净额：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="netCashReceivedFromProxyTradingOfSecurities" value="${cs.netCashReceivedFromProxyTradingOfSecuritiesFormated}"></div>
		<div class="mid_div01d">收到的税费返还：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="refundsOfTaxes" value="${cs.refundsOfTaxesFormated}"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">收到其他与经营活动有关的现金：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="otherCashReceivedRelatingToOperatingActivities" value="${cs.otherCashReceivedRelatingToOperatingActivitiesFormated}"></div>
		<div class="mid_div01d">经营活动现金流入小计：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="businessActivitiesSubtotalOfCashInflows" value="${cs.businessActivitiesSubtotalOfCashInflowsFormated}"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">购买商品、接受劳务支付的现金：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="cashPaidForPurchasingGoodsAndReceivingServices" value="${cs.cashPaidForPurchasingGoodsAndReceivingServicesFormated}"></div>
		<div class="mid_div01d">客户贷款及垫款净增加额：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="netIncreaseInCustomerLoansAndAdvances" value="${cs.netIncreaseInCustomerLoansAndAdvancesFormated}"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">存放中央银行和同业款项净增加额：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="netIncreaseInDepositsWithCentralBanksAndInterbankFunds" value="${cs.netIncreaseInDepositsWithCentralBanksAndInterbankFundsFormated}"></div>
		<div class="mid_div01d">支付原保险合同赔付款项的现金：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="paymentOfTheOriginalInsuranceContractToPayTheAmountOfCash" value="${cs.paymentOfTheOriginalInsuranceContractToPayTheAmountOfCashFormated}"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">拆出资金净增加额：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="netIncreaseInLendingFunds" value="${cs.netIncreaseInLendingFundsFormated}"></div>
		<div class="mid_div01d">支付利息、手续费及佣金的现金：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="cashPaidForInterestHandlingFeesAndCommissions" value="${cs.cashPaidForInterestHandlingFeesAndCommissionsFormated}"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">支付保单红利的现金：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="cashPaidForPolicyDividends" value="${cs.cashPaidForPolicyDividendsFormated}"></div>
		<div class="mid_div01d">支付给职工以及为职工支付的现金：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="cashPaidToAndOnBehalfOfEmployees" value="${cs.cashPaidToAndOnBehalfOfEmployeesFormated}"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">支付的各项税费：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="taxesPaid" value="${cs.taxesPaidFormated}"></div>
		<div class="mid_div01d">支付其他与经营活动有关的现金：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="paymentOfOtherCashRelatedToOperatingActivities" value="${cs.paymentOfOtherCashRelatedToOperatingActivitiesFormated}"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">经营活动现金流出小计：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="subtotalOfCashOutflowsFromOperatingActivities" value="${cs.subtotalOfCashOutflowsFromOperatingActivitiesFormated}"></div>
		<div class="mid_div01d">经营活动产生的现金流量净额：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="netCashFlowFromOperating" value="${cs.netCashFlowFromOperatingFormated}"></div>
	</div>
	
	<div class="mid_title2">投资活动产生的现金流量：</div>
	<div class="mid_div">
		<div class="mid_div01d">收回投资收到的现金：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="cashReceivedFromInvestmentRecovery" value="${cs.cashReceivedFromInvestmentRecoveryFormated}"></div>
		<div class="mid_div01d">取得投资收益收到的现金：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="cashReceivedFromObtainingInvestmentReturns" value="${cs.cashReceivedFromObtainingInvestmentReturnsFormated}"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">处置固定、无形和其他长期资产收回现金：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="netCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssets" value="${cs.netCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssetsFormated}"></div>
		<div class="mid_div01d">处置子公司及其他营业单位收到现金净额：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="netCashReceivedFromDisposalOfSubsidiariesAndOtherOperatingUnits" value="${cs.netCashReceivedFromDisposalOfSubsidiariesAndOtherOperatingUnitsFormated}"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">收到其他与投资活动有关的现金：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="receivedOtherCashRelatedToInvestmentActivities" value="${cs.receivedOtherCashRelatedToInvestmentActivitiesFormated}"></div>
		<div class="mid_div01d">投资活动现金流入小计：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="subtotalOfCashInflowsFromInvestmentActivities" value="${cs.subtotalOfCashInflowsFromInvestmentActivitiesFormated}"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">购建固定、无形和其他长期资产支付现金：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="cashPaidForPurchaseConstructionFixedIntangibleLongTermAssets" value="${cs.cashPaidForPurchaseConstructionFixedIntangibleLongTermAssetsFormated}"></div>
		<div class="mid_div01d">投资支付的现金：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="cashPaidForInvestment" value="${cs.cashPaidForInvestmentFormated}"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">质押贷款净增加额：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="netIncreaseInPledgedLoans" value="${cs.netIncreaseInPledgedLoansFormated}"></div>
		<div class="mid_div01d">取得子公司及其他营业单位支付现金净额：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="netCashPaidToSubsidiariesAndOtherBusinessUnits" value="${cs.netCashPaidToSubsidiariesAndOtherBusinessUnitsFormated}"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">支付其他与投资活动有关的现金：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="paymentOfOtherCashRelatedToInvestmentActivities" value="${cs.paymentOfOtherCashRelatedToInvestmentActivitiesFormated}"></div>
		<div class="mid_div01d">投资活动现金流出小计：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="subtotalOfCashOutflowsFromInvestmentActivities" value="${cs.subtotalOfCashOutflowsFromInvestmentActivitiesFormated}"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">投资活动产生的现金流量净额：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="netCashFlowGeneratedFromInvestmentActivities" value="${cs.netCashFlowGeneratedFromInvestmentActivitiesFormated}"></div>
	</div>
	
	<div class="mid_title2">筹资活动产生的现金流量：</div>
	<div class="mid_div">
		<div class="mid_div01d">吸收投资收到的现金：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="cashReceivedFromAbsorbingInvestments" value="${cs.cashReceivedFromAbsorbingInvestmentsFormated}"></div>
		<div class="mid_div01d">其中：子公司吸收少数股东投资收到现金：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="cashReceivedFromMinorityInvestmentInSubsidiaries" value="${cs.cashReceivedFromMinorityInvestmentInSubsidiariesFormated}"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">取得借款收到的现金：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="cashReceivedFromObtainingLoans" value="${cs.cashReceivedFromObtainingLoansFormated}"></div>
		<div class="mid_div01d">收到其他与筹资活动有关的现金：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="receivedOtherCashRelatedToFinancingActivities" value="${cs.receivedOtherCashRelatedToFinancingActivitiesFormated}"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">筹资活动现金流入小计：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="subtotalOfCashInflowsFromFinancingActivities" value="${cs.subtotalOfCashInflowsFromFinancingActivitiesFormated}"></div>
		<div class="mid_div01d">偿还债务支付的现金：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="cashRepaymentsOfAmountsBorrowed" value="${cs.cashRepaymentsOfAmountsBorrowedFormated}"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">分配股利、利润或偿付利息支付的现金：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="cashPaidForDistributingDividendsProfitsPayingInterest" value="${cs.cashPaidForDistributingDividendsProfitsPayingInterestFormated}"></div>
		<div class="mid_div01d">子公司支付给少数股东的股利、利润：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="dividendsAndProfitsAaidBySubsidiariesToMinorityShareholders" value="${cs.dividendsAndProfitsAaidBySubsidiariesToMinorityShareholdersFormated}"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">支付其他与筹资活动有关的现金：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="paymentOfOtherCashRelatedToFinancingActivities" value="${cs.paymentOfOtherCashRelatedToFinancingActivitiesFormated}"></div>
		<div class="mid_div01d">筹资活动现金流出小计：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="subtotalOfCashOutflowsFromFinancingActivities" value="${cs.subtotalOfCashOutflowsFromFinancingActivitiesFormated}"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">筹资活动产生的现金流量净额：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="netCashFlowGeneratedFromFinancingActivities" value="${cs.netCashFlowGeneratedFromFinancingActivitiesFormated}"></div>
		<div class="mid_div01d">汇率变动对现金及现金等价物的影响：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="theImpactOfExchangeRateFluctuationsOnCashAndCashEquivalents" value="${cs.theImpactOfExchangeRateFluctuationsOnCashAndCashEquivalentsFormated}"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">现金及现金等价物净增加额：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="netIncreaseInCashAndCashEquivalents" value="${cs.netIncreaseInCashAndCashEquivalentsFormated}"></div>
		<div class="mid_div01d">加：期初现金及现金等价物余额：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="openingCashAndCashEquivalentsBalance" value="${cs.openingCashAndCashEquivalentsBalanceFormated}"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">期末现金及现金等价物余额：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="closingBalanceOfCashAndCashEquivalents" value="${cs.closingBalanceOfCashAndCashEquivalentsFormated}"></div>
		
	</div>
	<div class="mid_div">
		<input type="hidden" name="financialReportingNo" value="${cs.financialReportingNo}">
		<div class="mid_div06"><input type="submit" class="mid_an" value="保存"></div>	
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
