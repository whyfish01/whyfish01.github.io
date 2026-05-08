package analys.servlet.invest;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import report.bean.common.CreateTime;
import report.bean.daolmp.DividendsDaoImp;
import report.bean.entity.Dividends;


public class InsertDividends extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void init(ServletConfig config) throws ServletException{
		super.init(config);									
		}
	
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setCharacterEncoding("utf-8");
    	
    	//获得页面信息
    	
    	String AShareCode = request.getParameter("AShareCode");
    	String AShareName= request.getParameter("AShareName");
    	
    	String financialReportingYear = request.getParameter("financialReportingYear");
    	int reportYear = Integer.parseInt(financialReportingYear);
    	
    	String region = request.getParameter("region");
    	String industry1 = request.getParameter("industry1");
    	String industry2 = request.getParameter("industry2");
    	String industry3 = request.getParameter("industry3");
    	
    	//可分配利润
    	String distributiveProfits_str = request.getParameter("distributiveProfits");
    	double distributiveProfits;
    	if (distributiveProfits_str == null || distributiveProfits_str.isEmpty()) {
    		distributiveProfits = 0.00;
    	} else {
    		distributiveProfits = Double.parseDouble(distributiveProfits_str.replace(",", ""));
    	}
    	
    	//归属于母公司所有者的净利润
    	String netIncomeAttributableToShareholders_str= request.getParameter("netIncomeAttributableToShareholders");
    	double netIncomeAttributableToShareholders;
    	if (netIncomeAttributableToShareholders_str == null || netIncomeAttributableToShareholders_str.isEmpty()) {
    		netIncomeAttributableToShareholders = 0.00;
    	} else {
    		netIncomeAttributableToShareholders = Double.parseDouble(netIncomeAttributableToShareholders_str.replace(",", ""));
    	}
    	
    	//归母净利润增长率
    	String growthRateOfNetIncomeAttributableToShareholders_str= request.getParameter("growthRateOfNetIncomeAttributableToShareholders");
    	double growthRateOfNetIncomeAttributableToShareholders;
    	if (growthRateOfNetIncomeAttributableToShareholders_str == null || growthRateOfNetIncomeAttributableToShareholders_str.isEmpty()) {
    		growthRateOfNetIncomeAttributableToShareholders = 0.00;
    	} else {
    		growthRateOfNetIncomeAttributableToShareholders = Double.parseDouble(growthRateOfNetIncomeAttributableToShareholders_str.replace("%", ""))/100;
    	}
    	
    	//现金分红金额
    	String financialReportDividends_str=request.getParameter("financialReportDividends");
    	double financialReportDividends;
    	if (financialReportDividends_str == null || financialReportDividends_str.isEmpty()) {
    		financialReportDividends = 0.00;
    	} else {
    		financialReportDividends = Double.parseDouble(financialReportDividends_str.replace(",", ""));
    	}
    	
    	//分红率（股利支付率）
    	String dividendRate_str= request.getParameter("dividendRate");
    	double dividendRate;
    	if (dividendRate_str == null || dividendRate_str.isEmpty()) {
    		dividendRate = 0.00;
    	} else {
    		dividendRate = Double.parseDouble(dividendRate_str.replace("%", ""))/100;
    	}
    	
    	//每十股分红
    	String dividendEveryTenShares_str= request.getParameter("dividendEveryTenShares");
    	double dividendEveryTenShares;
    	if (dividendEveryTenShares_str == null || dividendEveryTenShares_str.isEmpty()) {
    		dividendEveryTenShares = 0.00;
    	} else {
    		dividendEveryTenShares = Double.parseDouble(dividendEveryTenShares_str.replace(",", ""));
    	}
    	
    	//股本
    	String equity_str= request.getParameter("equity");
    	double equity;
    	if (equity_str == null || equity_str.isEmpty()) {
    		equity = 0.00;
    	} else {
    		equity = Double.parseDouble(equity_str.replace(",", ""));
    	}
    	
    	String createTime=CreateTime.createtime();
    	
    	Dividends ds = new Dividends();
    	ds.setFinancialReportingNo(AShareCode+financialReportingYear);
    	ds.setAShareCode(AShareCode);
    	ds.setAShareName(AShareName);
    	ds.setPrimaryIndustry(industry1);
    	ds.setSecondaryIndustry(industry2);
    	ds.setThirdLevelIndustry(industry3);
    	ds.setRegion(region);
    	ds.setCreateDateTime(createTime);
    	ds.setEquity(equity);
    	ds.setNetIncomeAttributableToShareholders(netIncomeAttributableToShareholders);
    	ds.setGrowthRateOfNetIncomeAttributableToShareholders(growthRateOfNetIncomeAttributableToShareholders);
    	ds.setDistributiveProfits(distributiveProfits);
    	ds.setFinancialReportDividends(financialReportDividends);
    	ds.setDividendRate(dividendRate);
    	ds.setDividendEveryTenShares(dividendEveryTenShares);
    	ds.setReportYear(reportYear);
    	
    	DividendsDaoImp ddi = new DividendsDaoImp();
    	boolean insertResult= ddi.InsertDividends(ds);
    	if(insertResult) {
            // 添加成功，设置成功消息
            request.setAttribute("a", "添加成功!");
        } else {
            // 添加失败，设置失败消息
            request.setAttribute("a", "添加失败!");
        }
    	RequestDispatcher dispatcher=request.getRequestDispatcher("dividendsAdd.jsp");
    	dispatcher.forward(request, response);
    }
}

