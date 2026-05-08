package report.bean.daolmp;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;

import report.bean.dao.DividendsDao;
import report.bean.entity.*;
import report.bean.util.DataBase;

public class DividendsDaoImp extends DataBase implements DividendsDao{

	//获得企业总股本数据
	public ArrayList<BalanceSheetFormated> getequityFormated(String AShareCode, String financialReportingYear){
		ArrayList<BalanceSheetFormated> list= new ArrayList<>();
		String financialReportingNo=AShareCode+financialReportingYear;
		String sql="select * from fr_balancesheet where financialReportingNo=?";
		try(PreparedStatement statement=con.prepareStatement(sql)){
			statement.setString(1, financialReportingNo);
			
	        try (ResultSet rs = statement.executeQuery()) {
	        	
	        	while(rs.next()) {
	        	BalanceSheetFormated bsf= new BalanceSheetFormated();
	        	
	        	bsf.setFinancialReportingNo(rs.getString("financialReportingNo"));
	        	DecimalFormat df = new DecimalFormat("#,###.00");
	        	
	        	//总股本
            	double equity = rs.getDouble("equity");
            	if (equity == 0) {
            		bsf.setEquityFormated("");
                } else {
                	bsf.setEquityFormated(df.format(equity));
                }
            	
            	//未分配利润
            	double undistributedProfit = rs.getDouble("undistributedProfit");
            	if (undistributedProfit == 0) {
            		bsf.setUndistributedProfitFormated("");
                } else {
                	bsf.setUndistributedProfitFormated(df.format(undistributedProfit));
                }
            	
	        	list.add(bsf);   
            }
	        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return list;
}
	
	//获得企业分红指标相关数据
	public ArrayList<ReportSummaryFormated> getDividendsInAnalysis(String AShareCode, String financialReportingYear){
			ArrayList<ReportSummaryFormated> list= new ArrayList<>();
			String sql="select * from reportstatistics where AShareCode=? and financialReportingYear=?";
			try(PreparedStatement statement=con.prepareStatement(sql)){
				statement.setString(1, AShareCode);
		        statement.setString(2, financialReportingYear);
		        try (ResultSet rs = statement.executeQuery()) {
		        	
		        	while(rs.next()) {
		        	ReportSummaryFormated rsf= new ReportSummaryFormated();
		        	DecimalFormat df = new DecimalFormat("#,###.00");
	            	DecimalFormat df1 = new DecimalFormat("0.00%");		        	
		        	
		        	rsf.setAShareCode(rs.getString("AShareCode"));
		        	rsf.setAShareName(rs.getString("AShareName"));
		        	rsf.setReportYear(rs.getInt("reportYear"));
		        	rsf.setPrimaryIndustry(rs.getString("primaryIndustry"));
		        	rsf.setSecondaryIndustry(rs.getString("secondaryIndustry"));
		        	rsf.setThirdLevelIndustry(rs.getString("thirdLevelIndustry"));
		        	rsf.setRegion(rs.getString("region"));
		        	
		        	//归属于母公司所有者的净利润
	            	double netIncomeAttributableToShareholders = rs.getDouble("netIncomeAttributableToShareholders");
	            	if (netIncomeAttributableToShareholders == 0) {
	                    rsf.setNetIncomeAttributableToShareholdersFormated("");
	                } else {
	                	rsf.setNetIncomeAttributableToShareholdersFormated(df.format(netIncomeAttributableToShareholders));
	                }
	            	
	            	//归母净利润增长率
	            	double growthRateOfNetIncomeAttributableToShareholders = rs.getDouble("growthRateOfNetIncomeAttributableToShareholders");
	            	if (growthRateOfNetIncomeAttributableToShareholders == 0) {
	                    rsf.setGrowthRateOfNetIncomeAttributableToShareholdersFormated("");
	                } else {
	                	rsf.setGrowthRateOfNetIncomeAttributableToShareholdersFormated(df1.format(growthRateOfNetIncomeAttributableToShareholders));
	                }
	            	
	            	//现金分红金额
	            	double financialReportDividends = rs.getDouble("financialReportDividends");
	            	if (financialReportDividends == 0) {
	                    rsf.setFinancialReportDividendsFormated("");
	                } else {
	                	rsf.setFinancialReportDividendsFormated(df.format(financialReportDividends));
	                }
	            	
	            	//分红率（股利支付率）
	            	double dividendRate = rs.getDouble("dividendRate");
	            	if (dividendRate == 0) {
	                    rsf.setDividendRateFormated("");
	                } else {
	                	rsf.setDividendRateFormated(df1.format(dividendRate));
	                }

		        	list.add(rsf);  
		        	} 
	            }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }

	    return list;
	}
	
	
	//插入分红信息
		public boolean InsertDividends(Dividends ds) {
			
			String sql="insert into dividendsanalysis values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			
			try(PreparedStatement statement=con.prepareStatement(sql)){
				statement.setString(1, ds.getFinancialReportingNo());
				statement.setString(2, ds.getAShareCode());
				statement.setString(3, ds.getAShareName());
				statement.setInt(4, ds.getReportYear());
				statement.setString(5, ds.getPrimaryIndustry());
				statement.setString(6, ds.getSecondaryIndustry());
				statement.setString(7, ds.getThirdLevelIndustry());
				statement.setString(8, ds.getRegion());
				statement.setDouble(9, ds.getEquity());
				statement.setDouble(10, ds.getNetIncomeAttributableToShareholders());
				statement.setDouble(11, ds.getGrowthRateOfNetIncomeAttributableToShareholders());
				statement.setDouble(12, ds.getDistributiveProfits());
				statement.setDouble(13, ds.getFinancialReportDividends());
				statement.setDouble(14, ds.getDividendRate());
				statement.setDouble(15, ds.getDividendEveryTenShares());
				statement.setString(16, ds.getCreateDateTime());
				
				statement.executeUpdate();
				return true; // 插入成功，返回true
			
		} catch (SQLException e) {
		    e.printStackTrace();
		    return false; // 插入失败，返回false
		}
	}

		
		//查询企业分红信息
		public ArrayList<DividendsFormated> QueryDividends(String AShareCode,String AShareName, String reportYear, String region, String industry1, String  industry2, String industry3){
			ArrayList<DividendsFormated> list= new ArrayList<DividendsFormated>();
			
			String sql="select * from dividendsanalysis where 1=1";
			ArrayList<Object> params = new ArrayList<>();
			
			if (AShareCode != null && !AShareCode.isEmpty()) {
			    sql += " and AShareCode=?";
			    params.add(AShareCode);
			}
			
			if (AShareName != null && !AShareName.isEmpty()) {
				sql += " and AShareName like ?";
			    params.add("%" + AShareName + "%");
			}

			
			if (reportYear != null && !reportYear.isEmpty()) {
				sql += " and reportYear = ?";
			    params.add(reportYear);
			}
			
			if (region != null && !region.isEmpty()) {
				sql += " and region = ?";
			    params.add(region);
			}
			
			if (industry1 != null && !industry1.isEmpty()) {
				sql += " and primaryIndustry = ?";
			    params.add(industry1);
			}
			
			if (industry2 != null && !industry2.isEmpty()) {
				sql += " and secondaryIndustry = ?";
			    params.add(industry2);
			}
			
			if (industry3 != null && !industry3.isEmpty()) {
				sql += " and thirdLevelIndustry = ?";
			    params.add(industry3);
			}
			
			sql += " order by dividendEveryTenShares desc";
			
			try(PreparedStatement statement=con.prepareStatement(sql)){
				for (int i = 0; i < params.size(); i++) {
				    Object param = params.get(i);
				    if (param instanceof String) {
				    	statement.setString(i + 1, (String) param);
				    } else if (param instanceof Double) {
				    	statement.setDouble(i + 1, (Double) param);
				    }
				}
			
				try (ResultSet rs = statement.executeQuery()) {
		            while (rs.next()) {
		            	
		            	DividendsFormated dfd = new DividendsFormated();
		            	DecimalFormat df = new DecimalFormat("#,###.00");
		            	DecimalFormat df1 = new DecimalFormat("0.00%");
		            	
		            	dfd.setFinancialReportingNo(rs.getString("financialReportingNo"));
		            	dfd.setAShareCode(rs.getString("AShareCode"));
		            	dfd.setAShareName(rs.getString("AShareName"));
		            	dfd.setPrimaryIndustry(industry1);
		            	dfd.setSecondaryIndustry(industry2);
		            	dfd.setThirdLevelIndustry(industry3);
		            	dfd.setRegion(region);
		            	dfd.setReportYear(rs.getInt("reportYear"));
		            	dfd.setCreateDateTime(rs.getString("createDateTime"));
		            	
		            	//股本
		            	double equity = rs.getDouble("equity");
		            	if (equity == 0) {
		            		dfd.setEquityFormated("");
		                } else {
		                	dfd.setEquityFormated(df.format(equity));
		                }
		            	
		            	//归属于母公司所有者的净利润
		            	double netIncomeAttributableToShareholders = rs.getDouble("netIncomeAttributableToShareholders");
		            	if (netIncomeAttributableToShareholders == 0) {
		            		dfd.setNetIncomeAttributableToShareholdersFormated("");
		                } else {
		                	dfd.setNetIncomeAttributableToShareholdersFormated(df.format(netIncomeAttributableToShareholders));
		                }
		            	
		            	//归母净利润增长率
		            	double growthRateOfNetIncomeAttributableToShareholders = rs.getDouble("growthRateOfNetIncomeAttributableToShareholders");
		            	if (growthRateOfNetIncomeAttributableToShareholders == 0) {
		            		dfd.setGrowthRateOfNetIncomeAttributableToShareholdersFormated("");
		                } else {
		                	dfd.setGrowthRateOfNetIncomeAttributableToShareholdersFormated(df1.format(growthRateOfNetIncomeAttributableToShareholders));
		                }
		            	
		            	//可分配利润
		            	double distributiveProfits = rs.getDouble("distributiveProfits");
		            	if (distributiveProfits == 0) {
		            		dfd.setDistributiveProfitsFormated("");
		                } else {
		                	dfd.setDistributiveProfitsFormated(df.format(distributiveProfits));
		                }
		            	
		            	//现金分红金额
		            	double financialReportDividends = rs.getDouble("financialReportDividends");
		            	if (financialReportDividends == 0) {
		            		dfd.setFinancialReportDividendsFormated("");
		                } else {
		                	dfd.setFinancialReportDividendsFormated(df.format(financialReportDividends));
		                }
		            	
		            	//分红率（股利支付率）
		            	double dividendRate = rs.getDouble("dividendRate");
		            	if (dividendRate == 0) {
		            		dfd.setDividendRateFormated("");
		                } else {
		                	dfd.setDividendRateFormated(df1.format(dividendRate));
		                }
		            	
		            	//每十股分红
		            	double dividendEveryTenShares = rs.getDouble("dividendEveryTenShares");
		            	if (dividendEveryTenShares == 0) {
		            		dfd.setDividendEveryTenSharesFormated("");
		                } else {
		                	dfd.setDividendEveryTenSharesFormated(df.format(dividendEveryTenShares));
		                }
		            	
		            	list.add(dfd);
		            }
				}
			}catch (SQLException e) {
		        e.printStackTrace();
		    }

		    return list;
		    
		}
		
		//获得企业分红信息记录数
		public Integer getDividendsCount(String AShareCode,String AShareName, String reportYear, String region, String industry1, String  industry2, String industry3) {
			String sql="select count(*) from dividendsanalysis where 1=1";
			ArrayList<Object> params = new ArrayList<>();
			
			if (AShareCode != null && !AShareCode.isEmpty()) {
			    sql += " and AShareCode=?";
			    params.add(AShareCode);
			}
			
			if (AShareName != null && !AShareName.isEmpty()) {
				sql += " and AShareName like ?";
			    params.add("%" + AShareName + "%");
			}
			
			
			if (reportYear != null && !reportYear.isEmpty()) {
				sql += " and reportYear = ?";
			    params.add(reportYear);
			}
			
			if (region != null && !region.isEmpty()) {
				sql += " and region = ?";
			    params.add(region);
			}
			
			if (industry1 != null && !industry1.isEmpty()) {
				sql += " and primaryIndustry = ?";
			    params.add(industry1);
			}
			
			if (industry2 != null && !industry2.isEmpty()) {
				sql += " and secondaryIndustry = ?";
			    params.add(industry2);
			}
			
			if (industry3 != null && !industry3.isEmpty()) {
				sql += " and thirdLevelIndustry = ?";
			    params.add(industry3);
			}
			
			sql += " order by dividendEveryTenShares desc";
			
			int totalCounts=1;
			try(PreparedStatement statement=con.prepareStatement(sql)){
				for (int i = 0; i < params.size(); i++) {
				    Object param = params.get(i);
				    if (param instanceof String) {
				    	statement.setString(i + 1, (String) param);
				    } else if (param instanceof Double) {
				    	statement.setDouble(i + 1, (Double) param);
				    }
				}
			
				try (ResultSet rs = statement.executeQuery()) {
					while (rs.next()) {
		            	totalCounts=rs.getInt(1);
		            }
		        }
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
			return totalCounts;
		}
			
		//投资信息
		public boolean InsertInvestment(Investment it) {
			
			String sql="insert into investment values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			
			try(PreparedStatement statement=con.prepareStatement(sql)){
				statement.setString(1,it.getBudgetId());
				statement.setString(2,it.getAShareCode());
				statement.setString(3,it.getAShareName());
				statement.setInt(4, it.getReportYear());
				statement.setDouble(5, it.getUnitPrice());
				statement.setInt(6, it.getNumberOfStocks());
				statement.setDouble(7, it.getTotalCost());
				statement.setDouble(8, it.getDividendEveryTenShares());
				statement.setDouble(9, it.getDividendIncome());
				statement.setDouble(10, it.getYield());
				statement.setDouble(11, it.getEstimatedTotalCost());
				statement.setDouble(12, it.getEstimatedUnitPrice());
				statement.setDouble(13, it.getCurrentTotalCost());
				statement.setDouble(14, it.getCurrentUnitPrice());
				statement.setDouble(15, it.getIncomeFromChangesInFairValue());
				statement.setString(16, it.getWhetherToSell());
				statement.setString(17, it.getSellTime());
				statement.setInt(18, it.getSellNumbers());
				statement.setDouble(19, it.getSellPrice());
				statement.setDouble(20, it.getRealReturn());
				statement.setDouble(21, it.getRateOfRealReturn());
				statement.setString(22, it.getCreateDateTime());
				
				statement.executeUpdate();
				return true; // 插入成功，返回true
			
		} catch (SQLException e) {
		    e.printStackTrace();
		    return false; // 插入失败，返回false
		}
	}
		
		//查询投资信息
		public ArrayList<InvestmentFormated> QueryInvestment(String AShareCode,String AShareName, String reportYear){
			
			ArrayList<InvestmentFormated> list= new ArrayList<InvestmentFormated>();
			String sql="select * from investment where 1=1";
			ArrayList<Object> params = new ArrayList<>();
			
			if (AShareCode != null && !AShareCode.isEmpty()) {
			    sql += " and AShareCode=?";
			    params.add(AShareCode);
			}
			
			if (AShareName != null && !AShareName.isEmpty()) {
				sql += " and AShareName like ?";
			    params.add("%" + AShareName + "%");
			}
			
			if (reportYear != null && !reportYear.isEmpty()) {
				sql += " and reportYear = ?";
			    params.add(reportYear);
			}
			
			sql += " order by createDateTime desc";
			
			try(PreparedStatement statement=con.prepareStatement(sql)){
				for (int i = 0; i < params.size(); i++) {
				    Object param = params.get(i);
				    if (param instanceof String) {
				    	statement.setString(i + 1, (String) param);
				    } else if (param instanceof Double) {
				    	statement.setDouble(i + 1, (Double) param);
				    }
				}
			
				try (ResultSet rs = statement.executeQuery()) {
		            while (rs.next()) {
		            	
		            	InvestmentFormated ifd = new InvestmentFormated();
		            	DecimalFormat df = new DecimalFormat("#,###.00");
		            	DecimalFormat df1 = new DecimalFormat("0.00%");
		            	
		            	ifd.setBudgetId(rs.getString("budgetId"));
		            	ifd.setAShareCode(rs.getString("AShareCode"));
		            	ifd.setAShareName(rs.getString("AShareName"));
		            	ifd.setReportYear(rs.getInt("reportYear"));
		            	ifd.setCreateDateTime(rs.getString("createDateTime"));
		            	ifd.setNumberOfStocks(rs.getInt("numberOfStocks"));
		            	ifd.setWhetherToSell(rs.getString("whetherToSell"));
		            	ifd.setSellTime(rs.getString("sellTime"));
		            	ifd.setSellNumbers(rs.getInt("sellNumbers"));
		            	
		            	//买入股票单价
		            	double unitPrice = rs.getDouble("unitPrice");
		            	if (unitPrice == 0) {
		            		ifd.setUnitPriceFormated("");
		                } else {
		                	ifd.setUnitPriceFormated(df.format(unitPrice));
		                }
		            	
		            	//买入总成本
		            	double totalCost = rs.getDouble("totalCost");
		            	if (totalCost == 0) {
		            		ifd.setTotalCostFormated("");
		                } else {
		                	ifd.setTotalCostFormated(df.format(totalCost));
		                }
		            	
		            	//每十股分红
		            	double dividendEveryTenShares = rs.getDouble("dividendEveryTenShares");
		            	if (dividendEveryTenShares == 0) {
		            		ifd.setDividendEveryTenSharesFormated("");
		                } else {
		                	ifd.setDividendEveryTenSharesFormated(df.format(dividendEveryTenShares));
		                }
		            	
		            	//分红总收益
		            	double dividendIncome = rs.getDouble("dividendIncome");
		            	if (dividendIncome == 0) {
		            		ifd.setDividendIncomeFormated("");
		                } else {
		                	ifd.setDividendIncomeFormated(df.format(dividendIncome));
		                }
		            	
		            	//股息率
		            	double yield = rs.getDouble("yield");
		            	if (yield == 0) {
		            		ifd.setYieldFormated("");
		                } else {
		                	ifd.setYieldFormated(df1.format(yield));
		                }
		            	
		            	//分红后总成本
		            	double estimatedTotalCost = rs.getDouble("estimatedTotalCost");
		            	if (estimatedTotalCost == 0) {
		            		ifd.setEstimatedTotalCostFormated("");
		                } else {
		                	ifd.setEstimatedTotalCostFormated(df.format(estimatedTotalCost));
		                }
		            	
		            	//分红后单价
		            	double estimatedUnitPrice = rs.getDouble("estimatedUnitPrice");
		            	if (estimatedUnitPrice == 0) {
		            		ifd.setEstimatedUnitPriceFormated("");
		                } else {
		                	ifd.setEstimatedUnitPriceFormated(df.format(estimatedUnitPrice));
		                }
		            	
		            	//投资当前市值
		            	double currentTotalCost = rs.getDouble("currentTotalCost");
		            	if (currentTotalCost == 0) {
		            		ifd.setCurrentTotalCostFormated("");
		                } else {
		                	ifd.setCurrentTotalCostFormated(df.format(currentTotalCost));
		                }
		            	
		            	//投资标的当前股价
		            	double currentUnitPrice = rs.getDouble("currentUnitPrice");
		            	if (currentUnitPrice == 0) {
		            		ifd.setCurrentUnitPriceFormated("");
		                } else {
		                	ifd.setCurrentUnitPriceFormated(df.format(currentUnitPrice));
		                }
		            	
		            	//公允价值变动收益
		            	double incomeFromChangesInFairValue = rs.getDouble("incomeFromChangesInFairValue");
		            	if (incomeFromChangesInFairValue == 0) {
		            		ifd.setIncomeFromChangesInFairValueFormated("");
		                } else {
		                	ifd.setIncomeFromChangesInFairValueFormated(df.format(incomeFromChangesInFairValue));
		                }
		            	
		            	//卖出价格
		            	double sellPrice = rs.getDouble("sellPrice");
		            	if (sellPrice == 0) {
		            		ifd.setSellPriceFormated("0.00");
		                } else {
		                	ifd.setSellPriceFormated(df.format(sellPrice));
		                }
		            	
		            	
		            	//投资实际收益
		            	double realReturn = rs.getDouble("realReturn");
		            	if (realReturn == 0) {
		            		ifd.setRealReturnFormated("");
		                } else {
		                	ifd.setRealReturnFormated(df.format(realReturn));
		                }
		            	
		            	//实际收益率
		            	double rateOfRealReturn = rs.getDouble("rateOfRealReturn");
		            	if (rateOfRealReturn == 0) {
		            		ifd.setRateOfRealReturnFormated("");
		                } else {
		                	ifd.setRateOfRealReturnFormated(df1.format(rateOfRealReturn));
		                }
		            	
		            	list.add(ifd);
		            }
				}
			}catch (SQLException e) {
		        e.printStackTrace();
		    }

		    return list;
		    
		}
		
		//查询投资记录数
		public Integer getInvestmentCount(String AShareCode,String AShareName, String reportYear) {
			String sql="select count(*) from investment where 1=1";
			ArrayList<Object> params = new ArrayList<>();
			
			if (AShareCode != null && !AShareCode.isEmpty()) {
			    sql += " and AShareCode=?";
			    params.add(AShareCode);
			}
			
			if (AShareName != null && !AShareName.isEmpty()) {
				sql += " and AShareName like ?";
			    params.add("%" + AShareName + "%");
			}
			
			if (reportYear != null && !reportYear.isEmpty()) {
				sql += " and reportYear = ?";
			    params.add(reportYear);
			}
			
			sql += " order by createDateTime desc";
			
			int totalCounts=1;
			try(PreparedStatement statement=con.prepareStatement(sql)){
				for (int i = 0; i < params.size(); i++) {
				    Object param = params.get(i);
				    if (param instanceof String) {
				    	statement.setString(i + 1, (String) param);
				    } else if (param instanceof Double) {
				    	statement.setDouble(i + 1, (Double) param);
				    }
				}
			
				try (ResultSet rs = statement.executeQuery()) {
					while (rs.next()) {
		            	totalCounts=rs.getInt(1);
		            }
		        }
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
			return totalCounts;
		}
		
		//获取指标最后一个序列号
		public int getMaxNumberFromDatabase() throws SQLException {
		    int maxNumber = 0;
		    String sql = "SELECT MAX(CAST(SUBSTRING(budgetId, 7, 3) AS UNSIGNED)) AS maxnumber FROM investment;";
		    ResultSet rs = this.getResult(sql);

		    if (rs != null) {
		        if (rs.next()) {
		            maxNumber = rs.getInt("maxnumber");
		        } else {
		            // 如果结果集为空，保持maxNumber为初始值1
		            System.out.println("数据库中没有数据");
		        }
		    } else {
		        System.out.println("结果集为空");
		    }

		    return maxNumber;
		}
		
		//获取投资详细信息
		public ArrayList<InvestmentFormated> getInvestmentDetail(String budgetId){
			ArrayList<InvestmentFormated> list= new ArrayList<InvestmentFormated>();
			String sql="select * from investment where budgetId=?";
			
			try (PreparedStatement statement = con.prepareStatement(sql)) {
		        statement.setString(1, budgetId);

		        try (ResultSet rs = statement.executeQuery()) {
		            while (rs.next()) {
		            	InvestmentFormated ifd= new InvestmentFormated();
		            	DecimalFormat df = new DecimalFormat("#,###.00");
		            	DecimalFormat df1 = new DecimalFormat("0.00%");
		            	
		            	ifd.setBudgetId(rs.getString("budgetId"));
		            	ifd.setAShareCode(rs.getString("AShareCode"));
		            	ifd.setAShareName(rs.getString("AShareName"));
		            	ifd.setReportYear(rs.getInt("reportYear"));
		            	ifd.setCreateDateTime(rs.getString("createDateTime"));
		            	ifd.setNumberOfStocks(rs.getInt("numberOfStocks"));
		            	ifd.setWhetherToSell(rs.getString("whetherToSell"));
		            	ifd.setSellTime(rs.getString("sellTime"));
		            	ifd.setSellNumbers(rs.getInt("sellNumbers"));
		            	
		            	//买入股票单价
		            	double unitPrice = rs.getDouble("unitPrice");
		            	if (unitPrice == 0) {
		            		ifd.setUnitPriceFormated("");
		                } else {
		                	ifd.setUnitPriceFormated(df.format(unitPrice));
		                }
		            	
		            	//买入总成本
		            	double totalCost = rs.getDouble("totalCost");
		            	if (totalCost == 0) {
		            		ifd.setTotalCostFormated("");
		                } else {
		                	ifd.setTotalCostFormated(df.format(totalCost));
		                }
		            	
		            	//每十股分红
		            	double dividendEveryTenShares = rs.getDouble("dividendEveryTenShares");
		            	if (dividendEveryTenShares == 0) {
		            		ifd.setDividendEveryTenSharesFormated("");
		                } else {
		                	ifd.setDividendEveryTenSharesFormated(df.format(dividendEveryTenShares));
		                }
		            	
		            	//分红总收益
		            	double dividendIncome = rs.getDouble("dividendIncome");
		            	if (dividendIncome == 0) {
		            		ifd.setDividendIncomeFormated("");
		                } else {
		                	ifd.setDividendIncomeFormated(df.format(dividendIncome));
		                }
		            	
		            	//股息率
		            	double yield = rs.getDouble("yield");
		            	if (yield == 0) {
		            		ifd.setYieldFormated("");
		                } else {
		                	ifd.setYieldFormated(df1.format(yield));
		                }
		            	
		            	//分红后总成本
		            	double estimatedTotalCost = rs.getDouble("estimatedTotalCost");
		            	if (estimatedTotalCost == 0) {
		            		ifd.setEstimatedTotalCostFormated("");
		                } else {
		                	ifd.setEstimatedTotalCostFormated(df.format(estimatedTotalCost));
		                }
		            	
		            	//分红后单价
		            	double estimatedUnitPrice = rs.getDouble("estimatedUnitPrice");
		            	if (estimatedUnitPrice == 0) {
		            		ifd.setEstimatedUnitPriceFormated("");
		                } else {
		                	ifd.setEstimatedUnitPriceFormated(df.format(estimatedUnitPrice));
		                }
		            	
		            	//投资当前市值
		            	double currentTotalCost = rs.getDouble("currentTotalCost");
		            	if (currentTotalCost == 0) {
		            		ifd.setCurrentTotalCostFormated("");
		                } else {
		                	ifd.setCurrentTotalCostFormated(df.format(currentTotalCost));
		                }
		            	
		            	//投资标的当前股价
		            	double currentUnitPrice = rs.getDouble("currentUnitPrice");
		            	if (currentUnitPrice == 0) {
		            		ifd.setCurrentUnitPriceFormated("");
		                } else {
		                	ifd.setCurrentUnitPriceFormated(df.format(currentUnitPrice));
		                }
		            	
		            	//公允价值变动收益
		            	double incomeFromChangesInFairValue = rs.getDouble("incomeFromChangesInFairValue");
		            	if (incomeFromChangesInFairValue == 0) {
		            		ifd.setIncomeFromChangesInFairValueFormated("");
		                } else {
		                	ifd.setIncomeFromChangesInFairValueFormated(df.format(incomeFromChangesInFairValue));
		                }
		            	
		            	//卖出价格
		            	double sellPrice = rs.getDouble("sellPrice");
		            	if (sellPrice == 0) {
		            		ifd.setSellPriceFormated("0.00");
		                } else {
		                	ifd.setSellPriceFormated(df.format(sellPrice));
		                }
		            	
		            	//投资实际收益
		            	double realReturn = rs.getDouble("realReturn");
		            	if (realReturn == 0) {
		            		ifd.setRealReturnFormated("");
		                } else {
		                	ifd.setRealReturnFormated(df.format(realReturn));
		                }
		            	
		            	//实际收益率
		            	double rateOfRealReturn = rs.getDouble("rateOfRealReturn");
		            	if (rateOfRealReturn == 0) {
		            		ifd.setRateOfRealReturnFormated("");
		                } else {
		                	ifd.setRateOfRealReturnFormated(df1.format(rateOfRealReturn));
		                }
		            	
		            	list.add(ifd);
		                
		            }
		        }
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }

		    return list;
		}

		
		//删除投资信息
		public boolean delInvestment(String budgetId) {
			String sql="delete from investment where budgetId=?";
			try(PreparedStatement statement = con.prepareStatement(sql)) {
				statement.setNString(1, budgetId);
				statement.executeUpdate();
				return true; // 修改成功，返回true
		    } catch (SQLException e) {
		        e.printStackTrace();
		       
		        return false; // 修改失败，返回false
		    }
		}

}
