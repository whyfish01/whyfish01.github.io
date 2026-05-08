package report.bean.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import report.bean.entity.*;
public interface IndexManageDao {

	//增加指标
	public boolean insertIndicator(Indicator id);
	
	//修改指标
	public boolean EditIndicator(Indicator id);
	
	//获取指标详细信息
	public ArrayList<Indicator> getIndicator(String indicatorID);
	
	//查询指标详细信息
	public ArrayList<Indicator> QueryIndicator(String indicatorName ,String indicatorCategories);
	
	//删除指标
	public boolean delIndicator(String indicatorID);
	
	//获取指标总数量
	public Integer getIndicatorCount(String indicatorName ,String indicatorCategories) throws SQLException;
	
	//指标确认，插入数据库
	public boolean insertReportstatistics(Reportsummary rsy);
	
	//获取单个企业某一财年的指标信息
	public ArrayList<ReportSummaryFormated> getReportstatistics(String AShareCode, String financialReportingYear);
	
	//获取单个企业最后五个财年内的指标信息
	public ArrayList<ReportSummaryFormated> getReportstatisticsForYears(String AShareCode);
	
	//获取单个企业最后五个财年内的指标信息(用于做图表)
	public ArrayList<Reportsummary> getReportstatisticsForChart(String AShareCode);
	
	//查询指标信息
	public ArrayList<ReportSummaryFormated> queryReportstatistics(String AShareCode ,String AShareName, String financialReportingYear, String totalAssetsFormated, String totalAssetsGrowthRateFormated, 
	String revenueGrowthRateFormated, String assetLiabilityRatioFormated, String dividendRateFormated, String grossMarginFormated, String netProfitGrowthRateFormated, String netProfitCashRatioFormated, String ROEFormated, String industry1, String industry2, String industry3, String region);
	
	//查询指标记录数
	public Integer getReportstatisticsCounts (String AShareCode ,String AShareName, String financialReportingYear, String totalAssetsFormated, String totalAssetsGrowthRateFormated, 
	String revenueGrowthRateFormated, String assetLiabilityRatioFormated, String dividendRateFormated, String grossMarginFormated, String netProfitGrowthRateFormated, String netProfitCashRatioFormated, String ROEFormated, String industry1, String industry2, String industry3, String region) throws SQLException;
	
	//删除指标记录
	public boolean delReportAnalysis(String AShareCode ,String financialReportingYear);
}
