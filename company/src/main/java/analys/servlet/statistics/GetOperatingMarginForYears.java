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


public class GetOperatingMarginForYears extends HttpServlet {
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
    	List<ReportAnalysis> anList= aadi.getReportAnalysisForCompany13(AShareCode);
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
    	
    	// 选择第一组需要的指标并存储在新的List中：四项费用
    	List<Double> chartData1 = new ArrayList<>();
    	for (Reportsummary ry : ryList) {
    		Double fourExpenses = ry.getFourExpenses();
    	    chartData1.add(fourExpenses);
    	    
    	}
    	request.setAttribute("chartData1", chartData1);
    	
    	// 选择第二组需要的指标并存储在新的List中：利润总额
    	List<Double> chartData2 = new ArrayList<>();
    	for (Reportsummary ry : ryList) {
    		Double totalProfit = ry.getTotalProfit();
    	    chartData2.add(totalProfit);
    	    
    	}
    	request.setAttribute("chartData2", chartData2);
    	
    	// 选择第三组需要的指标并存储在新的List中：主营利润
    	List<Double> chartData3 = new ArrayList<>();
    	for (Reportsummary ry : ryList) {
    		Double mainProfit = ry.getMainProfit();
    	    chartData3.add(mainProfit);
    	}
    	request.setAttribute("chartData3", chartData3);
    	
    	// 选择第四组需要的指标并存储在新的List中：主营利润率
    	List<Double> chartData4 = new ArrayList<>();
    	for (Reportsummary ry : ryList) {
    		Double mainProfitMargin = ry.getMainProfitMargin();
    	    chartData4.add(mainProfitMargin);
    	}
    	request.setAttribute("chartData4", chartData4);
    	
    	
    	// 选择第五组需要的指标并存储在新的List中：主营利润占利润总额比例
    	List<Double> chartData5 = new ArrayList<>();
    	for (Reportsummary ry : ryList) {
    		Double mainOperatingProfitToTotalProfit = ry.getMainOperatingProfitToTotalProfit();
    	    chartData5.add(mainOperatingProfitToTotalProfit);
    	}
    	request.setAttribute("chartData5", chartData5);
    	
    	// 选择第六组需要的指标并存储在新的List中：营业利润
    	List<Double> chartData6 = new ArrayList<>();
    	for (Reportsummary ry : ryList) {
    		Double operatingProfit = ry.getOperatingProfit();
    	    chartData6.add(operatingProfit);
    	}
    	request.setAttribute("chartData6", chartData6);
    	
    	// 选择第七组需要的指标并存储在新的List中：主营利润占营业利润比例
    	List<Double> chartData7 = new ArrayList<>();
    	for (Reportsummary ry : ryList) {
    		Double operatingMargin = ry.getOperatingMargin();
    	    chartData7.add(operatingMargin);
    	}
    	request.setAttribute("chartData7", chartData7);
    	
    	RequestDispatcher dispatcher=request.getRequestDispatcher("financialReportAnalysis13.jsp");
		dispatcher.forward(request, response);
	}

}
