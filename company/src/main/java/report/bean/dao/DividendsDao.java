package report.bean.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import report.bean.entity.*;

public interface DividendsDao {

	//获得企业总股本数据
	public ArrayList<BalanceSheetFormated> getequityFormated(String AShareCode, String financialReportingYear);
	
	//获得企业分红指标相关数据
	public ArrayList<ReportSummaryFormated> getDividendsInAnalysis(String AShareCode, String financialReportingYear);
	
	//插入分红信息
	public boolean InsertDividends(Dividends ds);
	
	//查询企业分红信息
	public ArrayList<DividendsFormated> QueryDividends(String AShareCode,String AShareName, String reportYear, String region, String industry1, String  industry2, String industry3);

	//获得企业分红信息记录数
	public Integer getDividendsCount(String AShareCode,String AShareName, String reportYear, String region, String industry1, String  industry2, String industry3);

	//插入投资信息
	public boolean InsertInvestment(Investment it);
	
	//查询投资信息
	public ArrayList<InvestmentFormated> QueryInvestment(String AShareCode,String AShareName, String reportYear);
	
	//查询投资记录数
	public Integer getInvestmentCount(String AShareCode,String AShareName, String reportYear);
	
	//获取指标最后一个序列号
	public int getMaxNumberFromDatabase() throws SQLException;
	
	//获取投资详细信息
	public ArrayList<InvestmentFormated> getInvestmentDetail(String budgetId);
	
	//删除投资信息
	public boolean delInvestment(String budgetId);
}
