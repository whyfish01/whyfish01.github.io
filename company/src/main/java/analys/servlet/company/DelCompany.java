package analys.servlet.company;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import report.bean.daolmp.CompanyDaoImp;
import report.bean.entity.Company;

public class DelCompany extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void init(ServletConfig config) throws ServletException{
		super.init(config);									
		}
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setCharacterEncoding("utf-8");
    	Company cop=new Company();
    	request.setAttribute("cop", cop);
    	
    	//获取页面传递的参数
    	String AShareCode=request.getParameter("AShareCode");
    	
    	//创建DaoImp对象实例
    	CompanyDaoImp cdi=new CompanyDaoImp();
    	boolean delResult =cdi.delCompany(AShareCode);
    	
    	if(delResult) {
            // 添加成功，设置成功消息
            request.setAttribute("a", "删除成功!");
        } else {
            // 添加失败，设置失败消息
            request.setAttribute("a", "删除失败!");
        }
    	//返回页面
		RequestDispatcher dispatcher=request.getRequestDispatcher("companyAdmin.jsp");
		dispatcher.forward(request, response);
    }

}
