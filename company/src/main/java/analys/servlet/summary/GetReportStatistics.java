package analys.servlet.summary;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import report.bean.entity.*;
import report.bean.common.DataValidator;
import report.bean.daolmp.*;
import java.util.List;

public class GetReportStatistics extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void init(ServletConfig config) throws ServletException{
		super.init(config);									
		}
	
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setCharacterEncoding("utf-8");
    	Reportsummary ry=new Reportsummary();

    	AnalysisDaoImp adi=new AnalysisDaoImp();
    	
    	String AShareCode=request.getParameter("AShareCode");
    	String financialReportingYear=request.getParameter("financialReportingYear");
    	ry.setAShareCode(AShareCode);
    	ry.setFinancialReportingYear(financialReportingYear);
    	request.setAttribute("ry", ry);
    	
    	DataValidator dl=new DataValidator();
    	@SuppressWarnings("static-access")
    	boolean AShareCodeIsNull=dl.isNullOrEmpty(AShareCode);
    	@SuppressWarnings("static-access")
    	boolean financialReportingYearIsNull=dl.isNullOrEmpty(financialReportingYear);
    	
    	if(AShareCodeIsNull) {
            // 如果为空
            request.setAttribute("a", "查询失败：A股代码不能为空");
        } else if(financialReportingYearIsNull){
        	// 如果为空
            request.setAttribute("a", "查询失败：财报年份不能为空");
        } else {
    	
    	List<Company> copList= adi.getCompanyInfo(AShareCode);
    	List<ReportSummaryFormated> ryList1=adi.getTotalAssetsSituation(AShareCode, financialReportingYear);
    	List<ReportSummaryFormated> ryList1a=adi.getTotalAssetsSituation1(AShareCode, financialReportingYear);
    	List<ReportSummaryFormated> ryList2=adi.getAssetLiabilityRatio(AShareCode, financialReportingYear);
    	List<ReportSummaryFormated> ryList3=adi.getInterestBearingLiabilitiesAndMonetaryFunds(AShareCode, financialReportingYear);
    	List<ReportSummaryFormated> ryList4=adi.getQuasiMonetaryFunds(AShareCode, financialReportingYear);
    	List<ReportSummaryFormated> ryList5=adi.getAccountPayable(AShareCode, financialReportingYear);
    	List<ReportSummaryFormated> ryList6=adi.getFixedAssets(AShareCode, financialReportingYear);
    	List<ReportSummaryFormated> ryList7=adi.getInvestmentAssets(AShareCode, financialReportingYear);
    	List<ReportSummaryFormated> ryList8=adi.getOtherAssets(AShareCode, financialReportingYear);
    	List<ReportSummaryFormated> ryList9=adi.getEmployeeCompensation(AShareCode, financialReportingYear);
    	List<ReportSummaryFormated> ryList10=adi.getOperatingRevenueAndGrowth(AShareCode, financialReportingYear);
    	List<ReportSummaryFormated> ryList10a=adi.getOperatingRevenueAndGrowth1(AShareCode, financialReportingYear);
    	List<ReportSummaryFormated> ryList10b=adi.getOperatingRevenueAndGrowth2(AShareCode, financialReportingYear);
    	List<ReportSummaryFormated> ryList11=adi.getRiskPosedByOperatingIncomeComposition(AShareCode, financialReportingYear);
    	List<ReportSummaryFormated> ryList11a=adi.getRiskPosedByOperatingIncomeComposition1(AShareCode, financialReportingYear);
    	List<ReportSummaryFormated> ryList12=adi.getGrossMargin(AShareCode, financialReportingYear);
    	List<ReportSummaryFormated> ryList13=adi.getExpense(AShareCode, financialReportingYear);
    	List<ReportSummaryFormated> ryList14=adi.getMainOperatingProfitAndOperatingProfitMargin(AShareCode, financialReportingYear);
    	List<ReportSummaryFormated> ryList15=adi.getNetProfit(AShareCode, financialReportingYear);
    	List<ReportSummaryFormated> ryList15a=adi.getNetProfit1(AShareCode, financialReportingYear);
    	List<ReportSummaryFormated> ryList15b=adi.getNetProfit2(AShareCode, financialReportingYear);
    	List<ReportSummaryFormated> ryList16=adi.getNetProfitAttributableToShareholders(AShareCode, financialReportingYear);
    	List<ReportSummaryFormated> ryList17=adi.getNetCashFlowGeneratedFromOperatingActivities(AShareCode, financialReportingYear);
    	List<ReportSummaryFormated> ryList18=adi.getCashPaid(AShareCode, financialReportingYear);
    	List<ReportSummaryFormated> ryList19=adi.getDividendRate(AShareCode, financialReportingYear);
    	List<ReportSummaryFormated> ryList20=adi.getCompanyType(AShareCode, financialReportingYear);
    	List<ReportSummaryFormated> ryList20a=adi.getCompanyType1(AShareCode, financialReportingYear);
    	List<ReportSummaryFormated> ryList21=adi.getNetIncreaseInCashAndCashEquivalents(AShareCode, financialReportingYear);
    	
    	request.setAttribute("copList", copList);
    	request.setAttribute("ryList1", ryList1);
    	request.setAttribute("ryList1a", ryList1a);
    	request.setAttribute("ryList2", ryList2);
    	request.setAttribute("ryList3", ryList3);
    	request.setAttribute("ryList4", ryList4);
    	request.setAttribute("ryList5", ryList5);
    	request.setAttribute("ryList6", ryList6);
    	request.setAttribute("ryList7", ryList7);
    	request.setAttribute("ryList8", ryList8);
    	request.setAttribute("ryList9", ryList9);
    	request.setAttribute("ryList10", ryList10);
    	request.setAttribute("ryList10a", ryList10a);
    	request.setAttribute("ryList10b", ryList10b);
    	request.setAttribute("ryList11", ryList11);
    	request.setAttribute("ryList11a", ryList11a);
    	request.setAttribute("ryList12", ryList12);
    	request.setAttribute("ryList13", ryList13);
    	request.setAttribute("ryList14", ryList14);
    	request.setAttribute("ryList15", ryList15);
    	request.setAttribute("ryList15a", ryList15a);
    	request.setAttribute("ryList15b", ryList15b);
    	request.setAttribute("ryList16", ryList16);
    	request.setAttribute("ryList17", ryList17);
    	request.setAttribute("ryList18", ryList18);
    	request.setAttribute("ryList19", ryList19);
    	request.setAttribute("ryList20", ryList20);
    	request.setAttribute("ryList20a", ryList20a);
    	request.setAttribute("ryList21", ryList21);
    	
        }
    	RequestDispatcher dispatcher=request.getRequestDispatcher("reportAnalysisStatistics.jsp");
		dispatcher.forward(request, response);
    }
}