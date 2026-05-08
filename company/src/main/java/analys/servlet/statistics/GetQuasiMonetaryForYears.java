package analys.servlet.statistics;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import report.bean.daolmp.AnalysisAddDaoImp;
import report.bean.daolmp.IndexManageDaoImp;
import report.bean.entity.ReportAnalysis;
import report.bean.entity.ReportSummaryFormated;
import report.bean.entity.Reportsummary;


public class GetQuasiMonetaryForYears extends HttpServlet {
private static final long serialVersionUID = 1L;
    
	public void init(ServletConfig config) throws ServletException{
		super.init(config);									
		}
	
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setCharacterEncoding("utf-8");
    	ReportSummaryFormated rf = new ReportSummaryFormated();
    	IndexManageDaoImp imdi = new IndexManageDaoImp();
    	
    	//获取页面信息
    	String AShareCode = request.getParameter("AShareCode");
    	String AShareName = request.getParameter("AShareName");
    	
    	rf.setAShareCode(AShareCode);
    	rf.setAShareName(AShareName);
    	request.setAttribute("rf", rf);
    	
    	AnalysisAddDaoImp aadi= new AnalysisAddDaoImp();
    	List<ReportAnalysis> anList= aadi.getReportAnalysisForCompany04(AShareCode);
    	request.setAttribute("anList", anList);
    	
    	List<ReportSummaryFormated> rsfList = imdi.getReportstatisticsForYears(AShareCode);
    	request.setAttribute("rsfList", rsfList);
    	
    	//System.out.print("年份："+rf.getReportYear());
    	
    	List<Reportsummary> ryList = imdi.getReportstatisticsForChart(AShareCode);
    	request.setAttribute("ryList", ryList);

    	//选择年份存储在yearList中
    	List<Integer> yearList = new ArrayList<>();
    	for (Reportsummary ry : ryList) {
    	    int year = ry.getReportYear();
    	    yearList.add(year);
    	}
    	request.setAttribute("yearList", yearList);
    	
    	// 选择第一组需要的指标并存储在新的List中：准货币资金
    	List<Double> chartData1 = new ArrayList<>();
    	for (Reportsummary ry : ryList) {
    		Double quasiMonetary = ry.getQuasiMonetary();
    	    chartData1.add(quasiMonetary);
    	    
    	}
    	request.setAttribute("chartData1", chartData1);
    	
    	// 选择第二组需要的指标并存储在新的List中：准货币资金-短期有息负债
    	List<Double> chartData2 = new ArrayList<>();
    	for (Reportsummary ry : ryList) {
    		Double shortTermDebtRepaymentRisk = ry.getShortTermDebtRepaymentRisk();
    	    chartData2.add(shortTermDebtRepaymentRisk);
    	}
    	request.setAttribute("chartData2", chartData2);
    	
    	// 选择第三组需要的指标并存储在新的List中:准货币资金占总资产比率
    	List<Double> chartData3 = new ArrayList<>();
    	for (Reportsummary ry : ryList) {
    	    Double quasiMonetaryCapitalRatio = ry.getQuasiMonetaryCapitalRatio();
    	    chartData3.add(quasiMonetaryCapitalRatio);
    	    
    	}
    	request.setAttribute("chartData3", chartData3);
    	
    	RequestDispatcher dispatcher=request.getRequestDispatcher("financialReportAnalysis04.jsp");
		dispatcher.forward(request, response);
    }

}
