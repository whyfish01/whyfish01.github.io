package report.bean.entity;

public class Company {
	String 
	AShareCode,					//A股代码
	companyName,				//公司名称
	AShareName,					//A股简称
	companyAddress,				//公司地址
	region,						//所属区域
	establishedDate,			//成立日期
	listingType,				//上市类型
	listingDate,				//上市日期
	registeredCapital,			//注册资本
	primaryIndustry,			//一级行业
	secondaryIndustry,			//二级行业
	thirdLevelIndustry,			//三级行业
	legalRepresentative,		//法定代表
	businessScope,				//经营范围
	createDateTime,			//创建时间
	upDateTime;				//修改时间
	
	public void setAShareCode(String AShareCode) {
		this.AShareCode=AShareCode;
	}
	
	public String getAShareCode() {
		return AShareCode;
	}
	
	public void setCompanyName(String companyName) {
		this.companyName=companyName;
	}
	
	public String getCompanyName() {
		return companyName;
	}
	
	public void setAShareName(String AShareName) {
		this.AShareName=AShareName;
	}
	
	public String getAShareName() {
		return AShareName;
	}
	
	public void setCompanyAddress(String companyAddress) {
		this.companyAddress=companyAddress;
	}
	
	public String getCompanyAddress() {
		return companyAddress;
	}
	
	public void setRegion(String region) {
		this.region=region;
	}
	
	public String getRegion() {
		return region;
	}
	
	public void setEstablishedDate(String establishedDate) {
		this.establishedDate=establishedDate;
	}
	
	public String getEstablishedDate() {
		return establishedDate;
	}
	
	public void setListingType(String listingType) {
		this.listingType=listingType;
	}
	
	public String getListingType() {
		return listingType;
	}
	
	public void setListingDate(String listingDate) {
		this.listingDate=listingDate;
	}
	
	public String getListingDate() {
		return listingDate;
	}
	
	public void setRegisteredCapital(String registeredCapital) {
		this.registeredCapital=registeredCapital;
	}
	
	public String getRegisteredCapital() {
		return registeredCapital;
	}
	
	public void setPrimaryIndustry(String primaryIndustry) {
		this.primaryIndustry=primaryIndustry;
	}
	
	public String getPrimaryIndustry() {
		return primaryIndustry;
	}
	
	public void setSecondaryIndustry(String secondaryIndustry) {
		this.secondaryIndustry=secondaryIndustry;
	}
	
	public String getSecondaryIndustry() {
		return secondaryIndustry;
	}
	
	public void setThirdLevelIndustry(String thirdLevelIndustry) {
		this.thirdLevelIndustry=thirdLevelIndustry;
	}
	
	public String getThirdLevelIndustry() {
		return thirdLevelIndustry;
	}

	public void setLegalRepresentative(String legalRepresentative) {
		this.legalRepresentative=legalRepresentative;
	}
	
	public String getLegalRepresentative() {
		return legalRepresentative;
	}

	public void setBusinessScope(String businessScope) {
		this.businessScope=businessScope;
	}
	
	public String getBusinessScope() {
		return businessScope;
	}

	public void setCreateDateTime(String createDateTime) {
		this.createDateTime=createDateTime;
	}
	
	public String getCreateDateTime() {
		return createDateTime;
	}
	
	public void setUpDateTime(String upDateTime) {
		this.upDateTime=upDateTime;
	}
	
	public String getUpDateTime() {
		return upDateTime;
	}
}
