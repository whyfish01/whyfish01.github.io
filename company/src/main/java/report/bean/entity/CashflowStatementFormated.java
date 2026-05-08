package report.bean.entity;

public class CashflowStatementFormated {
	String
	financialReportingNo,					//财报编号
	createDateTime,							//创建时间
	upDateTime,
	cashReceivedFromSellingGoodsAndProvidingServicesFormated,				//销售商品、提供劳务收到的现金
	netIncreaseInCustomerDepositsAndInterbankDepositsFormated,				//客户存款和同业存放款项净增加额
	netIncreaseInBorrowingFromTheCentralBankFormated,						//向中央银行借款净增加额
	netIncreaseInBorrowingFundsFromOtherFinancialInstitutionsFormated,		//向其他金融机构拆入资金净增加额
	cashReceivedFromPremiumOfOriginalInsuranceContractFormated,				//收到原保险合同保费取得的现金
	receiptOfReinsuranceNetCashFormated,									//收到再保业务现金净额
	netIncreaseInDepositsFromPolicyholdersFormated,							//保户储金及投资款净增加额
	cashChargeInterestFeesAndCommissionsFormated,							//收取利息、手续费及佣金的现金
	netIncreaseInBorrowedFundsFormated,										//拆入资金净增加额
	netIncreaseInRepurchaseBusinessFundsFormated,							//回购业务资金净增加额
	netCashReceivedFromProxyTradingOfSecuritiesFormated,					//代理买卖证券收到的现金净额
	refundsOfTaxesFormated,													//收到的税费返还
	otherCashReceivedRelatingToOperatingActivitiesFormated,					//收到其他与经营活动有关的现金
	businessActivitiesSubtotalOfCashInflowsFormated,						//经营活动现金流入小计
	cashPaidForPurchasingGoodsAndReceivingServicesFormated,					//购买商品、接受劳务支付的现金
	netIncreaseInCustomerLoansAndAdvancesFormated,							//客户贷款及垫款净增加额
	netIncreaseInDepositsWithCentralBanksAndInterbankFundsFormated,			//存放中央银行和同业款项净增加额
	paymentOfTheOriginalInsuranceContractToPayTheAmountOfCashFormated,		//支付原保险合同赔付款项的现金
	netIncreaseInLendingFundsFormated,										//拆出资金净增加额
	cashPaidForInterestHandlingFeesAndCommissionsFormated,					//支付利息、手续费及佣金的现金
	cashPaidForPolicyDividendsFormated,										//支付保单红利的现金
	cashPaidToAndOnBehalfOfEmployeesFormated,								//支付给职工以及为职工支付的现金
	taxesPaidFormated,														//支付的各项税费
	paymentOfOtherCashRelatedToOperatingActivitiesFormated,					//支付其他与经营活动有关的现金
	subtotalOfCashOutflowsFromOperatingActivitiesFormated,					//经营活动现金流出小计
	netCashFlowFromOperatingFormated,										//经营活动产生的现金流量净额
	cashReceivedFromInvestmentRecoveryFormated,								//收回投资收到的现金
	cashReceivedFromObtainingInvestmentReturnsFormated,						//取得投资收益收到的现金
	netCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssetsFormated,	//处置固定、无形和其他长期资产收回现金
	netCashReceivedFromDisposalOfSubsidiariesAndOtherOperatingUnitsFormated,	//处置子公司及其他营业单位收到现金净额
	receivedOtherCashRelatedToInvestmentActivitiesFormated,					//收到其他与投资活动有关的现金
	subtotalOfCashInflowsFromInvestmentActivitiesFormated,					//投资活动现金流入小计
	cashPaidForPurchaseConstructionFixedIntangibleLongTermAssetsFormated,	//购建固定、无形和其他长期资产支付现金
	cashPaidForInvestmentFormated,											//投资支付的现金
	netIncreaseInPledgedLoansFormated,										//质押贷款净增加额
	netCashPaidToSubsidiariesAndOtherBusinessUnitsFormated,					//取得子公司及其他营业单位支付现金净额
	paymentOfOtherCashRelatedToInvestmentActivitiesFormated,				//支付其他与投资活动有关的现金
	subtotalOfCashOutflowsFromInvestmentActivitiesFormated,					//投资活动现金流出小计
	netCashFlowGeneratedFromInvestmentActivitiesFormated,					//投资活动产生的现金流量净额
	cashReceivedFromAbsorbingInvestmentsFormated,							//吸收投资收到的现金
	cashReceivedFromMinorityInvestmentInSubsidiariesFormated,				//子公司吸收少数股东投资收到现金
	cashReceivedFromObtainingLoansFormated,									//取得借款收到的现金
	receivedOtherCashRelatedToFinancingActivitiesFormated,					//收到其他与筹资活动有关的现金
	subtotalOfCashInflowsFromFinancingActivitiesFormated,					//筹资活动现金流入小计
	cashRepaymentsOfAmountsBorrowedFormated,								//偿还债务支付的现金
	cashPaidForDistributingDividendsProfitsPayingInterestFormated,			//分配股利、利润或偿付利息支付的现金
	dividendsAndProfitsAaidBySubsidiariesToMinorityShareholdersFormated,	//子公司支付给少数股东的股利、利润
	paymentOfOtherCashRelatedToFinancingActivitiesFormated,					//支付其他与筹资活动有关的现金
	subtotalOfCashOutflowsFromFinancingActivitiesFormated,					//筹资活动现金流出小计
	netCashFlowGeneratedFromFinancingActivitiesFormated,					//筹资活动产生的现金流量净额
	theImpactOfExchangeRateFluctuationsOnCashAndCashEquivalentsFormated,	//汇率变动对现金及现金等价物的影响
	netIncreaseInCashAndCashEquivalentsFormated,							//现金及现金等价物净增加额
	openingCashAndCashEquivalentsBalanceFormated,							//期初现金及现金等价物余额
	closingBalanceOfCashAndCashEquivalentsFormated;							//期末现金及现金等价物余额
	
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
	public void setCashReceivedFromSellingGoodsAndProvidingServicesFormated(String cashReceivedFromSellingGoodsAndProvidingServicesFormated) {
		this.cashReceivedFromSellingGoodsAndProvidingServicesFormated=cashReceivedFromSellingGoodsAndProvidingServicesFormated;
	}
	
	public String getCashReceivedFromSellingGoodsAndProvidingServicesFormated() {
		return cashReceivedFromSellingGoodsAndProvidingServicesFormated;
	}
	
	//客户存款和同业存放款项净增加额
	public void setNetIncreaseInCustomerDepositsAndInterbankDepositsFormated(String netIncreaseInCustomerDepositsAndInterbankDepositsFormated) {
		this.netIncreaseInCustomerDepositsAndInterbankDepositsFormated=netIncreaseInCustomerDepositsAndInterbankDepositsFormated;
	}
	
	public String getNetIncreaseInCustomerDepositsAndInterbankDepositsFormated() {
		return netIncreaseInCustomerDepositsAndInterbankDepositsFormated;
	}
	
	//向中央银行借款净增加额
	public void setNetIncreaseInBorrowingFromTheCentralBankFormated(String netIncreaseInBorrowingFromTheCentralBankFormated) {
		this.netIncreaseInBorrowingFromTheCentralBankFormated=netIncreaseInBorrowingFromTheCentralBankFormated;
	}
	
	public String getNetIncreaseInBorrowingFromTheCentralBankFormated() {
		return netIncreaseInBorrowingFromTheCentralBankFormated;
	}
	
	//向其他金融机构拆入资金净增加额
	public void setNetIncreaseInBorrowingFundsFromOtherFinancialInstitutionsFormated(String netIncreaseInBorrowingFundsFromOtherFinancialInstitutionsFormated) {
		this.netIncreaseInBorrowingFundsFromOtherFinancialInstitutionsFormated=netIncreaseInBorrowingFundsFromOtherFinancialInstitutionsFormated;
	}
	
	public String getNetIncreaseInBorrowingFundsFromOtherFinancialInstitutionsFormated() {
		return netIncreaseInBorrowingFundsFromOtherFinancialInstitutionsFormated;
	}
	
	//收到原保险合同保费取得的现金
	public void setCashReceivedFromPremiumOfOriginalInsuranceContractFormated(String cashReceivedFromPremiumOfOriginalInsuranceContractFormated) {
		this.cashReceivedFromPremiumOfOriginalInsuranceContractFormated=cashReceivedFromPremiumOfOriginalInsuranceContractFormated;
	}
	
	public String getCashReceivedFromPremiumOfOriginalInsuranceContractFormated() {
		return cashReceivedFromPremiumOfOriginalInsuranceContractFormated;
	}
	
	//收到再保业务现金净额
	public void setReceiptOfReinsuranceNetCashFormated(String receiptOfReinsuranceNetCashFormated) {
		this.receiptOfReinsuranceNetCashFormated=receiptOfReinsuranceNetCashFormated;
	}
	
	public String getReceiptOfReinsuranceNetCashFormated() {
		return receiptOfReinsuranceNetCashFormated;
	}
	
	//保户储金及投资款净增加额
	public void setNetIncreaseInDepositsFromPolicyholdersFormated(String netIncreaseInDepositsFromPolicyholdersFormated) {
		this.netIncreaseInDepositsFromPolicyholdersFormated=netIncreaseInDepositsFromPolicyholdersFormated;
	}
	
	public String getNetIncreaseInDepositsFromPolicyholdersFormated() {
		return netIncreaseInDepositsFromPolicyholdersFormated;
	}
	
	//收取利息、手续费及佣金的现金
	public void setCashChargeInterestFeesAndCommissionsFormated(String cashChargeInterestFeesAndCommissionsFormated) {
		this.cashChargeInterestFeesAndCommissionsFormated=cashChargeInterestFeesAndCommissionsFormated;
	}
	
	public String getCashChargeInterestFeesAndCommissionsFormated() {
		return cashChargeInterestFeesAndCommissionsFormated;
	}
	
	//拆入资金净增加额
	public void setNetIncreaseInBorrowedFundsFormated(String netIncreaseInBorrowedFundsFormated) {
		this.netIncreaseInBorrowedFundsFormated=netIncreaseInBorrowedFundsFormated;
	}
	
	public String getNetIncreaseInBorrowedFundsFormated() {
		return netIncreaseInBorrowedFundsFormated;
	}
	
	//回购业务资金净增加额
	public void setNetIncreaseInRepurchaseBusinessFundsFormated(String netIncreaseInRepurchaseBusinessFundsFormated) {
		this.netIncreaseInRepurchaseBusinessFundsFormated=netIncreaseInRepurchaseBusinessFundsFormated;
	}
	
	public String getNetIncreaseInRepurchaseBusinessFundsFormated() {
		return netIncreaseInRepurchaseBusinessFundsFormated;
	}
	
	//代理买卖证券收到的现金净额
	public void setNetCashReceivedFromProxyTradingOfSecuritiesFormated(String netCashReceivedFromProxyTradingOfSecuritiesFormated) {
		this.netCashReceivedFromProxyTradingOfSecuritiesFormated=netCashReceivedFromProxyTradingOfSecuritiesFormated;
	}
	
	public String getNetCashReceivedFromProxyTradingOfSecuritiesFormated() {
		return netCashReceivedFromProxyTradingOfSecuritiesFormated;
	}
	
	//收到的税费返还
	public void setRefundsOfTaxesFormated(String refundsOfTaxesFormated) {
		this.refundsOfTaxesFormated=refundsOfTaxesFormated;
	}
	
	public String getRefundsOfTaxesFormated() {
		return refundsOfTaxesFormated;
	}
	
	//收到其他与经营活动有关的现金
	public void setOtherCashReceivedRelatingToOperatingActivitiesFormated(String otherCashReceivedRelatingToOperatingActivitiesFormated) {
		this.otherCashReceivedRelatingToOperatingActivitiesFormated=otherCashReceivedRelatingToOperatingActivitiesFormated;
	}
	
	public String getOtherCashReceivedRelatingToOperatingActivitiesFormated() {
		return otherCashReceivedRelatingToOperatingActivitiesFormated;
	}
	
	//经营活动现金流入小计
	public void setBusinessActivitiesSubtotalOfCashInflowsFormated(String businessActivitiesSubtotalOfCashInflowsFormated) {
		this.businessActivitiesSubtotalOfCashInflowsFormated=businessActivitiesSubtotalOfCashInflowsFormated;
	}
	
	public String getBusinessActivitiesSubtotalOfCashInflowsFormated() {
		return businessActivitiesSubtotalOfCashInflowsFormated;
	}
	
	//购买商品、接受劳务支付的现金
	public void setCashPaidForPurchasingGoodsAndReceivingServicesFormated(String cashPaidForPurchasingGoodsAndReceivingServicesFormated) {
		this.cashPaidForPurchasingGoodsAndReceivingServicesFormated=cashPaidForPurchasingGoodsAndReceivingServicesFormated;
	}
	
	public String getCashPaidForPurchasingGoodsAndReceivingServicesFormated() {
		return cashPaidForPurchasingGoodsAndReceivingServicesFormated;
	}
	
	//客户贷款及垫款净增加额
	public void setNetIncreaseInCustomerLoansAndAdvancesFormated(String netIncreaseInCustomerLoansAndAdvancesFormated) {
		this.netIncreaseInCustomerLoansAndAdvancesFormated=netIncreaseInCustomerLoansAndAdvancesFormated;
	}
	
	public String getNetIncreaseInCustomerLoansAndAdvancesFormated() {
		return netIncreaseInCustomerLoansAndAdvancesFormated;
	}
	
	//存放中央银行和同业款项净增加额
	public void setNetIncreaseInDepositsWithCentralBanksAndInterbankFundsFormated(String netIncreaseInDepositsWithCentralBanksAndInterbankFundsFormated) {
		this.netIncreaseInDepositsWithCentralBanksAndInterbankFundsFormated=netIncreaseInDepositsWithCentralBanksAndInterbankFundsFormated;
	}
	
	public String getNetIncreaseInDepositsWithCentralBanksAndInterbankFundsFormated() {
		return netIncreaseInDepositsWithCentralBanksAndInterbankFundsFormated;
	}
	
	//支付原保险合同赔付款项的现金
	public void setPaymentOfTheOriginalInsuranceContractToPayTheAmountOfCashFormated(String paymentOfTheOriginalInsuranceContractToPayTheAmountOfCashFormated) {
		this.paymentOfTheOriginalInsuranceContractToPayTheAmountOfCashFormated=paymentOfTheOriginalInsuranceContractToPayTheAmountOfCashFormated;
	}
	
	public String getPaymentOfTheOriginalInsuranceContractToPayTheAmountOfCashFormated() {
		return paymentOfTheOriginalInsuranceContractToPayTheAmountOfCashFormated;
	}
	
	//拆出资金净增加额
	public void setNetIncreaseInLendingFundsFormated(String netIncreaseInLendingFundsFormated) {
		this.netIncreaseInLendingFundsFormated=netIncreaseInLendingFundsFormated;
	}
	
	public String getNetIncreaseInLendingFundsFormated() {
		return netIncreaseInLendingFundsFormated;
	}
	
	//支付利息、手续费及佣金的现金
	public void setCashPaidForInterestHandlingFeesAndCommissionsFormated(String cashPaidForInterestHandlingFeesAndCommissionsFormated) {
		this.cashPaidForInterestHandlingFeesAndCommissionsFormated=cashPaidForInterestHandlingFeesAndCommissionsFormated;
	}
	
	public String getCashPaidForInterestHandlingFeesAndCommissionsFormated() {
		return cashPaidForInterestHandlingFeesAndCommissionsFormated;
	}
	
	//支付保单红利的现金
	public void setCashPaidForPolicyDividendsFormated(String cashPaidForPolicyDividendsFormated) {
		this.cashPaidForPolicyDividendsFormated=cashPaidForPolicyDividendsFormated;
	}
	
	public String getCashPaidForPolicyDividendsFormated() {
		return cashPaidForPolicyDividendsFormated;
	}
	
	//支付给职工以及为职工支付的现金
	public void setCashPaidToAndOnBehalfOfEmployeesFormated(String cashPaidToAndOnBehalfOfEmployeesFormated) {
		this.cashPaidToAndOnBehalfOfEmployeesFormated=cashPaidToAndOnBehalfOfEmployeesFormated;
	}
	
	public String getCashPaidToAndOnBehalfOfEmployeesFormated() {
		return cashPaidToAndOnBehalfOfEmployeesFormated;
	}
	
	//支付的各项税费
	public void setTaxesPaidFormated(String taxesPaidFormated) {
		this.taxesPaidFormated=taxesPaidFormated;
	}
	
	public String getTaxesPaidFormated() {
		return taxesPaidFormated;
	}
	
	//支付其他与经营活动有关的现金
	public void setPaymentOfOtherCashRelatedToOperatingActivitiesFormated(String paymentOfOtherCashRelatedToOperatingActivitiesFormated) {
		this.paymentOfOtherCashRelatedToOperatingActivitiesFormated=paymentOfOtherCashRelatedToOperatingActivitiesFormated;
	}
	
	public String getPaymentOfOtherCashRelatedToOperatingActivitiesFormated() {
		return paymentOfOtherCashRelatedToOperatingActivitiesFormated;
	}
	
	//经营活动现金流出小计
	public void setSubtotalOfCashOutflowsFromOperatingActivitiesFormated(String subtotalOfCashOutflowsFromOperatingActivitiesFormated) {
		this.subtotalOfCashOutflowsFromOperatingActivitiesFormated=subtotalOfCashOutflowsFromOperatingActivitiesFormated;
	}
	
	public String getSubtotalOfCashOutflowsFromOperatingActivitiesFormated() {
		return subtotalOfCashOutflowsFromOperatingActivitiesFormated;
	}
	
	//经营活动产生的现金流量净额
	public void setNetCashFlowFromOperatingFormated(String netCashFlowFromOperatingFormated) {
		this.netCashFlowFromOperatingFormated=netCashFlowFromOperatingFormated;
	}
	
	public String getNetCashFlowFromOperatingFormated() {
		return netCashFlowFromOperatingFormated;
	}
	
	//收回投资收到的现金
	public void setCashReceivedFromInvestmentRecoveryFormated(String cashReceivedFromInvestmentRecoveryFormated) {
		this.cashReceivedFromInvestmentRecoveryFormated=cashReceivedFromInvestmentRecoveryFormated;
	}
	
	public String getCashReceivedFromInvestmentRecoveryFormated() {
		return cashReceivedFromInvestmentRecoveryFormated;
	}
	
	//取得投资收益收到的现金
	public void setCashReceivedFromObtainingInvestmentReturnsFormated(String cashReceivedFromObtainingInvestmentReturnsFormated) {
		this.cashReceivedFromObtainingInvestmentReturnsFormated=cashReceivedFromObtainingInvestmentReturnsFormated;
	}
	
	public String getCashReceivedFromObtainingInvestmentReturnsFormated() {
		return cashReceivedFromObtainingInvestmentReturnsFormated;
	}
	
	//处置固定、无形和其他长期资产收回现金
	public void setNetCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssetsFormated(String netCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssetsFormated) {
		this.netCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssetsFormated=netCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssetsFormated;
	}
	
	public String getNetCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssetsFormated() {
		return netCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssetsFormated;
	}
	
	//处置子公司及其他营业单位收到现金净额
	public void setNetCashReceivedFromDisposalOfSubsidiariesAndOtherOperatingUnitsFormated(String netCashReceivedFromDisposalOfSubsidiariesAndOtherOperatingUnitsFormated) {
		this.netCashReceivedFromDisposalOfSubsidiariesAndOtherOperatingUnitsFormated=netCashReceivedFromDisposalOfSubsidiariesAndOtherOperatingUnitsFormated;
	}
	
	public String getNetCashReceivedFromDisposalOfSubsidiariesAndOtherOperatingUnitsFormated() {
		return netCashReceivedFromDisposalOfSubsidiariesAndOtherOperatingUnitsFormated;
	}
	
	//收到其他与投资活动有关的现金
	public void setReceivedOtherCashRelatedToInvestmentActivitiesFormated(String receivedOtherCashRelatedToInvestmentActivitiesFormated) {
		this.receivedOtherCashRelatedToInvestmentActivitiesFormated=receivedOtherCashRelatedToInvestmentActivitiesFormated;
	}
	
	public String getReceivedOtherCashRelatedToInvestmentActivitiesFormated() {
		return receivedOtherCashRelatedToInvestmentActivitiesFormated;
	}
	
	//投资活动现金流入小计
	public void setSubtotalOfCashInflowsFromInvestmentActivitiesFormated(String subtotalOfCashInflowsFromInvestmentActivitiesFormated) {
		this.subtotalOfCashInflowsFromInvestmentActivitiesFormated=subtotalOfCashInflowsFromInvestmentActivitiesFormated;
	}
	
	public String getSubtotalOfCashInflowsFromInvestmentActivitiesFormated() {
		return subtotalOfCashInflowsFromInvestmentActivitiesFormated;
	}
	
	//购建固定、无形和其他长期资产支付现金
	public void setCashPaidForPurchaseConstructionFixedIntangibleLongTermAssetsFormated(String cashPaidForPurchaseConstructionFixedIntangibleLongTermAssetsFormated) {
		this.cashPaidForPurchaseConstructionFixedIntangibleLongTermAssetsFormated=cashPaidForPurchaseConstructionFixedIntangibleLongTermAssetsFormated;
	}
	
	public String getCashPaidForPurchaseConstructionFixedIntangibleLongTermAssetsFormated() {
		return cashPaidForPurchaseConstructionFixedIntangibleLongTermAssetsFormated;
	}
	
	//投资支付的现金
	public void setCashPaidForInvestmentFormated(String cashPaidForInvestmentFormated) {
		this.cashPaidForInvestmentFormated=cashPaidForInvestmentFormated;
	}
	
	public String getCashPaidForInvestmentFormated() {
		return cashPaidForInvestmentFormated;
	}
	
	//质押贷款净增加额
	public void setNetIncreaseInPledgedLoansFormated(String netIncreaseInPledgedLoansFormated) {
		this.netIncreaseInPledgedLoansFormated=netIncreaseInPledgedLoansFormated;
	}
	
	public String getNetIncreaseInPledgedLoansFormated() {
		return netIncreaseInPledgedLoansFormated;
	}
	
	//取得子公司及其他营业单位支付现金净额
	public void setNetCashPaidToSubsidiariesAndOtherBusinessUnitsFormated(String netCashPaidToSubsidiariesAndOtherBusinessUnitsFormated) {
		this.netCashPaidToSubsidiariesAndOtherBusinessUnitsFormated=netCashPaidToSubsidiariesAndOtherBusinessUnitsFormated;
	}
	
	public String getNetCashPaidToSubsidiariesAndOtherBusinessUnitsFormated() {
		return netCashPaidToSubsidiariesAndOtherBusinessUnitsFormated;
	}
	
	//支付其他与投资活动有关的现金
	public void setPaymentOfOtherCashRelatedToInvestmentActivitiesFormated(String paymentOfOtherCashRelatedToInvestmentActivitiesFormated) {
		this.paymentOfOtherCashRelatedToInvestmentActivitiesFormated=paymentOfOtherCashRelatedToInvestmentActivitiesFormated;
	}
	
	public String getPaymentOfOtherCashRelatedToInvestmentActivitiesFormated() {
		return paymentOfOtherCashRelatedToInvestmentActivitiesFormated;
	}
	
	//投资活动现金流出小计
	public void setSubtotalOfCashOutflowsFromInvestmentActivitiesFormated(String subtotalOfCashOutflowsFromInvestmentActivitiesFormated) {
		this.subtotalOfCashOutflowsFromInvestmentActivitiesFormated=subtotalOfCashOutflowsFromInvestmentActivitiesFormated;
	}
	
	public String getSubtotalOfCashOutflowsFromInvestmentActivitiesFormated() {
		return subtotalOfCashOutflowsFromInvestmentActivitiesFormated;
	}
	
	//投资活动产生的现金流量净额
	public void setNetCashFlowGeneratedFromInvestmentActivitiesFormated(String netCashFlowGeneratedFromInvestmentActivitiesFormated) {
		this.netCashFlowGeneratedFromInvestmentActivitiesFormated=netCashFlowGeneratedFromInvestmentActivitiesFormated;
	}
	
	public String getNetCashFlowGeneratedFromInvestmentActivitiesFormated() {
		return netCashFlowGeneratedFromInvestmentActivitiesFormated;
	}
	
	//吸收投资收到的现金
	public void setCashReceivedFromAbsorbingInvestmentsFormated(String cashReceivedFromAbsorbingInvestmentsFormated) {
		this.cashReceivedFromAbsorbingInvestmentsFormated=cashReceivedFromAbsorbingInvestmentsFormated;
	}
	
	public String getCashReceivedFromAbsorbingInvestmentsFormated() {
		return cashReceivedFromAbsorbingInvestmentsFormated;
	}
	
	//子公司吸收少数股东投资收到现金
	public void setCashReceivedFromMinorityInvestmentInSubsidiariesFormated(String cashReceivedFromMinorityInvestmentInSubsidiariesFormated) {
		this.cashReceivedFromMinorityInvestmentInSubsidiariesFormated=cashReceivedFromMinorityInvestmentInSubsidiariesFormated;
	}
	
	public String getCashReceivedFromMinorityInvestmentInSubsidiariesFormated() {
		return cashReceivedFromMinorityInvestmentInSubsidiariesFormated;
	}
	
	//取得借款收到的现金
	public void setCashReceivedFromObtainingLoansFormated(String cashReceivedFromObtainingLoansFormated) {
		this.cashReceivedFromObtainingLoansFormated=cashReceivedFromObtainingLoansFormated;
	}
	
	public String getCashReceivedFromObtainingLoansFormated() {
		return cashReceivedFromObtainingLoansFormated;
	}
	
	//收到其他与筹资活动有关的现金
	public void setReceivedOtherCashRelatedToFinancingActivitiesFormated(String receivedOtherCashRelatedToFinancingActivitiesFormated) {
		this.receivedOtherCashRelatedToFinancingActivitiesFormated=receivedOtherCashRelatedToFinancingActivitiesFormated;
	}
	
	public String getReceivedOtherCashRelatedToFinancingActivitiesFormated() {
		return receivedOtherCashRelatedToFinancingActivitiesFormated;
	}
	
	//筹资活动现金流入小计
	public void setSubtotalOfCashInflowsFromFinancingActivitiesFormated(String subtotalOfCashInflowsFromFinancingActivitiesFormated) {
		this.subtotalOfCashInflowsFromFinancingActivitiesFormated=subtotalOfCashInflowsFromFinancingActivitiesFormated;
	}
	
	public String getSubtotalOfCashInflowsFromFinancingActivitiesFormated() {
		return subtotalOfCashInflowsFromFinancingActivitiesFormated;
	}
	
	//偿还债务支付的现金
	public void setCashRepaymentsOfAmountsBorrowedFormated(String cashRepaymentsOfAmountsBorrowedFormated) {
		this.cashRepaymentsOfAmountsBorrowedFormated=cashRepaymentsOfAmountsBorrowedFormated;
	}
	
	public String getCashRepaymentsOfAmountsBorrowedFormated() {
		return cashRepaymentsOfAmountsBorrowedFormated;
	}
	
	//分配股利、利润或偿付利息支付的现金
	public void setCashPaidForDistributingDividendsProfitsPayingInterestFormated(String cashPaidForDistributingDividendsProfitsPayingInterestFormated) {
		this.cashPaidForDistributingDividendsProfitsPayingInterestFormated=cashPaidForDistributingDividendsProfitsPayingInterestFormated;
	}
	
	public String getCashPaidForDistributingDividendsProfitsPayingInterestFormated() {
		return cashPaidForDistributingDividendsProfitsPayingInterestFormated;
	}
	
	//子公司支付给少数股东的股利、利润
	public void setDividendsAndProfitsAaidBySubsidiariesToMinorityShareholdersFormated(String dividendsAndProfitsAaidBySubsidiariesToMinorityShareholdersFormated) {
		this.dividendsAndProfitsAaidBySubsidiariesToMinorityShareholdersFormated=dividendsAndProfitsAaidBySubsidiariesToMinorityShareholdersFormated;
	}
	
	public String getDividendsAndProfitsAaidBySubsidiariesToMinorityShareholdersFormated() {
		return dividendsAndProfitsAaidBySubsidiariesToMinorityShareholdersFormated;
	}
	
	//支付其他与筹资活动有关的现金
	public void setPaymentOfOtherCashRelatedToFinancingActivitiesFormated(String paymentOfOtherCashRelatedToFinancingActivitiesFormated) {
		this.paymentOfOtherCashRelatedToFinancingActivitiesFormated=paymentOfOtherCashRelatedToFinancingActivitiesFormated;
	}
	
	public String getPaymentOfOtherCashRelatedToFinancingActivitiesFormated() {
		return paymentOfOtherCashRelatedToFinancingActivitiesFormated;
	}
	
	//筹资活动现金流出小计
	public void setSubtotalOfCashOutflowsFromFinancingActivitiesFormated(String subtotalOfCashOutflowsFromFinancingActivitiesFormated) {
		this.subtotalOfCashOutflowsFromFinancingActivitiesFormated=subtotalOfCashOutflowsFromFinancingActivitiesFormated;
	}
	
	public String getSubtotalOfCashOutflowsFromFinancingActivitiesFormated() {
		return subtotalOfCashOutflowsFromFinancingActivitiesFormated;
	}
	
	//筹资活动产生的现金流量净额
	public void setNetCashFlowGeneratedFromFinancingActivitiesFormated(String netCashFlowGeneratedFromFinancingActivitiesFormated) {
		this.netCashFlowGeneratedFromFinancingActivitiesFormated=netCashFlowGeneratedFromFinancingActivitiesFormated;
	}
	
	public String getNetCashFlowGeneratedFromFinancingActivitiesFormated() {
		return netCashFlowGeneratedFromFinancingActivitiesFormated;
	}
	
	//汇率变动对现金及现金等价物的影响
	public void setTheImpactOfExchangeRateFluctuationsOnCashAndCashEquivalentsFormated(String theImpactOfExchangeRateFluctuationsOnCashAndCashEquivalentsFormated) {
		this.theImpactOfExchangeRateFluctuationsOnCashAndCashEquivalentsFormated=theImpactOfExchangeRateFluctuationsOnCashAndCashEquivalentsFormated;
	}
	
	public String getTheImpactOfExchangeRateFluctuationsOnCashAndCashEquivalentsFormated() {
		return theImpactOfExchangeRateFluctuationsOnCashAndCashEquivalentsFormated;
	}
	
	//现金及现金等价物净增加额
	public void setNetIncreaseInCashAndCashEquivalentsFormated(String netIncreaseInCashAndCashEquivalentsFormated) {
		this.netIncreaseInCashAndCashEquivalentsFormated=netIncreaseInCashAndCashEquivalentsFormated;
	}
	
	public String getNetIncreaseInCashAndCashEquivalentsFormated() {
		return netIncreaseInCashAndCashEquivalentsFormated;
	}
	
	//期初现金及现金等价物余额
	public void setOpeningCashAndCashEquivalentsBalanceFormated(String openingCashAndCashEquivalentsBalanceFormated) {
		this.openingCashAndCashEquivalentsBalanceFormated=openingCashAndCashEquivalentsBalanceFormated;
	}
	
	public String getOpeningCashAndCashEquivalentsBalanceFormated() {
		return openingCashAndCashEquivalentsBalanceFormated;
	}
	
	//期末现金及现金等价物余额
	public void setClosingBalanceOfCashAndCashEquivalentsFormated(String closingBalanceOfCashAndCashEquivalentsFormated) {
		this.closingBalanceOfCashAndCashEquivalentsFormated=closingBalanceOfCashAndCashEquivalentsFormated;
	}
	
	public String getClosingBalanceOfCashAndCashEquivalentsFormated() {
		return closingBalanceOfCashAndCashEquivalentsFormated;
	}
}
