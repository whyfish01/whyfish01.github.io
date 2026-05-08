package report.bean.entity;


public class ReportAnalysis {

	String
	analysisId,					//分析指标ID
	AShareCode,					//A股代码
	AShareName,					//A股简称
	indicatorName,				//指标名称
	indicatorID,				//指标ID
	statisticsGrade,			//指标风险级别
	abnormalAnalysis,			//指标分析
	createDateTime,				//创建时间
	upDateTime;					//更新时间
	
	int reportYear;				//财报年份
	
	//A股代码
	public void setAnalysisId(String analysisId) {
		this.analysisId = analysisId;
	}
		
	public String getAnalysisId() {
		return analysisId;
	}
	
	//A股代码
	public void setAShareCode(String AShareCode) {
		this.AShareCode = AShareCode;
	}
	
	public String getAShareCode() {
		return AShareCode;
	}
	
	//A股简称
	public void setAShareName(String AShareName) {
		this.AShareName = AShareName;
	}
	
	public String getAShareName() {
		return AShareName;
	}
	
	//财报年份
	public void setReportYear(int reportYear) {
		this.reportYear = reportYear;
	}
	
	public int getReportYear() {
		return reportYear;
	}
	
	//分析指标名称
	public void setIndicatorName(String indicatorName) {
		this.indicatorName = indicatorName;
	}
	
	public String getIndicatorName() {
		return indicatorName;
	}
	
	//分析指标ID
	public void setIndicatorID(String indicatorID) {
		this.indicatorID = indicatorID;
	}
	
	public String getIndicatorID() {
		return indicatorID;
	}
	
	//指标风险级别
	public void setStatisticsGrade(String statisticsGrade) {
		this.statisticsGrade = statisticsGrade;
	}
	
	public String getStatisticsGrade() {
		return statisticsGrade;
	}
	
	//指标分析
	public void setAbnormalAnalysis(String abnormalAnalysis) {
		this.abnormalAnalysis = abnormalAnalysis;
	}
	
	public String getAbnormalAnalysis() {
		return abnormalAnalysis;
	}
	
	//创建时间
	public void setCreateDateTime(String  createDateTime) {
		this.createDateTime = createDateTime;
	}
	
	public String  getCreateDateTime() {
		return createDateTime;
	}
	
	//更新时间
	public void setUpDateTime(String  upDateTime) {
		this.upDateTime = upDateTime;
	}
	
	public String  getUpDateTime() {
		return upDateTime;
	}
	
	
	
}
