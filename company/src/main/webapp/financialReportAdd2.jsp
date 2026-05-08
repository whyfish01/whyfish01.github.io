<%@ page language="java" %>
<%@ page pageEncoding="UTF-8" %>
<%@ page contentType="text/html"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="company" %>
<%@ page import="report.bean.entity.*" %>
<%@ page import="report.bean.daolmp.*" %>
<%@ page import="java.util.ArrayList" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="is" class="report.bean.entity.CashflowStatement" scope="request"/>
<jsp:useBean id="bs" class="report.bean.entity.BalanceSheet" scope="request"/>
<jsp:useBean id="rdi" class="report.bean.daolmp.ReportDaoImp" scope="request"/>
<html>
<head>
<meta charset="utf-8">
<title>财报数据采集</title>
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
	<td>
	<div class="mid_title">财报数据采集
		<input type="button" class="mid_an02" value="PDF导入">
		<a href="financialReportAdd3.jsp" target="_self"><input type="button" class="mid_an01a" value="现金流量表补充"></a>
		<a href="financialReportAdd2.jsp" target="_self"><input type="button" class="mid_an01" value="现金流量表"></a>
		<a href="financialReportAdd1.jsp" target="_self"><input type="button" class="mid_an01" value="利润表"></a>
		<a href="financialReportAdd.jsp" target="_self"><input type="button" class="mid_an01" value="资产负债表"></a>
	</div>
	<form action="InsertCashflowStatement" method="post">
	<div class="mid_title1">基本信息</div>
	<c:forEach var="il" items="${riList}">
	<div class="mid_div">
		<div class="mid_div01a_red">A股代码：</div>
		<div class="mid_div03">${il.AShareCode}</div>
		<div class="mid_div01a">A股简称：</div>
		<div class="mid_div03">${il.AShareName}</div>
		<div class="mid_div01a_red">所属年份：</div>
		<div class="mid_div03">${il.financialReportingYear}</div>
		<input type="hidden" name="financialReportingNo" value="${il.financialReportingNo}">
	</div>
	</c:forEach>
	<div class="mid_title1">现金流量表（单位：元人民币）</div>
	<div class="mid_title2">经营活动产生的现金流量：</div>

	<div class="mid_div">
		<div class="mid_div01d">销售商品、提供劳务收到的现金：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="cashReceivedFromSellingGoodsAndProvidingServices"></div>
		<div class="mid_div01d">客户存款和同业存放款项净增加额：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="netIncreaseInCustomerDepositsAndInterbankDeposits"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">向中央银行借款净增加额：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="netIncreaseInBorrowingFromTheCentralBank"></div>
		<div class="mid_div01d">向其他金融机构拆入资金净增加额：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="netIncreaseInBorrowingFundsFromOtherFinancialInstitutions"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">收到原保险合同保费取得的现金：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="cashReceivedFromPremiumOfOriginalInsuranceContract"></div>
		<div class="mid_div01d">收到再保业务现金净额：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="receiptOfReinsuranceNetCash"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">保户储金及投资款净增加额：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="netIncreaseInDepositsFromPolicyholders"></div>
		<div class="mid_div01d">收取利息、手续费及佣金的现金：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="cashChargeInterestFeesAndCommissions"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">拆入资金净增加额：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="netIncreaseInBorrowedFunds"></div>
		<div class="mid_div01d">回购业务资金净增加额：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="netIncreaseInRepurchaseBusinessFunds"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">代理买卖证券收到的现金净额：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="netCashReceivedFromProxyTradingOfSecurities"></div>
		<div class="mid_div01d">收到的税费返还：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="refundsOfTaxes"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">收到其他与经营活动有关的现金：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="otherCashReceivedRelatingToOperatingActivities"></div>
		<div class="mid_div01d">经营活动现金流入小计：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="businessActivitiesSubtotalOfCashInflows"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">购买商品、接受劳务支付的现金：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="cashPaidForPurchasingGoodsAndReceivingServices"></div>
		<div class="mid_div01d">客户贷款及垫款净增加额：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="netIncreaseInCustomerLoansAndAdvances"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">存放中央银行和同业款项净增加额：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="netIncreaseInDepositsWithCentralBanksAndInterbankFunds"></div>
		<div class="mid_div01d">支付原保险合同赔付款项的现金：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="paymentOfTheOriginalInsuranceContractToPayTheAmountOfCash"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">拆出资金净增加额：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="netIncreaseInLendingFunds"></div>
		<div class="mid_div01d">支付利息、手续费及佣金的现金：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="cashPaidForInterestHandlingFeesAndCommissions"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">支付保单红利的现金：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="cashPaidForPolicyDividends"></div>
		<div class="mid_div01d">支付给职工以及为职工支付的现金：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="cashPaidToAndOnBehalfOfEmployees"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">支付的各项税费：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="taxesPaid"></div>
		<div class="mid_div01d">支付其他与经营活动有关的现金：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="paymentOfOtherCashRelatedToOperatingActivities"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">经营活动现金流出小计：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="subtotalOfCashOutflowsFromOperatingActivities"></div>
		<div class="mid_div01d">经营活动产生的现金流量净额：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="netCashFlowFromOperating"></div>
	</div>
	
	<div class="mid_title2">投资活动产生的现金流量：</div>
	<div class="mid_div">
		<div class="mid_div01d">收回投资收到的现金：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="cashReceivedFromInvestmentRecovery"></div>
		<div class="mid_div01d">取得投资收益收到的现金：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="cashReceivedFromObtainingInvestmentReturns"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">处置固定、无形和其他长期资产收回现金：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="netCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssets"></div>
		<div class="mid_div01d">处置子公司及其他营业单位收到现金净额：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="netCashReceivedFromDisposalOfSubsidiariesAndOtherOperatingUnits"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">收到其他与投资活动有关的现金：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="receivedOtherCashRelatedToInvestmentActivities"></div>
		<div class="mid_div01d">投资活动现金流入小计：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="subtotalOfCashInflowsFromInvestmentActivities"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">购建固定、无形和其他长期资产支付现金：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="cashPaidForPurchaseConstructionFixedIntangibleLongTermAssets"></div>
		<div class="mid_div01d">投资支付的现金：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="cashPaidForInvestment"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">质押贷款净增加额：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="netIncreaseInPledgedLoans"></div>
		<div class="mid_div01d">取得子公司及其他营业单位支付现金净额：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="netCashPaidToSubsidiariesAndOtherBusinessUnits"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">支付其他与投资活动有关的现金：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="paymentOfOtherCashRelatedToInvestmentActivities"></div>
		<div class="mid_div01d">投资活动现金流出小计：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="subtotalOfCashOutflowsFromInvestmentActivities"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">投资活动产生的现金流量净额：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="netCashFlowGeneratedFromInvestmentActivities"></div>
	</div>
	
	<div class="mid_title2">筹资活动产生的现金流量：</div>
	<div class="mid_div">
		<div class="mid_div01d">吸收投资收到的现金：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="cashReceivedFromAbsorbingInvestments"></div>
		<div class="mid_div01d">其中：子公司吸收少数股东投资收到现金：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="cashReceivedFromMinorityInvestmentInSubsidiaries"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">取得借款收到的现金：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="cashReceivedFromObtainingLoans"></div>
		<div class="mid_div01d">收到其他与筹资活动有关的现金：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="receivedOtherCashRelatedToFinancingActivities"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">筹资活动现金流入小计：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="subtotalOfCashInflowsFromFinancingActivities"></div>
		<div class="mid_div01d">偿还债务支付的现金：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="cashRepaymentsOfAmountsBorrowed"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">分配股利、利润或偿付利息支付的现金：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="cashPaidForDistributingDividendsProfitsPayingInterest"></div>
		<div class="mid_div01d">子公司支付给少数股东的股利、利润：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="dividendsAndProfitsAaidBySubsidiariesToMinorityShareholders"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">支付其他与筹资活动有关的现金：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="paymentOfOtherCashRelatedToFinancingActivities"></div>
		<div class="mid_div01d">筹资活动现金流出小计：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="subtotalOfCashOutflowsFromFinancingActivities"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">筹资活动产生的现金流量净额：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="netCashFlowGeneratedFromFinancingActivities"></div>
		<div class="mid_div01d">汇率变动对现金及现金等价物的影响：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="theImpactOfExchangeRateFluctuationsOnCashAndCashEquivalents"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">现金及现金等价物净增加额：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="netIncreaseInCashAndCashEquivalents"></div>
		<div class="mid_div01d">加：期初现金及现金等价物余额：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="openingCashAndCashEquivalentsBalance"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">期末现金及现金等价物余额：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="closingBalanceOfCashAndCashEquivalents"></div>
		
	</div>
	<div class="mid_div">
		<div class="mid_div06"><input type="submit" class="mid_an" value="保存"></div>	
	</div>
	<div class='message_font'>${a}</div>
	</form>
	</td>
	</tr>
	</table>
	<div class="mid_kong"></div>
<div><company:end></company:end></div>
</body>
</html>
