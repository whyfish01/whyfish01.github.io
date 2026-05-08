package analys.servlet.company;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import report.bean.entity.Company;
import report.bean.daolmp.CompanyDaoImp;

public class CompanyDetailForLook extends HttpServlet {
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
    	
    	//根据传递参数获取数据库信息
    	if (AShareCode != null && AShareCode.matches("\\d+")) {
    	    // 参数为数字字符串，继续处理
    	    CompanyDaoImp cpd = new CompanyDaoImp();
    	    List<Company> cpdList = cpd.queryCompany(AShareCode);
    	    request.setAttribute("cpdList", cpdList);
    	} else {
    	    // 参数不是数字字符串，可以进行相应处理或者返回错误信息
    	    request.setAttribute("error", "Invalid AShareCode parameter");
    	}
    
		RequestDispatcher dispatcher=request.getRequestDispatcher("companyDetail.jsp");
		dispatcher.forward(request, response);
    }
}