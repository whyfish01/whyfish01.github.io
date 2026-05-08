package analys.servlet.report;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import report.bean.entity.BalanceSheet;
import report.bean.daolmp.ReportDaoImp;
import report.bean.common.CreateTime;


public class EditBalanceSheet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void init(ServletConfig config) throws ServletException{
		super.init(config);									
		}
	
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setCharacterEncoding("utf-8");
    	BalanceSheet bs=new BalanceSheet();
    	request.setAttribute("bs", bs);
    	ReportDaoImp rdi=new ReportDaoImp();
    	
    	//获取JSP页面头信息
    	String financialReportingNo=request.getParameter("financialReportingNo");
    	
    	//获取JSP页面体信息
    	String monetaryCapital_str=request.getParameter("monetaryCapital");
    	double monetaryCapital;
    	if (monetaryCapital_str == null || monetaryCapital_str.isEmpty()) {
    		monetaryCapital = 0.00;
    	} else {
    		monetaryCapital = Double.parseDouble(monetaryCapital_str.replace(",", ""));
    	}
        
        String settlementProvisions_str=request.getParameter("settlementProvisions");
        double settlementProvisions;
        if (settlementProvisions_str == null || settlementProvisions_str.isEmpty()) {
        	settlementProvisions = 0.00;
    	} else {
    		settlementProvisions = Double.parseDouble(settlementProvisions_str.replace(",", ""));
    	}

        String lendingFunds_str=request.getParameter("lendingFunds");
        double lendingFunds;
        if (lendingFunds_str == null || lendingFunds_str.isEmpty()) {
        	lendingFunds = 0.00;
    	} else {
    		lendingFunds = Double.parseDouble(lendingFunds_str.replace(",", ""));
    	}
        
        String tradingFinancialAssets_str=request.getParameter("tradingFinancialAssets");
        double tradingFinancialAssets;
        if (tradingFinancialAssets_str == null || tradingFinancialAssets_str.isEmpty()) {
        	tradingFinancialAssets = 0.00;
    	} else {
    		tradingFinancialAssets = Double.parseDouble(tradingFinancialAssets_str.replace(",", ""));
    	}

        String tradingFinancialAssetsManagement_str=request.getParameter("tradingFinancialAssetsManagement");
        double tradingFinancialAssetsManagement;
        if (tradingFinancialAssetsManagement_str == null || tradingFinancialAssetsManagement_str.isEmpty()) {
        	tradingFinancialAssetsManagement = 0.00;
    	} else {
    		tradingFinancialAssetsManagement = Double.parseDouble(tradingFinancialAssetsManagement_str.replace(",", ""));
    	}

    	String derivativeFinancialAssets_str=request.getParameter("derivativeFinancialAssets");
    	double derivativeFinancialAssets;
    	if (derivativeFinancialAssets_str == null || derivativeFinancialAssets_str.isEmpty()) {
    		derivativeFinancialAssets = 0.00;
    	} else {
    		derivativeFinancialAssets = Double.parseDouble(derivativeFinancialAssets_str.replace(",", ""));
    	}
        
    	String billReceivable_str=request.getParameter("billReceivable");
    	double billReceivable;
    	if (billReceivable_str == null || billReceivable_str.isEmpty()) {
    		billReceivable = 0.00;
    	} else {
    		billReceivable = Double.parseDouble(billReceivable_str.replace(",", ""));
    	}

    	String accountsReceivable_str=request.getParameter("accountsReceivable");
    	double accountsReceivable;
    	if (accountsReceivable_str == null || accountsReceivable_str.isEmpty()) {
    		accountsReceivable = 0.00;
    	} else {
    		accountsReceivable = Double.parseDouble(accountsReceivable_str.replace(",", ""));
    	}

    	String accountsReceivableFinancing_str=request.getParameter("accountsReceivableFinancing");
    	double accountsReceivableFinancing;
    	if (accountsReceivableFinancing_str == null || accountsReceivableFinancing_str.isEmpty()) {
    		accountsReceivableFinancing = 0.00;
    	} else {
    		accountsReceivableFinancing = Double.parseDouble(accountsReceivableFinancing_str.replace(",", ""));
    	}

    	String prepayments_str=request.getParameter("prepayments");
    	double prepayments;
    	if (prepayments_str == null || prepayments_str.isEmpty()) {
    		prepayments = 0.00;
    	} else {
    		prepayments = Double.parseDouble(prepayments_str.replace(",", ""));
    	}

    	String premiumReceivable_str=request.getParameter("premiumReceivable");
    	double premiumReceivable;
    	if (premiumReceivable_str == null || premiumReceivable_str.isEmpty()) {
    		premiumReceivable = 0.00;
    	} else {
    		premiumReceivable = Double.parseDouble(premiumReceivable_str.replace(",", ""));
    	}

    	String accountsReceivableReinsurance_str=request.getParameter("accountsReceivableReinsurance");
    	double accountsReceivableReinsurance;
    	if (accountsReceivableReinsurance_str == null || accountsReceivableReinsurance_str.isEmpty()) {
    		accountsReceivableReinsurance = 0.00;
    	} else {
    		accountsReceivableReinsurance = Double.parseDouble(accountsReceivableReinsurance_str.replace(",", ""));
    	}

    	String receivableReserveForReinsuranceContracts_str=request.getParameter("receivableReserveForReinsuranceContracts");
    	double receivableReserveForReinsuranceContracts;
    	if (receivableReserveForReinsuranceContracts_str == null || receivableReserveForReinsuranceContracts_str.isEmpty()) {
    		receivableReserveForReinsuranceContracts = 0.00;
    	} else {
    		receivableReserveForReinsuranceContracts = Double.parseDouble(receivableReserveForReinsuranceContracts_str.replace(",", ""));
    	}

    	String otherReceivables_str=request.getParameter("otherReceivables");
    	double otherReceivables;
    	if (otherReceivables_str == null || otherReceivables_str.isEmpty()) {
    		otherReceivables = 0.00;
    	} else {
    		otherReceivables = Double.parseDouble(otherReceivables_str.replace(",", ""));
    	}

    	String interestReceivable_str=request.getParameter("interestReceivable");
    	double interestReceivable;
    	if (interestReceivable_str == null || interestReceivable_str.isEmpty()) {
    		interestReceivable = 0.00;
    	} else {
    		interestReceivable = Double.parseDouble(interestReceivable_str.replace(",", ""));
    	}

    	String dividendReceivable_str=request.getParameter("dividendReceivable");
    	double dividendReceivable;
    	if (dividendReceivable_str == null || dividendReceivable_str.isEmpty()) {
    		dividendReceivable = 0.00;
    	} else {
    		dividendReceivable = Double.parseDouble(dividendReceivable_str.replace(",", ""));
    	}

    	String buyingBackFinancialAssets_str=request.getParameter("buyingBackFinancialAssets");
    	double buyingBackFinancialAssets;
    	if (buyingBackFinancialAssets_str == null || buyingBackFinancialAssets_str.isEmpty()) {
    		buyingBackFinancialAssets = 0.00;
    	} else {
    		buyingBackFinancialAssets = Double.parseDouble(buyingBackFinancialAssets_str.replace(",", ""));
    	}

    	String inventory_str=request.getParameter("inventory");
    	double inventory;
    	if (inventory_str == null || inventory_str.isEmpty()) {
    		inventory = 0.00;
    	} else {
    		inventory = Double.parseDouble(inventory_str.replace(",", ""));
    	}

    	String contractAssets_str=request.getParameter("contractAssets");
    	double contractAssets;
    	if (contractAssets_str == null || contractAssets_str.isEmpty()) {
    		contractAssets = 0.00;
    	} else {
    		contractAssets = Double.parseDouble(contractAssets_str.replace(",", ""));
    	}

    	String assetsHeldForSale_str=request.getParameter("assetsHeldForSale");
    	double assetsHeldForSale;
    	if (assetsHeldForSale_str == null || assetsHeldForSale_str.isEmpty()) {
    		assetsHeldForSale = 0.00;
    	} else {
    		assetsHeldForSale = Double.parseDouble(assetsHeldForSale_str.replace(",", ""));
    	}

    	String nonCurrentAssetsDueWithinOneYear_str=request.getParameter("nonCurrentAssetsDueWithinOneYear");
    	double nonCurrentAssetsDueWithinOneYear;
    	if (nonCurrentAssetsDueWithinOneYear_str == null || nonCurrentAssetsDueWithinOneYear_str.isEmpty()) {
    		nonCurrentAssetsDueWithinOneYear = 0.00;
    	} else {
    		nonCurrentAssetsDueWithinOneYear = Double.parseDouble(nonCurrentAssetsDueWithinOneYear_str.replace(",", ""));
    	}

    	String otherCurrentAssets_str=request.getParameter("otherCurrentAssets");
    	double otherCurrentAssets;
    	if (otherCurrentAssets_str == null || otherCurrentAssets_str.isEmpty()) {
    		otherCurrentAssets = 0.00;
    	} else {
    		otherCurrentAssets = Double.parseDouble(otherCurrentAssets_str.replace(",", ""));
    	}

    	String otherCurrentAssetsManagement_str=request.getParameter("otherCurrentAssetsManagement");
    	double otherCurrentAssetsManagement;
    	if (otherCurrentAssetsManagement_str == null || otherCurrentAssetsManagement_str.isEmpty()) {
    		otherCurrentAssetsManagement = 0.00;
    	} else {
    		otherCurrentAssetsManagement = Double.parseDouble(otherCurrentAssetsManagement_str.replace(",", ""));
    	}

    	String totalCurrentAssets_str=request.getParameter("totalCurrentAssets");
    	double totalCurrentAssets;
    	if (totalCurrentAssets_str == null || totalCurrentAssets_str.isEmpty()) {
    		totalCurrentAssets = 0.00;
    	} else {
    		totalCurrentAssets = Double.parseDouble(totalCurrentAssets_str.replace(",", ""));
    	}

    	String grantingLoansAndAdvances_str=request.getParameter("grantingLoansAndAdvances");
    	double grantingLoansAndAdvances;
    	if (grantingLoansAndAdvances_str == null || grantingLoansAndAdvances_str.isEmpty()) {
    		grantingLoansAndAdvances = 0.00;
    	} else {
    		grantingLoansAndAdvances = Double.parseDouble(grantingLoansAndAdvances_str.replace(",", ""));
    	}

    	String debtInvestment_str=request.getParameter("debtInvestment");
    	double debtInvestment;
    	if (debtInvestment_str == null || debtInvestment_str.isEmpty()) {
    		debtInvestment = 0.00;
    	} else {
    		debtInvestment = Double.parseDouble(debtInvestment_str.replace(",", ""));
    	}

    	String otherDebtInvestment_str=request.getParameter("otherDebtInvestment");
    	double otherDebtInvestment;
    	if (otherDebtInvestment_str == null || otherDebtInvestment_str.isEmpty()) {
    		otherDebtInvestment = 0.00;
    	} else {
    		otherDebtInvestment = Double.parseDouble(otherDebtInvestment_str.replace(",", ""));
    	}

    	String longTermReceivables_str=request.getParameter("longTermReceivables");
    	double longTermReceivables;
    	if (longTermReceivables_str == null || longTermReceivables_str.isEmpty()) {
    		longTermReceivables = 0.00;
    	} else {
    		longTermReceivables = Double.parseDouble(longTermReceivables_str.replace(",", ""));
    	}

    	String longTermEquityInvestment_str=request.getParameter("longTermEquityInvestment");
    	double longTermEquityInvestment;
    	if (longTermEquityInvestment_str == null || longTermEquityInvestment_str.isEmpty()) {
    		longTermEquityInvestment = 0.00;
    	} else {
    		longTermEquityInvestment = Double.parseDouble(longTermEquityInvestment_str.replace(",", ""));
    	}

    	String otherEquityInstrumentInvestments_str=request.getParameter("otherEquityInstrumentInvestments");
    	double otherEquityInstrumentInvestments;
    	if (otherEquityInstrumentInvestments_str == null || otherEquityInstrumentInvestments_str.isEmpty()) {
    		otherEquityInstrumentInvestments = 0.00;
    	} else {
    		otherEquityInstrumentInvestments = Double.parseDouble(otherEquityInstrumentInvestments_str.replace(",", ""));
    	}

    	String otherNonCurrentFinancialAssets_str=request.getParameter("otherNonCurrentFinancialAssets");
    	double otherNonCurrentFinancialAssets;
    	if (otherNonCurrentFinancialAssets_str == null || otherNonCurrentFinancialAssets_str.isEmpty()) {
    		otherNonCurrentFinancialAssets = 0.00;
    	} else {
    		otherNonCurrentFinancialAssets = Double.parseDouble(otherNonCurrentFinancialAssets_str.replace(",", ""));
    	}

    	String investmentRealEstate_str=request.getParameter("investmentRealEstate");
    	double investmentRealEstate;
    	if (investmentRealEstate_str == null || investmentRealEstate_str.isEmpty()) {
    		investmentRealEstate = 0.00;
    	} else {
    		investmentRealEstate = Double.parseDouble(investmentRealEstate_str.replace(",", ""));
    	}

    	String fixedAssets_Str=request.getParameter("fixedAssets");
    	double fixedAssets;
    	if (fixedAssets_Str == null || fixedAssets_Str.isEmpty()) {
    		fixedAssets = 0.00;
    	} else {
    		fixedAssets = Double.parseDouble(fixedAssets_Str.replace(",", ""));
    	}

    	String constructionInProgress_str=request.getParameter("constructionInProgress");
    	double constructionInProgress;
    	if (constructionInProgress_str == null || constructionInProgress_str.isEmpty()) {
    		constructionInProgress = 0.00;
    	} else {
    		constructionInProgress = Double.parseDouble(constructionInProgress_str.replace(",", ""));
    	}
    	
    	String productiveBiologicalAssets_str=request.getParameter("productiveBiologicalAssets");
    	double productiveBiologicalAssets;
    	if (productiveBiologicalAssets_str == null || productiveBiologicalAssets_str.isEmpty()) {
    		productiveBiologicalAssets = 0.00;
    	} else {
    		productiveBiologicalAssets = Double.parseDouble(productiveBiologicalAssets_str.replace(",", ""));
    	}
    	
    	String oilAndGasAssets_str=request.getParameter("oilAndGasAssets");
    	double oilAndGasAssets;
    	if (oilAndGasAssets_str == null || oilAndGasAssets_str.isEmpty()) {
    		oilAndGasAssets = 0.00;
    	} else {
    		oilAndGasAssets = Double.parseDouble(oilAndGasAssets_str.replace(",", ""));
    	}

    	String rightOfUseAssets_str=request.getParameter("rightOfUseAssets");
    	double rightOfUseAssets;
    	if (rightOfUseAssets_str == null || rightOfUseAssets_str.isEmpty()) {
    		rightOfUseAssets = 0.00;
    	} else {
    		rightOfUseAssets = Double.parseDouble(rightOfUseAssets_str.replace(",", ""));
    	}
    	
    	String intangibleAssets_str=request.getParameter("intangibleAssets");
    	double intangibleAssets;
    	if (intangibleAssets_str == null || intangibleAssets_str.isEmpty()) {
    		intangibleAssets = 0.00;
    	} else {
    		intangibleAssets = Double.parseDouble(intangibleAssets_str.replace(",", ""));
    	}

    	String developmentExpenditure_str=request.getParameter("developmentExpenditure");
    	double developmentExpenditure;
    	if (developmentExpenditure_str == null || developmentExpenditure_str.isEmpty()) {
    		developmentExpenditure = 0.00;
    	} else {
    		developmentExpenditure = Double.parseDouble(developmentExpenditure_str.replace(",", ""));
    	}

    	String goodwill_str=request.getParameter("goodwill");
    	double goodwill;
    	if (goodwill_str == null || goodwill_str.isEmpty()) {
    		goodwill = 0.00;
    	} else {
    		goodwill = Double.parseDouble(goodwill_str.replace(",", ""));
    	}

    	String longTermDeferredExpense_str=request.getParameter("longTermDeferredExpense");
    	double longTermDeferredExpense;
    	if (longTermDeferredExpense_str == null || longTermDeferredExpense_str.isEmpty()) {
    		longTermDeferredExpense = 0.00;
    	} else {
    		longTermDeferredExpense = Double.parseDouble(longTermDeferredExpense_str.replace(",", ""));
    	}

    	String deferredTaxAssets_str=request.getParameter("deferredTaxAssets");
    	double deferredTaxAssets;
    	if (deferredTaxAssets_str == null || deferredTaxAssets_str.isEmpty()) {
    		deferredTaxAssets = 0.00;
    	} else {
    		deferredTaxAssets = Double.parseDouble(deferredTaxAssets_str.replace(",", ""));
    	}

    	String otherNonCurrentAssets_str=request.getParameter("otherNonCurrentAssets");
    	double otherNonCurrentAssets;
    	if (otherNonCurrentAssets_str == null || otherNonCurrentAssets_str.isEmpty()) {
    		otherNonCurrentAssets = 0.00;
    	} else {
    		otherNonCurrentAssets = Double.parseDouble(otherNonCurrentAssets_str.replace(",", ""));
    	}

    	String totalNonCurrentAssets_str=request.getParameter("totalNonCurrentAssets");
    	double totalNonCurrentAssets;
    	if (totalNonCurrentAssets_str == null || totalNonCurrentAssets_str.isEmpty()) {
    		totalNonCurrentAssets = 0.00;
    	} else {
    		totalNonCurrentAssets = Double.parseDouble(totalNonCurrentAssets_str.replace(",", ""));
    	}

    	String totalAssets_str=request.getParameter("totalAssets");
    	double totalAssets;
    	if (totalAssets_str == null || totalAssets_str.isEmpty()) {
    		totalAssets = 0.00;
    	} else {
    		totalAssets = Double.parseDouble(totalAssets_str.replace(",", ""));
    	}

    	String longTermEquityInvestmentsUnrelatedToMainBusiness_str=request.getParameter("longTermEquityInvestmentsUnrelatedToMainBusiness");
    	double longTermEquityInvestmentsUnrelatedToMainBusiness;
    	if (longTermEquityInvestmentsUnrelatedToMainBusiness_str == null || longTermEquityInvestmentsUnrelatedToMainBusiness_str.isEmpty()) {
    		longTermEquityInvestmentsUnrelatedToMainBusiness = 0.00;
    	} else {
    		longTermEquityInvestmentsUnrelatedToMainBusiness = Double.parseDouble(longTermEquityInvestmentsUnrelatedToMainBusiness_str.replace(",", ""));
    	}

    	String incomeFromLongTermEquityInvestments_str=request.getParameter("incomeFromLongTermEquityInvestments");
    	double incomeFromLongTermEquityInvestments;
    	if (incomeFromLongTermEquityInvestments_str == null || incomeFromLongTermEquityInvestments_str.isEmpty()) {
    		incomeFromLongTermEquityInvestments = 0.00;
    	} else {
    		incomeFromLongTermEquityInvestments = Double.parseDouble(incomeFromLongTermEquityInvestments_str.replace(",", ""));
    	}

    	String shortTermBorrowing_str=request.getParameter("shortTermBorrowing");
    	double shortTermBorrowing;
    	if (shortTermBorrowing_str == null || shortTermBorrowing_str.isEmpty()) {
    		shortTermBorrowing = 0.00;
    	} else {
    		shortTermBorrowing = Double.parseDouble(shortTermBorrowing_str.replace(",", ""));
    	}

    	String borrowingFromTheCentralBank_str=request.getParameter("borrowingFromTheCentralBank");
    	double borrowingFromTheCentralBank;
    	if (borrowingFromTheCentralBank_str == null || borrowingFromTheCentralBank_str.isEmpty()) {
    		borrowingFromTheCentralBank = 0.00;
    	} else {
    		borrowingFromTheCentralBank = Double.parseDouble(borrowingFromTheCentralBank_str.replace(",", ""));
    	}

    	String borrowingFunds_str=request.getParameter("borrowingFunds");
    	double borrowingFunds;
    	if (borrowingFunds_str == null || borrowingFunds_str.isEmpty()) {
    		borrowingFunds = 0.00;
    	} else {
    		borrowingFunds = Double.parseDouble(borrowingFunds_str.replace(",", ""));
    	}

    	String tradingFinancialLiabilities_str=request.getParameter("tradingFinancialLiabilities");
    	double tradingFinancialLiabilities;
    	if (tradingFinancialLiabilities_str == null || tradingFinancialLiabilities_str.isEmpty()) {
    		tradingFinancialLiabilities = 0.00;
    	} else {
    		tradingFinancialLiabilities = Double.parseDouble(tradingFinancialLiabilities_str.replace(",", ""));
    	}

    	String derivativeFinancialLiabilities_str=request.getParameter("derivativeFinancialLiabilities");
    	double derivativeFinancialLiabilities;
    	if (derivativeFinancialLiabilities_str == null || derivativeFinancialLiabilities_str.isEmpty()) {
    		derivativeFinancialLiabilities = 0.00;
    	} else {
    		derivativeFinancialLiabilities = Double.parseDouble(derivativeFinancialLiabilities_str.replace(",", ""));
    	}

    	String notesPayable_str=request.getParameter("notesPayable");
    	double notesPayable;
    	if (notesPayable_str == null || notesPayable_str.isEmpty()) {
    		notesPayable = 0.00;
    	} else {
    		notesPayable = Double.parseDouble(notesPayable_str.replace(",", ""));
    	}

    	String accountsPayable_str=request.getParameter("accountsPayable");
    	double accountsPayable;
    	if (accountsPayable_str == null || accountsPayable_str.isEmpty()) {
    		accountsPayable = 0.00;
    	} else {
    		accountsPayable = Double.parseDouble(accountsPayable_str.replace(",", ""));
    	}

    	String advanceReceipts_str=request.getParameter("advanceReceipts");
    	double advanceReceipts;
    	if (advanceReceipts_str == null || advanceReceipts_str.isEmpty()) {
    		advanceReceipts = 0.00;
    	} else {
    		advanceReceipts = Double.parseDouble(advanceReceipts_str.replace(",", ""));
    	}

    	String contractLiabilities_str=request.getParameter("contractLiabilities");
    	double contractLiabilities;
    	if (contractLiabilities_str == null || contractLiabilities_str.isEmpty()) {
    		contractLiabilities = 0.00;
    	} else {
    		contractLiabilities = Double.parseDouble(contractLiabilities_str.replace(",", ""));
    	}

    	String financialAssetsSoldForRepurchase_str=request.getParameter("financialAssetsSoldForRepurchase");
    	double financialAssetsSoldForRepurchase;
    	if (financialAssetsSoldForRepurchase_str == null || financialAssetsSoldForRepurchase_str.isEmpty()) {
    		financialAssetsSoldForRepurchase = 0.00;
    	} else {
    		financialAssetsSoldForRepurchase = Double.parseDouble(financialAssetsSoldForRepurchase_str.replace(",", ""));
    	}

    	String depositAbsorptionAndInterbankDeposits_str=request.getParameter("depositAbsorptionAndInterbankDeposits");
    	double depositAbsorptionAndInterbankDeposits;
    	if (depositAbsorptionAndInterbankDeposits_str == null || depositAbsorptionAndInterbankDeposits_str.isEmpty()) {
    		depositAbsorptionAndInterbankDeposits = 0.00;
    	} else {
    		depositAbsorptionAndInterbankDeposits = Double.parseDouble(depositAbsorptionAndInterbankDeposits_str.replace(",", ""));
    	}

    	String actingTradingSecurities_str=request.getParameter("actingTradingSecurities");
    	double actingTradingSecurities;
    	if (actingTradingSecurities_str == null || actingTradingSecurities_str.isEmpty()) {
    		actingTradingSecurities = 0.00;
    	} else {
    		actingTradingSecurities = Double.parseDouble(actingTradingSecurities_str.replace(",", ""));
    	}

    	String actingUnderwritingSecurities_str=request.getParameter("actingUnderwritingSecurities");
    	double actingUnderwritingSecurities;
    	if (actingUnderwritingSecurities_str == null || actingUnderwritingSecurities_str.isEmpty()) {
    		actingUnderwritingSecurities = 0.00;
    	} else {
    		actingUnderwritingSecurities = Double.parseDouble(actingUnderwritingSecurities_str.replace(",", ""));
    	}

    	String payrollPayable_str=request.getParameter("payrollPayable");
    	double payrollPayable;
    	if (payrollPayable_str == null || payrollPayable_str.isEmpty()) {
    		payrollPayable = 0.00;
    	} else {
    		payrollPayable = Double.parseDouble(payrollPayable_str.replace(",", ""));
    	}

    	String totalNumberOfPeople_str=request.getParameter("totalNumberOfPeople");
    	int totalNumberOfPeople = 0;
    	if (totalNumberOfPeople_str == null || totalNumberOfPeople_str.isEmpty()) {
    		totalNumberOfPeople = 0;
    	} else {
    		totalNumberOfPeople = Integer.parseInt(totalNumberOfPeople_str.replace(",", ""));
    	}

    	String taxPayable_str=request.getParameter("taxPayable");
    	double taxPayable;
    	if (taxPayable_str == null || taxPayable_str.isEmpty()) {
    		taxPayable = 0.00;
    	} else {
    		taxPayable = Double.parseDouble(taxPayable_str.replace(",", ""));
    	}
    	
    	String otherPayables_str=request.getParameter("otherPayables");
    	double otherPayables;
    	if (otherPayables_str == null || otherPayables_str.isEmpty()) {
    		otherPayables = 0.00;
    	} else {
    		otherPayables = Double.parseDouble(otherPayables_str.replace(",", ""));
    	}

    	String interestPayable_str=request.getParameter("interestPayable");
    	double interestPayable;
    	if (interestPayable_str == null || interestPayable_str.isEmpty()) {
    		interestPayable = 0.00;
    	} else {
    		interestPayable = Double.parseDouble(interestPayable_str.replace(",", ""));
    	}

    	String dividendPayable_str=request.getParameter("dividendPayable");
    	double dividendPayable;
    	if (dividendPayable_str == null || dividendPayable_str.isEmpty()) {
    		dividendPayable = 0.00;
    	} else {
    		dividendPayable = Double.parseDouble(dividendPayable_str.replace(",", ""));
    	}
    	
    	String payableHandlingFeesAndCommissions_str=request.getParameter("payableHandlingFeesAndCommissions");
    	double payableHandlingFeesAndCommissions;
    	if (payableHandlingFeesAndCommissions_str == null || payableHandlingFeesAndCommissions_str.isEmpty()) {
    		payableHandlingFeesAndCommissions = 0.00;
    	} else {
    		payableHandlingFeesAndCommissions = Double.parseDouble(payableHandlingFeesAndCommissions_str.replace(",", ""));
    	}

    	String accountsPayableReinsurance_str=request.getParameter("accountsPayableReinsurance");
    	double accountsPayableReinsurance;
    	if (accountsPayableReinsurance_str == null || accountsPayableReinsurance_str.isEmpty()) {
    		accountsPayableReinsurance = 0.00;
    	} else {
    		accountsPayableReinsurance = Double.parseDouble(accountsPayableReinsurance_str.replace(",", ""));
    	}

    	String heldForSaleLiabilities_str=request.getParameter("heldForSaleLiabilities");
    	double heldForSaleLiabilities;
    	if (heldForSaleLiabilities_str == null || heldForSaleLiabilities_str.isEmpty()) {
    		heldForSaleLiabilities = 0.00;
    	} else {
    		heldForSaleLiabilities = Double.parseDouble(heldForSaleLiabilities_str.replace(",", ""));
    	}

    	String nonCurrentLiabilitiesDueWithinOneYear_str=request.getParameter("nonCurrentLiabilitiesDueWithinOneYear");
    	double nonCurrentLiabilitiesDueWithinOneYear;
    	if (nonCurrentLiabilitiesDueWithinOneYear_str == null || nonCurrentLiabilitiesDueWithinOneYear_str.isEmpty()) {
    		nonCurrentLiabilitiesDueWithinOneYear = 0.00;
    	} else {
    		nonCurrentLiabilitiesDueWithinOneYear = Double.parseDouble(nonCurrentLiabilitiesDueWithinOneYear_str.replace(",", ""));
    	}

    	String otherCurrentLiabilities_str=request.getParameter("otherCurrentLiabilities");
    	double otherCurrentLiabilities;
    	if (otherCurrentLiabilities_str == null || otherCurrentLiabilities_str.isEmpty()) {
    		otherCurrentLiabilities = 0.00;
    	} else {
    		otherCurrentLiabilities = Double.parseDouble(otherCurrentLiabilities_str.replace(",", ""));
    	}

    	String totalCurrentLiabilities_str=request.getParameter("totalCurrentLiabilities");
    	double totalCurrentLiabilities;
    	if (totalCurrentLiabilities_str == null || totalCurrentLiabilities_str.isEmpty()) {
    		totalCurrentLiabilities = 0.00;
    	} else {
    		totalCurrentLiabilities = Double.parseDouble(totalCurrentLiabilities_str.replace(",", ""));
    	}

    	String insuranceContractReserves_str=request.getParameter("insuranceContractReserves");
    	double insuranceContractReserves;
    	if (insuranceContractReserves_str == null || insuranceContractReserves_str.isEmpty()) {
    		insuranceContractReserves = 0.00;
    	} else {
    		insuranceContractReserves = Double.parseDouble(insuranceContractReserves_str.replace(",", ""));
    	}

    	String longTermLoan_str=request.getParameter("longTermLoan");
    	double longTermLoan;
    	if (longTermLoan_str == null || longTermLoan_str.isEmpty()) {
    		longTermLoan = 0.00;
    	} else {
    		longTermLoan = Double.parseDouble(longTermLoan_str.replace(",", ""));
    	}

    	String bondsPayable_str=request.getParameter("bondsPayable");
    	double bondsPayable;
    	if (bondsPayable_str == null || bondsPayable_str.isEmpty()) {
    		bondsPayable = 0.00;
    	} else {
    		bondsPayable = Double.parseDouble(bondsPayable_str.replace(",", ""));
    	}

    	String bondsPayablepreferredShares_str=request.getParameter("bondsPayablepreferredShares");
    	double bondsPayablepreferredShares;
    	if (bondsPayablepreferredShares_str == null || bondsPayablepreferredShares_str.isEmpty()) {
    		bondsPayablepreferredShares = 0.00;
    	} else {
    		bondsPayablepreferredShares = Double.parseDouble(bondsPayablepreferredShares_str.replace(",", ""));
    	}

    	String bondsPayableperpetualCapitalSecurities_str=request.getParameter("bondsPayableperpetualCapitalSecurities");
    	double bondsPayableperpetualCapitalSecurities;
    	if (bondsPayableperpetualCapitalSecurities_str == null || bondsPayableperpetualCapitalSecurities_str.isEmpty()) {
    		bondsPayableperpetualCapitalSecurities = 0.00;
    	} else {
    		bondsPayableperpetualCapitalSecurities = Double.parseDouble(bondsPayableperpetualCapitalSecurities_str.replace(",", ""));
    	}

    	String leaseLiabilities_str=request.getParameter("leaseLiabilities");
    	double leaseLiabilities;
    	if (leaseLiabilities_str == null || leaseLiabilities_str.isEmpty()) {
    		leaseLiabilities = 0.00;
    	} else {
    		leaseLiabilities = Double.parseDouble(leaseLiabilities_str.replace(",", ""));
    	}

    	String longTermPayables_str=request.getParameter("longTermPayables");
    	double longTermPayables;
    	if (longTermPayables_str == null || longTermPayables_str.isEmpty()) {
    		longTermPayables = 0.00;
    	} else {
    		longTermPayables = Double.parseDouble(longTermPayables_str.replace(",", ""));
    	}

    	String longTermEmployeeCompensationPayable_str=request.getParameter("longTermEmployeeCompensationPayable");
    	double longTermEmployeeCompensationPayable;
    	if (longTermEmployeeCompensationPayable_str == null || longTermEmployeeCompensationPayable_str.isEmpty()) {
    		longTermEmployeeCompensationPayable = 0.00;
    	} else {
    		longTermEmployeeCompensationPayable = Double.parseDouble(longTermEmployeeCompensationPayable_str.replace(",", ""));
    	}

    	String estimatedLiabilities_str=request.getParameter("estimatedLiabilities");
    	double estimatedLiabilities;
    	if (estimatedLiabilities_str == null || estimatedLiabilities_str.isEmpty()) {
    		estimatedLiabilities = 0.00;
    	} else {
    		estimatedLiabilities = Double.parseDouble(estimatedLiabilities_str.replace(",", ""));
    	}

    	String deferredIncome_str=request.getParameter("deferredIncome");
    	double deferredIncome;
    	if (deferredIncome_str == null || deferredIncome_str.isEmpty()) {
    		deferredIncome = 0.00;
    	} else {
    		deferredIncome = Double.parseDouble(deferredIncome_str.replace(",", ""));
    	}

    	String deferredIncomeTaxes_str=request.getParameter("deferredIncomeTaxes");
    	double deferredIncomeTaxes;
    	if (deferredIncomeTaxes_str == null || deferredIncomeTaxes_str.isEmpty()) {
    		deferredIncomeTaxes = 0.00;
    	} else {
    		deferredIncomeTaxes = Double.parseDouble(deferredIncomeTaxes_str.replace(",", ""));
    	}

    	String otherNonCurrentLiabilities_str=request.getParameter("otherNonCurrentLiabilities");
    	double otherNonCurrentLiabilities;
    	if (otherNonCurrentLiabilities_str == null || otherNonCurrentLiabilities_str.isEmpty()) {
    		otherNonCurrentLiabilities = 0.00;
    	} else {
    		otherNonCurrentLiabilities = Double.parseDouble(otherNonCurrentLiabilities_str.replace(",", ""));
    	}

    	String totalNonCurrentLiabilities_str=request.getParameter("totalNonCurrentLiabilities");
    	double totalNonCurrentLiabilities;
    	if (totalNonCurrentLiabilities_str == null || totalNonCurrentLiabilities_str.isEmpty()) {
    		totalNonCurrentLiabilities = 0.00;
    	} else {
    		totalNonCurrentLiabilities = Double.parseDouble(totalNonCurrentLiabilities_str.replace(",", ""));
    	}

    	String totalLiabilities_str=request.getParameter("totalLiabilities");
    	double totalLiabilities;
    	if (totalLiabilities_str == null || totalLiabilities_str.isEmpty()) {
    		totalLiabilities = 0.00;
    	} else {
    		totalLiabilities = Double.parseDouble(totalLiabilities_str.replace(",", ""));
    	}

    	String equity_str=request.getParameter("equity");
    	double equity;
    	if (equity_str == null || equity_str.isEmpty()) {
    		equity = 0.00;
    	} else {
    		equity = Double.parseDouble(equity_str.replace(",", ""));
    	}

    	String otherEquityInstruments_str=request.getParameter("otherEquityInstruments");
    	double otherEquityInstruments;
    	if (otherEquityInstruments_str == null || otherEquityInstruments_str.isEmpty()) {
    		otherEquityInstruments = 0.00;
    	} else {
    		otherEquityInstruments = Double.parseDouble(otherEquityInstruments_str.replace(",", ""));
    	}

    	String otherEquityInstrumentspreferredShares_str=request.getParameter("otherEquityInstrumentspreferredShares");
    	double otherEquityInstrumentspreferredShares;
    	if (otherEquityInstrumentspreferredShares_str == null || otherEquityInstrumentspreferredShares_str.isEmpty()) {
    		otherEquityInstrumentspreferredShares = 0.00;
    	} else {
    		otherEquityInstrumentspreferredShares = Double.parseDouble(otherEquityInstrumentspreferredShares_str.replace(",", ""));
    	}

    	String otherEquityInstrumentspetualCapitalSecurities_str=request.getParameter("otherEquityInstrumentspetualCapitalSecurities");
    	double otherEquityInstrumentspetualCapitalSecurities;
    	if (otherEquityInstrumentspetualCapitalSecurities_str == null || otherEquityInstrumentspetualCapitalSecurities_str.isEmpty()) {
    		otherEquityInstrumentspetualCapitalSecurities = 0.00;
    	} else {
    		otherEquityInstrumentspetualCapitalSecurities = Double.parseDouble(otherEquityInstrumentspetualCapitalSecurities_str.replace(",", ""));
    	}

    	String capitalReserve_str=request.getParameter("capitalReserve");
    	double capitalReserve;
    	if (capitalReserve_str == null || capitalReserve_str.isEmpty()) {
    		capitalReserve = 0.00;
    	} else {
    		capitalReserve = Double.parseDouble(capitalReserve_str.replace(",", ""));
    	}

    	String treasuryStock_str=request.getParameter("treasuryStock");
    	double treasuryStock;
    	if (treasuryStock_str == null || treasuryStock_str.isEmpty()) {
    		treasuryStock = 0.00;
    	} else {
    		treasuryStock = Double.parseDouble(treasuryStock_str.replace(",", ""));
    	}

    	String otherComprehensiveIncome_str=request.getParameter("otherComprehensiveIncome");
    	double otherComprehensiveIncome;
    	if (otherComprehensiveIncome_str == null || otherComprehensiveIncome_str.isEmpty()) {
    		otherComprehensiveIncome = 0.00;
    	} else {
    		otherComprehensiveIncome = Double.parseDouble(otherComprehensiveIncome_str.replace(",", ""));
    	}

    	String specialReserves_str=request.getParameter("specialReserves");
    	double specialReserves;
    	if (specialReserves_str == null || specialReserves_str.isEmpty()) {
    		specialReserves = 0.00;
    	} else {
    		specialReserves = Double.parseDouble(specialReserves_str.replace(",", ""));
    	}

    	String surplusReserves_str=request.getParameter("surplusReserves");
    	double surplusReserves;
    	if (surplusReserves_str == null || surplusReserves_str.isEmpty()) {
    		surplusReserves = 0.00;
    	} else {
    		surplusReserves = Double.parseDouble(surplusReserves_str.replace(",", ""));
    	}

    	String generalRiskProvisions_str=request.getParameter("generalRiskProvisions");
    	double generalRiskProvisions;
    	if (generalRiskProvisions_str == null || generalRiskProvisions_str.isEmpty()) {
    		generalRiskProvisions = 0.00;
    	} else {
    		generalRiskProvisions = Double.parseDouble(generalRiskProvisions_str.replace(",", ""));
    	}

    	String undistributedProfit_str=request.getParameter("undistributedProfit");
    	double undistributedProfit;
    	if (undistributedProfit_str == null || undistributedProfit_str.isEmpty()) {
    		undistributedProfit = 0.00;
    	} else {
    		undistributedProfit = Double.parseDouble(undistributedProfit_str.replace(",", ""));
    	}

    	String totalEquityAttributableOfParentCompany_str=request.getParameter("totalEquityAttributableOfParentCompany");
    	double totalEquityAttributableOfParentCompany;
    	if (totalEquityAttributableOfParentCompany_str == null || totalEquityAttributableOfParentCompany_str.isEmpty()) {
    		totalEquityAttributableOfParentCompany = 0.00;
    	} else {
    		totalEquityAttributableOfParentCompany = Double.parseDouble(totalEquityAttributableOfParentCompany_str.replace(",", ""));
    	}

    	String minorityInterest_str=request.getParameter("minorityInterest");
    	double minorityInterest;
    	if (minorityInterest_str == null || minorityInterest_str.isEmpty()) {
    		minorityInterest = 0.00;
    	} else {
    		minorityInterest = Double.parseDouble(minorityInterest_str.replace(",", ""));
    	}

    	String totalOwnersEquity_str=request.getParameter("totalOwnersEquity");
    	double totalOwnersEquity;
    	if (totalOwnersEquity_str == null || totalOwnersEquity_str.isEmpty()) {
    		totalOwnersEquity = 0.00;
    	} else {
    		totalOwnersEquity = Double.parseDouble(totalOwnersEquity_str.replace(",", ""));
    	}

    	String totalLiabilitiesAndOwnersEquity_str=request.getParameter("totalLiabilitiesAndOwnersEquity");
    	double totalLiabilitiesAndOwnersEquity;
    	if (totalLiabilitiesAndOwnersEquity_str == null || totalLiabilitiesAndOwnersEquity_str.isEmpty()) {
    		totalLiabilitiesAndOwnersEquity = 0.00;
    	} else {
    		totalLiabilitiesAndOwnersEquity = Double.parseDouble(totalLiabilitiesAndOwnersEquity_str.replace(",", ""));
    	}

    	String createTime=CreateTime.createtime();
    	String updateTime=CreateTime.createtime();
    	
    	bs.setFinancialReportingNo(financialReportingNo);
        bs.setMonetaryCapital(monetaryCapital);
        bs.setSettlementProvisions(settlementProvisions);
        bs.setLendingFunds(lendingFunds);
        bs.setTradingFinancialAssets(tradingFinancialAssets);
        bs.setTradingFinancialAssetsManagement(tradingFinancialAssetsManagement);
        bs.setDerivativeFinancialAssets(derivativeFinancialAssets);
        bs.setBillReceivable(billReceivable);
        bs.setAccountsReceivable(accountsReceivable);
        bs.setAccountsReceivableFinancing(accountsReceivableFinancing);
        bs.setPrepayments(prepayments);
        bs.setPremiumReceivable(premiumReceivable);
        bs.setAccountsReceivableReinsurance(accountsReceivableReinsurance);
        bs.setReceivableReserveForReinsuranceContracts(receivableReserveForReinsuranceContracts);
        bs.setOtherReceivables(otherReceivables);
        bs.setInterestReceivable(interestReceivable);
        bs.setDividendReceivable(dividendReceivable);
        bs.setBuyingBackFinancialAssets(buyingBackFinancialAssets);
        bs.setInventory(inventory);
        bs.setContractAssets(contractAssets);
        bs.setAssetsHeldForSale(assetsHeldForSale);
        bs.setNonCurrentAssetsDueWithinOneYear(nonCurrentAssetsDueWithinOneYear);
        bs.setOtherCurrentAssets(otherCurrentAssets);
        bs.setOtherCurrentAssetsManagement(otherCurrentAssetsManagement);
        bs.setTotalCurrentAssets(totalCurrentAssets);
        bs.setGrantingLoansAndAdvances(grantingLoansAndAdvances);
        bs.setDebtInvestment(debtInvestment);
        bs.setOtherDebtInvestment(otherDebtInvestment);
        bs.setLongTermReceivables(longTermReceivables);
        bs.setLongTermEquityInvestment(longTermEquityInvestment);
        bs.setOtherEquityInstrumentInvestments(otherEquityInstrumentInvestments);
        bs.setOtherNonCurrentFinancialAssets(otherNonCurrentFinancialAssets);
        bs.setInvestmentRealEstate(investmentRealEstate);
        bs.setFixedAssets(fixedAssets);
        bs.setConstructionInProgress(constructionInProgress);
        bs.setProductiveBiologicalAssets(productiveBiologicalAssets);
        bs.setOilAndGasAssets(oilAndGasAssets);
        bs.setRightOfUseAssets(rightOfUseAssets);
        bs.setIntangibleAssets(intangibleAssets);
        bs.setDevelopmentExpenditure(developmentExpenditure);
        bs.setGoodwill(goodwill);
        bs.setLongTermDeferredExpense(longTermDeferredExpense);
        bs.setDeferredTaxAssets(deferredTaxAssets);
        bs.setOtherNonCurrentAssets(otherNonCurrentAssets);
        bs.setTotalNonCurrentAssets(totalNonCurrentAssets);
        bs.setTotalAssets(totalAssets);
        bs.setLongTermEquityInvestmentsUnrelatedToMainBusiness(longTermEquityInvestmentsUnrelatedToMainBusiness);
        bs.setIncomeFromLongTermEquityInvestments(incomeFromLongTermEquityInvestments);
        bs.setShortTermBorrowing(shortTermBorrowing);
        bs.setBorrowingFromTheCentralBank(borrowingFromTheCentralBank);
        bs.setBorrowingFunds(borrowingFunds);
        bs.setTradingFinancialLiabilities(tradingFinancialLiabilities);
        bs.setDerivativeFinancialLiabilities(derivativeFinancialLiabilities);
        bs.setNotesPayable(notesPayable);
        bs.setAccountsPayable(accountsPayable);
        bs.setAdvanceReceipts(advanceReceipts);
        bs.setContractLiabilities(contractLiabilities);
        bs.setFinancialAssetsSoldForRepurchase(financialAssetsSoldForRepurchase);
        bs.setDepositAbsorptionAndInterbankDeposits(depositAbsorptionAndInterbankDeposits);
        bs.setActingTradingSecurities(actingTradingSecurities);
        bs.setActingUnderwritingSecurities(actingUnderwritingSecurities);
        bs.setPayrollPayable(payrollPayable);
        bs.setTotalNumberOfPeople(totalNumberOfPeople);
        bs.setTaxPayable(taxPayable);
        bs.setOtherPayables(otherPayables);
        bs.setInterestPayable(interestPayable);
        bs.setDividendPayable(dividendPayable);
        bs.setPayableHandlingFeesAndCommissions(payableHandlingFeesAndCommissions);
        bs.setAccountsPayableReinsurance(accountsPayableReinsurance);
        bs.setHeldForSaleLiabilities(heldForSaleLiabilities);
        bs.setNonCurrentLiabilitiesDueWithinOneYear(nonCurrentLiabilitiesDueWithinOneYear);
        bs.setOtherCurrentLiabilities(otherCurrentLiabilities);
        bs.setTotalCurrentLiabilities(totalCurrentLiabilities);
        bs.setInsuranceContractReserves(insuranceContractReserves);
        bs.setLongTermLoan(longTermLoan);
        bs.setBondsPayable(bondsPayable);
        bs.setBondsPayablepreferredShares(bondsPayablepreferredShares);
        bs.setBondsPayableperpetualCapitalSecurities(bondsPayableperpetualCapitalSecurities);
        bs.setLeaseLiabilities(leaseLiabilities);
        bs.setLongTermPayables(longTermPayables);
        bs.setLongTermEmployeeCompensationPayable(longTermEmployeeCompensationPayable);
        bs.setEstimatedLiabilities(estimatedLiabilities);
        bs.setDeferredIncome(deferredIncome);
        bs.setDeferredIncomeTaxes(deferredIncomeTaxes);
        bs.setOtherNonCurrentLiabilities(otherNonCurrentLiabilities);
        bs.setTotalNonCurrentLiabilities(totalNonCurrentLiabilities);
        bs.setTotalLiabilities(totalLiabilities);
        bs.setEquity(equity);
        bs.setOtherEquityInstruments(otherEquityInstruments);
        bs.setOtherEquityInstrumentspreferredShares(otherEquityInstrumentspreferredShares);
        bs.setOtherEquityInstrumentspetualCapitalSecurities(otherEquityInstrumentspetualCapitalSecurities);
        bs.setCapitalReserve(capitalReserve);
        bs.setTreasuryStock(treasuryStock);
        bs.setOtherComprehensiveIncome(otherComprehensiveIncome);
        bs.setSpecialReserves(specialReserves);
        bs.setSurplusReserves(surplusReserves);
        bs.setGeneralRiskProvisions(generalRiskProvisions);
        bs.setUndistributedProfit(undistributedProfit);
        bs.setTotalEquityAttributableOfParentCompany(totalEquityAttributableOfParentCompany);
        bs.setMinorityInterest(minorityInterest);
        bs.setTotalOwnersEquity(totalOwnersEquity);
        bs.setTotalLiabilitiesAndOwnersEquity(totalLiabilitiesAndOwnersEquity);
        bs.setCreateDateTime(createTime);
        bs.setUpdateDateTime(updateTime);
    	
    	boolean updateResult = rdi.updateBalanceSheet(bs);
        if(updateResult) {
                // 修改成功，设置成功消息
                request.setAttribute("a", "修改成功!");
        } else {
                // 修改失败，设置失败消息
                request.setAttribute("a", "修改失败!");
        }
       
        
        RequestDispatcher dispatcher=request.getRequestDispatcher("financialReportEdit.jsp");
		dispatcher.forward(request, response);
        
	}

}
