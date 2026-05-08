package analys.servlet.report;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import report.bean.entity.IncomeStatement;
import report.bean.daolmp.ReportDaoImp;
import report.bean.common.CreateTime;

public class EditIncomeStatement extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void init(ServletConfig config) throws ServletException{
		super.init(config);									
		}
	
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setCharacterEncoding("utf-8");
    	IncomeStatement is=new IncomeStatement();
    	request.setAttribute("is", is);
    	ReportDaoImp rdi=new ReportDaoImp();
    	
    	//获取JSP页面信息
    	String financialReportingNo=request.getParameter("financialReportingNo");
    	
    	String grossRevenue_str = request.getParameter("grossRevenue");
    	double grossRevenue;
    	if (grossRevenue_str == null || grossRevenue_str.isEmpty()) {
    	    grossRevenue = 0.00;
    	} else {
    	    grossRevenue = Double.parseDouble(grossRevenue_str.replace(",", ""));
    	}
    	
    	
    	String operatingRevenue_str=request.getParameter("operatingRevenue");
    	double operatingRevenue;
    	if(operatingRevenue_str==null || operatingRevenue_str.isEmpty())  {
    		operatingRevenue=0.00;
    	}else {
    		operatingRevenue = Double.parseDouble(operatingRevenue_str.replace(",", ""));
    	}
    	
    	String interestIncome_str=request.getParameter("interestIncome");
    	double interestIncome;
    	if(interestIncome_str==null || interestIncome_str.isEmpty())  {
    		interestIncome=0.00;
    	}else {
    		interestIncome = Double.parseDouble(interestIncome_str.replace(",", ""));
    	}
    	
    	String earnedPremium_str=request.getParameter("earnedPremium");
    	double earnedPremium;
    	if(earnedPremium_str==null || earnedPremium_str.isEmpty())  {
    		earnedPremium=0.00;
    	}else {
    		earnedPremium = Double.parseDouble(earnedPremium_str.replace(",", ""));
    	}
    	
    	String feeAndCommissionIncome_str=request.getParameter("feeAndCommissionIncome");
    	double feeAndCommissionIncome;
    	if(feeAndCommissionIncome_str==null || feeAndCommissionIncome_str.isEmpty())  {
    		feeAndCommissionIncome=0.00;
    	}else {
    		feeAndCommissionIncome = Double.parseDouble(feeAndCommissionIncome_str.replace(",", ""));
    	}
    	
    	String totalOperatingCost_str=request.getParameter("totalOperatingCost");
    	double totalOperatingCost;
    	if(totalOperatingCost_str==null || totalOperatingCost_str.isEmpty())  {
    		totalOperatingCost=0.00;
    	}else {
    		totalOperatingCost = Double.parseDouble(totalOperatingCost_str.replace(",", ""));
    	}
    	
    	String operatingCosts_str=request.getParameter("operatingCosts");
    	double operatingCosts;
    	if(operatingCosts_str==null || operatingCosts_str.isEmpty())  {
    		operatingCosts=0.00;
    	}else {
    		operatingCosts = Double.parseDouble(operatingCosts_str.replace(",", ""));
    	}
    	
    	String interestExpense_str=request.getParameter("interestExpense");
    	double interestExpense;
    	if(interestExpense_str==null || interestExpense_str.isEmpty())  {
    		interestExpense=0.00;
    	}else {
    		interestExpense = Double.parseDouble(interestExpense_str.replace(",", ""));
    	}
    	
    	String handlingFeesAndCommissionExpenses_str=request.getParameter("handlingFeesAndCommissionExpenses");
    	double handlingFeesAndCommissionExpenses;
    	if(handlingFeesAndCommissionExpenses_str==null || handlingFeesAndCommissionExpenses_str.isEmpty())  {
    		handlingFeesAndCommissionExpenses=0.00;
    	}else {
    		handlingFeesAndCommissionExpenses = Double.parseDouble(handlingFeesAndCommissionExpenses_str.replace(",", ""));
    	}

    	String surrender_str=request.getParameter("surrender");
    	double surrender;
    	if(surrender_str==null || surrender_str.isEmpty())  {
    		surrender=0.00;
    	}else {
    		surrender = Double.parseDouble(surrender_str.replace(",", ""));
    	}

    	String netCompensationExpenses_str=request.getParameter("netCompensationExpenses");
    	double netCompensationExpenses;
    	if(netCompensationExpenses_str==null || netCompensationExpenses_str.isEmpty())  {
    		netCompensationExpenses=0.00;
    	}else {
    		netCompensationExpenses = Double.parseDouble(netCompensationExpenses_str.replace(",", ""));
    	}

    	String expendituresDividendPolicy_str=request.getParameter("expendituresDividendPolicy");
    	double expendituresDividendPolicy;
    	if(expendituresDividendPolicy_str==null || expendituresDividendPolicy_str.isEmpty())  {
    		expendituresDividendPolicy=0.00;
    	}else {
    		expendituresDividendPolicy = Double.parseDouble(expendituresDividendPolicy_str.replace(",", ""));
    	}

    	String withdrawalOfReserveFundsForInsuranceLiabilityContracts_str=request.getParameter("withdrawalOfReserveFundsForInsuranceLiabilityContracts");
    	double withdrawalOfReserveFundsForInsuranceLiabilityContracts;
    	if(withdrawalOfReserveFundsForInsuranceLiabilityContracts_str==null || withdrawalOfReserveFundsForInsuranceLiabilityContracts_str.isEmpty())  {
    		withdrawalOfReserveFundsForInsuranceLiabilityContracts=0.00;
    	}else {
    		withdrawalOfReserveFundsForInsuranceLiabilityContracts = Double.parseDouble(withdrawalOfReserveFundsForInsuranceLiabilityContracts_str.replace(",", ""));
    	}

    	String reinsuranceExpenses_str=request.getParameter("reinsuranceExpenses");
    	double reinsuranceExpenses;
    	if(reinsuranceExpenses_str==null || reinsuranceExpenses_str.isEmpty())  {
    		reinsuranceExpenses=0.00;
    	}else {
    		reinsuranceExpenses = Double.parseDouble(reinsuranceExpenses_str.replace(",", ""));
    	}

    	String taxesAndSurcharges_str=request.getParameter("taxesAndSurcharges");
    	double taxesAndSurcharges;
    	if(taxesAndSurcharges_str==null || taxesAndSurcharges_str.isEmpty())  {
    		taxesAndSurcharges=0.00;
    	}else {
    		taxesAndSurcharges = Double.parseDouble(taxesAndSurcharges_str.replace(",", ""));
    	}

    	String sellingExpenses_str=request.getParameter("sellingExpenses");
    	double sellingExpenses;
    	if(sellingExpenses_str==null || sellingExpenses_str.isEmpty())  {
    		sellingExpenses=0.00;
    	}else {
    		sellingExpenses = Double.parseDouble(sellingExpenses_str.replace(",", ""));
    	}

    	String overhead_str=request.getParameter("overhead");
    	double overhead;
    	if(overhead_str==null || overhead_str.isEmpty())  {
    		overhead=0.00;
    	}else {
    		overhead = Double.parseDouble(overhead_str.replace(",", ""));
    	}

    	String researchAndDevelopment_str=request.getParameter("researchAndDevelopment");
    	double researchAndDevelopment;
    	if(researchAndDevelopment_str==null || researchAndDevelopment_str.isEmpty())  {
    		researchAndDevelopment=0.00;
    	}else {
    		researchAndDevelopment = Double.parseDouble(researchAndDevelopment_str.replace(",", ""));
    	}


    	String financialExpenses_str=request.getParameter("financialExpenses");
    	double financialExpenses;
    	if(financialExpenses_str==null || financialExpenses_str.isEmpty())  {
    		financialExpenses=0.00;
    	}else {
    		financialExpenses = Double.parseDouble(financialExpenses_str.replace(",", ""));
    	}


    	String financialExpensesInterestExpenses_str=request.getParameter("financialExpensesInterestExpenses");
    	double financialExpensesInterestExpenses;
    	if(financialExpensesInterestExpenses_str==null || financialExpensesInterestExpenses_str.isEmpty())  {
    		financialExpensesInterestExpenses=0.00;
    	}else {
    		financialExpensesInterestExpenses = Double.parseDouble(financialExpensesInterestExpenses_str.replace(",", ""));
    	}
    	
    	String financialExpensesInterestIncome_str=request.getParameter("financialExpensesInterestIncome");
    	double financialExpensesInterestIncome;
    	if(financialExpensesInterestIncome_str==null || financialExpensesInterestIncome_str.isEmpty())  {
    		financialExpensesInterestIncome=0.00;
    	}else {
    		financialExpensesInterestIncome = Double.parseDouble(financialExpensesInterestIncome_str.replace(",", ""));
    	}

    	String otherIncome_str=request.getParameter("otherIncome");
    	double otherIncome;
    	if(otherIncome_str==null || otherIncome_str.isEmpty())  {
    		otherIncome=0.00;
    	}else {
    		otherIncome = Double.parseDouble(otherIncome_str.replace(",", ""));
    	}

    	String incomeFromInvestment_str=request.getParameter("incomeFromInvestment");
    	double incomeFromInvestment;
    	if(incomeFromInvestment_str==null || incomeFromInvestment_str.isEmpty())  {
    		incomeFromInvestment=0.00;
    	}else {
    		incomeFromInvestment = Double.parseDouble(incomeFromInvestment_str.replace(",", ""));
    	}

    	String investmentIncomeFromAssociatesAndJointVentures_str=request.getParameter("investmentIncomeFromAssociatesAndJointVentures");
    	double investmentIncomeFromAssociatesAndJointVentures;
    	if(investmentIncomeFromAssociatesAndJointVentures_str==null || investmentIncomeFromAssociatesAndJointVentures_str.isEmpty())  {
    		investmentIncomeFromAssociatesAndJointVentures=0.00;
    	}else {
    		investmentIncomeFromAssociatesAndJointVentures = Double.parseDouble(investmentIncomeFromAssociatesAndJointVentures_str.replace(",", ""));
    	}

    	String exchangeGains_str=request.getParameter("exchangeGains");
    	double exchangeGains;
    	if(exchangeGains_str==null || exchangeGains_str.isEmpty())  {
    		exchangeGains=0.00;
    	}else {
    		exchangeGains = Double.parseDouble(exchangeGains_str.replace(",", ""));
    	}

    	String incomeFromDerecognitionOfFinancialAssetsMeasuredAtAmortizedCost_str=request.getParameter("incomeFromDerecognitionOfFinancialAssetsMeasuredAtAmortizedCost");
    	double incomeFromDerecognitionOfFinancialAssetsMeasuredAtAmortizedCost;
    	if(incomeFromDerecognitionOfFinancialAssetsMeasuredAtAmortizedCost_str==null || incomeFromDerecognitionOfFinancialAssetsMeasuredAtAmortizedCost_str.isEmpty())  {
    		incomeFromDerecognitionOfFinancialAssetsMeasuredAtAmortizedCost=0.00;
    	}else {
    		incomeFromDerecognitionOfFinancialAssetsMeasuredAtAmortizedCost = Double.parseDouble(incomeFromDerecognitionOfFinancialAssetsMeasuredAtAmortizedCost_str.replace(",", ""));
    	}

    	String netExposureHedgingIncome_str=request.getParameter("netExposureHedgingIncome");
    	double netExposureHedgingIncome;
    	if(netExposureHedgingIncome_str==null || netExposureHedgingIncome_str.isEmpty())  {
    		netExposureHedgingIncome=0.00;
    	}else {
    		netExposureHedgingIncome = Double.parseDouble(netExposureHedgingIncome_str.replace(",", ""));
    	}

    	String incomeFromChangesInFairValue_str=request.getParameter("incomeFromChangesInFairValue");
    	double incomeFromChangesInFairValue;
    	if(incomeFromChangesInFairValue_str==null || incomeFromChangesInFairValue_str.isEmpty())  {
    		incomeFromChangesInFairValue=0.00;
    	}else {
    		incomeFromChangesInFairValue = Double.parseDouble(incomeFromChangesInFairValue_str.replace(",", ""));
    	}

    	String creditImpairmentLoss_str=request.getParameter("creditImpairmentLoss");
    	double creditImpairmentLoss;
    	if(creditImpairmentLoss_str==null || creditImpairmentLoss_str.isEmpty())  {
    		creditImpairmentLoss=0.00;
    	}else {
    		creditImpairmentLoss = Double.parseDouble(creditImpairmentLoss_str.replace(",", ""));
    	}

    	String impairmentLoss_str=request.getParameter("impairmentLoss");
    	double impairmentLoss;
    	if(impairmentLoss_str==null || impairmentLoss_str.isEmpty())  {
    		impairmentLoss=0.00;
    	}else {
    		impairmentLoss = Double.parseDouble(impairmentLoss_str.replace(",", ""));
    	}

    	String assetDisposalIncome_str=request.getParameter("assetDisposalIncome");
    	double assetDisposalIncome;
    	if(assetDisposalIncome_str==null || assetDisposalIncome_str.isEmpty())  {
    		assetDisposalIncome=0.00;
    	}else {
    		assetDisposalIncome = Double.parseDouble(assetDisposalIncome_str.replace(",", ""));
    	}

    	String operatingProfit_str=request.getParameter("operatingProfit");
    	double operatingProfit;
    	if(operatingProfit_str==null || operatingProfit_str.isEmpty())  {
    		operatingProfit=0.00;
    	}else {
    		operatingProfit = Double.parseDouble(operatingProfit_str.replace(",", ""));
    	}
    	

    	String nonOperatingIncome_str=request.getParameter("nonOperatingIncome");
    	double nonOperatingIncome;
    	if(nonOperatingIncome_str==null || nonOperatingIncome_str.isEmpty())  {
    		nonOperatingIncome=0.00;
    	}else {
    		nonOperatingIncome = Double.parseDouble(nonOperatingIncome_str.replace(",", ""));
    	}

    	String nonOperatingExpenses_str=request.getParameter("nonOperatingExpenses");
    	double nonOperatingExpenses;
    	if(nonOperatingExpenses_str==null || nonOperatingExpenses_str.isEmpty())  {
    		nonOperatingExpenses=0.00;
    	}else {
    		nonOperatingExpenses = Double.parseDouble(nonOperatingExpenses_str.replace(",", ""));
    	}

    	String totalProfit_str=request.getParameter("totalProfit");
    	double totalProfit;
    	if(totalProfit_str==null || totalProfit_str.isEmpty())  {
    		totalProfit=0.00;
    	}else {
    		totalProfit = Double.parseDouble(totalProfit_str.replace(",", ""));
    	}

    	String incomeTaxExpense_str=request.getParameter("incomeTaxExpense");
    	double incomeTaxExpense;
    	if(incomeTaxExpense_str==null || incomeTaxExpense_str.isEmpty())  {
    		incomeTaxExpense=0.00;
    	}else {
    		incomeTaxExpense = Double.parseDouble(incomeTaxExpense_str.replace(",", ""));
    	}

    	String netProfit_str=request.getParameter("netProfit");
    	double netProfit;
    	if(netProfit_str==null || netProfit_str.isEmpty())  {
    		netProfit=0.00;
    	}else {
    		netProfit = Double.parseDouble(netProfit_str.replace(",", ""));
    	}

    	String netProfitFromContinuingOperations_str=request.getParameter("netProfitFromContinuingOperations");
    	double netProfitFromContinuingOperations;
    	if(netProfitFromContinuingOperations_str==null || netProfitFromContinuingOperations_str.isEmpty())  {
    		netProfitFromContinuingOperations=0.00;
    	}else {
    		netProfitFromContinuingOperations = Double.parseDouble(netProfitFromContinuingOperations_str.replace(",", ""));
    	}

    	String netProfitFromDiscontinuedOperations_str=request.getParameter("netProfitFromDiscontinuedOperations");
    	double netProfitFromDiscontinuedOperations;
    	if(netProfitFromDiscontinuedOperations_str==null || netProfitFromDiscontinuedOperations_str.isEmpty())  {
    		netProfitFromDiscontinuedOperations=0.00;
    	}else {
    		netProfitFromDiscontinuedOperations = Double.parseDouble(netProfitFromDiscontinuedOperations_str.replace(",", ""));
    	}
    			
    	String netIncomeAttributableToShareholders_str=	request.getParameter("netIncomeAttributableToShareholders");
    	double netIncomeAttributableToShareholders;
    	if(netIncomeAttributableToShareholders_str==null || netIncomeAttributableToShareholders_str.isEmpty())  {
    		netIncomeAttributableToShareholders=0.00;
    	}else {
    		netIncomeAttributableToShareholders = Double.parseDouble(netIncomeAttributableToShareholders_str.replace(",", ""));
    	}

    	String minorityInterest_str=request.getParameter("minorityInterest");
    	double minorityInterest;
    	if(minorityInterest_str==null || minorityInterest_str.isEmpty())  {
    		minorityInterest=0.00;
    	}else {
    		minorityInterest = Double.parseDouble(minorityInterest_str.replace(",", ""));
    	}
    	
    	String afterTaxNetAmountOfOtherComprehensiveIncomeAttributable_str=request.getParameter("afterTaxNetAmountOfOtherComprehensiveIncomeAttributable");
    	double afterTaxNetAmountOfOtherComprehensiveIncomeAttributable;
    	if(afterTaxNetAmountOfOtherComprehensiveIncomeAttributable_str==null || afterTaxNetAmountOfOtherComprehensiveIncomeAttributable_str.isEmpty())  {
    		afterTaxNetAmountOfOtherComprehensiveIncomeAttributable=0.00;
    	}else {
    		afterTaxNetAmountOfOtherComprehensiveIncomeAttributable = Double.parseDouble(afterTaxNetAmountOfOtherComprehensiveIncomeAttributable_str.replace(",", ""));
    	}

    	String otherComprehensiveIncomeCannotBeReclassifiedIntoProfitOrLoss_str=request.getParameter("otherComprehensiveIncomeCannotBeReclassifiedIntoProfitOrLoss");
    	double otherComprehensiveIncomeCannotBeReclassifiedIntoProfitOrLoss;
    	if(otherComprehensiveIncomeCannotBeReclassifiedIntoProfitOrLoss_str==null || otherComprehensiveIncomeCannotBeReclassifiedIntoProfitOrLoss_str.isEmpty())  {
    		otherComprehensiveIncomeCannotBeReclassifiedIntoProfitOrLoss=0.00;
    	}else {
    		otherComprehensiveIncomeCannotBeReclassifiedIntoProfitOrLoss = Double.parseDouble(otherComprehensiveIncomeCannotBeReclassifiedIntoProfitOrLoss_str.replace(",", ""));
    	}
    	
    	String remeasureChangesInDefinedBenefitPlans_str=request.getParameter("remeasureChangesInDefinedBenefitPlans");
    	double remeasureChangesInDefinedBenefitPlans;
    	if(remeasureChangesInDefinedBenefitPlans_str==null || remeasureChangesInDefinedBenefitPlans_str.isEmpty())  {
    		remeasureChangesInDefinedBenefitPlans=0.00;
    	}else {
    		remeasureChangesInDefinedBenefitPlans = Double.parseDouble(remeasureChangesInDefinedBenefitPlans_str.replace(",", ""));
    	}

    	String otherIncomeCannotBeConvertedToProfitOrLossUnderTheEquityMethod_str=request.getParameter("otherIncomeCannotBeConvertedToProfitOrLossUnderTheEquityMethod");
    	double otherIncomeCannotBeConvertedToProfitOrLossUnderTheEquityMethod;
    	if(otherIncomeCannotBeConvertedToProfitOrLossUnderTheEquityMethod_str==null || otherIncomeCannotBeConvertedToProfitOrLossUnderTheEquityMethod_str.isEmpty())  {
    		otherIncomeCannotBeConvertedToProfitOrLossUnderTheEquityMethod=0.00;
    	}else {
    		otherIncomeCannotBeConvertedToProfitOrLossUnderTheEquityMethod = Double.parseDouble(otherIncomeCannotBeConvertedToProfitOrLossUnderTheEquityMethod_str.replace(",", ""));
    	}

    	String changesInFairValueOfOtherEquityInstrumentInvestments_str=request.getParameter("changesInFairValueOfOtherEquityInstrumentInvestments");
    	double changesInFairValueOfOtherEquityInstrumentInvestments;
    	if(changesInFairValueOfOtherEquityInstrumentInvestments_str==null || changesInFairValueOfOtherEquityInstrumentInvestments_str.isEmpty())  {
    		changesInFairValueOfOtherEquityInstrumentInvestments=0.00;
    	}else {
    		changesInFairValueOfOtherEquityInstrumentInvestments = Double.parseDouble(changesInFairValueOfOtherEquityInstrumentInvestments_str.replace(",", ""));
    	}

    	String changesInFairValueOfCorporateCreditRisk_str=request.getParameter("changesInFairValueOfCorporateCreditRisk");
    	double changesInFairValueOfCorporateCreditRisk;
    	if(changesInFairValueOfCorporateCreditRisk_str==null || changesInFairValueOfCorporateCreditRisk_str.isEmpty())  {
    		changesInFairValueOfCorporateCreditRisk=0.00;
    	}else {
    		changesInFairValueOfCorporateCreditRisk = Double.parseDouble(changesInFairValueOfCorporateCreditRisk_str.replace(",", ""));
    	}

    	String others_str=request.getParameter("others");
    	double others;
    	if(others_str==null || others_str.isEmpty())  {
    		others=0.00;
    	}else {
    		others = Double.parseDouble(others_str.replace(",", ""));
    	}

    	String otherIncomeReclassifiedToProfitOrLoss_str=request.getParameter("otherIncomeReclassifiedToProfitOrLoss");
    	double otherIncomeReclassifiedToProfitOrLoss;
    	if(otherIncomeReclassifiedToProfitOrLoss_str==null || otherIncomeReclassifiedToProfitOrLoss_str.isEmpty())  {
    		otherIncomeReclassifiedToProfitOrLoss=0.00;
    	}else {
    		otherIncomeReclassifiedToProfitOrLoss = Double.parseDouble(otherIncomeReclassifiedToProfitOrLoss_str.replace(",", ""));
    	}

    	String otherIncomeCanBeConvertedToProfitOrLossUnderTheEquityMethod_str=request.getParameter("otherIncomeCanBeConvertedToProfitOrLossUnderTheEquityMethod");
    	double otherIncomeCanBeConvertedToProfitOrLossUnderTheEquityMethod;
    	if(otherIncomeCanBeConvertedToProfitOrLossUnderTheEquityMethod_str==null || otherIncomeCanBeConvertedToProfitOrLossUnderTheEquityMethod_str.isEmpty())  {
    		otherIncomeCanBeConvertedToProfitOrLossUnderTheEquityMethod=0.00;
    	}else {
    		otherIncomeCanBeConvertedToProfitOrLossUnderTheEquityMethod = Double.parseDouble(otherIncomeCanBeConvertedToProfitOrLossUnderTheEquityMethod_str.replace(",", ""));
    	}

    	String changesInFairValueOfOtherDebtInvestments_str=request.getParameter("changesInFairValueOfOtherDebtInvestments");
    	double changesInFairValueOfOtherDebtInvestments;
    	if(changesInFairValueOfOtherDebtInvestments_str==null || changesInFairValueOfOtherDebtInvestments_str.isEmpty())  {
    		changesInFairValueOfOtherDebtInvestments=0.00;
    	}else {
    		changesInFairValueOfOtherDebtInvestments = Double.parseDouble(changesInFairValueOfOtherDebtInvestments_str.replace(",", ""));
    	}

    	String reclassificationOfFinancialAssetsInOtherComprehensiveIncome_str=request.getParameter("reclassificationOfFinancialAssetsInOtherComprehensiveIncome");
    	double reclassificationOfFinancialAssetsInOtherComprehensiveIncome;
    	if(reclassificationOfFinancialAssetsInOtherComprehensiveIncome_str==null || reclassificationOfFinancialAssetsInOtherComprehensiveIncome_str.isEmpty())  {
    		reclassificationOfFinancialAssetsInOtherComprehensiveIncome=0.00;
    	}else {
    		reclassificationOfFinancialAssetsInOtherComprehensiveIncome = Double.parseDouble(reclassificationOfFinancialAssetsInOtherComprehensiveIncome_str.replace(",", ""));
    	}

    	String provisionForOtherDebtInvestments_str=request.getParameter("provisionForOtherDebtInvestments");
    	double provisionForOtherDebtInvestments;
    	if(provisionForOtherDebtInvestments_str==null || provisionForOtherDebtInvestments_str.isEmpty())  {
    		provisionForOtherDebtInvestments=0.00;
    	}else {
    		provisionForOtherDebtInvestments = Double.parseDouble(provisionForOtherDebtInvestments_str.replace(",", ""));
    	}

    	String cashFlowHedgingReserves_str=request.getParameter("cashFlowHedgingReserves");
    	double cashFlowHedgingReserves;
    	if(cashFlowHedgingReserves_str==null || cashFlowHedgingReserves_str.isEmpty())  {
    		cashFlowHedgingReserves=0.00;
    	}else {
    		cashFlowHedgingReserves = Double.parseDouble(cashFlowHedgingReserves_str.replace(",", ""));
    	}

    	String currencyTranslationDifferences_str=request.getParameter("currencyTranslationDifferences");
    	double currencyTranslationDifferences;
    	if(currencyTranslationDifferences_str==null || currencyTranslationDifferences_str.isEmpty())  {
    		currencyTranslationDifferences=0.00;
    	}else {
    		currencyTranslationDifferences = Double.parseDouble(currencyTranslationDifferences_str.replace(",", ""));
    	}

    	String others1_str=request.getParameter("others1");
    	double others1;
    	if(others1_str==null || others1_str.isEmpty())  {
    		others1=0.00;
    	}else {
    		others1 = Double.parseDouble(others1_str.replace(",", ""));
    	}
    	
    	String otherIncomeAfterTaxAttributableToMinorityShareholders_str=request.getParameter("otherIncomeAfterTaxAttributableToMinorityShareholders");
    	double otherIncomeAfterTaxAttributableToMinorityShareholders;
    	if(otherIncomeAfterTaxAttributableToMinorityShareholders_str==null || otherIncomeAfterTaxAttributableToMinorityShareholders_str.isEmpty())  {
    		otherIncomeAfterTaxAttributableToMinorityShareholders=0.00;
    	}else {
    		otherIncomeAfterTaxAttributableToMinorityShareholders = Double.parseDouble(otherIncomeAfterTaxAttributableToMinorityShareholders_str.replace(",", ""));
    	}
    	
    	String totalComprehensiveIncome_str=request.getParameter("totalComprehensiveIncome");
    	double totalComprehensiveIncome;
    	if(totalComprehensiveIncome_str==null || totalComprehensiveIncome_str.isEmpty())  {
    		totalComprehensiveIncome=0.00;
    	}else {
    		totalComprehensiveIncome = Double.parseDouble(totalComprehensiveIncome_str.replace(",", ""));
    	}

    	String totalComprehensiveIncomeToTheOwnersOfTheParentCompany_str=request.getParameter("totalComprehensiveIncomeToTheOwnersOfTheParentCompany");
    	double totalComprehensiveIncomeToTheOwnersOfTheParentCompany;
    	if(totalComprehensiveIncomeToTheOwnersOfTheParentCompany_str==null || totalComprehensiveIncomeToTheOwnersOfTheParentCompany_str.isEmpty())  {
    		totalComprehensiveIncomeToTheOwnersOfTheParentCompany=0.00;
    	}else {
    		totalComprehensiveIncomeToTheOwnersOfTheParentCompany = Double.parseDouble(totalComprehensiveIncomeToTheOwnersOfTheParentCompany_str.replace(",", ""));
    	}

    	String totalComprehensiveIncomeToMinorityShareholders_str=request.getParameter("totalComprehensiveIncomeToMinorityShareholders");
    	double totalComprehensiveIncomeToMinorityShareholders;
    	if(totalComprehensiveIncomeToMinorityShareholders_str==null || totalComprehensiveIncomeToMinorityShareholders_str.isEmpty())  {
    		totalComprehensiveIncomeToMinorityShareholders=0.00;
    	}else {
    		totalComprehensiveIncomeToMinorityShareholders = Double.parseDouble(totalComprehensiveIncomeToMinorityShareholders_str.replace(",", ""));
    	}

    	String basicEarningsPerShare_str=request.getParameter("basicEarningsPerShare");
    	double basicEarningsPerShare;
    	if(basicEarningsPerShare_str==null || basicEarningsPerShare_str.isEmpty())  {
    		basicEarningsPerShare=0.00;
    	}else {
    		basicEarningsPerShare = Double.parseDouble(basicEarningsPerShare_str.replace(",", ""));
    	}

    	String dilutedEarningsPerShare_str=request.getParameter("dilutedEarningsPerShare");
    	double dilutedEarningsPerShare;
    	if(dilutedEarningsPerShare_str==null || dilutedEarningsPerShare_str.isEmpty())  {
    		dilutedEarningsPerShare=0.00;
    	}else {
    		dilutedEarningsPerShare = Double.parseDouble(dilutedEarningsPerShare_str.replace(",", ""));
    	}

    	String ROE_str=request.getParameter("ROE");
    	double ROE;
    	if(ROE_str==null || ROE_str.isEmpty())  {
    		ROE=0.00;
    	}else {
    		ROE = Double.parseDouble(ROE_str.replace("%", ""))/100;
    	}

    	String financialReportDividends_str=request.getParameter("financialReportDividends");
    	double financialReportDividends;
    	if(financialReportDividends_str==null || financialReportDividends_str.isEmpty())  {
    		financialReportDividends=0.00;
    	}else {
    		financialReportDividends = Double.parseDouble(financialReportDividends_str.replace(",", ""));
    	}
    	
    	String updateTime=CreateTime.createtime();
    	
    	is.setFinancialReportingNo(financialReportingNo);
    	is.setGrossRevenue(grossRevenue);
    	is.setOperatingRevenue(operatingRevenue);
    	is.setInterestIncome(interestIncome);
    	is.setEarnedPremium(earnedPremium);
    	is.setFeeAndCommissionIncome(feeAndCommissionIncome);
    	is.setTotalOperatingCost(totalOperatingCost);
    	is.setOperatingCosts(operatingCosts);
    	is.setInterestExpense(interestExpense);
    	is.setHandlingFeesAndCommissionExpenses(handlingFeesAndCommissionExpenses);
    	is.setSurrender(surrender);
    	is.setNetCompensationExpenses(netCompensationExpenses);
    	is.setExpendituresDividendPolicy(expendituresDividendPolicy);
    	is.setWithdrawalOfReserveFundsForInsuranceLiabilityContracts(withdrawalOfReserveFundsForInsuranceLiabilityContracts);
    	is.setReinsuranceExpenses(reinsuranceExpenses);
    	is.setTaxesAndSurcharges(taxesAndSurcharges);
    	is.setSellingExpenses(sellingExpenses);
    	is.setOverhead(overhead);
    	is.setResearchAndDevelopment(researchAndDevelopment);
    	is.setFinancialExpenses(financialExpenses);
    	is.setFinancialExpensesInterestExpenses(financialExpensesInterestExpenses);
    	is.setFinancialExpensesInterestIncome(financialExpensesInterestIncome);
    	is.setOtherIncome(otherIncome);
    	is.setIncomeFromInvestment(incomeFromInvestment);
    	is.setInvestmentIncomeFromAssociatesAndJointVentures(investmentIncomeFromAssociatesAndJointVentures);
    	is.setExchangeGains(exchangeGains);
    	is.setIncomeFromDerecognitionOfFinancialAssetsMeasuredAtAmortizedCost(incomeFromDerecognitionOfFinancialAssetsMeasuredAtAmortizedCost);
    	is.setNetExposureHedgingIncome(netExposureHedgingIncome);
    	is.setIncomeFromChangesInFairValue(incomeFromChangesInFairValue);
    	is.setCreditImpairmentLoss(creditImpairmentLoss);
    	is.setImpairmentLoss(impairmentLoss);
    	is.setAssetDisposalIncome(assetDisposalIncome);
    	is.setOperatingProfit(operatingProfit);
    	is.setNonOperatingIncome(nonOperatingIncome);
    	is.setNonOperatingExpenses(nonOperatingExpenses);
    	is.setTotalProfit(totalProfit);
    	is.setIncomeTaxExpense(incomeTaxExpense);
    	is.setNetProfit(netProfit);
    	is.setNetProfitFromContinuingOperations(netProfitFromContinuingOperations);
    	is.setNetProfitFromDiscontinuedOperations(netProfitFromDiscontinuedOperations);
    	is.setNetIncomeAttributableToShareholders(netIncomeAttributableToShareholders);
    	is.setMinorityInterest(minorityInterest);
    	is.setAfterTaxNetAmountOfOtherComprehensiveIncomeAttributable(afterTaxNetAmountOfOtherComprehensiveIncomeAttributable);
    	is.setOtherComprehensiveIncomeCannotBeReclassifiedIntoProfitOrLoss(otherComprehensiveIncomeCannotBeReclassifiedIntoProfitOrLoss);
    	is.setRemeasureChangesInDefinedBenefitPlans(remeasureChangesInDefinedBenefitPlans);
    	is.setOtherIncomeCannotBeConvertedToProfitOrLossUnderTheEquityMethod(otherIncomeCannotBeConvertedToProfitOrLossUnderTheEquityMethod);
    	is.setChangesInFairValueOfOtherEquityInstrumentInvestments(changesInFairValueOfOtherEquityInstrumentInvestments);
    	is.setChangesInFairValueOfCorporateCreditRisk(changesInFairValueOfCorporateCreditRisk);
    	is.setOthers(others);
    	is.setOtherIncomeReclassifiedToProfitOrLoss(otherIncomeReclassifiedToProfitOrLoss);
    	is.setOtherIncomeCanBeConvertedToProfitOrLossUnderTheEquityMethod(otherIncomeCanBeConvertedToProfitOrLossUnderTheEquityMethod);
    	is.setChangesInFairValueOfOtherDebtInvestments(changesInFairValueOfOtherDebtInvestments);
    	is.setReclassificationOfFinancialAssetsInOtherComprehensiveIncome(reclassificationOfFinancialAssetsInOtherComprehensiveIncome);
    	is.setProvisionForOtherDebtInvestments(provisionForOtherDebtInvestments);
    	is.setCashFlowHedgingReserves(cashFlowHedgingReserves);
    	is.setCurrencyTranslationDifferences(currencyTranslationDifferences);
    	is.setOthers1(others1);
    	is.setOtherIncomeAfterTaxAttributableToMinorityShareholders(otherIncomeAfterTaxAttributableToMinorityShareholders);
    	is.setTotalComprehensiveIncome(totalComprehensiveIncome);
    	is.setTotalComprehensiveIncomeToTheOwnersOfTheParentCompany(totalComprehensiveIncomeToTheOwnersOfTheParentCompany);
    	is.setTotalComprehensiveIncomeToMinorityShareholders(totalComprehensiveIncomeToMinorityShareholders);
    	is.setBasicEarningsPerShare(basicEarningsPerShare);
    	is.setDilutedEarningsPerShare(dilutedEarningsPerShare);
    	is.setROE(ROE);
    	is.setFinancialReportDividends(financialReportDividends);
    	is.setUpdateDateTime(updateTime);
    	
    	boolean updateResult=rdi.updateIncomeStatement(is);
    	if(updateResult) {
            // 修改成功，设置成功消息
            request.setAttribute("a", "修改成功!");
        } else {
            // 修改失败，设置失败消息
            request.setAttribute("a", "修改失败!");
        }
    	
    	System.out.print("营业利润："+is.getOperatingProfit());
    	
    	RequestDispatcher dispatcher=request.getRequestDispatcher("financialReportEdit1.jsp");
		dispatcher.forward(request, response);
    	
    }
 }