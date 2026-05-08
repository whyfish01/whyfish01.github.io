package report.bean.entity;

public class IncomeStatement {
	String
	financialReportingNo,					//财报编号
	createDateTime,							//创建时间
	updateDateTime;							//更新时间
	
	
	double
	grossRevenue,							//营业总收入
	operatingRevenue,						//营业收入
	interestIncome,							//利息收入
	earnedPremium,							//已赚保费
	feeAndCommissionIncome,					//手续费及佣金收入
	totalOperatingCost,						//营业总成本
	operatingCosts,							//营业成本
	interestExpense,						//利息支出
	handlingFeesAndCommissionExpenses,		//手续费及佣金支出
	surrender,								//退保金
	netCompensationExpenses,				//赔付支出净额
	expendituresDividendPolicy,				//保单红利支出
	withdrawalOfReserveFundsForInsuranceLiabilityContracts,		//提取保险责任合同准备金净额
	reinsuranceExpenses,					//分保费用
	taxesAndSurcharges,						//税金及附加
	sellingExpenses,						//销售费用
	overhead,								//管理费用
	researchAndDevelopment,					//研发费用
	financialExpenses,						//财务费用
	financialExpensesInterestExpenses,		//财务费用：利息费用
	financialExpensesInterestIncome,		//财务费用：利息收入
	otherIncome,							//其他收益
	incomeFromInvestment,					//投资收益
	investmentIncomeFromAssociatesAndJointVentures,				//对联营企业和合营企业的投资收益
	exchangeGains,							//汇兑收益
	incomeFromDerecognitionOfFinancialAssetsMeasuredAtAmortizedCost,	//以摊余成本计量的金融资产终止确认收益
	netExposureHedgingIncome,				//净敞口套期收益
	incomeFromChangesInFairValue,			//公允价值变动收益
	creditImpairmentLoss,					//信用减值损失
	impairmentLoss,							//资产减值损失
	assetDisposalIncome,					//资产处置收益
	operatingProfit,						//营业利润
	nonOperatingIncome,						//营业外收入
	nonOperatingExpenses,					//营业外支出
	totalProfit,							//利润总额
	incomeTaxExpense,						//所得税费用
	netProfit,								//净利润
	netProfitFromContinuingOperations,		//持续经营净利润
	netProfitFromDiscontinuedOperations,	//终止经营净利润
	netIncomeAttributableToShareholders,	//归属于母公司股东的净利润
	minorityInterest,						//少数股东损益
	afterTaxNetAmountOfOtherComprehensiveIncomeAttributable,			//归属母公司所有者其他综合收益税后净额
	otherComprehensiveIncomeCannotBeReclassifiedIntoProfitOrLoss,		//不能重分类进损益的其他综合收益
	remeasureChangesInDefinedBenefitPlans,								//重新计量设定受益计划变动额
	otherIncomeCannotBeConvertedToProfitOrLossUnderTheEquityMethod,		//权益法下不能转损益的其他综合收益
	changesInFairValueOfOtherEquityInstrumentInvestments,				//其他权益工具投资公允价值变动
	changesInFairValueOfCorporateCreditRisk,							//企业自身信用风险公允价值变动
	others,									//其他
	otherIncomeReclassifiedToProfitOrLoss,	//将重分类进损益的其他综合收益
	otherIncomeCanBeConvertedToProfitOrLossUnderTheEquityMethod,		//权益法下可转损益的其他综合收益
	changesInFairValueOfOtherDebtInvestments,							//其他债权投资公允价值变动
	reclassificationOfFinancialAssetsInOtherComprehensiveIncome,		//金融资产重分类计入其他综合收益的金额
	provisionForOtherDebtInvestments,		//其他债权投资信用减值准备
	cashFlowHedgingReserves,				//现金流量套期储备
	currencyTranslationDifferences,			//外币财报折算差额
	others1,								//其他
	otherIncomeAfterTaxAttributableToMinorityShareholders,				//归属少数股东的其他综合收益税后净额
	totalComprehensiveIncome,				//综合收益总额
	totalComprehensiveIncomeToTheOwnersOfTheParentCompany,				//归属于母公司所有者的综合收益总额
	totalComprehensiveIncomeToMinorityShareholders,						//归属于少数股东的综合收益总额
	ROE,									//ROE
	basicEarningsPerShare,					//基本每股收益
	dilutedEarningsPerShare,				//稀释每股收益
	financialReportDividends;				//财报分红金额

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
	public void setUpdateDateTime(String updateDateTime) {
		this.updateDateTime=updateDateTime;
	}
	
	public String getUpdateDateTime() {
		return updateDateTime;
	}
	
	//营业总收入
	public void setGrossRevenue(double grossRevenue) {
		this.grossRevenue=grossRevenue;
	}
	
	public double getGrossRevenue() {
		return grossRevenue;
	}
	
	//营业收入
	public void setOperatingRevenue(double operatingRevenue) {
		this.operatingRevenue=operatingRevenue;
	}
	
	public double getOperatingRevenue() {
		return operatingRevenue;
	}
	
	//利息收入
	public void setInterestIncome(double interestIncome) {
		this.interestIncome=interestIncome;
	}
	
	public double getInterestIncome() {
		return interestIncome;
	}
	
	//已赚保费
	public void setEarnedPremium(double earnedPremium) {
		this.earnedPremium=earnedPremium;
	}
	
	public double getEarnedPremium() {
		return earnedPremium;
	}
	
	//手续费及佣金收入
	public void setFeeAndCommissionIncome(double feeAndCommissionIncome) {
		this.feeAndCommissionIncome=feeAndCommissionIncome;
	}
	
	public double getFeeAndCommissionIncome() {
		return feeAndCommissionIncome;
	}
	
	//营业总成本
	public void setTotalOperatingCost(double totalOperatingCost) {
		this.totalOperatingCost=totalOperatingCost;
	}
	
	public double getTotalOperatingCost() {
		return totalOperatingCost;
	}
	
	//营业成本
	public void setOperatingCosts(double operatingCosts) {
		this.operatingCosts=operatingCosts;
	}
	
	public double getOperatingCosts() {
		return operatingCosts;
	}
	
	//利息支出
	public void setInterestExpense(double interestExpense) {
		this.interestExpense=interestExpense;
	}
	
	public double getInterestExpense() {
		return interestExpense;
	}
	
	//手续费及佣金支出
	public void setHandlingFeesAndCommissionExpenses(double handlingFeesAndCommissionExpenses) {
		this.handlingFeesAndCommissionExpenses=handlingFeesAndCommissionExpenses;
	}
	
	public double getHandlingFeesAndCommissionExpenses() {
		return handlingFeesAndCommissionExpenses;
	}
	
	//退保金
	public void setSurrender(double surrender) {
		this.surrender=surrender;
	}
	
	public double getSurrender() {
		return surrender;
	}
	
	//赔付支出净额
	public void setNetCompensationExpenses(double netCompensationExpenses) {
		this.netCompensationExpenses=netCompensationExpenses;
	}
	
	public double getNetCompensationExpenses() {
		return netCompensationExpenses;
	}
	
	//保单红利支出
	public void setExpendituresDividendPolicy(double expendituresDividendPolicy) {
		this.expendituresDividendPolicy=expendituresDividendPolicy;
	}
	
	public double getExpendituresDividendPolicy() {
		return expendituresDividendPolicy;
	}
	
	//提取保险责任合同准备金净额
	public void setWithdrawalOfReserveFundsForInsuranceLiabilityContracts(double withdrawalOfReserveFundsForInsuranceLiabilityContracts) {
		this.withdrawalOfReserveFundsForInsuranceLiabilityContracts=withdrawalOfReserveFundsForInsuranceLiabilityContracts;
	}
	
	public double getWithdrawalOfReserveFundsForInsuranceLiabilityContracts() {
		return withdrawalOfReserveFundsForInsuranceLiabilityContracts;
	}
	
	//分保费用
	public void setReinsuranceExpenses(double reinsuranceExpenses) {
		this.reinsuranceExpenses=reinsuranceExpenses;
	}
	
	public double getReinsuranceExpenses() {
		return reinsuranceExpenses;
	}
	
	//税金及附加
	public void setTaxesAndSurcharges(double taxesAndSurcharges) {
		this.taxesAndSurcharges=taxesAndSurcharges;
	}
	
	public double getTaxesAndSurcharges() {
		return taxesAndSurcharges;
	}
	
	//销售费用
	public void setSellingExpenses(double sellingExpenses) {
		this.sellingExpenses=sellingExpenses;
	}
	
	public double getSellingExpenses() {
		return sellingExpenses;
	}
	
	//管理费用
	public void setOverhead(double overhead) {
		this.overhead=overhead;
	}
	
	public double getOverhead() {
		return overhead;
	}
	
	//研发费用
	public void setResearchAndDevelopment(double researchAndDevelopment) {
		this.researchAndDevelopment=researchAndDevelopment;
	}
	
	public double getResearchAndDevelopment() {
		return researchAndDevelopment;
	}
	
	//财务费用
	public void setFinancialExpenses(double financialExpenses) {
		this.financialExpenses=financialExpenses;
	}
	
	public double getFinancialExpenses() {
		return financialExpenses;
	}
	
	//财务费用：利息费用
	public void setFinancialExpensesInterestExpenses(double financialExpensesInterestExpenses) {
		this.financialExpensesInterestExpenses=financialExpensesInterestExpenses;
	}
	
	public double getFinancialExpensesInterestExpenses() {
		return financialExpensesInterestExpenses;
	}
	
	//财务费用：利息收入
	public void setFinancialExpensesInterestIncome(double financialExpensesInterestIncome) {
		this.financialExpensesInterestIncome=financialExpensesInterestIncome;
	}
	
	public double getFinancialExpensesInterestIncome() {
		return financialExpensesInterestIncome;
	}
	
	//其他收益
	public void setOtherIncome(double otherIncome) {
		this.otherIncome=otherIncome;
	}
	
	public double getOtherIncome() {
		return otherIncome;
	}
	
	//投资收益
	public void setIncomeFromInvestment(double incomeFromInvestment) {
		this.incomeFromInvestment=incomeFromInvestment;
	}
	
	public double getIncomeFromInvestment() {
		return incomeFromInvestment;
	}
	
	//对联营企业和合营企业的投资收益
	public void setInvestmentIncomeFromAssociatesAndJointVentures(double investmentIncomeFromAssociatesAndJointVentures) {
		this.investmentIncomeFromAssociatesAndJointVentures=investmentIncomeFromAssociatesAndJointVentures;
	}
	
	public double getInvestmentIncomeFromAssociatesAndJointVentures() {
		return investmentIncomeFromAssociatesAndJointVentures;
	}
	
	//汇兑收益
	public void setExchangeGains(double exchangeGains) {
		this.exchangeGains=exchangeGains;
	}
	
	public double getExchangeGains() {
		return exchangeGains;
	}
	
	//以摊余成本计量的金融资产终止确认收益
	public void setIncomeFromDerecognitionOfFinancialAssetsMeasuredAtAmortizedCost(double incomeFromDerecognitionOfFinancialAssetsMeasuredAtAmortizedCost) {
		this.incomeFromDerecognitionOfFinancialAssetsMeasuredAtAmortizedCost=incomeFromDerecognitionOfFinancialAssetsMeasuredAtAmortizedCost;
	}
	
	public double getIncomeFromDerecognitionOfFinancialAssetsMeasuredAtAmortizedCost() {
		return incomeFromDerecognitionOfFinancialAssetsMeasuredAtAmortizedCost;
	}
	
	//净敞口套期收益
	public void setNetExposureHedgingIncome(double netExposureHedgingIncome) {
		this.netExposureHedgingIncome=netExposureHedgingIncome;
	}
	
	public double getNetExposureHedgingIncome() {
		return netExposureHedgingIncome;
	}
	
	//公允价值变动收益
	public void setIncomeFromChangesInFairValue(double incomeFromChangesInFairValue) {
		this.incomeFromChangesInFairValue=incomeFromChangesInFairValue;
	}
	
	public double getIncomeFromChangesInFairValue() {
		return incomeFromChangesInFairValue;
	}
	
	//信用减值损失
	public void setCreditImpairmentLoss(double creditImpairmentLoss) {
		this.creditImpairmentLoss=creditImpairmentLoss;
	}
	
	public double getCreditImpairmentLoss() {
		return creditImpairmentLoss;
	}
	
	//资产减值损失
	public void setImpairmentLoss(double impairmentLoss) {
		this.impairmentLoss=impairmentLoss;
	}
	
	public double getImpairmentLoss() {
		return impairmentLoss;
	}
	
	//资产处置收益
	public void setAssetDisposalIncome(double assetDisposalIncome) {
		this.assetDisposalIncome=assetDisposalIncome;
	}
	
	public double getAssetDisposalIncome() {
		return assetDisposalIncome;
	}
	
	//营业利润
	public void setOperatingProfit(double operatingProfit) {
		this.operatingProfit=operatingProfit;
	}
	
	public double getOperatingProfit() {
		return operatingProfit;
	}
	
	//营业外收入
	public void setNonOperatingIncome(double nonOperatingIncome) {
		this.nonOperatingIncome=nonOperatingIncome;
	}
	
	public double getNonOperatingIncome() {
		return nonOperatingIncome;
	}
	
	//营业外支出
	public void setNonOperatingExpenses(double nonOperatingExpenses) {
		this.nonOperatingExpenses=nonOperatingExpenses;
	}
	
	public double getNonOperatingExpenses() {
		return nonOperatingExpenses;
	}
	
	//利润总额
	public void setTotalProfit(double totalProfit) {
		this.totalProfit=totalProfit;
	}
	
	public double getTotalProfit() {
		return totalProfit;
	}
	
	//所得税费用
	public void setIncomeTaxExpense(double incomeTaxExpense) {
		this.incomeTaxExpense=incomeTaxExpense;
	}
	
	public double getIncomeTaxExpense() {
		return incomeTaxExpense;
	}
	
	//净利润
	public void setNetProfit(double netProfit) {
		this.netProfit=netProfit;
	}
	
	public double getNetProfit() {
		return netProfit;
	}
	
	//持续经营净利润
	public void setNetProfitFromContinuingOperations(double netProfitFromContinuingOperations) {
		this.netProfitFromContinuingOperations=netProfitFromContinuingOperations;
	}
	
	public double getNetProfitFromContinuingOperations() {
		return netProfitFromContinuingOperations;
	}
	
	//终止经营净利润
	public void setNetProfitFromDiscontinuedOperations(double netProfitFromDiscontinuedOperations) {
		this.netProfitFromDiscontinuedOperations=netProfitFromDiscontinuedOperations;
	}
	
	public double getNetProfitFromDiscontinuedOperations() {
		return netProfitFromDiscontinuedOperations;
	}
	
	//归属于母公司股东的净利润
	public void setNetIncomeAttributableToShareholders(double netIncomeAttributableToShareholders) {
		this.netIncomeAttributableToShareholders=netIncomeAttributableToShareholders;
	}
	
	public double getNetIncomeAttributableToShareholders() {
		return netIncomeAttributableToShareholders;
	}
	
	//少数股东损益
	public void setMinorityInterest(double minorityInterest) {
		this.minorityInterest=minorityInterest;
	}
	
	public double getMinorityInterest() {
		return minorityInterest;
	}
	
	//归属母公司所有者其他综合收益税后净额
	public void setAfterTaxNetAmountOfOtherComprehensiveIncomeAttributable(double afterTaxNetAmountOfOtherComprehensiveIncomeAttributable) {
		this.afterTaxNetAmountOfOtherComprehensiveIncomeAttributable=afterTaxNetAmountOfOtherComprehensiveIncomeAttributable;
	}
	
	public double getAfterTaxNetAmountOfOtherComprehensiveIncomeAttributable() {
		return afterTaxNetAmountOfOtherComprehensiveIncomeAttributable;
	}
	
	//不能重分类进损益的其他综合收益
	public void setOtherComprehensiveIncomeCannotBeReclassifiedIntoProfitOrLoss(double otherComprehensiveIncomeCannotBeReclassifiedIntoProfitOrLoss) {
		this.otherComprehensiveIncomeCannotBeReclassifiedIntoProfitOrLoss=otherComprehensiveIncomeCannotBeReclassifiedIntoProfitOrLoss;
	}
	
	public double getOtherComprehensiveIncomeCannotBeReclassifiedIntoProfitOrLoss() {
		return otherComprehensiveIncomeCannotBeReclassifiedIntoProfitOrLoss;
	}
	
	//重新计量设定受益计划变动额
	public void setRemeasureChangesInDefinedBenefitPlans(double remeasureChangesInDefinedBenefitPlans) {
		this.remeasureChangesInDefinedBenefitPlans=remeasureChangesInDefinedBenefitPlans;
	}
	
	public double getRemeasureChangesInDefinedBenefitPlans() {
		return remeasureChangesInDefinedBenefitPlans;
	}
	
	//权益法下不能转损益的其他综合收益
	public void setOtherIncomeCannotBeConvertedToProfitOrLossUnderTheEquityMethod(double otherIncomeCannotBeConvertedToProfitOrLossUnderTheEquityMethod) {
		this.otherIncomeCannotBeConvertedToProfitOrLossUnderTheEquityMethod=otherIncomeCannotBeConvertedToProfitOrLossUnderTheEquityMethod;
	}
	
	public double getOtherIncomeCannotBeConvertedToProfitOrLossUnderTheEquityMethod() {
		return otherIncomeCannotBeConvertedToProfitOrLossUnderTheEquityMethod;
	}
	
	//其他权益工具投资公允价值变动
	public void setChangesInFairValueOfOtherEquityInstrumentInvestments(double changesInFairValueOfOtherEquityInstrumentInvestments) {
		this.changesInFairValueOfOtherEquityInstrumentInvestments=changesInFairValueOfOtherEquityInstrumentInvestments;
	}
	
	public double getChangesInFairValueOfOtherEquityInstrumentInvestments() {
		return changesInFairValueOfOtherEquityInstrumentInvestments;
	}
	
	//企业自身信用风险公允价值变动
	public void setChangesInFairValueOfCorporateCreditRisk(double changesInFairValueOfCorporateCreditRisk) {
		this.changesInFairValueOfCorporateCreditRisk=changesInFairValueOfCorporateCreditRisk;
	}
	
	public double getChangesInFairValueOfCorporateCreditRisk() {
		return changesInFairValueOfCorporateCreditRisk;
	}
	
	//其他
	public void setOthers(double others) {
		this.others=others;
	}
	
	public double getOthers() {
		return others;
	}
	
	//将重分类进损益的其他综合收益
	public void setOtherIncomeReclassifiedToProfitOrLoss(double otherIncomeReclassifiedToProfitOrLoss) {
		this.otherIncomeReclassifiedToProfitOrLoss=otherIncomeReclassifiedToProfitOrLoss;
	}
	
	public double getOtherIncomeReclassifiedToProfitOrLoss() {
		return otherIncomeReclassifiedToProfitOrLoss;
	}
	
	//权益法下可转损益的其他综合收益
	public void setOtherIncomeCanBeConvertedToProfitOrLossUnderTheEquityMethod(double otherIncomeCanBeConvertedToProfitOrLossUnderTheEquityMethod) {
		this.otherIncomeCanBeConvertedToProfitOrLossUnderTheEquityMethod=otherIncomeCanBeConvertedToProfitOrLossUnderTheEquityMethod;
	}
	
	public double getOtherIncomeCanBeConvertedToProfitOrLossUnderTheEquityMethod() {
		return otherIncomeCanBeConvertedToProfitOrLossUnderTheEquityMethod;
	}
	
	//其他债权投资公允价值变动
	public void setChangesInFairValueOfOtherDebtInvestments(double changesInFairValueOfOtherDebtInvestments) {
		this.changesInFairValueOfOtherDebtInvestments=changesInFairValueOfOtherDebtInvestments;
	}
	
	public double getChangesInFairValueOfOtherDebtInvestments() {
		return changesInFairValueOfOtherDebtInvestments;
	}
	
	//金融资产重分类计入其他综合收益的金额
	public void setReclassificationOfFinancialAssetsInOtherComprehensiveIncome(double reclassificationOfFinancialAssetsInOtherComprehensiveIncome) {
		this.reclassificationOfFinancialAssetsInOtherComprehensiveIncome=reclassificationOfFinancialAssetsInOtherComprehensiveIncome;
	}
	
	public double getReclassificationOfFinancialAssetsInOtherComprehensiveIncome() {
		return reclassificationOfFinancialAssetsInOtherComprehensiveIncome;
	}
	
	//其他债权投资信用减值准备
	public void setProvisionForOtherDebtInvestments(double provisionForOtherDebtInvestments) {
		this.provisionForOtherDebtInvestments=provisionForOtherDebtInvestments;
	}
	
	public double getProvisionForOtherDebtInvestments() {
		return provisionForOtherDebtInvestments;
	}
	
	//现金流量套期储备
	public void setCashFlowHedgingReserves(double cashFlowHedgingReserves) {
		this.cashFlowHedgingReserves=cashFlowHedgingReserves;
	}
	
	public double getCashFlowHedgingReserves() {
		return cashFlowHedgingReserves;
	}
	
	//外币财报折算差额
	public void setCurrencyTranslationDifferences(double currencyTranslationDifferences) {
		this.currencyTranslationDifferences=currencyTranslationDifferences;
	}
	
	public double getCurrencyTranslationDifferences() {
		return currencyTranslationDifferences;
	}
	
	//其他
	public void setOthers1(double others1) {
		this.others1=others1;
	}
	
	public double getOthers1() {
		return others1;
	}
	
	//归属少数股东的其他综合收益税后净额
	public void setOtherIncomeAfterTaxAttributableToMinorityShareholders(double otherIncomeAfterTaxAttributableToMinorityShareholders) {
		this.otherIncomeAfterTaxAttributableToMinorityShareholders=otherIncomeAfterTaxAttributableToMinorityShareholders;
	}
	
	public double getOtherIncomeAfterTaxAttributableToMinorityShareholders() {
		return otherIncomeAfterTaxAttributableToMinorityShareholders;
	}
	
	//综合收益总额
	public void setTotalComprehensiveIncome(double totalComprehensiveIncome) {
		this.totalComprehensiveIncome=totalComprehensiveIncome;
	}
	
	public double getTotalComprehensiveIncome() {
		return totalComprehensiveIncome;
	}
	
	//归属于母公司所有者的综合收益总额
	public void setTotalComprehensiveIncomeToTheOwnersOfTheParentCompany(double totalComprehensiveIncomeToTheOwnersOfTheParentCompany) {
		this.totalComprehensiveIncomeToTheOwnersOfTheParentCompany=totalComprehensiveIncomeToTheOwnersOfTheParentCompany;
	}
	
	public double getTotalComprehensiveIncomeToTheOwnersOfTheParentCompany() {
		return totalComprehensiveIncomeToTheOwnersOfTheParentCompany;
	}
	
	//归属于少数股东的综合收益总额
	public void setTotalComprehensiveIncomeToMinorityShareholders(double totalComprehensiveIncomeToMinorityShareholders) {
		this.totalComprehensiveIncomeToMinorityShareholders=totalComprehensiveIncomeToMinorityShareholders;
	}
	
	public double getTotalComprehensiveIncomeToMinorityShareholders() {
		return totalComprehensiveIncomeToMinorityShareholders;
	}
	
	//基本每股收益
	public void setBasicEarningsPerShare(double basicEarningsPerShare) {
		this.basicEarningsPerShare=basicEarningsPerShare;
	}
	
	public double getBasicEarningsPerShare() {
		return basicEarningsPerShare;
	}
	
	//稀释每股收益
	public void setDilutedEarningsPerShare(double dilutedEarningsPerShare) {
		this.dilutedEarningsPerShare=dilutedEarningsPerShare;
	}
	
	public double getDilutedEarningsPerShare() {
		return dilutedEarningsPerShare;
	}
	
	//ROE
	public void setROE(double ROE) {
		this.ROE=ROE;
	}
	
	public double getROE() {
		return ROE;
	}
	
	//财报分红金额
	public void setFinancialReportDividends(double financialReportDividends) {
		this.financialReportDividends=financialReportDividends;
	}
	
	public double getFinancialReportDividends() {
		return financialReportDividends;
	}
}
