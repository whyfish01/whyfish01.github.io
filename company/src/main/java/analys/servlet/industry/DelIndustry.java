package analys.servlet.industry;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import report.bean.entity.Industry;
import report.bean.daolmp.IndustryDaoImp;


public class DelIndustry extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void init(ServletConfig config) throws ServletException{
		super.init(config);									
		}
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setCharacterEncoding("utf-8");
    	Industry ind=new Industry();
    	request.setAttribute("ind", ind);
    	
    	//获取JSP页面录入的值
    	String id=request.getParameter("indId");
    	
    	//创建DaoImp对象实例
    	IndustryDaoImp idi=new IndustryDaoImp();
    	boolean delResult =idi.delIndustry(id);
    	
    	if(delResult) {
            // 添加成功，设置成功消息
            request.setAttribute("a", "删除成功!");
        } else {
            // 添加失败，设置失败消息
            request.setAttribute("a", "删除失败!");
        }
    	//返回页面
		RequestDispatcher dispatcher=request.getRequestDispatcher("industryQuery.jsp");
		dispatcher.forward(request, response);
    }
}
