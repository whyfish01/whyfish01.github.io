package analys.servlet.summary;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import report.bean.common.*;
import report.bean.daolmp.*;
import report.bean.entity.*;

public class EditIndicator extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	public void init(ServletConfig config) throws ServletException{
		super.init(config);									
		}
	
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setCharacterEncoding("utf-8");
    	Indicator id=new Indicator();
    	request.setAttribute("id", id);
    	
    	//获取页面数据
    	String indicatorID= request.getParameter("indicatorID");
    	String indicatorCategories= request.getParameter("indicatorCategories");
    	String indicatorName= request.getParameter("indicatorName");
    	String scopeOperation=request.getParameter("scopeOperation");
    	String highQualityBoundaries=request.getParameter("highQualityBoundaries");
    	String indicatorDescription=request.getParameter("indicatorDescription");
    	String createTime=CreateTime.createtime();
    	
    	
    	IndexManageDaoImp imdi =new IndexManageDaoImp();
    	DataValidator dl=new DataValidator();
    	@SuppressWarnings("static-access")
		boolean indicatorNameIsNull=dl.isNullOrEmpty(indicatorName);
    	if(indicatorNameIsNull){
        	// 如果为空
            request.setAttribute("a", "修改失败：指标名称不能为空");
    	} else {
    		id.setIndicatorID(indicatorID);
    		id.setIndicatorCategories(indicatorCategories);
    		id.setIndicatorName(indicatorName);
    		id.setHighQualityBoundaries(highQualityBoundaries);
    		id.setScopeOperation(scopeOperation);
    		id.setIndicatorDescription(indicatorDescription);
    		id.setCreateDateTime(createTime);
    		request.setAttribute("id", id);
    		
    		// 插入数据库
    		boolean EditResult = imdi.EditIndicator(id);
    		if(EditResult) {
                // 添加成功，设置成功消息
    		
                request.setAttribute("a", "修改成功!");
            } else {
                // 添加失败，设置失败消息
                request.setAttribute("a", "修改失败!");
            }
    	}
    	
    	RequestDispatcher dispatcher=request.getRequestDispatcher("analysisStatisticsEdit.jsp");
		dispatcher.forward(request, response);
	}

}
