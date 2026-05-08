package analys.servlet.summary;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import report.bean.daolmp.CompanyDaoImp;
import report.bean.daolmp.IndexManageDaoImp;
import report.bean.entity.Company;
import report.bean.entity.ReportSummaryFormated;


public class ReportAnalysisForLook extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void init(ServletConfig config) throws ServletException{
		super.init(config);									
		}
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setCharacterEncoding("utf-8");
    	ReportSummaryFormated rsf = new ReportSummaryFormated();
    	request.setAttribute("rsf", rsf);
    	
    	//获取JSP页面的值
    	String AShareCode = request.getParameter("AShareCode");
    	String financialReportingYear = request.getParameter("financialReportingYear");
    	

    	
    	IndexManageDaoImp imdi = new IndexManageDaoImp();
    	ArrayList<ReportSummaryFormated> rsfList = imdi.getReportstatistics(AShareCode, financialReportingYear);
    	request.setAttribute("rsfList", rsfList);
    	

    	
    	CompanyDaoImp cdi=new CompanyDaoImp();
    	List<Company> copList=cdi.queryCompany(AShareCode);
    	request.setAttribute("copList", copList);
    	
    	
    	//返回页面
    	RequestDispatcher dispatcher=request.getRequestDispatcher("reportAnalysisStatisticsDetail.jsp");
    	dispatcher.forward(request, response);
	}

}
