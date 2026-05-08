package analys.servlet.industry;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import java.util.ArrayList;
//import javax.servlet.http.HttpSession;

import report.bean.common.*;
import report.bean.entity.Industry;
import report.bean.daolmp.IndustryDaoImp;

public class InsertIndustry extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void init(ServletConfig config) throws ServletException{
		super.init(config);									
		}
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setCharacterEncoding("utf-8");
    	Industry ind=new Industry();
    	request.setAttribute("ind", ind);
    	
    	//获取JSP页面录入的值
    	String industryId = null;
		try {
			industryId = IndustryID.getID();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	String ind1=request.getParameter("industry1");
    	String ind2=request.getParameter("industry2");
    	String ind3=request.getParameter("industry3");
    	String createTime=CreateTime.createtime();
    	String updateTime=CreateTime.createtime();
    	
    	IndustryDaoImp idi=new IndustryDaoImp();
    	DataValidator dl=new DataValidator();
        // 插入行业信息并获取插入结果
        @SuppressWarnings("static-access")
		boolean isNull=dl.isNullOrEmpty(ind1);
        if(isNull) {
            // 如果为空
            request.setAttribute("a", "添加失败：一级行业不能为空");
        } else {
            // 插入数据库
        	boolean insertResult = idi.insertIndustry(industryId, ind1, ind2, ind3, createTime, updateTime);
        	if(insertResult) {
                // 添加成功，设置成功消息
                request.setAttribute("a", "添加成功!");
            } else {
                // 添加失败，设置失败消息
                request.setAttribute("a", "添加失败!");
            }
        }
        
        ind.setIndustryID(industryId);
    	ind.setIndustry1(ind1);
    	ind.setIndustry2(ind2);
    	ind.setIndustry3(ind3);
    	ind.setCreateTime(createTime);
    	ind.setUpdateTime(updateTime);
    	
		RequestDispatcher dispatcher=request.getRequestDispatcher("industryQuery.jsp");
		dispatcher.forward(request, response);
    	
    }
}
