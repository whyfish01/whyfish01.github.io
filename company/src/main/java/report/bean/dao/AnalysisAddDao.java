package report.bean.dao;

import java.util.ArrayList;

import report.bean.entity.*;

public interface AnalysisAddDao {


	//添加指标分析信息
	public boolean insertReportAnalysis(ReportAnalysis ra);
	
	//修改指标分析信息
	public boolean updateReportAnalysis(ReportAnalysis ra);
	
	//获得指标分析信息
	public ArrayList<ReportAnalysis> getReportAnalysis(String AShareCode, int reportYear);
	
	//获得单一指标分析信息
	public ArrayList<ReportAnalysis> getReportAnalysis(String analysisId);
	
	//删除指标分析信息
	public boolean delReportAnalysisForOneId(String analysisId);
	
	//获得企业指标分析信息：总资产情况
	public ArrayList<ReportAnalysis> getReportAnalysisForCompany01(String AShareCode);
	
	//获得企业指标分析信息：资产负债率情况
	public ArrayList<ReportAnalysis> getReportAnalysisForCompany02(String AShareCode);
	
	//获得企业指标分析信息：有息负债与货币资金
	public ArrayList<ReportAnalysis> getReportAnalysisForCompany03(String AShareCode);
	
	//获得企业指标分析信息：准货币资金
	public ArrayList<ReportAnalysis> getReportAnalysisForCompany04(String AShareCode);
	
	//获得企业指标分析信息：“应收预付”和“应付预收”
	public ArrayList<ReportAnalysis> getReportAnalysisForCompany05(String AShareCode);
	
	//获得企业指标分析信息：固定资产情况
	public ArrayList<ReportAnalysis> getReportAnalysisForCompany06(String AShareCode);
	
	//获得企业指标分析信息：投资类资产情况
	public ArrayList<ReportAnalysis> getReportAnalysisForCompany07(String AShareCode);
	
	//获得企业指标分析信息：其他资产情况
	public ArrayList<ReportAnalysis> getReportAnalysisForCompany08(String AShareCode);
	
	//获得企业指标分析信息：职工薪酬情况
	public ArrayList<ReportAnalysis> getReportAnalysisForCompany09(String AShareCode);
	
	//获得企业指标分析信息：营业收入及增长情况
	public ArrayList<ReportAnalysis> getReportAnalysisForCompany10(String AShareCode);
	
	//获得企业指标分析信息：毛利率情况
	public ArrayList<ReportAnalysis> getReportAnalysisForCompany11(String AShareCode);
	
	//获得企业指标分析信息：费用率情况
	public ArrayList<ReportAnalysis> getReportAnalysisForCompany12(String AShareCode);
	
	//获得企业指标分析信息：利润构成情况
	public ArrayList<ReportAnalysis> getReportAnalysisForCompany13(String AShareCode);
	
	//获得企业指标分析信息：净利润情况
	public ArrayList<ReportAnalysis> getReportAnalysisForCompany14(String AShareCode);
	
	//获得企业指标分析信息：归母净利润情况
	public ArrayList<ReportAnalysis> getReportAnalysisForCompany15(String AShareCode);
	
	//获得企业指标分析信息：现金流量情况
	public ArrayList<ReportAnalysis> getReportAnalysisForCompany16(String AShareCode);
	
	//获得企业指标分析信息：现金收支比较
	public ArrayList<ReportAnalysis> getReportAnalysisForCompany17(String AShareCode);
	
	//获得企业指标分析信息：分红情况
	public ArrayList<ReportAnalysis> getReportAnalysisForCompany18(String AShareCode);
	
	//获得企业指标分析信息：公司类型
	public ArrayList<ReportAnalysis> getReportAnalysisForCompany19(String AShareCode);
	
	//获得企业指标分析信息：现金及等价物净增额
	public ArrayList<ReportAnalysis> getReportAnalysisForCompany20(String AShareCode);
}
