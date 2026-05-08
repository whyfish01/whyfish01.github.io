<%@ page language="java" %>
<%@ page pageEncoding="UTF-8" %>
<%@ page contentType="text/html"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="company" %>
<%@ page import="report.bean.entity.*" %>
<%@ page import="report.bean.daolmp.*" %>
<%@ page import="java.util.ArrayList" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="is" class="report.bean.entity.IncomeStatement" scope="request"/>
<jsp:useBean id="bs" class="report.bean.entity.BalanceSheet" scope="request"/>
<jsp:useBean id="rdi" class="report.bean.daolmp.ReportDaoImp" scope="request"/>
<html>
<head>
<meta charset="utf-8">
<title>财报数据采集</title>
<link href="${contextPath}styles/mid.css?v=<%=System.currentTimeMillis()%>"  rel="stylesheet" type="text/css">
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
	<form style="margin:0px;" action="InsertIncomeStatement" method="post">
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
	<div class="mid_title1">利润表（单位：元人民币）</div>
	<div class="mid_div">
		<div class="mid_div01a">营业总收入：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="grossRevenue"></div>
		<div class="mid_div01a">营业收入：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="operatingRevenue"></div>
		<div class="mid_div01a">利息收入：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="interestIncome"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">已赚保费：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="earnedPremium"></div>
		<div class="mid_div01a">手续费及佣金收入：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="feeAndCommissionIncome"></div>
		<div class="mid_div01a">营业总成本：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="totalOperatingCost"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">营业成本：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="operatingCosts"></div>
		<div class="mid_div01a">利息支出：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="interestExpense"></div>
		<div class="mid_div01a">手续费及佣金支出：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="handlingFeesAndCommissionExpenses"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">退保金：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="surrender"></div>
		<div class="mid_div01a">赔付支出净额：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="netCompensationExpenses"></div>
		<div class="mid_div01a">保单红利支出：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="expendituresDividendPolicy"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">提取保险责任合同准备金：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="withdrawalOfReserveFundsForInsuranceLiabilityContracts"></div>
		<div class="mid_div01a">分保费用：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="reinsuranceExpenses"></div>
		<div class="mid_div01a">税金及附加：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="taxesAndSurcharges"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">销售费用：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="sellingExpenses"></div>
		<div class="mid_div01a">管理费用：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="overhead"></div>
		<div class="mid_div01a">研发费用：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="researchAndDevelopment"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">财务费用：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="financialExpenses"></div>
		<div class="mid_div01a">其中：利息费用：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="financialExpensesInterestExpenses"></div>
		<div class="mid_div01a">利息收入：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="financialExpensesInterestIncome"></div>
	</div>

	<div class="mid_div">
		<div class="mid_div01d">加：其他收益：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="otherIncome"></div>
		<div class="mid_div01d">投资收益（损失以“－”号填列）：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="incomeFromInvestment"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">其中：对联营企业和合营企业的投资收益：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="investmentIncomeFromAssociatesAndJointVentures"></div>
		<div class="mid_div01d">汇兑收益（损失以“-”号填列）：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="exchangeGains"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">以摊余成本计量的金融资产终止确认收益：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="incomeFromDerecognitionOfFinancialAssetsMeasuredAtAmortizedCost"></div>
		<div class="mid_div01d">净敞口套期收益（损失以“－”号填列）：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="netExposureHedgingIncome"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">公允价值变动收益（损失“－”号填列）：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="incomeFromChangesInFairValue"></div>
		<div class="mid_div01d">信用减值损失（损失以“-”号填列）：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="creditImpairmentLoss"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">资产减值损失（损失以“-”号填列）：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="impairmentLoss"></div>
		<div class="mid_div01d">资产处置收益（损失以“-”号填列）：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="assetDisposalIncome"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">营业利润：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="operatingProfit"></div>
		<div class="mid_div01a">加：营业外收入：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="nonOperatingIncome"></div>
		<div class="mid_div01a">减：营业外支出：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="nonOperatingExpenses"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">利润总额：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="totalProfit"></div>
		<div class="mid_div01a">减：所得税费用：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="incomeTaxExpense"></div>
		<div class="mid_div01a">净利润：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="netProfit"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">持续经营净利润：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="netProfitFromContinuingOperations"></div>
		<div class="mid_div01d">终止经营净利润：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="netProfitFromDiscontinuedOperations"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">归属于母公司股东的净利润：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="netIncomeAttributableToShareholders"></div>
		<div class="mid_div01d">少数股东损益：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="minorityInterest"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">归属母公司所有者其他综合收益税后净额：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="afterTaxNetAmountOfOtherComprehensiveIncomeAttributable"></div>
		<div class="mid_div01d">不能重分类进损益的其他综合收益：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="otherComprehensiveIncomeCannotBeReclassifiedIntoProfitOrLoss"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">重新计量设定受益计划变动额：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="remeasureChangesInDefinedBenefitPlans"></div>
		<div class="mid_div01d">权益法下不能转损益的其他综合收益：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="otherIncomeCannotBeConvertedToProfitOrLossUnderTheEquityMethod"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">其他权益工具投资公允价值变动：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="changesInFairValueOfOtherEquityInstrumentInvestments"></div>
		<div class="mid_div01d">企业自身信用风险公允价值变动：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="changesInFairValueOfCorporateCreditRisk"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">其他：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="others"></div>
		<div class="mid_div01d">将重分类进损益的其他综合收益：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="otherIncomeReclassifiedToProfitOrLoss"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">权益法下可转损益的其他综合收益：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="otherIncomeCanBeConvertedToProfitOrLossUnderTheEquityMethod"></div>
		<div class="mid_div01d">其他债权投资公允价值变动：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="changesInFairValueOfOtherDebtInvestments"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">金融资产重分类计入其他综合收益的金额：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="reclassificationOfFinancialAssetsInOtherComprehensiveIncome"></div>
		<div class="mid_div01d">其他债权投资信用减值准备：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="provisionForOtherDebtInvestments"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01a">现金流量套期储备：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="cashFlowHedgingReserves"></div>
		<div class="mid_div01a">外币财报折算差额：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="currencyTranslationDifferences"></div>
		<div class="mid_div01a">其他：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="others1"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">归属少数股东的其他综合收益税后净额：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="otherIncomeAfterTaxAttributableToMinorityShareholders"></div>
		<div class="mid_div01d">综合收益总额：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="totalComprehensiveIncome"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">归属于母公司所有者的综合收益总额：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="totalComprehensiveIncomeToTheOwnersOfTheParentCompany"></div>
		<div class="mid_div01d">归属于少数股东的综合收益总额：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="totalComprehensiveIncomeToMinorityShareholders"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01d">基本每股收益：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="basicEarningsPerShare"></div>
		<div class="mid_div01d">稀释每股收益：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="dilutedEarningsPerShare"></div>
	</div>
	<div class="mid_div">
		<div class="mid_div01underline">ROE：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="ROE"></div>
		<div class="mid_div01d">财报分红金额：</div>
		<div class="mid_div03"><input type="text" class="mid_box06" name="financialReportDividends"></div>
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
