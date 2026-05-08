package analys.servlet.invest;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import report.bean.daolmp.*;


public class DelInvestment extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void init(ServletConfig config) throws ServletException{
		super.init(config);									
		}
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setCharacterEncoding("utf-8");
    	
    	//获取JSP页面录入的值
    	String budgetId=request.getParameter("budgetId");
    	
    	//创建DaoImp对象实例
    	DividendsDaoImp ddi=new DividendsDaoImp();
    	boolean delResult =ddi.delInvestment(budgetId);
    	
    	if(delResult) {
            // 添加成功，设置成功消息
            request.setAttribute("a", "删除成功!");
        } else {
            // 添加失败，设置失败消息
            request.setAttribute("a", "删除失败!");
        }
    	//返回页面
		RequestDispatcher dispatcher=request.getRequestDispatcher("investmentAdmin.jsp");
		dispatcher.forward(request, response);
    }
}
