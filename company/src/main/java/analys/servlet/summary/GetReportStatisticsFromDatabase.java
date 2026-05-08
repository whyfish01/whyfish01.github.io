package analys.servlet.summary;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import report.bean.daolmp.IndexManageDaoImp;
import report.bean.entity.ReportSummaryFormated;

public class GetReportStatisticsFromDatabase extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	public void init(ServletConfig config) throws ServletException{
		super.init(config);									
		}
	
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setCharacterEncoding("utf-8");
    	ReportSummaryFormated rsf=new ReportSummaryFormated();
    	request.setAttribute("rsf", rsf);
    	IndexManageDaoImp imda=new IndexManageDaoImp();
    	
    	//从页面获取数据
    	String AShareCode = request.getParameter("AShareCode");
    	String financialReportingYear = request.getParameter("financialReportingYear");
    	
    	List<ReportSummaryFormated> rsfList = imda.getReportstatistics(AShareCode,financialReportingYear);
    	request.setAttribute("rsfList", rsfList);
    	
    	RequestDispatcher dispatcher=request.getRequestDispatcher("financialReportAnalysisAdd.jsp");
		dispatcher.forward(request, response);
    	
    }
}
