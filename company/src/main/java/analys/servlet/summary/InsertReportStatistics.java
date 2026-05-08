package analys.servlet.summary;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import report.bean.entity.*;
import report.bean.common.CreateTime;
import report.bean.daolmp.*;

public class InsertReportStatistics extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void init(ServletConfig config) throws ServletException{
		super.init(config);									
		}
	
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setCharacterEncoding("utf-8");
    	Reportsummary ry=new Reportsummary();
    	request.setAttribute("ry", ry);
    	IndexManageDaoImp imda=new IndexManageDaoImp();
    	
    	
    	//从页面中获取数据
    	String AShareCode = request.getParameter("AShareCode");
    	String AShareName = request.getParameter("AShareName");
    	String primaryIndustry = request.getParameter("primaryIndustry");
    	String secondaryIndustry = request.getParameter("secondaryIndustry");
    	String thirdLevelIndustry = request.getParameter("thirdLevelIndustry");
    	String region = request.getParameter("region");
    	
    	String financialReportingYear = request.getParameter("financialReportingYear");
    	int reportYear = Integer.parseInt(request.getParameter("financialReportingYear"));
    	
    	
    	//总资产
    	String totalAssets_str= request.getParameter("totalAssets");
    	double totalAssets;
    	if (totalAssets_str == null || totalAssets_str.isEmpty()) {
    		totalAssets=0;
    	}else {
    		totalAssets = Double.parseDouble(totalAssets_str.replace(",", ""));
    	}
    	
    	//总资产增长率
    	String totalAssetsGrowthRate_str=request.getParameter("totalAssetsGrowthRate");
    	double totalAssetsGrowthRate;
    	if (totalAssetsGrowthRate_str == null || totalAssetsGrowthRate_str.isEmpty()) {
    		totalAssetsGrowthRate=0;
    	}else {
    		totalAssetsGrowthRate = Double.parseDouble(totalAssetsGrowthRate_str.replace("%", ""))/100;
    	}
    	
    	//股东权益合计（净资产）
    	String totalOwnersEquity_str= request.getParameter("totalOwnersEquity");
    	double totalOwnersEquity;
    	if (totalOwnersEquity_str == null || totalOwnersEquity_str.isEmpty()) {
    		totalOwnersEquity=0;
    	}else {
    		totalOwnersEquity = Double.parseDouble(totalOwnersEquity_str.replace(",", ""));
    	}
    	
    	//权益乘数（总资产/净资产）
    	String equityMultiplier_str= request.getParameter("equityMultiplier");
    	double equityMultiplier;
    	if (equityMultiplier_str == null || equityMultiplier_str.isEmpty()) {
    		equityMultiplier=0;
    	}else {
    		equityMultiplier = Double.parseDouble(equityMultiplier_str.replace(",", ""));
    	}
    	
    	//总负债
    	String totalLiabilities_str= request.getParameter("totalLiabilities");
    	double totalLiabilities;
    	if (totalLiabilities_str == null || totalLiabilities_str.isEmpty()) {
    		totalLiabilities=0;
    	}else {
    		totalLiabilities = Double.parseDouble(totalLiabilities_str.replace(",", ""));
    	}
    	
    	//资产负债率
    	String assetLiabilityRatio_str=request.getParameter("assetLiabilityRatio");
    	double assetLiabilityRatio;
    	if (assetLiabilityRatio_str == null || assetLiabilityRatio_str.isEmpty()) {
    		assetLiabilityRatio=0;
    	}else {
    		assetLiabilityRatio = Double.parseDouble(assetLiabilityRatio_str.replace("%", ""))/100;
    	}
    	
    	//货币资金
    	String monetaryCapital_str= request.getParameter("monetaryCapital");
    	double monetaryCapital;
    	if (monetaryCapital_str == null || monetaryCapital_str.isEmpty()) {
    		monetaryCapital=0;
    	}else {
    		monetaryCapital = Double.parseDouble(monetaryCapital_str.replace(",", ""));
    	}
    	
    	//短期借款
    	String shortTermBorrowing_str= request.getParameter("shortTermBorrowing");
    	double shortTermBorrowing;
    	if (shortTermBorrowing_str == null || shortTermBorrowing_str.isEmpty()) {
    		shortTermBorrowing=0;
    	}else {
    		shortTermBorrowing = Double.parseDouble(shortTermBorrowing_str.replace(",", ""));
    	}
    	
    	//一年内到期的非流动负债
    	String nonCurrentLiabilitiesDueWithinOneYear_str= request.getParameter("nonCurrentLiabilitiesDueWithinOneYear");
    	double nonCurrentLiabilitiesDueWithinOneYear;
    	if (nonCurrentLiabilitiesDueWithinOneYear_str == null || nonCurrentLiabilitiesDueWithinOneYear_str.isEmpty()) {
    		nonCurrentLiabilitiesDueWithinOneYear=0;
    	}else {
    		nonCurrentLiabilitiesDueWithinOneYear = Double.parseDouble(nonCurrentLiabilitiesDueWithinOneYear_str.replace(",", ""));
    	}
    	
    	//长期借款
    	String longTermLoan_str= request.getParameter("longTermLoan");
    	double longTermLoan;
    	if (longTermLoan_str == null || longTermLoan_str.isEmpty()) {
    		longTermLoan=0;
    	}else {
    		longTermLoan = Double.parseDouble(longTermLoan_str.replace(",", ""));
    	}
    	
    	//应付债券
    	String bondsPayable_str= request.getParameter("bondsPayable");
    	double bondsPayable;
    	if (bondsPayable_str == null || bondsPayable_str.isEmpty()) {
    		bondsPayable=0;
    	}else {
    		bondsPayable = Double.parseDouble(bondsPayable_str.replace(",", ""));
    	}
    	
    	//长期应付款
    	String longTermPayables_str= request.getParameter("longTermPayables");
    	double longTermPayables;
    	if (longTermPayables_str == null || longTermPayables_str.isEmpty()) {
    		longTermPayables=0;
    	}else {
    		longTermPayables = Double.parseDouble(longTermPayables_str.replace(",", ""));
    	}
    	
    	//有息负债(短期借款+一年内到期的非流动负债+长期借款+应付债券+长期应付款)
    	String interestBearingLiabilities_str= request.getParameter("interestBearingLiabilities");
    	double interestBearingLiabilities;
    	if (interestBearingLiabilities_str == null || interestBearingLiabilities_str.isEmpty()) {
    		interestBearingLiabilities=0;
    	}else {
    		interestBearingLiabilities = Double.parseDouble(interestBearingLiabilities_str.replace(",", ""));
    	}
    	
    	//货币资金-有息负债
    	String debtRepaymentRisk_str= request.getParameter("debtRepaymentRisk");
    	double debtRepaymentRisk;
    	if (debtRepaymentRisk_str == null || debtRepaymentRisk_str.isEmpty()) {
    		debtRepaymentRisk=0;
    	}else {
    		debtRepaymentRisk = Double.parseDouble(debtRepaymentRisk_str.replace(",", ""));
    	}
    	
    	//交易性金融资产中的理财产品
    	String tradingFinancialAssetsManagement_str= request.getParameter("tradingFinancialAssetsManagement");
    	double tradingFinancialAssetsManagement;
    	if (tradingFinancialAssetsManagement_str == null || tradingFinancialAssetsManagement_str.isEmpty()) {
    		tradingFinancialAssetsManagement=0;
    	}else {
    		tradingFinancialAssetsManagement = Double.parseDouble(tradingFinancialAssetsManagement_str.replace(",", ""));
    	}
    	
    	//其他流动资产的理财产品
    	String otherCurrentAssetsManagement_str= request.getParameter("otherCurrentAssetsManagement");
    	double otherCurrentAssetsManagement;
    	if (otherCurrentAssetsManagement_str == null || otherCurrentAssetsManagement_str.isEmpty()) {
    		otherCurrentAssetsManagement=0;
    	}else {
    		otherCurrentAssetsManagement = Double.parseDouble(otherCurrentAssetsManagement_str.replace(",", ""));
    	}
    	
    	//准货币资金
    	String quasiMonetary_str= request.getParameter("quasiMonetary");
    	double quasiMonetary;
    	if (quasiMonetary_str == null || quasiMonetary_str.isEmpty()) {
    		quasiMonetary=0;
    	}else {
    		quasiMonetary = Double.parseDouble(quasiMonetary_str.replace(",", ""));
    	}
    	
    	//短期有息负债(短期借款+一年内到期的非流动负债)
    	String shortTermForeignDebt_str= request.getParameter("shortTermForeignDebt");
    	double shortTermForeignDebt;
    	if (shortTermForeignDebt_str == null || shortTermForeignDebt_str.isEmpty()) {
    		shortTermForeignDebt=0;
    	}else {
    		shortTermForeignDebt = Double.parseDouble(shortTermForeignDebt_str.replace(",", ""));
    	}
    	
    	//准货币资金-短期有息负债
    	String shortTermDebtRepaymentRisk_str= request.getParameter("shortTermDebtRepaymentRisk");
    	double shortTermDebtRepaymentRisk;
    	if (shortTermDebtRepaymentRisk_str == null || shortTermDebtRepaymentRisk_str.isEmpty()) {
    		shortTermDebtRepaymentRisk=0;
    	}else {
    		shortTermDebtRepaymentRisk = Double.parseDouble(shortTermDebtRepaymentRisk_str.replace(",", ""));
    	}
    	
    	//准货币资金占总资产比率
    	String quasiMonetaryCapitalRatio_str= request.getParameter("quasiMonetaryCapitalRatio");
    	double quasiMonetaryCapitalRatio;
    	if (quasiMonetaryCapitalRatio_str == null || quasiMonetaryCapitalRatio_str.isEmpty()) {
    		quasiMonetaryCapitalRatio=0;
    	}else {
    		quasiMonetaryCapitalRatio = Double.parseDouble(quasiMonetaryCapitalRatio_str.replace("%", ""))/100;
    	}
    	
    	//应付票据
    	String notesPayable_str= request.getParameter("notesPayable");
    	double notesPayable;
    	if (notesPayable_str == null || notesPayable_str.isEmpty()) {
    		notesPayable=0;
    	}else {
    		notesPayable = Double.parseDouble(notesPayable_str.replace(",", ""));
    	}
    	
    	//应付账款
    	String accountsPayable_str= request.getParameter("accountsPayable");
    	double accountsPayable;
    	if (accountsPayable_str == null || accountsPayable_str.isEmpty()) {
    		accountsPayable=0;
    	}else {
    		accountsPayable = Double.parseDouble(accountsPayable_str.replace(",", ""));
    	}
    	
    	//预收款项
    	String advanceReceipts_str= request.getParameter("advanceReceipts");
    	double advanceReceipts;
    	if (advanceReceipts_str == null || advanceReceipts_str.isEmpty()) {
    		advanceReceipts=0;
    	}else {
    		advanceReceipts = Double.parseDouble(advanceReceipts_str.replace(",", ""));
    	}
    	
    	//应付预收合计
    	String totalAccountsPayablePrepaid_str= request.getParameter("totalAccountsPayablePrepaid");
    	double totalAccountsPayablePrepaid;
    	if (totalAccountsPayablePrepaid_str == null || totalAccountsPayablePrepaid_str.isEmpty()) {
    		totalAccountsPayablePrepaid=0;
    	}else {
    		totalAccountsPayablePrepaid = Double.parseDouble(totalAccountsPayablePrepaid_str.replace(",", ""));
    	}
    	
    	//应收票据
    	String billReceivable_str= request.getParameter("billReceivable");
    	double billReceivable;
    	if (billReceivable_str == null || billReceivable_str.isEmpty()) {
    		billReceivable=0;
    	}else {
    		billReceivable = Double.parseDouble(billReceivable_str.replace(",", ""));
    	}
    	
    	//应收账款
    	String accountsReceivable_str= request.getParameter("accountsReceivable");
    	double accountsReceivable;
    	if (accountsReceivable_str == null || accountsReceivable_str.isEmpty()) {
    		accountsReceivable=0;
    	}else {
    		accountsReceivable = Double.parseDouble(accountsReceivable_str.replace(",", ""));
    	}
    	
    	//应收款项融资
    	String accountsReceivableFinancing_str= request.getParameter("accountsReceivableFinancing");
    	double accountsReceivableFinancing;
    	if (accountsReceivableFinancing_str == null || accountsReceivableFinancing_str.isEmpty()) {
    		accountsReceivableFinancing=0;
    	}else {
    		accountsReceivableFinancing = Double.parseDouble(accountsReceivableFinancing_str.replace(",", ""));
    	}
    	
    	//合同资产
    	String contractAssets_str= request.getParameter("contractAssets");
    	double contractAssets;
    	if (contractAssets_str == null || contractAssets_str.isEmpty()) {
    		contractAssets=0;
    	}else {
    		contractAssets = Double.parseDouble(contractAssets_str.replace(",", ""));
    	}
    	
    	//预付款项
    	String prepayments_str= request.getParameter("prepayments");
    	double prepayments;
    	if (prepayments_str == null || prepayments_str.isEmpty()) {
    		prepayments=0;
    	}else {
    		prepayments = Double.parseDouble(prepayments_str.replace(",", ""));
    	}
    	
    	//合同负债
    	String contractLiabilities_str= request.getParameter("contractLiabilities");
    	double contractLiabilities;
    	if (contractLiabilities_str == null || contractLiabilities_str.isEmpty()) {
    		contractLiabilities=0;
    	}else {
    		contractLiabilities = Double.parseDouble(contractLiabilities_str.replace(",", ""));
    	}
    	
    	//应收预付合计
    	String totalAccountsReceivablePrepayments_str= request.getParameter("totalAccountsReceivablePrepayments");
    	double totalAccountsReceivablePrepayments;
    	if (totalAccountsReceivablePrepayments_str == null || totalAccountsReceivablePrepayments_str.isEmpty()) {
    		totalAccountsReceivablePrepayments=0;
    	}else {
    		totalAccountsReceivablePrepayments = Double.parseDouble(totalAccountsReceivablePrepayments_str.replace(",", ""));
    	}
    	
    	//应付预收合计-应收预付合计
    	String occupySomeoneElseFunds_str= request.getParameter("occupySomeoneElseFunds");
    	double occupySomeoneElseFunds;
    	if (occupySomeoneElseFunds_str == null || occupySomeoneElseFunds_str.isEmpty()) {
    		occupySomeoneElseFunds=0;
    	}else {
    		occupySomeoneElseFunds = Double.parseDouble(occupySomeoneElseFunds_str.replace(",", ""));
    	}
    	
    	//应收账款占总资产的比率
    	String accountsReceivableRatio_str= request.getParameter("accountsReceivableRatio");
    	double accountsReceivableRatio;
    	if (accountsReceivableRatio_str == null || accountsReceivableRatio_str.isEmpty()) {
    		accountsReceivableRatio=0;
    	}else {
    		accountsReceivableRatio = Double.parseDouble(accountsReceivableRatio_str.replace("%", ""))/100;
    	}
    	
    	//固定资产
    	String fixedAssets_str= request.getParameter("fixedAssets");
    	double fixedAssets;
    	if (fixedAssets_str == null || fixedAssets_str.isEmpty()) {
    		fixedAssets=0;
    	}else {
    		fixedAssets = Double.parseDouble(fixedAssets_str.replace(",", ""));
    	}
    	
    	//在建工程
    	String constructionInProgress_str= request.getParameter("constructionInProgress");
    	double constructionInProgress;
    	if (constructionInProgress_str == null || constructionInProgress_str.isEmpty()) {
    		constructionInProgress=0;
    	}else {
    		constructionInProgress = Double.parseDouble(constructionInProgress_str.replace(",", ""));
    	}
    	
    	//固产合计
    	String totalTFxedAssets_str= request.getParameter("totalTFxedAssets");
    	double totalTFxedAssets;
    	if (totalTFxedAssets_str == null || totalTFxedAssets_str.isEmpty()) {
    		totalTFxedAssets=0;
    	}else {
    		totalTFxedAssets = Double.parseDouble(totalTFxedAssets_str.replace(",", ""));
    	}
    	
    	//固产合计占总资产的比率
    	String fixedAssetRatio_str= request.getParameter("fixedAssetRatio");
    	double fixedAssetRatio;
    	if (fixedAssetRatio_str == null || fixedAssetRatio_str.isEmpty()) {
    		fixedAssetRatio=0;
    	}else {
    		fixedAssetRatio = Double.parseDouble(fixedAssetRatio_str.replace("%", ""))/100;
    	}
    	
    	//交易性金融资产
    	String tradingFinancialAssets_str= request.getParameter("tradingFinancialAssets");
    	double tradingFinancialAssets;
    	if (tradingFinancialAssets_str == null || tradingFinancialAssets_str.isEmpty()) {
    		tradingFinancialAssets=0;
    	}else {
    		tradingFinancialAssets = Double.parseDouble(tradingFinancialAssets_str.replace(",", ""));
    	}
    	
    	//其他非流动金融资产
    	String otherNonCurrentFinancialAssets_str= request.getParameter("otherNonCurrentFinancialAssets");
    	double otherNonCurrentFinancialAssets;
    	if (otherNonCurrentFinancialAssets_str == null || otherNonCurrentFinancialAssets_str.isEmpty()) {
    		otherNonCurrentFinancialAssets=0;
    	}else {
    		otherNonCurrentFinancialAssets = Double.parseDouble(otherNonCurrentFinancialAssets_str.replace(",", ""));
    	}
    	
    	//投资性房地产
    	String investmentRealEstate_str= request.getParameter("investmentRealEstate");
    	double investmentRealEstate;
    	if (investmentRealEstate_str == null || investmentRealEstate_str.isEmpty()) {
    		investmentRealEstate=0;
    	}else {
    		investmentRealEstate = Double.parseDouble(investmentRealEstate_str.replace(",", ""));
    	}
    	
    	//长期股权投资
    	String longTermEquityInvestment_str= request.getParameter("longTermEquityInvestment");
    	double longTermEquityInvestment;
    	if (longTermEquityInvestment_str == null || longTermEquityInvestment_str.isEmpty()) {
    		longTermEquityInvestment=0;
    	}else {
    		longTermEquityInvestment = Double.parseDouble(longTermEquityInvestment_str.replace(",", ""));
    	}
    	
    	//投资类资产小计
    	String subtotalOfInvestmentAssets_str= request.getParameter("subtotalOfInvestmentAssets");
    	double subtotalOfInvestmentAssets;
    	if (subtotalOfInvestmentAssets_str == null || subtotalOfInvestmentAssets_str.isEmpty()) {
    		subtotalOfInvestmentAssets=0;
    	}else {
    		subtotalOfInvestmentAssets = Double.parseDouble(subtotalOfInvestmentAssets_str.replace(",", ""));
    	}
    	
    	//投资类资产占总资产的比率
    	String investmentAssetRatio_str= request.getParameter("investmentAssetRatio");
    	double investmentAssetRatio;
    	if (investmentAssetRatio_str == null || investmentAssetRatio_str.isEmpty()) {
    		investmentAssetRatio=0;
    	}else {
    		investmentAssetRatio = Double.parseDouble(investmentAssetRatio_str.replace("%", ""))/100;
    	}
    	
    	//无形资产
    	String intangibleAssets_str= request.getParameter("intangibleAssets");
    	double intangibleAssets;
    	if (intangibleAssets_str == null || intangibleAssets_str.isEmpty()) {
    		intangibleAssets=0;
    	}else {
    		intangibleAssets = Double.parseDouble(intangibleAssets_str.replace(",", ""));
    	}
    	
    	//商誉
    	String goodwill_str= request.getParameter("goodwill");
    	double goodwill;
    	if (goodwill_str == null || goodwill_str.isEmpty()) {
    		goodwill=0;
    	}else {
    		goodwill = Double.parseDouble(goodwill_str.replace(",", ""));
    	}
    	
    	//无形资产占比
    	String theProportionOfIntangibleAssets_str= request.getParameter("theProportionOfIntangibleAssets");
    	double theProportionOfIntangibleAssets;
    	if (theProportionOfIntangibleAssets_str == null || theProportionOfIntangibleAssets_str.isEmpty()) {
    		theProportionOfIntangibleAssets=0;
    	}else {
    		theProportionOfIntangibleAssets = Double.parseDouble(theProportionOfIntangibleAssets_str.replace("%", ""))/100;
    	}
    	
    	//商誉占比
    	String goodwillProportion_str= request.getParameter("goodwillProportion");
    	double goodwillProportion;
    	if (goodwillProportion_str == null || goodwillProportion_str.isEmpty()) {
    		goodwillProportion=0;
    	}else {
    		goodwillProportion = Double.parseDouble(goodwillProportion_str.replace("%", ""))/100;
    	}
    	
    	//应付职工薪酬
    	String payrollPayable_str= request.getParameter("payrollPayable");
    	double payrollPayable;
    	if (payrollPayable_str == null || payrollPayable_str.isEmpty()) {
    		payrollPayable=0;
    	}else {
    		payrollPayable = Double.parseDouble(payrollPayable_str.replace(",", ""));
    	}
    	
    	//支付给职工以及为职工支付的现金
    	String cashPaidToAndOnBehalfOfEmployees_str= request.getParameter("cashPaidToAndOnBehalfOfEmployees");
    	double cashPaidToAndOnBehalfOfEmployees;
    	if (cashPaidToAndOnBehalfOfEmployees_str == null || cashPaidToAndOnBehalfOfEmployees_str.isEmpty()) {
    		cashPaidToAndOnBehalfOfEmployees=0;
    	}else {
    		cashPaidToAndOnBehalfOfEmployees = Double.parseDouble(cashPaidToAndOnBehalfOfEmployees_str.replace(",", ""));
    	}
    	
    	//当年职工总薪酬
    	String totalEmployeeCompensation_str= request.getParameter("totalEmployeeCompensation");
    	double totalEmployeeCompensation;
    	if (totalEmployeeCompensation_str == null || totalEmployeeCompensation_str.isEmpty()) {
    		totalEmployeeCompensation=0;
    	}else {
    		totalEmployeeCompensation = Double.parseDouble(totalEmployeeCompensation_str.replace(",", ""));
    	}
    	
    	//总人数
    	String totalNumberOfPeople_str= request.getParameter("totalNumberOfPeople");
    	int totalNumberOfPeople;
    	if (totalNumberOfPeople_str == null || totalNumberOfPeople_str.isEmpty()) {
    		totalNumberOfPeople=0;
    	}else {
    		totalNumberOfPeople = Integer.parseInt(totalNumberOfPeople_str);
    	}
    	
    	//人均年薪
    	String perCapitaAnnualSalary_str= request.getParameter("perCapitaAnnualSalary");
    	double perCapitaAnnualSalary;
    	if (perCapitaAnnualSalary_str == null || perCapitaAnnualSalary_str.isEmpty()) {
    		perCapitaAnnualSalary=0;
    	}else {
    		perCapitaAnnualSalary = Double.parseDouble(perCapitaAnnualSalary_str.replace(",", ""));
    	}
    	
    	//人均月薪
    	String perCapitaMonthlySalary_str= request.getParameter("perCapitaMonthlySalary");
    	double perCapitaMonthlySalary;
    	if (perCapitaMonthlySalary_str == null || perCapitaMonthlySalary_str.isEmpty()) {
    		perCapitaMonthlySalary=0;
    	}else {
    		perCapitaMonthlySalary = Double.parseDouble(perCapitaMonthlySalary_str.replace(",", ""));
    	}
    	
    	//营业收入
    	String operatingRevenue_str= request.getParameter("operatingRevenue");
    	double operatingRevenue;
    	if (operatingRevenue_str == null || operatingRevenue_str.isEmpty()) {
    		operatingRevenue=0;
    	}else {
    		operatingRevenue = Double.parseDouble(operatingRevenue_str.replace(",", ""));
    	}
    	
    	//营业收入增长率
    	String revenueGrowthRate_str= request.getParameter("revenueGrowthRate");
    	double revenueGrowthRate;
    	if (revenueGrowthRate_str == null || revenueGrowthRate_str.isEmpty()) {
    		revenueGrowthRate=0;
    	}else {
    		revenueGrowthRate = Double.parseDouble(revenueGrowthRate_str.replace("%", ""))/100;
    	}
    	
    	//总资产周转率
    	String totalAssetTurnover_str= request.getParameter("totalAssetTurnover");
    	double totalAssetTurnover;
    	if (totalAssetTurnover_str == null || totalAssetTurnover_str.isEmpty()) {
    		totalAssetTurnover=0;
    	}else {
    		totalAssetTurnover = Double.parseDouble(totalAssetTurnover_str.replace("%", ""))/100;
    	}
    	
    	//销售商品、提供劳务收到的现金
    	String cashReceivedFromSellingGoodsAndProvidingServices_str= request.getParameter("cashReceivedFromSellingGoodsAndProvidingServices");
    	double cashReceivedFromSellingGoodsAndProvidingServices;
    	if (cashReceivedFromSellingGoodsAndProvidingServices_str == null || cashReceivedFromSellingGoodsAndProvidingServices_str.isEmpty()) {
    		cashReceivedFromSellingGoodsAndProvidingServices=0;
    	}else {
    		cashReceivedFromSellingGoodsAndProvidingServices = Double.parseDouble(cashReceivedFromSellingGoodsAndProvidingServices_str.replace(",", ""));
    	}
    	
    	//销售商品、提供劳务收到的现金占营收的比率
    	String proportionOfCashSellingGoodsProvidingServices_str= request.getParameter("proportionOfCashSellingGoodsProvidingServices");
    	double proportionOfCashSellingGoodsProvidingServices;
    	if (proportionOfCashSellingGoodsProvidingServices_str == null || proportionOfCashSellingGoodsProvidingServices_str.isEmpty()) {
    		proportionOfCashSellingGoodsProvidingServices=0;
    	}else {
    		proportionOfCashSellingGoodsProvidingServices = Double.parseDouble(proportionOfCashSellingGoodsProvidingServices_str.replace("%", ""))/100;
    	}
    	
    	//其他应收款
    	String otherReceivables_str= request.getParameter("otherReceivables");
    	double otherReceivables;
    	if (otherReceivables_str == null || otherReceivables_str.isEmpty()) {
    		otherReceivables=0;
    	}else {
    		otherReceivables = Double.parseDouble(otherReceivables_str.replace(",", ""));
    	}
    	
    	//存货
    	String inventory_str= request.getParameter("inventory");
    	double inventory;
    	if (inventory_str == null || inventory_str.isEmpty()) {
    		inventory=0;
    	}else {
    		inventory = Double.parseDouble(inventory_str.replace(",", ""));
    	}
    	
    	//存货增长率
    	String inventoryGrowthRate_str= request.getParameter("inventoryGrowthRate");
    	double inventoryGrowthRate;
    	if (inventoryGrowthRate_str == null || inventoryGrowthRate_str.isEmpty()) {
    		inventoryGrowthRate=0;
    	}else {
    		inventoryGrowthRate = Double.parseDouble(inventoryGrowthRate_str.replace("%", ""))/100;
    	}
    	
    	//应收账款/总资产
    	String accountsReceivablePercentageOfRevenue_str= request.getParameter("accountsReceivablePercentageOfRevenue");
    	double accountsReceivablePercentageOfRevenue;
    	if (accountsReceivablePercentageOfRevenue_str == null || accountsReceivablePercentageOfRevenue_str.isEmpty()) {
    		accountsReceivablePercentageOfRevenue=0;
    	}else {
    		accountsReceivablePercentageOfRevenue = Double.parseDouble(accountsReceivablePercentageOfRevenue_str.replace("%", ""))/100;
    	}
    	
    	//预付款项/总资产
    	String prepaymentsPercentageOfRevenue_str= request.getParameter("prepaymentsPercentageOfRevenue");
    	double prepaymentsPercentageOfRevenue;
    	if (prepaymentsPercentageOfRevenue_str == null || prepaymentsPercentageOfRevenue_str.isEmpty()) {
    		prepaymentsPercentageOfRevenue=0;
    	}else {
    		prepaymentsPercentageOfRevenue = Double.parseDouble(prepaymentsPercentageOfRevenue_str.replace("%", ""))/100;
    	}
    	
    	//其他应收款/总资产
    	String otherReceivablesPercentageOfRevenue_str= request.getParameter("otherReceivablesPercentageOfRevenue");
    	double otherReceivablesPercentageOfRevenue;
    	if (otherReceivablesPercentageOfRevenue_str == null || otherReceivablesPercentageOfRevenue_str.isEmpty()) {
    		otherReceivablesPercentageOfRevenue=0;
    	}else {
    		otherReceivablesPercentageOfRevenue = Double.parseDouble(otherReceivablesPercentageOfRevenue_str.replace("%", ""))/100;
    	}
    	
    	//存货/总资产
    	String inventoryToRevenueRatio_str= request.getParameter("inventoryToRevenueRatio");
    	double inventoryToRevenueRatio;
    	if (inventoryToRevenueRatio_str == null || inventoryToRevenueRatio_str.isEmpty()) {
    		inventoryToRevenueRatio=0;
    	}else {
    		inventoryToRevenueRatio = Double.parseDouble(inventoryToRevenueRatio_str.replace("%", ""))/100;
    	}
    	
    	//营业成本
    	String operatingCosts_str= request.getParameter("operatingCosts");
    	double operatingCosts;
    	if (operatingCosts_str == null || operatingCosts_str.isEmpty()) {
    		operatingCosts=0;
    	}else {
    		operatingCosts = Double.parseDouble(operatingCosts_str.replace(",", ""));
    	}
    	
    	//毛利率
    	String grossMargin_str= request.getParameter("grossMargin");
    	double grossMargin;
    	if (grossMargin_str == null || grossMargin_str.isEmpty()) {
    		grossMargin=0;
    	}else {
    		grossMargin = Double.parseDouble(grossMargin_str.replace("%", ""))/100;
    	}
    	
    	//销售费用
    	String sellingExpenses_str= request.getParameter("sellingExpenses");
    	double sellingExpenses;
    	if (sellingExpenses_str == null || sellingExpenses_str.isEmpty()) {
    		sellingExpenses=0;
    	}else {
    		sellingExpenses = Double.parseDouble(sellingExpenses_str.replace(",", ""));
    	}
    	
    	//销售费用率
    	String salesExpenseRate_str= request.getParameter("salesExpenseRate");
    	double salesExpenseRate;
    	if (salesExpenseRate_str == null || salesExpenseRate_str.isEmpty()) {
    		salesExpenseRate=0;
    	}else {
    		salesExpenseRate = Double.parseDouble(salesExpenseRate_str.replace("%", ""))/100;
    	}
    	
    	//管理费用
    	String overhead_str= request.getParameter("overhead");
    	double overhead;
    	if (overhead_str == null || overhead_str.isEmpty()) {
    		overhead=0;
    	}else {
    		overhead = Double.parseDouble(overhead_str.replace(",", ""));
    	}
    	
    	//管理费用率
    	String managementExpenseRate_str= request.getParameter("managementExpenseRate");
    	double managementExpenseRate;
    	if (managementExpenseRate_str == null || managementExpenseRate_str.isEmpty()) {
    		managementExpenseRate=0;
    	}else {
    		managementExpenseRate = Double.parseDouble(managementExpenseRate_str.replace("%", ""))/100;
    	}
    	
    	//研发费用
    	String researchAndDevelopment_str= request.getParameter("researchAndDevelopment");
    	double researchAndDevelopment;
    	if (researchAndDevelopment_str == null || researchAndDevelopment_str.isEmpty()) {
    		researchAndDevelopment=0;
    	}else {
    		researchAndDevelopment = Double.parseDouble(researchAndDevelopment_str.replace(",", ""));
    	}
    	
    	//研发费用率
    	String researchAndDevelopmentRate_str= request.getParameter("researchAndDevelopmentRate");
    	double researchAndDevelopmentRate;
    	if (researchAndDevelopmentRate_str == null || researchAndDevelopmentRate_str.isEmpty()) {
    		researchAndDevelopmentRate=0;
    	}else {
    		researchAndDevelopmentRate = Double.parseDouble(researchAndDevelopmentRate_str.replace("%", ""))/100;
    	}
    	
    	//财务费用
    	String financialExpenses_str= request.getParameter("financialExpenses");
    	double financialExpenses;
    	if (financialExpenses_str == null || financialExpenses_str.isEmpty()) {
    		financialExpenses=0;
    	}else {
    		financialExpenses = Double.parseDouble(financialExpenses_str.replace(",", ""));
    	}
    	
    	//费用率
    	String expense_str= request.getParameter("expense");
    	double expense;
    	if (expense_str == null || expense_str.isEmpty()) {
    		expense=0;
    	}else {
    		expense = Double.parseDouble(expense_str.replace("%", ""))/100;
    	}
    	
    	//费用率占毛利率的比率
    	String expenseRateToGrossProfitMargin_str= request.getParameter("expenseRateToGrossProfitMargin");
    	double expenseRateToGrossProfitMargin;
    	if (expenseRateToGrossProfitMargin_str == null || expenseRateToGrossProfitMargin_str.isEmpty()) {
    		expenseRateToGrossProfitMargin=0;
    	}else {
    		expenseRateToGrossProfitMargin = Double.parseDouble(expenseRateToGrossProfitMargin_str.replace("%", ""))/100;
    	}
    	
    	//税金及附加
    	String taxesAndSurcharges_str= request.getParameter("taxesAndSurcharges");
    	double taxesAndSurcharges;
    	if (taxesAndSurcharges_str == null || taxesAndSurcharges_str.isEmpty()) {
    		taxesAndSurcharges=0;
    	}else {
    		taxesAndSurcharges = Double.parseDouble(taxesAndSurcharges_str.replace(",", ""));
    	}
    	
    	//四项费用
    	String fourExpenses_str= request.getParameter("fourExpenses");
    	double fourExpenses;
    	if (fourExpenses_str == null || fourExpenses_str.isEmpty()) {
    		fourExpenses=0;
    	}else {
    		fourExpenses = Double.parseDouble(fourExpenses_str.replace(",", ""));
    	}
    	
    	//利润总额
    	String totalProfit_str= request.getParameter("totalProfit");
    	double totalProfit;
    	if (totalProfit_str == null || totalProfit_str.isEmpty()) {
    		totalProfit=0;
    	}else {
    		totalProfit = Double.parseDouble(totalProfit_str.replace(",", ""));
    	}
    	
    	//主营利润
    	String mainProfit_str= request.getParameter("mainProfit");
    	double mainProfit;
    	if (mainProfit_str == null || mainProfit_str.isEmpty()) {
    		mainProfit=0;
    	}else {
    		mainProfit = Double.parseDouble(mainProfit_str.replace(",", ""));
    	}
    	
    	//主营利润率
    	String mainProfitMargin_str= request.getParameter("mainProfitMargin");
    	double mainProfitMargin;
    	if (mainProfitMargin_str == null || mainProfitMargin_str.isEmpty()) {
    		mainProfitMargin=0;
    	}else {
    		mainProfitMargin = Double.parseDouble(mainProfitMargin_str.replace("%", ""))/100;
    	}
    	
    	//主营利润占利润总额的比例
    	String mainOperatingProfitToTotalProfit_str= request.getParameter("mainOperatingProfitToTotalProfit");
    	double mainOperatingProfitToTotalProfit;
    	if (mainOperatingProfitToTotalProfit_str == null || mainOperatingProfitToTotalProfit_str.isEmpty()) {
    		mainOperatingProfitToTotalProfit=0;
    	}else {
    		mainOperatingProfitToTotalProfit = Double.parseDouble(mainOperatingProfitToTotalProfit_str.replace("%", ""))/100;
    	}
    	
    	//营业利润
    	String operatingProfit_str= request.getParameter("operatingProfit");
    	double operatingProfit;
    	if (operatingProfit_str == null || operatingProfit_str.isEmpty()) {
    		operatingProfit=0;
    	}else {
    		operatingProfit = Double.parseDouble(operatingProfit_str.replace(",", ""));
    	}
    	
    	//营业利润率
    	String operatingMargin_str= request.getParameter("operatingMargin");
    	double operatingMargin;
    	if (operatingMargin_str == null || operatingMargin_str.isEmpty()) {
    		operatingMargin=0;
    	}else {
    		operatingMargin = Double.parseDouble(operatingMargin_str.replace("%", ""))/100;
    	}
    	
    	//净利润
    	String netProfit_str= request.getParameter("netProfit");
    	double netProfit;
    	if (netProfit_str == null || netProfit_str.isEmpty()) {
    		netProfit=0;
    	}else {
    		netProfit = Double.parseDouble(netProfit_str.replace(",", ""));
    	}
    	
    	//净利润增长率
    	String netProfitGrowthRate_str= request.getParameter("netProfitGrowthRate");
    	double netProfitGrowthRate;
    	if (netProfitGrowthRate_str == null || netProfitGrowthRate_str.isEmpty()) {
    		netProfitGrowthRate=0;
    	}else {
    		netProfitGrowthRate = Double.parseDouble(netProfitGrowthRate_str.replace("%", ""))/100;
    	}
    	
    	//净利润率
    	String netProfitMargin_str = request.getParameter("netProfitMargin");
    	double netProfitMargin;
    	if (netProfitMargin_str == null || netProfitMargin_str.isEmpty()) {
    		netProfitMargin=0;
    	}else {
    		netProfitMargin = Double.parseDouble(netProfitMargin_str.replace("%", ""))/100;
    	}
    	
    	//经营活动产生的现金流量净额
    	String netCashFlowFromOperating_str= request.getParameter("netCashFlowFromOperating");
    	double netCashFlowFromOperating;
    	if (netCashFlowFromOperating_str == null || netCashFlowFromOperating_str.isEmpty()) {
    		netCashFlowFromOperating=0;
    	}else {
    		netCashFlowFromOperating = Double.parseDouble(netCashFlowFromOperating_str.replace(",", ""));
    	}
    	
    	//经营活动产生的现金流量净额同比增长
    	String growthRateOfNetCashFlowFromOperating_str = request.getParameter("growthRateOfNetCashFlowFromOperating");
    	double growthRateOfNetCashFlowFromOperating;
    	if (growthRateOfNetCashFlowFromOperating_str == null || growthRateOfNetCashFlowFromOperating_str.isEmpty()) {
    		growthRateOfNetCashFlowFromOperating=0;
    	}else {
    		growthRateOfNetCashFlowFromOperating = Double.parseDouble(growthRateOfNetCashFlowFromOperating_str.replace("%", ""))/100;
    	}
    	
    	//净利润现金比率
    	String netProfitCashRatio_str = request.getParameter("netProfitCashRatio");
    	double netProfitCashRatio;

    	if (netProfitCashRatio_str == null || netProfitCashRatio_str.isEmpty()) {
    	    netProfitCashRatio = 0;
    	} else {
    	    netProfitCashRatio_str = netProfitCashRatio_str.replace(",", ""); // 去除逗号
    	    netProfitCashRatio = Double.parseDouble(netProfitCashRatio_str.replace("%", "")) / 100;
    	}
    	
    	//归属于母公司所有者的净利润
    	String netIncomeAttributableToShareholders_str= request.getParameter("netIncomeAttributableToShareholders");
    	double netIncomeAttributableToShareholders;
    	if (netIncomeAttributableToShareholders_str == null || netIncomeAttributableToShareholders_str.isEmpty()) {
    		netIncomeAttributableToShareholders=0;
    	}else {
    		netIncomeAttributableToShareholders = Double.parseDouble(netIncomeAttributableToShareholders_str.replace(",", ""));
    	}
    	
    	//归母净利润增长率
    	String growthRateOfNetIncomeAttributableToShareholders_str = request.getParameter("growthRateOfNetIncomeAttributableToShareholders");
    	double growthRateOfNetIncomeAttributableToShareholders;
    	if (growthRateOfNetIncomeAttributableToShareholders_str == null || growthRateOfNetIncomeAttributableToShareholders_str.isEmpty()) {
    		growthRateOfNetIncomeAttributableToShareholders=0;
    	}else {
    		growthRateOfNetIncomeAttributableToShareholders = Double.parseDouble(growthRateOfNetIncomeAttributableToShareholders_str.replace("%", ""))/100;
    	}
    	
    	//ROE
    	String ROE_str = request.getParameter("ROE");
    	double ROE;
    	if (ROE_str == null || ROE_str.isEmpty()) {
    		ROE=0;
    	}else {
    		ROE = Double.parseDouble(ROE_str.replace("%", ""))/100;
    	}
    	
    	//固定资产折旧
    	String depreciation_str= request.getParameter("depreciation");
    	double depreciation;
    	if (depreciation_str == null || depreciation_str.isEmpty()) {
    		depreciation=0;
    	}else {
    		depreciation = Double.parseDouble(depreciation_str.replace(",", ""));
    	}
    	
    	//无形资产摊销
    	String amortizationOfIntangibleAssets_str= request.getParameter("amortizationOfIntangibleAssets");
    	double amortizationOfIntangibleAssets;
    	if (amortizationOfIntangibleAssets_str == null || amortizationOfIntangibleAssets_str.isEmpty()) {
    		amortizationOfIntangibleAssets=0;
    	}else {
    		amortizationOfIntangibleAssets = Double.parseDouble(amortizationOfIntangibleAssets_str.replace(",", ""));
    	}
    	
    	//现金股利(分配股利、利润或偿付利息支付的现金)
    	String cashPaidForDistributingDividendsProfitsPayingInterest_str= request.getParameter("cashPaidForDistributingDividendsProfitsPayingInterest");
    	double cashPaidForDistributingDividendsProfitsPayingInterest;
    	if (cashPaidForDistributingDividendsProfitsPayingInterest_str == null || cashPaidForDistributingDividendsProfitsPayingInterest_str.isEmpty()) {
    		cashPaidForDistributingDividendsProfitsPayingInterest=0;
    	}else {
    		cashPaidForDistributingDividendsProfitsPayingInterest = Double.parseDouble(cashPaidForDistributingDividendsProfitsPayingInterest_str.replace(",", ""));
    	}
    	
    	//经营活动产生的现金流量净额减去以上三项的余额
    	String remainingCash_str= request.getParameter("remainingCash");
    	double remainingCash;
    	if (remainingCash_str == null || remainingCash_str.isEmpty()) {
    		remainingCash=0;
    	}else {
    		remainingCash = Double.parseDouble(remainingCash_str.replace(",", ""));
    	}
    	
    	//购建固定资产、无形资产和其他长期资产支付的现金
    	String cashPaidForPurchaseConstructionFixedIntangibleLongTermAssets_str= request.getParameter("cashPaidForPurchaseConstructionFixedIntangibleLongTermAssets");
    	double cashPaidForPurchaseConstructionFixedIntangibleLongTermAssets;
    	if (cashPaidForPurchaseConstructionFixedIntangibleLongTermAssets_str == null || cashPaidForPurchaseConstructionFixedIntangibleLongTermAssets_str.isEmpty()) {
    		cashPaidForPurchaseConstructionFixedIntangibleLongTermAssets=0;
    	}else {
    		cashPaidForPurchaseConstructionFixedIntangibleLongTermAssets = Double.parseDouble(cashPaidForPurchaseConstructionFixedIntangibleLongTermAssets_str.replace(",", ""));
    	}
    	
    	//处置固定、无形和其他长期资产收回现金
    	String netCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssets_str= request.getParameter("netCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssets");
    	double netCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssets;
    	if (netCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssets_str == null || netCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssets_str.isEmpty()) {
    		netCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssets=0;
    	}else {
    		netCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssets = Double.parseDouble(netCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssets_str.replace(",", ""));
    	}
    	
    	//购建固产占经营活动产生的现金比
    	String purchaseConstructionFixedIntangibleLongTermAssetsProportion_str = request.getParameter("purchaseConstructionFixedIntangibleLongTermAssetsProportion");
    	double purchaseConstructionFixedIntangibleLongTermAssetsProportion;
    	if (purchaseConstructionFixedIntangibleLongTermAssetsProportion_str == null || purchaseConstructionFixedIntangibleLongTermAssetsProportion_str.isEmpty()) {
    		purchaseConstructionFixedIntangibleLongTermAssetsProportion=0;
    	}else {
    		purchaseConstructionFixedIntangibleLongTermAssetsProportion = Double.parseDouble(purchaseConstructionFixedIntangibleLongTermAssetsProportion_str.replace("%", ""))/100;
    	}
    	
    	//处置固定资产、无形资产和其他长期资产收回的现金净额占购建资产支付的现金比
    	String netCashReceivedFromDisposalProportionTopurchase_str = request.getParameter("netCashReceivedFromDisposalProportionTopurchase");
    	double netCashReceivedFromDisposalProportionTopurchase;
    	if (netCashReceivedFromDisposalProportionTopurchase_str == null || netCashReceivedFromDisposalProportionTopurchase_str.isEmpty()) {
    		netCashReceivedFromDisposalProportionTopurchase=0;
    	}else {
    		netCashReceivedFromDisposalProportionTopurchase = Double.parseDouble(netCashReceivedFromDisposalProportionTopurchase_str.replace("%", ""))/100;
    	}
    	
    	System.out.print("处置固定资产、无形资产和其他长期资产收回的现金净额占购建资产支付的现金比:"+netCashReceivedFromDisposalProportionTopurchase);
    	
    	//现金分红金额
    	String financialReportDividends_str= request.getParameter("financialReportDividends");
    	double financialReportDividends;
    	if (financialReportDividends_str == null || financialReportDividends_str.isEmpty()) {
    		financialReportDividends=0;
    	}else {
    		financialReportDividends = Double.parseDouble(financialReportDividends_str.replace(",", ""));
    	}
    	
    	//分红率（股利支付率）
    	String dividendRate_str = request.getParameter("dividendRate");
    	double dividendRate;
    	if (dividendRate_str == null || dividendRate_str.isEmpty()) {
    		dividendRate=0;
    	}else {
    		dividendRate = Double.parseDouble(dividendRate_str.replace("%", ""))/100;
    	}
    	
    	//投资活动产生的现金流量净额
    	String netCashFlowGeneratedFromInvestmentActivities_str= request.getParameter("netCashFlowGeneratedFromInvestmentActivities");
    	double netCashFlowGeneratedFromInvestmentActivities;
    	if (netCashFlowGeneratedFromInvestmentActivities_str == null || netCashFlowGeneratedFromInvestmentActivities_str.isEmpty()) {
    		netCashFlowGeneratedFromInvestmentActivities=0;
    	}else {
    		netCashFlowGeneratedFromInvestmentActivities = Double.parseDouble(netCashFlowGeneratedFromInvestmentActivities_str.replace(",", ""));
    	}
    	
    	//筹资活动产生的现金流量净额
    	String netCashFlowGeneratedFromFinancingActivities_str= request.getParameter("netCashFlowGeneratedFromFinancingActivities");
    	double netCashFlowGeneratedFromFinancingActivities;
    	if (netCashFlowGeneratedFromFinancingActivities_str == null || netCashFlowGeneratedFromFinancingActivities_str.isEmpty()) {
    		netCashFlowGeneratedFromFinancingActivities=0;
    	}else {
    		netCashFlowGeneratedFromFinancingActivities = Double.parseDouble(netCashFlowGeneratedFromFinancingActivities_str.replace(",", ""));
    	}
    	
    	//公司类型
    	String companyType = request.getParameter("companyType");
    	
    	//现金及现金等价物净增加额
    	String netIncreaseInCashAndCashEquivalents_str= request.getParameter("netIncreaseInCashAndCashEquivalents");
    	double netIncreaseInCashAndCashEquivalents;
    	if (netIncreaseInCashAndCashEquivalents_str == null || netIncreaseInCashAndCashEquivalents_str.isEmpty()) {
    		netIncreaseInCashAndCashEquivalents=0;
    	}else {
    		netIncreaseInCashAndCashEquivalents = Double.parseDouble(netIncreaseInCashAndCashEquivalents_str.replace(",", ""));
    	}
    	
    	//加现金分红的现金及现金等价物净增加额
    	String netIncreaseInCashAndCashEquivalentsAddBonus_str= request.getParameter("netIncreaseInCashAndCashEquivalentsAddBonus");
    	double netIncreaseInCashAndCashEquivalentsAddBonus;
    	if (netIncreaseInCashAndCashEquivalentsAddBonus_str == null || netIncreaseInCashAndCashEquivalentsAddBonus_str.isEmpty()) {
    		netIncreaseInCashAndCashEquivalentsAddBonus=0;
    	}else {
    		netIncreaseInCashAndCashEquivalentsAddBonus = Double.parseDouble(netIncreaseInCashAndCashEquivalentsAddBonus_str.replace(",", ""));
    	}
    	
    	//期末现金及现金等价物余额
    	String closingBalanceOfCashAndCashEquivalents_str= request.getParameter("closingBalanceOfCashAndCashEquivalents");
    	double closingBalanceOfCashAndCashEquivalents;
    	if (closingBalanceOfCashAndCashEquivalents_str == null || closingBalanceOfCashAndCashEquivalents_str.isEmpty()) {
    		closingBalanceOfCashAndCashEquivalents=0;
    	}else {
    		closingBalanceOfCashAndCashEquivalents = Double.parseDouble(closingBalanceOfCashAndCashEquivalents_str.replace(",", ""));
    	}
    	
    	//创建时间
    	String createDateTime = CreateTime.createtime();
    	
    	//数据来源：页面确认，自动触发
    	String dataResource = "页面确认";
    	
    	ry.setAShareCode(AShareCode);
    	ry.setAShareName(AShareName);
    	ry.setPrimaryIndustry(primaryIndustry);
    	ry.setSecondaryIndustry(secondaryIndustry);
    	ry.setThirdLevelIndustry(thirdLevelIndustry);
    	ry.setRegion(region);
    	ry.setFinancialReportingYear(financialReportingYear);
    	ry.setTotalAssets(totalAssets);
    	ry.setTotalAssetsGrowthRate(totalAssetsGrowthRate);
    	ry.setTotalOwnersEquity(totalOwnersEquity);
    	ry.setEquityMultiplier(equityMultiplier);
    	ry.setTotalLiabilities(totalLiabilities);
    	ry.setAssetLiabilityRatio(assetLiabilityRatio);
    	ry.setMonetaryCapital(monetaryCapital);
    	ry.setShortTermBorrowing(shortTermBorrowing);
    	ry.setNonCurrentLiabilitiesDueWithinOneYear(nonCurrentLiabilitiesDueWithinOneYear);
    	ry.setLongTermLoan(longTermLoan);
    	ry.setBondsPayable(bondsPayable);
    	ry.setLongTermPayables(longTermPayables);
    	ry.setInterestBearingLiabilities(interestBearingLiabilities);
    	ry.setDebtRepaymentRisk(debtRepaymentRisk);
    	ry.setTradingFinancialAssetsManagement(tradingFinancialAssetsManagement);
    	ry.setOtherCurrentAssetsManagement(otherCurrentAssetsManagement);
    	ry.setQuasiMonetary(quasiMonetary);
    	ry.setShortTermForeignDebt(shortTermForeignDebt);
    	ry.setShortTermDebtRepaymentRisk(shortTermDebtRepaymentRisk);
    	ry.setQuasiMonetaryCapitalRatio(quasiMonetaryCapitalRatio);
    	ry.setNotesPayable(notesPayable);
    	ry.setAccountsPayable(accountsPayable);
    	ry.setAdvanceReceipts(advanceReceipts);
    	ry.setTotalAccountsPayablePrepaid(totalAccountsPayablePrepaid);
    	ry.setBillReceivable(billReceivable);
    	ry.setAccountsReceivable(accountsReceivable);
    	ry.setAccountsReceivableFinancing(accountsReceivableFinancing);
    	ry.setContractAssets(contractAssets);
    	ry.setPrepayments(prepayments);
    	ry.setContractLiabilities(contractLiabilities);
    	ry.setTotalAccountsReceivablePrepayments(totalAccountsReceivablePrepayments);
    	ry.setOccupySomeoneElseFunds(occupySomeoneElseFunds);
    	ry.setAccountsReceivableRatio(accountsReceivableRatio);
    	ry.setFixedAssets(fixedAssets);
    	ry.setConstructionInProgress(constructionInProgress);
    	ry.setTotalTFxedAssets(totalTFxedAssets);
    	ry.setFixedAssetRatio(fixedAssetRatio);
    	ry.setTradingFinancialAssets(tradingFinancialAssets);
    	ry.setOtherNonCurrentFinancialAssets(otherNonCurrentFinancialAssets);
    	ry.setInvestmentRealEstate(investmentRealEstate);
    	ry.setLongTermEquityInvestment(longTermEquityInvestment);
    	ry.setSubtotalOfInvestmentAssets(subtotalOfInvestmentAssets);
    	ry.setInvestmentAssetRatio(investmentAssetRatio);
    	ry.setIntangibleAssets(intangibleAssets);
    	ry.setGoodwill(goodwill);
    	ry.setTheProportionOfIntangibleAssets(theProportionOfIntangibleAssets);
    	ry.setGoodwillProportion(goodwillProportion);
    	ry.setPayrollPayable(payrollPayable);
    	ry.setCashPaidToAndOnBehalfOfEmployees(cashPaidToAndOnBehalfOfEmployees);
    	ry.setTotalEmployeeCompensation(totalEmployeeCompensation);
    	ry.setTotalNumberOfPeople(totalNumberOfPeople);
    	ry.setPerCapitaAnnualSalary(perCapitaAnnualSalary);
    	ry.setPerCapitaMonthlySalary(perCapitaMonthlySalary);
    	ry.setOperatingRevenue(operatingRevenue);
    	ry.setRevenueGrowthRate(revenueGrowthRate);
    	ry.setTotalAssetTurnover(totalAssetTurnover);
    	ry.setCashReceivedFromSellingGoodsAndProvidingServices(cashReceivedFromSellingGoodsAndProvidingServices);
    	ry.setProportionOfCashSellingGoodsProvidingServices(proportionOfCashSellingGoodsProvidingServices);
    	ry.setOtherReceivables(otherReceivables);
    	ry.setInventory(inventory);
    	ry.setInventoryGrowthRate(inventoryGrowthRate);
    	ry.setAccountsReceivablePercentageOfRevenue(accountsReceivablePercentageOfRevenue);
    	ry.setPrepaymentsPercentageOfRevenue(prepaymentsPercentageOfRevenue);
    	ry.setOtherReceivablesPercentageOfRevenue(otherReceivablesPercentageOfRevenue);
    	ry.setInventoryToRevenueRatio(inventoryToRevenueRatio);
    	ry.setOperatingCosts(operatingCosts);
    	ry.setGrossMargin(grossMargin);
    	ry.setSellingExpenses(sellingExpenses);
    	ry.setSalesExpenseRate(salesExpenseRate);
    	ry.setOverhead(overhead);
    	ry.setManagementExpenseRate(managementExpenseRate);
    	ry.setResearchAndDevelopment(researchAndDevelopment);
    	ry.setResearchAndDevelopmentRate(researchAndDevelopmentRate);
    	ry.setFinancialExpenses(financialExpenses);
    	ry.setExpense(expense);
    	ry.setExpenseRateToGrossProfitMargin(expenseRateToGrossProfitMargin);
    	ry.setTaxesAndSurcharges(taxesAndSurcharges);
    	ry.setFourExpenses(fourExpenses);
    	ry.setTotalProfit(totalProfit);
    	ry.setMainProfit(mainProfit);
    	ry.setMainProfitMargin(mainProfitMargin);
    	ry.setMainOperatingProfitToTotalProfit(mainOperatingProfitToTotalProfit);
    	ry.setOperatingProfit(operatingProfit);
    	ry.setOperatingMargin(operatingMargin);
    	ry.setNetProfit(netProfit);
    	ry.setNetProfitGrowthRate(netProfitGrowthRate);
    	ry.setNetProfitMargin(netProfitMargin);
    	ry.setNetCashFlowFromOperating(netCashFlowFromOperating);
    	ry.setGrowthRateOfNetCashFlowFromOperating(growthRateOfNetCashFlowFromOperating);
    	ry.setNetProfitCashRatio(netProfitCashRatio);
    	ry.setNetIncomeAttributableToShareholders(netIncomeAttributableToShareholders);
    	ry.setGrowthRateOfNetIncomeAttributableToShareholders(growthRateOfNetIncomeAttributableToShareholders);
    	ry.setROE(ROE);
    	ry.setDepreciation(depreciation);
    	ry.setAmortizationOfIntangibleAssets(amortizationOfIntangibleAssets);
    	ry.setCashPaidForDistributingDividendsProfitsPayingInterest(cashPaidForDistributingDividendsProfitsPayingInterest);
    	ry.setRemainingCash(remainingCash);
    	ry.setCashPaidForPurchaseConstructionFixedIntangibleLongTermAssets(cashPaidForPurchaseConstructionFixedIntangibleLongTermAssets);
    	ry.setNetCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssets(netCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssets);
    	ry.setPurchaseConstructionFixedIntangibleLongTermAssetsProportion(purchaseConstructionFixedIntangibleLongTermAssetsProportion);
    	ry.setNetCashReceivedFromDisposalProportionTopurchase(netCashReceivedFromDisposalProportionTopurchase);
    	ry.setFinancialReportDividends(financialReportDividends);
    	ry.setDividendRate(dividendRate);
    	ry.setNetCashFlowGeneratedFromInvestmentActivities(netCashFlowGeneratedFromInvestmentActivities);
    	ry.setNetCashFlowGeneratedFromFinancingActivities(netCashFlowGeneratedFromFinancingActivities);
    	ry.setCompanyType(companyType);
    	ry.setNetIncreaseInCashAndCashEquivalents(netIncreaseInCashAndCashEquivalents);
    	ry.setNetIncreaseInCashAndCashEquivalentsAddBonus(netIncreaseInCashAndCashEquivalentsAddBonus);
    	ry.setClosingBalanceOfCashAndCashEquivalents(closingBalanceOfCashAndCashEquivalents);
    	ry.setCreateDateTime(createDateTime);
    	ry.setDataResource(dataResource);
    	ry.setReportYear(reportYear);
    	

    	
    	// 插入数据库
    	boolean insertResult = imda.insertReportstatistics(ry);
        if(insertResult) {
    	// 添加成功，设置成功消息
            request.setAttribute("a", "添加成功!");
        } else {
            // 添加失败，设置失败消息
            request.setAttribute("a", "添加失败!");
        }

    RequestDispatcher dispatcher=request.getRequestDispatcher("reportAnalysisStatistics.jsp");
	dispatcher.forward(request, response);
    }

}