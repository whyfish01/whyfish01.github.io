package analys.servlet.report;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import report.bean.entity.CashflowStatement;
import report.bean.daolmp.ReportDaoImp;
import report.bean.common.CreateTime;

public class EditCashflowStatement extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void init(ServletConfig config) throws ServletException{
		super.init(config);									
		}
	
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setCharacterEncoding("utf-8");
    	CashflowStatement cs=new CashflowStatement();
    	request.setAttribute("cs", cs);
    	ReportDaoImp rdi=new ReportDaoImp();
    	
    	//获取JSP页面信息
    	String financialReportingNo=request.getParameter("financialReportingNo");
    	System.out.print(financialReportingNo);
    	
    	String cashReceivedFromSellingGoodsAndProvidingServices_str = request.getParameter("cashReceivedFromSellingGoodsAndProvidingServices");
    	double cashReceivedFromSellingGoodsAndProvidingServices;
    	if (cashReceivedFromSellingGoodsAndProvidingServices_str == null || cashReceivedFromSellingGoodsAndProvidingServices_str.isEmpty()) {
    		cashReceivedFromSellingGoodsAndProvidingServices = 0.00;
    	} else {
    		cashReceivedFromSellingGoodsAndProvidingServices = Double.parseDouble(cashReceivedFromSellingGoodsAndProvidingServices_str.replace(",", ""));
    	}
    	
    	String netIncreaseInCustomerDepositsAndInterbankDeposits_str = request.getParameter("netIncreaseInCustomerDepositsAndInterbankDeposits");
    	double netIncreaseInCustomerDepositsAndInterbankDeposits;
    	if (netIncreaseInCustomerDepositsAndInterbankDeposits_str == null || netIncreaseInCustomerDepositsAndInterbankDeposits_str.isEmpty()) {
    		netIncreaseInCustomerDepositsAndInterbankDeposits = 0.00;
    	} else {
    		netIncreaseInCustomerDepositsAndInterbankDeposits = Double.parseDouble(netIncreaseInCustomerDepositsAndInterbankDeposits_str.replace(",", ""));
    	}
    	
    	String netIncreaseInBorrowingFromTheCentralBank_str = request.getParameter("netIncreaseInBorrowingFromTheCentralBank");
    	double netIncreaseInBorrowingFromTheCentralBank;
    	if (netIncreaseInBorrowingFromTheCentralBank_str == null || netIncreaseInBorrowingFromTheCentralBank_str.isEmpty()) {
    		netIncreaseInBorrowingFromTheCentralBank = 0.00;
    	} else {
    		netIncreaseInBorrowingFromTheCentralBank = Double.parseDouble(netIncreaseInBorrowingFromTheCentralBank_str.replace(",", ""));
    	}
    	
    	String netIncreaseInBorrowingFundsFromOtherFinancialInstitutions_str = request.getParameter("netIncreaseInBorrowingFundsFromOtherFinancialInstitutions");
    	double netIncreaseInBorrowingFundsFromOtherFinancialInstitutions;
    	if (netIncreaseInBorrowingFundsFromOtherFinancialInstitutions_str == null || netIncreaseInBorrowingFundsFromOtherFinancialInstitutions_str.isEmpty()) {
    		netIncreaseInBorrowingFundsFromOtherFinancialInstitutions = 0.00;
    	} else {
    		netIncreaseInBorrowingFundsFromOtherFinancialInstitutions = Double.parseDouble(netIncreaseInBorrowingFundsFromOtherFinancialInstitutions_str.replace(",", ""));
    	}
    	
    	String cashReceivedFromPremiumOfOriginalInsuranceContract_str = request.getParameter("cashReceivedFromPremiumOfOriginalInsuranceContract");
    	double cashReceivedFromPremiumOfOriginalInsuranceContract;
    	if (cashReceivedFromPremiumOfOriginalInsuranceContract_str == null || cashReceivedFromPremiumOfOriginalInsuranceContract_str.isEmpty()) {
    		cashReceivedFromPremiumOfOriginalInsuranceContract = 0.00;
    	} else {
    		cashReceivedFromPremiumOfOriginalInsuranceContract = Double.parseDouble(cashReceivedFromPremiumOfOriginalInsuranceContract_str.replace(",", ""));
    	}
    	
    	String receiptOfReinsuranceNetCash_str = request.getParameter("receiptOfReinsuranceNetCash");
    	double receiptOfReinsuranceNetCash;
    	if (receiptOfReinsuranceNetCash_str == null || receiptOfReinsuranceNetCash_str.isEmpty()) {
    		receiptOfReinsuranceNetCash = 0.00;
    	} else {
    		receiptOfReinsuranceNetCash = Double.parseDouble(receiptOfReinsuranceNetCash_str.replace(",", ""));
    	}
    	
    	String netIncreaseInDepositsFromPolicyholders_str = request.getParameter("netIncreaseInDepositsFromPolicyholders");
    	double netIncreaseInDepositsFromPolicyholders;
    	if (netIncreaseInDepositsFromPolicyholders_str == null || netIncreaseInDepositsFromPolicyholders_str.isEmpty()) {
    		netIncreaseInDepositsFromPolicyholders = 0.00;
    	} else {
    		netIncreaseInDepositsFromPolicyholders = Double.parseDouble(netIncreaseInDepositsFromPolicyholders_str.replace(",", ""));
    	}
    	
    	String cashChargeInterestFeesAndCommissions_str = request.getParameter("cashChargeInterestFeesAndCommissions");
    	double cashChargeInterestFeesAndCommissions;
    	if (cashChargeInterestFeesAndCommissions_str == null || cashChargeInterestFeesAndCommissions_str.isEmpty()) {
    		cashChargeInterestFeesAndCommissions = 0.00;
    	} else {
    		cashChargeInterestFeesAndCommissions = Double.parseDouble(cashChargeInterestFeesAndCommissions_str.replace(",", ""));
    	}
    	
    	String netIncreaseInBorrowedFunds_str = request.getParameter("netIncreaseInBorrowedFunds");
    	double netIncreaseInBorrowedFunds;
    	if (netIncreaseInBorrowedFunds_str == null || netIncreaseInBorrowedFunds_str.isEmpty()) {
    		netIncreaseInBorrowedFunds = 0.00;
    	} else {
    		netIncreaseInBorrowedFunds = Double.parseDouble(netIncreaseInBorrowedFunds_str.replace(",", ""));
    	}
    	
    	String netIncreaseInRepurchaseBusinessFunds_str = request.getParameter("netIncreaseInRepurchaseBusinessFunds");
    	double netIncreaseInRepurchaseBusinessFunds;
    	if (netIncreaseInRepurchaseBusinessFunds_str == null || netIncreaseInRepurchaseBusinessFunds_str.isEmpty()) {
    		netIncreaseInRepurchaseBusinessFunds = 0.00;
    	} else {
    		netIncreaseInRepurchaseBusinessFunds = Double.parseDouble(netIncreaseInRepurchaseBusinessFunds_str.replace(",", ""));
    	}
    	
    	String netCashReceivedFromProxyTradingOfSecurities_str = request.getParameter("netCashReceivedFromProxyTradingOfSecurities");
    	double netCashReceivedFromProxyTradingOfSecurities;
    	if (netCashReceivedFromProxyTradingOfSecurities_str == null || netCashReceivedFromProxyTradingOfSecurities_str.isEmpty()) {
    		netCashReceivedFromProxyTradingOfSecurities = 0.00;
    	} else {
    		netCashReceivedFromProxyTradingOfSecurities = Double.parseDouble(netCashReceivedFromProxyTradingOfSecurities_str.replace(",", ""));
    	}
    	
    	String refundsOfTaxes_str = request.getParameter("refundsOfTaxes");
    	double refundsOfTaxes;
    	if (refundsOfTaxes_str == null || refundsOfTaxes_str.isEmpty()) {
    		refundsOfTaxes = 0.00;
    	} else {
    		refundsOfTaxes = Double.parseDouble(refundsOfTaxes_str.replace(",", ""));
    	}
    	
    	String otherCashReceivedRelatingToOperatingActivities_str = request.getParameter("otherCashReceivedRelatingToOperatingActivities");
    	double otherCashReceivedRelatingToOperatingActivities;
    	if (otherCashReceivedRelatingToOperatingActivities_str == null || otherCashReceivedRelatingToOperatingActivities_str.isEmpty()) {
    		otherCashReceivedRelatingToOperatingActivities = 0.00;
    	} else {
    		otherCashReceivedRelatingToOperatingActivities = Double.parseDouble(otherCashReceivedRelatingToOperatingActivities_str.replace(",", ""));
    	}
    	
    	String businessActivitiesSubtotalOfCashInflows_str = request.getParameter("businessActivitiesSubtotalOfCashInflows");
    	double businessActivitiesSubtotalOfCashInflows;
    	if (businessActivitiesSubtotalOfCashInflows_str == null || businessActivitiesSubtotalOfCashInflows_str.isEmpty()) {
    		businessActivitiesSubtotalOfCashInflows = 0.00;
    	} else {
    		businessActivitiesSubtotalOfCashInflows = Double.parseDouble(businessActivitiesSubtotalOfCashInflows_str.replace(",", ""));
    	}
    	
    	String cashPaidForPurchasingGoodsAndReceivingServices_str = request.getParameter("cashPaidForPurchasingGoodsAndReceivingServices");
    	double cashPaidForPurchasingGoodsAndReceivingServices;
    	if (cashPaidForPurchasingGoodsAndReceivingServices_str == null || cashPaidForPurchasingGoodsAndReceivingServices_str.isEmpty()) {
    		cashPaidForPurchasingGoodsAndReceivingServices = 0.00;
    	} else {
    		cashPaidForPurchasingGoodsAndReceivingServices = Double.parseDouble(cashPaidForPurchasingGoodsAndReceivingServices_str.replace(",", ""));
    	}
    	
    	String netIncreaseInCustomerLoansAndAdvances_str = request.getParameter("netIncreaseInCustomerLoansAndAdvances");
    	double netIncreaseInCustomerLoansAndAdvances;
    	if (netIncreaseInCustomerLoansAndAdvances_str == null || netIncreaseInCustomerLoansAndAdvances_str.isEmpty()) {
    		netIncreaseInCustomerLoansAndAdvances = 0.00;
    	} else {
    		netIncreaseInCustomerLoansAndAdvances = Double.parseDouble(netIncreaseInCustomerLoansAndAdvances_str.replace(",", ""));
    	}
    	
    	String netIncreaseInDepositsWithCentralBanksAndInterbankFunds_str = request.getParameter("netIncreaseInDepositsWithCentralBanksAndInterbankFunds");
    	double netIncreaseInDepositsWithCentralBanksAndInterbankFunds;
    	if (netIncreaseInDepositsWithCentralBanksAndInterbankFunds_str == null || netIncreaseInDepositsWithCentralBanksAndInterbankFunds_str.isEmpty()) {
    		netIncreaseInDepositsWithCentralBanksAndInterbankFunds = 0.00;
    	} else {
    		netIncreaseInDepositsWithCentralBanksAndInterbankFunds = Double.parseDouble(netIncreaseInDepositsWithCentralBanksAndInterbankFunds_str.replace(",", ""));
    	}
    	
    	String paymentOfTheOriginalInsuranceContractToPayTheAmountOfCash_str = request.getParameter("paymentOfTheOriginalInsuranceContractToPayTheAmountOfCash");
    	double paymentOfTheOriginalInsuranceContractToPayTheAmountOfCash;
    	if (paymentOfTheOriginalInsuranceContractToPayTheAmountOfCash_str == null || paymentOfTheOriginalInsuranceContractToPayTheAmountOfCash_str.isEmpty()) {
    		paymentOfTheOriginalInsuranceContractToPayTheAmountOfCash = 0.00;
    	} else {
    		paymentOfTheOriginalInsuranceContractToPayTheAmountOfCash = Double.parseDouble(paymentOfTheOriginalInsuranceContractToPayTheAmountOfCash_str.replace(",", ""));
    	}
    	
    	String netIncreaseInLendingFunds_str = request.getParameter("netIncreaseInLendingFunds");
    	double netIncreaseInLendingFunds;
    	if (netIncreaseInLendingFunds_str == null || netIncreaseInLendingFunds_str.isEmpty()) {
    		netIncreaseInLendingFunds = 0.00;
    	} else {
    		netIncreaseInLendingFunds = Double.parseDouble(netIncreaseInLendingFunds_str.replace(",", ""));
    	}
    	
    	String cashPaidForInterestHandlingFeesAndCommissions_str = request.getParameter("cashPaidForInterestHandlingFeesAndCommissions");
    	double cashPaidForInterestHandlingFeesAndCommissions;
    	if (cashPaidForInterestHandlingFeesAndCommissions_str == null || cashPaidForInterestHandlingFeesAndCommissions_str.isEmpty()) {
    		cashPaidForInterestHandlingFeesAndCommissions = 0.00;
    	} else {
    		cashPaidForInterestHandlingFeesAndCommissions = Double.parseDouble(cashPaidForInterestHandlingFeesAndCommissions_str.replace(",", ""));
    	}
    	
    	String cashPaidForPolicyDividends_str = request.getParameter("cashPaidForPolicyDividends");
    	double cashPaidForPolicyDividends;
    	if (cashPaidForPolicyDividends_str == null || cashPaidForPolicyDividends_str.isEmpty()) {
    		cashPaidForPolicyDividends = 0.00;
    	} else {
    		cashPaidForPolicyDividends = Double.parseDouble(cashPaidForPolicyDividends_str.replace(",", ""));
    	}
    	
    	String cashPaidToAndOnBehalfOfEmployees_str = request.getParameter("cashPaidToAndOnBehalfOfEmployees");
    	double cashPaidToAndOnBehalfOfEmployees;
    	if (cashPaidToAndOnBehalfOfEmployees_str == null || cashPaidToAndOnBehalfOfEmployees_str.isEmpty()) {
    		cashPaidToAndOnBehalfOfEmployees = 0.00;
    	} else {
    		cashPaidToAndOnBehalfOfEmployees = Double.parseDouble(cashPaidToAndOnBehalfOfEmployees_str.replace(",", ""));
    	}
    	
    	String taxesPaid_str = request.getParameter("taxesPaid");
    	double taxesPaid;
    	if (taxesPaid_str == null || taxesPaid_str.isEmpty()) {
    		taxesPaid = 0.00;
    	} else {
    		taxesPaid = Double.parseDouble(taxesPaid_str.replace(",", ""));
    	}
    	
    	String paymentOfOtherCashRelatedToOperatingActivities_str = request.getParameter("paymentOfOtherCashRelatedToOperatingActivities");
    	double paymentOfOtherCashRelatedToOperatingActivities;
    	if (paymentOfOtherCashRelatedToOperatingActivities_str == null || paymentOfOtherCashRelatedToOperatingActivities_str.isEmpty()) {
    		paymentOfOtherCashRelatedToOperatingActivities = 0.00;
    	} else {
    		paymentOfOtherCashRelatedToOperatingActivities = Double.parseDouble(paymentOfOtherCashRelatedToOperatingActivities_str.replace(",", ""));
    	}
    	
    	String subtotalOfCashOutflowsFromOperatingActivities_str = request.getParameter("subtotalOfCashOutflowsFromOperatingActivities");
    	double subtotalOfCashOutflowsFromOperatingActivities;
    	if (subtotalOfCashOutflowsFromOperatingActivities_str == null || subtotalOfCashOutflowsFromOperatingActivities_str.isEmpty()) {
    		subtotalOfCashOutflowsFromOperatingActivities = 0.00;
    	} else {
    		subtotalOfCashOutflowsFromOperatingActivities = Double.parseDouble(subtotalOfCashOutflowsFromOperatingActivities_str.replace(",", ""));
    	}
    	
    	String netCashFlowFromOperating_str = request.getParameter("netCashFlowFromOperating");
    	double netCashFlowFromOperating;
    	if (netCashFlowFromOperating_str == null || netCashFlowFromOperating_str.isEmpty()) {
    		netCashFlowFromOperating = 0.00;
    	} else {
    		netCashFlowFromOperating = Double.parseDouble(netCashFlowFromOperating_str.replace(",", ""));
    	}
    	
    	String cashReceivedFromInvestmentRecovery_str = request.getParameter("cashReceivedFromInvestmentRecovery");
    	double cashReceivedFromInvestmentRecovery;
    	if (cashReceivedFromInvestmentRecovery_str == null || cashReceivedFromInvestmentRecovery_str.isEmpty()) {
    		cashReceivedFromInvestmentRecovery = 0.00;
    	} else {
    		cashReceivedFromInvestmentRecovery = Double.parseDouble(cashReceivedFromInvestmentRecovery_str.replace(",", ""));
    	}
    	
    	String cashReceivedFromObtainingInvestmentReturns_str = request.getParameter("cashReceivedFromObtainingInvestmentReturns");
    	double cashReceivedFromObtainingInvestmentReturns;
    	if (cashReceivedFromObtainingInvestmentReturns_str == null || cashReceivedFromObtainingInvestmentReturns_str.isEmpty()) {
    		cashReceivedFromObtainingInvestmentReturns = 0.00;
    	} else {
    		cashReceivedFromObtainingInvestmentReturns = Double.parseDouble(cashReceivedFromObtainingInvestmentReturns_str.replace(",", ""));
    	}
    	
    	String netCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssets_str = request.getParameter("netCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssets");
    	double netCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssets;
    	if (netCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssets_str == null || netCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssets_str.isEmpty()) {
    		netCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssets = 0.00;
    	} else {
    		netCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssets = Double.parseDouble(netCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssets_str.replace(",", ""));
    	}
    	
    	String netCashReceivedFromDisposalOfSubsidiariesAndOtherOperatingUnits_str = request.getParameter("netCashReceivedFromDisposalOfSubsidiariesAndOtherOperatingUnits");
    	double netCashReceivedFromDisposalOfSubsidiariesAndOtherOperatingUnits;
    	if (netCashReceivedFromDisposalOfSubsidiariesAndOtherOperatingUnits_str == null || netCashReceivedFromDisposalOfSubsidiariesAndOtherOperatingUnits_str.isEmpty()) {
    		netCashReceivedFromDisposalOfSubsidiariesAndOtherOperatingUnits = 0.00;
    	} else {
    		netCashReceivedFromDisposalOfSubsidiariesAndOtherOperatingUnits = Double.parseDouble(netCashReceivedFromDisposalOfSubsidiariesAndOtherOperatingUnits_str.replace(",", ""));
    	}
    	
    	String receivedOtherCashRelatedToInvestmentActivities_str = request.getParameter("receivedOtherCashRelatedToInvestmentActivities");
    	double receivedOtherCashRelatedToInvestmentActivities;
    	if (receivedOtherCashRelatedToInvestmentActivities_str == null || receivedOtherCashRelatedToInvestmentActivities_str.isEmpty()) {
    		receivedOtherCashRelatedToInvestmentActivities = 0.00;
    	} else {
    		receivedOtherCashRelatedToInvestmentActivities = Double.parseDouble(receivedOtherCashRelatedToInvestmentActivities_str.replace(",", ""));
    	}
    	
    	String subtotalOfCashInflowsFromInvestmentActivities_str = request.getParameter("subtotalOfCashInflowsFromInvestmentActivities");
    	double subtotalOfCashInflowsFromInvestmentActivities;
    	if (subtotalOfCashInflowsFromInvestmentActivities_str == null || subtotalOfCashInflowsFromInvestmentActivities_str.isEmpty()) {
    		subtotalOfCashInflowsFromInvestmentActivities = 0.00;
    	} else {
    		subtotalOfCashInflowsFromInvestmentActivities = Double.parseDouble(subtotalOfCashInflowsFromInvestmentActivities_str.replace(",", ""));
    	}
    	
    	String cashPaidForPurchaseConstructionFixedIntangibleLongTermAssets_str = request.getParameter("cashPaidForPurchaseConstructionFixedIntangibleLongTermAssets");
    	double cashPaidForPurchaseConstructionFixedIntangibleLongTermAssets;
    	if (cashPaidForPurchaseConstructionFixedIntangibleLongTermAssets_str == null || cashPaidForPurchaseConstructionFixedIntangibleLongTermAssets_str.isEmpty()) {
    		cashPaidForPurchaseConstructionFixedIntangibleLongTermAssets = 0.00;
    	} else {
    		cashPaidForPurchaseConstructionFixedIntangibleLongTermAssets = Double.parseDouble(cashPaidForPurchaseConstructionFixedIntangibleLongTermAssets_str.replace(",", ""));
    	}
    	
    	String cashPaidForInvestment_str = request.getParameter("cashPaidForInvestment");
    	double cashPaidForInvestment;
    	if (cashPaidForInvestment_str == null || cashPaidForInvestment_str.isEmpty()) {
    		cashPaidForInvestment = 0.00;
    	} else {
    		cashPaidForInvestment = Double.parseDouble(cashPaidForInvestment_str.replace(",", ""));
    	}
    	
    	String netIncreaseInPledgedLoans_str = request.getParameter("netIncreaseInPledgedLoans");
    	double netIncreaseInPledgedLoans;
    	if (netIncreaseInPledgedLoans_str == null || netIncreaseInPledgedLoans_str.isEmpty()) {
    		netIncreaseInPledgedLoans = 0.00;
    	} else {
    		netIncreaseInPledgedLoans = Double.parseDouble(netIncreaseInPledgedLoans_str.replace(",", ""));
    	}
    	
    	String netCashPaidToSubsidiariesAndOtherBusinessUnits_str = request.getParameter("netCashPaidToSubsidiariesAndOtherBusinessUnits");
    	double netCashPaidToSubsidiariesAndOtherBusinessUnits;
    	if (netCashPaidToSubsidiariesAndOtherBusinessUnits_str == null || netCashPaidToSubsidiariesAndOtherBusinessUnits_str.isEmpty()) {
    		netCashPaidToSubsidiariesAndOtherBusinessUnits = 0.00;
    	} else {
    		netCashPaidToSubsidiariesAndOtherBusinessUnits = Double.parseDouble(netCashPaidToSubsidiariesAndOtherBusinessUnits_str.replace(",", ""));
    	}
    	
    	String paymentOfOtherCashRelatedToInvestmentActivities_str = request.getParameter("paymentOfOtherCashRelatedToInvestmentActivities");
    	double paymentOfOtherCashRelatedToInvestmentActivities;
    	if (paymentOfOtherCashRelatedToInvestmentActivities_str == null || paymentOfOtherCashRelatedToInvestmentActivities_str.isEmpty()) {
    		paymentOfOtherCashRelatedToInvestmentActivities = 0.00;
    	} else {
    		paymentOfOtherCashRelatedToInvestmentActivities = Double.parseDouble(paymentOfOtherCashRelatedToInvestmentActivities_str.replace(",", ""));
    	}
    	
    	String subtotalOfCashOutflowsFromInvestmentActivities_str = request.getParameter("subtotalOfCashOutflowsFromInvestmentActivities");
    	double subtotalOfCashOutflowsFromInvestmentActivities;
    	if (subtotalOfCashOutflowsFromInvestmentActivities_str == null || subtotalOfCashOutflowsFromInvestmentActivities_str.isEmpty()) {
    		subtotalOfCashOutflowsFromInvestmentActivities = 0.00;
    	} else {
    		subtotalOfCashOutflowsFromInvestmentActivities = Double.parseDouble(subtotalOfCashOutflowsFromInvestmentActivities_str.replace(",", ""));
    	}
    	
    	String netCashFlowGeneratedFromInvestmentActivities_str = request.getParameter("netCashFlowGeneratedFromInvestmentActivities");
    	double netCashFlowGeneratedFromInvestmentActivities;
    	if (netCashFlowGeneratedFromInvestmentActivities_str == null || netCashFlowGeneratedFromInvestmentActivities_str.isEmpty()) {
    		netCashFlowGeneratedFromInvestmentActivities = 0.00;
    	} else {
    		netCashFlowGeneratedFromInvestmentActivities = Double.parseDouble(netCashFlowGeneratedFromInvestmentActivities_str.replace(",", ""));
    	}
    	
    	String cashReceivedFromAbsorbingInvestments_str = request.getParameter("cashReceivedFromAbsorbingInvestments");
    	double cashReceivedFromAbsorbingInvestments;
    	if (cashReceivedFromAbsorbingInvestments_str == null || cashReceivedFromAbsorbingInvestments_str.isEmpty()) {
    		cashReceivedFromAbsorbingInvestments = 0.00;
    	} else {
    		cashReceivedFromAbsorbingInvestments = Double.parseDouble(cashReceivedFromAbsorbingInvestments_str.replace(",", ""));
    	}
    	
    	String cashReceivedFromMinorityInvestmentInSubsidiaries_str = request.getParameter("cashReceivedFromMinorityInvestmentInSubsidiaries");
    	double cashReceivedFromMinorityInvestmentInSubsidiaries;
    	if (cashReceivedFromMinorityInvestmentInSubsidiaries_str == null || cashReceivedFromMinorityInvestmentInSubsidiaries_str.isEmpty()) {
    		cashReceivedFromMinorityInvestmentInSubsidiaries = 0.00;
    	} else {
    		cashReceivedFromMinorityInvestmentInSubsidiaries = Double.parseDouble(cashReceivedFromMinorityInvestmentInSubsidiaries_str.replace(",", ""));
    	}
    	
    	String cashReceivedFromObtainingLoans_str = request.getParameter("cashReceivedFromObtainingLoans");
    	double cashReceivedFromObtainingLoans;
    	if (cashReceivedFromObtainingLoans_str == null || cashReceivedFromObtainingLoans_str.isEmpty()) {
    		cashReceivedFromObtainingLoans = 0.00;
    	} else {
    		cashReceivedFromObtainingLoans = Double.parseDouble(cashReceivedFromObtainingLoans_str.replace(",", ""));
    	}
    	
    	String receivedOtherCashRelatedToFinancingActivities_str = request.getParameter("receivedOtherCashRelatedToFinancingActivities");
    	double receivedOtherCashRelatedToFinancingActivities;
    	if (receivedOtherCashRelatedToFinancingActivities_str == null || receivedOtherCashRelatedToFinancingActivities_str.isEmpty()) {
    		receivedOtherCashRelatedToFinancingActivities = 0.00;
    	} else {
    		receivedOtherCashRelatedToFinancingActivities = Double.parseDouble(receivedOtherCashRelatedToFinancingActivities_str.replace(",", ""));
    	}
    	
    	String subtotalOfCashInflowsFromFinancingActivities_str = request.getParameter("subtotalOfCashInflowsFromFinancingActivities");
    	double subtotalOfCashInflowsFromFinancingActivities;
    	if (subtotalOfCashInflowsFromFinancingActivities_str == null || subtotalOfCashInflowsFromFinancingActivities_str.isEmpty()) {
    		subtotalOfCashInflowsFromFinancingActivities = 0.00;
    	} else {
    		subtotalOfCashInflowsFromFinancingActivities = Double.parseDouble(subtotalOfCashInflowsFromFinancingActivities_str.replace(",", ""));
    	}
    	
    	String cashRepaymentsOfAmountsBorrowed_str = request.getParameter("cashRepaymentsOfAmountsBorrowed");
    	double cashRepaymentsOfAmountsBorrowed;
    	if (cashRepaymentsOfAmountsBorrowed_str == null || cashRepaymentsOfAmountsBorrowed_str.isEmpty()) {
    		cashRepaymentsOfAmountsBorrowed = 0.00;
    	} else {
    		cashRepaymentsOfAmountsBorrowed = Double.parseDouble(cashRepaymentsOfAmountsBorrowed_str.replace(",", ""));
    	}
    	
    	String cashPaidForDistributingDividendsProfitsPayingInterest_str = request.getParameter("cashPaidForDistributingDividendsProfitsPayingInterest");
    	double cashPaidForDistributingDividendsProfitsPayingInterest;
    	if (cashPaidForDistributingDividendsProfitsPayingInterest_str == null || cashPaidForDistributingDividendsProfitsPayingInterest_str.isEmpty()) {
    		cashPaidForDistributingDividendsProfitsPayingInterest = 0.00;
    	} else {
    		cashPaidForDistributingDividendsProfitsPayingInterest = Double.parseDouble(cashPaidForDistributingDividendsProfitsPayingInterest_str.replace(",", ""));
    	}
    	
    	String dividendsAndProfitsAaidBySubsidiariesToMinorityShareholders_str = request.getParameter("dividendsAndProfitsAaidBySubsidiariesToMinorityShareholders");
    	double dividendsAndProfitsAaidBySubsidiariesToMinorityShareholders;
    	if (dividendsAndProfitsAaidBySubsidiariesToMinorityShareholders_str == null || dividendsAndProfitsAaidBySubsidiariesToMinorityShareholders_str.isEmpty()) {
    		dividendsAndProfitsAaidBySubsidiariesToMinorityShareholders = 0.00;
    	} else {
    		dividendsAndProfitsAaidBySubsidiariesToMinorityShareholders = Double.parseDouble(dividendsAndProfitsAaidBySubsidiariesToMinorityShareholders_str.replace(",", ""));
    	}
    	
    	String paymentOfOtherCashRelatedToFinancingActivities_str = request.getParameter("paymentOfOtherCashRelatedToFinancingActivities");
    	double paymentOfOtherCashRelatedToFinancingActivities;
    	if (paymentOfOtherCashRelatedToFinancingActivities_str == null || paymentOfOtherCashRelatedToFinancingActivities_str.isEmpty()) {
    		paymentOfOtherCashRelatedToFinancingActivities = 0.00;
    	} else {
    		paymentOfOtherCashRelatedToFinancingActivities = Double.parseDouble(paymentOfOtherCashRelatedToFinancingActivities_str.replace(",", ""));
    	}
    	
    	String subtotalOfCashOutflowsFromFinancingActivities_str = request.getParameter("subtotalOfCashOutflowsFromFinancingActivities");
    	double subtotalOfCashOutflowsFromFinancingActivities;
    	if (subtotalOfCashOutflowsFromFinancingActivities_str == null || subtotalOfCashOutflowsFromFinancingActivities_str.isEmpty()) {
    		subtotalOfCashOutflowsFromFinancingActivities = 0.00;
    	} else {
    		subtotalOfCashOutflowsFromFinancingActivities = Double.parseDouble(subtotalOfCashOutflowsFromFinancingActivities_str.replace(",", ""));
    	}
    	
    	String netCashFlowGeneratedFromFinancingActivities_str = request.getParameter("netCashFlowGeneratedFromFinancingActivities");
    	double netCashFlowGeneratedFromFinancingActivities;
    	if (netCashFlowGeneratedFromFinancingActivities_str == null || netCashFlowGeneratedFromFinancingActivities_str.isEmpty()) {
    		netCashFlowGeneratedFromFinancingActivities = 0.00;
    	} else {
    		netCashFlowGeneratedFromFinancingActivities = Double.parseDouble(netCashFlowGeneratedFromFinancingActivities_str.replace(",", ""));
    	}
    	
    	String theImpactOfExchangeRateFluctuationsOnCashAndCashEquivalents_str = request.getParameter("theImpactOfExchangeRateFluctuationsOnCashAndCashEquivalents");
    	double theImpactOfExchangeRateFluctuationsOnCashAndCashEquivalents;
    	if (theImpactOfExchangeRateFluctuationsOnCashAndCashEquivalents_str == null || theImpactOfExchangeRateFluctuationsOnCashAndCashEquivalents_str.isEmpty()) {
    		theImpactOfExchangeRateFluctuationsOnCashAndCashEquivalents = 0.00;
    	} else {
    		theImpactOfExchangeRateFluctuationsOnCashAndCashEquivalents = Double.parseDouble(theImpactOfExchangeRateFluctuationsOnCashAndCashEquivalents_str.replace(",", ""));
    	}
    	
    	String netIncreaseInCashAndCashEquivalents_str = request.getParameter("netIncreaseInCashAndCashEquivalents");
    	double netIncreaseInCashAndCashEquivalents;
    	if (netIncreaseInCashAndCashEquivalents_str == null || netIncreaseInCashAndCashEquivalents_str.isEmpty()) {
    		netIncreaseInCashAndCashEquivalents = 0.00;
    	} else {
    		netIncreaseInCashAndCashEquivalents = Double.parseDouble(netIncreaseInCashAndCashEquivalents_str.replace(",", ""));
    	}
    	
    	String openingCashAndCashEquivalentsBalance_str = request.getParameter("openingCashAndCashEquivalentsBalance");
    	double openingCashAndCashEquivalentsBalance;
    	if (openingCashAndCashEquivalentsBalance_str == null || openingCashAndCashEquivalentsBalance_str.isEmpty()) {
    		openingCashAndCashEquivalentsBalance = 0.00;
    	} else {
    		openingCashAndCashEquivalentsBalance = Double.parseDouble(openingCashAndCashEquivalentsBalance_str.replace(",", ""));
    	}
    	
    	String closingBalanceOfCashAndCashEquivalents_str = request.getParameter("closingBalanceOfCashAndCashEquivalents");
    	double closingBalanceOfCashAndCashEquivalents;
    	if (closingBalanceOfCashAndCashEquivalents_str == null || closingBalanceOfCashAndCashEquivalents_str.isEmpty()) {
    		closingBalanceOfCashAndCashEquivalents = 0.00;
    	} else {
    		closingBalanceOfCashAndCashEquivalents = Double.parseDouble(closingBalanceOfCashAndCashEquivalents_str.replace(",", ""));
    	}
    	
    	String createTime=CreateTime.createtime();
    	String updateTime=CreateTime.createtime();
    	
    	cs.setFinancialReportingNo(financialReportingNo);
    	cs.setCashReceivedFromSellingGoodsAndProvidingServices(cashReceivedFromSellingGoodsAndProvidingServices);
    	cs.setNetIncreaseInCustomerDepositsAndInterbankDeposits(netIncreaseInCustomerDepositsAndInterbankDeposits);
    	cs.setNetIncreaseInBorrowingFromTheCentralBank(netIncreaseInBorrowingFromTheCentralBank);
    	cs.setNetIncreaseInBorrowingFundsFromOtherFinancialInstitutions(netIncreaseInBorrowingFundsFromOtherFinancialInstitutions);
    	cs.setCashReceivedFromPremiumOfOriginalInsuranceContract(cashReceivedFromPremiumOfOriginalInsuranceContract);
    	cs.setReceiptOfReinsuranceNetCash(receiptOfReinsuranceNetCash);
    	cs.setNetIncreaseInDepositsFromPolicyholders(netIncreaseInDepositsFromPolicyholders);
    	cs.setCashChargeInterestFeesAndCommissions(cashChargeInterestFeesAndCommissions);
    	cs.setNetIncreaseInBorrowedFunds(netIncreaseInBorrowedFunds);
    	cs.setNetIncreaseInRepurchaseBusinessFunds(netIncreaseInRepurchaseBusinessFunds);
    	cs.setNetCashReceivedFromProxyTradingOfSecurities(netCashReceivedFromProxyTradingOfSecurities);
    	cs.setRefundsOfTaxes(refundsOfTaxes);
    	cs.setOtherCashReceivedRelatingToOperatingActivities(otherCashReceivedRelatingToOperatingActivities);
    	cs.setBusinessActivitiesSubtotalOfCashInflows(businessActivitiesSubtotalOfCashInflows);
    	cs.setCashPaidForPurchasingGoodsAndReceivingServices(cashPaidForPurchasingGoodsAndReceivingServices);
    	cs.setNetIncreaseInCustomerLoansAndAdvances(netIncreaseInCustomerLoansAndAdvances);
    	cs.setNetIncreaseInDepositsWithCentralBanksAndInterbankFunds(netIncreaseInDepositsWithCentralBanksAndInterbankFunds);
    	cs.setPaymentOfTheOriginalInsuranceContractToPayTheAmountOfCash(paymentOfTheOriginalInsuranceContractToPayTheAmountOfCash);
    	cs.setNetIncreaseInLendingFunds(netIncreaseInLendingFunds);
    	cs.setCashPaidForInterestHandlingFeesAndCommissions(cashPaidForInterestHandlingFeesAndCommissions);
    	cs.setCashPaidForPolicyDividends(cashPaidForPolicyDividends);
    	cs.setCashPaidToAndOnBehalfOfEmployees(cashPaidToAndOnBehalfOfEmployees);
    	cs.setTaxesPaid(taxesPaid);
    	cs.setPaymentOfOtherCashRelatedToOperatingActivities(paymentOfOtherCashRelatedToOperatingActivities);
    	cs.setSubtotalOfCashOutflowsFromOperatingActivities(subtotalOfCashOutflowsFromOperatingActivities);
    	cs.setNetCashFlowFromOperating(netCashFlowFromOperating);
    	cs.setCashReceivedFromInvestmentRecovery(cashReceivedFromInvestmentRecovery);
    	cs.setCashReceivedFromObtainingInvestmentReturns(cashReceivedFromObtainingInvestmentReturns);
    	cs.setNetCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssets(netCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssets);
    	cs.setNetCashReceivedFromDisposalOfSubsidiariesAndOtherOperatingUnits(netCashReceivedFromDisposalOfSubsidiariesAndOtherOperatingUnits);
    	cs.setReceivedOtherCashRelatedToInvestmentActivities(receivedOtherCashRelatedToInvestmentActivities);
    	cs.setSubtotalOfCashInflowsFromInvestmentActivities(subtotalOfCashInflowsFromInvestmentActivities);
    	cs.setCashPaidForPurchaseConstructionFixedIntangibleLongTermAssets(cashPaidForPurchaseConstructionFixedIntangibleLongTermAssets);
    	cs.setCashPaidForInvestment(cashPaidForInvestment);
    	cs.setNetIncreaseInPledgedLoans(netIncreaseInPledgedLoans);
    	cs.setNetCashPaidToSubsidiariesAndOtherBusinessUnits(netCashPaidToSubsidiariesAndOtherBusinessUnits);
    	cs.setPaymentOfOtherCashRelatedToInvestmentActivities(paymentOfOtherCashRelatedToInvestmentActivities);
    	cs.setSubtotalOfCashOutflowsFromInvestmentActivities(subtotalOfCashOutflowsFromInvestmentActivities);
    	cs.setNetCashFlowGeneratedFromInvestmentActivities(netCashFlowGeneratedFromInvestmentActivities);
    	cs.setCashReceivedFromAbsorbingInvestments(cashReceivedFromAbsorbingInvestments);
    	cs.setCashReceivedFromMinorityInvestmentInSubsidiaries(cashReceivedFromMinorityInvestmentInSubsidiaries);
    	cs.setCashReceivedFromObtainingLoans(cashReceivedFromObtainingLoans);
    	cs.setReceivedOtherCashRelatedToFinancingActivities(receivedOtherCashRelatedToFinancingActivities);
    	cs.setSubtotalOfCashInflowsFromFinancingActivities(subtotalOfCashInflowsFromFinancingActivities);
    	cs.setCashRepaymentsOfAmountsBorrowed(cashRepaymentsOfAmountsBorrowed);
    	cs.setCashPaidForDistributingDividendsProfitsPayingInterest(cashPaidForDistributingDividendsProfitsPayingInterest);
    	cs.setDividendsAndProfitsAaidBySubsidiariesToMinorityShareholders(dividendsAndProfitsAaidBySubsidiariesToMinorityShareholders);
    	cs.setPaymentOfOtherCashRelatedToFinancingActivities(paymentOfOtherCashRelatedToFinancingActivities);
    	cs.setSubtotalOfCashOutflowsFromFinancingActivities(subtotalOfCashOutflowsFromFinancingActivities);
    	cs.setNetCashFlowGeneratedFromFinancingActivities(netCashFlowGeneratedFromFinancingActivities);
    	cs.setTheImpactOfExchangeRateFluctuationsOnCashAndCashEquivalents(theImpactOfExchangeRateFluctuationsOnCashAndCashEquivalents);
    	cs.setNetIncreaseInCashAndCashEquivalents(netIncreaseInCashAndCashEquivalents);
    	cs.setOpeningCashAndCashEquivalentsBalance(openingCashAndCashEquivalentsBalance);
    	cs.setClosingBalanceOfCashAndCashEquivalents(closingBalanceOfCashAndCashEquivalents);
    	cs.setCreateDateTime(createTime);
    	cs.setUpdateDateTime(updateTime);
    	
    	boolean updateResult=rdi.updateCashflowStatement(cs);
    	if(updateResult) {
            // 修改成功，设置成功消息
            request.setAttribute("a", "修改成功!");
        } else {
            // 修改失败，设置失败消息
            request.setAttribute("a", "修改失败!");
        }
    	
    	
    	
    	RequestDispatcher dispatcher=request.getRequestDispatcher("financialReportEdit2.jsp");
		dispatcher.forward(request, response);
    }
}