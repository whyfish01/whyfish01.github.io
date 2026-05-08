package analys.servlet.summary;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import report.bean.common.CreateTime;
import report.bean.daolmp.*;
import report.bean.entity.*;


public class InsertReportAnalysis extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	public void init(ServletConfig config) throws ServletException{
		super.init(config);									
		}
	
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	request.setCharacterEncoding("utf-8");
	ReportAnalysis ra= new ReportAnalysis();
	AnalysisAddDaoImp aadi= new AnalysisAddDaoImp();
   
	//获取页面信息
	String AShareCode= request.getParameter("AShareCode");
	String AShareName= request.getParameter("AShareName");
	String reportYear_str=request.getParameter("reportYear");
	System.out.print(reportYear_str);
	Integer reportYear = Integer.parseInt(reportYear_str);
	
	String indicatorName = request.getParameter("indicatorName");
	String id=null;
	String name = null;
	// 检查是否存在指标名称
	if (indicatorName != null && !indicatorName.isEmpty()) {
	    if (indicatorName.length() >= 5) {
	        id = indicatorName.substring(0, 5); // 获取前五位作为ID
	        name = indicatorName.substring(5); // 获取剩余部分作为名称

	        
	    } else {
	        System.out.println("指标名称长度不足");
	    }
	} else {
	    System.out.println("未提供指标名称");
	}
	
	String analysisId = AShareCode+reportYear_str+id;
	String statisticsGrade = request.getParameter("statisticsGrade");
	String abnormalAnalysis =request.getParameter("abnormalAnalysis");
	
	//创建时间
	String createDateTime = CreateTime.createtime();
	String upDateTime = CreateTime.createtime();
	
	ra.setAnalysisId(analysisId);
	ra.setAShareCode(AShareCode);
	ra.setAShareName(AShareName);
	ra.setReportYear(reportYear);
	ra.setIndicatorName(name);
	ra.setIndicatorID(id);
	ra.setStatisticsGrade(statisticsGrade);
	ra.setAbnormalAnalysis(abnormalAnalysis);
	ra.setCreateDateTime(createDateTime);
	ra.setUpDateTime(upDateTime);
	
	// 打印
    System.out.println("AShareCode: " + ra.getAShareCode());
    System.out.println("AShareName: " + ra.getAShareName());
    System.out.println("reportYear: " + ra.getReportYear());
    System.out.println("indicatorName: " + ra.getIndicatorName());
    System.out.println("indicatorID: " + ra.getIndicatorID());
    System.out.println("statisticsGrade: " + ra.getStatisticsGrade());
    System.out.println("abnormalAnalysis: " + ra.getAbnormalAnalysis());
    System.out.println("createDateTime: " + ra.getCreateDateTime());
	
	// 插入数据库
	boolean insertResult = aadi.insertReportAnalysis(ra);
    if(insertResult) {
	// 添加成功，设置成功消息
        request.setAttribute("a", "添加成功!");
    } else {
        // 添加失败，设置失败消息
        request.setAttribute("a", "添加失败!");
    }

RequestDispatcher dispatcher=request.getRequestDispatcher("financialReportAnalysisAdmin.jsp");
dispatcher.forward(request, response);
	
	}

}
