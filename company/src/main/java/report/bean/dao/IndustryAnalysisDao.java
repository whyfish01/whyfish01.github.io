package report.bean.dao;

import java.util.ArrayList;

import report.bean.entity.ReportSummaryFormated;

public interface IndustryAnalysisDao {

	//行业内比较：总资产与负债
	public ArrayList<ReportSummaryFormated> getIndustryReportstatistics01(String industry1, String industry2, String industry3, String financialReportingYear);
	
	//行业内比较：准货币资金实力
	public ArrayList<ReportSummaryFormated> getIndustryReportstatistics02(String industry1, String industry2, String industry3, String financialReportingYear);
	
	//行业内比较：行业上下游竞争力
	public ArrayList<ReportSummaryFormated> getIndustryReportstatistics03(String industry1, String industry2, String industry3, String financialReportingYear);
	
	//行业内比较：资产构成风险
	public ArrayList<ReportSummaryFormated> getIndustryReportstatistics04(String industry1, String industry2, String industry3, String financialReportingYear);
	
	//行业内比较：营收增长及毛利率比较
	public ArrayList<ReportSummaryFormated> getIndustryReportstatistics05(String industry1, String industry2, String industry3, String financialReportingYear);
	
	//行业内比较：费用率比较
	public ArrayList<ReportSummaryFormated> getIndustryReportstatistics06(String industry1, String industry2, String industry3, String financialReportingYear);
	
	//行业内比较：利润及构成比较
	public ArrayList<ReportSummaryFormated> getIndustryReportstatistics07(String industry1, String industry2, String industry3, String financialReportingYear);
	
	//行业内比较：归母净利润与分红比较
	public ArrayList<ReportSummaryFormated> getIndustryReportstatistics08(String industry1, String industry2, String industry3, String financialReportingYear);
	
	//行业内比较：现金流量比较
	public ArrayList<ReportSummaryFormated> getIndustryReportstatistics09(String industry1, String industry2, String industry3, String financialReportingYear);
	
}
