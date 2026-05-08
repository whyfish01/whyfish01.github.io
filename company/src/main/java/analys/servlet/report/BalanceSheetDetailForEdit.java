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

public class BalanceSheetDetailForEdit extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void init(ServletConfig config) throws ServletException{
		super.init(config);									
		}
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setCharacterEncoding("utf-8");
    	BalanceSheet bs=new BalanceSheet();
    	request.setAttribute("bs", bs);
    	
    	//获取JSP页面的值
    	String financialReportingNo=request.getParameter("financialReportingNo");
    	//System.out.print(financialReportingNo);
    	
    	ReportDaoImp rdi=new ReportDaoImp();
    	List<BalanceSheetFormated> hdList=rdi.getReportHead(financialReportingNo);
    	List<BalanceSheetFormated> bsList=rdi.getBalanceSheet(financialReportingNo);
    	request.setAttribute("hdList", hdList);
    	request.setAttribute("bsList", bsList);
    	
    	RequestDispatcher dispatcher=request.getRequestDispatcher("financialReportEdit.jsp");
		dispatcher.forward(request, response);
    	
    	
    }
}