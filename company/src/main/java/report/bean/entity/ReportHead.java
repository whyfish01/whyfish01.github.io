package report.bean.entity;

public class ReportHead {
	String 
	financialReportingNo,					//财报编号：财报年份+六位数字编号
	AShareCode,								//A股代码
	financialReportingYear,					//财报年份
	auditOpinion;							//审计意见
	
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
		
	//财报年份
	public void setFinancialReportingYear(String financialReportingYear) {
		this.financialReportingYear=financialReportingYear;
	}
			
	public String getFinancialReportingYear() {
		return financialReportingYear;
	}		
		
		
	//审计意见
	public void setAuditOpinion(String auditOpinion) {
		this.auditOpinion=auditOpinion;
	}
		
	public String getAuditOpinion() {
		return auditOpinion;
	}
}
