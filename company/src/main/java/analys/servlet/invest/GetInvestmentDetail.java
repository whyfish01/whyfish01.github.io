package analys.servlet.invest;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import report.bean.daolmp.*;
import report.bean.entity.*;
import java.util.List;

public class GetInvestmentDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	public void init(ServletConfig config) throws ServletException{
		super.init(config);									
		}
	
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setCharacterEncoding("utf-8");
    	InvestmentFormated ifd=new InvestmentFormated();
    	request.setAttribute("ifd", ifd);
    	
    	//获取页面传递的参数
    	String budgetId = request.getParameter("budgetId");
    	
    	//根据传递参数获取数据库信息
    	if(budgetId!=null) {
    		DividendsDaoImp ddi =new DividendsDaoImp();
    		List<InvestmentFormated> ifList= ddi.getInvestmentDetail(budgetId);
    		request.setAttribute("ifList", ifList);
    	}else {
    	    // 参数不是数字字符串，可以进行相应处理或者返回错误信息
    	    request.setAttribute("error", "Invalid indicatorName parameter");
    	}
    
		RequestDispatcher dispatcher=request.getRequestDispatcher("investmentDetail.jsp");
		dispatcher.forward(request, response);
	}

}
