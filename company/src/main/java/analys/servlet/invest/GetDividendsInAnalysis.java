package analys.servlet.invest;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import report.bean.entity.*;
import report.bean.common.DataValidator;
import report.bean.daolmp.*;

public class GetDividendsInAnalysis extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void init(ServletConfig config) throws ServletException{
		super.init(config);									
		}
	
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setCharacterEncoding("utf-8");
    	
    	//获得页面查询条件
    	String AShareCode= request.getParameter("AShareCode");
    	String financialReportingYear= request.getParameter("financialReportingYear");
    	
    	DividendsDaoImp ddi= new DividendsDaoImp();
    	
    	DataValidator dl=new DataValidator();
    	
    	@SuppressWarnings("static-access")
		boolean AShareCodeIsNull=dl.isNullOrEmpty(AShareCode);
    	@SuppressWarnings("static-access")
		boolean financialReportingYearIsNull=dl.isNullOrEmpty(financialReportingYear);
    	if(AShareCodeIsNull) {
            // 如果为空
            request.setAttribute("a", "查询失败：A股代码不能为空");
        } else if(financialReportingYearIsNull){
        	// 如果为空
            request.setAttribute("a", "查询失败：财报年份不能为空");
        } else {
    	List <BalanceSheetFormated> bsfList= ddi.getequityFormated(AShareCode, financialReportingYear);
    	request.setAttribute("bsfList", bsfList);
    	
    	List <ReportSummaryFormated> rsfList=ddi.getDividendsInAnalysis(AShareCode, financialReportingYear);
    	request.setAttribute("rsfList", rsfList);
        }
    	
    	RequestDispatcher dispatcher=request.getRequestDispatcher("dividendsAdd.jsp");
		dispatcher.forward(request, response);
	}

}
