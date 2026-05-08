package report.bean.entity;

public class Dividends {
	
	String 
	financialReportingNo,								//财报编号
	AShareCode,											//A股代码
	AShareName,											//A股简称
	primaryIndustry,									//一级行业
	secondaryIndustry,									//二级行业
	thirdLevelIndustry,									//三级行业
	region,												//所属区域
	createDateTime;										//创建时间
	
	double
	equity,												//股本
	netIncomeAttributableToShareholders,				//归属于母公司所有者的净利润
	growthRateOfNetIncomeAttributableToShareholders,	//归母净利润增长率
	distributiveProfits,								//可分配利润
	financialReportDividends,							//现金分红金额
	dividendRate,										//分红率（股利支付率）
	dividendEveryTenShares;								//每十股分红
	
	int
	reportYear;											//财报年份
	
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
	
	//创建时间
	public void setCreateDateTime(String createDateTime) {
		this.createDateTime=createDateTime;
	}
		
	public String getCreateDateTime() {
		return createDateTime;
	}
	
	
	//股本
	public void setEquity(double equity) {
		this.equity=equity;
	}
		
	public double getEquity() {
		return equity;
	}
	
	//归属于母公司所有者的净利润
	public void setNetIncomeAttributableToShareholders(double netIncomeAttributableToShareholders) {
		this.netIncomeAttributableToShareholders=netIncomeAttributableToShareholders;
	}
		
	public double getNetIncomeAttributableToShareholders() {
		return netIncomeAttributableToShareholders;
	}
	
	//归母净利润增长率
	public void setGrowthRateOfNetIncomeAttributableToShareholders(double growthRateOfNetIncomeAttributableToShareholders) {
		this.growthRateOfNetIncomeAttributableToShareholders=growthRateOfNetIncomeAttributableToShareholders;
	}
		
	public double getGrowthRateOfNetIncomeAttributableToShareholders() {
		return growthRateOfNetIncomeAttributableToShareholders;
	}
	
	//可分配利润
	public void setDistributiveProfits(double distributiveProfits) {
		this.distributiveProfits=distributiveProfits;
	}
		
	public double getDistributiveProfits() {
		return distributiveProfits;
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
	
	//每十股分红
	public void setDividendEveryTenShares(double dividendEveryTenShares) {
		this.dividendEveryTenShares=dividendEveryTenShares;
	}
		
	public double getDividendEveryTenShares() {
		return dividendEveryTenShares;
	}
	
	
	//财报年份
	public void setReportYear(int reportYear) {
		this.reportYear=reportYear;
	}
		
	public int getReportYear() {
		return reportYear;
	}
}
