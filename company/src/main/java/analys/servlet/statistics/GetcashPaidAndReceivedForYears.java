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


public class GetcashPaidAndReceivedForYears extends HttpServlet {
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
    	List<ReportAnalysis> anList= aadi.getReportAnalysisForCompany17(AShareCode);
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
    	
    	// 选择第一组需要的指标并存储在新的List中：经营活动产生的现金流量净额
    	List<Double> chartData1 = new ArrayList<>();
    	for (Reportsummary ry : ryList) {
    		Double netCashFlowFromOperating = ry.getNetCashFlowFromOperating();
    	    chartData1.add(netCashFlowFromOperating);
    	    
    	}
    	request.setAttribute("chartData1", chartData1);
    	
    	// 选择第二组需要的指标并存储在新的List中：购建固定无形和其他长期资产支付现金
    	List<Double> chartData2 = new ArrayList<>();
    	for (Reportsummary ry : ryList) {
    		Double cashPaidForPurchaseConstructionFixedIntangibleLongTermAssets = ry.getCashPaidForPurchaseConstructionFixedIntangibleLongTermAssets();
    	    chartData2.add(cashPaidForPurchaseConstructionFixedIntangibleLongTermAssets);
    	    
    	}
    	request.setAttribute("chartData2", chartData2);
    	
    	// 选择第三组需要的指标并存储在新的List中：处置固定无形和其他长期资产收回现金
    	List<Double> chartData3 = new ArrayList<>();
    	for (Reportsummary ry : ryList) {
    		Double netCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssets = ry.getNetCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssetss();
    	    chartData3.add(netCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssets);
    	}
    	request.setAttribute("chartData3", chartData3);
    	
    	// 选择第四组需要的指标并存储在新的List中：购建固产占经营活动产生的现金比
    	List<Double> chartData4 = new ArrayList<>();
    	for (Reportsummary ry : ryList) {
    		Double purchaseConstructionFixedIntangibleLongTermAssetsProportion = ry.getPurchaseConstructionFixedIntangibleLongTermAssetsProportion();
    	    chartData4.add(purchaseConstructionFixedIntangibleLongTermAssetsProportion);
    	}
    	request.setAttribute("chartData4", chartData4);
    	
    	
    	// 选择第五组需要的指标并存储在新的List中：处置固定资产、无形资产和其他长期资产收回的现金净额占购建资产支付的现金比
    	List<Double> chartData5 = new ArrayList<>();
    	for (Reportsummary ry : ryList) {
    		Double netCashReceivedFromDisposalProportionTopurchase = ry.getNetCashReceivedFromDisposalProportionTopurchase();
    	    chartData5.add(netCashReceivedFromDisposalProportionTopurchase);
    	}
    	request.setAttribute("chartData5", chartData5);
    
    	
    	RequestDispatcher dispatcher=request.getRequestDispatcher("financialReportAnalysis17.jsp");
		dispatcher.forward(request, response);
	}

}
