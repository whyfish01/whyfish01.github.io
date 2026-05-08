package analys.servlet.report;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.List;
import report.bean.entity.*;

import report.bean.daolmp.ReportDaoImp;

public class IncomeStatementDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void init(ServletConfig config) throws ServletException{
		super.init(config);									
		}
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setCharacterEncoding("utf-8");
    	IncomeStatementFormated is=new IncomeStatementFormated();
    	request.setAttribute("is", is);
    	
    	//获取JSP页面的值
    	String financialReportingNo=request.getParameter("financialReportingNo");
    	
    	
    	ReportDaoImp rdi=new ReportDaoImp();
    	List<BalanceSheetFormated> hdList=rdi.getReportHead(financialReportingNo);
    	List<IncomeStatementFormated> isList=rdi.getIncomeStatement(financialReportingNo);
    	request.setAttribute("hdList", hdList);
    	request.setAttribute("isList", isList);
    	
    	
    	RequestDispatcher dispatcher=request.getRequestDispatcher("financialReportDetail1.jsp");
		dispatcher.forward(request, response);
    	
    	
    }
}