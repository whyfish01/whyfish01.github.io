package report.bean.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import report.bean.entity.*;

public interface ReportDao {
	public boolean insertBalanceSheet(BalanceSheet bs);
	
	public ArrayList<BalanceSheet> frHead();
	
	public boolean insertIncomeStatement(IncomeStatement is);
	
	public boolean insertCashflowStatement(CashflowStatement cs);
	
	public boolean insertCashflowSupplement(CashflowSupplement cfs);
	
	public int getMaxNumberFromDatabase() throws SQLException;
	
	public ArrayList<BalanceSheetFormated> getReportHead(String AShareCode,String AShareName,String financialReportingYear,String auditOpinion);
	public ArrayList<BalanceSheetFormated> getReportHead(String financialReportingNo);
	
	public ArrayList<BalanceSheetFormated> getBalanceSheet(String financialReportingNo);
	
	public ArrayList<IncomeStatementFormated> getIncomeStatement(String financialReportingNo);
	
	public ArrayList<CashflowStatementFormated> getCashflowStatement(String financialReportingNo);
	
	public ArrayList<CashflowSupplementFormated> getCashflowSupplement(String financialReportingNo);
	
	public Integer getReportCount(String AShareCode, String AShareName,
			String financialReportingYear,String auditOpinion) throws SQLException;
	
	public boolean delReport(String financialReportingNo);
	
	public boolean updateBalanceSheet(BalanceSheet bs);
	
	public boolean updateIncomeStatement(IncomeStatement is);
	
	public boolean updateCashflowStatement(CashflowStatement cs);
	
	public boolean updateCashflowSupplement(CashflowSupplement cfs);
	
}
