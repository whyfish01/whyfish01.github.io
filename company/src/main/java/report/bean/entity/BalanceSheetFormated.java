package report.bean.entity;

public class BalanceSheetFormated {
	String 
	financialReportingNo,					//财报编号
	AShareCode,								//A股代码
	AShareName,								//A股简称
	financialReportingYear,					//财报年份
	auditOpinion,							//审计意见
	createDateTime,							//创建时间
	updateDateTime,							//更新时间
	monetaryCapitalFormated,						//货币资金
	settlementProvisionsFormated,					//结算备付金
	lendingFundsFormated,							//拆出资金
	tradingFinancialAssetsFormated,					//交易性金融资产
	tradingFinancialAssetsManagementFormated,		//交易性金融资产理财
	derivativeFinancialAssetsFormated,				//衍生金融资产
	billReceivableFormated,							//应收票据
	accountsReceivableFormated,						//应收账款
	accountsReceivableFinancingFormated,			//应收款项融资
	prepaymentsFormated,							//预付款项
	premiumReceivableFormated,						//应收保费
	accountsReceivableReinsuranceFormated,			//应收分保账款
	receivableReserveForReinsuranceContractsFormated,	//应收分保合同准备金
	otherReceivablesFormated,						//其他应收款
	interestReceivableFormated,						//应付利息
	dividendReceivableFormated,						//应付股利
	buyingBackFinancialAssetsFormated,				//买入返售金融资产
	inventoryFormated,								//存货
	contractAssetsFormated,							//合同资产
	assetsHeldForSaleFormated,						//持有待售资产
	nonCurrentAssetsDueWithinOneYearFormated,		//一年到期非流动资产
	otherCurrentAssetsFormated,						//其他流动资产
	otherCurrentAssetsManagementFormated,			//其他流动资产理财
	totalCurrentAssetsFormated,						//流动资产合计
	grantingLoansAndAdvancesFormated,				//发放贷款和垫款
	debtInvestmentFormated,							//债权投资
	otherDebtInvestmentFormated,					//其他债权投资
	longTermReceivablesFormated,					//长期应收款
	longTermEquityInvestmentFormated,				//长期股权投资
	otherEquityInstrumentInvestmentsFormated,		//其他权益工具投资
	otherNonCurrentFinancialAssetsFormated,			//其他非流动金融资产
	investmentRealEstateFormated,					//投资性房地产
	fixedAssetsFormated,							//固定资产
	constructionInProgressFormated,					//在建工程
	productiveBiologicalAssetsFormated,				//生产性生物资产
	oilAndGasAssetsFormated,						//油气资产
	rightOfUseAssetsFormated,						//使用权资产
	intangibleAssetsFormated,						//无形资产
	developmentExpenditureFormated,					//开发支出
	goodwillFormated,								//商誉
	longTermDeferredExpenseFormated,				//长期待摊费用
	deferredTaxAssetsFormated,						//递延所得税资产
	otherNonCurrentAssetsFormated,					//其他非流动资产
	totalNonCurrentAssetsFormated,					//非流动资产合计
	totalAssetsFormated,							//资产总计
	longTermEquityInvestmentsUnrelatedToMainBusinessFormated,		//与主业无关的长期股权投资
	incomeFromLongTermEquityInvestmentsFormated,	//长期权益投资的收益
	shortTermBorrowingFormated,						//短期借款
	borrowingFromTheCentralBankFormated,			//向中央银行借款
	borrowingFundsFormated,							//拆入资金
	tradingFinancialLiabilitiesFormated,			//交易性金融负债
	derivativeFinancialLiabilitiesFormated,			//衍生金融负债
	notesPayableFormated,							//应付票据
	accountsPayableFormated,						//应付账款
	advanceReceiptsFormated,						//预收款项
	contractLiabilitiesFormated,					//合同负债
	financialAssetsSoldForRepurchaseFormated,		//卖出回购金融资产款
	depositAbsorptionAndInterbankDepositsFormated,	//吸收存款及同业存放
	actingTradingSecuritiesFormated,				//代理买卖证券款
	actingUnderwritingSecuritiesFormated,			//代理承销证券款
	payrollPayableFormated,							//应付职工薪酬
	taxPayableFormated,								//应交税费
	otherPayablesFormated,							//其他应付款
	interestPayableFormated,						//应付利息
	dividendPayableFormated,						//应付股利
	payableHandlingFeesAndCommissionsFormated,		//应付手续费及佣金
	accountsPayableReinsuranceFormated,				//应付分保账款
	heldForSaleLiabilitiesFormated,					//持有待售负债
	nonCurrentLiabilitiesDueWithinOneYearFormated,	//一年到期非流动负债
	otherCurrentLiabilitiesFormated,				//其他流动负债
	totalCurrentLiabilitiesFormated,				//流动负债合计
	insuranceContractReservesFormated,				//保险合同准备金
	longTermLoanFormated,							//长期借款
	bondsPayableFormated,							//应付债券
	bondsPayablepreferredSharesFormated,			//应付债券：优先股
	bondsPayableperpetualCapitalSecuritiesFormated,	//应付债券：永续债
	leaseLiabilitiesFormated,						//租赁负债
	longTermPayablesFormated,						//长期应付款
	longTermEmployeeCompensationPayableFormated,	//长期应付职工薪酬
	estimatedLiabilitiesFormated,					//预计负债
	deferredIncomeFormated,							//递延收益
	deferredIncomeTaxesFormated,					//递延所得税负债
	otherNonCurrentLiabilitiesFormated,				//其他非流动负债
	totalNonCurrentLiabilitiesFormated,				//非流动负债合计
	totalLiabilitiesFormated,						//负债总计
	equityFormated,									//股本
	otherEquityInstrumentsFormated,					//其他权益工具
	otherEquityInstrumentspreferredSharesFormated,	//其他权益工具：优先股
	otherEquityInstrumentspetualCapitalSecuritiesFormated,		//其他权益工具：永续债
	capitalReserveFormated,							//资本公积
	treasuryStockFormated,							//库存股
	otherComprehensiveIncomeFormated,				//其他综合收益
	specialReservesFormated,						//专项储备
	surplusReservesFormated,						//盈余公积
	generalRiskProvisionsFormated,					//一般风险准备
	undistributedProfitFormated,					//未分配利润
	totalEquityAttributableOfParentCompanyFormated,	//归属母公司所有者权益合计
	minorityInterestFormated,						//少数股东权益
	totalOwnersEquityFormated,						//所有者权益合计
	totalLiabilitiesAndOwnersEquityFormated;		//负债和所有者权益总计
	int totalNumberOfPeople;				//总人数

	
	//财报编号：财报年份+六位数字编号
	public void setFinancialReportingNo(String financialReportingNo) {
		this.financialReportingNo=financialReportingNo;
	}
	
	public String getFinancialReportingNo() {
		return financialReportingNo;
	}
	
	//A股代码
	public void setAShareCode(String AShareCode) {
		this.AShareCode=AShareCode;
	}
	
	public String getAShareCode() {
		return AShareCode;
	}
	
	//A股简称
	public void setAShareName(String AShareName) {
		this.AShareName=AShareName;
	}
	
	public String getAShareName() {
		return AShareName;
	}
	
	//财报年份
	public void setFinancialReportingYear(String financialReportingYear) {
		this.financialReportingYear=financialReportingYear;
	}
	
	public String getFinancialReportingYear() {
		return financialReportingYear;
	}
	
	//审计意见
	public void setAuditOpinion(String auditOpinion) {
		this.auditOpinion=auditOpinion;
	}
	
	public String getAuditOpinion() {
		return auditOpinion;
	}
	
	//创建时间
	public void setCreateDateTime(String createDateTime) {
		this.createDateTime=createDateTime;
	}
	
	public String getCreateDateTime() {
		return createDateTime;
	}

	//更新时间
	public void setUpdateDateTime(String updateDateTime) {
		this.updateDateTime=updateDateTime;
	}
	
	public String getUpdateDateTime() {
		return updateDateTime;
	}

	//货币资金
	public void setMonetaryCapitalFormated(String monetaryCapitalFormated) {
		this.monetaryCapitalFormated=monetaryCapitalFormated;
		if (monetaryCapitalFormated==".00") {
			monetaryCapitalFormated="";
		}
	}
	
	public String getMonetaryCapitalFormated() {
		return monetaryCapitalFormated;
	}

	//结算备付金
	public void setSettlementProvisionsFormated(String settlementProvisionsFormated) {
		this.settlementProvisionsFormated=settlementProvisionsFormated;
	}
	
	public String getSettlementProvisionsFormated() {
		return settlementProvisionsFormated;
	}

	//拆出资金
	public void setLendingFundsFormated(String lendingFundsFormated) {
		this.lendingFundsFormated=lendingFundsFormated;
	}
	
	public String getLendingFundsFormated() {
		return lendingFundsFormated;
	}

	//交易性金融资产
	public void setTradingFinancialAssetsFormated(String tradingFinancialAssetsFormated) {
		this.tradingFinancialAssetsFormated=tradingFinancialAssetsFormated;
	}
	
	public String getTradingFinancialAssetsFormated() {
		return tradingFinancialAssetsFormated;
	}

	//交易性金融资产理财
	public void setTradingFinancialAssetsManagementFormated(String tradingFinancialAssetsManagementFormated) {
		this.tradingFinancialAssetsManagementFormated=tradingFinancialAssetsManagementFormated;
	}
	
	public String getTradingFinancialAssetsManagementFormated() {
		return tradingFinancialAssetsManagementFormated;
	}

	//衍生金融资产
	public void setDerivativeFinancialAssetsFormated(String derivativeFinancialAssetsFormated) {
		this.derivativeFinancialAssetsFormated=derivativeFinancialAssetsFormated;
	}
	
	public String getDerivativeFinancialAssetsFormated() {
		return derivativeFinancialAssetsFormated;
	}

	//应收票据
	public void setBillReceivableFormated(String billReceivableFormated) {
		this.billReceivableFormated=billReceivableFormated;
	}
	
	public String getBillReceivableFormated() {
		return billReceivableFormated;
	}
	
	//应收账款
	public void setAccountsReceivableFormated(String accountsReceivableFormated) {
		this.accountsReceivableFormated=accountsReceivableFormated;
	}
	
	public String getAccountsReceivableFormated() {
		return accountsReceivableFormated;
	}
	
	//应收款项融资
	public void setAccountsReceivableFinancingFormated(String accountsReceivableFinancingFormated) {
		this.accountsReceivableFinancingFormated=accountsReceivableFinancingFormated;
	}
		
	public String getAccountsReceivableFinancingFormated() {
		return accountsReceivableFinancingFormated;
	}
	
	//预付款项
	public void setPrepaymentsFormated(String prepaymentsFormated) {
		this.prepaymentsFormated=prepaymentsFormated;
	}
			
	public String getPrepaymentsFormated() {
		return prepaymentsFormated;
	}
	
	//应收保费
	public void setPremiumReceivableFormated(String premiumReceivableFormated) {
		this.premiumReceivableFormated=premiumReceivableFormated;
	}
				
	public String getPremiumReceivableFormated() {
		return premiumReceivableFormated;
	}
	
	//应收分保账款
	public void setAccountsReceivableReinsuranceFormated(String accountsReceivableReinsuranceFormated) {
		this.accountsReceivableReinsuranceFormated=accountsReceivableReinsuranceFormated;
	}
					
	public String getAccountsReceivableReinsuranceFormated() {
		return accountsReceivableReinsuranceFormated;
	}
	
	//应收分保合同准备金
	public void setReceivableReserveForReinsuranceContractsFormated(String receivableReserveForReinsuranceContractsFormated) {
		this.receivableReserveForReinsuranceContractsFormated=receivableReserveForReinsuranceContractsFormated;
	}
					
	public String getReceivableReserveForReinsuranceContractsFormated() {
		return receivableReserveForReinsuranceContractsFormated;
	}
	
	//其他应收款
	public void setOtherReceivablesFormated(String otherReceivablesFormated) {
		this.otherReceivablesFormated=otherReceivablesFormated;
	}
					
	public String getOtherReceivablesFormated() {
		return otherReceivablesFormated;
	}
	
	//应付利息
	public void setInterestReceivableFormated(String interestReceivableFormated) {
		this.interestReceivableFormated=interestReceivableFormated;
	}
					
	public String getInterestReceivableFormated() {
		return interestReceivableFormated;
	}
	
	//应付股利
	public void setDividendReceivableFormated(String dividendReceivableFormated) {
		this.dividendReceivableFormated=dividendReceivableFormated;
	}
					
	public String getDividendReceivableFormated() {
		return dividendReceivableFormated;
	}
	
	//买入返售金融资产
	public void setBuyingBackFinancialAssetsFormated(String buyingBackFinancialAssetsFormated) {
		this.buyingBackFinancialAssetsFormated=buyingBackFinancialAssetsFormated;
	}
					
	public String getBuyingBackFinancialAssetsFormated() {
		return buyingBackFinancialAssetsFormated;
	}
	
	//存货
	public void setInventoryFormated(String inventoryFormated) {
		this.inventoryFormated=inventoryFormated;
	}
					
	public String getInventoryFormated() {
		return inventoryFormated;
	}
	
	//合同资产
	public void setContractAssetsFormated(String contractAssetsFormated) {
		this.contractAssetsFormated=contractAssetsFormated;
	}
					
	public String getContractAssetsFormated() {
		return contractAssetsFormated;
	}
	
	//持有待售资产
	public void setAssetsHeldForSaleFormated(String assetsHeldForSaleFormated) {
		this.assetsHeldForSaleFormated=assetsHeldForSaleFormated;
	}
					
	public String getAssetsHeldForSaleFormated() {
		return assetsHeldForSaleFormated;
	}
	
	//一年到期非流动资产
	public void setNonCurrentAssetsDueWithinOneYearFormated(String nonCurrentAssetsDueWithinOneYearFormated) {
		this.nonCurrentAssetsDueWithinOneYearFormated=nonCurrentAssetsDueWithinOneYearFormated;
	}
					
	public String getNonCurrentAssetsDueWithinOneYearFormated() {
		return nonCurrentAssetsDueWithinOneYearFormated;
	}
	
	//其他流动资产
	public void setOtherCurrentAssetsFormated(String otherCurrentAssetsFormated) {
		this.otherCurrentAssetsFormated=otherCurrentAssetsFormated;
	}
					
	public String getOtherCurrentAssetsFormated() {
		return otherCurrentAssetsFormated;
	}
	
	//其他流动资产理财
	public void setOtherCurrentAssetsManagementFormated(String otherCurrentAssetsManagementFormated) {
		this.otherCurrentAssetsManagementFormated=otherCurrentAssetsManagementFormated;
	}
					
	public String getOtherCurrentAssetsManagementFormated() {
		return otherCurrentAssetsManagementFormated;
	}
	
	//流动资产合计
	public void setTotalCurrentAssetsFormated(String totalCurrentAssetsFormated) {
		this.totalCurrentAssetsFormated=totalCurrentAssetsFormated;
	}
					
	public String getTotalCurrentAssetsFormated() {
		return totalCurrentAssetsFormated;
	}
	
	
	//发放贷款和垫款
	public void setGrantingLoansAndAdvancesFormated(String grantingLoansAndAdvancesFormated) {
		this.grantingLoansAndAdvancesFormated=grantingLoansAndAdvancesFormated;
	}
					
	public String getGrantingLoansAndAdvancesFormated() {
		return grantingLoansAndAdvancesFormated;
	}
	
	//债权投资
	public void setDebtInvestmentFormated(String debtInvestmentFormated) {
		this.debtInvestmentFormated=debtInvestmentFormated;
	}
					
	public String getDebtInvestmentFormated() {
		return debtInvestmentFormated;
	}
	
	//其他债权投资
	public void setOtherDebtInvestmentFormated(String otherDebtInvestmentFormated) {
		this.otherDebtInvestmentFormated=otherDebtInvestmentFormated;
	}
						
	public String getOtherDebtInvestmentFormated() {
		return otherDebtInvestmentFormated;
	}
	
	//长期应收款
	public void setLongTermReceivablesFormated(String longTermReceivablesFormated) {
		this.longTermReceivablesFormated=longTermReceivablesFormated;
	}
						
	public String getLongTermReceivablesFormated() {
		return longTermReceivablesFormated;
	}
	
	//长期股权投资
	public void setLongTermEquityInvestmentFormated(String longTermEquityInvestmentFormated) {
		this.longTermEquityInvestmentFormated=longTermEquityInvestmentFormated;
	}
						
	public String getLongTermEquityInvestmentFormated() {
		return longTermEquityInvestmentFormated;
	}
	
	//其他权益工具投资
	public void setOtherEquityInstrumentInvestmentsFormated(String otherEquityInstrumentInvestmentsFormated) {
		this.otherEquityInstrumentInvestmentsFormated=otherEquityInstrumentInvestmentsFormated;
	}
						
	public String getOtherEquityInstrumentInvestmentsFormated() {
		return otherEquityInstrumentInvestmentsFormated;
	}
	
	//其他非流动金融资产
	public void setOtherNonCurrentFinancialAssetsFormated(String otherNonCurrentFinancialAssetsFormated) {
		this.otherNonCurrentFinancialAssetsFormated=otherNonCurrentFinancialAssetsFormated;
	}
						
	public String getOtherNonCurrentFinancialAssetsFormated() {
		return otherNonCurrentFinancialAssetsFormated;
	}
	
	//投资性房地产
	public void setInvestmentRealEstateFormated(String investmentRealEstateFormated) {
		this.investmentRealEstateFormated=investmentRealEstateFormated;
	}
						
	public String getInvestmentRealEstateFormated() {
		return investmentRealEstateFormated;
	}
	
	//固定资产
	public void setFixedAssetsFormated(String fixedAssetsFormated) {
		this.fixedAssetsFormated=fixedAssetsFormated;
	}
						
	public String getFixedAssetsFormated() {
		return fixedAssetsFormated;
	}
	
	//在建工程
	public void setConstructionInProgressFormated(String constructionInProgressFormated) {
		this.constructionInProgressFormated=constructionInProgressFormated;
	}
						
	public String getConstructionInProgressFormated() {
		return constructionInProgressFormated;
	}
	
	//生产性生物资产
	public void setProductiveBiologicalAssetsFormated(String productiveBiologicalAssetsFormated) {
		this.productiveBiologicalAssetsFormated=productiveBiologicalAssetsFormated;
	}
						
	public String getProductiveBiologicalAssetsFormated() {
		return productiveBiologicalAssetsFormated;
	}
	
	//油气资产
	public void setOilAndGasAssetsFormated(String oilAndGasAssetsFormated) {
		this.oilAndGasAssetsFormated=oilAndGasAssetsFormated;
	}
						
	public String getOilAndGasAssetsFormated() {
		return oilAndGasAssetsFormated;
	}

	//使用权资产
	public void setRightOfUseAssetsFormated(String rightOfUseAssetsFormated) {
		this.rightOfUseAssetsFormated=rightOfUseAssetsFormated;
	}
						
	public String getRightOfUseAssetsFormated() {
		return rightOfUseAssetsFormated;
	}
	
	//无形资产
	public void setIntangibleAssetsFormated(String intangibleAssetsFormated) {
		this.intangibleAssetsFormated=intangibleAssetsFormated;
	}
						
	public String getIntangibleAssetsFormated() {
		return intangibleAssetsFormated;
	}
	
	//开发支出
	public void setDevelopmentExpenditureFormated(String developmentExpenditureFormated) {
		this.developmentExpenditureFormated=developmentExpenditureFormated;
	}
						
	public String getDevelopmentExpenditureFormated() {
		return developmentExpenditureFormated;
	}
	
	//商誉
	public void setGoodwillFormated(String goodwillFormated) {
		this.goodwillFormated=goodwillFormated;
	}
						
	public String getGoodwillFormated() {
		return goodwillFormated;
	}
	
	//长期待摊费用
	public void setLongTermDeferredExpenseFormated(String longTermDeferredExpenseFormated) {
		this.longTermDeferredExpenseFormated=longTermDeferredExpenseFormated;
	}
						
	public String getLongTermDeferredExpenseFormated() {
		return longTermDeferredExpenseFormated;
	}
	
	//递延所得税资产
	public void setDeferredTaxAssetsFormated(String deferredTaxAssetsFormated) {
		this.deferredTaxAssetsFormated=deferredTaxAssetsFormated;
	}
						
	public String getDeferredTaxAssetsFormated() {
		return deferredTaxAssetsFormated;
	}
	
	//其他非流动资产
	public void setOtherNonCurrentAssetsFormated(String otherNonCurrentAssetsFormated) {
		this.otherNonCurrentAssetsFormated=otherNonCurrentAssetsFormated;
	}
						
	public String getOtherNonCurrentAssetsFormated() {
		return otherNonCurrentAssetsFormated;
	}
	
	//非流动资产合计
	public void setTotalNonCurrentAssetsFormated(String totalNonCurrentAssetsFormated) {
		this.totalNonCurrentAssetsFormated=totalNonCurrentAssetsFormated;
	}
						
	public String getTotalNonCurrentAssetsFormated() {
		return totalNonCurrentAssetsFormated;
	}
	
	//资产总计
	public void setTotalAssetsFormated(String totalAssetsFormated) {
		this.totalAssetsFormated=totalAssetsFormated;
	}
						
	public String getTotalAssetsFormated() {
		return totalAssetsFormated;
	}
	
	//与主业无关的长期股权投资
	public void setLongTermEquityInvestmentsUnrelatedToMainBusinessFormated(String longTermEquityInvestmentsUnrelatedToMainBusinessFormated) {
		this.longTermEquityInvestmentsUnrelatedToMainBusinessFormated=longTermEquityInvestmentsUnrelatedToMainBusinessFormated;
	}
						
	public String getLongTermEquityInvestmentsUnrelatedToMainBusinessFormated() {
		return longTermEquityInvestmentsUnrelatedToMainBusinessFormated;
	}
	
	//长期权益投资的收益
	public void setIncomeFromLongTermEquityInvestmentsFormated(String incomeFromLongTermEquityInvestmentsFormated) {
		this.incomeFromLongTermEquityInvestmentsFormated=incomeFromLongTermEquityInvestmentsFormated;
	}
						
	public String getIncomeFromLongTermEquityInvestmentsFormated() {
		return incomeFromLongTermEquityInvestmentsFormated;
	}
	
	//短期借款
	public void setShortTermBorrowingFormated(String shortTermBorrowingFormated) {
		this.shortTermBorrowingFormated=shortTermBorrowingFormated;
	}
						
	public String getShortTermBorrowingFormated() {
		return shortTermBorrowingFormated;
	}
	
	//向中央银行借款
	public void setBorrowingFromTheCentralBankFormated(String borrowingFromTheCentralBankFormated) {
		this.borrowingFromTheCentralBankFormated=borrowingFromTheCentralBankFormated;
	}
						
	public String getBorrowingFromTheCentralBankFormated() {
		return borrowingFromTheCentralBankFormated;
	}
	
	//拆入资金
	public void setBorrowingFundsFormated(String borrowingFundsFormated) {
		this.borrowingFundsFormated=borrowingFundsFormated;
	}
						
	public String getBorrowingFundsFormated() {
		return borrowingFundsFormated;
	}
	
	//交易性金融负债
	public void setTradingFinancialLiabilitiesFormated(String tradingFinancialLiabilitiesFormated) {
		this.tradingFinancialLiabilitiesFormated=tradingFinancialLiabilitiesFormated;
	}
						
	public String getTradingFinancialLiabilitiesFormated() {
		return tradingFinancialLiabilitiesFormated;
	}
	
	//衍生金融负债
	public void setDerivativeFinancialLiabilitiesFormated(String derivativeFinancialLiabilitiesFormated) {
		this.derivativeFinancialLiabilitiesFormated=derivativeFinancialLiabilitiesFormated;
	}
						
	public String getDerivativeFinancialLiabilitiesFormated() {
		return derivativeFinancialLiabilitiesFormated;
	}
	
	//应付票据
	public void setNotesPayableFormated(String notesPayableFormated) {
		this.notesPayableFormated=notesPayableFormated;
	}
						
	public String getNotesPayableFormated() {
		return notesPayableFormated;
	}
	
	//应付账款
	public void setAccountsPayableFormated(String accountsPayableFormated) {
		this.accountsPayableFormated=accountsPayableFormated;
	}
						
	public String getAccountsPayableFormated() {
		return accountsPayableFormated;
	}
	
	//预收款项
	public void setAdvanceReceiptsFormated(String advanceReceiptsFormated) {
		this.advanceReceiptsFormated=advanceReceiptsFormated;
	}
						
	public String getAdvanceReceiptsFormated() {
		return advanceReceiptsFormated;
	}
	
	//合同负债
	public void setContractLiabilitiesFormated(String contractLiabilitiesFormated) {
		this.contractLiabilitiesFormated=contractLiabilitiesFormated;
	}
						
	public String getContractLiabilitiesFormated() {
		return contractLiabilitiesFormated;
	}
	
	//卖出回购金融资产款
	public void setFinancialAssetsSoldForRepurchaseFormated(String financialAssetsSoldForRepurchaseFormated) {
		this.financialAssetsSoldForRepurchaseFormated=financialAssetsSoldForRepurchaseFormated;
	}
						
	public String getFinancialAssetsSoldForRepurchaseFormated() {
		return financialAssetsSoldForRepurchaseFormated;
	}
	
	//吸收存款及同业存放
	public void setDepositAbsorptionAndInterbankDepositsFormated(String depositAbsorptionAndInterbankDepositsFormated) {
		this.depositAbsorptionAndInterbankDepositsFormated=depositAbsorptionAndInterbankDepositsFormated;
	}
						
	public String getDepositAbsorptionAndInterbankDepositsFormated() {
		return depositAbsorptionAndInterbankDepositsFormated;
	}
	
	//代理买卖证券款
	public void setActingTradingSecuritiesFormated(String actingTradingSecuritiesFormated) {
		this.actingTradingSecuritiesFormated=actingTradingSecuritiesFormated;
	}
						
	public String getActingTradingSecuritiesFormated() {
		return actingTradingSecuritiesFormated;
	}
	
	//代理承销证券款
	public void setActingUnderwritingSecuritiesFormated(String actingUnderwritingSecuritiesFormated) {
		this.actingUnderwritingSecuritiesFormated=actingUnderwritingSecuritiesFormated;
	}
						
	public String getActingUnderwritingSecuritiesFormated() {
		return actingUnderwritingSecuritiesFormated;
	}
	
	//应付职工薪酬
	public void setPayrollPayableFormated(String payrollPayableFormated) {
		this.payrollPayableFormated=payrollPayableFormated;
	}
						
	public String getPayrollPayableFormated() {
		return payrollPayableFormated;
	}
	
	//应交税费
	public void setTaxPayableFormated(String taxPayableFormated) {
		this.taxPayableFormated=taxPayableFormated;
	}
						
	public String getTaxPayableFormated() {
		return taxPayableFormated;
	}
	
	//其他应付款
	public void setOtherPayablesFormated(String otherPayablesFormated) {
		this.otherPayablesFormated=otherPayablesFormated;
	}
						
	public String getOtherPayablesFormated() {
		return otherPayablesFormated;
	}
	
	//应付利息
	public void setInterestPayableFormated(String interestPayableFormated) {
		this.interestPayableFormated=interestPayableFormated;
	}
						
	public String getInterestPayableFormated() {
		return interestPayableFormated;
	}
	
	//应付股利
	public void setDividendPayableFormated(String dividendPayableFormated) {
		this.dividendPayableFormated=dividendPayableFormated;
	}
						
	public String getDividendPayableFormated() {
		return dividendPayableFormated;
	}
	
	//应付手续费及佣金
	public void setPayableHandlingFeesAndCommissionsFormated(String payableHandlingFeesAndCommissionsFormated) {
		this.payableHandlingFeesAndCommissionsFormated=payableHandlingFeesAndCommissionsFormated;
	}
						
	public String getPayableHandlingFeesAndCommissionsFormated() {
		return payableHandlingFeesAndCommissionsFormated;
	}
	
	//应付分保账款
	public void setAccountsPayableReinsuranceFormated(String accountsPayableReinsuranceFormated) {
		this.accountsPayableReinsuranceFormated=accountsPayableReinsuranceFormated;
	}
						
	public String getAccountsPayableReinsuranceFormated() {
		return accountsPayableReinsuranceFormated;
	}
	
	//持有待售负债
	public void setHeldForSaleLiabilitiesFormated(String heldForSaleLiabilitiesFormated) {
		this.heldForSaleLiabilitiesFormated=heldForSaleLiabilitiesFormated;
	}
						
	public String getHeldForSaleLiabilitiesFormated() {
		return heldForSaleLiabilitiesFormated;
	}
	
	//一年到期非流动负债
	public void setNonCurrentLiabilitiesDueWithinOneYearFormated(String nonCurrentLiabilitiesDueWithinOneYearFormated) {
		this.nonCurrentLiabilitiesDueWithinOneYearFormated=nonCurrentLiabilitiesDueWithinOneYearFormated;
	}
							
	public String getNonCurrentLiabilitiesDueWithinOneYearFormated() {
		return nonCurrentLiabilitiesDueWithinOneYearFormated;
	}
	
	//其他流动负债
	public void setOtherCurrentLiabilitiesFormated(String otherCurrentLiabilitiesFormated) {
		this.otherCurrentLiabilitiesFormated=otherCurrentLiabilitiesFormated;
	}
							
	public String getOtherCurrentLiabilitiesFormated() {
		return otherCurrentLiabilitiesFormated;
	}
	
	//流动负债合计
	public void setTotalCurrentLiabilitiesFormated(String totalCurrentLiabilitiesFormated) {
		this.totalCurrentLiabilitiesFormated=totalCurrentLiabilitiesFormated;
	}
							
	public String getTotalCurrentLiabilitiesFormated() {
		return totalCurrentLiabilitiesFormated;
	}
	
	//保险合同准备金
	public void setInsuranceContractReservesFormated(String insuranceContractReservesFormated) {
		this.insuranceContractReservesFormated=insuranceContractReservesFormated;
	}
							
	public String getInsuranceContractReservesFormated() {
		return insuranceContractReservesFormated;
	}
	
	//长期借款
	public void setLongTermLoanFormated(String longTermLoanFormated) {
		this.longTermLoanFormated=longTermLoanFormated;
	}
							
	public String getLongTermLoanFormated() {
		return longTermLoanFormated;
	}
	
	//应付债券
	public void setBondsPayableFormated(String bondsPayableFormated) {
		this.bondsPayableFormated=bondsPayableFormated;
	}
							
	public String getBondsPayableFormated() {
		return bondsPayableFormated;
	}
	
	//应付债券：优先股
	public void setBondsPayablepreferredSharesFormated(String bondsPayablepreferredSharesFormated) {
		this.bondsPayablepreferredSharesFormated=bondsPayablepreferredSharesFormated;
	}
							
	public String getBondsPayablepreferredSharesFormated() {
		return bondsPayablepreferredSharesFormated;
	}
	
	//应付债券：永续债
	public void setBondsPayableperpetualCapitalSecuritiesFormated(String bondsPayableperpetualCapitalSecuritiesFormated) {
		this.bondsPayableperpetualCapitalSecuritiesFormated=bondsPayableperpetualCapitalSecuritiesFormated;
	}
							
	public String getBondsPayableperpetualCapitalSecuritiesFormated() {
		return bondsPayableperpetualCapitalSecuritiesFormated;
	}
	
	//租赁负债
	public void setLeaseLiabilitiesFormated(String leaseLiabilitiesFormated) {
		this.leaseLiabilitiesFormated=leaseLiabilitiesFormated;
	}
							
	public String getLeaseLiabilitiesFormated() {
		return leaseLiabilitiesFormated;
	}
	
	//长期应付款
	public void setLongTermPayablesFormated(String longTermPayablesFormated) {
		this.longTermPayablesFormated=longTermPayablesFormated;
	}
							
	public String getLongTermPayablesFormated() {
		return longTermPayablesFormated;
	}
	
	//长期应付职工薪酬
	public void setLongTermEmployeeCompensationPayableFormated(String longTermEmployeeCompensationPayableFormated) {
		this.longTermEmployeeCompensationPayableFormated=longTermEmployeeCompensationPayableFormated;
	}
							
	public String getLongTermEmployeeCompensationPayableFormated() {
		return longTermEmployeeCompensationPayableFormated;
	}
	
	//预计负债
	public void setEstimatedLiabilitiesFormated(String estimatedLiabilitiesFormated) {
		this.estimatedLiabilitiesFormated=estimatedLiabilitiesFormated;
	}
							
	public String getEstimatedLiabilitiesFormated() {
		return estimatedLiabilitiesFormated;
	}
	
	//递延收益
	public void setDeferredIncomeFormated(String deferredIncomeFormated) {
		this.deferredIncomeFormated=deferredIncomeFormated;
	}
							
	public String getDeferredIncomeFormated() {
		return deferredIncomeFormated;
	}
	
	//递延所得税负债
	public void setDeferredIncomeTaxesFormated(String deferredIncomeTaxesFormated) {
		this.deferredIncomeTaxesFormated=deferredIncomeTaxesFormated;
	}
							
	public String getDeferredIncomeTaxesFormated() {
		return deferredIncomeTaxesFormated;
	}
	
	//其他非流动负债
	public void setOtherNonCurrentLiabilitiesFormated(String otherNonCurrentLiabilitiesFormated) {
		this.otherNonCurrentLiabilitiesFormated=otherNonCurrentLiabilitiesFormated;
	}
							
	public String getOtherNonCurrentLiabilitiesFormated() {
		return otherNonCurrentLiabilitiesFormated;
	}
	
	//非流动负债合计
	public void setTotalNonCurrentLiabilitiesFormated(String totalNonCurrentLiabilitiesFormated) {
		this.totalNonCurrentLiabilitiesFormated=totalNonCurrentLiabilitiesFormated;
	}
							
	public String getTotalNonCurrentLiabilitiesFormated() {
		return totalNonCurrentLiabilitiesFormated;
	}
	
	//负债总计
	public void setTotalLiabilitiesFormated(String totalLiabilitiesFormated) {
		this.totalLiabilitiesFormated=totalLiabilitiesFormated;
	}
							
	public String getTotalLiabilitiesFormated() {
		return totalLiabilitiesFormated;
	}
	
	//股本
	public void setEquityFormated(String equityFormated) {
		this.equityFormated=equityFormated;
	}
							
	public String getEquityFormated() {
		return equityFormated;
	}
	
	//其他权益工具
	public void setOtherEquityInstrumentsFormated(String otherEquityInstrumentsFormated) {
		this.otherEquityInstrumentsFormated=otherEquityInstrumentsFormated;
	}
							
	public String getOtherEquityInstrumentsFormated() {
		return otherEquityInstrumentsFormated;
	}
	
	//其他权益工具：优先股
	public void setOtherEquityInstrumentspreferredSharesFormated(String otherEquityInstrumentspreferredSharesFormated) {
		this.otherEquityInstrumentspreferredSharesFormated=otherEquityInstrumentspreferredSharesFormated;
	}
							
	public String getOtherEquityInstrumentspreferredSharesFormated() {
		return otherEquityInstrumentspreferredSharesFormated;
	}
	
	//其他权益工具：永续债
	public void setOtherEquityInstrumentspetualCapitalSecuritiesFormated(String otherEquityInstrumentspetualCapitalSecuritiesFormated) {
		this.otherEquityInstrumentspetualCapitalSecuritiesFormated=otherEquityInstrumentspetualCapitalSecuritiesFormated;
	}
							
	public String getOtherEquityInstrumentspetualCapitalSecuritiesFormated() {
		return otherEquityInstrumentspetualCapitalSecuritiesFormated;
	}
	
	//资本公积
	public void setCapitalReserveFormated(String capitalReserveFormated) {
		this.capitalReserveFormated=capitalReserveFormated;
	}
							
	public String getCapitalReserveFormated() {
		return capitalReserveFormated;
	}
		
	//库存股
	public void setTreasuryStockFormated(String treasuryStockFormated) {
		this.treasuryStockFormated=treasuryStockFormated;
	}
								
	public String getTreasuryStockFormated() {
		return treasuryStockFormated;
	}
	
	//其他综合收益
	public void setOtherComprehensiveIncomeFormated(String otherComprehensiveIncomeFormated) {
		this.otherComprehensiveIncomeFormated=otherComprehensiveIncomeFormated;
	}
								
	public String getOtherComprehensiveIncomeFormated() {
		return otherComprehensiveIncomeFormated;
	}
	
	//专项储备
	public void setSpecialReservesFormated(String specialReservesFormated) {
		this.specialReservesFormated=specialReservesFormated;
	}
								
	public String getSpecialReservesFormated() {
		return specialReservesFormated;
	}
	
	//盈余公积
	public void setSurplusReservesFormated(String surplusReservesFormated) {
		this.surplusReservesFormated=surplusReservesFormated;
	}
								
	public String getSurplusReservesFormated() {
		return surplusReservesFormated;
	}
	
	//一般风险准备
	public void setGeneralRiskProvisionsFormated(String generalRiskProvisionsFormated) {
		this.generalRiskProvisionsFormated=generalRiskProvisionsFormated;
	}
								
	public String getGeneralRiskProvisionsFormated() {
		return generalRiskProvisionsFormated;
	}
	
	//未分配利润
	public void setUndistributedProfitFormated(String undistributedProfitFormated) {
		this.undistributedProfitFormated=undistributedProfitFormated;
	}
								
	public String getUndistributedProfitFormated() {
		return undistributedProfitFormated;
	}
	
	//归属母公司所有者权益合计
	public void setTotalEquityAttributableOfParentCompanyFormated(String totalEquityAttributableOfParentCompanyFormated) {
		this.totalEquityAttributableOfParentCompanyFormated=totalEquityAttributableOfParentCompanyFormated;
	}
								
	public String getTotalEquityAttributableOfParentCompanyFormated() {
		return totalEquityAttributableOfParentCompanyFormated;
	}
	
	//少数股东权益
	public void setMinorityInterestFormated(String minorityInterestFormated) {
		this.minorityInterestFormated=minorityInterestFormated;
	}
								
	public String getMinorityInterestFormated() {
		return minorityInterestFormated;
	}
	
	//所有者权益合计
	public void setTotalOwnersEquityFormated(String totalOwnersEquityFormated) {
		this.totalOwnersEquityFormated=totalOwnersEquityFormated;
	}
								
	public String getTotalOwnersEquityFormated() {
		return totalOwnersEquityFormated;
	}
	
	//负债和所有者权益总计
	public void setTotalLiabilitiesAndOwnersEquityFormated(String totalLiabilitiesAndOwnersEquityFormated) {
		this.totalLiabilitiesAndOwnersEquityFormated=totalLiabilitiesAndOwnersEquityFormated;
	}
								
	public String getTotalLiabilitiesAndOwnersEquityFormated() {
		return totalLiabilitiesAndOwnersEquityFormated;
	}
	
	//总人数
	public void setTotalNumberOfPeople(int totalNumberOfPeople) {
		this.totalNumberOfPeople=totalNumberOfPeople;
	}
								
	public Integer getTotalNumberOfPeople() {
		return totalNumberOfPeople;
	}
}
