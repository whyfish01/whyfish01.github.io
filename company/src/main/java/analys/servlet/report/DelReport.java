package analys.servlet.report;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import report.bean.daolmp.ReportDaoImp;
import report.bean.entity.*;
 
@WebServlet("/DelReport")
public class DelReport extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void init(ServletConfig config) throws ServletException{
		super.init(config);									
		}
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setCharacterEncoding("utf-8");
    	BalanceSheet bs=new BalanceSheet();
    	IncomeStatement is=new IncomeStatement();
    	CashflowStatement cs=new CashflowStatement();
    	request.setAttribute("bs", bs);
    	request.setAttribute("is", is);
    	request.setAttribute("cs", cs);
    	
    	//获取页面传递的参数
    	String financialReportingNo=request.getParameter("financialReportingNo");
    	
    	//创建DaoImp对象实例
    	ReportDaoImp rdi=new ReportDaoImp();
    	boolean delResult =rdi.delReport(financialReportingNo);
    	
    	if(delResult) {
            // 添加成功，设置成功消息
            request.setAttribute("a", "删除成功!");
        } else {
            // 添加失败，设置失败消息
            request.setAttribute("a", "删除失败!");
        }
    	//返回页面
		RequestDispatcher dispatcher=request.getRequestDispatcher("financialReportAdmin.jsp");
		dispatcher.forward(request, response);
    }

}
