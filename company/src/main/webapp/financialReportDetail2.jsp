<%@ page language="java" %>
<%@ page pageEncoding="UTF-8" %>
<%@ page contentType="text/html"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="company" %>
<%@ page import="report.bean.entity.*" %>
<%@ page import="report.bean.daolmp.*" %>
<%@ page import="java.util.ArrayList" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="is" class="report.bean.entity.CashflowStatementFormated" scope="request"/>
<jsp:useBean id="bs" class="report.bean.entity.BalanceSheet" scope="request"/>
<jsp:useBean id="rdi" class="report.bean.daolmp.ReportDaoImp" scope="request"/>
<html>
<head>
<meta charset="utf-8">
<title>财报数据查看</title>
<link href="${contextPath}styles/mid.css?v=<%=System.currentTimeMillis()%>" rel="stylesheet" type="text/css">
</head>
<%
ReportDaoImp ri=new ReportDaoImp();
ArrayList<BalanceSheet> riList =ri.frHead();
pageContext.setAttribute("riList", riList);
%>
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
	<c:forEach var="cs" items="${csList}">
	<div class="mid_title1">现金流量表（单位：元人民币）</div>
	<div class="mid_title2">经营活动产生的现金流量：</div>

	<div class="mid_div">
		<div class="mid_div01d">销售商品、提供劳务收到的现金：</div>
		<div class="mid_div03">${cs.cashReceivedFromSellingGoodsAndProvidingServicesFormated}</div>
		<div class="mid_div01d">客户存款和同业存放款项净增加额：</div>
		<div class="mid_div03">${cs.netIncreaseInCustomerDepositsAndInterbankDepositsFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">向中央银行借款净增加额：</div>
		<div class="mid_div03">${cs.netIncreaseInBorrowingFromTheCentralBankFormated}</div>
		<div class="mid_div01d">向其他金融机构拆入资金净增加额：</div>
		<div class="mid_div03">${cs.netIncreaseInBorrowingFundsFromOtherFinancialInstitutionsFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">收到原保险合同保费取得的现金：</div>
		<div class="mid_div03">${cs.cashReceivedFromPremiumOfOriginalInsuranceContractFormated}</div>
		<div class="mid_div01d">收到再保业务现金净额：</div>
		<div class="mid_div03">${cs.receiptOfReinsuranceNetCashFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">保户储金及投资款净增加额：</div>
		<div class="mid_div03">${cs.netIncreaseInDepositsFromPolicyholdersFormated}</div>
		<div class="mid_div01d">收取利息、手续费及佣金的现金：</div>
		<div class="mid_div03">${cs.cashChargeInterestFeesAndCommissionsFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">拆入资金净增加额：</div>
		<div class="mid_div03">${cs.netIncreaseInBorrowedFundsFormated}</div>
		<div class="mid_div01d">回购业务资金净增加额：</div>
		<div class="mid_div03">${cs.netIncreaseInRepurchaseBusinessFundsFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">代理买卖证券收到的现金净额：</div>
		<div class="mid_div03">${cs.netCashReceivedFromProxyTradingOfSecuritiesFormated}</div>
		<div class="mid_div01d">收到的税费返还：</div>
		<div class="mid_div03">${cs.refundsOfTaxesFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">收到其他与经营活动有关的现金：</div>
		<div class="mid_div03">${cs.otherCashReceivedRelatingToOperatingActivitiesFormated}</div>
		<div class="mid_div01d">经营活动现金流入小计：</div>
		<div class="mid_div03">${cs.businessActivitiesSubtotalOfCashInflowsFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">购买商品、接受劳务支付的现金：</div>
		<div class="mid_div03">${cs.cashPaidForPurchasingGoodsAndReceivingServicesFormated}</div>
		<div class="mid_div01d">客户贷款及垫款净增加额：</div>
		<div class="mid_div03">${cs.netIncreaseInCustomerLoansAndAdvancesFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">存放中央银行和同业款项净增加额：</div>
		<div class="mid_div03">${cs.netIncreaseInDepositsWithCentralBanksAndInterbankFundsFormated}</div>
		<div class="mid_div01d">支付原保险合同赔付款项的现金：</div>
		<div class="mid_div03">${cs.paymentOfTheOriginalInsuranceContractToPayTheAmountOfCashFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">拆出资金净增加额：</div>
		<div class="mid_div03">${cs.netIncreaseInLendingFundsFormated}</div>
		<div class="mid_div01d">支付利息、手续费及佣金的现金：</div>
		<div class="mid_div03">${cs.cashPaidForInterestHandlingFeesAndCommissionsFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">支付保单红利的现金：</div>
		<div class="mid_div03">${cs.cashPaidForPolicyDividendsFormated}</div>
		<div class="mid_div01d">支付给职工以及为职工支付的现金：</div>
		<div class="mid_div03">${cs.cashPaidToAndOnBehalfOfEmployeesFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">支付的各项税费：</div>
		<div class="mid_div03">${cs.taxesPaidFormated}</div>
		<div class="mid_div01d">支付其他与经营活动有关的现金：</div>
		<div class="mid_div03">${cs.paymentOfOtherCashRelatedToOperatingActivitiesFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">经营活动现金流出小计：</div>
		<div class="mid_div03">${cs.subtotalOfCashOutflowsFromOperatingActivitiesFormated}</div>
		<div class="mid_div01d">经营活动产生的现金流量净额：</div>
		<div class="mid_div03">${cs.netCashFlowFromOperatingFormated}</div>
	</div>
	
	<div class="mid_title2">投资活动产生的现金流量：</div>
	<div class="mid_div">
		<div class="mid_div01d">收回投资收到的现金：</div>
		<div class="mid_div03">${cs.cashReceivedFromInvestmentRecoveryFormated}</div>
		<div class="mid_div01d">取得投资收益收到的现金：</div>
		<div class="mid_div03">${cs.cashReceivedFromObtainingInvestmentReturnsFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">处置固定、无形和其他长期资产收回现金：</div>
		<div class="mid_div03">${cs.netCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssetsFormated}</div>
		<div class="mid_div01d">处置子公司及其他营业单位收到现金净额：</div>
		<div class="mid_div03">${cs.netCashReceivedFromDisposalOfSubsidiariesAndOtherOperatingUnitsFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">收到其他与投资活动有关的现金：</div>
		<div class="mid_div03">${cs.receivedOtherCashRelatedToInvestmentActivitiesFormated}</div>
		<div class="mid_div01d">投资活动现金流入小计：</div>
		<div class="mid_div03">${cs.subtotalOfCashInflowsFromInvestmentActivitiesFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">购建固定、无形和其他长期资产支付现金：</div>
		<div class="mid_div03">${cs.cashPaidForPurchaseConstructionFixedIntangibleLongTermAssetsFormated}</div>
		<div class="mid_div01d">投资支付的现金：</div>
		<div class="mid_div03">${cs.cashPaidForInvestmentFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">质押贷款净增加额：</div>
		<div class="mid_div03">${cs.netIncreaseInPledgedLoansFormated}</div>
		<div class="mid_div01d">取得子公司及其他营业单位支付现金净额：</div>
		<div class="mid_div03">${cs.netCashPaidToSubsidiariesAndOtherBusinessUnitsFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">支付其他与投资活动有关的现金：</div>
		<div class="mid_div03">${cs.paymentOfOtherCashRelatedToInvestmentActivitiesFormated}</div>
		<div class="mid_div01d">投资活动现金流出小计：</div>
		<div class="mid_div03">${cs.subtotalOfCashOutflowsFromInvestmentActivitiesFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">投资活动产生的现金流量净额：</div>
		<div class="mid_div03">${cs.netCashFlowGeneratedFromInvestmentActivitiesFormated}</div>
	</div>
	
	<div class="mid_title2">筹资活动产生的现金流量：</div>
	<div class="mid_div">
		<div class="mid_div01d">吸收投资收到的现金：</div>
		<div class="mid_div03">${cs.cashReceivedFromAbsorbingInvestmentsFormated}</div>
		<div class="mid_div01d">其中：子公司吸收少数股东投资收到现金：</div>
		<div class="mid_div03">${cs.cashReceivedFromMinorityInvestmentInSubsidiariesFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">取得借款收到的现金：</div>
		<div class="mid_div03">${cs.cashReceivedFromObtainingLoansFormated}</div>
		<div class="mid_div01d">收到其他与筹资活动有关的现金：</div>
		<div class="mid_div03">${cs.receivedOtherCashRelatedToFinancingActivitiesFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">筹资活动现金流入小计：</div>
		<div class="mid_div03">${cs.subtotalOfCashInflowsFromFinancingActivitiesFormated}</div>
		<div class="mid_div01d">偿还债务支付的现金：</div>
		<div class="mid_div03">${cs.cashRepaymentsOfAmountsBorrowedFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">分配股利、利润或偿付利息支付的现金：</div>
		<div class="mid_div03">${cs.cashPaidForDistributingDividendsProfitsPayingInterestFormated}</div>
		<div class="mid_div01d">子公司支付给少数股东的股利、利润：</div>
		<div class="mid_div03">${cs.dividendsAndProfitsAaidBySubsidiariesToMinorityShareholdersFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">支付其他与筹资活动有关的现金：</div>
		<div class="mid_div03">${cs.paymentOfOtherCashRelatedToFinancingActivitiesFormated}</div>
		<div class="mid_div01d">筹资活动现金流出小计：</div>
		<div class="mid_div03">${cs.subtotalOfCashOutflowsFromFinancingActivitiesFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">筹资活动产生的现金流量净额：</div>
		<div class="mid_div03">${cs.netCashFlowGeneratedFromFinancingActivitiesFormated}</div>
		<div class="mid_div01d">汇率变动对现金及现金等价物的影响：</div>
		<div class="mid_div03">${cs.theImpactOfExchangeRateFluctuationsOnCashAndCashEquivalentsFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">现金及现金等价物净增加额：</div>
		<div class="mid_div03">${cs.netIncreaseInCashAndCashEquivalentsFormated}</div>
		<div class="mid_div01d">加：期初现金及现金等价物余额：</div>
		<div class="mid_div03">${cs.openingCashAndCashEquivalentsBalanceFormated}</div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">期末现金及现金等价物余额：</div>
		<div class="mid_div03">${cs.closingBalanceOfCashAndCashEquivalentsFormated}</div>
		
	</div>
	
	</c:forEach>
	</td>
	</tr>
	</table>
	<div class="mid_kong"></div>
<div><company:end></company:end></div>
</body>
</html>
