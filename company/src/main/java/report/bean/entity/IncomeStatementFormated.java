package report.bean.entity;

public class IncomeStatementFormated {
	String
	financialReportingNo,					//财报编号
	createDateTime,							//创建时间
	updateDateTime,							//更新时间
	ROEFormated,
	grossRevenueFormated,							//营业总收入
	operatingRevenueFormated,						//营业收入
	interestIncomeFormated,							//利息收入
	earnedPremiumFormated,							//已赚保费
	feeAndCommissionIncomeFormated,					//手续费及佣金收入
	totalOperatingCostFormated,						//营业总成本
	operatingCostsFormated,							//营业成本
	interestExpenseFormated,						//利息支出
	handlingFeesAndCommissionExpensesFormated,		//手续费及佣金支出
	surrenderFormated,								//退保金
	netCompensationExpensesFormated,				//赔付支出净额
	expendituresDividendPolicyFormated,				//保单红利支出
	withdrawalOfReserveFundsForInsuranceLiabilityContractsFormated,		//提取保险责任合同准备金净额
	reinsuranceExpensesFormated,					//分保费用
	taxesAndSurchargesFormated,						//税金及附加
	sellingExpensesFormated,						//销售费用
	overheadFormated,								//管理费用
	researchAndDevelopmentFormated,					//研发费用
	financialExpensesFormated,						//财务费用
	financialExpensesInterestExpensesFormated,		//财务费用：利息费用
	financialExpensesInterestIncomeFormated,		//财务费用：利息收入
	otherIncomeFormated,							//其他收益
	incomeFromInvestmentFormated,					//投资收益
	investmentIncomeFromAssociatesAndJointVenturesFormated,				//对联营企业和合营企业的投资收益
	exchangeGainsFormated,							//汇兑收益
	incomeFromDerecognitionOfFinancialAssetsMeasuredAtAmortizedCostFormated,	//以摊余成本计量的金融资产终止确认收益
	netExposureHedgingIncomeFormated,				//净敞口套期收益
	incomeFromChangesInFairValueFormated,			//公允价值变动收益
	creditImpairmentLossFormated,					//信用减值损失
	impairmentLossFormated,							//资产减值损失
	assetDisposalIncomeFormated,					//资产处置收益
	operatingProfitFormated,						//营业利润
	nonOperatingIncomeFormated,						//营业外收入
	nonOperatingExpensesFormated,					//营业外支出
	totalProfitFormated,							//利润总额
	incomeTaxExpenseFormated,						//所得税费用
	netProfitFormated,								//净利润
	netProfitFromContinuingOperationsFormated,		//持续经营净利润
	netProfitFromDiscontinuedOperationsFormated,	//终止经营净利润
	netIncomeAttributableToShareholdersFormated,	//归属于母公司股东的净利润
	minorityInterestFormated,						//少数股东损益
	afterTaxNetAmountOfOtherComprehensiveIncomeAttributableFormated,			//归属母公司所有者其他综合收益税后净额
	otherComprehensiveIncomeCannotBeReclassifiedIntoProfitOrLossFormated,		//不能重分类进损益的其他综合收益
	remeasureChangesInDefinedBenefitPlansFormated,								//重新计量设定受益计划变动额
	otherIncomeCannotBeConvertedToProfitOrLossUnderTheEquityMethodFormated,		//权益法下不能转损益的其他综合收益
	changesInFairValueOfOtherEquityInstrumentInvestmentsFormated,				//其他权益工具投资公允价值变动
	changesInFairValueOfCorporateCreditRiskFormated,							//企业自身信用风险公允价值变动
	othersFormated,									//其他
	otherIncomeReclassifiedToProfitOrLossFormated,	//将重分类进损益的其他综合收益
	otherIncomeCanBeConvertedToProfitOrLossUnderTheEquityMethodFormated,		//权益法下可转损益的其他综合收益
	changesInFairValueOfOtherDebtInvestmentsFormated,							//其他债权投资公允价值变动
	reclassificationOfFinancialAssetsInOtherComprehensiveIncomeFormated,		//金融资产重分类计入其他综合收益的金额
	provisionForOtherDebtInvestmentsFormated,		//其他债权投资信用减值准备
	cashFlowHedgingReservesFormated,				//现金流量套期储备
	currencyTranslationDifferencesFormated,			//外币财报折算差额
	others1Formated,								//其他
	otherIncomeAfterTaxAttributableToMinorityShareholdersFormated,				//归属少数股东的其他综合收益税后净额
	totalComprehensiveIncomeFormated,				//综合收益总额
	totalComprehensiveIncomeToTheOwnersOfTheParentCompanyFormated,				//归属于母公司所有者的综合收益总额
	totalComprehensiveIncomeToMinorityShareholdersFormated,						//归属于少数股东的综合收益总额
	basicEarningsPerShareFormated,					//基本每股收益
	dilutedEarningsPerShareFormated,				//稀释每股收益
	financialReportDividendsFormated;				//财报分红金额

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
	public void setGrossRevenueFormated(String grossRevenueFormated) {
		this.grossRevenueFormated=grossRevenueFormated;
	}
	
	public String getGrossRevenueFormated() {
		return grossRevenueFormated;
	}
	
	//营业收入
	public void setOperatingRevenueFormated(String operatingRevenueFormated) {
		this.operatingRevenueFormated=operatingRevenueFormated;
	}
	
	public String getOperatingRevenueFormated() {
		return operatingRevenueFormated;
	}
	
	//利息收入
	public void setInterestIncomeFormated(String interestIncomeFormated) {
		this.interestIncomeFormated=interestIncomeFormated;
	}
	
	public String getInterestIncomeFormated() {
		return interestIncomeFormated;
	}
	
	//已赚保费
	public void setEarnedPremiumFormated(String earnedPremiumFormated) {
		this.earnedPremiumFormated=earnedPremiumFormated;
	}
	
	public String getEarnedPremiumFormated() {
		return earnedPremiumFormated;
	}
	
	//手续费及佣金收入
	public void setFeeAndCommissionIncomeFormated(String feeAndCommissionIncomeFormated) {
		this.feeAndCommissionIncomeFormated=feeAndCommissionIncomeFormated;
	}
	
	public String getFeeAndCommissionIncomeFormated() {
		return feeAndCommissionIncomeFormated;
	}
	
	//营业总成本
	public void setTotalOperatingCostFormated(String totalOperatingCostFormated) {
		this.totalOperatingCostFormated=totalOperatingCostFormated;
	}
	
	public String getTotalOperatingCostFormated() {
		return totalOperatingCostFormated;
	}
	
	//营业成本
	public void setOperatingCostsFormated(String operatingCostsFormated) {
		this.operatingCostsFormated=operatingCostsFormated;
	}
	
	public String getOperatingCostsFormated() {
		return operatingCostsFormated;
	}
	
	//利息支出
	public void setInterestExpenseFormated(String interestExpenseFormated) {
		this.interestExpenseFormated=interestExpenseFormated;
	}
	
	public String getInterestExpenseFormated() {
		return interestExpenseFormated;
	}
	
	//手续费及佣金支出
	public void setHandlingFeesAndCommissionExpensesFormated(String handlingFeesAndCommissionExpensesFormated) {
		this.handlingFeesAndCommissionExpensesFormated=handlingFeesAndCommissionExpensesFormated;
	}
	
	public String getHandlingFeesAndCommissionExpensesFormated() {
		return handlingFeesAndCommissionExpensesFormated;
	}
	
	//退保金
	public void setSurrenderFormated(String surrenderFormated) {
		this.surrenderFormated=surrenderFormated;
	}
	
	public String getSurrenderFormated() {
		return surrenderFormated;
	}
	
	//赔付支出净额
	public void setNetCompensationExpensesFormated(String netCompensationExpensesFormated) {
		this.netCompensationExpensesFormated=netCompensationExpensesFormated;
	}
	
	public String getNetCompensationExpensesFormated() {
		return netCompensationExpensesFormated;
	}
	
	//保单红利支出
	public void setExpendituresDividendPolicyFormated(String expendituresDividendPolicyFormated) {
		this.expendituresDividendPolicyFormated=expendituresDividendPolicyFormated;
	}
	
	public String getExpendituresDividendPolicyFormated() {
		return expendituresDividendPolicyFormated;
	}
	
	//提取保险责任合同准备金净额
	public void setWithdrawalOfReserveFundsForInsuranceLiabilityContractsFormated(String withdrawalOfReserveFundsForInsuranceLiabilityContractsFormated) {
		this.withdrawalOfReserveFundsForInsuranceLiabilityContractsFormated=withdrawalOfReserveFundsForInsuranceLiabilityContractsFormated;
	}
	
	public String getWithdrawalOfReserveFundsForInsuranceLiabilityContractsFormated() {
		return withdrawalOfReserveFundsForInsuranceLiabilityContractsFormated;
	}
	
	//分保费用
	public void setReinsuranceExpensesFormated(String reinsuranceExpensesFormated) {
		this.reinsuranceExpensesFormated=reinsuranceExpensesFormated;
	}
	
	public String getReinsuranceExpensesFormated() {
		return reinsuranceExpensesFormated;
	}
	
	//税金及附加
	public void setTaxesAndSurchargesFormated(String taxesAndSurchargesFormated) {
		this.taxesAndSurchargesFormated=taxesAndSurchargesFormated;
	}
	
	public String getTaxesAndSurchargesFormated() {
		return taxesAndSurchargesFormated;
	}
	
	//销售费用
	public void setSellingExpensesFormated(String sellingExpensesFormated) {
		this.sellingExpensesFormated=sellingExpensesFormated;
	}
	
	public String getSellingExpensesFormated() {
		return sellingExpensesFormated;
	}
	
	//管理费用
	public void setOverheadFormated(String overheadFormated) {
		this.overheadFormated=overheadFormated;
	}
	
	public String getOverheadFormated() {
		return overheadFormated;
	}
	
	//研发费用
	public void setResearchAndDevelopmentFormated(String researchAndDevelopmentFormated) {
		this.researchAndDevelopmentFormated=researchAndDevelopmentFormated;
	}
	
	public String getResearchAndDevelopmentFormated() {
		return researchAndDevelopmentFormated;
	}
	
	//财务费用
	public void setFinancialExpensesFormated(String financialExpensesFormated) {
		this.financialExpensesFormated=financialExpensesFormated;
	}
	
	public String getFinancialExpensesFormated() {
		return financialExpensesFormated;
	}
	
	//财务费用：利息费用
	public void setFinancialExpensesInterestExpensesFormated(String financialExpensesInterestExpensesFormated) {
		this.financialExpensesInterestExpensesFormated=financialExpensesInterestExpensesFormated;
	}
	
	public String getFinancialExpensesInterestExpensesFormated() {
		return financialExpensesInterestExpensesFormated;
	}
	
	//财务费用：利息收入
	public void setFinancialExpensesInterestIncomeFormated(String financialExpensesInterestIncomeFormated) {
		this.financialExpensesInterestIncomeFormated=financialExpensesInterestIncomeFormated;
	}
	
	public String getFinancialExpensesInterestIncomeFormated() {
		return financialExpensesInterestIncomeFormated;
	}
	
	//其他收益
	public void setOtherIncomeFormated(String otherIncomeFormated) {
		this.otherIncomeFormated=otherIncomeFormated;
	}
	
	public String getOtherIncomeFormated() {
		return otherIncomeFormated;
	}
	
	//投资收益
	public void setIncomeFromInvestmentFormated(String incomeFromInvestmentFormated) {
		this.incomeFromInvestmentFormated=incomeFromInvestmentFormated;
	}
	
	public String getIncomeFromInvestmentFormated() {
		return incomeFromInvestmentFormated;
	}
	
	//对联营企业和合营企业的投资收益
	public void setInvestmentIncomeFromAssociatesAndJointVenturesFormated(String investmentIncomeFromAssociatesAndJointVenturesFormated) {
		this.investmentIncomeFromAssociatesAndJointVenturesFormated=investmentIncomeFromAssociatesAndJointVenturesFormated;
	}
	
	public String getInvestmentIncomeFromAssociatesAndJointVenturesFormated() {
		return investmentIncomeFromAssociatesAndJointVenturesFormated;
	}
	
	//汇兑收益
	public void setExchangeGainsFormated(String exchangeGainsFormated) {
		this.exchangeGainsFormated=exchangeGainsFormated;
	}
	
	public String getExchangeGainsFormated() {
		return exchangeGainsFormated;
	}
	
	//以摊余成本计量的金融资产终止确认收益
	public void setIncomeFromDerecognitionOfFinancialAssetsMeasuredAtAmortizedCostFormated(String incomeFromDerecognitionOfFinancialAssetsMeasuredAtAmortizedCostFormated) {
		this.incomeFromDerecognitionOfFinancialAssetsMeasuredAtAmortizedCostFormated=incomeFromDerecognitionOfFinancialAssetsMeasuredAtAmortizedCostFormated;
	}
	
	public String getIncomeFromDerecognitionOfFinancialAssetsMeasuredAtAmortizedCostFormated() {
		return incomeFromDerecognitionOfFinancialAssetsMeasuredAtAmortizedCostFormated;
	}
	
	//净敞口套期收益
	public void setNetExposureHedgingIncomeFormated(String netExposureHedgingIncomeFormated) {
		this.netExposureHedgingIncomeFormated=netExposureHedgingIncomeFormated;
	}
	
	public String getNetExposureHedgingIncomeFormated() {
		return netExposureHedgingIncomeFormated;
	}
	
	//公允价值变动收益
	public void setIncomeFromChangesInFairValueFormated(String incomeFromChangesInFairValueFormated) {
		this.incomeFromChangesInFairValueFormated=incomeFromChangesInFairValueFormated;
	}
	
	public String getIncomeFromChangesInFairValueFormated() {
		return incomeFromChangesInFairValueFormated;
	}
	
	//信用减值损失
	public void setCreditImpairmentLossFormated(String creditImpairmentLossFormated) {
		this.creditImpairmentLossFormated=creditImpairmentLossFormated;
	}
	
	public String getCreditImpairmentLossFormated() {
		return creditImpairmentLossFormated;
	}
	
	//资产减值损失
	public void setImpairmentLossFormated(String impairmentLossFormated) {
		this.impairmentLossFormated=impairmentLossFormated;
	}
	
	public String getImpairmentLossFormated() {
		return impairmentLossFormated;
	}
	
	//资产处置收益
	public void setAssetDisposalIncomeFormated(String assetDisposalIncomeFormated) {
		this.assetDisposalIncomeFormated=assetDisposalIncomeFormated;
	}
	
	public String getAssetDisposalIncomeFormated() {
		return assetDisposalIncomeFormated;
	}
	
	//营业利润
	public void setOperatingProfitFormated(String operatingProfitFormated) {
		this.operatingProfitFormated=operatingProfitFormated;
	}
	
	public String getOperatingProfitFormated() {
		return operatingProfitFormated;
	}
	
	//营业外收入
	public void setNonOperatingIncomeFormated(String nonOperatingIncomeFormated) {
		this.nonOperatingIncomeFormated=nonOperatingIncomeFormated;
	}
	
	public String getNonOperatingIncomeFormated() {
		return nonOperatingIncomeFormated;
	}
	
	//营业外支出
	public void setNonOperatingExpensesFormated(String nonOperatingExpensesFormated) {
		this.nonOperatingExpensesFormated=nonOperatingExpensesFormated;
	}
	
	public String getNonOperatingExpensesFormated() {
		return nonOperatingExpensesFormated;
	}
	
	//利润总额
	public void setTotalProfitFormated(String totalProfitFormated) {
		this.totalProfitFormated=totalProfitFormated;
	}
	
	public String getTotalProfitFormated() {
		return totalProfitFormated;
	}
	
	//所得税费用
	public void setIncomeTaxExpenseFormated(String incomeTaxExpenseFormated) {
		this.incomeTaxExpenseFormated=incomeTaxExpenseFormated;
	}
	
	public String getIncomeTaxExpenseFormated() {
		return incomeTaxExpenseFormated;
	}
	
	//净利润
	public void setNetProfitFormated(String netProfitFormated) {
		this.netProfitFormated=netProfitFormated;
	}
	
	public String getNetProfitFormated() {
		return netProfitFormated;
	}
	
	//持续经营净利润
	public void setNetProfitFromContinuingOperationsFormated(String netProfitFromContinuingOperationsFormated) {
		this.netProfitFromContinuingOperationsFormated=netProfitFromContinuingOperationsFormated;
	}
	
	public String getNetProfitFromContinuingOperationsFormated() {
		return netProfitFromContinuingOperationsFormated;
	}
	
	//终止经营净利润
	public void setNetProfitFromDiscontinuedOperationsFormated(String netProfitFromDiscontinuedOperationsFormated) {
		this.netProfitFromDiscontinuedOperationsFormated=netProfitFromDiscontinuedOperationsFormated;
	}
	
	public String getNetProfitFromDiscontinuedOperationsFormated() {
		return netProfitFromDiscontinuedOperationsFormated;
	}
	
	//归属于母公司股东的净利润
	public void setNetIncomeAttributableToShareholdersFormated(String netIncomeAttributableToShareholdersFormated) {
		this.netIncomeAttributableToShareholdersFormated=netIncomeAttributableToShareholdersFormated;
	}
	
	public String getNetIncomeAttributableToShareholdersFormated() {
		return netIncomeAttributableToShareholdersFormated;
	}
	
	//少数股东损益
	public void setMinorityInterestFormated(String minorityInterestFormated) {
		this.minorityInterestFormated=minorityInterestFormated;
	}
	
	public String getMinorityInterestFormated() {
		return minorityInterestFormated;
	}
	
	//归属母公司所有者其他综合收益税后净额
	public void setAfterTaxNetAmountOfOtherComprehensiveIncomeAttributableFormated(String afterTaxNetAmountOfOtherComprehensiveIncomeAttributableFormated) {
		this.afterTaxNetAmountOfOtherComprehensiveIncomeAttributableFormated=afterTaxNetAmountOfOtherComprehensiveIncomeAttributableFormated;
	}
	
	public String getAfterTaxNetAmountOfOtherComprehensiveIncomeAttributableFormated() {
		return afterTaxNetAmountOfOtherComprehensiveIncomeAttributableFormated;
	}
	
	//不能重分类进损益的其他综合收益
	public void setOtherComprehensiveIncomeCannotBeReclassifiedIntoProfitOrLossFormated(String otherComprehensiveIncomeCannotBeReclassifiedIntoProfitOrLossFormated) {
		this.otherComprehensiveIncomeCannotBeReclassifiedIntoProfitOrLossFormated=otherComprehensiveIncomeCannotBeReclassifiedIntoProfitOrLossFormated;
	}
	
	public String getOtherComprehensiveIncomeCannotBeReclassifiedIntoProfitOrLossFormated() {
		return otherComprehensiveIncomeCannotBeReclassifiedIntoProfitOrLossFormated;
	}
	
	//重新计量设定受益计划变动额
	public void setRemeasureChangesInDefinedBenefitPlansFormated(String remeasureChangesInDefinedBenefitPlansFormated) {
		this.remeasureChangesInDefinedBenefitPlansFormated=remeasureChangesInDefinedBenefitPlansFormated;
	}
	
	public String getRemeasureChangesInDefinedBenefitPlansFormated() {
		return remeasureChangesInDefinedBenefitPlansFormated;
	}
	
	//权益法下不能转损益的其他综合收益
	public void setOtherIncomeCannotBeConvertedToProfitOrLossUnderTheEquityMethodFormated(String otherIncomeCannotBeConvertedToProfitOrLossUnderTheEquityMethodFormated) {
		this.otherIncomeCannotBeConvertedToProfitOrLossUnderTheEquityMethodFormated=otherIncomeCannotBeConvertedToProfitOrLossUnderTheEquityMethodFormated;
	}
	
	public String getOtherIncomeCannotBeConvertedToProfitOrLossUnderTheEquityMethodFormated() {
		return otherIncomeCannotBeConvertedToProfitOrLossUnderTheEquityMethodFormated;
	}
	
	//其他权益工具投资公允价值变动
	public void setChangesInFairValueOfOtherEquityInstrumentInvestmentsFormated(String changesInFairValueOfOtherEquityInstrumentInvestmentsFormated) {
		this.changesInFairValueOfOtherEquityInstrumentInvestmentsFormated=changesInFairValueOfOtherEquityInstrumentInvestmentsFormated;
	}
	
	public String getChangesInFairValueOfOtherEquityInstrumentInvestmentsFormated() {
		return changesInFairValueOfOtherEquityInstrumentInvestmentsFormated;
	}
	
	//企业自身信用风险公允价值变动
	public void setChangesInFairValueOfCorporateCreditRiskFormated(String changesInFairValueOfCorporateCreditRiskFormated) {
		this.changesInFairValueOfCorporateCreditRiskFormated=changesInFairValueOfCorporateCreditRiskFormated;
	}
	
	public String getChangesInFairValueOfCorporateCreditRiskFormated() {
		return changesInFairValueOfCorporateCreditRiskFormated;
	}
	
	//其他
	public void setOthersFormated(String othersFormated) {
		this.othersFormated=othersFormated;
	}
	
	public String getOthersFormated() {
		return othersFormated;
	}
	
	//将重分类进损益的其他综合收益
	public void setOtherIncomeReclassifiedToProfitOrLossFormated(String otherIncomeReclassifiedToProfitOrLossFormated) {
		this.otherIncomeReclassifiedToProfitOrLossFormated=otherIncomeReclassifiedToProfitOrLossFormated;
	}
	
	public String getOtherIncomeReclassifiedToProfitOrLossFormated() {
		return otherIncomeReclassifiedToProfitOrLossFormated;
	}
	
	//权益法下可转损益的其他综合收益
	public void setOtherIncomeCanBeConvertedToProfitOrLossUnderTheEquityMethodFormated(String otherIncomeCanBeConvertedToProfitOrLossUnderTheEquityMethodFormated) {
		this.otherIncomeCanBeConvertedToProfitOrLossUnderTheEquityMethodFormated=otherIncomeCanBeConvertedToProfitOrLossUnderTheEquityMethodFormated;
	}
	
	public String getOtherIncomeCanBeConvertedToProfitOrLossUnderTheEquityMethodFormated() {
		return otherIncomeCanBeConvertedToProfitOrLossUnderTheEquityMethodFormated;
	}
	
	//其他债权投资公允价值变动
	public void setChangesInFairValueOfOtherDebtInvestmentsFormated(String changesInFairValueOfOtherDebtInvestmentsFormated) {
		this.changesInFairValueOfOtherDebtInvestmentsFormated=changesInFairValueOfOtherDebtInvestmentsFormated;
	}
	
	public String getChangesInFairValueOfOtherDebtInvestmentsFormated() {
		return changesInFairValueOfOtherDebtInvestmentsFormated;
	}
	
	//金融资产重分类计入其他综合收益的金额
	public void setReclassificationOfFinancialAssetsInOtherComprehensiveIncomeFormated(String reclassificationOfFinancialAssetsInOtherComprehensiveIncomeFormated) {
		this.reclassificationOfFinancialAssetsInOtherComprehensiveIncomeFormated=reclassificationOfFinancialAssetsInOtherComprehensiveIncomeFormated;
	}
	
	public String getReclassificationOfFinancialAssetsInOtherComprehensiveIncomeFormated() {
		return reclassificationOfFinancialAssetsInOtherComprehensiveIncomeFormated;
	}
	
	//其他债权投资信用减值准备
	public void setProvisionForOtherDebtInvestmentsFormated(String provisionForOtherDebtInvestmentsFormated) {
		this.provisionForOtherDebtInvestmentsFormated=provisionForOtherDebtInvestmentsFormated;
	}
	
	public String getProvisionForOtherDebtInvestmentsFormated() {
		return provisionForOtherDebtInvestmentsFormated;
	}
	
	//现金流量套期储备
	public void setCashFlowHedgingReservesFormated(String cashFlowHedgingReservesFormated) {
		this.cashFlowHedgingReservesFormated=cashFlowHedgingReservesFormated;
	}
	
	public String getCashFlowHedgingReservesFormated() {
		return cashFlowHedgingReservesFormated;
	}
	
	//外币财报折算差额
	public void setCurrencyTranslationDifferencesFormated(String currencyTranslationDifferencesFormated) {
		this.currencyTranslationDifferencesFormated=currencyTranslationDifferencesFormated;
	}
	
	public String getCurrencyTranslationDifferencesFormated() {
		return currencyTranslationDifferencesFormated;
	}
	
	//其他
	public void setOthers1Formated(String others1Formated) {
		this.others1Formated=others1Formated;
	}
	
	public String getOthers1Formated() {
		return others1Formated;
	}
	
	//归属少数股东的其他综合收益税后净额
	public void setOtherIncomeAfterTaxAttributableToMinorityShareholdersFormated(String otherIncomeAfterTaxAttributableToMinorityShareholdersFormated) {
		this.otherIncomeAfterTaxAttributableToMinorityShareholdersFormated=otherIncomeAfterTaxAttributableToMinorityShareholdersFormated;
	}
	
	public String getOtherIncomeAfterTaxAttributableToMinorityShareholdersFormated() {
		return otherIncomeAfterTaxAttributableToMinorityShareholdersFormated;
	}
	
	//综合收益总额
	public void setTotalComprehensiveIncomeFormated(String totalComprehensiveIncomeFormated) {
		this.totalComprehensiveIncomeFormated=totalComprehensiveIncomeFormated;
	}
	
	public String getTotalComprehensiveIncomeFormated() {
		return totalComprehensiveIncomeFormated;
	}
	
	//归属于母公司所有者的综合收益总额
	public void setTotalComprehensiveIncomeToTheOwnersOfTheParentCompanyFormated(String totalComprehensiveIncomeToTheOwnersOfTheParentCompanyFormated) {
		this.totalComprehensiveIncomeToTheOwnersOfTheParentCompanyFormated=totalComprehensiveIncomeToTheOwnersOfTheParentCompanyFormated;
	}
	
	public String getTotalComprehensiveIncomeToTheOwnersOfTheParentCompanyFormated() {
		return totalComprehensiveIncomeToTheOwnersOfTheParentCompanyFormated;
	}
	
	//归属于少数股东的综合收益总额
	public void setTotalComprehensiveIncomeToMinorityShareholdersFormated(String totalComprehensiveIncomeToMinorityShareholdersFormated) {
		this.totalComprehensiveIncomeToMinorityShareholdersFormated=totalComprehensiveIncomeToMinorityShareholdersFormated;
	}
	
	public String getTotalComprehensiveIncomeToMinorityShareholdersFormated() {
		return totalComprehensiveIncomeToMinorityShareholdersFormated;
	}
	
	//基本每股收益
	public void setBasicEarningsPerShareFormated(String basicEarningsPerShareFormated) {
		this.basicEarningsPerShareFormated=basicEarningsPerShareFormated;
	}
	
	public String getBasicEarningsPerShareFormated() {
		return basicEarningsPerShareFormated;
	}
	
	//稀释每股收益
	public void setDilutedEarningsPerShareFormated(String dilutedEarningsPerShareFormated) {
		this.dilutedEarningsPerShareFormated=dilutedEarningsPerShareFormated;
	}
	
	public String getDilutedEarningsPerShareFormated() {
		return dilutedEarningsPerShareFormated;
	}
	
	//ROE
	public void setROE(String ROEFormated) {
		this.ROEFormated=ROEFormated;
	}
	
	public String getROEFormated() {
		return ROEFormated;
	}
	
	//财报分红金额
	public void setFinancialReportDividendsFormated(String financialReportDividendsFormated) {
		this.financialReportDividendsFormated=financialReportDividendsFormated;
	}
	
	public String getFinancialReportDividendsFormated() {
		return financialReportDividendsFormated;
	}
}
