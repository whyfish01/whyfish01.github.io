package report.bean.entity;

public class CashflowSupplement {
	String
	financialReportingNo,						//财报编号
	createDateTime,								//创建时间
	upDateTime;									//更新时间
	double
	impairmentOfAssets,							//加：资产减值准备
	depreciation,								//固定资产折旧、油气资产折耗、生产性生物资产折旧
	depreciationOfRightOfUseAssets,				//使用权资产折旧
	amortizationOfIntangibleAssets,				//无形资产摊销
	amortizationOfLongTermDeferredExpenses,		//长期待摊费用摊销
	lossOnDisposalOfAssets,						//处置固定资产、无形资产和其他长期资产的损失
	lossesOnScrappingOfFixedAssets,				//固定资产报废损失
	lossFromChangesInFairValue,					//公允价值变动损失
	financialExpenses,							//财务费用
	investmentLosses,							//投资损失
	decreaseInDeferredIncomeTaxAssets,			//递延所得税资产减少
	increaseInDeferredIncomeTaxLiabilities,		//递延所得税负债增加
	reductionOfInventory,						//存货的减少
	reductionOfOperatingReceivables,			//经营性应收项目的减少（增加以“－”号填列）
	increaseInOperationalPayables,				//经营性应付项目的增加
	conversionOfDebtIntoCapital,				//债务转为资本
	convertibleCorporatebondsDueWithinOneYear,	//一年内到期的可转换公司债券
	fixedAssetsUnderFinancingLease;				//融资租入固定资产
	
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
		public void setImpairmentOfAssets(double impairmentOfAssets) {
			this.impairmentOfAssets=impairmentOfAssets;
		}
		
		public double getImpairmentOfAssets() {
			return impairmentOfAssets;
		}
		
		//固定资产折旧、油气资产折耗、生产性生物资产折旧
		public void setDepreciation(double depreciation) {
			this.depreciation=depreciation;
		}
		
		public double getDepreciation() {
			return depreciation;
		}
		
		//使用权资产折旧
		public void setDepreciationOfRightOfUseAssets(double depreciationOfRightOfUseAssets) {
			this.depreciationOfRightOfUseAssets=depreciationOfRightOfUseAssets;
		}
		
		public double getDepreciationOfRightOfUseAssets() {
			return depreciationOfRightOfUseAssets;
		}
		
		//无形资产摊销
		public void setAmortizationOfIntangibleAssets(double amortizationOfIntangibleAssets) {
			this.amortizationOfIntangibleAssets=amortizationOfIntangibleAssets;
		}
		
		public double getAmortizationOfIntangibleAssets() {
			return amortizationOfIntangibleAssets;
		}
		
		//长期待摊费用摊销
		public void setAmortizationOfLongTermDeferredExpenses(double amortizationOfLongTermDeferredExpenses) {
			this.amortizationOfLongTermDeferredExpenses=amortizationOfLongTermDeferredExpenses;
		}
		
		public double getAmortizationOfLongTermDeferredExpenses() {
			return amortizationOfLongTermDeferredExpenses;
		}
		
		//处置固定资产、无形资产和其他长期资产的损失
		public void setLossOnDisposalOfAssets(double lossOnDisposalOfAssets) {
			this.lossOnDisposalOfAssets=lossOnDisposalOfAssets;
		}
		
		public double getLossOnDisposalOfAssets() {
			return lossOnDisposalOfAssets;
		}
		
		//固定资产报废损失
		public void setLossesOnScrappingOfFixedAssets(double lossesOnScrappingOfFixedAssets) {
			this.lossesOnScrappingOfFixedAssets=lossesOnScrappingOfFixedAssets;
		}
		
		public double getLossesOnScrappingOfFixedAssets() {
			return lossesOnScrappingOfFixedAssets;
		}
		
		//公允价值变动损失
		public void setLossFromChangesInFairValue(double lossFromChangesInFairValue) {
			this.lossFromChangesInFairValue=lossFromChangesInFairValue;
		}
		
		public double getLossFromChangesInFairValue() {
			return lossFromChangesInFairValue;
		}
		
		//财务费用
		public void setFinancialExpenses(double financialExpenses) {
			this.financialExpenses=financialExpenses;
		}
		
		public double getFinancialExpenses() {
			return financialExpenses;
		}
		
		//投资损失
		public void setInvestmentLosses(double investmentLosses) {
			this.investmentLosses=investmentLosses;
		}
		
		public double getInvestmentLosses() {
			return investmentLosses;
		}
		
		//递延所得税资产减少
		public void setDecreaseInDeferredIncomeTaxAssets(double decreaseInDeferredIncomeTaxAssets) {
			this.decreaseInDeferredIncomeTaxAssets=decreaseInDeferredIncomeTaxAssets;
		}
		
		public double getDecreaseInDeferredIncomeTaxAssets() {
			return decreaseInDeferredIncomeTaxAssets;
		}
		
		//递延所得税负债增加
		public void setIncreaseInDeferredIncomeTaxLiabilities(double increaseInDeferredIncomeTaxLiabilities) {
			this.increaseInDeferredIncomeTaxLiabilities=increaseInDeferredIncomeTaxLiabilities;
		}
		
		public double getIncreaseInDeferredIncomeTaxLiabilities() {
			return increaseInDeferredIncomeTaxLiabilities;
		}
		
		//存货的减少
		public void setReductionOfInventory(double reductionOfInventory) {
			this.reductionOfInventory=reductionOfInventory;
		}
		
		public double getReductionOfInventory() {
			return reductionOfInventory;
		}
		
		//经营性应收项目的减少
		public void setReductionOfOperatingReceivables(double reductionOfOperatingReceivables) {
			this.reductionOfOperatingReceivables=reductionOfOperatingReceivables;
		}
				
		public double getReductionOfOperatingReceivables() {
			return reductionOfOperatingReceivables;
		}
		
		//经营性应付项目的增加
		public void setIncreaseInOperationalPayables(double increaseInOperationalPayables) {
			this.increaseInOperationalPayables=increaseInOperationalPayables;
		}
		
		public double getIncreaseInOperationalPayables() {
			return increaseInOperationalPayables;
		}
		
		
		//债务转为资本
		public void setConversionOfDebtIntoCapital(double conversionOfDebtIntoCapital) {
			this.conversionOfDebtIntoCapital=conversionOfDebtIntoCapital;
		}
		
		public double getConversionOfDebtIntoCapital() {
			return conversionOfDebtIntoCapital;
		}
		
		//一年内到期的可转换公司债券
		public void setConvertibleCorporatebondsDueWithinOneYear(double convertibleCorporatebondsDueWithinOneYear) {
			this.convertibleCorporatebondsDueWithinOneYear=convertibleCorporatebondsDueWithinOneYear;
		}
		
		public double getConvertibleCorporatebondsDueWithinOneYear() {
			return convertibleCorporatebondsDueWithinOneYear;
		}
		
		//融资租入固定资产
		public void setFixedAssetsUnderFinancingLease(double fixedAssetsUnderFinancingLease) {
			this.fixedAssetsUnderFinancingLease=fixedAssetsUnderFinancingLease;
		}
		
		public double getFixedAssetsUnderFinancingLease() {
			return fixedAssetsUnderFinancingLease;
		}
}
