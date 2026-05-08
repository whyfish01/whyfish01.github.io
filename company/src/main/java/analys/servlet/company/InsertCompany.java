package analys.servlet.company;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import report.bean.entity.*;
import report.bean.daolmp.*;
import report.bean.common.*;
import java.util.List;

public class InsertCompany extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void init(ServletConfig config) throws ServletException{
		super.init(config);									
		}
	
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setCharacterEncoding("utf-8");
    	Company cop=new Company();
    	request.setAttribute("cop", cop);
    	
    	//获取JSP页面录入的值

    	String companyName=request.getParameter("companyName");
    	String AShareName=request.getParameter("AShareName");
    	String AShareCode=request.getParameter("AShareCode");
    	String companyAddress=request.getParameter("companyAddress");
    	String region=request.getParameter("region");
    	String establishedDate=request.getParameter("establishedDate");
    	String listingType=request.getParameter("listingType");
    	String listingDate=request.getParameter("listingDate");
    	String registeredCapital=request.getParameter("registeredCapital");
    	String industry1=request.getParameter("industry1");
    	String industry2=request.getParameter("industry2");
    	String industry3=request.getParameter("industry3");
    	String businessScope=request.getParameter("businessScope");
    	String legalRepresentative=request.getParameter("legalRepresentative");
    	String createTime=CreateTime.createtime();
    	String updateTime=CreateTime.createtime();
    	
    	IndustryDaoImp idi=new IndustryDaoImp();
    	List<Industry> ind1List = idi.getIndustry1();
    	List<Industry> ind2List = idi.getIndustry2(industry1);
    	List<Industry> ind3List = idi.getIndustry3(industry2);
    	request.setAttribute("ind1List", ind1List);
    	request.setAttribute("ind2List", ind2List);
    	request.setAttribute("ind3List", ind3List);
    	
    	// 插入企业信息并获取插入结果
    	CompanyDaoImp cdi=new CompanyDaoImp();

    	DataValidator dl=new DataValidator();
    	
    	@SuppressWarnings("static-access")
		boolean companyNameIsNull=dl.isNullOrEmpty(companyName);
        @SuppressWarnings("static-access")
        boolean AShareNameIsNull=dl.isNullOrEmpty(AShareName);
        @SuppressWarnings("static-access")
        boolean AShareCodeIsNull=dl.isNullOrEmpty(AShareCode);
        @SuppressWarnings("static-access")
        boolean industry1IsNull=dl.isNullOrEmpty(industry1);
    	@SuppressWarnings("static-access")
        boolean industry2IsNull=dl.isNullOrEmpty(industry2);
    	@SuppressWarnings("static-access")
        boolean industry3IsNull=dl.isNullOrEmpty(industry3);
    	
    	 
        
        if(companyNameIsNull) {
            // 如果为空
            request.setAttribute("a", "添加失败：企业全称不能为空");
        } else if(AShareNameIsNull){
        	// 如果为空
            request.setAttribute("a", "添加失败：A股简称不能为空");
        } else if(AShareCodeIsNull) {
        	// 如果为空
        	request.setAttribute("a", "添加失败：A股代码不能为空");
    	} else if(industry1IsNull) {
    		// 如果为空
        	request.setAttribute("a", "添加失败：一级行业不能为空");
    	} else if(industry2IsNull) {
    		// 如果为空
    		request.setAttribute("a", "添加失败：二级行业不能为空");
    	} else if(industry3IsNull) {
        	// 如果为空
    		request.setAttribute("a", "添加失败：三级行业不能为空");
    	} else {
    		cop.setCompanyName(companyName);
            cop.setAShareName(AShareName);
            cop.setAShareCode(AShareCode);
            cop.setCompanyAddress(companyAddress);
            cop.setRegion(region);
            cop.setEstablishedDate(establishedDate);
            cop.setListingType(listingType);
            cop.setListingDate(listingDate);
            cop.setRegisteredCapital(registeredCapital);
            cop.setPrimaryIndustry(industry1);
            cop.setSecondaryIndustry(industry2);
            cop.setThirdLevelIndustry(industry3);
            cop.setBusinessScope(businessScope);
            cop.setLegalRepresentative(legalRepresentative);
            cop.setCreateDateTime(createTime);
            cop.setUpDateTime(updateTime);
    		
    		// 插入数据库
    		boolean insertResult = cdi.insertCompany(cop);
        	if(insertResult) {
                // 添加成功，设置成功消息
                request.setAttribute("a", "添加成功!");
            } else {
                // 添加失败，设置失败消息
                request.setAttribute("a", "添加失败!");
            }
        }
        
        
    	
		RequestDispatcher dispatcher=request.getRequestDispatcher("companyAdd.jsp");
		dispatcher.forward(request, response);
    }
}
