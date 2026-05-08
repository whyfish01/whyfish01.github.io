package analys.servlet.report;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;
import report.bean.entity.*;

import report.bean.daolmp.ReportDaoImp;

public class QueryReport extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void init(ServletConfig config) throws ServletException{
		super.init(config);									
		}
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setCharacterEncoding("utf-8");
    	HttpSession session=request.getSession();
    	
    	//获取JSP页面录入的值
    	String AShareCode=request.getParameter("AShareCode");
    	String AShareName=request.getParameter("AShareName");
    	String financialReportingYear=request.getParameter("financialReportingYear");
    	String auditOpinion=request.getParameter("auditOpinion");
    	
    	//获取当前页数
    	Integer pageIndex=(Integer)session.getAttribute("pageIndex");
    	
    	
    	//如果当前页数为null，则初始化为1
    	if(pageIndex==null) {
    		pageIndex=1;
    	}

    	//处理翻页操作
    	if(request.getParameter("prevPage")!=null){
    		pageIndex--;
	    }
    	else if(request.getParameter("nextPage")!=null){
    		pageIndex++;
	    }
    	
    	//初始化翻页参数
    	PageBean pb=new PageBean();
    	int totalPages=pb.getTotalPages();			//总页数
    	int pageSize=pb.getPageSize();		//每页显示记录数
    	int totalCounts = 0;		//总记录数
    	
    	ReportDaoImp rdi=new ReportDaoImp();
    	List <BalanceSheetFormated> bsList=rdi.getReportHead(AShareCode, AShareName, financialReportingYear, auditOpinion);
    	request.setAttribute("bsList", bsList);
    	
    	//计算总记录数
    	try {
    		totalCounts = rdi.getReportCount(AShareCode, AShareName, financialReportingYear, auditOpinion);
    	} catch (SQLException e) {
    		// TODO Auto-generated catch block
    		e.printStackTrace();
    	}
    	
    	//计算总页数
    	totalPages=totalCounts%pageSize==0?totalCounts / pageSize : totalCounts / pageSize + 1;
    	    	
    	//确保当前页数不超出范围
    	if(pageIndex<1) {
    	    pageIndex=1;
    	}else if (pageIndex>totalPages) {
    	    pageIndex=totalPages;
    	}
    	    	
    	//更新当前页数
    	session.setAttribute("pageIndex", pageIndex);
    	//System.out.print("Debug:PageIndex="+pageIndex);
    	    	
    	//计算起始行和结束行
    	int startRows = (pageIndex - 1) * pageSize;
    	if (startRows < 0) {
    	    startRows = 0;
    	}
    	startRows++; // 将起始行加1，从第一条数据开始

    	int endRows = pageIndex * pageSize;
    	if (endRows > totalCounts) {
    	    endRows = totalCounts;
    	}
    	    	
    	//存储页码数据
    	pb.setTotalCounts(totalCounts);
    	pb.setStartRows(startRows);
    	pb.setEndRows(endRows);
    	pb.setTotalPages(totalPages);
    	pb.setPageIndex(pageIndex);
    	session.setAttribute("pb", pb);
    			
    	//返回页面
    	RequestDispatcher dispatcher=request.getRequestDispatcher("financialReportAdmin.jsp?page=pageIndex");
		dispatcher.forward(request, response);
    }
}