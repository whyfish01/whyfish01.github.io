package analys.servlet.summary;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import report.bean.entity.*;
import report.bean.daolmp.*;
import report.bean.common.*;
import report.bean.entity.PageBean;
import java.util.List;

public class QueryIndicator extends HttpServlet {

	private static final long serialVersionUID = 1L;
	public void init(ServletConfig config) throws ServletException{
		super.init(config);									
		}
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setCharacterEncoding("utf-8");
    	HttpSession session=request.getSession();
    	
    	//获取JSP页面录入的值
    	String indicatorName = request.getParameter("indicatorName");
    	String indicatorCategories = request.getParameter("indicatorCategories");
    	
    	
    	
    	//创建DaoImp对象实例
    	IndexManageDaoImp imdi = new IndexManageDaoImp();
    	List<Indicator> idList= imdi.QueryIndicator(indicatorName,indicatorCategories);
    	request.setAttribute("idList", idList);
    	
    	
    	
    	//获取当前页数
    	Integer pageIndex=(Integer)session.getAttribute("pageIndex");
    	String prevPage= request.getParameter("prevPage");
    	String nextPage= request.getParameter("nextPage");
    	
    	//初始化翻页参数
    	PageBean pb=new PageBean();
    	int totalPages;								//总页数
    	int pageSize=pb.getPageSize();				//每页显示记录数
    	int totalCounts = 0;						//总记录数
    	int startRows;								//起始行
    	int endRows;								//结束行
    	Page pg= new Page();
    	
    	//计算总记录数
    	try {
    		totalCounts = imdi.getIndicatorCount(indicatorName,indicatorCategories);
    		
    	} catch (SQLException e) {
    		// TODO Auto-generated catch block
    		e.printStackTrace();
    	}
    	
    	//计算总页数
    	totalPages=pg.getTotalPages(totalCounts, pageSize);
    	
    	//获取当前页面，并处理翻页操作
    	if(pageIndex==null) {
    		pageIndex=1;
    	}else {
    		pageIndex=pg.getPageIndex(prevPage, nextPage, pageIndex, totalPages);
    	}
    	//更新当前页数
    	session.setAttribute("pageIndex", pageIndex);
    	System.out.print(pageIndex);
    	    	
    	//计算起始行和结束行
    	startRows=pg.getStartRows(pageIndex, pageSize);
    	endRows=pg.getEndRows(pageIndex, pageSize, totalCounts);
    	    	
    	//存储页码数据
    	pb.setTotalCounts(totalCounts);
    	pb.setStartRows(startRows);
    	pb.setEndRows(endRows);
    	pb.setTotalPages(totalPages);
    	pb.setPageIndex(pageIndex);
    	session.setAttribute("pb", pb);
    			
    	//返回页面
    	RequestDispatcher dispatcher=request.getRequestDispatcher("analysisStatisticsAdmin.jsp?page=pageIndex");
		dispatcher.forward(request, response);

    	
    }
    
}
