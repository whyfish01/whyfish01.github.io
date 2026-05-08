package analys.servlet.industry;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import report.bean.entity.ReportSummaryFormated;
import report.bean.common.DataValidator;
import report.bean.daolmp.*;

public class GetIndustryReportstatistics02 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void init(ServletConfig config) throws ServletException{
		super.init(config);									
		}
	
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setCharacterEncoding("utf-8");
    	IndustryAnalysisDaoImp iadi = new IndustryAnalysisDaoImp();
    	
    	//获取页面查询条件
    	String industry1 = request.getParameter("industry1");
    	String industry2 = request.getParameter("industry2");
    	String industry3 = request.getParameter("industry3");
    	String financialReportingYear = request.getParameter("financialReportingYear");
    	
    	DataValidator dl=new DataValidator();
    	
    	@SuppressWarnings("static-access")
		boolean industry1IsNull=dl.isNullOrEmpty(industry1);
    	@SuppressWarnings("static-access")
		boolean financialReportingYearIsNull=dl.isNullOrEmpty(financialReportingYear);
    	if(industry1IsNull) {
            // 如果为空
            request.setAttribute("a", "查询失败：一级行业不能为空");
        } else if(financialReportingYearIsNull){
        	// 如果为空
            request.setAttribute("a", "查询失败：财报年份不能为空");
        } else {
        	List<ReportSummaryFormated> rsfList = iadi.getIndustryReportstatistics02(industry1, industry2, industry3, financialReportingYear);
        	request.setAttribute("rsfList", rsfList);
        }
    	
    	RequestDispatcher dispatcher=request.getRequestDispatcher("comparisonWithinIndustry02.jsp");
		dispatcher.forward(request, response);
	}

}
