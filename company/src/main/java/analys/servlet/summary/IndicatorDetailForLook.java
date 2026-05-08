package analys.servlet.summary;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import report.bean.daolmp.IndexManageDaoImp;
import report.bean.entity.*;
import java.util.List;

public class IndicatorDetailForLook extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	public void init(ServletConfig config) throws ServletException{
		super.init(config);									
		}
	
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setCharacterEncoding("utf-8");
    	Indicator id=new Indicator();
    	request.setAttribute("id", id);
    	
    	//获取页面传递的参数
    	String indicatorID = request.getParameter("indicatorID");
    	
    	//根据传递参数获取数据库信息
    	if(indicatorID!=null) {
    		IndexManageDaoImp imdi =new IndexManageDaoImp();
    		List<Indicator> idList= imdi.getIndicator(indicatorID);
    		request.setAttribute("idList", idList);
    	}else {
    	    // 参数不是数字字符串，可以进行相应处理或者返回错误信息
    	    request.setAttribute("error", "Invalid indicatorName parameter");
    	}
    
		RequestDispatcher dispatcher=request.getRequestDispatcher("analysisStatisticsDetail.jsp");
		dispatcher.forward(request, response);
	}

}
