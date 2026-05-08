package report.bean.entity;

public class ReportSummaryFormated {

	String 
	AShareCode,											//A股代码
	AShareName,											//A股简称
	primaryIndustry,									//一级行业
	secondaryIndustry,									//二级行业
	thirdLevelIndustry,									//三级行业
	region,												//所属区域
	financialReportingYear,								//财报年份
	companyType,										//公司类型
	createDateTime,										//创建时间
	dataResource,										//数据来源：页面确认，自动触发
	ROEFormated,												//ROE
	totalAssetsFormated,										//总资产
	totalAssetsGrowthRateFormated,								//总资产增长率
	totalOwnersEquityFormated,									//股东权益合计（净资产）
	equityMultiplierFormated,									//权益乘数（总资产/净资产）
	totalLiabilitiesFormated,									//总负债
	assetLiabilityRatioFormated,								//资产负债率
	monetaryCapitalFormated,									//货币资金
	shortTermBorrowingFormated,									//短期借款
	nonCurrentLiabilitiesDueWithinOneYearFormated,				//一年内到期的非流动负债
	longTermLoanFormated,										//长期借款
	bondsPayableFormated,										//应付债券
	longTermPayablesFormated,									//长期应付款
	interestBearingLiabilitiesFormated,							//有息负债(短期借款+一年内到期的非流动负债+长期借款+应付债券+长期应付款)
	debtRepaymentRiskFormated,									//货币资金-有息负债
	tradingFinancialAssetsManagementFormated,					//交易性金融资产中的理财产品
	otherCurrentAssetsManagementFormated,						//其他流动资产的理财产品
	quasiMonetaryFormated,										//准货币资金
	shortTermForeignDebtFormated,								//短期有息负债(短期借款+一年内到期的非流动负债)
	shortTermDebtRepaymentRiskFormated,							//准货币资金-短期有息负债
	quasiMonetaryCapitalRatioFormated,							//准货币资金占总资产比率
	notesPayableFormated,										//应付票据
	accountsPayableFormated,									//应付账款
	advanceReceiptsFormated,									//预收款项
	totalAccountsPayablePrepaidFormated,						//应付预收合计
	billReceivableFormated,										//应收票据
	accountsReceivableFormated,									//应收账款
	accountsReceivableFinancingFormated,						//应收款项融资
	contractAssetsFormated,										//合同资产
	prepaymentsFormated,										//预付款项
	contractLiabilitiesFormated,								//合同负债
	totalAccountsReceivablePrepaymentsFormated,					//应收预付合计
	occupySomeoneElseFundsFormated,								//应付预收合计-应收预付合计
	accountsReceivableRatioFormated,							//应收账款占总资产的比率
	fixedAssetsFormated,										//固定资产
	constructionInProgressFormated,								//在建工程
	totalTFxedAssetsFormated,									//固产合计
	fixedAssetRatioFormated,									//固产合计占总资产的比率
	tradingFinancialAssetsFormated,								//交易性金融资产
	otherNonCurrentFinancialAssetsFormated,						//其他非流动金融资产
	investmentRealEstateFormated,								//投资性房地产
	longTermEquityInvestmentFormated,							//长期股权投资
	subtotalOfInvestmentAssetsFormated,							//投资类资产小计
	investmentAssetRatioFormated,								//投资类资产占总资产的比率
	intangibleAssetsFormated,									//无形资产
	goodwillFormated,											//商誉
	theProportionOfIntangibleAssetsFormated,					//无形资产占比
	goodwillProportionFormated,									//商誉占比
	payrollPayableFormated,										//应付职工薪酬
	cashPaidToAndOnBehalfOfEmployeesFormated,					//支付给职工以及为职工支付的现金
	totalEmployeeCompensationFormated,							//当年职工总薪酬
	perCapitaAnnualSalaryFormated,								//人均年薪
	perCapitaMonthlySalaryFormated,								//人均月薪
	operatingRevenueFormated,									//营业收入
	revenueGrowthRateFormated,									//营业收入增长率
	totalAssetTurnoverFormated,									//总资产周转率
	cashReceivedFromSellingGoodsAndProvidingServicesFormated,	//销售商品、提供劳务收到的现金
	proportionOfCashSellingGoodsProvidingServicesFormated,		//销售商品、提供劳务收到的现金占营收的比率
	otherReceivablesFormated,									//其他应收款
	inventoryFormated,											//存货
	inventoryGrowthRateFormated,								//存货增长率
	accountsReceivablePercentageOfRevenueFormated,				//应收账款/总资产
	prepaymentsPercentageOfRevenueFormated,						//预付款项/总资产
	otherReceivablesPercentageOfRevenueFormated,				//其他应收款/总资产
	inventoryToRevenueRatioFormated,							//存货/总资产
	operatingCostsFormated,										//营业成本
	grossMarginFormated,										//毛利率
	sellingExpensesFormated,									//销售费用
	salesExpenseRateFormated,									//销售费用率
	overheadFormated,											//管理费用
	managementExpenseRateFormated,								//管理费用率
	researchAndDevelopmentFormated,								//研发费用
	researchAndDevelopmentRateFormated,							//研发费用率
	financialExpensesFormated,									//财务费用
	expenseFormated,											//费用率
	expenseRateToGrossProfitMarginFormated,						//费用率占毛利率的比率
	taxesAndSurchargesFormated,									//税金及附加
	fourExpensesFormated,										//四项费用
	totalProfitFormated,										//利润总额
	mainProfitFormated,											//主营利润
	mainProfitMarginFormated,									//主营利润率
	operatingProfitFormated,									//营业利润
	operatingMarginFormated,									//主营利润占营业利润比例
	mainOperatingProfitToTotalProfitFormated,					//主营利润占利润总额的比例
	netProfitFormated,											//净利润
	netProfitGrowthRateFormated,								//净利润增长率
	netProfitMarginFormated,									//净利润率
	netCashFlowFromOperatingFormated,							//经营活动产生的现金流量净额
	growthRateOfNetCashFlowFromOperatingFormated,				//经营活动产生的现金流量净额同比增长
	netProfitCashRatioFormated,									//净利润现金比率
	netIncomeAttributableToShareholdersFormated,				//归属于母公司所有者的净利润
	growthRateOfNetIncomeAttributableToShareholdersFormated,	//归母净利润增长率
	depreciationFormated,										//固定资产折旧
	amortizationOfIntangibleAssetsFormated,						//无形资产摊销
	cashPaidForDistributingDividendsProfitsPayingInterestFormated,				//现金股利(分配股利、利润或偿付利息支付的现金)	
	remainingCashFormated,										//经营活动产生的现金流量净额减去以上三项的余额
	cashPaidForPurchaseConstructionFixedIntangibleLongTermAssetsFormated,		//购建固定资产、无形资产和其他长期资产支付的现金
	netCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssetsFormated,	//处置固定、无形和其他长期资产收回现金
	purchaseConstructionFixedIntangibleLongTermAssetsProportionFormated,		//购建固产占经营活动产生的现金比
	netCashReceivedFromDisposalProportionTopurchaseFormated,					//处置固定资产、无形资产和其他长期资产收回的现金净额占购建资产支付的现金比
	financialReportDividendsFormated,							//现金分红金额
	dividendRateFormated,										//分红率（股利支付率）
	netCashFlowGeneratedFromInvestmentActivitiesFormated,		//投资活动产生的现金流量净额
	netCashFlowGeneratedFromFinancingActivitiesFormated,		//筹资活动产生的现金流量净额
	netIncreaseInCashAndCashEquivalentsFormated,				//现金及现金等价物净增加额
	netIncreaseInCashAndCashEquivalentsAddBonusFormated,		//加现金分红的现金及现金等价物净增加额
	closingBalanceOfCashAndCashEquivalentsFormated;				//期末现金及现金等价物余额
	
	
	int
	totalNumberOfPeople,								//总人数
	reportYear;											//财年年份
	
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
	
	//一级行业
	public void setPrimaryIndustry(String primaryIndustry) {
		this.primaryIndustry=primaryIndustry;
	}
		
	public String getPrimaryIndustry() {
		return primaryIndustry;
	}
	
	//二级行业
	public void setSecondaryIndustry(String secondaryIndustry) {
		this.secondaryIndustry=secondaryIndustry;
	}
		
	public String getSecondaryIndustry() {
		return secondaryIndustry;
	}
	
	//三级行业
	public void setThirdLevelIndustry(String thirdLevelIndustry) {
		this.thirdLevelIndustry=thirdLevelIndustry;
	}
		
	public String getThirdLevelIndustry() {
		return thirdLevelIndustry;
	}
	
	//所属区域
	public void setRegion(String region) {
		this.region=region;
	}
		
	public String getRegion() {
		return region;
	}
	
	//财报年份
	public void setFinancialReportingYear(String financialReportingYear) {
		this.financialReportingYear=financialReportingYear;
	}
		
	public String getFinancialReportingYear() {
		return financialReportingYear;
	}
	
	//公司类型
	public void setCompanyType(String companyType) {
		this.companyType=companyType;
	}
		
	public String getCompanyType() {
		return companyType;
	}
	
	//创建时间
	public void setCreateDateTime(String createDateTime) {
		this.createDateTime=createDateTime;
	}
		
	public String getCreateDateTime() {
		return createDateTime;
	}
	
	//数据来源：页面确认，自动触发
	public void setDataResource(String dataResource) {
		this.dataResource=dataResource;
	}
		
	public String getDataResource() {
		return dataResource;
	}
	
	//ROE
	public void setROEFormated(String ROEFormated) {
		this.ROEFormated=ROEFormated;
	}
		
	public String getROEFormated() {
		return ROEFormated;
	}
	
	//总资产
	public void setTotalAssetsFormated(String totalAssetsFormated) {
		this.totalAssetsFormated=totalAssetsFormated;
	}
		
	public String getTotalAssetsFormated() {
		return totalAssetsFormated;
	}
	
	//总资产增长率
	public void setTotalAssetsGrowthRateFormated(String totalAssetsGrowthRateFormated) {
		this.totalAssetsGrowthRateFormated=totalAssetsGrowthRateFormated;
	}
		
	public String getTotalAssetsGrowthRateFormated() {
		return totalAssetsGrowthRateFormated;
	}
	
	//股东权益合计（净资产）
	public void setTotalOwnersEquityFormated(String totalOwnersEquityFormated) {
		this.totalOwnersEquityFormated=totalOwnersEquityFormated;
	}
		
	public String getTotalOwnersEquityFormated() {
		return totalOwnersEquityFormated;
	}
	
	//权益乘数（总资产/净资产）
	public void setEquityMultiplierFormated(String equityMultiplierFormated) {
		this.equityMultiplierFormated=equityMultiplierFormated;
	}
		
	public String getEquityMultiplierFormated() {
		return equityMultiplierFormated;
	}
	
	//总负债
	public void setTotalLiabilitiesFormated(String totalLiabilitiesFormated) {
		this.totalLiabilitiesFormated=totalLiabilitiesFormated;
	}
		
	public String getTotalLiabilitiesFormated() {
		return totalLiabilitiesFormated;
	}
	
	//资产负债率
	public void setAssetLiabilityRatioFormated(String assetLiabilityRatioFormated) {
		this.assetLiabilityRatioFormated=assetLiabilityRatioFormated;
	}
		
	public String getAssetLiabilityRatioFormated() {
		return assetLiabilityRatioFormated;
	}
	
	//货币资金
	public void setMonetaryCapitalFormated(String monetaryCapitalFormated) {
		this.monetaryCapitalFormated=monetaryCapitalFormated;
	}
		
	public String getMonetaryCapitalFormated() {
		return monetaryCapitalFormated;
	}
	
	//短期借款
	public void setShortTermBorrowingFormated(String shortTermBorrowingFormated) {
		this.shortTermBorrowingFormated=shortTermBorrowingFormated;
	}
		
	public String getShortTermBorrowingFormated() {
		return shortTermBorrowingFormated;
	}
	
	//一年内到期的非流动负债
	public void setNonCurrentLiabilitiesDueWithinOneYearFormated(String nonCurrentLiabilitiesDueWithinOneYearFormated) {
		this.nonCurrentLiabilitiesDueWithinOneYearFormated=nonCurrentLiabilitiesDueWithinOneYearFormated;
	}
		
	public String getNonCurrentLiabilitiesDueWithinOneYearFormated() {
		return nonCurrentLiabilitiesDueWithinOneYearFormated;
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
	
	//长期应付款
	public void setLongTermPayablesFormated(String longTermPayablesFormated) {
		this.longTermPayablesFormated=longTermPayablesFormated;
	}
		
	public String getLongTermPayablesFormated() {
		return longTermPayablesFormated;
	}
	
	//有息负债(短期借款+一年内到期的非流动负债+长期借款+应付债券+长期应付款)
	public void setInterestBearingLiabilitiesFormated(String interestBearingLiabilitiesFormated) {
		this.interestBearingLiabilitiesFormated=interestBearingLiabilitiesFormated;
	}
		
	public String getInterestBearingLiabilitiesFormated() {
		return interestBearingLiabilitiesFormated;
	}
	
	//货币资金-有息负债
	public void setDebtRepaymentRiskFormated(String debtRepaymentRiskFormated) {
		this.debtRepaymentRiskFormated=debtRepaymentRiskFormated;
	}
		
	public String getDebtRepaymentRiskFormated() {
		return debtRepaymentRiskFormated;
	}
	
	//交易性金融资产中的理财产品
	public void setTradingFinancialAssetsManagementFormated(String tradingFinancialAssetsManagementFormated) {
		this.tradingFinancialAssetsManagementFormated=tradingFinancialAssetsManagementFormated;
	}
		
	public String getTradingFinancialAssetsManagementFormated() {
		return tradingFinancialAssetsManagementFormated;
	}
	
	//其他流动资产的理财产品
	public void setOtherCurrentAssetsManagementFormated(String otherCurrentAssetsManagementFormated) {
		this.otherCurrentAssetsManagementFormated=otherCurrentAssetsManagementFormated;
	}
		
	public String getOtherCurrentAssetsManagementFormated() {
		return otherCurrentAssetsManagementFormated;
	}
	
	//准货币资金
	public void setQuasiMonetaryFormated(String quasiMonetaryFormated) {
		this.quasiMonetaryFormated=quasiMonetaryFormated;
	}
		
	public String getQuasiMonetaryFormated() {
		return quasiMonetaryFormated;
	}
	
	//短期有息负债(短期借款+一年内到期的非流动负债)
	public void setShortTermForeignDebtFormated(String shortTermForeignDebtFormated) {
		this.shortTermForeignDebtFormated=shortTermForeignDebtFormated;
	}
		
	public String getShortTermForeignDebtFormated() {
		return shortTermForeignDebtFormated;
	}
	
	//准货币资金-短期有息负债
	public void setShortTermDebtRepaymentRiskFormated(String shortTermDebtRepaymentRiskFormated) {
		this.shortTermDebtRepaymentRiskFormated=shortTermDebtRepaymentRiskFormated;
	}
		
	public String getShortTermDebtRepaymentRiskFormated() {
		return shortTermDebtRepaymentRiskFormated;
	}
	
	//准货币资金占总资产比率
	public void setQuasiMonetaryCapitalRatioFormated(String quasiMonetaryCapitalRatioFormated) {
		this.quasiMonetaryCapitalRatioFormated=quasiMonetaryCapitalRatioFormated;
	}
		
	public String getQuasiMonetaryCapitalRatioFormated() {
		return quasiMonetaryCapitalRatioFormated;
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
	
	//应付预收合计
	public void setTotalAccountsPayablePrepaidFormated(String totalAccountsPayablePrepaidFormated) {
		this.totalAccountsPayablePrepaidFormated=totalAccountsPayablePrepaidFormated;
	}
		
	public String getTotalAccountsPayablePrepaidFormated() {
		return totalAccountsPayablePrepaidFormated;
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
	
	//合同资产
	public void setContractAssetsFormated(String contractAssetsFormated) {
		this.contractAssetsFormated=contractAssetsFormated;
	}
				
	public String getContractAssetsFormated() {
		return contractAssetsFormated;
	}
	
	//预付款项
	public void setPrepaymentsFormated(String prepaymentsFormated) {
		this.prepaymentsFormated=prepaymentsFormated;
	}
		
	public String getPrepaymentsFormated() {
		return prepaymentsFormated;
	}
	
	//合同负债
	public void setContractLiabilitiesFormated(String contractLiabilitiesFormated) {
		this.contractLiabilitiesFormated=contractLiabilitiesFormated;
	}
			
	public String getContractLiabilitiesFormated() {
		return contractLiabilitiesFormated;
	}
	
	//应收预付合计
	public void setTotalAccountsReceivablePrepaymentsFormated(String totalAccountsReceivablePrepaymentsFormated) {
		this.totalAccountsReceivablePrepaymentsFormated=totalAccountsReceivablePrepaymentsFormated;
	}
		
	public String getTotalAccountsReceivablePrepaymentsFormated() {
		return totalAccountsReceivablePrepaymentsFormated;
	}
	
	//应付预收合计-应收预付合计
	public void setOccupySomeoneElseFundsFormated(String occupySomeoneElseFundsFormated) {
		this.occupySomeoneElseFundsFormated=occupySomeoneElseFundsFormated;
	}
		
	public String getOccupySomeoneElseFundsFormated() {
		return occupySomeoneElseFundsFormated;
	}
	
	//应收账款占总资产的比率
	public void setAccountsReceivableRatioFormated(String accountsReceivableRatioFormated) {
		this.accountsReceivableRatioFormated=accountsReceivableRatioFormated;
	}
		
	public String getAccountsReceivableRatioFormated() {
		return accountsReceivableRatioFormated;
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
	
	//固产合计
	public void setTotalTFxedAssetsFormated(String totalTFxedAssetsFormated) {
		this.totalTFxedAssetsFormated=totalTFxedAssetsFormated;
	}
		
	public String getTotalTFxedAssetsFormated() {
		return totalTFxedAssetsFormated;
	}
	
	//固产合计占总资产的比率
	public void setFixedAssetRatioFormated(String fixedAssetRatioFormated) {
		this.fixedAssetRatioFormated=fixedAssetRatioFormated;
	}
		
	public String getFixedAssetRatioFormated() {
		return fixedAssetRatioFormated;
	}
	
	//交易性金融资产
	public void setTradingFinancialAssetsFormated(String tradingFinancialAssetsFormated) {
		this.tradingFinancialAssetsFormated=tradingFinancialAssetsFormated;
	}
		
	public String getTradingFinancialAssetsFormated() {
		return tradingFinancialAssetsFormated;
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
	
	//长期股权投资
	public void setLongTermEquityInvestmentFormated(String longTermEquityInvestmentFormated) {
		this.longTermEquityInvestmentFormated=longTermEquityInvestmentFormated;
	}
		
	public String getLongTermEquityInvestmentFormated() {
		return longTermEquityInvestmentFormated;
	}
	
	//投资类资产小计
	public void setSubtotalOfInvestmentAssetsFormated(String subtotalOfInvestmentAssetsFormated) {
		this.subtotalOfInvestmentAssetsFormated=subtotalOfInvestmentAssetsFormated;
	}
			
	public String getSubtotalOfInvestmentAssetsFormated() {
		return subtotalOfInvestmentAssetsFormated;
	}
	
	//投资类资产占总资产的比率
	public void setInvestmentAssetRatioFormated(String investmentAssetRatioFormated) {
		this.investmentAssetRatioFormated=investmentAssetRatioFormated;
	}
		
	public String getInvestmentAssetRatioFormated() {
		return investmentAssetRatioFormated;
	}
	
	//无形资产
	public void setIntangibleAssetsFormated(String intangibleAssetsFormated) {
		this.intangibleAssetsFormated=intangibleAssetsFormated;
	}
		
	public String getIntangibleAssetsFormated() {
		return intangibleAssetsFormated;
	}
	
	//商誉
	public void setGoodwillFormated(String goodwillFormated) {
		this.goodwillFormated=goodwillFormated;
	}
		
	public String getGoodwillFormated() {
		return goodwillFormated;
	}
	
	//无形资产占比
	public void setTheProportionOfIntangibleAssetsFormated(String theProportionOfIntangibleAssetsFormated) {
		this.theProportionOfIntangibleAssetsFormated=theProportionOfIntangibleAssetsFormated;
	}
		
	public String getTheProportionOfIntangibleAssetsFormated() {
		return theProportionOfIntangibleAssetsFormated;
	}
	
	//商誉占比
	public void setGoodwillProportionFormated(String goodwillProportionFormated) {
		this.goodwillProportionFormated=goodwillProportionFormated;
	}
		
	public String getGoodwillProportionFormated() {
		return goodwillProportionFormated;
	}
	
	//应付职工薪酬
	public void setPayrollPayableFormated(String payrollPayableFormated) {
		this.payrollPayableFormated=payrollPayableFormated;
	}
		
	public String getPayrollPayableFormated() {
		return payrollPayableFormated;
	}
	
	//支付给职工以及为职工支付的现金
	public void setCashPaidToAndOnBehalfOfEmployeesFormated(String cashPaidToAndOnBehalfOfEmployeesFormated) {
		this.cashPaidToAndOnBehalfOfEmployeesFormated=cashPaidToAndOnBehalfOfEmployeesFormated;
	}
		
	public String getCashPaidToAndOnBehalfOfEmployeesFormated() {
		return cashPaidToAndOnBehalfOfEmployeesFormated;
	}
	
	//当年职工总薪酬
	public void setTotalEmployeeCompensationFormated(String totalEmployeeCompensationFormated) {
		this.totalEmployeeCompensationFormated=totalEmployeeCompensationFormated;
	}
		
	public String getTotalEmployeeCompensationFormated() {
		return totalEmployeeCompensationFormated;
	}
	
	//人均年薪
	public void setPerCapitaAnnualSalaryFormated(String perCapitaAnnualSalaryFormated) {
		this.perCapitaAnnualSalaryFormated=perCapitaAnnualSalaryFormated;
	}
		
	public String getPerCapitaAnnualSalaryFormated() {
		return perCapitaAnnualSalaryFormated;
	}
	
	//人均月薪
	public void setPerCapitaMonthlySalaryFormated(String perCapitaMonthlySalaryFormated) {
		this.perCapitaMonthlySalaryFormated=perCapitaMonthlySalaryFormated;
	}
		
	public String getPerCapitaMonthlySalaryFormated() {
		return perCapitaMonthlySalaryFormated;
	}
	
	//营业收入
	public void setOperatingRevenueFormated(String operatingRevenueFormated) {
		this.operatingRevenueFormated=operatingRevenueFormated;
	}
		
	public String getOperatingRevenueFormated() {
		return operatingRevenueFormated;
	}
	
	//营业收入增长率
	public void setRevenueGrowthRateFormated(String revenueGrowthRateFormated) {
		this.revenueGrowthRateFormated=revenueGrowthRateFormated;
	}
		
	public String getRevenueGrowthRateFormated() {
		return revenueGrowthRateFormated;
	}
	
	//总资产周转率
	public void setTotalAssetTurnoverFormated(String totalAssetTurnoverFormated) {
		this.totalAssetTurnoverFormated=totalAssetTurnoverFormated;
	}
		
	public String getTotalAssetTurnoverFormated() {
		return totalAssetTurnoverFormated;
	}
	
	//销售商品、提供劳务收到的现金
	public void setCashReceivedFromSellingGoodsAndProvidingServicesFormated(String cashReceivedFromSellingGoodsAndProvidingServicesFormated) {
		this.cashReceivedFromSellingGoodsAndProvidingServicesFormated=cashReceivedFromSellingGoodsAndProvidingServicesFormated;
	}
		
	public String getCashReceivedFromSellingGoodsAndProvidingServicesFormated() {
		return cashReceivedFromSellingGoodsAndProvidingServicesFormated;
	}
	
	//销售商品、提供劳务收到的现金占营收的比率
	public void setProportionOfCashSellingGoodsProvidingServicesFormated(String proportionOfCashSellingGoodsProvidingServicesFormated) {
		this.proportionOfCashSellingGoodsProvidingServicesFormated=proportionOfCashSellingGoodsProvidingServicesFormated;
	}
		
	public String getProportionOfCashSellingGoodsProvidingServicesFormated() {
		return proportionOfCashSellingGoodsProvidingServicesFormated;
	}
	
	//其他应收款
	public void setOtherReceivablesFormated(String otherReceivablesFormated) {
		this.otherReceivablesFormated=otherReceivablesFormated;
	}
		
	public String getOtherReceivablesFormated() {
		return otherReceivablesFormated;
	}
	
	//存货
	public void setInventoryFormated(String inventoryFormated) {
		this.inventoryFormated=inventoryFormated;
	}
		
	public String getInventoryFormated() {
		return inventoryFormated;
	}
	
	//存货
	public void setInventoryGrowthRateFormated(String inventoryGrowthRateFormated) {
		this.inventoryGrowthRateFormated=inventoryGrowthRateFormated;
	}
			
	public String getInventoryGrowthRateFormated() {
		return inventoryGrowthRateFormated;
	}
	
	//应收账款/营收
	public void setAccountsReceivablePercentageOfRevenueFormated(String accountsReceivablePercentageOfRevenueFormated) {
		this.accountsReceivablePercentageOfRevenueFormated=accountsReceivablePercentageOfRevenueFormated;
	}
		
	public String getAccountsReceivablePercentageOfRevenueFormated() {
		return accountsReceivablePercentageOfRevenueFormated;
	}
	
	//预付款项/营收
	public void setPrepaymentsPercentageOfRevenueFormated(String prepaymentsPercentageOfRevenueFormated) {
		this.prepaymentsPercentageOfRevenueFormated=prepaymentsPercentageOfRevenueFormated;
	}
		
	public String getPrepaymentsPercentageOfRevenueFormated() {
		return prepaymentsPercentageOfRevenueFormated;
	}
	
	//其他应收款/营收
	public void setOtherReceivablesPercentageOfRevenueFormated(String otherReceivablesPercentageOfRevenueFormated) {
		this.otherReceivablesPercentageOfRevenueFormated=otherReceivablesPercentageOfRevenueFormated;
	}
		
	public String getOtherReceivablesPercentageOfRevenueFormated() {
		return otherReceivablesPercentageOfRevenueFormated;
	}
	
	//存货/营收
	public void setInventoryToRevenueRatioFormated(String inventoryToRevenueRatioFormated) {
		this.inventoryToRevenueRatioFormated=inventoryToRevenueRatioFormated;
	}
		
	public String getInventoryToRevenueRatioFormated() {
		return inventoryToRevenueRatioFormated;
	}
	
	//营业成本
	public void setOperatingCostsFormated(String operatingCostsFormated) {
		this.operatingCostsFormated=operatingCostsFormated;
	}
		
	public String getOperatingCostsFormated() {
		return operatingCostsFormated;
	}
	
	//毛利率
	public void setGrossMarginFormated(String grossMarginFormated) {
		this.grossMarginFormated=grossMarginFormated;
	}
		
	public String getGrossMarginFormated() {
		return grossMarginFormated;
	}
	
	//销售费用
	public void setSellingExpensesFormated(String sellingExpensesFormated) {
		this.sellingExpensesFormated=sellingExpensesFormated;
	}
		
	public String getSellingExpensesFormated() {
		return sellingExpensesFormated;
	}
	
	//销售费用率
	public void setSalesExpenseRateFormated(String salesExpenseRateFormated) {
		this.salesExpenseRateFormated=salesExpenseRateFormated;
	}
		
	public String getSalesExpenseRateFormated() {
		return salesExpenseRateFormated;
	}
	
	//管理费用
	public void setOverheadFormated(String overheadFormated) {
		this.overheadFormated=overheadFormated;
	}
		
	public String getOverheadFormated() {
		return overheadFormated;
	}
	
	//管理费用率
	public void setManagementExpenseRateFormated(String managementExpenseRateFormated) {
		this.managementExpenseRateFormated=managementExpenseRateFormated;
	}
		
	public String getManagementExpenseRateFormated() {
		return managementExpenseRateFormated;
	}
	
	//研发费用
	public void setResearchAndDevelopmentFormated(String researchAndDevelopmentFormated) {
		this.researchAndDevelopmentFormated=researchAndDevelopmentFormated;
	}
		
	public String getResearchAndDevelopmentFormated() {
		return researchAndDevelopmentFormated;
	}
	
	//研发费用率
	public void setResearchAndDevelopmentRateFormated(String researchAndDevelopmentRateFormated) {
		this.researchAndDevelopmentRateFormated=researchAndDevelopmentRateFormated;
	}
		
	public String getResearchAndDevelopmentRateFormated() {
		return researchAndDevelopmentRateFormated;
	}
	
	//财务费用
	public void setFinancialExpensesFormated(String financialExpensesFormated) {
		this.financialExpensesFormated=financialExpensesFormated;
	}
		
	public String getFinancialExpensesFormated() {
		return financialExpensesFormated;
	}
	
	//费用率
	public void setExpenseFormated(String expenseFormated) {
		this.expenseFormated=expenseFormated;
	}
		
	public String getExpenseFormated() {
		return expenseFormated;
	}
	
	//费用率占毛利率的比率
	public void setExpenseRateToGrossProfitMarginFormated(String expenseRateToGrossProfitMarginFormated) {
		this.expenseRateToGrossProfitMarginFormated=expenseRateToGrossProfitMarginFormated;
	}
		
	public String getExpenseRateToGrossProfitMarginFormated() {
		return expenseRateToGrossProfitMarginFormated;
	}
	
	//税金及附加
	public void setTaxesAndSurchargesFormated(String taxesAndSurchargesFormated) {
		this.taxesAndSurchargesFormated=taxesAndSurchargesFormated;
	}
		
	public String getTaxesAndSurchargesFormated() {
		return taxesAndSurchargesFormated;
	}
	
	//四项费用
	public void setFourExpensesFormated(String fourExpensesFormated) {
		this.fourExpensesFormated=fourExpensesFormated;
	}
		
	public String getFourExpensesFormated() {
		return fourExpensesFormated;
	}
	
	//利润总额
	public void setTotalProfitFormated(String totalProfitFormated) {
		this.totalProfitFormated=totalProfitFormated;
	}
		
	public String getTotalProfitFormated() {
		return totalProfitFormated;
	}
	
	//主营利润
	public void setMainProfitFormated(String mainProfitFormated) {
		this.mainProfitFormated=mainProfitFormated;
	}
		
	public String getMainProfitFormated() {
		return mainProfitFormated;
	}
	
	//主营利润率
	public void setMainProfitMarginFormated(String mainProfitMarginFormated) {
		this.mainProfitMarginFormated=mainProfitMarginFormated;
	}
		
	public String getMainProfitMarginFormated() {
		return mainProfitMarginFormated;
	}
	
	//主营利润占利润总额的比例
	public void setMainOperatingProfitToTotalProfitFormated(String mainOperatingProfitToTotalProfitFormated) {
		this.mainOperatingProfitToTotalProfitFormated=mainOperatingProfitToTotalProfitFormated;
	}
		
	public String getMainOperatingProfitToTotalProfitFormated() {
		return mainOperatingProfitToTotalProfitFormated;
	}
	
	//营业利润
	public void setOperatingProfitFormated(String operatingProfitFormated) {
		this.operatingProfitFormated=operatingProfitFormated;
	}
		
	public String getOperatingProfitFormated() {
		return operatingProfitFormated;
	}

	
	//净利润
	public void setNetProfitFormated(String netProfitFormated) {
		this.netProfitFormated=netProfitFormated;
	}
		
	public String getNetProfitFormated() {
		return netProfitFormated;
	}
	
	//营业利润率
	public void setOperatingMarginFormated(String operatingMarginFormated) {
		this.operatingMarginFormated=operatingMarginFormated;
	}
				
	public String getOperatingMarginFormated() {
		return operatingMarginFormated;
	}
	
	//净利润增长率
	public void setNetProfitGrowthRateFormated(String netProfitGrowthRateFormated) {
		this.netProfitGrowthRateFormated=netProfitGrowthRateFormated;
	}
		
	public String getNetProfitGrowthRateFormated() {
		return netProfitGrowthRateFormated;
	}
	
	//净利润率
	public void setNetProfitMarginFormated(String netProfitMarginFormated) {
		this.netProfitMarginFormated=netProfitMarginFormated;
	}
			
	public String getNetProfitMarginFormated() {
		return netProfitMarginFormated;
	}
	
	//经营活动产生的现金流量净额
	public void setNetCashFlowFromOperatingFormated(String netCashFlowFromOperatingFormated) {
		this.netCashFlowFromOperatingFormated=netCashFlowFromOperatingFormated;
	}
		
	public String getNetCashFlowFromOperatingFormated() {
		return netCashFlowFromOperatingFormated;
	}
	
	//经营活动产生的现金流量净额同比增长率
	public void setGrowthRateOfNetCashFlowFromOperatingFormated(String growthRateOfNetCashFlowFromOperatingFormated) {
		this.growthRateOfNetCashFlowFromOperatingFormated=growthRateOfNetCashFlowFromOperatingFormated;
	}
				
	public String getGrowthRateOfNetCashFlowFromOperatingFormated() {
		return growthRateOfNetCashFlowFromOperatingFormated;
	}
	
	//净利润现金比率
	public void setNetProfitCashRatioFormated(String netProfitCashRatioFormated) {
		this.netProfitCashRatioFormated=netProfitCashRatioFormated;
	}
		
	public String getNetProfitCashRatioFormated() {
		return netProfitCashRatioFormated;
	}
	
	//归属于母公司所有者的净利润
	public void setNetIncomeAttributableToShareholdersFormated(String netIncomeAttributableToShareholdersFormated) {
		this.netIncomeAttributableToShareholdersFormated=netIncomeAttributableToShareholdersFormated;
	}
		
	public String getNetIncomeAttributableToShareholdersFormated() {
		return netIncomeAttributableToShareholdersFormated;
	}
	
	//归属于母公司所有者的净利润同比增长率
	public void setGrowthRateOfNetIncomeAttributableToShareholdersFormated(String growthRateOfNetIncomeAttributableToShareholdersFormated) {
		this.growthRateOfNetIncomeAttributableToShareholdersFormated=growthRateOfNetIncomeAttributableToShareholdersFormated;
	}
				
	public String getGrowthRateOfNetIncomeAttributableToShareholdersFormated() {
		return growthRateOfNetIncomeAttributableToShareholdersFormated;
	}
		
	//固定资产折旧
	public void setDepreciationFormated(String depreciationFormated) {
		this.depreciationFormated=depreciationFormated;
	}
		
	public String getDepreciationFormated() {
		return depreciationFormated;
	}
	
	//无形资产摊销
	public void setAmortizationOfIntangibleAssetsFormated(String amortizationOfIntangibleAssetsFormated) {
		this.amortizationOfIntangibleAssetsFormated=amortizationOfIntangibleAssetsFormated;
	}
		
	public String getAmortizationOfIntangibleAssetsFormated() {
		return amortizationOfIntangibleAssetsFormated;
	}
	
	//现金股利(分配股利、利润或偿付利息支付的现金)
	public void setCashPaidForDistributingDividendsProfitsPayingInterestFormated(String cashPaidForDistributingDividendsProfitsPayingInterestFormated) {
		this.cashPaidForDistributingDividendsProfitsPayingInterestFormated=cashPaidForDistributingDividendsProfitsPayingInterestFormated;
	}
				
	public String getCashPaidForDistributingDividendsProfitsPayingInterestFormated() {
		return cashPaidForDistributingDividendsProfitsPayingInterestFormated;
	}
	
	//经营活动产生的现金流量净额减去以上三项的余额
	public void setRemainingCashFormated(String remainingCashFormated) {
		this.remainingCashFormated=remainingCashFormated;
	}
		
	public String getRemainingCashFormated() {
		return remainingCashFormated;
	}
	
	//购建固定资产、无形资产和其他长期资产支付的现金
	public void setCashPaidForPurchaseConstructionFixedIntangibleLongTermAssetsFormated(String cashPaidForPurchaseConstructionFixedIntangibleLongTermAssetsFormated) {
		this.cashPaidForPurchaseConstructionFixedIntangibleLongTermAssetsFormated=cashPaidForPurchaseConstructionFixedIntangibleLongTermAssetsFormated;
	}
		
	public String getCashPaidForPurchaseConstructionFixedIntangibleLongTermAssetsFormated() {
		return cashPaidForPurchaseConstructionFixedIntangibleLongTermAssetsFormated;
	}
	
	
	//处置固定、无形和其他长期资产收回现金
	public void setNetCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssetsFormated(String netCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssetsFormated) {
		this.netCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssetsFormated=netCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssetsFormated;
	}
		
	public String getNetCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssetsFormated() {
		return netCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssetsFormated;
	}
	
	
	//购建固产占经营活动产生的现金比
	public void setPurchaseConstructionFixedIntangibleLongTermAssetsProportionFormated(String purchaseConstructionFixedIntangibleLongTermAssetsProportionFormated) {
		this.purchaseConstructionFixedIntangibleLongTermAssetsProportionFormated=purchaseConstructionFixedIntangibleLongTermAssetsProportionFormated;
	}
		
	public String getPurchaseConstructionFixedIntangibleLongTermAssetsProportionFormated() {
		return purchaseConstructionFixedIntangibleLongTermAssetsProportionFormated;
	}
	
	
	//处置固定资产、无形资产和其他长期资产收回的现金净额占购建资产支付的现金比
	public void setNetCashReceivedFromDisposalProportionTopurchaseFormated(String netCashReceivedFromDisposalProportionTopurchaseFormated) {
		this.netCashReceivedFromDisposalProportionTopurchaseFormated=netCashReceivedFromDisposalProportionTopurchaseFormated;
	}
		
	public String getNetCashReceivedFromDisposalProportionTopurchaseFormated() {
		return netCashReceivedFromDisposalProportionTopurchaseFormated;
	}
	
	//现金分红金额
	public void setFinancialReportDividendsFormated(String financialReportDividendsFormated) {
		this.financialReportDividendsFormated=financialReportDividendsFormated;
	}
		
	public String getFinancialReportDividendsFormated() {
		return financialReportDividendsFormated;
	}
	
	//分红率（股利支付率）
	public void setDividendRateFormated(String dividendRateFormated) {
		this.dividendRateFormated=dividendRateFormated;
	}
		
	public String getDividendRateFormated() {
		return dividendRateFormated;
	}
	
	//投资活动产生的现金流量净额
	public void setNetCashFlowGeneratedFromInvestmentActivitiesFormated(String netCashFlowGeneratedFromInvestmentActivitiesFormated) {
		this.netCashFlowGeneratedFromInvestmentActivitiesFormated=netCashFlowGeneratedFromInvestmentActivitiesFormated;
	}
		
	public String getNetCashFlowGeneratedFromInvestmentActivitiesFormated() {
		return netCashFlowGeneratedFromInvestmentActivitiesFormated;
	}
	
	//筹资活动产生的现金流量净额
	public void setNetCashFlowGeneratedFromFinancingActivitiesFormated(String netCashFlowGeneratedFromFinancingActivitiesFormated) {
		this.netCashFlowGeneratedFromFinancingActivitiesFormated=netCashFlowGeneratedFromFinancingActivitiesFormated;
	}
		
	public String getNetCashFlowGeneratedFromFinancingActivitiesFormated() {
		return netCashFlowGeneratedFromFinancingActivitiesFormated;
	}
	
	//现金及现金等价物净增加额
	public void setNetIncreaseInCashAndCashEquivalentsFormated(String netIncreaseInCashAndCashEquivalentsFormated) {
		this.netIncreaseInCashAndCashEquivalentsFormated=netIncreaseInCashAndCashEquivalentsFormated;
	}
		
	public String getNetIncreaseInCashAndCashEquivalentsFormated() {
		return netIncreaseInCashAndCashEquivalentsFormated;
	}
	
	//加现金分红的现金及现金等价物净增加额
	public void setNetIncreaseInCashAndCashEquivalentsAddBonusFormated(String netIncreaseInCashAndCashEquivalentsAddBonusFormated) {
		this.netIncreaseInCashAndCashEquivalentsAddBonusFormated=netIncreaseInCashAndCashEquivalentsAddBonusFormated;
	}
		
	public String getNetIncreaseInCashAndCashEquivalentsAddBonusFormated() {
		return netIncreaseInCashAndCashEquivalentsAddBonusFormated;
	}
	
	//期末现金及现金等价物余额
	public void setClosingBalanceOfCashAndCashEquivalentsFormated(String closingBalanceOfCashAndCashEquivalentsFormated) {
		this.closingBalanceOfCashAndCashEquivalentsFormated=closingBalanceOfCashAndCashEquivalentsFormated;
	}
		
	public String getClosingBalanceOfCashAndCashEquivalentsFormated() {
		return closingBalanceOfCashAndCashEquivalentsFormated;
	}
	
	//总人数
	public void setTotalNumberOfPeople(int totalNumberOfPeople) {
		this.totalNumberOfPeople=totalNumberOfPeople;
	}
		
	public int getTotalNumberOfPeople() {
		return totalNumberOfPeople;
	}
	
	//财报年份
	public void setReportYear(int reportYear) {
		this.reportYear=reportYear;
	}
			
	public int getReportYear() {
		return reportYear;
	}
}
