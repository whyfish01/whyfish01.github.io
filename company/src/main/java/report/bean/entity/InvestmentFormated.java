package report.bean.entity;

public class InvestmentFormated {
	
	String 
	
	budgetId,											//投资编号：A股代码+四位年
	AShareCode,											//A股代码
	AShareName,											//A股简称
	createDateTime,										//创建时间
	whetherToSell,										//是否卖出
	sellTime,											//卖出时间
	unitPriceFormated,											//买入股票单价
	totalCostFormated,											//买入总成本
	dividendEveryTenSharesFormated,								//每十股分红
	dividendIncomeFormated,										//分红总收益
	yieldFormated,												//股息率
	estimatedTotalCostFormated,									//分红后总成本
	estimatedUnitPriceFormated,									//分红后单价
	currentTotalCostFormated,									//投资当前市值
	currentUnitPriceFormated,									//投资标的当前股价
	incomeFromChangesInFairValueFormated,						//公允价值变动收益
	sellPriceFormated,											//卖出价格
	realReturnFormated,											//投资实际收益
	rateOfRealReturnFormated;									//实际收益率
	
	int
	reportYear,											//财报年份
	numberOfStocks,										//持股数量
	sellNumbers;										//卖出数量
	
	
	//预算编号：A股代码+四位年
	public void setBudgetId(String budgetId) {
		this.budgetId=budgetId;
	}
			
	public String getBudgetId() {
		return budgetId;
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
	
	//创建时间
	public void setCreateDateTime(String createDateTime) {
		this.createDateTime=createDateTime;
	}
			
	public String getCreateDateTime() {
		return createDateTime;
	}
	
	//是否卖出
	public void setWhetherToSell(String whetherToSell) {
		this.whetherToSell=whetherToSell;
	}
			
	public String getWhetherToSell() {
		return whetherToSell;
	}
	
	//卖出时间
	public void setSellTime(String sellTime) {
		this.sellTime=sellTime;
	}
			
	public String getSellTime() {
		return sellTime;
	}

	//财报年份
	public void setReportYear(int reportYear) {
		this.reportYear=reportYear;
	}
			
	public int getReportYear() {
		return reportYear;
	}
	
	//持股数量
	public void setNumberOfStocks(int numberOfStocks) {
		this.numberOfStocks=numberOfStocks;
	}
			
	public int getNumberOfStocks() {
		return numberOfStocks;
	}
	
	//卖出数量
	public void setSellNumbers(int sellNumbers) {
		this.sellNumbers=sellNumbers;
	}
			
	public int getSellNumbers() {
		return sellNumbers;
	}
	

	//买入股票单价
	public void setUnitPriceFormated(String unitPriceFormated) {
		this.unitPriceFormated=unitPriceFormated;
	}
			
	public String getUnitPriceFormated() {
		return unitPriceFormated;
	}
	
	//买入总成本
	public void setTotalCostFormated(String totalCostFormated) {
		this.totalCostFormated=totalCostFormated;
	}
			
	public String getTotalCostFormated() {
		return totalCostFormated;
	}
	
	//每十股分红
	public void setDividendEveryTenSharesFormated(String dividendEveryTenSharesFormated) {
		this.dividendEveryTenSharesFormated=dividendEveryTenSharesFormated;
	}
			
	public String getDividendEveryTenSharesFormated() {
		return dividendEveryTenSharesFormated;
	}
	
	//分红总收益
	public void setDividendIncomeFormated(String dividendIncomeFormated) {
		this.dividendIncomeFormated=dividendIncomeFormated;
	}
			
	public String getDividendIncomeFormated() {
		return dividendIncomeFormated;
	}
	
	//股息率
	public void setYieldFormated(String yieldFormated) {
		this.yieldFormated=yieldFormated;
	}
			
	public String getYieldFormated() {
		return yieldFormated;
	}
	
	//分红后总成本
	public void setEstimatedTotalCostFormated(String estimatedTotalCostFormated) {
		this.estimatedTotalCostFormated=estimatedTotalCostFormated;
	}
			
	public String getEstimatedTotalCostFormated() {
		return estimatedTotalCostFormated;
	}
	
	//分红后单价
	public void setEstimatedUnitPriceFormated(String estimatedUnitPriceFormated) {
		this.estimatedUnitPriceFormated=estimatedUnitPriceFormated;
	}
			
	public String getEstimatedUnitPriceFormated() {
		return estimatedUnitPriceFormated;
	}
	
	//投资当前市值
	public void setCurrentTotalCostFormated(String currentTotalCostFormated) {
		this.currentTotalCostFormated=currentTotalCostFormated;
	}
			
	public String getCurrentTotalCostFormated() {
		return currentTotalCostFormated;
	}
	
	//投资标的当前股价
	public void setCurrentUnitPriceFormated(String currentUnitPriceFormated) {
		this.currentUnitPriceFormated=currentUnitPriceFormated;
	}
			
	public String getCurrentUnitPriceFormated() {
		return currentUnitPriceFormated;
	}
	
	//公允价值变动收益
	public void setIncomeFromChangesInFairValueFormated(String incomeFromChangesInFairValueFormated) {
		this.incomeFromChangesInFairValueFormated=incomeFromChangesInFairValueFormated;
	}
			
	public String getIncomeFromChangesInFairValueFormated() {
		return incomeFromChangesInFairValueFormated;
	}
	
	//卖出价格
	public void setSellPriceFormated(String sellPriceFormated) {
		this.sellPriceFormated=sellPriceFormated;
	}
			
	public String getSellPriceFormated() {
		return sellPriceFormated;
	}
	
	//投资实际收益
	public void setRealReturnFormated(String realReturnFormated) {
		this.realReturnFormated=realReturnFormated;
	}
			
	public String getRealReturnFormated() {
		return realReturnFormated;
	}
	
	//实际收益率
	public void setRateOfRealReturnFormated(String rateOfRealReturnFormated) {
		this.rateOfRealReturnFormated=rateOfRealReturnFormated;
	}
			
	public String getRateOfRealReturnFormated() {
		return rateOfRealReturnFormated;
	}
}
