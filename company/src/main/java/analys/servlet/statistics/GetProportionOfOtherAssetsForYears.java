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


public class GetProportionOfOtherAssetsForYears extends HttpServlet {
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
    	List<ReportAnalysis> anList= aadi.getReportAnalysisForCompany08(AShareCode);
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
    	
    	// 选择第一组需要的指标并存储在新的List中：商誉/总资产
    	List<Double> chartData1 = new ArrayList<>();
    	for (Reportsummary ry : ryList) {
    		Double goodwillProportion = ry.getGoodwillProportion();
    	    chartData1.add(goodwillProportion);
    	    
    	}
    	request.setAttribute("chartData1", chartData1);
    	
    	// 选择第二组需要的指标并存储在新的List中：无形资产/总资产
    	List<Double> chartData2 = new ArrayList<>();
    	for (Reportsummary ry : ryList) {
    		Double theProportionOfIntangibleAssets = ry.getTheProportionOfIntangibleAssets();
    	    chartData2.add(theProportionOfIntangibleAssets);
    	    
    	}
    	request.setAttribute("chartData2", chartData2);
    	
    	
    	// 选择第三组需要的指标并存储在新的List中：应收账款/总资产
    	List<Double> chartData3 = new ArrayList<>();
    	for (Reportsummary ry : ryList) {
    		Double accountsReceivablePercentageOfRevenue = ry.getAccountsReceivablePercentageOfRevenue();
    	    chartData3.add(accountsReceivablePercentageOfRevenue);
    	    
    	}
    	request.setAttribute("chartData3", chartData3);
    	
    	// 选择第四组需要的指标并存储在新的List中：预付款项/总资产
    	List<Double> chartData4 = new ArrayList<>();
    	for (Reportsummary ry : ryList) {
    		Double prepaymentsPercentageOfRevenue = ry.getPrepaymentsPercentageOfRevenue();
    	    chartData4.add(prepaymentsPercentageOfRevenue);
    	    
    	}
    	request.setAttribute("chartData4", chartData4);
    	
    	// 选择第五组需要的指标并存储在新的List中：其他应收款/总资产
    	List<Double> chartData5 = new ArrayList<>();
    	for (Reportsummary ry : ryList) {
    		Double otherReceivablesPercentageOfRevenue = ry.getOtherReceivablesPercentageOfRevenue();
    	    chartData5.add(otherReceivablesPercentageOfRevenue);
    	    
    	}
    	request.setAttribute("chartData5", chartData5);
    	
    	// 选择第六组需要的指标并存储在新的List中：存货/总资产
    	List<Double> chartData6 = new ArrayList<>();
    	for (Reportsummary ry : ryList) {
    		Double inventoryToRevenueRatio = ry.getInventoryToRevenueRatio();
    	    chartData6.add(inventoryToRevenueRatio);
    	    
    	}
    	request.setAttribute("chartData6", chartData6);
    	
    	// 选择第七组需要的指标并存储在新的List中：存货
    	List<Double> chartData7 = new ArrayList<>();
    	for (Reportsummary ry : ryList) {
    		Double inventory = ry.getInventory();
    	    chartData7.add(inventory);
    	    
    	}
    	request.setAttribute("chartData7", chartData7);
    	
    	// 选择第八组需要的指标并存储在新的List中：存货增长率
    	List<Double> chartData8 = new ArrayList<>();
    	for (Reportsummary ry : ryList) {
    		Double inventoryGrowthRate = ry.getInventoryGrowthRate();
    	    chartData8.add(inventoryGrowthRate);
    	    
    	}
    	request.setAttribute("chartData8", chartData8);
    	
    	RequestDispatcher dispatcher=request.getRequestDispatcher("financialReportAnalysis08.jsp");
		dispatcher.forward(request, response);
    }
}
