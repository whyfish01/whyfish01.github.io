package analys.servlet.summary;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import report.bean.entity.*;

public class GetReportAnalysisForAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	public void init(ServletConfig config) throws ServletException{
		super.init(config);									
		}
	
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	request.setCharacterEncoding("utf-8");
	ReportAnalysis ra= new ReportAnalysis();
	
	//获取页面信息
	String AShareCode= request.getParameter("AShareCode");
	String AShareName= request.getParameter("AShareName");
	Integer reportYear = Integer.parseInt(request.getParameter("reportYear"));
	
	ra.setAShareCode(AShareCode);
	ra.setAShareName(AShareName);
	ra.setReportYear(reportYear);
	request.setAttribute("ra", ra);
	
	
	RequestDispatcher dispatcher=request.getRequestDispatcher("financialReportAnalysisAdd.jsp");
	dispatcher.forward(request, response);
	
	}
}

