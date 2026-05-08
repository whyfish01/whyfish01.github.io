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


public class GetNetIncreaseInCashForYears extends HttpServlet {
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
    	List<ReportAnalysis> anList= aadi.getReportAnalysisForCompany20(AShareCode);
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
    	
    	// 选择第一组需要的指标并存储在新的List中：现金及现金等价物净增加额
    	List<Double> chartData1 = new ArrayList<>();
    	for (Reportsummary ry : ryList) {
    		Double netIncreaseInCashAndCashEquivalents = ry.getNetIncreaseInCashAndCashEquivalents();
    	    chartData1.add(netIncreaseInCashAndCashEquivalents);
    	    
    	}
    	request.setAttribute("chartData1", chartData1);
    	
    	// 选择第二组需要的指标并存储在新的List中：现金分红金额
    	List<Double> chartData2 = new ArrayList<>();
    	for (Reportsummary ry : ryList) {
    		Double financialReportDividends = ry.getFinancialReportDividends();
    	    chartData2.add(financialReportDividends);
   
    	}
    	request.setAttribute("chartData2", chartData2);
    	
    	// 选择第三组需要的指标并存储在新的List中：加现金分红的现金及现金等价物净增加额
    	List<Double> chartData3 = new ArrayList<>();
    	for (Reportsummary ry : ryList) {
    		Double netIncreaseInCashAndCashEquivalentsAddBonus = ry.getNetIncreaseInCashAndCashEquivalentsAddBonus();
    	    chartData3.add(netIncreaseInCashAndCashEquivalentsAddBonus);
    	}
    	request.setAttribute("chartData3", chartData3);
    	
    	// 选择第四组需要的指标并存储在新的List中：期末现金及现金等价物余额
    	List<Double> chartData4 = new ArrayList<>();
    	for (Reportsummary ry : ryList) {
    		Double closingBalanceOfCashAndCashEquivalents = ry.getClosingBalanceOfCashAndCashEquivalents();
    	    chartData4.add(closingBalanceOfCashAndCashEquivalents);
    	}
    	request.setAttribute("chartData4", chartData4);
    	
    	RequestDispatcher dispatcher=request.getRequestDispatcher("financialReportAnalysis20.jsp");
		dispatcher.forward(request, response);
	}

}
