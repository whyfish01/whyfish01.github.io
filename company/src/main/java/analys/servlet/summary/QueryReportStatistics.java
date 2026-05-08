package analys.servlet.summary;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import report.bean.entity.*;
import report.bean.daolmp.*;
import report.bean.common.*;
import report.bean.entity.PageBean;

public class QueryReportStatistics extends HttpServlet {
private static final long serialVersionUID = 1L;
    
	public void init(ServletConfig config) throws ServletException{
		super.init(config);									
		}
	
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setCharacterEncoding("utf-8");
    	HttpSession session=request.getSession();
    	ReportSummaryFormated rsf=new ReportSummaryFormated();
    	request.setAttribute("rsf", rsf);
    	IndexManageDaoImp imda=new IndexManageDaoImp();
    	
    	//从页面获取数据
    	String AShareCode = request.getParameter("AShareCode");
    	String AShareName = request.getParameter("AShareName");
    	String financialReportingYear = request.getParameter("financialReportingYear");
    	String totalAssets = request.getParameter("totalAssets");
    	String totalAssetsGrowthRate = request.getParameter("totalAssetsGrowthRate");
    	String assetLiabilityRatio= request.getParameter("assetLiabilityRatio");
    	String revenueGrowthRate =request.getParameter("revenueGrowthRate");
    	String dividendRate= request.getParameter("dividendRate");
    	String grossMargin= request.getParameter("grossMargin");
    	String netProfitGrowthRate= request.getParameter("netProfitGrowthRate");
    	String netProfitCashRatio = request.getParameter("netProfitCashRatio");
    	String ROEFormated= request.getParameter("ROE");
    	String industry1= request.getParameter("industry1");
    	String industry2= request.getParameter("industry2");
    	String industry3= request.getParameter("industry3");
    	String region= request.getParameter("region");
    	
    	rsf.setAShareCode(AShareCode);
    	rsf.setAShareName(AShareName);
    	rsf.setFinancialReportingYear(financialReportingYear);
    	rsf.setTotalAssetsFormated(totalAssets);
    	rsf.setTotalAssetsGrowthRateFormated(totalAssetsGrowthRate);
    	rsf.setRevenueGrowthRateFormated(revenueGrowthRate);
    	rsf.setAssetLiabilityRatioFormated(assetLiabilityRatio);
    	rsf.setDividendRateFormated(dividendRate);
    	rsf.setGrossMarginFormated(grossMargin);
    	rsf.setNetProfitGrowthRateFormated(netProfitGrowthRate);
    	rsf.setNetProfitCashRatioFormated(netProfitCashRatio);
    	rsf.setROEFormated(ROEFormated);
    	rsf.setPrimaryIndustry(industry1);
    	rsf.setSecondaryIndustry(industry2);
    	rsf.setThirdLevelIndustry(industry3);
    	rsf.setRegion(region);
    	
    	List<ReportSummaryFormated> rsfQueryList = imda.queryReportstatistics(AShareCode ,AShareName, financialReportingYear, totalAssets, totalAssetsGrowthRate, 
				revenueGrowthRate, assetLiabilityRatio, dividendRate, grossMargin, netProfitGrowthRate, netProfitCashRatio,ROEFormated,industry1,industry2,industry3,region);
    	request.setAttribute("rsfQueryList", rsfQueryList);
    	//System.out.print("财年:"+rsf.getFinancialReportingYear());
    	
    	//获取当前页数
    	Integer pageIndex=(Integer)session.getAttribute("pageIndex");
    	String prevPage= request.getParameter("prevPage");
    	String nextPage= request.getParameter("nextPage");
    	
    	//初始化翻页参数
    	PageBean pb=new PageBean();
    	int totalPages;								//总页数
    	int pageSize=pb.getPageSize();				//每页显示记录数
    	int totalCounts = 0;						//总记录数
    	int startRows;								//起始行
    	int endRows;								//结束行
    	Page pg= new Page();
    	
    	//计算总记录数
    	try {
    		totalCounts = imda.getReportstatisticsCounts(AShareCode, AShareName, financialReportingYear, totalAssets, totalAssetsGrowthRate, revenueGrowthRate, 
    				assetLiabilityRatio, dividendRate, grossMargin, netProfitGrowthRate, netProfitCashRatio, ROEFormated, industry1, industry2, industry3,region);
    		
    	} catch (SQLException e) {
    		// TODO Auto-generated catch block
    		e.printStackTrace();
    	}
    	
    	//计算总页数
    	totalPages=pg.getTotalPages(totalCounts, pageSize);
    	
    	//获取当前页面，并处理翻页操作
    	if(pageIndex==null) {
    		pageIndex=1;
    	}else {
    		pageIndex=pg.getPageIndex(prevPage, nextPage, pageIndex, totalPages);
    	}
    	//更新当前页数
    	session.setAttribute("pageIndex", pageIndex);
    	System.out.print(pageIndex);
    	    	
    	//计算起始行和结束行
    	startRows=pg.getStartRows(pageIndex, pageSize);
    	endRows=pg.getEndRows(pageIndex, pageSize, totalCounts);
    	    	
    	//存储页码数据
    	pb.setTotalCounts(totalCounts);
    	pb.setStartRows(startRows);
    	pb.setEndRows(endRows);
    	pb.setTotalPages(totalPages);
    	pb.setPageIndex(pageIndex);
    	session.setAttribute("pb", pb);
    	
    	RequestDispatcher dispatcher=request.getRequestDispatcher("financialReportAnalysis.jsp");
		dispatcher.forward(request, response);
    }

}
