package report.bean.entity;

public class BalanceSheet {
	String 
	financialReportingNo,					//财报编号
	AShareCode,								//A股代码
	AShareName,								//A股简称
	financialReportingYear,					//财报年份
	auditOpinion,							//审计意见
	createDateTime,							//创建时间
	updateDateTime;							//更新时间
	double
	monetaryCapital,						//货币资金
	settlementProvisions,					//结算备付金
	lendingFunds,							//拆出资金
	tradingFinancialAssets,					//交易性金融资产
	tradingFinancialAssetsManagement,		//交易性金融资产理财
	derivativeFinancialAssets,				//衍生金融资产
	billReceivable,							//应收票据
	accountsReceivable,						//应收账款
	accountsReceivableFinancing,			//应收款项融资
	prepayments,							//预付款项
	premiumReceivable,						//应收保费
	accountsReceivableReinsurance,			//应收分保账款
	receivableReserveForReinsuranceContracts,	//应收分保合同准备金
	otherReceivables,						//其他应收款
	interestReceivable,						//应付利息
	dividendReceivable,						//应付股利
	buyingBackFinancialAssets,				//买入返售金融资产
	inventory,								//存货
	contractAssets,							//合同资产
	assetsHeldForSale,						//持有待售资产
	nonCurrentAssetsDueWithinOneYear,		//一年到期非流动资产
	otherCurrentAssets,						//其他流动资产
	otherCurrentAssetsManagement,			//其他流动资产理财
	totalCurrentAssets,						//流动资产合计
	grantingLoansAndAdvances,				//发放贷款和垫款
	debtInvestment,							//债权投资
	otherDebtInvestment,					//其他债权投资
	longTermReceivables,					//长期应收款
	longTermEquityInvestment,				//长期股权投资
	otherEquityInstrumentInvestments,		//其他权益工具投资
	otherNonCurrentFinancialAssets,			//其他非流动金融资产
	investmentRealEstate,					//投资性房地产
	fixedAssets,							//固定资产
	constructionInProgress,					//在建工程
	productiveBiologicalAssets,				//生产性生物资产
	oilAndGasAssets,						//油气资产
	rightOfUseAssets,						//使用权资产
	intangibleAssets,						//无形资产
	developmentExpenditure,					//开发支出
	goodwill,								//商誉
	longTermDeferredExpense,				//长期待摊费用
	deferredTaxAssets,						//递延所得税资产
	otherNonCurrentAssets,					//其他非流动资产
	totalNonCurrentAssets,					//非流动资产合计
	totalAssets,							//资产总计
	longTermEquityInvestmentsUnrelatedToMainBusiness,		//与主业无关的长期股权投资
	incomeFromLongTermEquityInvestments,	//长期权益投资的收益
	shortTermBorrowing,						//短期借款
	borrowingFromTheCentralBank,			//向中央银行借款
	borrowingFunds,							//拆入资金
	tradingFinancialLiabilities,			//交易性金融负债
	derivativeFinancialLiabilities,			//衍生金融负债
	notesPayable,							//应付票据
	accountsPayable,						//应付账款
	advanceReceipts,						//预收款项
	contractLiabilities,					//合同负债
	financialAssetsSoldForRepurchase,		//卖出回购金融资产款
	depositAbsorptionAndInterbankDeposits,	//吸收存款及同业存放
	actingTradingSecurities,				//代理买卖证券款
	actingUnderwritingSecurities,			//代理承销证券款
	payrollPayable,							//应付职工薪酬
	taxPayable,								//应交税费
	otherPayables,							//其他应付款
	interestPayable,						//应付利息
	dividendPayable,						//应付股利
	payableHandlingFeesAndCommissions,		//应付手续费及佣金
	accountsPayableReinsurance,				//应付分保账款
	heldForSaleLiabilities,					//持有待售负债
	nonCurrentLiabilitiesDueWithinOneYear,	//一年到期非流动负债
	otherCurrentLiabilities,				//其他流动负债
	totalCurrentLiabilities,				//流动负债合计
	insuranceContractReserves,				//保险合同准备金
	longTermLoan,							//长期借款
	bondsPayable,							//应付债券
	bondsPayablepreferredShares,			//应付债券：优先股
	bondsPayableperpetualCapitalSecurities,	//应付债券：永续债
	leaseLiabilities,						//租赁负债
	longTermPayables,						//长期应付款
	longTermEmployeeCompensationPayable,	//长期应付职工薪酬
	estimatedLiabilities,					//预计负债
	deferredIncome,							//递延收益
	deferredIncomeTaxes,					//递延所得税负债
	otherNonCurrentLiabilities,				//其他非流动负债
	totalNonCurrentLiabilities,				//非流动负债合计
	totalLiabilities,						//负债总计
	equity,									//股本
	otherEquityInstruments,					//其他权益工具
	otherEquityInstrumentspreferredShares,	//其他权益工具：优先股
	otherEquityInstrumentspetualCapitalSecurities,		//其他权益工具：永续债
	capitalReserve,							//资本公积
	treasuryStock,							//库存股
	otherComprehensiveIncome,				//其他综合收益
	specialReserves,						//专项储备
	surplusReserves,						//盈余公积
	generalRiskProvisions,					//一般风险准备
	undistributedProfit,					//未分配利润
	totalEquityAttributableOfParentCompany,	//归属母公司所有者权益合计
	minorityInterest,						//少数股东权益
	totalOwnersEquity,						//所有者权益合计
	totalLiabilitiesAndOwnersEquity;		//负债和所有者权益总计
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
	public void setMonetaryCapital(double monetaryCapital) {
		this.monetaryCapital=monetaryCapital;
	}
	
	public double getMonetaryCapital() {
		return monetaryCapital;
	}

	//结算备付金
	public void setSettlementProvisions(double settlementProvisions) {
		this.settlementProvisions=settlementProvisions;
	}
	
	public double getSettlementProvisions() {
		return settlementProvisions;
	}

	//拆出资金
	public void setLendingFunds(double lendingFunds) {
		this.lendingFunds=lendingFunds;
	}
	
	public double getLendingFunds() {
		return lendingFunds;
	}

	//交易性金融资产
	public void setTradingFinancialAssets(double tradingFinancialAssets) {
		this.tradingFinancialAssets=tradingFinancialAssets;
	}
	
	public double getTradingFinancialAssets() {
		return tradingFinancialAssets;
	}

	//交易性金融资产理财
	public void setTradingFinancialAssetsManagement(double tradingFinancialAssetsManagement) {
		this.tradingFinancialAssetsManagement=tradingFinancialAssetsManagement;
	}
	
	public double getTradingFinancialAssetsManagement() {
		return tradingFinancialAssetsManagement;
	}

	//衍生金融资产
	public void setDerivativeFinancialAssets(double derivativeFinancialAssets) {
		this.derivativeFinancialAssets=derivativeFinancialAssets;
	}
	
	public double getDerivativeFinancialAssets() {
		return derivativeFinancialAssets;
	}

	//应收票据
	public void setBillReceivable(double billReceivable) {
		this.billReceivable=billReceivable;
	}
	
	public double getBillReceivable() {
		return billReceivable;
	}
	
	//应收账款
	public void setAccountsReceivable(double accountsReceivable) {
		this.accountsReceivable=accountsReceivable;
	}
	
	public double getAccountsReceivable() {
		return accountsReceivable;
	}
	
	//应收款项融资
	public void setAccountsReceivableFinancing(double accountsReceivableFinancing) {
		this.accountsReceivableFinancing=accountsReceivableFinancing;
	}
		
	public double getAccountsReceivableFinancing() {
		return accountsReceivableFinancing;
	}
	
	//预付款项
	public void setPrepayments(double prepayments) {
		this.prepayments=prepayments;
	}
			
	public double getPrepayments() {
		return prepayments;
	}
	
	//应收保费
	public void setPremiumReceivable(double premiumReceivable) {
		this.premiumReceivable=premiumReceivable;
	}
				
	public double getPremiumReceivable() {
		return premiumReceivable;
	}
	
	//应收分保账款
	public void setAccountsReceivableReinsurance(double accountsReceivableReinsurance) {
		this.accountsReceivableReinsurance=accountsReceivableReinsurance;
	}
					
	public double getAccountsReceivableReinsurance() {
		return accountsReceivableReinsurance;
	}
	
	//应收分保合同准备金
	public void setReceivableReserveForReinsuranceContracts(double receivableReserveForReinsuranceContracts) {
		this.receivableReserveForReinsuranceContracts=receivableReserveForReinsuranceContracts;
	}
					
	public double getReceivableReserveForReinsuranceContracts() {
		return receivableReserveForReinsuranceContracts;
	}
	
	//其他应收款
	public void setOtherReceivables(double otherReceivables) {
		this.otherReceivables=otherReceivables;
	}
					
	public double getOtherReceivables() {
		return otherReceivables;
	}
	
	//应付利息
	public void setInterestReceivable(double interestReceivable) {
		this.interestReceivable=interestReceivable;
	}
					
	public double getInterestReceivable() {
		return interestReceivable;
	}
	
	//应付股利
	public void setDividendReceivable(double dividendReceivable) {
		this.dividendReceivable=dividendReceivable;
	}
					
	public double getDividendReceivable() {
		return dividendReceivable;
	}
	
	//买入返售金融资产
	public void setBuyingBackFinancialAssets(double buyingBackFinancialAssets) {
		this.buyingBackFinancialAssets=buyingBackFinancialAssets;
	}
					
	public double getBuyingBackFinancialAssets() {
		return buyingBackFinancialAssets;
	}
	
	//存货
	public void setInventory(double inventory) {
		this.inventory=inventory;
	}
					
	public double getInventory() {
		return inventory;
	}
	
	//合同资产
	public void setContractAssets(double contractAssets) {
		this.contractAssets=contractAssets;
	}
					
	public double getContractAssets() {
		return contractAssets;
	}
	
	//持有待售资产
	public void setAssetsHeldForSale(double assetsHeldForSale) {
		this.assetsHeldForSale=assetsHeldForSale;
	}
					
	public double getAssetsHeldForSale() {
		return assetsHeldForSale;
	}
	
	//一年到期非流动资产
	public void setNonCurrentAssetsDueWithinOneYear(double nonCurrentAssetsDueWithinOneYear) {
		this.nonCurrentAssetsDueWithinOneYear=nonCurrentAssetsDueWithinOneYear;
	}
					
	public double getNonCurrentAssetsDueWithinOneYear() {
		return nonCurrentAssetsDueWithinOneYear;
	}
	
	//其他流动资产
	public void setOtherCurrentAssets(double otherCurrentAssets) {
		this.otherCurrentAssets=otherCurrentAssets;
	}
					
	public double getOtherCurrentAssets() {
		return otherCurrentAssets;
	}
	
	//其他流动资产理财
	public void setOtherCurrentAssetsManagement(double otherCurrentAssetsManagement) {
		this.otherCurrentAssetsManagement=otherCurrentAssetsManagement;
	}
					
	public double getOtherCurrentAssetsManagement() {
		return otherCurrentAssetsManagement;
	}
	
	//流动资产合计
	public void setTotalCurrentAssets(double totalCurrentAssets) {
		this.totalCurrentAssets=totalCurrentAssets;
	}
					
	public double getTotalCurrentAssets() {
		return totalCurrentAssets;
	}
	
	
	//发放贷款和垫款
	public void setGrantingLoansAndAdvances(double grantingLoansAndAdvances) {
		this.grantingLoansAndAdvances=grantingLoansAndAdvances;
	}
					
	public double getGrantingLoansAndAdvances() {
		return grantingLoansAndAdvances;
	}
	
	//债权投资
	public void setDebtInvestment(double debtInvestment) {
		this.debtInvestment=debtInvestment;
	}
					
	public double getDebtInvestment() {
		return debtInvestment;
	}
	
	//其他债权投资
	public void setOtherDebtInvestment(double otherDebtInvestment) {
		this.otherDebtInvestment=otherDebtInvestment;
	}
						
	public double getOtherDebtInvestment() {
		return otherDebtInvestment;
	}
	
	//长期应收款
	public void setLongTermReceivables(double longTermReceivables) {
		this.longTermReceivables=longTermReceivables;
	}
						
	public double getLongTermReceivables() {
		return longTermReceivables;
	}
	
	//长期股权投资
	public void setLongTermEquityInvestment(double longTermEquityInvestment) {
		this.longTermEquityInvestment=longTermEquityInvestment;
	}
						
	public double getLongTermEquityInvestment() {
		return longTermEquityInvestment;
	}
	
	//其他权益工具投资
	public void setOtherEquityInstrumentInvestments(double otherEquityInstrumentInvestments) {
		this.otherEquityInstrumentInvestments=otherEquityInstrumentInvestments;
	}
						
	public double getOtherEquityInstrumentInvestments() {
		return otherEquityInstrumentInvestments;
	}
	
	//其他非流动金融资产
	public void setOtherNonCurrentFinancialAssets(double otherNonCurrentFinancialAssets) {
		this.otherNonCurrentFinancialAssets=otherNonCurrentFinancialAssets;
	}
						
	public double getOtherNonCurrentFinancialAssets() {
		return otherNonCurrentFinancialAssets;
	}
	
	//投资性房地产
	public void setInvestmentRealEstate(double investmentRealEstate) {
		this.investmentRealEstate=investmentRealEstate;
	}
						
	public double getInvestmentRealEstate() {
		return investmentRealEstate;
	}
	
	//固定资产
	public void setFixedAssets(double fixedAssets) {
		this.fixedAssets=fixedAssets;
	}
						
	public double getFixedAssets() {
		return fixedAssets;
	}
	
	//在建工程
	public void setConstructionInProgress(double constructionInProgress) {
		this.constructionInProgress=constructionInProgress;
	}
						
	public double getConstructionInProgress() {
		return constructionInProgress;
	}
	
	//生产性生物资产
	public void setProductiveBiologicalAssets(double productiveBiologicalAssets) {
		this.productiveBiologicalAssets=productiveBiologicalAssets;
	}
						
	public double getProductiveBiologicalAssets() {
		return productiveBiologicalAssets;
	}
	
	//油气资产
	public void setOilAndGasAssets(double oilAndGasAssets) {
		this.oilAndGasAssets=oilAndGasAssets;
	}
						
	public double getOilAndGasAssets() {
		return oilAndGasAssets;
	}

	//使用权资产
	public void setRightOfUseAssets(double rightOfUseAssets) {
		this.rightOfUseAssets=rightOfUseAssets;
	}
						
	public double getRightOfUseAssets() {
		return rightOfUseAssets;
	}
	
	//无形资产
	public void setIntangibleAssets(double intangibleAssets) {
		this.intangibleAssets=intangibleAssets;
	}
						
	public double getIntangibleAssets() {
		return intangibleAssets;
	}
	
	//开发支出
	public void setDevelopmentExpenditure(double developmentExpenditure) {
		this.developmentExpenditure=developmentExpenditure;
	}
						
	public double getDevelopmentExpenditure() {
		return developmentExpenditure;
	}
	
	//商誉
	public void setGoodwill(double goodwill) {
		this.goodwill=goodwill;
	}
						
	public double getGoodwill() {
		return goodwill;
	}
	
	//长期待摊费用
	public void setLongTermDeferredExpense(double longTermDeferredExpense) {
		this.longTermDeferredExpense=longTermDeferredExpense;
	}
						
	public double getLongTermDeferredExpense() {
		return longTermDeferredExpense;
	}
	
	//递延所得税资产
	public void setDeferredTaxAssets(double deferredTaxAssets) {
		this.deferredTaxAssets=deferredTaxAssets;
	}
						
	public double getDeferredTaxAssets() {
		return deferredTaxAssets;
	}
	
	//其他非流动资产
	public void setOtherNonCurrentAssets(double otherNonCurrentAssets) {
		this.otherNonCurrentAssets=otherNonCurrentAssets;
	}
						
	public double getOtherNonCurrentAssets() {
		return otherNonCurrentAssets;
	}
	
	//非流动资产合计
	public void setTotalNonCurrentAssets(double totalNonCurrentAssets) {
		this.totalNonCurrentAssets=totalNonCurrentAssets;
	}
						
	public double getTotalNonCurrentAssets() {
		return totalNonCurrentAssets;
	}
	
	//资产总计
	public void setTotalAssets(double totalAssets) {
		this.totalAssets=totalAssets;
	}
						
	public double getTotalAssets() {
		return totalAssets;
	}
	
	//与主业无关的长期股权投资
	public void setLongTermEquityInvestmentsUnrelatedToMainBusiness(double longTermEquityInvestmentsUnrelatedToMainBusiness) {
		this.longTermEquityInvestmentsUnrelatedToMainBusiness=longTermEquityInvestmentsUnrelatedToMainBusiness;
	}
						
	public double getLongTermEquityInvestmentsUnrelatedToMainBusiness() {
		return longTermEquityInvestmentsUnrelatedToMainBusiness;
	}
	
	//长期权益投资的收益
	public void setIncomeFromLongTermEquityInvestments(double incomeFromLongTermEquityInvestments) {
		this.incomeFromLongTermEquityInvestments=incomeFromLongTermEquityInvestments;
	}
						
	public double getIncomeFromLongTermEquityInvestments() {
		return incomeFromLongTermEquityInvestments;
	}
	
	//短期借款
	public void setShortTermBorrowing(double shortTermBorrowing) {
		this.shortTermBorrowing=shortTermBorrowing;
	}
						
	public double getShortTermBorrowing() {
		return shortTermBorrowing;
	}
	
	//向中央银行借款
	public void setBorrowingFromTheCentralBank(double borrowingFromTheCentralBank) {
		this.borrowingFromTheCentralBank=borrowingFromTheCentralBank;
	}
						
	public double getBorrowingFromTheCentralBank() {
		return borrowingFromTheCentralBank;
	}
	
	//拆入资金
	public void setBorrowingFunds(double borrowingFunds) {
		this.borrowingFunds=borrowingFunds;
	}
						
	public double getBorrowingFunds() {
		return borrowingFunds;
	}
	
	//交易性金融负债
	public void setTradingFinancialLiabilities(double tradingFinancialLiabilities) {
		this.tradingFinancialLiabilities=tradingFinancialLiabilities;
	}
						
	public double getTradingFinancialLiabilities() {
		return tradingFinancialLiabilities;
	}
	
	//衍生金融负债
	public void setDerivativeFinancialLiabilities(double derivativeFinancialLiabilities) {
		this.derivativeFinancialLiabilities=derivativeFinancialLiabilities;
	}
						
	public double getDerivativeFinancialLiabilities() {
		return derivativeFinancialLiabilities;
	}
	
	//应付票据
	public void setNotesPayable(double notesPayable) {
		this.notesPayable=notesPayable;
	}
						
	public double getNotesPayable() {
		return notesPayable;
	}
	
	//应付账款
	public void setAccountsPayable(double accountsPayable) {
		this.accountsPayable=accountsPayable;
	}
						
	public double getAccountsPayable() {
		return accountsPayable;
	}
	
	//预收款项
	public void setAdvanceReceipts(double advanceReceipts) {
		this.advanceReceipts=advanceReceipts;
	}
						
	public double getAdvanceReceipts() {
		return advanceReceipts;
	}
	
	//合同负债
	public void setContractLiabilities(double contractLiabilities) {
		this.contractLiabilities=contractLiabilities;
	}
						
	public double getContractLiabilities() {
		return contractLiabilities;
	}
	
	//卖出回购金融资产款
	public void setFinancialAssetsSoldForRepurchase(double financialAssetsSoldForRepurchase) {
		this.financialAssetsSoldForRepurchase=financialAssetsSoldForRepurchase;
	}
						
	public double getFinancialAssetsSoldForRepurchase() {
		return financialAssetsSoldForRepurchase;
	}
	
	//吸收存款及同业存放
	public void setDepositAbsorptionAndInterbankDeposits(double depositAbsorptionAndInterbankDeposits) {
		this.depositAbsorptionAndInterbankDeposits=depositAbsorptionAndInterbankDeposits;
	}
						
	public double getDepositAbsorptionAndInterbankDeposits() {
		return depositAbsorptionAndInterbankDeposits;
	}
	
	//代理买卖证券款
	public void setActingTradingSecurities(double actingTradingSecurities) {
		this.actingTradingSecurities=actingTradingSecurities;
	}
						
	public double getActingTradingSecurities() {
		return actingTradingSecurities;
	}
	
	//代理承销证券款
	public void setActingUnderwritingSecurities(double actingUnderwritingSecurities) {
		this.actingUnderwritingSecurities=actingUnderwritingSecurities;
	}
						
	public double getActingUnderwritingSecurities() {
		return actingUnderwritingSecurities;
	}
	
	//应付职工薪酬
	public void setPayrollPayable(double payrollPayable) {
		this.payrollPayable=payrollPayable;
	}
						
	public double getPayrollPayable() {
		return payrollPayable;
	}
	
	//应交税费
	public void setTaxPayable(double taxPayable) {
		this.taxPayable=taxPayable;
	}
						
	public double getTaxPayable() {
		return taxPayable;
	}
	
	//其他应付款
	public void setOtherPayables(double otherPayables) {
		this.otherPayables=otherPayables;
	}
						
	public double getOtherPayables() {
		return otherPayables;
	}
	
	//应付利息
	public void setInterestPayable(double interestPayable) {
		this.interestPayable=interestPayable;
	}
						
	public double getInterestPayable() {
		return interestPayable;
	}
	
	//应付股利
	public void setDividendPayable(double dividendPayable) {
		this.dividendPayable=dividendPayable;
	}
						
	public double getDividendPayable() {
		return dividendPayable;
	}
	
	//应付手续费及佣金
	public void setPayableHandlingFeesAndCommissions(double payableHandlingFeesAndCommissions) {
		this.payableHandlingFeesAndCommissions=payableHandlingFeesAndCommissions;
	}
						
	public double getPayableHandlingFeesAndCommissions() {
		return payableHandlingFeesAndCommissions;
	}
	
	//应付分保账款
	public void setAccountsPayableReinsurance(double accountsPayableReinsurance) {
		this.accountsPayableReinsurance=accountsPayableReinsurance;
	}
						
	public double getAccountsPayableReinsurance() {
		return accountsPayableReinsurance;
	}
	
	//持有待售负债
	public void setHeldForSaleLiabilities(double heldForSaleLiabilities) {
		this.heldForSaleLiabilities=heldForSaleLiabilities;
	}
						
	public double getHeldForSaleLiabilities() {
		return heldForSaleLiabilities;
	}
	
	//一年到期非流动负债
	public void setNonCurrentLiabilitiesDueWithinOneYear(double nonCurrentLiabilitiesDueWithinOneYear) {
		this.nonCurrentLiabilitiesDueWithinOneYear=nonCurrentLiabilitiesDueWithinOneYear;
	}
							
	public double getNonCurrentLiabilitiesDueWithinOneYear() {
		return nonCurrentLiabilitiesDueWithinOneYear;
	}
	
	//其他流动负债
	public void setOtherCurrentLiabilities(double otherCurrentLiabilities) {
		this.otherCurrentLiabilities=otherCurrentLiabilities;
	}
							
	public double getOtherCurrentLiabilities() {
		return otherCurrentLiabilities;
	}
	
	//流动负债合计
	public void setTotalCurrentLiabilities(double totalCurrentLiabilities) {
		this.totalCurrentLiabilities=totalCurrentLiabilities;
	}
							
	public double getTotalCurrentLiabilities() {
		return totalCurrentLiabilities;
	}
	
	//保险合同准备金
	public void setInsuranceContractReserves(double insuranceContractReserves) {
		this.insuranceContractReserves=insuranceContractReserves;
	}
							
	public double getInsuranceContractReserves() {
		return insuranceContractReserves;
	}
	
	//长期借款
	public void setLongTermLoan(double longTermLoan) {
		this.longTermLoan=longTermLoan;
	}
							
	public double getLongTermLoan() {
		return longTermLoan;
	}
	
	//应付债券
	public void setBondsPayable(double bondsPayable) {
		this.bondsPayable=bondsPayable;
	}
							
	public double getBondsPayable() {
		return bondsPayable;
	}
	
	//应付债券：优先股
	public void setBondsPayablepreferredShares(double bondsPayablepreferredShares) {
		this.bondsPayablepreferredShares=bondsPayablepreferredShares;
	}
							
	public double getBondsPayablepreferredShares() {
		return bondsPayablepreferredShares;
	}
	
	//应付债券：永续债
	public void setBondsPayableperpetualCapitalSecurities(double bondsPayableperpetualCapitalSecurities) {
		this.bondsPayableperpetualCapitalSecurities=bondsPayableperpetualCapitalSecurities;
	}
							
	public double getBondsPayableperpetualCapitalSecurities() {
		return bondsPayableperpetualCapitalSecurities;
	}
	
	//租赁负债
	public void setLeaseLiabilities(double leaseLiabilities) {
		this.leaseLiabilities=leaseLiabilities;
	}
							
	public double getLeaseLiabilities() {
		return leaseLiabilities;
	}
	
	//长期应付款
	public void setLongTermPayables(double longTermPayables) {
		this.longTermPayables=longTermPayables;
	}
							
	public double getLongTermPayables() {
		return longTermPayables;
	}
	
	//长期应付职工薪酬
	public void setLongTermEmployeeCompensationPayable(double longTermEmployeeCompensationPayable) {
		this.longTermEmployeeCompensationPayable=longTermEmployeeCompensationPayable;
	}
							
	public double getLongTermEmployeeCompensationPayable() {
		return longTermEmployeeCompensationPayable;
	}
	
	//预计负债
	public void setEstimatedLiabilities(double estimatedLiabilities) {
		this.estimatedLiabilities=estimatedLiabilities;
	}
							
	public double getEstimatedLiabilities() {
		return estimatedLiabilities;
	}
	
	//递延收益
	public void setDeferredIncome(double deferredIncome) {
		this.deferredIncome=deferredIncome;
	}
							
	public double getDeferredIncome() {
		return deferredIncome;
	}
	
	//递延所得税负债
	public void setDeferredIncomeTaxes(double deferredIncomeTaxes) {
		this.deferredIncomeTaxes=deferredIncomeTaxes;
	}
							
	public double getDeferredIncomeTaxes() {
		return deferredIncomeTaxes;
	}
	
	//其他非流动负债
	public void setOtherNonCurrentLiabilities(double otherNonCurrentLiabilities) {
		this.otherNonCurrentLiabilities=otherNonCurrentLiabilities;
	}
							
	public double getOtherNonCurrentLiabilities() {
		return otherNonCurrentLiabilities;
	}
	
	//非流动负债合计
	public void setTotalNonCurrentLiabilities(double totalNonCurrentLiabilities) {
		this.totalNonCurrentLiabilities=totalNonCurrentLiabilities;
	}
							
	public double getTotalNonCurrentLiabilities() {
		return totalNonCurrentLiabilities;
	}
	
	//负债总计
	public void setTotalLiabilities(double totalLiabilities) {
		this.totalLiabilities=totalLiabilities;
	}
							
	public double getTotalLiabilities() {
		return totalLiabilities;
	}
	
	//股本
	public void setEquity(double equity) {
		this.equity=equity;
	}
							
	public double getEquity() {
		return equity;
	}
	
	//其他权益工具
	public void setOtherEquityInstruments(double otherEquityInstruments) {
		this.otherEquityInstruments=otherEquityInstruments;
	}
							
	public double getOtherEquityInstruments() {
		return otherEquityInstruments;
	}
	
	//其他权益工具：优先股
	public void setOtherEquityInstrumentspreferredShares(double otherEquityInstrumentspreferredShares) {
		this.otherEquityInstrumentspreferredShares=otherEquityInstrumentspreferredShares;
	}
							
	public double getOtherEquityInstrumentspreferredShares() {
		return otherEquityInstrumentspreferredShares;
	}
	
	//其他权益工具：永续债
	public void setOtherEquityInstrumentspetualCapitalSecurities(double otherEquityInstrumentspetualCapitalSecurities) {
		this.otherEquityInstrumentspetualCapitalSecurities=otherEquityInstrumentspetualCapitalSecurities;
	}
							
	public double getOtherEquityInstrumentspetualCapitalSecurities() {
		return otherEquityInstrumentspetualCapitalSecurities;
	}
	
	//资本公积
	public void setCapitalReserve(double capitalReserve) {
		this.capitalReserve=capitalReserve;
	}
							
	public double getCapitalReserve() {
		return capitalReserve;
	}
		
	//库存股
	public void setTreasuryStock(double treasuryStock) {
		this.treasuryStock=treasuryStock;
	}
								
	public double getTreasuryStock() {
		return treasuryStock;
	}
	
	//其他综合收益
	public void setOtherComprehensiveIncome(double otherComprehensiveIncome) {
		this.otherComprehensiveIncome=otherComprehensiveIncome;
	}
								
	public double getOtherComprehensiveIncome() {
		return otherComprehensiveIncome;
	}
	
	//专项储备
	public void setSpecialReserves(double specialReserves) {
		this.specialReserves=specialReserves;
	}
								
	public double getSpecialReserves() {
		return specialReserves;
	}
	
	//盈余公积
	public void setSurplusReserves(double surplusReserves) {
		this.surplusReserves=surplusReserves;
	}
								
	public double getSurplusReserves() {
		return surplusReserves;
	}
	
	//一般风险准备
	public void setGeneralRiskProvisions(double generalRiskProvisions) {
		this.generalRiskProvisions=generalRiskProvisions;
	}
								
	public double getGeneralRiskProvisions() {
		return generalRiskProvisions;
	}
	
	//未分配利润
	public void setUndistributedProfit(double undistributedProfit) {
		this.undistributedProfit=undistributedProfit;
	}
								
	public double getUndistributedProfit() {
		return undistributedProfit;
	}
	
	//归属母公司所有者权益合计
	public void setTotalEquityAttributableOfParentCompany(double totalEquityAttributableOfParentCompany) {
		this.totalEquityAttributableOfParentCompany=totalEquityAttributableOfParentCompany;
	}
								
	public double getTotalEquityAttributableOfParentCompany() {
		return totalEquityAttributableOfParentCompany;
	}
	
	//少数股东权益
	public void setMinorityInterest(double minorityInterest) {
		this.minorityInterest=minorityInterest;
	}
								
	public double getMinorityInterest() {
		return minorityInterest;
	}
	
	//所有者权益合计
	public void setTotalOwnersEquity(double totalOwnersEquity) {
		this.totalOwnersEquity=totalOwnersEquity;
	}
								
	public double getTotalOwnersEquity() {
		return totalOwnersEquity;
	}
	
	//负债和所有者权益总计
	public void setTotalLiabilitiesAndOwnersEquity(double totalLiabilitiesAndOwnersEquity) {
		this.totalLiabilitiesAndOwnersEquity=totalLiabilitiesAndOwnersEquity;
	}
								
	public double getTotalLiabilitiesAndOwnersEquity() {
		return totalLiabilitiesAndOwnersEquity;
	}
	
	//总人数
	public void setTotalNumberOfPeople(int totalNumberOfPeople) {
		this.totalNumberOfPeople=totalNumberOfPeople;
	}
								
	public Integer getTotalNumberOfPeople() {
		return totalNumberOfPeople;
	}
}
