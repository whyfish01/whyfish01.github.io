package analys.servlet.summary;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import report.bean.entity.*;
import report.bean.daolmp.*;
import report.bean.common.*;

public class InsertIndicator extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void init(ServletConfig config) throws ServletException{
		super.init(config);									
		}
	
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setCharacterEncoding("utf-8");
    	Indicator id=new Indicator();
    	request.setAttribute("id", id);
    	IndexManageDaoImp imdi = new IndexManageDaoImp();
    	
    	//获取JSP页面录入的值
    	
    	String indicatorID=null;
    	try {
    		indicatorID = IndicatorID.getIndicatorID();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	String indicatorCategories =request.getParameter("indicatorCategories");
    	String indicatorName= request.getParameter("indicatorName");
    	String highQualityBoundaries = request.getParameter("highQualityBoundaries");
    	String scopeOperation = request.getParameter("scopeOperation");
    	String indicatorDescription =request.getParameter("indicatorDescription");
    	String createTime=CreateTime.createtime();
    	
    	DataValidator dl=new DataValidator();
    	@SuppressWarnings("static-access")
		boolean indicatorCategoriesIsNull=dl.isNullOrEmpty(indicatorCategories);
    	@SuppressWarnings("static-access")
		boolean indicatorNameIsNull=dl.isNullOrEmpty(indicatorName);
    	if(indicatorCategoriesIsNull) {
            // 如果为空
            request.setAttribute("a", "添加失败：指标类别不能为空");
        } else if(indicatorNameIsNull){
        	// 如果为空
            request.setAttribute("a", "添加失败：指标名称不能为空");
    	} else {
    		id.setIndicatorID(indicatorID);
    		id.setIndicatorCategories(indicatorCategories);
    		id.setIndicatorName(indicatorName);
    		id.setHighQualityBoundaries(highQualityBoundaries);
    		id.setScopeOperation(scopeOperation);
    		id.setIndicatorDescription(indicatorDescription);
    		id.setCreateDateTime(createTime);
    	
    		boolean insertResult = imdi.insertIndicator(id);
    			if(insertResult) {
    				// 添加成功，设置成功消息
    				request.setAttribute("a", "添加成功!");
    			} else {
    				// 添加失败，设置失败消息
    				request.setAttribute("a", "添加失败!");
    			}
    	}
       
		RequestDispatcher dispatcher=request.getRequestDispatcher("analysisStatisticsAdd.jsp");
		dispatcher.forward(request, response);
    	
    }
}
