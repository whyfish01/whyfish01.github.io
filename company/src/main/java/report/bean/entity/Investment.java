package report.bean.entity;

public class Investment {
	
	String 
	
	budgetId,											//投资编号：A股代码+四位年
	AShareCode,											//A股代码
	AShareName,											//A股简称
	createDateTime,										//创建时间
	whetherToSell,										//是否卖出
	sellTime;											//卖出时间
	
	int
	reportYear,											//财报年份
	numberOfStocks,										//持股数量
	sellNumbers;										//卖出数量
	
	Double
	
	unitPrice,											//买入股票单价
	totalCost,											//买入总成本
	dividendEveryTenShares,								//每十股分红
	dividendIncome,										//分红总收益
	yield,												//股息率
	estimatedTotalCost,									//分红后总成本
	estimatedUnitPrice,									//分红后单价
	currentTotalCost,									//投资当前市值
	currentUnitPrice,									//投资标的当前股价
	incomeFromChangesInFairValue,						//公允价值变动收益
	sellPrice,											//卖出价格
	realReturn,											//投资实际收益
	rateOfRealReturn;									//实际收益率
	
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
	public void setUnitPrice(Double unitPrice) {
		this.unitPrice=unitPrice;
	}
			
	public Double getUnitPrice() {
		return unitPrice;
	}
	
	//买入总成本
	public void setTotalCost(Double totalCost) {
		this.totalCost=totalCost;
	}
			
	public Double getTotalCost() {
		return totalCost;
	}
	
	//每十股分红
	public void setDividendEveryTenShares(Double dividendEveryTenShares) {
		this.dividendEveryTenShares=dividendEveryTenShares;
	}
			
	public Double getDividendEveryTenShares() {
		return dividendEveryTenShares;
	}
	
	//分红总收益
	public void setDividendIncome(Double dividendIncome) {
		this.dividendIncome=dividendIncome;
	}
			
	public Double getDividendIncome() {
		return dividendIncome;
	}
	
	//股息率
	public void setYield(Double yield) {
		this.yield=yield;
	}
			
	public Double getYield() {
		return yield;
	}
	
	//分红后总成本
	public void setEstimatedTotalCost(Double estimatedTotalCost) {
		this.estimatedTotalCost=estimatedTotalCost;
	}
			
	public Double getEstimatedTotalCost() {
		return estimatedTotalCost;
	}
	
	//分红后单价
	public void setEstimatedUnitPrice(Double estimatedUnitPrice) {
		this.estimatedUnitPrice=estimatedUnitPrice;
	}
			
	public Double getEstimatedUnitPrice() {
		return estimatedUnitPrice;
	}
	
	//投资当前市值
	public void setCurrentTotalCost(Double currentTotalCost) {
		this.currentTotalCost=currentTotalCost;
	}
			
	public Double getCurrentTotalCost() {
		return currentTotalCost;
	}
	
	//投资标的当前股价
	public void setCurrentUnitPrice(Double currentUnitPrice) {
		this.currentUnitPrice=currentUnitPrice;
	}
			
	public Double getCurrentUnitPrice() {
		return currentUnitPrice;
	}
	
	//公允价值变动收益
	public void setIncomeFromChangesInFairValue(Double incomeFromChangesInFairValue) {
		this.incomeFromChangesInFairValue=incomeFromChangesInFairValue;
	}
			
	public Double getIncomeFromChangesInFairValue() {
		return incomeFromChangesInFairValue;
	}
	
	//卖出价格
	public void setSellPrice(Double sellPrice) {
		this.sellPrice=sellPrice;
	}
			
	public Double getSellPrice() {
		return sellPrice;
	}
	
	//投资实际收益
	public void setRealReturn(Double realReturn) {
		this.realReturn=realReturn;
	}
			
	public Double getRealReturn() {
		return realReturn;
	}
	
	//实际收益率
	public void setRateOfRealReturn(Double rateOfRealReturn) {
		this.rateOfRealReturn=rateOfRealReturn;
	}
			
	public Double getRateOfRealReturn() {
		return rateOfRealReturn;
	}
}
