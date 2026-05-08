package analys.servlet.invest;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import report.bean.common.*;
import report.bean.daolmp.*;
import report.bean.entity.*;

public class InsertInvestment extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	public void init(ServletConfig config) throws ServletException{
		super.init(config);									
		}
	
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setCharacterEncoding("utf-8");
    	DividendsDaoImp ddi= new DividendsDaoImp();
    	
    	//获得页面信息
    	
    	String budgetId=null;
    	try {
    		budgetId = InvestID.getInvestID();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    	String AShareCode = request.getParameter("AShareCode");
    	String AShareName= request.getParameter("AShareName");
    	
    	
    	String reportYear_str = request.getParameter("reportYear");
    	int reportYear = Integer.parseInt(reportYear_str);
    	
    	String whetherToSell= request.getParameter("whetherToSell");
    	String sellTime= request.getParameter("sellTime");
    	String createDateTime=CreateTime.createtime();
    	
    	//买入股票单价
    	String unitPrice_str = request.getParameter("unitPrice");
    	double unitPrice;
    	if (unitPrice_str == null || unitPrice_str.isEmpty()) {
    		unitPrice = 0.00;
    	} else {
    		unitPrice = Double.parseDouble(unitPrice_str.replace(",", ""));
    	}
    	
    	//持股数量
    	String numberOfStocks_str = request.getParameter("numberOfStocks");
    	int numberOfStocks = Integer.parseInt(numberOfStocks_str);
    	
    	//买入总成本
    	String totalCost_str = request.getParameter("totalCost");
    	double totalCost;
    	if (totalCost_str == null || totalCost_str.isEmpty()) {
    		totalCost = 0.00;
    	} else {
    		totalCost = Double.parseDouble(totalCost_str.replace(",", ""));
    	}
    	
    	//每十股分红
    	String dividendEveryTenShares_str = request.getParameter("dividendEveryTenShares");
    	double dividendEveryTenShares;
    	if (dividendEveryTenShares_str == null || dividendEveryTenShares_str.isEmpty()) {
    		dividendEveryTenShares = 0.00;
    	} else {
    		dividendEveryTenShares = Double.parseDouble(dividendEveryTenShares_str.replace(",", ""));
    	}
    	
    	//分红总收益
    	String dividendIncome_str = request.getParameter("dividendIncome");
    	double dividendIncome;
    	if (dividendIncome_str == null || dividendIncome_str.isEmpty()) {
    		dividendIncome = 0.00;
    	} else {
    		dividendIncome = Double.parseDouble(dividendIncome_str.replace(",", ""));
    	}
    	
    	//股息率
    	String yield_str = request.getParameter("yield");
    	double yield;
    	if (yield_str == null || yield_str.isEmpty()) {
    		yield = 0.00;
    	} else {
    		yield = Double.parseDouble(yield_str.replace("%", ""))/100;
    	}
    	
    	//分红后总成本
    	String estimatedTotalCost_str = request.getParameter("estimatedTotalCost");
    	double estimatedTotalCost;
    	if (estimatedTotalCost_str == null || estimatedTotalCost_str.isEmpty()) {
    		estimatedTotalCost = 0.00;
    	} else {
    		estimatedTotalCost = Double.parseDouble(estimatedTotalCost_str.replace(",", ""));
    	}
    	
    	//分红后单价
    	String estimatedUnitPrice_str = request.getParameter("estimatedUnitPrice");
    	double estimatedUnitPrice;
    	if (estimatedUnitPrice_str == null || estimatedUnitPrice_str.isEmpty()) {
    		estimatedUnitPrice = 0.00;
    	} else {
    		estimatedUnitPrice = Double.parseDouble(estimatedUnitPrice_str.replace(",", ""));
    	}
    	
    	//投资标的当前股价
    	String currentUnitPrice_str = request.getParameter("currentUnitPrice");
    	double currentUnitPrice;
    	if (currentUnitPrice_str == null || currentUnitPrice_str.isEmpty()) {
    		currentUnitPrice = 0.00;
    	} else {
    		currentUnitPrice = Double.parseDouble(currentUnitPrice_str.replace(",", ""));
    	}
    	
    	//投资当前市值
    	String currentTotalCost_str = request.getParameter("currentTotalCost");
    	double currentTotalCost;
    	if (currentTotalCost_str == null || currentTotalCost_str.isEmpty()) {
    		currentTotalCost = 0.00;
    	} else {
    		currentTotalCost = Double.parseDouble(currentTotalCost_str.replace(",", ""));
    	}
    	
    	//公允价值变动收益
    	String incomeFromChangesInFairValue_str = request.getParameter("incomeFromChangesInFairValue");
    	double incomeFromChangesInFairValue;
    	if (incomeFromChangesInFairValue_str == null || incomeFromChangesInFairValue_str.isEmpty()) {
    		incomeFromChangesInFairValue = 0.00;
    	} else {
    		incomeFromChangesInFairValue = Double.parseDouble(incomeFromChangesInFairValue_str.replace(",", ""));
    	}
    	
    	//卖出数量
    	String sellNumbers_str = request.getParameter("sellNumbers");
    	int sellNumbers = Integer.parseInt(sellNumbers_str);
    	
    	//卖出价格
    	String sellPrice_str = request.getParameter("sellPrice");
    	double sellPrice;
    	if (sellPrice_str == null || sellPrice_str.isEmpty()) {
    		sellPrice = 0.00;
    	} else {
    		sellPrice = Double.parseDouble(sellPrice_str.replace(",", ""));
    	}
    	
    	//投资实际收益
    	String realReturn_str = request.getParameter("realReturn");
    	double realReturn;
    	if (realReturn_str == null || realReturn_str.isEmpty()) {
    		realReturn = 0.00;
    	} else {
    		realReturn = Double.parseDouble(realReturn_str.replace(",", ""));
    	}
    	
    	//实际收益率
    	String rateOfRealReturn_str = request.getParameter("rateOfRealReturn");
    	double rateOfRealReturn;
    	if (rateOfRealReturn_str == null || rateOfRealReturn_str.isEmpty()) {
    		rateOfRealReturn = 0.00;
    	} else {
    		rateOfRealReturn = Double.parseDouble(rateOfRealReturn_str.replace("%", ""))/100;
    	}
    	
    	Investment it = new Investment();
    	it.setBudgetId(budgetId);
    	it.setAShareCode(AShareCode);
    	it.setAShareName(AShareName);
    	it.setReportYear(reportYear);
    	it.setUnitPrice(unitPrice);
    	it.setNumberOfStocks(numberOfStocks);
    	it.setTotalCost(totalCost);
    	it.setDividendEveryTenShares(dividendEveryTenShares);
    	it.setDividendIncome(dividendIncome);
    	it.setYield(yield);
    	it.setEstimatedTotalCost(estimatedTotalCost);
    	it.setEstimatedUnitPrice(estimatedUnitPrice);
    	it.setCurrentTotalCost(currentTotalCost);
    	it.setCurrentUnitPrice(currentUnitPrice);
    	it.setIncomeFromChangesInFairValue(incomeFromChangesInFairValue);
    	it.setWhetherToSell(whetherToSell);
    	it.setSellTime(sellTime);
    	it.setSellNumbers(sellNumbers);
    	it.setSellPrice(sellPrice);
    	it.setRealReturn(realReturn);
    	it.setRateOfRealReturn(rateOfRealReturn);
    	it.setCreateDateTime(createDateTime);
    	
    	boolean insertResult = ddi.InsertInvestment(it);
    	if(insertResult) {
            // 添加成功，设置成功消息
            request.setAttribute("a", "添加成功!");
        } else {
            // 添加失败，设置失败消息
            request.setAttribute("a", "添加失败!");
        }
    	
    	RequestDispatcher dispatcher=request.getRequestDispatcher("investmentAdd.jsp");
		dispatcher.forward(request, response);
	}

}
