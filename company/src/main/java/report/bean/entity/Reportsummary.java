package report.bean.entity;

public class Reportsummary {

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
	dataResource;										//数据来源：页面确认，自动触发
	
	
	double
	totalAssets,										//总资产
	totalAssetsGrowthRate,								//总资产增长率
	totalOwnersEquity,									//股东权益合计（净资产）
	equityMultiplier,									//权益乘数（总资产/净资产）
	totalLiabilities,									//总负债
	assetLiabilityRatio,								//资产负债率
	monetaryCapital,									//货币资金
	shortTermBorrowing,									//短期借款
	nonCurrentLiabilitiesDueWithinOneYear,				//一年内到期的非流动负债
	longTermLoan,										//长期借款
	bondsPayable,										//应付债券
	longTermPayables,									//长期应付款
	interestBearingLiabilities,							//有息负债(短期借款+一年内到期的非流动负债+长期借款+应付债券+长期应付款)
	debtRepaymentRisk,									//货币资金-有息负债
	tradingFinancialAssetsManagement,					//交易性金融资产中的理财产品
	otherCurrentAssetsManagement,						//其他流动资产的理财产品
	quasiMonetary,										//准货币资金
	shortTermForeignDebt,								//短期有息负债(短期借款+一年内到期的非流动负债)
	shortTermDebtRepaymentRisk,							//准货币资金-短期有息负债
	quasiMonetaryCapitalRatio,							//准货币资金占总资产比率
	notesPayable,										//应付票据
	accountsPayable,									//应付账款
	advanceReceipts,									//预收款项
	totalAccountsPayablePrepaid,						//应付预收合计
	billReceivable,										//应收票据
	accountsReceivable,									//应收账款
	accountsReceivableFinancing,						//应收款项融资
	contractAssets,										//合同资产
	prepayments,										//预付款项
	contractLiabilities,								//合同负债
	totalAccountsReceivablePrepayments,					//应收预付合计
	occupySomeoneElseFunds,								//应付预收合计-应收预付合计
	accountsReceivableRatio,							//应收账款占总资产的比率
	fixedAssets,										//固定资产
	constructionInProgress,								//在建工程
	totalTFxedAssets,									//固产合计
	fixedAssetRatio,									//固产合计占总资产的比率
	tradingFinancialAssets,								//交易性金融资产
	otherNonCurrentFinancialAssets,						//其他非流动金融资产
	investmentRealEstate,								//投资性房地产
	longTermEquityInvestment,							//长期股权投资
	subtotalOfInvestmentAssets,							//投资类资产小计
	investmentAssetRatio,								//投资类资产占总资产的比率
	intangibleAssets,									//无形资产
	goodwill,											//商誉
	theProportionOfIntangibleAssets,					//无形资产/总资产
	goodwillProportion,									//商誉占比/总资产
	payrollPayable						,				//应付职工薪酬
	cashPaidToAndOnBehalfOfEmployees,					//支付给职工以及为职工支付的现金
	totalEmployeeCompensation,							//当年职工总薪酬
	perCapitaAnnualSalary,								//人均年薪
	perCapitaMonthlySalary,								//人均月薪
	operatingRevenue,									//营业收入
	revenueGrowthRate,									//营业收入增长率
	totalAssetTurnover,									//总资产周转率
	cashReceivedFromSellingGoodsAndProvidingServices,	//销售商品、提供劳务收到的现金
	proportionOfCashSellingGoodsProvidingServices,		//销售商品、提供劳务收到的现金占营收的比率
	otherReceivables,									//其他应收款
	inventory,											//存货
	inventoryGrowthRate,								//存货增长率
	accountsReceivablePercentageOfRevenue,				//应收账款/总资产
	prepaymentsPercentageOfRevenue,						//预付款项/总资产
	otherReceivablesPercentageOfRevenue,				//其他应收款/总资产
	inventoryToRevenueRatio,							//存货/总资产
	operatingCosts,										//营业成本
	grossMargin,										//毛利率
	sellingExpenses,									//销售费用
	salesExpenseRate,									//销售费用率
	overhead,											//管理费用
	managementExpenseRate,								//管理费用率
	researchAndDevelopment,								//研发费用
	researchAndDevelopmentRate,							//研发费用率
	financialExpenses,									//财务费用
	expense,											//费用率
	expenseRateToGrossProfitMargin,						//费用率占毛利率的比率
	taxesAndSurcharges,									//税金及附加
	fourExpenses,										//四项费用
	totalProfit,										//利润总额
	mainProfit,											//主营利润
	mainProfitMargin,									//主营利润率
	operatingProfit,									//营业利润
	operatingMargin,									//营业利润率
	mainOperatingProfitToTotalProfit,					//主营利润占营业利润的比例
	netProfit,											//净利润
	netProfitGrowthRate,								//净利润增长率
	netProfitMargin,									//净利润率
	netCashFlowFromOperating,							//经营活动产生的现金流量净额
	growthRateOfNetCashFlowFromOperating,				//经营活动产生的现金流量净额同比增长
	netProfitCashRatio,									//净利润现金比率
	netIncomeAttributableToShareholders,				//归属于母公司所有者的净利润
	growthRateOfNetIncomeAttributableToShareholders,	//归母净利润增长率
	depreciation,										//固定资产折旧
	amortizationOfIntangibleAssets,						//无形资产摊销
	cashPaidForDistributingDividendsProfitsPayingInterest,				//现金股利(分配股利、利润或偿付利息支付的现金)	
	remainingCash,										//经营活动产生的现金流量净额减去以上三项的余额
	cashPaidForPurchaseConstructionFixedIntangibleLongTermAssets,		//购建固定资产、无形资产和其他长期资产支付的现金
	netCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssets,	//处置固定、无形和其他长期资产收回现金
	purchaseConstructionFixedIntangibleLongTermAssetsProportion,		//购建固产占经营活动产生的现金比
	netCashReceivedFromDisposalProportionTopurchase,					//处置固定资产、无形资产和其他长期资产收回的现金净额占购建资产支付的现金比
	financialReportDividends,							//现金分红金额
	dividendRate,										//分红率（股利支付率）
	netCashFlowGeneratedFromInvestmentActivities,		//投资活动产生的现金流量净额
	netCashFlowGeneratedFromFinancingActivities,		//筹资活动产生的现金流量净额
	netIncreaseInCashAndCashEquivalents,				//现金及现金等价物净增加额
	netIncreaseInCashAndCashEquivalentsAddBonus,		//加现金分红的现金及现金等价物净增加额
	closingBalanceOfCashAndCashEquivalents,				//期末现金及现金等价物余额
	ROE;												//ROE
	
	int
	totalNumberOfPeople,								//总人数
	reportYear;											//财报年份
	
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
	public void setROE(double ROE) {
		this.ROE=ROE;
	}
		
	public double getROE() {
		return ROE;
	}
	
	//总资产
	public void setTotalAssets(double totalAssets) {
		this.totalAssets=totalAssets;
	}
		
	public double getTotalAssets() {
		return totalAssets;
	}
	
	//总资产增长率
	public void setTotalAssetsGrowthRate(double totalAssetsGrowthRate) {
		this.totalAssetsGrowthRate=totalAssetsGrowthRate;
	}
		
	public double getTotalAssetsGrowthRate() {
		return totalAssetsGrowthRate;
	}
	
	//股东权益合计（净资产）
	public void setTotalOwnersEquity(double totalOwnersEquity) {
		this.totalOwnersEquity=totalOwnersEquity;
	}
		
	public double getTotalOwnersEquity() {
		return totalOwnersEquity;
	}
	
	//权益乘数（总资产/净资产）
	public void setEquityMultiplier(double equityMultiplier) {
		this.equityMultiplier=equityMultiplier;
	}
		
	public double getEquityMultiplier() {
		return equityMultiplier;
	}
	
	//总负债
	public void setTotalLiabilities(double totalLiabilities) {
		this.totalLiabilities=totalLiabilities;
	}
		
	public double getTotalLiabilities() {
		return totalLiabilities;
	}
	
	//资产负债率
	public void setAssetLiabilityRatio(double assetLiabilityRatio) {
		this.assetLiabilityRatio=assetLiabilityRatio;
	}
		
	public double getAssetLiabilityRatio() {
		return assetLiabilityRatio;
	}
	
	//货币资金
	public void setMonetaryCapital(double monetaryCapital) {
		this.monetaryCapital=monetaryCapital;
	}
		
	public double getMonetaryCapital() {
		return monetaryCapital;
	}
	
	//短期借款
	public void setShortTermBorrowing(double shortTermBorrowing) {
		this.shortTermBorrowing=shortTermBorrowing;
	}
		
	public double getShortTermBorrowing() {
		return shortTermBorrowing;
	}
	
	//一年内到期的非流动负债
	public void setNonCurrentLiabilitiesDueWithinOneYear(double nonCurrentLiabilitiesDueWithinOneYear) {
		this.nonCurrentLiabilitiesDueWithinOneYear=nonCurrentLiabilitiesDueWithinOneYear;
	}
		
	public double getNonCurrentLiabilitiesDueWithinOneYear() {
		return nonCurrentLiabilitiesDueWithinOneYear;
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
	
	//长期应付款
	public void setLongTermPayables(double longTermPayables) {
		this.longTermPayables=longTermPayables;
	}
		
	public double getLongTermPayables() {
		return longTermPayables;
	}
	
	//有息负债(短期借款+一年内到期的非流动负债+长期借款+应付债券+长期应付款)
	public void setInterestBearingLiabilities(double interestBearingLiabilities) {
		this.interestBearingLiabilities=interestBearingLiabilities;
	}
		
	public double getInterestBearingLiabilities() {
		return interestBearingLiabilities;
	}
	
	//货币资金-有息负债
	public void setDebtRepaymentRisk(double debtRepaymentRisk) {
		this.debtRepaymentRisk=debtRepaymentRisk;
	}
		
	public double getDebtRepaymentRisk() {
		return debtRepaymentRisk;
	}
	
	//交易性金融资产中的理财产品
	public void setTradingFinancialAssetsManagement(double tradingFinancialAssetsManagement) {
		this.tradingFinancialAssetsManagement=tradingFinancialAssetsManagement;
	}
		
	public double getTradingFinancialAssetsManagement() {
		return tradingFinancialAssetsManagement;
	}
	
	//其他流动资产的理财产品
	public void setOtherCurrentAssetsManagement(double otherCurrentAssetsManagement) {
		this.otherCurrentAssetsManagement=otherCurrentAssetsManagement;
	}
		
	public double getOtherCurrentAssetsManagement() {
		return otherCurrentAssetsManagement;
	}
	
	//准货币资金
	public void setQuasiMonetary(double quasiMonetary) {
		this.quasiMonetary=quasiMonetary;
	}
		
	public double getQuasiMonetary() {
		return quasiMonetary;
	}
	
	//短期有息负债(短期借款+一年内到期的非流动负债)
	public void setShortTermForeignDebt(double shortTermForeignDebt) {
		this.shortTermForeignDebt=shortTermForeignDebt;
	}
		
	public double getShortTermForeignDebt() {
		return shortTermForeignDebt;
	}
	
	//准货币资金-短期有息负债
	public void setShortTermDebtRepaymentRisk(double shortTermDebtRepaymentRisk) {
		this.shortTermDebtRepaymentRisk=shortTermDebtRepaymentRisk;
	}
		
	public double getShortTermDebtRepaymentRisk() {
		return shortTermDebtRepaymentRisk;
	}
	
	//准货币资金占总资产比率
	public void setQuasiMonetaryCapitalRatio(double quasiMonetaryCapitalRatio) {
		this.quasiMonetaryCapitalRatio=quasiMonetaryCapitalRatio;
	}
		
	public double getQuasiMonetaryCapitalRatio() {
		return quasiMonetaryCapitalRatio;
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
	
	//应付预收合计
	public void setTotalAccountsPayablePrepaid(double totalAccountsPayablePrepaid) {
		this.totalAccountsPayablePrepaid=totalAccountsPayablePrepaid;
	}
		
	public double getTotalAccountsPayablePrepaid() {
		return totalAccountsPayablePrepaid;
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
	
	//合同资产
	public void setContractAssets(double contractAssets) {
		this.contractAssets=contractAssets;
	}
			
	public double getContractAssets() {
		return contractAssets;
	}
	
	//预付款项
	public void setPrepayments(double prepayments) {
		this.prepayments=prepayments;
	}
		
	public double getPrepayments() {
		return prepayments;
	}
	
	//合同负债
	public void setContractLiabilities(double contractLiabilities) {
		this.contractLiabilities=contractLiabilities;
	}
			
	public double getContractLiabilities() {
		return contractLiabilities;
	}
	
	//应收预付合计
	public void setTotalAccountsReceivablePrepayments(double totalAccountsReceivablePrepayments) {
		this.totalAccountsReceivablePrepayments=totalAccountsReceivablePrepayments;
	}
		
	public double getTotalAccountsReceivablePrepayments() {
		return totalAccountsReceivablePrepayments;
	}
	
	//应付预收合计-应收预付合计
	public void setOccupySomeoneElseFunds(double occupySomeoneElseFunds) {
		this.occupySomeoneElseFunds=occupySomeoneElseFunds;
	}
		
	public double getOccupySomeoneElseFunds() {
		return occupySomeoneElseFunds;
	}
	
	//应收账款占总资产的比率
	public void setAccountsReceivableRatio(double accountsReceivableRatio) {
		this.accountsReceivableRatio=accountsReceivableRatio;
	}
		
	public double getAccountsReceivableRatio() {
		return accountsReceivableRatio;
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
	
	//固产合计
	public void setTotalTFxedAssets(double totalTFxedAssets) {
		this.totalTFxedAssets=totalTFxedAssets;
	}
		
	public double getTotalTFxedAssets() {
		return totalTFxedAssets;
	}
	
	//固产合计占总资产的比率
	public void setFixedAssetRatio(double fixedAssetRatio) {
		this.fixedAssetRatio=fixedAssetRatio;
	}
		
	public double getFixedAssetRatio() {
		return fixedAssetRatio;
	}
	
	//交易性金融资产
	public void setTradingFinancialAssets(double tradingFinancialAssets) {
		this.tradingFinancialAssets=tradingFinancialAssets;
	}
		
	public double getTradingFinancialAssets() {
		return tradingFinancialAssets;
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
	
	//长期股权投资
	public void setLongTermEquityInvestment(double longTermEquityInvestment) {
		this.longTermEquityInvestment=longTermEquityInvestment;
	}
		
	public double getLongTermEquityInvestment() {
		return longTermEquityInvestment;
	}
	
	//投资类资产小计
	public void setSubtotalOfInvestmentAssets(double subtotalOfInvestmentAssets) {
		this.subtotalOfInvestmentAssets=subtotalOfInvestmentAssets;
	}
			
	public double getSubtotalOfInvestmentAssets() {
		return subtotalOfInvestmentAssets;
	}
	
	//投资类资产占总资产的比率
	public void setInvestmentAssetRatio(double investmentAssetRatio) {
		this.investmentAssetRatio=investmentAssetRatio;
	}
		
	public double getInvestmentAssetRatio() {
		return investmentAssetRatio;
	}
	
	//无形资产
	public void setIntangibleAssets(double intangibleAssets) {
		this.intangibleAssets=intangibleAssets;
	}
		
	public double getIntangibleAssets() {
		return intangibleAssets;
	}
	
	//商誉
	public void setGoodwill(double goodwill) {
		this.goodwill=goodwill;
	}
		
	public double getGoodwill() {
		return goodwill;
	}
	
	//无形资产占比
	public void setTheProportionOfIntangibleAssets(double theProportionOfIntangibleAssets) {
		this.theProportionOfIntangibleAssets=theProportionOfIntangibleAssets;
	}
		
	public double getTheProportionOfIntangibleAssets() {
		return theProportionOfIntangibleAssets;
	}
	
	//商誉占比
	public void setGoodwillProportion(double goodwillProportion) {
		this.goodwillProportion=goodwillProportion;
	}
		
	public double getGoodwillProportion() {
		return goodwillProportion;
	}
	
	//应付职工薪酬
	public void setPayrollPayable(double payrollPayable) {
		this.payrollPayable=payrollPayable;
	}
		
	public double getPayrollPayable() {
		return payrollPayable;
	}
	
	//支付给职工以及为职工支付的现金
	public void setCashPaidToAndOnBehalfOfEmployees(double cashPaidToAndOnBehalfOfEmployees) {
		this.cashPaidToAndOnBehalfOfEmployees=cashPaidToAndOnBehalfOfEmployees;
	}
		
	public double getCashPaidToAndOnBehalfOfEmployees() {
		return cashPaidToAndOnBehalfOfEmployees;
	}
	
	//当年职工总薪酬
	public void setTotalEmployeeCompensation(double totalEmployeeCompensation) {
		this.totalEmployeeCompensation=totalEmployeeCompensation;
	}
		
	public double getTotalEmployeeCompensation() {
		return totalEmployeeCompensation;
	}
	
	//人均年薪
	public void setPerCapitaAnnualSalary(double perCapitaAnnualSalary) {
		this.perCapitaAnnualSalary=perCapitaAnnualSalary;
	}
		
	public double getPerCapitaAnnualSalary() {
		return perCapitaAnnualSalary;
	}
	
	//人均月薪
	public void setPerCapitaMonthlySalary(double perCapitaMonthlySalary) {
		this.perCapitaMonthlySalary=perCapitaMonthlySalary;
	}
		
	public double getPerCapitaMonthlySalary() {
		return perCapitaMonthlySalary;
	}
	
	//营业收入
	public void setOperatingRevenue(double operatingRevenue) {
		this.operatingRevenue=operatingRevenue;
	}
		
	public double getOperatingRevenue() {
		return operatingRevenue;
	}
	
	//营业收入增长率
	public void setRevenueGrowthRate(double revenueGrowthRate) {
		this.revenueGrowthRate=revenueGrowthRate;
	}
		
	public double getRevenueGrowthRate() {
		return revenueGrowthRate;
	}
	
	//总资产周转率
	public void setTotalAssetTurnover(double totalAssetTurnover) {
		this.totalAssetTurnover=totalAssetTurnover;
	}
		
	public double getTotalAssetTurnover() {
		return totalAssetTurnover;
	}
	
	//销售商品、提供劳务收到的现金
	public void setCashReceivedFromSellingGoodsAndProvidingServices(double cashReceivedFromSellingGoodsAndProvidingServices) {
		this.cashReceivedFromSellingGoodsAndProvidingServices=cashReceivedFromSellingGoodsAndProvidingServices;
	}
		
	public double getCashReceivedFromSellingGoodsAndProvidingServices() {
		return cashReceivedFromSellingGoodsAndProvidingServices;
	}
	
	//销售商品、提供劳务收到的现金占营收的比率
	public void setProportionOfCashSellingGoodsProvidingServices(double proportionOfCashSellingGoodsProvidingServices) {
		this.proportionOfCashSellingGoodsProvidingServices=proportionOfCashSellingGoodsProvidingServices;
	}
		
	public double getProportionOfCashSellingGoodsProvidingServices() {
		return proportionOfCashSellingGoodsProvidingServices;
	}
	
	//其他应收款
	public void setOtherReceivables(double otherReceivables) {
		this.otherReceivables=otherReceivables;
	}
		
	public double getOtherReceivables() {
		return otherReceivables;
	}
	
	//存货
	public void setInventory(double inventory) {
		this.inventory=inventory;
	}
		
	public double getInventory() {
		return inventory;
	}
	
	//存货增长率
	public void setInventoryGrowthRate(double inventoryGrowthRate) {
		this.inventoryGrowthRate=inventoryGrowthRate;
	}
			
	public double getInventoryGrowthRate() {
		return inventoryGrowthRate;
	}
	
	//应收账款/营收
	public void setAccountsReceivablePercentageOfRevenue(double accountsReceivablePercentageOfRevenue) {
		this.accountsReceivablePercentageOfRevenue=accountsReceivablePercentageOfRevenue;
	}
		
	public double getAccountsReceivablePercentageOfRevenue() {
		return accountsReceivablePercentageOfRevenue;
	}
	
	//预付款项/营收
	public void setPrepaymentsPercentageOfRevenue(double prepaymentsPercentageOfRevenue) {
		this.prepaymentsPercentageOfRevenue=prepaymentsPercentageOfRevenue;
	}
		
	public double getPrepaymentsPercentageOfRevenue() {
		return prepaymentsPercentageOfRevenue;
	}
	
	//其他应收款/营收
	public void setOtherReceivablesPercentageOfRevenue(double otherReceivablesPercentageOfRevenue) {
		this.otherReceivablesPercentageOfRevenue=otherReceivablesPercentageOfRevenue;
	}
		
	public double getOtherReceivablesPercentageOfRevenue() {
		return otherReceivablesPercentageOfRevenue;
	}
	
	//存货/营收
	public void setInventoryToRevenueRatio(double inventoryToRevenueRatio) {
		this.inventoryToRevenueRatio=inventoryToRevenueRatio;
	}
		
	public double getInventoryToRevenueRatio() {
		return inventoryToRevenueRatio;
	}
	
	//营业成本
	public void setOperatingCosts(double operatingCosts) {
		this.operatingCosts=operatingCosts;
	}
		
	public double getOperatingCosts() {
		return operatingCosts;
	}
	
	//毛利率
	public void setGrossMargin(double grossMargin) {
		this.grossMargin=grossMargin;
	}
		
	public double getGrossMargin() {
		return grossMargin;
	}
	
	//销售费用
	public void setSellingExpenses(double sellingExpenses) {
		this.sellingExpenses=sellingExpenses;
	}
		
	public double getSellingExpenses() {
		return sellingExpenses;
	}
	
	//销售费用率
	public void setSalesExpenseRate(double salesExpenseRate) {
		this.salesExpenseRate=salesExpenseRate;
	}
		
	public double getSalesExpenseRate() {
		return salesExpenseRate;
	}
	
	//管理费用
	public void setOverhead(double overhead) {
		this.overhead=overhead;
	}
		
	public double getOverhead() {
		return overhead;
	}
	
	//管理费用率
	public void setManagementExpenseRate(double managementExpenseRate) {
		this.managementExpenseRate=managementExpenseRate;
	}
		
	public double getManagementExpenseRate() {
		return managementExpenseRate;
	}
	
	//研发费用
	public void setResearchAndDevelopment(double researchAndDevelopment) {
		this.researchAndDevelopment=researchAndDevelopment;
	}
		
	public double getResearchAndDevelopment() {
		return researchAndDevelopment;
	}
	
	//研发费用率
	public void setResearchAndDevelopmentRate(double researchAndDevelopmentRate) {
		this.researchAndDevelopmentRate=researchAndDevelopmentRate;
	}
		
	public double getResearchAndDevelopmentRate() {
		return researchAndDevelopmentRate;
	}
	
	//财务费用
	public void setFinancialExpenses(double financialExpenses) {
		this.financialExpenses=financialExpenses;
	}
		
	public double getFinancialExpenses() {
		return financialExpenses;
	}
	
	//费用率
	public void setExpense(double expense) {
		this.expense=expense;
	}
		
	public double getExpense() {
		return expense;
	}
	
	//费用率占毛利率的比率
	public void setExpenseRateToGrossProfitMargin(double expenseRateToGrossProfitMargin) {
		this.expenseRateToGrossProfitMargin=expenseRateToGrossProfitMargin;
	}
		
	public double getExpenseRateToGrossProfitMargin() {
		return expenseRateToGrossProfitMargin;
	}
	
	//税金及附加
	public void setTaxesAndSurcharges(double taxesAndSurcharges) {
		this.taxesAndSurcharges=taxesAndSurcharges;
	}
		
	public double getTaxesAndSurcharges() {
		return taxesAndSurcharges;
	}
	
	//四项费用
	public void setFourExpenses(double fourExpenses) {
		this.fourExpenses=fourExpenses;
	}
		
	public double getFourExpenses() {
		return fourExpenses;
	}
	
	//利润总额
	public void setTotalProfit(double totalProfit) {
		this.totalProfit=totalProfit;
	}
		
	public double getTotalProfit() {
		return totalProfit;
	}
	
	//主营利润
	public void setMainProfit(double mainProfit) {
		this.mainProfit=mainProfit;
	}
		
	public double getMainProfit() {
		return mainProfit;
	}
	
	//主营利润率
	public void setMainProfitMargin(double mainProfitMargin) {
		this.mainProfitMargin=mainProfitMargin;
	}
		
	public double getMainProfitMargin() {
		return mainProfitMargin;
	}
	
	//主营利润占利润总额的比例
	public void setMainOperatingProfitToTotalProfit(double mainOperatingProfitToTotalProfit) {
		this.mainOperatingProfitToTotalProfit=mainOperatingProfitToTotalProfit;
	}
		
	public double getMainOperatingProfitToTotalProfit() {
		return mainOperatingProfitToTotalProfit;
	}
	
	//营业利润
	public void setOperatingProfit(double operatingProfit) {
		this.operatingProfit=operatingProfit;
	}
		
	public double getOperatingProfit() {
		return operatingProfit;
	}
	
	//营业利润率
	public void setOperatingMargin(double operatingMargin) {
		this.operatingMargin=operatingMargin;
	}
			
	public double getOperatingMargin() {
		return operatingMargin;
	}
	
	//净利润
	public void setNetProfit(double netProfit) {
		this.netProfit=netProfit;
	}
		
	public double getNetProfit() {
		return netProfit;
	}
	
	//净利润增长率
	public void setNetProfitGrowthRate(double netProfitGrowthRate) {
		this.netProfitGrowthRate=netProfitGrowthRate;
	}
		
	public double getNetProfitGrowthRate() {
		return netProfitGrowthRate;
	}
	
	//净利润率
	public void setNetProfitMargin(double netProfitMargin) {
		this.netProfitMargin=netProfitMargin;
	}
			
	public double getNetProfitMargin() {
		return netProfitMargin;
	}
		
	//经营活动产生的现金流量净额
	public void setNetCashFlowFromOperating(double netCashFlowFromOperating) {
		this.netCashFlowFromOperating=netCashFlowFromOperating;
	}
		
	public double getNetCashFlowFromOperating() {
		return netCashFlowFromOperating;
	}
	
	//经营活动产生的现金流量净额同比增长率
	public void setGrowthRateOfNetCashFlowFromOperating(double growthRateOfNetCashFlowFromOperating) {
		this.growthRateOfNetCashFlowFromOperating=growthRateOfNetCashFlowFromOperating;
	}
			
	public double getGrowthRateOfNetCashFlowFromOperating() {
		return growthRateOfNetCashFlowFromOperating;
	}
	
	//净利润现金比率
	public void setNetProfitCashRatio(double netProfitCashRatio) {
		this.netProfitCashRatio=netProfitCashRatio;
	}
		
	public double getNetProfitCashRatio() {
		return netProfitCashRatio;
	}
	
	//归属于母公司所有者的净利润
	public void setNetIncomeAttributableToShareholders(double netIncomeAttributableToShareholders) {
		this.netIncomeAttributableToShareholders=netIncomeAttributableToShareholders;
	}
		
	public double getNetIncomeAttributableToShareholders() {
		return netIncomeAttributableToShareholders;
	}
	
	//归属于母公司所有者的净利润同比增长率
	public void setGrowthRateOfNetIncomeAttributableToShareholders(double growthRateOfNetIncomeAttributableToShareholders) {
		this.growthRateOfNetIncomeAttributableToShareholders=growthRateOfNetIncomeAttributableToShareholders;
	}
			
	public double getGrowthRateOfNetIncomeAttributableToShareholders() {
		return growthRateOfNetIncomeAttributableToShareholders;
	}
	
	//固定资产折旧
	public void setDepreciation(double depreciation) {
		this.depreciation=depreciation;
	}
		
	public double getDepreciation() {
		return depreciation;
	}
	
	//无形资产摊销
	public void setAmortizationOfIntangibleAssets(double amortizationOfIntangibleAssets) {
		this.amortizationOfIntangibleAssets=amortizationOfIntangibleAssets;
	}
		
	public double getAmortizationOfIntangibleAssets() {
		return amortizationOfIntangibleAssets;
	}
	
	//现金股利(分配股利、利润或偿付利息支付的现金)
	public void setCashPaidForDistributingDividendsProfitsPayingInterest(double cashPaidForDistributingDividendsProfitsPayingInterest) {
		this.cashPaidForDistributingDividendsProfitsPayingInterest=cashPaidForDistributingDividendsProfitsPayingInterest;
	}
			
	public double getCashPaidForDistributingDividendsProfitsPayingInterest() {
		return cashPaidForDistributingDividendsProfitsPayingInterest;
	}
	
	
	//经营活动产生的现金流量净额减去以上两项的余额
	public void setRemainingCash(double remainingCash) {
		this.remainingCash=remainingCash;
	}
		
	public double getRemainingCash() {
		return remainingCash;
	}
	
	//购建固定资产、无形资产和其他长期资产支付的现金
	public void setCashPaidForPurchaseConstructionFixedIntangibleLongTermAssets(double cashPaidForPurchaseConstructionFixedIntangibleLongTermAssets) {
		this.cashPaidForPurchaseConstructionFixedIntangibleLongTermAssets=cashPaidForPurchaseConstructionFixedIntangibleLongTermAssets;
	}
		
	public double getCashPaidForPurchaseConstructionFixedIntangibleLongTermAssets() {
		return cashPaidForPurchaseConstructionFixedIntangibleLongTermAssets;
	}
	
	
	//处置固定、无形和其他长期资产收回现金
	public void setNetCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssets(double netCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssets) {
		this.netCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssets=netCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssets;
	}
		
	public double getNetCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssetss() {
		return netCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssets;
	}
	
	
	//购建固产占经营活动产生的现金比
	public void setPurchaseConstructionFixedIntangibleLongTermAssetsProportion(double purchaseConstructionFixedIntangibleLongTermAssetsProportion) {
		this.purchaseConstructionFixedIntangibleLongTermAssetsProportion=purchaseConstructionFixedIntangibleLongTermAssetsProportion;
	}
		
	public double getPurchaseConstructionFixedIntangibleLongTermAssetsProportion() {
		return purchaseConstructionFixedIntangibleLongTermAssetsProportion;
	}
	
	
	//处置固定资产、无形资产和其他长期资产收回的现金净额占购建资产支付的现金比
	public void setNetCashReceivedFromDisposalProportionTopurchase(double netCashReceivedFromDisposalProportionTopurchase) {
		this.netCashReceivedFromDisposalProportionTopurchase=netCashReceivedFromDisposalProportionTopurchase;
	}
		
	public double getNetCashReceivedFromDisposalProportionTopurchase() {
		return netCashReceivedFromDisposalProportionTopurchase;
	}
	
	//现金分红金额
	public void setFinancialReportDividends(double financialReportDividends) {
		this.financialReportDividends=financialReportDividends;
	}
		
	public double getFinancialReportDividends() {
		return financialReportDividends;
	}
	
	//分红率（股利支付率）
	public void setDividendRate(double dividendRate) {
		this.dividendRate=dividendRate;
	}
		
	public double getDividendRate() {
		return dividendRate;
	}
	
	//投资活动产生的现金流量净额
	public void setNetCashFlowGeneratedFromInvestmentActivities(double netCashFlowGeneratedFromInvestmentActivities) {
		this.netCashFlowGeneratedFromInvestmentActivities=netCashFlowGeneratedFromInvestmentActivities;
	}
		
	public double getNetCashFlowGeneratedFromInvestmentActivities() {
		return netCashFlowGeneratedFromInvestmentActivities;
	}
	
	//筹资活动产生的现金流量净额
	public void setNetCashFlowGeneratedFromFinancingActivities(double netCashFlowGeneratedFromFinancingActivities) {
		this.netCashFlowGeneratedFromFinancingActivities=netCashFlowGeneratedFromFinancingActivities;
	}
		
	public double getNetCashFlowGeneratedFromFinancingActivities() {
		return netCashFlowGeneratedFromFinancingActivities;
	}
	
	//现金及现金等价物净增加额
	public void setNetIncreaseInCashAndCashEquivalents(double netIncreaseInCashAndCashEquivalents) {
		this.netIncreaseInCashAndCashEquivalents=netIncreaseInCashAndCashEquivalents;
	}
		
	public double getNetIncreaseInCashAndCashEquivalents() {
		return netIncreaseInCashAndCashEquivalents;
	}
	
	//加现金分红的现金及现金等价物净增加额
	public void setNetIncreaseInCashAndCashEquivalentsAddBonus(double netIncreaseInCashAndCashEquivalentsAddBonus) {
		this.netIncreaseInCashAndCashEquivalentsAddBonus=netIncreaseInCashAndCashEquivalentsAddBonus;
	}
		
	public double getNetIncreaseInCashAndCashEquivalentsAddBonus() {
		return netIncreaseInCashAndCashEquivalentsAddBonus;
	}
	
	//期末现金及现金等价物余额
	public void setClosingBalanceOfCashAndCashEquivalents(double closingBalanceOfCashAndCashEquivalents) {
		this.closingBalanceOfCashAndCashEquivalents=closingBalanceOfCashAndCashEquivalents;
	}
		
	public double getClosingBalanceOfCashAndCashEquivalents() {
		return closingBalanceOfCashAndCashEquivalents;
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
