<%@ page language="java" %>
<%@ page pageEncoding="UTF-8" %>
<%@ page contentType="text/html"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="company" %>
<%@ page import="report.bean.entity.*" %>
<%@ page import="report.bean.daolmp.*" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="bs" class="report.bean.entity.BalanceSheet" scope="request"/>
<jsp:useBean id="rdi" class="report.bean.daolmp.ReportDaoImp" scope="request"/>
<html>
<head>
<meta charset="utf-8">
<title>财报数据采集</title>
<link href="${contextPath}styles/mid.css?v=<%=System.currentTimeMillis()%>" rel="stylesheet" type="text/css">
</head>

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
	<form style="margin:0px;" action="InsertBalanceSheet" method="post">
	<div class="mid_title1">基本信息</div>
	
	<div class="mid_div">
		<div class="mid_div01a_red">A股代码：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="AShareCode"></div>
		<div class="mid_div01a">A股简称：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="AShareName"></div>
		<div class="mid_div01a_red">所属年份：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="financialReportingYear"></div>
	</div>
		
	<div class="mid_div">
		<div class="mid_div01a_red">审计意见：</div>
		<div class="mid_div04"><input type="text" class="mid_box04a" name="auditOpinion"></div>
	</div>
	
	<div class="mid_title1">资产负债表：（单位：元人民币）</div>
	<div class="mid_title2">流动资产：</div>
	<div class="mid_div">
		<div class="mid_div01a">货币资金：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="monetaryCapital"></div>
		<div class="mid_div01a">结算备付金：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="settlementProvisions"></div>
		<div class="mid_div01a">拆出资金：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="lendingFunds"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">交易性金融资产：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="tradingFinancialAssets"></div>
		<div class="mid_div01underline">交易性金融资产理财：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="tradingFinancialAssetsManagement"></div>
		<div class="mid_div01a">衍生金融资产：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="derivativeFinancialAssets"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">应收票据：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="billReceivable"></div>
		<div class="mid_div01a">应收账款：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="accountsReceivable"></div>
		<div class="mid_div01a">应收款项融资：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="accountsReceivableFinancing"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">预付款项：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="prepayments"></div>
		<div class="mid_div01a">应收保费：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="premiumReceivable"></div>
		<div class="mid_div01a">应收分保账款：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="accountsReceivableReinsurance"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">应收分保合同准备金：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="receivableReserveForReinsuranceContracts"></div>
		<div class="mid_div01a">其他应收款：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="otherReceivables"></div>
		<div class="mid_div01a">其中：应收利息：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="interestReceivable"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">应收股利：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="dividendReceivable"></div>
		<div class="mid_div01a">买入返售金融资产：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="buyingBackFinancialAssets"></div>
		<div class="mid_div01a">存货：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="inventory"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">合同资产：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="contractAssets"></div>
		<div class="mid_div01a">持有待售资产：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="assetsHeldForSale"></div>
		<div class="mid_div01a">一年到期非流动资产：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="nonCurrentAssetsDueWithinOneYear"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">其他流动资产：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="otherCurrentAssets"></div>
		<div class="mid_div01underline">其他流动资产理财：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="otherCurrentAssetsManagement"></div>
		<div class="mid_div01a">流动资产合计：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="totalCurrentAssets"></div>
	</div>
	<div class="mid_title2">非流动资产：</div>
	<div class="mid_div">
		<div class="mid_div01a">发放贷款和垫款：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="grantingLoansAndAdvances"></div>
		<div class="mid_div01a">债权投资：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="debtInvestment"></div>
		<div class="mid_div01a">其他债权投资：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="otherDebtInvestment"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">长期应收款：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="longTermReceivables"></div>
		<div class="mid_div01a">长期股权投资：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="longTermEquityInvestment"></div>
		<div class="mid_div01a">其他权益工具投资：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="otherEquityInstrumentInvestments"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">其他非流动金融资产：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="otherNonCurrentFinancialAssets"></div>
		<div class="mid_div01a">投资性房地产：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="investmentRealEstate"></div>
		<div class="mid_div01a">固定资产：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="fixedAssets"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">在建工程：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="constructionInProgress"></div>
		<div class="mid_div01a">生产性生物资产：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="productiveBiologicalAssets"></div>
		<div class="mid_div01a">油气资产：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="oilAndGasAssets"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">使用权资产：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="rightOfUseAssets"></div>
		<div class="mid_div01a">无形资产：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="intangibleAssets"></div>
		<div class="mid_div01a">开发支出：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="developmentExpenditure"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">商誉：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="goodwill"></div>
		<div class="mid_div01a">长期待摊费用：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="longTermDeferredExpense"></div>
		<div class="mid_div01a">递延所得税资产：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="deferredTaxAssets"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">其他非流动资产：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="otherNonCurrentAssets"></div>
		<div class="mid_div01a">非流动资产合计：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="totalNonCurrentAssets"></div>
		<div class="mid_div01a">资产总计：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="totalAssets"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01underline">与主业无关的长期股权投资：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="longTermEquityInvestmentsUnrelatedToMainBusiness"></div>
		<div class="mid_div01underline">长期权益投资的收益（权益法核算）：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="incomeFromLongTermEquityInvestments"></div>
	</div>
	<div class="mid_title2">流动负债：</div>
	<div class="mid_div">
		<div class="mid_div01a">短期借款：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="shortTermBorrowing"></div>
		<div class="mid_div01a">向中央银行借款：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="borrowingFromTheCentralBank"></div>
		<div class="mid_div01a">拆入资金：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="borrowingFunds"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">交易性金融负债：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="tradingFinancialLiabilities"></div>
		<div class="mid_div01a">衍生金融负债：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="derivativeFinancialLiabilities"></div>
		<div class="mid_div01a">应付票据：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="notesPayable"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">应付账款：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="accountsPayable"></div>
		<div class="mid_div01a">预收款项：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="advanceReceipts"></div>
		<div class="mid_div01a">合同负债：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="contractLiabilities"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">卖出回购金融资产款：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="financialAssetsSoldForRepurchase"></div>
		<div class="mid_div01a">吸收存款及同业存放：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="depositAbsorptionAndInterbankDeposits"></div>
		<div class="mid_div01a">代理买卖证券款：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="actingTradingSecurities"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">代理承销证券款：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="actingUnderwritingSecurities"></div>
		<div class="mid_div01a">应付职工薪酬：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="payrollPayable"></div>
		<div class="mid_div01underline">总人数：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="totalNumberOfPeople"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">应交税费：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="taxPayable"></div>
		<div class="mid_div01a">其他应付款：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="otherPayables"></div>
		<div class="mid_div01a">其中：应付利息：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="interestPayable"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">应付股利：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="dividendPayable"></div>
		<div class="mid_div01a">应付手续费及佣金：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="payableHandlingFeesAndCommissions"></div>
		<div class="mid_div01a">应付分保账款：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="accountsPayableReinsurance"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">持有待售负债：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="heldForSaleLiabilities"></div>
		<div class="mid_div01a">一年到期非流动负债：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="nonCurrentLiabilitiesDueWithinOneYear"></div>
		<div class="mid_div01a">其他流动负债：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="otherCurrentLiabilities"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">流动负债合计：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="totalCurrentLiabilities"></div>
	</div>
	<div class="mid_title2">非流动负债：</div>
	<div class="mid_div">
		<div class="mid_div01a">保险合同准备金：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="insuranceContractReserves"></div>
		<div class="mid_div01a">长期借款：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="longTermLoan"></div>
		<div class="mid_div01a">应付债券：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="bondsPayable"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">其中：优先股：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="bondsPayablepreferredShares"></div>
		<div class="mid_div01a">永续债：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="bondsPayableperpetualCapitalSecurities"></div>
		<div class="mid_div01a">租赁负债：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="leaseLiabilities"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">长期应付款：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="longTermPayables"></div>
		<div class="mid_div01a">长期应付职工薪酬：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="longTermEmployeeCompensationPayable"></div>
		<div class="mid_div01a">预计负债：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="estimatedLiabilities"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">递延收益：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="deferredIncome"></div>
		<div class="mid_div01a">递延所得税负债：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="deferredIncomeTaxes"></div>
		<div class="mid_div01a">其他非流动负债：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="otherNonCurrentLiabilities"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">非流动负债合计：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="totalNonCurrentLiabilities"></div>
		<div class="mid_div01a">负债总计：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="totalLiabilities"></div>
	</div>
	<div class="mid_title2">所有者权益：</div>
	<div class="mid_div">
		<div class="mid_div01a">股本：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="equity"></div>
		<div class="mid_div01a">其他权益工具：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="otherEquityInstruments"></div>
		<div class="mid_div01a">其中：优先股：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="otherEquityInstrumentspreferredShares"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">永续债：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="otherEquityInstrumentspetualCapitalSecurities"></div>
		<div class="mid_div01a">资本公积：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="capitalReserve"></div>
		<div class="mid_div01a">减：库存股：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="treasuryStock"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">其他综合收益：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="otherComprehensiveIncome"></div>
		<div class="mid_div01a">专项储备：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="specialReserves"></div>
		<div class="mid_div01a">盈余公积：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="surplusReserves"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">一般风险准备：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="generalRiskProvisions"></div>
		<div class="mid_div01a">未分配利润：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="undistributedProfit"></div>
		<div class="mid_div01a">归属母公司所有者权益合计：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="totalEquityAttributableOfParentCompany"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">少数股东权益：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="minorityInterest"></div>
		<div class="mid_div01a">所有者权益合计：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="totalOwnersEquity"></div>
		<div class="mid_div01a">负债和所有者权益总计：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="totalLiabilitiesAndOwnersEquity"></div>
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
