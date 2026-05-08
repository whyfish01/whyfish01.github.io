package report.bean.entity;

public class DividendsFormated {
	
	String 
	financialReportingNo,								//财报编号
	AShareCode,											//A股代码
	AShareName,											//A股简称
	primaryIndustry,									//一级行业
	secondaryIndustry,									//二级行业
	thirdLevelIndustry,									//三级行业
	region,												//所属区域
	createDateTime,
	equityFormated,												//股本
	netIncomeAttributableToShareholdersFormated,				//归属于母公司所有者的净利润
	growthRateOfNetIncomeAttributableToShareholdersFormated,	//归母净利润增长率
	distributiveProfitsFormated,								//可分配利润
	financialReportDividendsFormated,							//现金分红金额
	dividendRateFormated,										//分红率（股利支付率）
	dividendEveryTenSharesFormated;								//每十股分红
	
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
	public void setEquityFormated(String equityFormated) {
		this.equityFormated=equityFormated;
	}
		
	public String getEquityFormated() {
		return equityFormated;
	}
	
	//归属于母公司所有者的净利润
	public void setNetIncomeAttributableToShareholdersFormated(String netIncomeAttributableToShareholdersFormated) {
		this.netIncomeAttributableToShareholdersFormated=netIncomeAttributableToShareholdersFormated;
	}
		
	public String getNetIncomeAttributableToShareholdersFormated() {
		return netIncomeAttributableToShareholdersFormated;
	}
	
	//归母净利润增长率
	public void setGrowthRateOfNetIncomeAttributableToShareholdersFormated(String growthRateOfNetIncomeAttributableToShareholdersFormated) {
		this.growthRateOfNetIncomeAttributableToShareholdersFormated=growthRateOfNetIncomeAttributableToShareholdersFormated;
	}
		
	public String getGrowthRateOfNetIncomeAttributableToShareholdersFormated() {
		return growthRateOfNetIncomeAttributableToShareholdersFormated;
	}
	
	//可分配利润
	public void setDistributiveProfitsFormated(String distributiveProfitsFormated) {
		this.distributiveProfitsFormated=distributiveProfitsFormated;
	}
		
	public String getDistributiveProfitsFormated() {
		return distributiveProfitsFormated;
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
	
	//每十股分红
	public void setDividendEveryTenSharesFormated(String dividendEveryTenSharesFormated) {
		this.dividendEveryTenSharesFormated=dividendEveryTenSharesFormated;
	}
		
	public String getDividendEveryTenSharesFormated() {
		return dividendEveryTenSharesFormated;
	}
	
	
	//财报年份
	public void setReportYear(int reportYear) {
		this.reportYear=reportYear;
	}
		
	public int getReportYear() {
		return reportYear;
	}
}
