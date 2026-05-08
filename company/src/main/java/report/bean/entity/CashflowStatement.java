package report.bean.entity;

public class CashflowStatement {
	String
	financialReportingNo,					//财报编号
	createDateTime,							//创建时间
	upDateTime;								//更新时间
	double
	cashReceivedFromSellingGoodsAndProvidingServices,				//销售商品、提供劳务收到的现金
	netIncreaseInCustomerDepositsAndInterbankDeposits,				//客户存款和同业存放款项净增加额
	netIncreaseInBorrowingFromTheCentralBank,						//向中央银行借款净增加额
	netIncreaseInBorrowingFundsFromOtherFinancialInstitutions,		//向其他金融机构拆入资金净增加额
	cashReceivedFromPremiumOfOriginalInsuranceContract,				//收到原保险合同保费取得的现金
	receiptOfReinsuranceNetCash,									//收到再保业务现金净额
	netIncreaseInDepositsFromPolicyholders,							//保户储金及投资款净增加额
	cashChargeInterestFeesAndCommissions,							//收取利息、手续费及佣金的现金
	netIncreaseInBorrowedFunds,										//拆入资金净增加额
	netIncreaseInRepurchaseBusinessFunds,							//回购业务资金净增加额
	netCashReceivedFromProxyTradingOfSecurities,					//代理买卖证券收到的现金净额
	refundsOfTaxes,													//收到的税费返还
	otherCashReceivedRelatingToOperatingActivities,					//收到其他与经营活动有关的现金
	businessActivitiesSubtotalOfCashInflows,						//经营活动现金流入小计
	cashPaidForPurchasingGoodsAndReceivingServices,					//购买商品、接受劳务支付的现金
	netIncreaseInCustomerLoansAndAdvances,							//客户贷款及垫款净增加额
	netIncreaseInDepositsWithCentralBanksAndInterbankFunds,			//存放中央银行和同业款项净增加额
	paymentOfTheOriginalInsuranceContractToPayTheAmountOfCash,		//支付原保险合同赔付款项的现金
	netIncreaseInLendingFunds,										//拆出资金净增加额
	cashPaidForInterestHandlingFeesAndCommissions,					//支付利息、手续费及佣金的现金
	cashPaidForPolicyDividends,										//支付保单红利的现金
	cashPaidToAndOnBehalfOfEmployees,								//支付给职工以及为职工支付的现金
	taxesPaid,														//支付的各项税费
	paymentOfOtherCashRelatedToOperatingActivities,					//支付其他与经营活动有关的现金
	subtotalOfCashOutflowsFromOperatingActivities,					//经营活动现金流出小计
	netCashFlowFromOperating,										//经营活动产生的现金流量净额
	cashReceivedFromInvestmentRecovery,								//收回投资收到的现金
	cashReceivedFromObtainingInvestmentReturns,						//取得投资收益收到的现金
	netCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssets,	//处置固定、无形和其他长期资产收回现金
	netCashReceivedFromDisposalOfSubsidiariesAndOtherOperatingUnits,	//处置子公司及其他营业单位收到现金净额
	receivedOtherCashRelatedToInvestmentActivities,					//收到其他与投资活动有关的现金
	subtotalOfCashInflowsFromInvestmentActivities,					//投资活动现金流入小计
	cashPaidForPurchaseConstructionFixedIntangibleLongTermAssets,	//购建固定、无形和其他长期资产支付现金
	cashPaidForInvestment,											//投资支付的现金
	netIncreaseInPledgedLoans,										//质押贷款净增加额
	netCashPaidToSubsidiariesAndOtherBusinessUnits,					//取得子公司及其他营业单位支付现金净额
	paymentOfOtherCashRelatedToInvestmentActivities,				//支付其他与投资活动有关的现金
	subtotalOfCashOutflowsFromInvestmentActivities,					//投资活动现金流出小计
	netCashFlowGeneratedFromInvestmentActivities,					//投资活动产生的现金流量净额
	cashReceivedFromAbsorbingInvestments,							//吸收投资收到的现金
	cashReceivedFromMinorityInvestmentInSubsidiaries,				//子公司吸收少数股东投资收到现金
	cashReceivedFromObtainingLoans,									//取得借款收到的现金
	receivedOtherCashRelatedToFinancingActivities,					//收到其他与筹资活动有关的现金
	subtotalOfCashInflowsFromFinancingActivities,					//筹资活动现金流入小计
	cashRepaymentsOfAmountsBorrowed,								//偿还债务支付的现金
	cashPaidForDistributingDividendsProfitsPayingInterest,			//分配股利、利润或偿付利息支付的现金
	dividendsAndProfitsAaidBySubsidiariesToMinorityShareholders,	//子公司支付给少数股东的股利、利润
	paymentOfOtherCashRelatedToFinancingActivities,					//支付其他与筹资活动有关的现金
	subtotalOfCashOutflowsFromFinancingActivities,					//筹资活动现金流出小计
	netCashFlowGeneratedFromFinancingActivities,					//筹资活动产生的现金流量净额
	theImpactOfExchangeRateFluctuationsOnCashAndCashEquivalents,	//汇率变动对现金及现金等价物的影响
	netIncreaseInCashAndCashEquivalents,							//现金及现金等价物净增加额
	openingCashAndCashEquivalentsBalance,							//期初现金及现金等价物余额
	closingBalanceOfCashAndCashEquivalents;							//期末现金及现金等价物余额
	
	//财报编号：财报年份+六位数字编号
	public void setFinancialReportingNo(String financialReportingNo) {
		this.financialReportingNo=financialReportingNo;
	}
		
	public String getFinancialReportingNo() {
		return financialReportingNo;
	}
		

	//创建时间
	public void setCreateDateTime(String createDateTime) {
		this.createDateTime=createDateTime;
	}
		
	public String getCreateDateTime() {
		return createDateTime;
	}

	//更新时间
	public void setUpdateDateTime(String upDateTime) {
		this.upDateTime=upDateTime;
	}
	
	public String getUpdateDateTime() {
		return upDateTime;
	}
	
	//销售商品、提供劳务收到的现金
	public void setCashReceivedFromSellingGoodsAndProvidingServices(double cashReceivedFromSellingGoodsAndProvidingServices) {
		this.cashReceivedFromSellingGoodsAndProvidingServices=cashReceivedFromSellingGoodsAndProvidingServices;
	}
	
	public double getCashReceivedFromSellingGoodsAndProvidingServices() {
		return cashReceivedFromSellingGoodsAndProvidingServices;
	}
	
	//客户存款和同业存放款项净增加额
	public void setNetIncreaseInCustomerDepositsAndInterbankDeposits(double netIncreaseInCustomerDepositsAndInterbankDeposits) {
		this.netIncreaseInCustomerDepositsAndInterbankDeposits=netIncreaseInCustomerDepositsAndInterbankDeposits;
	}
	
	public double getNetIncreaseInCustomerDepositsAndInterbankDeposits() {
		return netIncreaseInCustomerDepositsAndInterbankDeposits;
	}
	
	//向中央银行借款净增加额
	public void setNetIncreaseInBorrowingFromTheCentralBank(double netIncreaseInBorrowingFromTheCentralBank) {
		this.netIncreaseInBorrowingFromTheCentralBank=netIncreaseInBorrowingFromTheCentralBank;
	}
	
	public double getNetIncreaseInBorrowingFromTheCentralBank() {
		return netIncreaseInBorrowingFromTheCentralBank;
	}
	
	//向其他金融机构拆入资金净增加额
	public void setNetIncreaseInBorrowingFundsFromOtherFinancialInstitutions(double netIncreaseInBorrowingFundsFromOtherFinancialInstitutions) {
		this.netIncreaseInBorrowingFundsFromOtherFinancialInstitutions=netIncreaseInBorrowingFundsFromOtherFinancialInstitutions;
	}
	
	public double getNetIncreaseInBorrowingFundsFromOtherFinancialInstitutions() {
		return netIncreaseInBorrowingFundsFromOtherFinancialInstitutions;
	}
	
	//收到原保险合同保费取得的现金
	public void setCashReceivedFromPremiumOfOriginalInsuranceContract(double cashReceivedFromPremiumOfOriginalInsuranceContract) {
		this.cashReceivedFromPremiumOfOriginalInsuranceContract=cashReceivedFromPremiumOfOriginalInsuranceContract;
	}
	
	public double getCashReceivedFromPremiumOfOriginalInsuranceContract() {
		return cashReceivedFromPremiumOfOriginalInsuranceContract;
	}
	
	//收到再保业务现金净额
	public void setReceiptOfReinsuranceNetCash(double receiptOfReinsuranceNetCash) {
		this.receiptOfReinsuranceNetCash=receiptOfReinsuranceNetCash;
	}
	
	public double getReceiptOfReinsuranceNetCash() {
		return receiptOfReinsuranceNetCash;
	}
	
	//保户储金及投资款净增加额
	public void setNetIncreaseInDepositsFromPolicyholders(double netIncreaseInDepositsFromPolicyholders) {
		this.netIncreaseInDepositsFromPolicyholders=netIncreaseInDepositsFromPolicyholders;
	}
	
	public double getNetIncreaseInDepositsFromPolicyholders() {
		return netIncreaseInDepositsFromPolicyholders;
	}
	
	//收取利息、手续费及佣金的现金
	public void setCashChargeInterestFeesAndCommissions(double cashChargeInterestFeesAndCommissions) {
		this.cashChargeInterestFeesAndCommissions=cashChargeInterestFeesAndCommissions;
	}
	
	public double getCashChargeInterestFeesAndCommissions() {
		return cashChargeInterestFeesAndCommissions;
	}
	
	//拆入资金净增加额
	public void setNetIncreaseInBorrowedFunds(double netIncreaseInBorrowedFunds) {
		this.netIncreaseInBorrowedFunds=netIncreaseInBorrowedFunds;
	}
	
	public double getNetIncreaseInBorrowedFunds() {
		return netIncreaseInBorrowedFunds;
	}
	
	//回购业务资金净增加额
	public void setNetIncreaseInRepurchaseBusinessFunds(double netIncreaseInRepurchaseBusinessFunds) {
		this.netIncreaseInRepurchaseBusinessFunds=netIncreaseInRepurchaseBusinessFunds;
	}
	
	public double getNetIncreaseInRepurchaseBusinessFunds() {
		return netIncreaseInRepurchaseBusinessFunds;
	}
	
	//代理买卖证券收到的现金净额
	public void setNetCashReceivedFromProxyTradingOfSecurities(double netCashReceivedFromProxyTradingOfSecurities) {
		this.netCashReceivedFromProxyTradingOfSecurities=netCashReceivedFromProxyTradingOfSecurities;
	}
	
	public double getNetCashReceivedFromProxyTradingOfSecurities() {
		return netCashReceivedFromProxyTradingOfSecurities;
	}
	
	//收到的税费返还
	public void setRefundsOfTaxes(double refundsOfTaxes) {
		this.refundsOfTaxes=refundsOfTaxes;
	}
	
	public double getRefundsOfTaxes() {
		return refundsOfTaxes;
	}
	
	//收到其他与经营活动有关的现金
	public void setOtherCashReceivedRelatingToOperatingActivities(double otherCashReceivedRelatingToOperatingActivities) {
		this.otherCashReceivedRelatingToOperatingActivities=otherCashReceivedRelatingToOperatingActivities;
	}
	
	public double getOtherCashReceivedRelatingToOperatingActivities() {
		return otherCashReceivedRelatingToOperatingActivities;
	}
	
	//经营活动现金流入小计
	public void setBusinessActivitiesSubtotalOfCashInflows(double businessActivitiesSubtotalOfCashInflows) {
		this.businessActivitiesSubtotalOfCashInflows=businessActivitiesSubtotalOfCashInflows;
	}
	
	public double getBusinessActivitiesSubtotalOfCashInflows() {
		return businessActivitiesSubtotalOfCashInflows;
	}
	
	//购买商品、接受劳务支付的现金
	public void setCashPaidForPurchasingGoodsAndReceivingServices(double cashPaidForPurchasingGoodsAndReceivingServices) {
		this.cashPaidForPurchasingGoodsAndReceivingServices=cashPaidForPurchasingGoodsAndReceivingServices;
	}
	
	public double getCashPaidForPurchasingGoodsAndReceivingServices() {
		return cashPaidForPurchasingGoodsAndReceivingServices;
	}
	
	//客户贷款及垫款净增加额
	public void setNetIncreaseInCustomerLoansAndAdvances(double netIncreaseInCustomerLoansAndAdvances) {
		this.netIncreaseInCustomerLoansAndAdvances=netIncreaseInCustomerLoansAndAdvances;
	}
	
	public double getNetIncreaseInCustomerLoansAndAdvances() {
		return netIncreaseInCustomerLoansAndAdvances;
	}
	
	//存放中央银行和同业款项净增加额
	public void setNetIncreaseInDepositsWithCentralBanksAndInterbankFunds(double netIncreaseInDepositsWithCentralBanksAndInterbankFunds) {
		this.netIncreaseInDepositsWithCentralBanksAndInterbankFunds=netIncreaseInDepositsWithCentralBanksAndInterbankFunds;
	}
	
	public double getNetIncreaseInDepositsWithCentralBanksAndInterbankFunds() {
		return netIncreaseInDepositsWithCentralBanksAndInterbankFunds;
	}
	
	//支付原保险合同赔付款项的现金
	public void setPaymentOfTheOriginalInsuranceContractToPayTheAmountOfCash(double paymentOfTheOriginalInsuranceContractToPayTheAmountOfCash) {
		this.paymentOfTheOriginalInsuranceContractToPayTheAmountOfCash=paymentOfTheOriginalInsuranceContractToPayTheAmountOfCash;
	}
	
	public double getPaymentOfTheOriginalInsuranceContractToPayTheAmountOfCash() {
		return paymentOfTheOriginalInsuranceContractToPayTheAmountOfCash;
	}
	
	//拆出资金净增加额
	public void setNetIncreaseInLendingFunds(double netIncreaseInLendingFunds) {
		this.netIncreaseInLendingFunds=netIncreaseInLendingFunds;
	}
	
	public double getNetIncreaseInLendingFunds() {
		return netIncreaseInLendingFunds;
	}
	
	//支付利息、手续费及佣金的现金
	public void setCashPaidForInterestHandlingFeesAndCommissions(double cashPaidForInterestHandlingFeesAndCommissions) {
		this.cashPaidForInterestHandlingFeesAndCommissions=cashPaidForInterestHandlingFeesAndCommissions;
	}
	
	public double getCashPaidForInterestHandlingFeesAndCommissions() {
		return cashPaidForInterestHandlingFeesAndCommissions;
	}
	
	//支付保单红利的现金
	public void setCashPaidForPolicyDividends(double cashPaidForPolicyDividends) {
		this.cashPaidForPolicyDividends=cashPaidForPolicyDividends;
	}
	
	public double getCashPaidForPolicyDividends() {
		return cashPaidForPolicyDividends;
	}
	
	//支付给职工以及为职工支付的现金
	public void setCashPaidToAndOnBehalfOfEmployees(double cashPaidToAndOnBehalfOfEmployees) {
		this.cashPaidToAndOnBehalfOfEmployees=cashPaidToAndOnBehalfOfEmployees;
	}
	
	public double getCashPaidToAndOnBehalfOfEmployees() {
		return cashPaidToAndOnBehalfOfEmployees;
	}
	
	//支付的各项税费
	public void setTaxesPaid(double taxesPaid) {
		this.taxesPaid=taxesPaid;
	}
	
	public double getTaxesPaid() {
		return taxesPaid;
	}
	
	//支付其他与经营活动有关的现金
	public void setPaymentOfOtherCashRelatedToOperatingActivities(double paymentOfOtherCashRelatedToOperatingActivities) {
		this.paymentOfOtherCashRelatedToOperatingActivities=paymentOfOtherCashRelatedToOperatingActivities;
	}
	
	public double getPaymentOfOtherCashRelatedToOperatingActivities() {
		return paymentOfOtherCashRelatedToOperatingActivities;
	}
	
	//经营活动现金流出小计
	public void setSubtotalOfCashOutflowsFromOperatingActivities(double subtotalOfCashOutflowsFromOperatingActivities) {
		this.subtotalOfCashOutflowsFromOperatingActivities=subtotalOfCashOutflowsFromOperatingActivities;
	}
	
	public double getSubtotalOfCashOutflowsFromOperatingActivities() {
		return subtotalOfCashOutflowsFromOperatingActivities;
	}
	
	//经营活动产生的现金流量净额
	public void setNetCashFlowFromOperating(double netCashFlowFromOperating) {
		this.netCashFlowFromOperating=netCashFlowFromOperating;
	}
	
	public double getNetCashFlowFromOperating() {
		return netCashFlowFromOperating;
	}
	
	//收回投资收到的现金
	public void setCashReceivedFromInvestmentRecovery(double cashReceivedFromInvestmentRecovery) {
		this.cashReceivedFromInvestmentRecovery=cashReceivedFromInvestmentRecovery;
	}
	
	public double getCashReceivedFromInvestmentRecovery() {
		return cashReceivedFromInvestmentRecovery;
	}
	
	//取得投资收益收到的现金
	public void setCashReceivedFromObtainingInvestmentReturns(double cashReceivedFromObtainingInvestmentReturns) {
		this.cashReceivedFromObtainingInvestmentReturns=cashReceivedFromObtainingInvestmentReturns;
	}
	
	public double getCashReceivedFromObtainingInvestmentReturns() {
		return cashReceivedFromObtainingInvestmentReturns;
	}
	
	//处置固定、无形和其他长期资产收回现金
	public void setNetCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssets(double netCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssets) {
		this.netCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssets=netCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssets;
	}
	
	public double getNetCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssets() {
		return netCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssets;
	}
	
	//处置子公司及其他营业单位收到现金净额
	public void setNetCashReceivedFromDisposalOfSubsidiariesAndOtherOperatingUnits(double netCashReceivedFromDisposalOfSubsidiariesAndOtherOperatingUnits) {
		this.netCashReceivedFromDisposalOfSubsidiariesAndOtherOperatingUnits=netCashReceivedFromDisposalOfSubsidiariesAndOtherOperatingUnits;
	}
	
	public double getNetCashReceivedFromDisposalOfSubsidiariesAndOtherOperatingUnits() {
		return netCashReceivedFromDisposalOfSubsidiariesAndOtherOperatingUnits;
	}
	
	//收到其他与投资活动有关的现金
	public void setReceivedOtherCashRelatedToInvestmentActivities(double receivedOtherCashRelatedToInvestmentActivities) {
		this.receivedOtherCashRelatedToInvestmentActivities=receivedOtherCashRelatedToInvestmentActivities;
	}
	
	public double getReceivedOtherCashRelatedToInvestmentActivities() {
		return receivedOtherCashRelatedToInvestmentActivities;
	}
	
	//投资活动现金流入小计
	public void setSubtotalOfCashInflowsFromInvestmentActivities(double subtotalOfCashInflowsFromInvestmentActivities) {
		this.subtotalOfCashInflowsFromInvestmentActivities=subtotalOfCashInflowsFromInvestmentActivities;
	}
	
	public double getSubtotalOfCashInflowsFromInvestmentActivities() {
		return subtotalOfCashInflowsFromInvestmentActivities;
	}
	
	//购建固定、无形和其他长期资产支付现金
	public void setCashPaidForPurchaseConstructionFixedIntangibleLongTermAssets(double cashPaidForPurchaseConstructionFixedIntangibleLongTermAssets) {
		this.cashPaidForPurchaseConstructionFixedIntangibleLongTermAssets=cashPaidForPurchaseConstructionFixedIntangibleLongTermAssets;
	}
	
	public double getCashPaidForPurchaseConstructionFixedIntangibleLongTermAssets() {
		return cashPaidForPurchaseConstructionFixedIntangibleLongTermAssets;
	}
	
	//投资支付的现金
	public void setCashPaidForInvestment(double cashPaidForInvestment) {
		this.cashPaidForInvestment=cashPaidForInvestment;
	}
	
	public double getCashPaidForInvestment() {
		return cashPaidForInvestment;
	}
	
	//质押贷款净增加额
	public void setNetIncreaseInPledgedLoans(double netIncreaseInPledgedLoans) {
		this.netIncreaseInPledgedLoans=netIncreaseInPledgedLoans;
	}
	
	public double getNetIncreaseInPledgedLoans() {
		return netIncreaseInPledgedLoans;
	}
	
	//取得子公司及其他营业单位支付现金净额
	public void setNetCashPaidToSubsidiariesAndOtherBusinessUnits(double netCashPaidToSubsidiariesAndOtherBusinessUnits) {
		this.netCashPaidToSubsidiariesAndOtherBusinessUnits=netCashPaidToSubsidiariesAndOtherBusinessUnits;
	}
	
	public double getNetCashPaidToSubsidiariesAndOtherBusinessUnits() {
		return netCashPaidToSubsidiariesAndOtherBusinessUnits;
	}
	
	//支付其他与投资活动有关的现金
	public void setPaymentOfOtherCashRelatedToInvestmentActivities(double paymentOfOtherCashRelatedToInvestmentActivities) {
		this.paymentOfOtherCashRelatedToInvestmentActivities=paymentOfOtherCashRelatedToInvestmentActivities;
	}
	
	public double getPaymentOfOtherCashRelatedToInvestmentActivities() {
		return paymentOfOtherCashRelatedToInvestmentActivities;
	}
	
	//投资活动现金流出小计
	public void setSubtotalOfCashOutflowsFromInvestmentActivities(double subtotalOfCashOutflowsFromInvestmentActivities) {
		this.subtotalOfCashOutflowsFromInvestmentActivities=subtotalOfCashOutflowsFromInvestmentActivities;
	}
	
	public double getSubtotalOfCashOutflowsFromInvestmentActivities() {
		return subtotalOfCashOutflowsFromInvestmentActivities;
	}
	
	//投资活动产生的现金流量净额
	public void setNetCashFlowGeneratedFromInvestmentActivities(double netCashFlowGeneratedFromInvestmentActivities) {
		this.netCashFlowGeneratedFromInvestmentActivities=netCashFlowGeneratedFromInvestmentActivities;
	}
	
	public double getNetCashFlowGeneratedFromInvestmentActivities() {
		return netCashFlowGeneratedFromInvestmentActivities;
	}
	
	//吸收投资收到的现金
	public void setCashReceivedFromAbsorbingInvestments(double cashReceivedFromAbsorbingInvestments) {
		this.cashReceivedFromAbsorbingInvestments=cashReceivedFromAbsorbingInvestments;
	}
	
	public double getCashReceivedFromAbsorbingInvestments() {
		return cashReceivedFromAbsorbingInvestments;
	}
	
	//子公司吸收少数股东投资收到现金
	public void setCashReceivedFromMinorityInvestmentInSubsidiaries(double cashReceivedFromMinorityInvestmentInSubsidiaries) {
		this.cashReceivedFromMinorityInvestmentInSubsidiaries=cashReceivedFromMinorityInvestmentInSubsidiaries;
	}
	
	public double getCashReceivedFromMinorityInvestmentInSubsidiaries() {
		return cashReceivedFromMinorityInvestmentInSubsidiaries;
	}
	
	//取得借款收到的现金
	public void setCashReceivedFromObtainingLoans(double cashReceivedFromObtainingLoans) {
		this.cashReceivedFromObtainingLoans=cashReceivedFromObtainingLoans;
	}
	
	public double getCashReceivedFromObtainingLoans() {
		return cashReceivedFromObtainingLoans;
	}
	
	//收到其他与筹资活动有关的现金
	public void setReceivedOtherCashRelatedToFinancingActivities(double receivedOtherCashRelatedToFinancingActivities) {
		this.receivedOtherCashRelatedToFinancingActivities=receivedOtherCashRelatedToFinancingActivities;
	}
	
	public double getReceivedOtherCashRelatedToFinancingActivities() {
		return receivedOtherCashRelatedToFinancingActivities;
	}
	
	//筹资活动现金流入小计
	public void setSubtotalOfCashInflowsFromFinancingActivities(double subtotalOfCashInflowsFromFinancingActivities) {
		this.subtotalOfCashInflowsFromFinancingActivities=subtotalOfCashInflowsFromFinancingActivities;
	}
	
	public double getSubtotalOfCashInflowsFromFinancingActivities() {
		return subtotalOfCashInflowsFromFinancingActivities;
	}
	
	//偿还债务支付的现金
	public void setCashRepaymentsOfAmountsBorrowed(double cashRepaymentsOfAmountsBorrowed) {
		this.cashRepaymentsOfAmountsBorrowed=cashRepaymentsOfAmountsBorrowed;
	}
	
	public double getCashRepaymentsOfAmountsBorrowed() {
		return cashRepaymentsOfAmountsBorrowed;
	}
	
	//分配股利、利润或偿付利息支付的现金
	public void setCashPaidForDistributingDividendsProfitsPayingInterest(double cashPaidForDistributingDividendsProfitsPayingInterest) {
		this.cashPaidForDistributingDividendsProfitsPayingInterest=cashPaidForDistributingDividendsProfitsPayingInterest;
	}
	
	public double getCashPaidForDistributingDividendsProfitsPayingInterest() {
		return cashPaidForDistributingDividendsProfitsPayingInterest;
	}
	
	//子公司支付给少数股东的股利、利润
	public void setDividendsAndProfitsAaidBySubsidiariesToMinorityShareholders(double dividendsAndProfitsAaidBySubsidiariesToMinorityShareholders) {
		this.dividendsAndProfitsAaidBySubsidiariesToMinorityShareholders=dividendsAndProfitsAaidBySubsidiariesToMinorityShareholders;
	}
	
	public double getDividendsAndProfitsAaidBySubsidiariesToMinorityShareholders() {
		return dividendsAndProfitsAaidBySubsidiariesToMinorityShareholders;
	}
	
	//支付其他与筹资活动有关的现金
	public void setPaymentOfOtherCashRelatedToFinancingActivities(double paymentOfOtherCashRelatedToFinancingActivities) {
		this.paymentOfOtherCashRelatedToFinancingActivities=paymentOfOtherCashRelatedToFinancingActivities;
	}
	
	public double getPaymentOfOtherCashRelatedToFinancingActivities() {
		return paymentOfOtherCashRelatedToFinancingActivities;
	}
	
	//筹资活动现金流出小计
	public void setSubtotalOfCashOutflowsFromFinancingActivities(double subtotalOfCashOutflowsFromFinancingActivities) {
		this.subtotalOfCashOutflowsFromFinancingActivities=subtotalOfCashOutflowsFromFinancingActivities;
	}
	
	public double getSubtotalOfCashOutflowsFromFinancingActivities() {
		return subtotalOfCashOutflowsFromFinancingActivities;
	}
	
	//筹资活动产生的现金流量净额
	public void setNetCashFlowGeneratedFromFinancingActivities(double netCashFlowGeneratedFromFinancingActivities) {
		this.netCashFlowGeneratedFromFinancingActivities=netCashFlowGeneratedFromFinancingActivities;
	}
	
	public double getNetCashFlowGeneratedFromFinancingActivities() {
		return netCashFlowGeneratedFromFinancingActivities;
	}
	
	//汇率变动对现金及现金等价物的影响
	public void setTheImpactOfExchangeRateFluctuationsOnCashAndCashEquivalents(double theImpactOfExchangeRateFluctuationsOnCashAndCashEquivalents) {
		this.theImpactOfExchangeRateFluctuationsOnCashAndCashEquivalents=theImpactOfExchangeRateFluctuationsOnCashAndCashEquivalents;
	}
	
	public double getTheImpactOfExchangeRateFluctuationsOnCashAndCashEquivalents() {
		return theImpactOfExchangeRateFluctuationsOnCashAndCashEquivalents;
	}
	
	//现金及现金等价物净增加额
	public void setNetIncreaseInCashAndCashEquivalents(double netIncreaseInCashAndCashEquivalents) {
		this.netIncreaseInCashAndCashEquivalents=netIncreaseInCashAndCashEquivalents;
	}
	
	public double getNetIncreaseInCashAndCashEquivalents() {
		return netIncreaseInCashAndCashEquivalents;
	}
	
	//期初现金及现金等价物余额
	public void setOpeningCashAndCashEquivalentsBalance(double openingCashAndCashEquivalentsBalance) {
		this.openingCashAndCashEquivalentsBalance=openingCashAndCashEquivalentsBalance;
	}
	
	public double getOpeningCashAndCashEquivalentsBalance() {
		return openingCashAndCashEquivalentsBalance;
	}
	
	//期末现金及现金等价物余额
	public void setClosingBalanceOfCashAndCashEquivalents(double closingBalanceOfCashAndCashEquivalents) {
		this.closingBalanceOfCashAndCashEquivalents=closingBalanceOfCashAndCashEquivalents;
	}
	
	public double getClosingBalanceOfCashAndCashEquivalents() {
		return closingBalanceOfCashAndCashEquivalents;
	}
}
