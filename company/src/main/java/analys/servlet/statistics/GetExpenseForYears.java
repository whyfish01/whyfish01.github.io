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

public class GetExpenseForYears extends HttpServlet {
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
    	List<ReportAnalysis> anList= aadi.getReportAnalysisForCompany12(AShareCode);
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
    	
    	// 选择第一组需要的指标并存储在新的List中：销售费用
    	List<Double> chartData1 = new ArrayList<>();
    	for (Reportsummary ry : ryList) {
    		Double sellingExpenses = ry.getSellingExpenses();
    	    chartData1.add(sellingExpenses);
    	    
    	}
    	request.setAttribute("chartData1", chartData1);
    	
    	// 选择第二组需要的指标并存储在新的List中：销售费用率
    	List<Double> chartData2 = new ArrayList<>();
    	for (Reportsummary ry : ryList) {
    		Double salesExpenseRate = ry.getSalesExpenseRate();
    	    chartData2.add(salesExpenseRate);
    	    
    	}
    	request.setAttribute("chartData2", chartData2);
    	
    	// 选择第三组需要的指标并存储在新的List中：管理费用
    	List<Double> chartData3 = new ArrayList<>();
    	for (Reportsummary ry : ryList) {
    		Double overhead = ry.getOverhead();
    	    chartData3.add(overhead);
    	}
    	request.setAttribute("chartData3", chartData3);
    	
    	// 选择第四组需要的指标并存储在新的List中：管理费用率
    	List<Double> chartData4 = new ArrayList<>();
    	for (Reportsummary ry : ryList) {
    		Double managementExpenseRate = ry.getManagementExpenseRate();
    	    chartData4.add(managementExpenseRate);
    	}
    	request.setAttribute("chartData4", chartData4);
    	
    	// 选择第五组需要的指标并存储在新的List中：研发费用
    	List<Double> chartData5 = new ArrayList<>();
    	for (Reportsummary ry : ryList) {
    		Double researchAndDevelopment = ry.getResearchAndDevelopment();
    	    chartData5.add(researchAndDevelopment);
    	}
    	request.setAttribute("chartData5", chartData5);
    	
    	// 选择第六组需要的指标并存储在新的List中：研发费用率
    	List<Double> chartData6 = new ArrayList<>();
    	for (Reportsummary ry : ryList) {
    		Double researchAndDevelopmentRate = ry.getResearchAndDevelopmentRate();
    	    chartData6.add(researchAndDevelopmentRate);
    	}
    	request.setAttribute("chartData6", chartData6);
    	
    	// 选择第七组需要的指标并存储在新的List中：费用率
    	List<Double> chartData7 = new ArrayList<>();
    	for (Reportsummary ry : ryList) {
    		Double expense = ry.getExpense();
    	    chartData7.add(expense);
    	}
    	request.setAttribute("chartData7", chartData7);
    	
    	// 选择第八组需要的指标并存储在新的List中：费用率占毛利率的比率
    	List<Double> chartData8 = new ArrayList<>();
    	for (Reportsummary ry : ryList) {
    		Double expense = ry.getExpense();
    	    chartData8.add(expense);
    	}
    	request.setAttribute("chartData8", chartData8);
    	
    	RequestDispatcher dispatcher=request.getRequestDispatcher("financialReportAnalysis12.jsp");
		dispatcher.forward(request, response);
   
	}

}
