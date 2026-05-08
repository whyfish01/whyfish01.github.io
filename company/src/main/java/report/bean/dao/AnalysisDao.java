package report.bean.dao;
import report.bean.entity.*;
import java.util.ArrayList;

public interface AnalysisDao {
	
	//获得企业信息
	public ArrayList<Company> getCompanyInfo(String AShareCode);
	
	//指标一：总资产情况:资产增长率
	public ArrayList<ReportSummaryFormated> getTotalAssetsSituation (String AShareCode,String financialReportingYear);
	
	//指标一：总资产情况：净资产情况
	public ArrayList<ReportSummaryFormated> getTotalAssetsSituation1 (String AShareCode,String financialReportingYear);
	
	//指标二：资产负债率情况
	public ArrayList<ReportSummaryFormated> getAssetLiabilityRatio (String AShareCode,String financialReportingYear);
	
	//指标三：有息负债与货币资金
	public ArrayList<ReportSummaryFormated> getInterestBearingLiabilitiesAndMonetaryFunds(String AShareCode,String financialReportingYear);
	
	//指标四：准货币资金
	public ArrayList<ReportSummaryFormated> getQuasiMonetaryFunds(String AShareCode,String financialReportingYear);
	
	//指标五：“应收预付”和“应付预收”
	public ArrayList<ReportSummaryFormated> getAccountPayable(String AShareCode,String financialReportingYear);
	
	//指标六：固定资产
	public ArrayList<ReportSummaryFormated> getFixedAssets(String AShareCode,String financialReportingYear);
	
	//指标七：投资类资产
	public ArrayList<ReportSummaryFormated> getInvestmentAssets(String AShareCode,String financialReportingYear);
	
	//指标八：其他资产
	public ArrayList<ReportSummaryFormated> getOtherAssets(String AShareCode,String financialReportingYear);
	
	//指标九：职工薪酬
	public ArrayList<ReportSummaryFormated> getEmployeeCompensation(String AShareCode,String financialReportingYear);
	
	//指标十：营业收入及增长
	public ArrayList<ReportSummaryFormated> getOperatingRevenueAndGrowth(String AShareCode,String financialReportingYear);
	
	//指标十：总资产周转率
	public ArrayList<ReportSummaryFormated> getOperatingRevenueAndGrowth1(String AShareCode,String financialReportingYear);
	
	//指标十：销售商品、提供劳务收到的现金营收占比
	public ArrayList<ReportSummaryFormated> getOperatingRevenueAndGrowth2(String AShareCode,String financialReportingYear);
	
	//指标十一：营业收入构成风险
	public ArrayList<ReportSummaryFormated> getRiskPosedByOperatingIncomeComposition(String AShareCode,String financialReportingYear);
	
	//指标十一：营业收入构成风险：存货增长率
	public ArrayList<ReportSummaryFormated> getRiskPosedByOperatingIncomeComposition1(String AShareCode,String financialReportingYear);

	//指标十二：毛利率
	public ArrayList<ReportSummaryFormated> getGrossMargin(String AShareCode,String financialReportingYear);
	
	//指标十三：费用率
	public ArrayList<ReportSummaryFormated> getExpense(String AShareCode,String financialReportingYear);
	
	//指标十四：主营利润和营业利润率
	public ArrayList<ReportSummaryFormated> getMainOperatingProfitAndOperatingProfitMargin(String AShareCode,String financialReportingYear);
	
	//指标十五：净利润：净利润增长
	public ArrayList<ReportSummaryFormated> getNetProfit(String AShareCode,String financialReportingYear);
	
	//指标十五：净利润：净利润率
	public ArrayList<ReportSummaryFormated> getNetProfit1(String AShareCode,String financialReportingYear);
	
	//指标十五：净利润：净现比
	public ArrayList<ReportSummaryFormated> getNetProfit2(String AShareCode,String financialReportingYear);
	
	//指标十六：归母净利润
	public ArrayList<ReportSummaryFormated> getNetProfitAttributableToShareholders(String AShareCode,String financialReportingYear);
	
	//指标十七：经营活动产生的现金流量净额
	public ArrayList<ReportSummaryFormated> getNetCashFlowGeneratedFromOperatingActivities(String AShareCode,String financialReportingYear);
	
	//指标十八：购建固定资产、无形资产和其他长期资产支付的现金
	public ArrayList<ReportSummaryFormated> getCashPaid(String AShareCode,String financialReportingYear);

	//指标十九：分红率
	public ArrayList<ReportSummaryFormated> getDividendRate(String AShareCode,String financialReportingYear);
	
	//指标二十：三大现金流量净额的组合类型
	public ArrayList<ReportSummaryFormated> getCompanyType(String AShareCode,String financialReportingYear);
	
	//指标二十：三大现金流量净额的组合类型:经营活动产生的现金流量净额增长率
	public ArrayList<ReportSummaryFormated> getCompanyType1(String AShareCode,String financialReportingYear);
	
	//指标二十一：现金及现金等价物的净增加额
	public ArrayList<ReportSummaryFormated> getNetIncreaseInCashAndCashEquivalents(String AShareCode,String financialReportingYear);
}
