package report.bean.entity;

public class CashflowSupplementFormated {
	String
	financialReportingNo,						//财报编号
	createDateTime,								//创建时间
	upDateTime,									//更新时间
	impairmentOfAssetsFormated,							//加：资产减值准备
	depreciationFormated,								//固定资产折旧、油气资产折耗、生产性生物资产折旧
	depreciationOfRightOfUseAssetsFormated,				//使用权资产折旧
	amortizationOfIntangibleAssetsFormated,				//无形资产摊销
	amortizationOfLongTermDeferredExpensesFormated,		//长期待摊费用摊销
	lossOnDisposalOfAssetsFormated,						//处置固定资产、无形资产和其他长期资产的损失
	lossesOnScrappingOfFixedAssetsFormated,				//固定资产报废损失
	lossFromChangesInFairValueFormated,					//公允价值变动损失
	financialExpensesFormated,							//财务费用
	investmentLossesFormated,							//投资损失
	decreaseInDeferredIncomeTaxAssetsFormated,			//递延所得税资产减少
	increaseInDeferredIncomeTaxLiabilitiesFormated,		//递延所得税负债增加
	reductionOfInventoryFormated,						//存货的减少
	reductionOfOperatingReceivablesFormated,			//经营性应收项目的减少（增加以“－”号填列）
	increaseInOperationalPayablesFormated,				//经营性应付项目的增加
	conversionOfDebtIntoCapitalFormated,				//债务转为资本
	convertibleCorporatebondsDueWithinOneYearFormated,	//一年内到期的可转换公司债券
	fixedAssetsUnderFinancingLeaseFormated;				//融资租入固定资产
	
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
		
		//加：资产减值准备
		public void setImpairmentOfAssetsFormated(String impairmentOfAssetsFormated) {
			this.impairmentOfAssetsFormated=impairmentOfAssetsFormated;
		}
		
		public String getImpairmentOfAssetsFormated() {
			return impairmentOfAssetsFormated;
		}
		
		//固定资产折旧、油气资产折耗、生产性生物资产折旧
		public void setDepreciationFormated(String depreciationFormated) {
			this.depreciationFormated=depreciationFormated;
		}
		
		public String getDepreciationFormated() {
			return depreciationFormated;
		}
		
		//使用权资产折旧
		public void setDepreciationOfRightOfUseAssetsFormated(String depreciationOfRightOfUseAssetsFormated) {
			this.depreciationOfRightOfUseAssetsFormated=depreciationOfRightOfUseAssetsFormated;
		}
		
		public String getDepreciationOfRightOfUseAssetsFormated() {
			return depreciationOfRightOfUseAssetsFormated;
		}
		
		//无形资产摊销
		public void setAmortizationOfIntangibleAssetsFormated(String amortizationOfIntangibleAssetsFormated) {
			this.amortizationOfIntangibleAssetsFormated=amortizationOfIntangibleAssetsFormated;
		}
		
		public String getAmortizationOfIntangibleAssetsFormated() {
			return amortizationOfIntangibleAssetsFormated;
		}
		
		//长期待摊费用摊销
		public void setAmortizationOfLongTermDeferredExpensesFormated(String amortizationOfLongTermDeferredExpensesFormated) {
			this.amortizationOfLongTermDeferredExpensesFormated=amortizationOfLongTermDeferredExpensesFormated;
		}
		
		public String getAmortizationOfLongTermDeferredExpensesFormated() {
			return amortizationOfLongTermDeferredExpensesFormated;
		}
		
		//处置固定资产、无形资产和其他长期资产的损失
		public void setLossOnDisposalOfAssetsFormated(String lossOnDisposalOfAssetsFormated) {
			this.lossOnDisposalOfAssetsFormated=lossOnDisposalOfAssetsFormated;
		}
		
		public String getLossOnDisposalOfAssetsFormated() {
			return lossOnDisposalOfAssetsFormated;
		}
		
		//固定资产报废损失
		public void setLossesOnScrappingOfFixedAssetsFormated(String lossesOnScrappingOfFixedAssetsFormated) {
			this.lossesOnScrappingOfFixedAssetsFormated=lossesOnScrappingOfFixedAssetsFormated;
		}
		
		public String getLossesOnScrappingOfFixedAssetsFormated() {
			return lossesOnScrappingOfFixedAssetsFormated;
		}
		
		//公允价值变动损失
		public void setLossFromChangesInFairValueFormated(String lossFromChangesInFairValueFormated) {
			this.lossFromChangesInFairValueFormated=lossFromChangesInFairValueFormated;
		}
		
		public String getLossFromChangesInFairValueFormated() {
			return lossFromChangesInFairValueFormated;
		}
		
		//财务费用
		public void setFinancialExpensesFormated(String financialExpensesFormated) {
			this.financialExpensesFormated=financialExpensesFormated;
		}
		
		public String getFinancialExpensesFormated() {
			return financialExpensesFormated;
		}
		
		//投资损失
		public void setInvestmentLossesFormated(String investmentLossesFormated) {
			this.investmentLossesFormated=investmentLossesFormated;
		}
		
		public String getInvestmentLossesFormated() {
			return investmentLossesFormated;
		}
		
		//递延所得税资产减少
		public void setDecreaseInDeferredIncomeTaxAssetsFormated(String decreaseInDeferredIncomeTaxAssetsFormated) {
			this.decreaseInDeferredIncomeTaxAssetsFormated=decreaseInDeferredIncomeTaxAssetsFormated;
		}
		
		public String getDecreaseInDeferredIncomeTaxAssetsFormated() {
			return decreaseInDeferredIncomeTaxAssetsFormated;
		}
		
		//递延所得税负债增加
		public void setIncreaseInDeferredIncomeTaxLiabilitiesFormated(String increaseInDeferredIncomeTaxLiabilitiesFormated) {
			this.increaseInDeferredIncomeTaxLiabilitiesFormated=increaseInDeferredIncomeTaxLiabilitiesFormated;
		}
		
		public String getIncreaseInDeferredIncomeTaxLiabilitiesFormated() {
			return increaseInDeferredIncomeTaxLiabilitiesFormated;
		}
		
		//存货的减少
		public void setReductionOfInventoryFormated(String reductionOfInventoryFormated) {
			this.reductionOfInventoryFormated=reductionOfInventoryFormated;
		}
		
		public String getReductionOfInventoryFormated() {
			return reductionOfInventoryFormated;
		}
		
		//经营性应收项目的减少
		public void setReductionOfOperatingReceivablesFormated(String reductionOfOperatingReceivablesFormated) {
			this.reductionOfOperatingReceivablesFormated=reductionOfOperatingReceivablesFormated;
		}
						
		public String getReductionOfOperatingReceivablesFormated() {
			return reductionOfOperatingReceivablesFormated;
		}
		
		//经营性应付项目的增加
		public void setIncreaseInOperationalPayablesFormated(String increaseInOperationalPayablesFormated) {
			this.increaseInOperationalPayablesFormated=increaseInOperationalPayablesFormated;
		}
		
		public String getIncreaseInOperationalPayablesFormated() {
			return increaseInOperationalPayablesFormated;
		}
		
		//债务转为资本
		public void setConversionOfDebtIntoCapitalFormated(String conversionOfDebtIntoCapitalFormated) {
			this.conversionOfDebtIntoCapitalFormated=conversionOfDebtIntoCapitalFormated;
		}
		
		public String getConversionOfDebtIntoCapitalFormated() {
			return conversionOfDebtIntoCapitalFormated;
		}
		
		//一年内到期的可转换公司债券
		public void setConvertibleCorporatebondsDueWithinOneYearFormated(String convertibleCorporatebondsDueWithinOneYearFormated) {
			this.convertibleCorporatebondsDueWithinOneYearFormated=convertibleCorporatebondsDueWithinOneYearFormated;
		}
		
		public String getConvertibleCorporatebondsDueWithinOneYearFormated() {
			return convertibleCorporatebondsDueWithinOneYearFormated;
		}
		
		//融资租入固定资产
		public void setFixedAssetsUnderFinancingLeaseFormated(String fixedAssetsUnderFinancingLeaseFormated) {
			this.fixedAssetsUnderFinancingLeaseFormated=fixedAssetsUnderFinancingLeaseFormated;
		}
		
		public String getFixedAssetsUnderFinancingLeaseFormated() {
			return fixedAssetsUnderFinancingLeaseFormated;
		}
}
