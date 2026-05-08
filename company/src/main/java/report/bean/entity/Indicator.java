package report.bean.entity;

public class Indicator {

	String 
	
	indicatorCategories,				//指标类别
	indicatorID,						//指标id
	indicatorName,						//指标名称
	scopeOperation,						//范围操作：大于、小于、等于
	indicatorDescription,				//指标说明
	createDateTime,
	highQualityBoundaries;				//优质边界
	
	//指标类别
	public void setIndicatorCategories(String indicatorCategories) {
		this.indicatorCategories=indicatorCategories;
	}
	
	public String getIndicatorCategories() {
		return indicatorCategories;
	}
	
	//指标id
	public void setIndicatorID(String indicatorID) {
		this.indicatorID=indicatorID;
	}
		
	public String getIndicatorID() {
		return indicatorID;
	}
	
	//指标名称
	public void setIndicatorName(String indicatorName) {
		this.indicatorName=indicatorName;
	}
		
	public String getIndicatorName() {
		return indicatorName;
	}
	
	//范围操作：大于、小于、等于
	public void setScopeOperation(String scopeOperation) {
		this.scopeOperation=scopeOperation;
	}
		
	public String getScopeOperation() {
		return scopeOperation;
	}
	
	//指标说明
	public void setIndicatorDescription(String indicatorDescription) {
		this.indicatorDescription=indicatorDescription;
	}
		
	public String getIndicatorDescription() {
		return indicatorDescription;
	}
	
	//创建时间
	public void setCreateDateTime(String createDateTime) {
		this.createDateTime=createDateTime;
	}
		
	public String getCreateDateTime() {
		return createDateTime;
	}
	
	//优质边界
	public void setHighQualityBoundaries(String highQualityBoundaries) {
		this.highQualityBoundaries=highQualityBoundaries;
	}
		
	public String getHighQualityBoundaries() {
		return highQualityBoundaries;
	}
}
