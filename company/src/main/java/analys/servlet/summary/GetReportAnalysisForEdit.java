package analys.servlet.summary;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import report.bean.daolmp.*;
import report.bean.entity.*;
public class GetReportAnalysisForEdit extends HttpServlet {
private static final long serialVersionUID = 1L;
    
	public void init(ServletConfig config) throws ServletException{
		super.init(config);									
		}
	
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	request.setCharacterEncoding("utf-8");
	ReportAnalysis ra= new ReportAnalysis();
	AnalysisAddDaoImp aadi= new AnalysisAddDaoImp();
	
	//获取页面信息
	String analysisId= request.getParameter("analysisId");
	String AShareCode= request.getParameter("AShareCode");
	String AShareName= request.getParameter("AShareName");
	Integer reportYear = Integer.parseInt(request.getParameter("reportYear"));
	
	ra.setAShareCode(AShareCode);
	ra.setAShareName(AShareName);
	ra.setReportYear(reportYear);
	ra.setAnalysisId(analysisId);
	request.setAttribute("ra", ra);
	
	List <ReportAnalysis> raList = aadi.getReportAnalysis(analysisId);
	request.setAttribute("raList", raList);
	
	RequestDispatcher dispatcher=request.getRequestDispatcher("financialReportAnalysisEdit.jsp");
	dispatcher.forward(request, response);
	}

}
