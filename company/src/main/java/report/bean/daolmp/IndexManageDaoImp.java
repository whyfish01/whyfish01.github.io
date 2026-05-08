package report.bean.daolmp;

import report.bean.dao.IndexManageDao;
import report.bean.entity.Indicator;
import report.bean.entity.ReportSummaryFormated;
import report.bean.entity.Reportsummary;
import report.bean.util.DataBase;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class IndexManageDaoImp extends DataBase implements IndexManageDao{

	//增加指标
	public boolean insertIndicator(Indicator id) {
		String sql="insert into indicatormaintenance values (?,?,?,?,?,?,?)";
		try(PreparedStatement statement=con.prepareStatement(sql)){
			statement.setString(1, id.getIndicatorCategories());
			statement.setString(2, id.getIndicatorID());
			statement.setString(3, id.getIndicatorName());
			statement.setString(4, id.getHighQualityBoundaries());
			statement.setString(5, id.getScopeOperation());
			statement.setString(6, id.getIndicatorDescription());
			statement.setString(7, id.getCreateDateTime());
			statement.executeUpdate();
			
			return true; // 插入成功，返回true
		
	} catch (SQLException e) {
	    e.printStackTrace();
	    return false; // 插入失败，返回false
	}
	}
	
	//修改指标
	public boolean EditIndicator(Indicator id) {
		String sql="update indicatormaintenance set indicatorID=?,indicatorCategories=?,indicatorName=?,highQualityBoundaries=?,scopeOperation=?,indicatorDescription=?,createDateTime=? where indicatorID='"+id.getIndicatorID()+"'";
		try(PreparedStatement statement=con.prepareStatement(sql)){
			statement.setString(1, id.getIndicatorID());
			statement.setString(2, id.getIndicatorCategories());
			statement.setString(3, id.getIndicatorName());
			statement.setString(4, id.getHighQualityBoundaries());
			statement.setString(5, id.getScopeOperation());
			statement.setString(6, id.getIndicatorDescription());
			statement.setString(7, id.getCreateDateTime());
			
			
			statement.executeUpdate();
	        return true; // 修改成功，返回true
	    } catch (SQLException e) {
	        e.printStackTrace();
	        return false; // 修改失败，返回false
	    }
		}
		
	//获取指标详细信息
	public ArrayList<Indicator> getIndicator(String indicatorID) {
	    ArrayList<Indicator> list = new ArrayList<>();
	    String sql = "select * from indicatormaintenance where indicatorID = ? order by createDateTime desc";

	    try (PreparedStatement statement = con.prepareStatement(sql)) {
	        statement.setString(1, indicatorID);

	        try (ResultSet rs = statement.executeQuery()) {
	            while (rs.next()) {
	                Indicator id = new Indicator();
	                id.setIndicatorID(rs.getString("indicatorID"));
	                id.setIndicatorCategories(rs.getString("indicatorCategories"));
	                id.setIndicatorName(rs.getString("indicatorName"));
	                id.setHighQualityBoundaries(rs.getString("highQualityBoundaries"));
	                id.setScopeOperation(rs.getString("scopeOperation"));
	                id.setIndicatorDescription(rs.getString("indicatorDescription"));
	                id.setCreateDateTime(rs.getString("createDateTime"));
	               
	                list.add(id);
	                
	            }
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }

	    return list;
	}
	
		//查询指标详细信息
		public ArrayList<Indicator> QueryIndicator(String indicatorName ,String indicatorCategories) {
		    ArrayList<Indicator> list = new ArrayList<>();
		    String sql = "select * from indicatormaintenance where indicatorName like ? and indicatorCategories like ? order by createDateTime desc";

		    try (PreparedStatement statement = con.prepareStatement(sql)) {
		        statement.setString(1, "%"+indicatorName+"%");
		        statement.setString(2, "%"+indicatorCategories+"%");

		        try (ResultSet rs = statement.executeQuery()) {
		            while (rs.next()) {
		                Indicator id = new Indicator();
		                id.setIndicatorID(rs.getString("indicatorID"));
		                id.setIndicatorCategories(rs.getString("indicatorCategories"));
		                id.setIndicatorName(rs.getString("indicatorName"));
		                id.setHighQualityBoundaries(rs.getString("highQualityBoundaries"));
		                id.setScopeOperation(rs.getString("scopeOperation"));
		                id.setIndicatorDescription(rs.getString("indicatorDescription"));
		                id.setCreateDateTime(rs.getString("createDateTime"));
		                list.add(id);
		               
		            }
		        }
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }

		    return list;
		}
		
	//删除指标
	public boolean delIndicator(String indicatorID) {
		String sql="delete from indicatormaintenance where indicatorID=?";
		try(PreparedStatement statement = con.prepareStatement(sql)) {
			statement.setNString(1, indicatorID);
			statement.executeUpdate();
			return true; // 修改成功，返回true
	    } catch (SQLException e) {
	        e.printStackTrace();
	       
	        return false; // 修改失败，返回false
	    }
	}
	
	//获取指标总数量
	public Integer getIndicatorCount(String indicatorName ,String indicatorCategories) throws SQLException{
		int totalCounts=1;
		String sql="select count(*) from indicatormaintenance where indicatorName like ? and indicatorCategories like ?";
		try (PreparedStatement statement = con.prepareStatement(sql)) {
	        statement.setString(1, "%"+indicatorName+"%");
	        statement.setString(2, "%"+indicatorCategories+"%");

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
		String sql = "SELECT MAX(CAST(SUBSTRING(indicatorID, 3, 3) AS UNSIGNED)) AS maxnumber FROM indicatormaintenance;";
		ResultSet rs=this.getResult(sql);
		if (rs.next()) {
            maxNumber = rs.getInt("maxnumber");
        }
		return maxNumber;
	}
	
	//指标确认，插入数据库
	public boolean insertReportstatistics(Reportsummary rsy) {
			
			String sql="insert into reportstatistics values ( ? , ? , ? , ? , ? , ? , ? ,?,?,?,?,?,?,?,?,?,?,?,?,"
					+ "?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"
					+ "?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"
					+ "?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			
			try(PreparedStatement statement=con.prepareStatement(sql)){
				
				statement.setString(1, rsy.getAShareCode());
				statement.setString(2, rsy.getAShareName());
				statement.setString(3, rsy.getFinancialReportingYear());
				statement.setDouble(4, rsy.getTotalAssets());
				statement.setDouble(5, rsy.getTotalAssetsGrowthRate());
				statement.setDouble(6, rsy.getTotalOwnersEquity());
				statement.setDouble(7, rsy.getEquityMultiplier());
				statement.setDouble(8, rsy.getTotalLiabilities());
				statement.setDouble(9, rsy.getAssetLiabilityRatio());
				statement.setDouble(10, rsy.getMonetaryCapital());
				statement.setDouble(11, rsy.getShortTermBorrowing());
				statement.setDouble(12, rsy.getNonCurrentLiabilitiesDueWithinOneYear());
				statement.setDouble(13, rsy.getLongTermLoan());
				statement.setDouble(14, rsy.getBondsPayable());
				statement.setDouble(15, rsy.getLongTermPayables());
				statement.setDouble(16, rsy.getInterestBearingLiabilities());
				statement.setDouble(17, rsy.getDebtRepaymentRisk());
				statement.setDouble(18, rsy.getTradingFinancialAssetsManagement());
				statement.setDouble(19, rsy.getOtherCurrentAssetsManagement());
				statement.setDouble(20, rsy.getQuasiMonetary());
				statement.setDouble(21, rsy.getShortTermForeignDebt());
				statement.setDouble(22, rsy.getShortTermDebtRepaymentRisk());
				statement.setDouble(23, rsy.getQuasiMonetaryCapitalRatio());
				statement.setDouble(24, rsy.getNotesPayable());
				statement.setDouble(25, rsy.getAccountsPayable());
				statement.setDouble(26, rsy.getAdvanceReceipts());
				statement.setDouble(27, rsy.getTotalAccountsPayablePrepaid());
				statement.setDouble(28, rsy.getBillReceivable());
				statement.setDouble(29, rsy.getAccountsReceivable());
				statement.setDouble(30, rsy.getAccountsReceivableFinancing());
				statement.setDouble(31, rsy.getContractAssets());
				statement.setDouble(32, rsy.getPrepayments());
				statement.setDouble(33, rsy.getContractLiabilities());
				statement.setDouble(34, rsy.getTotalAccountsReceivablePrepayments());
				statement.setDouble(35, rsy.getOccupySomeoneElseFunds());
				statement.setDouble(36, rsy.getAccountsReceivableRatio());
				statement.setDouble(37, rsy.getFixedAssets());
				statement.setDouble(38, rsy.getConstructionInProgress());
				statement.setDouble(39, rsy.getTotalTFxedAssets());
				statement.setDouble(40, rsy.getFixedAssetRatio());
				statement.setDouble(41, rsy.getTradingFinancialAssets());
				statement.setDouble(42, rsy.getOtherNonCurrentFinancialAssets());
				statement.setDouble(43, rsy.getInvestmentRealEstate());
				statement.setDouble(44, rsy.getLongTermEquityInvestment());
				statement.setDouble(45, rsy.getSubtotalOfInvestmentAssets());
				statement.setDouble(46, rsy.getInvestmentAssetRatio());
				statement.setDouble(47, rsy.getIntangibleAssets());
				statement.setDouble(48, rsy.getGoodwill());
				statement.setDouble(49, rsy.getTheProportionOfIntangibleAssets());
				statement.setDouble(50, rsy.getGoodwillProportion());
				statement.setDouble(51, rsy.getPayrollPayable());
				statement.setDouble(52, rsy.getCashPaidToAndOnBehalfOfEmployees());
				statement.setDouble(53, rsy.getTotalEmployeeCompensation());
				statement.setInt(54, rsy.getTotalNumberOfPeople());
				statement.setDouble(55, rsy.getPerCapitaAnnualSalary());
				statement.setDouble(56, rsy.getPerCapitaMonthlySalary());
				statement.setDouble(57, rsy.getOperatingRevenue());
				statement.setDouble(58, rsy.getRevenueGrowthRate());
				statement.setDouble(59, rsy.getTotalAssetTurnover());
				statement.setDouble(60, rsy.getCashReceivedFromSellingGoodsAndProvidingServices());
				statement.setDouble(61, rsy.getProportionOfCashSellingGoodsProvidingServices());
				statement.setDouble(62, rsy.getOtherReceivables());
				statement.setDouble(63, rsy.getInventory());
				statement.setDouble(64, rsy.getInventoryGrowthRate());
				statement.setDouble(65, rsy.getAccountsReceivablePercentageOfRevenue());
				statement.setDouble(66, rsy.getPrepaymentsPercentageOfRevenue());
				statement.setDouble(67, rsy.getOtherReceivablesPercentageOfRevenue());
				statement.setDouble(68, rsy.getInventoryToRevenueRatio());
				statement.setDouble(69, rsy.getOperatingCosts());
				statement.setDouble(70, rsy.getGrossMargin());
				statement.setDouble(71, rsy.getSellingExpenses());
				statement.setDouble(72, rsy.getSalesExpenseRate());
				statement.setDouble(73, rsy.getOverhead());
				statement.setDouble(74, rsy.getManagementExpenseRate());
				statement.setDouble(75, rsy.getResearchAndDevelopment());
				statement.setDouble(76, rsy.getResearchAndDevelopmentRate());
				statement.setDouble(77, rsy.getFinancialExpenses());
				statement.setDouble(78, rsy.getExpense());
				statement.setDouble(79, rsy.getExpenseRateToGrossProfitMargin());
				statement.setDouble(80, rsy.getTaxesAndSurcharges());
				statement.setDouble(81, rsy.getFourExpenses());
				statement.setDouble(82, rsy.getTotalProfit());
				statement.setDouble(83, rsy.getMainProfit());
				statement.setDouble(84, rsy.getMainProfitMargin());
				statement.setDouble(85, rsy.getMainOperatingProfitToTotalProfit());
				statement.setDouble(86, rsy.getOperatingProfit());
				statement.setDouble(87, rsy.getOperatingMargin());
				statement.setDouble(88, rsy.getNetProfit());
				statement.setDouble(89, rsy.getNetProfitGrowthRate());
				statement.setDouble(90, rsy.getNetProfitMargin());
				statement.setDouble(91, rsy.getNetCashFlowFromOperating());
				statement.setDouble(92, rsy.getGrowthRateOfNetCashFlowFromOperating());
				statement.setDouble(93, rsy.getNetProfitCashRatio());
				statement.setDouble(94, rsy.getNetIncomeAttributableToShareholders());
				statement.setDouble(95, rsy.getGrowthRateOfNetIncomeAttributableToShareholders());
				statement.setDouble(96, rsy.getROE());
				statement.setDouble(97, rsy.getDepreciation());
				statement.setDouble(98, rsy.getAmortizationOfIntangibleAssets());
				statement.setDouble(99, rsy.getCashPaidForDistributingDividendsProfitsPayingInterest());
				statement.setDouble(100, rsy.getRemainingCash());
				statement.setDouble(101, rsy.getCashPaidForPurchaseConstructionFixedIntangibleLongTermAssets());
				statement.setDouble(102, rsy.getNetCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssetss());
				statement.setDouble(103, rsy.getPurchaseConstructionFixedIntangibleLongTermAssetsProportion());
				statement.setDouble(104, rsy.getNetCashReceivedFromDisposalProportionTopurchase());
				statement.setDouble(105, rsy.getFinancialReportDividends());
				statement.setDouble(106, rsy.getDividendRate());
				statement.setDouble(107, rsy.getNetCashFlowGeneratedFromInvestmentActivities());
				statement.setDouble(108, rsy.getNetCashFlowGeneratedFromFinancingActivities());
				statement.setString(109, rsy.getCompanyType());
				statement.setDouble(110, rsy.getNetIncreaseInCashAndCashEquivalents());
				statement.setDouble(111, rsy.getNetIncreaseInCashAndCashEquivalentsAddBonus());
				statement.setDouble(112, rsy.getClosingBalanceOfCashAndCashEquivalents());
				statement.setString(113, rsy.getCreateDateTime());
				statement.setString(114, rsy.getDataResource());
				statement.setInt(115, rsy.getReportYear());
				statement.setString(116, rsy.getPrimaryIndustry());
				statement.setString(117, rsy.getSecondaryIndustry());
				statement.setString(118, rsy.getThirdLevelIndustry());
				statement.setString(119, rsy.getRegion());
				
				statement.executeUpdate();
				return true; // 插入成功，返回true
			
		} catch (SQLException e) {
		    e.printStackTrace();
		    return false; // 插入失败，返回false
		}
	}
	
	
		//获取单个企业某一财年的指标信息
		public ArrayList<ReportSummaryFormated> getReportstatistics(String AShareCode, String financialReportingYear){
			ArrayList<ReportSummaryFormated> list= new ArrayList<ReportSummaryFormated>();
			String sql="select * from reportstatistics where AShareCode=? and financialReportingYear=?";
			try(PreparedStatement statement=con.prepareStatement(sql)){
				statement.setString(1, AShareCode);
		        statement.setString(2, financialReportingYear);
			
				try (ResultSet rs = statement.executeQuery()) {
		            while (rs.next()) {
		            	ReportSummaryFormated rsf= new ReportSummaryFormated();
		            	DecimalFormat df = new DecimalFormat("#,###.00");
		            	DecimalFormat df1 = new DecimalFormat("0.00%");
		            	
		            	rsf.setAShareCode(rs.getString("AShareCode"));
		            	rsf.setAShareName(rs.getString("AShareName"));
		            	rsf.setPrimaryIndustry(rs.getString("primaryIndustry"));
		            	rsf.setSecondaryIndustry(rs.getString("secondaryIndustry"));
		            	rsf.setFinancialReportingYear(rs.getString("financialReportingYear"));
		            	rsf.setThirdLevelIndustry(rs.getString("thirdLevelIndustry"));
		            	rsf.setRegion(rs.getString("region"));
		            	
		            	//总资产
		            	double totalAssets=rs.getDouble("totalAssets");
		            	if (totalAssets == 0) {
		                    rsf.setTotalAssetsFormated("");
		                } else {
		                	rsf.setTotalAssetsFormated(df.format(totalAssets));
		                }
		            	
		            	
		            	//总资产增长率
		            	double totalAssetsGrowthRate= rs.getDouble("totalAssetsGrowthRate");
		            	if(totalAssetsGrowthRate ==0) {
		            		rsf.setTotalAssetsGrowthRateFormated("");
		            	}else {
		            		rsf.setTotalAssetsGrowthRateFormated(df1.format(totalAssetsGrowthRate));
		            	}
		            	
		            	//股东权益合计（净资产）
		            	double totalOwnersEquity = rs.getDouble("totalOwnersEquity");
		            	if (totalOwnersEquity == 0) {
		                    rsf.setTotalOwnersEquityFormated("");
		                } else {
		                	rsf.setTotalOwnersEquityFormated(df.format(totalOwnersEquity));
		                }
		            	
		            	//权益乘数（总资产/净资产）
		            	double equityMultiplier = rs.getDouble("equityMultiplier");
		            	if (equityMultiplier == 0) {
		                    rsf.setEquityMultiplierFormated("");
		                } else {
		                	rsf.setEquityMultiplierFormated(df.format(equityMultiplier));
		                }
		            	
		            	//总负债
		            	double totalLiabilities = rs.getDouble("totalLiabilities");
		            	if (totalLiabilities == 0) {
		                    rsf.setTotalLiabilitiesFormated("");
		                } else {
		                	rsf.setTotalLiabilitiesFormated(df.format(totalLiabilities));
		                }
		            	
		            	//资产负债率
		            	double assetLiabilityRatio= rs.getDouble("assetLiabilityRatio");
		            	if(assetLiabilityRatio ==0) {
		            		rsf.setAssetLiabilityRatioFormated("");
		            	}else {
		            		rsf.setAssetLiabilityRatioFormated(df1.format(assetLiabilityRatio));
		            	}
		            	
		            	//货币资金
		            	double monetaryCapital = rs.getDouble("monetaryCapital");
		            	if (monetaryCapital == 0) {
		                    rsf.setMonetaryCapitalFormated("");
		                } else {
		                	rsf.setMonetaryCapitalFormated(df.format(monetaryCapital));
		                }
		            	
		            	//短期借款
		            	double shortTermBorrowing = rs.getDouble("shortTermBorrowing");
		            	if (shortTermBorrowing == 0) {
		                    rsf.setShortTermBorrowingFormated("");
		                } else {
		                	rsf.setShortTermBorrowingFormated(df.format(shortTermBorrowing));
		                }
		            	
		            	//一年内到期的非流动负债
		            	double nonCurrentLiabilitiesDueWithinOneYear = rs.getDouble("nonCurrentLiabilitiesDueWithinOneYear");
		            	if (nonCurrentLiabilitiesDueWithinOneYear == 0) {
		                    rsf.setNonCurrentLiabilitiesDueWithinOneYearFormated("");
		                } else {
		                	rsf.setNonCurrentLiabilitiesDueWithinOneYearFormated(df.format(nonCurrentLiabilitiesDueWithinOneYear));
		                }
		            	
		            	//长期借款
		            	double longTermLoan = rs.getDouble("longTermLoan");
		            	if (longTermLoan == 0) {
		                    rsf.setLongTermLoanFormated("");
		                } else {
		                	rsf.setLongTermLoanFormated(df.format(longTermLoan));
		                }
		            	
		            	//应付债券
		            	double bondsPayable = rs.getDouble("bondsPayable");
		            	if (bondsPayable == 0) {
		                    rsf.setBondsPayableFormated("");
		                } else {
		                	rsf.setBondsPayableFormated(df.format(bondsPayable));
		                }
		            	
		            	//长期应付款
		            	double longTermPayables = rs.getDouble("longTermPayables");
		            	if (longTermPayables == 0) {
		                    rsf.setLongTermPayablesFormated("");
		                } else {
		                	rsf.setLongTermPayablesFormated(df.format(longTermPayables));
		                }
		            	
		            	//有息负债(短期借款+一年内到期的非流动负债+长期借款+应付债券+长期应付款)
		            	double interestBearingLiabilities = rs.getDouble("interestBearingLiabilities");
		            	if (interestBearingLiabilities == 0) {
		                    rsf.setInterestBearingLiabilitiesFormated("");
		                } else {
		                	rsf.setInterestBearingLiabilitiesFormated(df.format(interestBearingLiabilities));
		                }
		            	
		            	//货币资金-有息负债
		            	double debtRepaymentRisk = rs.getDouble("debtRepaymentRisk");
		            	if (debtRepaymentRisk == 0) {
		                    rsf.setDebtRepaymentRiskFormated("");
		                } else {
		                	rsf.setDebtRepaymentRiskFormated(df.format(debtRepaymentRisk));
		                }
		            	
		            	//交易性金融资产中的理财产品
		            	double tradingFinancialAssetsManagement = rs.getDouble("tradingFinancialAssetsManagement");
		            	if (tradingFinancialAssetsManagement == 0) {
		                    rsf.setTradingFinancialAssetsManagementFormated("");
		                } else {
		                	rsf.setTradingFinancialAssetsManagementFormated(df.format(tradingFinancialAssetsManagement));
		                }
		            	
		            	//其他流动资产的理财产品
		            	double otherCurrentAssetsManagement = rs.getDouble("otherCurrentAssetsManagement");
		            	if (otherCurrentAssetsManagement == 0) {
		                    rsf.setOtherCurrentAssetsManagementFormated("");
		                } else {
		                	rsf.setOtherCurrentAssetsManagementFormated(df.format(otherCurrentAssetsManagement));
		                }
		            	
		            	//准货币资金
		            	double quasiMonetary = rs.getDouble("quasiMonetary");
		            	if (quasiMonetary == 0) {
		                    rsf.setQuasiMonetaryFormated("");
		                } else {
		                	rsf.setQuasiMonetaryFormated(df.format(quasiMonetary));
		                }
		            	
		            	//短期有息负债(短期借款+一年内到期的非流动负债)
		            	double shortTermForeignDebt = rs.getDouble("shortTermForeignDebt");
		            	if (shortTermForeignDebt == 0) {
		                    rsf.setShortTermForeignDebtFormated("");
		                } else {
		                	rsf.setShortTermForeignDebtFormated(df.format(shortTermForeignDebt));
		                }
		            	
		            	//准货币资金-短期有息负债
		            	double shortTermDebtRepaymentRisk = rs.getDouble("shortTermDebtRepaymentRisk");
		            	if (shortTermDebtRepaymentRisk == 0) {
		                    rsf.setShortTermDebtRepaymentRiskFormated("");
		                } else {
		                	rsf.setShortTermDebtRepaymentRiskFormated(df.format(shortTermDebtRepaymentRisk));
		                }
		            	
		            	//准货币资金占总资产比率
		            	double quasiMonetaryCapitalRatio= rs.getDouble("quasiMonetaryCapitalRatio");
		            	if(quasiMonetaryCapitalRatio ==0) {
		            		rsf.setQuasiMonetaryCapitalRatioFormated("");
		            	}else {
		            		rsf.setQuasiMonetaryCapitalRatioFormated(df1.format(quasiMonetaryCapitalRatio));
		            	}
		            	
		            	//应付票据
		            	double notesPayable = rs.getDouble("notesPayable");
		            	if (notesPayable == 0) {
		                    rsf.setNotesPayableFormated("");
		                } else {
		                	rsf.setNotesPayableFormated(df.format(notesPayable));
		                }
		            	
		            	//应付账款
		            	double accountsPayable = rs.getDouble("accountsPayable");
		            	if (accountsPayable == 0) {
		                    rsf.setAccountsPayableFormated("");
		                } else {
		                	rsf.setAccountsPayableFormated(df.format(accountsPayable));
		                }
		            	
		            	//预收款项
		            	double advanceReceipts = rs.getDouble("advanceReceipts");
		            	if (advanceReceipts == 0) {
		                    rsf.setAdvanceReceiptsFormated("");
		                } else {
		                	rsf.setAdvanceReceiptsFormated(df.format(advanceReceipts));
		                }
		            	
		            	//应付预收合计
		            	double totalAccountsPayablePrepaid = rs.getDouble("totalAccountsPayablePrepaid");
		            	if (totalAccountsPayablePrepaid == 0) {
		                    rsf.setTotalAccountsPayablePrepaidFormated("");
		                } else {
		                	rsf.setTotalAccountsPayablePrepaidFormated(df.format(totalAccountsPayablePrepaid));
		                }
		            	
		            	//应收票据
		            	double billReceivable = rs.getDouble("billReceivable");
		            	if (billReceivable == 0) {
		                    rsf.setBillReceivableFormated("");
		                } else {
		                	rsf.setBillReceivableFormated(df.format(billReceivable));
		                }
		            	
		            	//应收账款
		            	double accountsReceivable = rs.getDouble("accountsReceivable");
		            	if (accountsReceivable == 0) {
		                    rsf.setAccountsReceivableFormated("");
		                } else {
		                	rsf.setAccountsReceivableFormated(df.format(accountsReceivable));
		                }
		            	
		            	//应收款项融资
		            	double accountsReceivableFinancing = rs.getDouble("accountsReceivableFinancing");
		            	if (accountsReceivableFinancing == 0) {
		                    rsf.setAccountsReceivableFinancingFormated("");
		                } else {
		                	rsf.setAccountsReceivableFinancingFormated(df.format(accountsReceivableFinancing));
		                }
		            	
		            	//合同资产
		            	double contractAssets = rs.getDouble("contractAssets");
		            	if (contractAssets == 0) {
		                    rsf.setContractAssetsFormated("");
		                } else {
		                	rsf.setContractAssetsFormated(df.format(contractAssets));
		                }
		            	
		            	//预付款项
		            	double prepayments = rs.getDouble("prepayments");
		            	if (prepayments == 0) {
		                    rsf.setPrepaymentsFormated("");
		                } else {
		                	rsf.setPrepaymentsFormated(df.format(prepayments));
		                }
		            	
		            	//合同负债
		            	double contractLiabilities = rs.getDouble("contractLiabilities");
		            	if (contractLiabilities == 0) {
		                    rsf.setContractLiabilitiesFormated("");
		                } else {
		                	rsf.setContractLiabilitiesFormated(df.format(contractLiabilities));
		                }
		            	
		            	//应收预付合计
		            	double totalAccountsReceivablePrepayments = rs.getDouble("totalAccountsReceivablePrepayments");
		            	if (totalAccountsReceivablePrepayments == 0) {
		                    rsf.setTotalAccountsReceivablePrepaymentsFormated("");
		                } else {
		                	rsf.setTotalAccountsReceivablePrepaymentsFormated(df.format(totalAccountsReceivablePrepayments));
		                }
		            	
		            	//应付预收合计-应收预付合计
		            	double occupySomeoneElseFunds = rs.getDouble("occupySomeoneElseFunds");
		            	if (occupySomeoneElseFunds == 0) {
		                    rsf.setOccupySomeoneElseFundsFormated("");
		                } else {
		                	rsf.setOccupySomeoneElseFundsFormated(df.format(occupySomeoneElseFunds));
		                }
		            	
		            	//应收账款占总资产的比率
		            	double accountsReceivableRatio = rs.getDouble("accountsReceivableRatio");
		            	if (accountsReceivableRatio == 0) {
		                    rsf.setAccountsReceivableRatioFormated("");
		                } else {
		                	rsf.setAccountsReceivableRatioFormated(df1.format(accountsReceivableRatio));
		                }
		            	
		            	//固定资产
		            	double fixedAssets = rs.getDouble("fixedAssets");
		            	if (fixedAssets == 0) {
		                    rsf.setFixedAssetsFormated("");
		                } else {
		                	rsf.setFixedAssetsFormated(df.format(fixedAssets));
		                }
		            	
		            	//在建工程
		            	double constructionInProgress = rs.getDouble("constructionInProgress");
		            	if (constructionInProgress == 0) {
		                    rsf.setConstructionInProgressFormated("");
		                } else {
		                	rsf.setConstructionInProgressFormated(df.format(constructionInProgress));
		                }
		            	
		            	//固产合计
		            	double totalTFxedAssets = rs.getDouble("totalTFxedAssets");
		            	if (totalTFxedAssets == 0) {
		                    rsf.setTotalTFxedAssetsFormated("");
		                } else {
		                	rsf.setTotalTFxedAssetsFormated(df.format(totalTFxedAssets));
		                }
		            	
		            	//固产合计占总资产的比率
		            	double fixedAssetRatio = rs.getDouble("fixedAssetRatio");
		            	if (fixedAssetRatio == 0) {
		                    rsf.setFixedAssetRatioFormated("");
		                } else {
		                	rsf.setFixedAssetRatioFormated(df1.format(fixedAssetRatio));
		                }
		            	
		            	//交易性金融资产
		            	double tradingFinancialAssets = rs.getDouble("tradingFinancialAssets");
		            	if (tradingFinancialAssets == 0) {
		                    rsf.setTradingFinancialAssetsFormated("");
		                } else {
		                	rsf.setTradingFinancialAssetsFormated(df.format(tradingFinancialAssets));
		                }
		            	
		            	//其他非流动金融资产
		            	double otherNonCurrentFinancialAssets = rs.getDouble("otherNonCurrentFinancialAssets");
		            	if (otherNonCurrentFinancialAssets == 0) {
		                    rsf.setOtherNonCurrentFinancialAssetsFormated("");
		                } else {
		                	rsf.setOtherNonCurrentFinancialAssetsFormated(df.format(otherNonCurrentFinancialAssets));
		                }
		            	
		            	//投资性房地产
		            	double investmentRealEstate = rs.getDouble("investmentRealEstate");
		            	if (investmentRealEstate == 0) {
		                    rsf.setInvestmentRealEstateFormated("");
		                } else {
		                	rsf.setInvestmentRealEstateFormated(df.format(investmentRealEstate));
		                }
		            	
		            	//长期股权投资
		            	double longTermEquityInvestment = rs.getDouble("longTermEquityInvestment");
		            	if (longTermEquityInvestment == 0) {
		                    rsf.setLongTermEquityInvestmentFormated("");
		                } else {
		                	rsf.setLongTermEquityInvestmentFormated(df.format(longTermEquityInvestment));
		                }
		            	
		            	//投资类资产小计
		            	double subtotalOfInvestmentAssets = rs.getDouble("subtotalOfInvestmentAssets");
		            	if (subtotalOfInvestmentAssets == 0) {
		                    rsf.setSubtotalOfInvestmentAssetsFormated("");
		                } else {
		                	rsf.setSubtotalOfInvestmentAssetsFormated(df.format(subtotalOfInvestmentAssets));
		                }
		            	
		            	//投资类资产占总资产的比率
		            	double investmentAssetRatio = rs.getDouble("investmentAssetRatio");
		            	if (investmentAssetRatio == 0) {
		                    rsf.setInvestmentAssetRatioFormated("");
		                } else {
		                	rsf.setInvestmentAssetRatioFormated(df1.format(investmentAssetRatio));
		                }
		            	
		            	//无形资产
		            	double intangibleAssets = rs.getDouble("intangibleAssets");
		            	if (intangibleAssets == 0) {
		                    rsf.setIntangibleAssetsFormated("");
		                } else {
		                	rsf.setIntangibleAssetsFormated(df.format(intangibleAssets));
		                }
		            	
		            	//商誉
		            	double goodwill = rs.getDouble("goodwill");
		            	if (goodwill == 0) {
		                    rsf.setGoodwillFormated("");
		                } else {
		                	rsf.setGoodwillFormated(df.format(goodwill));
		                }
		            	
		            	//无形资产占比
		            	double theProportionOfIntangibleAssets = rs.getDouble("theProportionOfIntangibleAssets");
		            	if (theProportionOfIntangibleAssets == 0) {
		                    rsf.setTheProportionOfIntangibleAssetsFormated("");
		                } else {
		                	rsf.setTheProportionOfIntangibleAssetsFormated(df1.format(theProportionOfIntangibleAssets));
		                }
		            	
		            	//商誉占比
		            	double goodwillProportion = rs.getDouble("goodwillProportion");
		            	if (goodwillProportion == 0) {
		                    rsf.setGoodwillProportionFormated("");
		                } else {
		                	rsf.setGoodwillProportionFormated(df1.format(goodwillProportion));
		                }
		            	
		            	//应付职工薪酬
		            	double payrollPayable = rs.getDouble("payrollPayable");
		            	if (payrollPayable == 0) {
		                    rsf.setPayrollPayableFormated("");
		                } else {
		                	rsf.setPayrollPayableFormated(df.format(payrollPayable));
		                }
		            	
		            	//支付给职工以及为职工支付的现金
		            	double cashPaidToAndOnBehalfOfEmployees = rs.getDouble("cashPaidToAndOnBehalfOfEmployees");
		            	if (cashPaidToAndOnBehalfOfEmployees == 0) {
		                    rsf.setCashPaidToAndOnBehalfOfEmployeesFormated("");
		                } else {
		                	rsf.setCashPaidToAndOnBehalfOfEmployeesFormated(df.format(cashPaidToAndOnBehalfOfEmployees));
		                }
		            	
		            	//当年职工总薪酬
		            	double totalEmployeeCompensation = rs.getDouble("totalEmployeeCompensation");
		            	if (totalEmployeeCompensation == 0) {
		                    rsf.setTotalEmployeeCompensationFormated("");
		                } else {
		                	rsf.setTotalEmployeeCompensationFormated(df.format(totalEmployeeCompensation));
		                }
		            	
		            	//总人数
		            	int totalNumberOfPeople = rs.getInt("totalNumberOfPeople");
		            	rsf.setTotalNumberOfPeople(totalNumberOfPeople);
		            	
		            	//财报年份
		            	int reportYear = rs.getInt("reportYear");
		            	rsf.setReportYear(reportYear);
		            	
		            	//人均年薪
		            	double perCapitaAnnualSalary = rs.getDouble("perCapitaAnnualSalary");
		            	if (perCapitaAnnualSalary == 0) {
		                    rsf.setPerCapitaAnnualSalaryFormated("");
		                } else {
		                	rsf.setPerCapitaAnnualSalaryFormated(df.format(perCapitaAnnualSalary));
		                }
		            	
		            	//人均月薪
		            	double perCapitaMonthlySalary = rs.getDouble("perCapitaMonthlySalary");
		            	if (perCapitaMonthlySalary == 0) {
		                    rsf.setPerCapitaMonthlySalaryFormated("");
		                } else {
		                	rsf.setPerCapitaMonthlySalaryFormated(df.format(perCapitaMonthlySalary));
		                }
		            	
		            	//营业收入
		            	double operatingRevenue = rs.getDouble("operatingRevenue");
		            	if (operatingRevenue == 0) {
		                    rsf.setOperatingRevenueFormated("");
		                } else {
		                	rsf.setOperatingRevenueFormated(df.format(operatingRevenue));
		                }
		            	
		            	//营业收入增长率
		            	double revenueGrowthRate = rs.getDouble("revenueGrowthRate");
		            	if (revenueGrowthRate == 0) {
		                    rsf.setRevenueGrowthRateFormated("");
		                } else {
		                	rsf.setRevenueGrowthRateFormated(df1.format(revenueGrowthRate));
		                }
		            	
		            	//总资产周转率
		            	double totalAssetTurnover = rs.getDouble("totalAssetTurnover");
		            	if (totalAssetTurnover == 0) {
		                    rsf.setTotalAssetTurnoverFormated("");
		                } else {
		                	rsf.setTotalAssetTurnoverFormated(df1.format(totalAssetTurnover));
		                }
		            	
		            	//销售商品、提供劳务收到的现金
		            	double cashReceivedFromSellingGoodsAndProvidingServices = rs.getDouble("cashReceivedFromSellingGoodsAndProvidingServices");
		            	if (cashReceivedFromSellingGoodsAndProvidingServices == 0) {
		                    rsf.setCashReceivedFromSellingGoodsAndProvidingServicesFormated("");
		                } else {
		                	rsf.setCashReceivedFromSellingGoodsAndProvidingServicesFormated(df.format(cashReceivedFromSellingGoodsAndProvidingServices));
		                }
		            	
		            	//销售商品、提供劳务收到的现金占营收的比率
		            	double proportionOfCashSellingGoodsProvidingServices = rs.getDouble("proportionOfCashSellingGoodsProvidingServices");
		            	if (proportionOfCashSellingGoodsProvidingServices == 0) {
		                    rsf.setProportionOfCashSellingGoodsProvidingServicesFormated("");
		                } else {
		                	rsf.setProportionOfCashSellingGoodsProvidingServicesFormated(df1.format(proportionOfCashSellingGoodsProvidingServices));
		                }
		            	
		            	//其他应收款
		            	double otherReceivables = rs.getDouble("otherReceivables");
		            	if (otherReceivables == 0) {
		                    rsf.setOtherReceivablesFormated("");
		                } else {
		                	rsf.setOtherReceivablesFormated(df.format(otherReceivables));
		                }
		            	
		            	//存货
		            	double inventory = rs.getDouble("inventory");
		            	if (inventory == 0) {
		                    rsf.setInventoryFormated("");
		                } else {
		                	rsf.setInventoryFormated(df.format(inventory));
		                }
		            	
		            	//存货增长率
		            	double inventoryGrowthRate = rs.getDouble("inventoryGrowthRate");
		            	if (inventoryGrowthRate == 0) {
		                    rsf.setInventoryGrowthRateFormated("");
		                } else {
		                	rsf.setInventoryGrowthRateFormated(df1.format(inventoryGrowthRate));
		                }
		            	
		            	//应收账款/总资产
		            	double accountsReceivablePercentageOfRevenue = rs.getDouble("accountsReceivablePercentageOfRevenue");
		            	if (accountsReceivablePercentageOfRevenue == 0) {
		                    rsf.setAccountsReceivablePercentageOfRevenueFormated("");
		                } else {
		                	rsf.setAccountsReceivablePercentageOfRevenueFormated(df1.format(accountsReceivablePercentageOfRevenue));
		                }
		            	
		            	//预付款项/总资产
		            	double prepaymentsPercentageOfRevenue = rs.getDouble("prepaymentsPercentageOfRevenue");
		            	if (prepaymentsPercentageOfRevenue == 0) {
		                    rsf.setPrepaymentsPercentageOfRevenueFormated("");
		                } else {
		                	rsf.setPrepaymentsPercentageOfRevenueFormated(df1.format(prepaymentsPercentageOfRevenue));
		                }
		            	
		            	//其他应收款/总资产
		            	double otherReceivablesPercentageOfRevenue = rs.getDouble("otherReceivablesPercentageOfRevenue");
		            	if (otherReceivablesPercentageOfRevenue == 0) {
		                    rsf.setOtherReceivablesPercentageOfRevenueFormated("");
		                } else {
		                	rsf.setOtherReceivablesPercentageOfRevenueFormated(df1.format(otherReceivablesPercentageOfRevenue));
		                }
		            	
		            	//存货/总资产
		            	double inventoryToRevenueRatio = rs.getDouble("inventoryToRevenueRatio");
		            	if (inventoryToRevenueRatio == 0) {
		                    rsf.setInventoryToRevenueRatioFormated("");
		                } else {
		                	rsf.setInventoryToRevenueRatioFormated(df1.format(inventoryToRevenueRatio));
		                }
		            	
		            	//营业成本
		            	double operatingCosts = rs.getDouble("operatingCosts");
		            	if (operatingCosts == 0) {
		                    rsf.setOperatingCostsFormated("");
		                } else {
		                	rsf.setOperatingCostsFormated(df.format(operatingCosts));
		                }
		            	
		            	//毛利率
		            	double grossMargin = rs.getDouble("grossMargin");
		            	if (grossMargin == 0) {
		                    rsf.setGrossMarginFormated("");
		                } else {
		                	rsf.setGrossMarginFormated(df1.format(grossMargin));
		                }
		            	
		            	//销售费用
		            	double sellingExpenses = rs.getDouble("sellingExpenses");
		            	if (sellingExpenses == 0) {
		                    rsf.setSellingExpensesFormated("");
		                } else {
		                	rsf.setSellingExpensesFormated(df.format(sellingExpenses));
		                }
		            	
		            	//销售费用率
		            	double salesExpenseRate = rs.getDouble("salesExpenseRate");
		            	if (salesExpenseRate == 0) {
		                    rsf.setSalesExpenseRateFormated("");
		                } else {
		                	rsf.setSalesExpenseRateFormated(df1.format(salesExpenseRate));
		                }
		            	
		            	//管理费用
		            	double overhead = rs.getDouble("overhead");
		            	if (overhead == 0) {
		                    rsf.setOverheadFormated("");
		                } else {
		                	rsf.setOverheadFormated(df.format(overhead));
		                }
		            	
		            	//管理费用率
		            	double managementExpenseRate = rs.getDouble("managementExpenseRate");
		            	if (managementExpenseRate == 0) {
		                    rsf.setManagementExpenseRateFormated("");
		                } else {
		                	rsf.setManagementExpenseRateFormated(df1.format(managementExpenseRate));
		                }
		            	
		            	//研发费用
		            	double researchAndDevelopment = rs.getDouble("researchAndDevelopment");
		            	if (researchAndDevelopment == 0) {
		                    rsf.setResearchAndDevelopmentFormated("");
		                } else {
		                	rsf.setResearchAndDevelopmentFormated(df.format(researchAndDevelopment));
		                }
		            	
		            	//研发费用率
		            	double researchAndDevelopmentRate = rs.getDouble("researchAndDevelopmentRate");
		            	if (researchAndDevelopmentRate == 0) {
		                    rsf.setResearchAndDevelopmentRateFormated("");
		                } else {
		                	rsf.setResearchAndDevelopmentRateFormated(df1.format(researchAndDevelopmentRate));
		                }
		            	
		            	//财务费用
		            	double financialExpenses = rs.getDouble("financialExpenses");
		            	if (financialExpenses == 0) {
		                    rsf.setFinancialExpensesFormated("");
		                } else {
		                	rsf.setFinancialExpensesFormated(df.format(financialExpenses));
		                }
		            	
		            	//费用率
		            	double expense = rs.getDouble("expense");
		            	if (expense == 0) {
		                    rsf.setExpenseFormated("");
		                } else {
		                	rsf.setExpenseFormated(df1.format(expense));
		                }
		            	
		            	//费用率占毛利率的比率
		            	double expenseRateToGrossProfitMargin = rs.getDouble("expenseRateToGrossProfitMargin");
		            	if (expense == 0) {
		                    rsf.setExpenseRateToGrossProfitMarginFormated("");
		                } else {
		                	rsf.setExpenseRateToGrossProfitMarginFormated(df1.format(expenseRateToGrossProfitMargin));
		                }
		            	
		            	//税金及附加
		            	double taxesAndSurcharges = rs.getDouble("taxesAndSurcharges");
		            	if (taxesAndSurcharges == 0) {
		                    rsf.setTaxesAndSurchargesFormated("");
		                } else {
		                	rsf.setTaxesAndSurchargesFormated(df.format(taxesAndSurcharges));
		                }
		            	
		            	//四项费用
		            	double fourExpenses = rs.getDouble("fourExpenses");
		            	if (fourExpenses == 0) {
		                    rsf.setFourExpensesFormated("");
		                } else {
		                	rsf.setFourExpensesFormated(df.format(fourExpenses));
		                }
		            	
		            	//利润总额
		            	double totalProfit = rs.getDouble("totalProfit");
		            	if (totalProfit == 0) {
		                    rsf.setTotalProfitFormated("");
		                } else {
		                	rsf.setTotalProfitFormated(df.format(totalProfit));
		                }
		            	
		            	//主营利润
		            	double mainProfit = rs.getDouble("mainProfit");
		            	if (mainProfit == 0) {
		                    rsf.setMainProfitFormated("");
		                } else {
		                	rsf.setMainProfitFormated(df.format(mainProfit));
		                }
		            	
		            	//主营利润率
		            	double mainProfitMargin = rs.getDouble("mainProfitMargin");
		            	if (mainProfitMargin == 0) {
		                    rsf.setMainProfitMarginFormated("");
		                } else {
		                	rsf.setMainProfitMarginFormated(df1.format(mainProfitMargin));
		                }
		            	
		            	//营业利润
		            	double operatingProfit = rs.getDouble("operatingProfit");
		            	if (mainProfit == 0) {
		                    rsf.setOperatingProfitFormated("");
		                } else {
		                	rsf.setOperatingProfitFormated(df.format(operatingProfit));
		                }
		            	
		            	//主营利润占营业利润比例
		            	double operatingMargin = rs.getDouble("operatingMargin");
		            	if (operatingMargin == 0) {
		                    rsf.setOperatingMarginFormated("");
		                } else {
		                	rsf.setOperatingMarginFormated(df1.format(operatingMargin));
		                }
		            	
		            	//主营利润占利润总额的比例
		            	double mainOperatingProfitToTotalProfit = rs.getDouble("mainOperatingProfitToTotalProfit");
		            	if (mainOperatingProfitToTotalProfit == 0) {
		                    rsf.setMainOperatingProfitToTotalProfitFormated("");
		                } else {
		                	rsf.setMainOperatingProfitToTotalProfitFormated(df1.format(mainOperatingProfitToTotalProfit));
		                }
		            	
		            	//净利润
		            	double netProfit = rs.getDouble("netProfit");
		            	if (netProfit == 0) {
		                    rsf.setNetProfitFormated("");
		                } else {
		                	rsf.setNetProfitFormated(df.format(netProfit));
		                }
		            	
		            	//净利润增长率
		            	double netProfitGrowthRate = rs.getDouble("netProfitGrowthRate");
		            	if (netProfitGrowthRate == 0) {
		                    rsf.setNetProfitGrowthRateFormated("");
		                } else {
		                	rsf.setNetProfitGrowthRateFormated(df1.format(netProfitGrowthRate));
		                }
		            	
		            	//净利润率
		            	double netProfitMargin = rs.getDouble("netProfitMargin");
		            	if (netProfitMargin == 0) {
		                    rsf.setNetProfitMarginFormated("");
		                } else {
		                	rsf.setNetProfitMarginFormated(df1.format(netProfitMargin));
		                }
		            	
		            	//经营活动产生的现金流量净额
		            	double netCashFlowFromOperating = rs.getDouble("netCashFlowFromOperating");
		            	if (netCashFlowFromOperating == 0) {
		                    rsf.setNetCashFlowFromOperatingFormated("");
		                } else {
		                	rsf.setNetCashFlowFromOperatingFormated(df.format(netCashFlowFromOperating));
		                }
		            	
		            	//经营活动产生的现金流量净额同比增长
		            	double growthRateOfNetCashFlowFromOperating = rs.getDouble("growthRateOfNetCashFlowFromOperating");
		            	if (growthRateOfNetCashFlowFromOperating == 0) {
		                    rsf.setGrowthRateOfNetCashFlowFromOperatingFormated("");
		                } else {
		                	rsf.setGrowthRateOfNetCashFlowFromOperatingFormated(df1.format(growthRateOfNetCashFlowFromOperating));
		                }
		            	
		            	//净利润现金比率
		            	double netProfitCashRatio = rs.getDouble("netProfitCashRatio");
		            	if (netProfitCashRatio == 0) {
		                    rsf.setNetProfitCashRatioFormated("");
		                } else {
		                	rsf.setNetProfitCashRatioFormated(df1.format(netProfitCashRatio));
		                }
		            	
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
		            	
		            	//ROE      	
		            	double ROE = rs.getDouble("ROE");
		            	if (ROE == 0) {
		                    rsf.setROEFormated("");
		                } else {
		                	rsf.setROEFormated(df1.format(ROE));
		                }
		            	
		            	//固定资产折旧
		            	double depreciation = rs.getDouble("depreciation");
		            	if (depreciation == 0) {
		                    rsf.setDepreciationFormated("");
		                } else {
		                	rsf.setDepreciationFormated(df.format(depreciation));
		                }
		            	
		            	//无形资产摊销
		            	double amortizationOfIntangibleAssets = rs.getDouble("amortizationOfIntangibleAssets");
		            	if (amortizationOfIntangibleAssets == 0) {
		                    rsf.setAmortizationOfIntangibleAssetsFormated("");
		                } else {
		                	rsf.setAmortizationOfIntangibleAssetsFormated(df.format(amortizationOfIntangibleAssets));
		                }
		            	
		            	//现金股利(分配股利、利润或偿付利息支付的现金)
		            	double cashPaidForDistributingDividendsProfitsPayingInterest = rs.getDouble("cashPaidForDistributingDividendsProfitsPayingInterest");
		            	if (cashPaidForDistributingDividendsProfitsPayingInterest == 0) {
		                    rsf.setCashPaidForDistributingDividendsProfitsPayingInterestFormated("");
		                } else {
		                	rsf.setCashPaidForDistributingDividendsProfitsPayingInterestFormated(df.format(cashPaidForDistributingDividendsProfitsPayingInterest));
		                }
		            	
		            	//经营活动产生的现金流量净额减去以上三项的余额
		            	double remainingCash = rs.getDouble("remainingCash");
		            	if (remainingCash == 0) {
		                    rsf.setRemainingCashFormated("");
		                } else {
		                	rsf.setRemainingCashFormated(df.format(remainingCash));
		                }
		            	
		            	//购建固定资产、无形资产和其他长期资产支付的现金
		            	double cashPaidForPurchaseConstructionFixedIntangibleLongTermAssets = rs.getDouble("cashPaidForPurchaseConstructionFixedIntangibleLongTermAssets");
		            	if (cashPaidForPurchaseConstructionFixedIntangibleLongTermAssets == 0) {
		                    rsf.setCashPaidForPurchaseConstructionFixedIntangibleLongTermAssetsFormated("");
		                } else {
		                	rsf.setCashPaidForPurchaseConstructionFixedIntangibleLongTermAssetsFormated(df.format(cashPaidForPurchaseConstructionFixedIntangibleLongTermAssets));
		                }
		            	
		            	//处置固定、无形和其他长期资产收回现金
		            	double netCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssets = rs.getDouble("netCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssets");
		            	if (netCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssets == 0) {
		                    rsf.setNetCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssetsFormated("");
		                } else {
		                	rsf.setNetCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssetsFormated(df.format(netCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssets));
		                }
		            	
		            	//购建固产占经营活动产生的现金比
		            	double purchaseConstructionFixedIntangibleLongTermAssetsProportion = rs.getDouble("purchaseConstructionFixedIntangibleLongTermAssetsProportion");
		            	if (purchaseConstructionFixedIntangibleLongTermAssetsProportion == 0) {
		                    rsf.setPurchaseConstructionFixedIntangibleLongTermAssetsProportionFormated("");
		                } else {
		                	rsf.setPurchaseConstructionFixedIntangibleLongTermAssetsProportionFormated(df1.format(purchaseConstructionFixedIntangibleLongTermAssetsProportion));
		                }
		            	
		            	//处置固定资产、无形资产和其他长期资产收回的现金净额占购建资产支付的现金比
		            	double netCashReceivedFromDisposalProportionTopurchase = rs.getDouble("netCashReceivedFromDisposalProportionTopurchase");
		            	if (netCashReceivedFromDisposalProportionTopurchase == 0) {
		                    rsf.setNetCashReceivedFromDisposalProportionTopurchaseFormated("");
		                } else {
		                	rsf.setNetCashReceivedFromDisposalProportionTopurchaseFormated(df1.format(netCashReceivedFromDisposalProportionTopurchase));
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
		            	
		            	//投资活动产生的现金流量净额
		            	double netCashFlowGeneratedFromInvestmentActivities = rs.getDouble("netCashFlowGeneratedFromInvestmentActivities");
		            	if (netCashFlowGeneratedFromInvestmentActivities == 0) {
		                    rsf.setNetCashFlowGeneratedFromInvestmentActivitiesFormated("");
		                } else {
		                	rsf.setNetCashFlowGeneratedFromInvestmentActivitiesFormated(df.format(netCashFlowGeneratedFromInvestmentActivities));
		                }
		            	
		            	//筹资活动产生的现金流量净额
		            	double netCashFlowGeneratedFromFinancingActivities = rs.getDouble("netCashFlowGeneratedFromFinancingActivities");
		            	if (netCashFlowGeneratedFromFinancingActivities == 0) {
		                    rsf.setNetCashFlowGeneratedFromFinancingActivitiesFormated("");
		                } else {
		                	rsf.setNetCashFlowGeneratedFromFinancingActivitiesFormated(df.format(netCashFlowGeneratedFromFinancingActivities));
		                }
		            	
		            	//现金及现金等价物净增加额
		            	double netIncreaseInCashAndCashEquivalents = rs.getDouble("netIncreaseInCashAndCashEquivalents");
		            	if (netIncreaseInCashAndCashEquivalents == 0) {
		                    rsf.setNetIncreaseInCashAndCashEquivalentsFormated("");
		                } else {
		                	rsf.setNetIncreaseInCashAndCashEquivalentsFormated(df.format(netIncreaseInCashAndCashEquivalents));
		                }
		            	
		            	//公司类型
		            	String companyType =rs.getString("companyType");
		            	rsf.setCompanyType(companyType);
		            	
		            	//加现金分红的现金及现金等价物净增加额
		            	double netIncreaseInCashAndCashEquivalentsAddBonus = rs.getDouble("netIncreaseInCashAndCashEquivalentsAddBonus");
		            	if (netIncreaseInCashAndCashEquivalentsAddBonus == 0) {
		                    rsf.setNetIncreaseInCashAndCashEquivalentsAddBonusFormated("");
		                } else {
		                	rsf.setNetIncreaseInCashAndCashEquivalentsAddBonusFormated(df.format(netIncreaseInCashAndCashEquivalentsAddBonus));
		                }
		            	
		            	//期末现金及现金等价物余额
		            	double closingBalanceOfCashAndCashEquivalents = rs.getDouble("closingBalanceOfCashAndCashEquivalents");
		            	if (closingBalanceOfCashAndCashEquivalents == 0) {
		                    rsf.setClosingBalanceOfCashAndCashEquivalentsFormated("");
		                } else {
		                	rsf.setClosingBalanceOfCashAndCashEquivalentsFormated(df.format(closingBalanceOfCashAndCashEquivalents));
		                }
		            	
		            	//创建时间
		            	String createDateTime =rs.getString("createDateTime");
		            	rsf.setCreateDateTime(createDateTime);
		            	
		            	//数据来源：页面确认，自动触发
		            	String dataResource =rs.getString("dataResource");
		            	rsf.setDataResource(dataResource);
		            	
		            	list.add(rsf);
		            }
				}
			}catch (SQLException e) {
		        e.printStackTrace();
		    }

		    return list;
		}
		
		//获取单个企业最后五个财年内的指标信息
		public ArrayList<ReportSummaryFormated> getReportstatisticsForYears(String AShareCode){
			ArrayList<ReportSummaryFormated> list= new ArrayList<ReportSummaryFormated>();
			String sql="select * from reportstatistics where AShareCode=?  order by reportYear asc limit 5";
			try(PreparedStatement statement=con.prepareStatement(sql)){
				statement.setString(1, AShareCode);
			
				try (ResultSet rs = statement.executeQuery()) {
		            while (rs.next()) {
		            	ReportSummaryFormated rsf= new ReportSummaryFormated();
		            	DecimalFormat df = new DecimalFormat("#,###.00");
		            	DecimalFormat df1 = new DecimalFormat("0.00%");
		            	
		            	rsf.setAShareCode(rs.getString("AShareCode"));
		            	rsf.setAShareName(rs.getString("AShareName"));
		            	rsf.setPrimaryIndustry(rs.getString("primaryIndustry"));
		            	rsf.setSecondaryIndustry(rs.getString("secondaryIndustry"));
		            	rsf.setFinancialReportingYear(rs.getString("financialReportingYear"));
		            	rsf.setThirdLevelIndustry(rs.getString("thirdLevelIndustry"));
		            	rsf.setRegion(rs.getString("region"));
		            	rsf.setFinancialReportingYear(rs.getString("financialReportingYear"));
		            	rsf.setReportYear(rs.getInt("reportYear"));
		            	
		            	//总资产
		            	double totalAssets=rs.getDouble("totalAssets");
		            	if (totalAssets == 0) {
		                    rsf.setTotalAssetsFormated("");
		                } else {
		                	rsf.setTotalAssetsFormated(df.format(totalAssets));
		                }
		            	
		            	
		            	//总资产增长率
		            	double totalAssetsGrowthRate= rs.getDouble("totalAssetsGrowthRate");
		            	if(totalAssetsGrowthRate ==0) {
		            		rsf.setTotalAssetsGrowthRateFormated("");
		            	}else {
		            		rsf.setTotalAssetsGrowthRateFormated(df1.format(totalAssetsGrowthRate));
		            	}
		            	
		            	//股东权益合计（净资产）
		            	double totalOwnersEquity = rs.getDouble("totalOwnersEquity");
		            	if (totalOwnersEquity == 0) {
		                    rsf.setTotalOwnersEquityFormated("");
		                } else {
		                	rsf.setTotalOwnersEquityFormated(df.format(totalOwnersEquity));
		                }
		            	
		            	//权益乘数（总资产/净资产）
		            	double equityMultiplier = rs.getDouble("equityMultiplier");
		            	if (equityMultiplier == 0) {
		                    rsf.setEquityMultiplierFormated("");
		                } else {
		                	rsf.setEquityMultiplierFormated(df.format(equityMultiplier));
		                }
		            	
		            	//总负债
		            	double totalLiabilities = rs.getDouble("totalLiabilities");
		            	if (totalLiabilities == 0) {
		                    rsf.setTotalLiabilitiesFormated("");
		                } else {
		                	rsf.setTotalLiabilitiesFormated(df.format(totalLiabilities));
		                }
		            	
		            	//资产负债率
		            	double assetLiabilityRatio= rs.getDouble("assetLiabilityRatio");
		            	if(assetLiabilityRatio ==0) {
		            		rsf.setAssetLiabilityRatioFormated("");
		            	}else {
		            		rsf.setAssetLiabilityRatioFormated(df1.format(assetLiabilityRatio));
		            	}
		            	
		            	//货币资金
		            	double monetaryCapital = rs.getDouble("monetaryCapital");
		            	if (monetaryCapital == 0) {
		                    rsf.setMonetaryCapitalFormated("");
		                } else {
		                	rsf.setMonetaryCapitalFormated(df.format(monetaryCapital));
		                }
		            	
		            	//短期借款
		            	double shortTermBorrowing = rs.getDouble("shortTermBorrowing");
		            	if (shortTermBorrowing == 0) {
		                    rsf.setShortTermBorrowingFormated("");
		                } else {
		                	rsf.setShortTermBorrowingFormated(df.format(shortTermBorrowing));
		                }
		            	
		            	//一年内到期的非流动负债
		            	double nonCurrentLiabilitiesDueWithinOneYear = rs.getDouble("nonCurrentLiabilitiesDueWithinOneYear");
		            	if (nonCurrentLiabilitiesDueWithinOneYear == 0) {
		                    rsf.setNonCurrentLiabilitiesDueWithinOneYearFormated("");
		                } else {
		                	rsf.setNonCurrentLiabilitiesDueWithinOneYearFormated(df.format(nonCurrentLiabilitiesDueWithinOneYear));
		                }
		            	
		            	//长期借款
		            	double longTermLoan = rs.getDouble("longTermLoan");
		            	if (longTermLoan == 0) {
		                    rsf.setLongTermLoanFormated("");
		                } else {
		                	rsf.setLongTermLoanFormated(df.format(longTermLoan));
		                }
		            	
		            	//应付债券
		            	double bondsPayable = rs.getDouble("bondsPayable");
		            	if (bondsPayable == 0) {
		                    rsf.setBondsPayableFormated("");
		                } else {
		                	rsf.setBondsPayableFormated(df.format(bondsPayable));
		                }
		            	
		            	//长期应付款
		            	double longTermPayables = rs.getDouble("longTermPayables");
		            	if (longTermPayables == 0) {
		                    rsf.setLongTermPayablesFormated("");
		                } else {
		                	rsf.setLongTermPayablesFormated(df.format(longTermPayables));
		                }
		            	
		            	//有息负债(短期借款+一年内到期的非流动负债+长期借款+应付债券+长期应付款)
		            	double interestBearingLiabilities = rs.getDouble("interestBearingLiabilities");
		            	if (interestBearingLiabilities == 0) {
		                    rsf.setInterestBearingLiabilitiesFormated("");
		                } else {
		                	rsf.setInterestBearingLiabilitiesFormated(df.format(interestBearingLiabilities));
		                }
		            	
		            	//货币资金-有息负债
		            	double debtRepaymentRisk = rs.getDouble("debtRepaymentRisk");
		            	if (debtRepaymentRisk == 0) {
		                    rsf.setDebtRepaymentRiskFormated("");
		                } else {
		                	rsf.setDebtRepaymentRiskFormated(df.format(debtRepaymentRisk));
		                }
		            	
		            	//交易性金融资产中的理财产品
		            	double tradingFinancialAssetsManagement = rs.getDouble("tradingFinancialAssetsManagement");
		            	if (tradingFinancialAssetsManagement == 0) {
		                    rsf.setTradingFinancialAssetsManagementFormated("");
		                } else {
		                	rsf.setTradingFinancialAssetsManagementFormated(df.format(tradingFinancialAssetsManagement));
		                }
		            	
		            	//其他流动资产的理财产品
		            	double otherCurrentAssetsManagement = rs.getDouble("otherCurrentAssetsManagement");
		            	if (otherCurrentAssetsManagement == 0) {
		                    rsf.setOtherCurrentAssetsManagementFormated("");
		                } else {
		                	rsf.setOtherCurrentAssetsManagementFormated(df.format(otherCurrentAssetsManagement));
		                }
		            	
		            	//准货币资金
		            	double quasiMonetary = rs.getDouble("quasiMonetary");
		            	if (quasiMonetary == 0) {
		                    rsf.setQuasiMonetaryFormated("");
		                } else {
		                	rsf.setQuasiMonetaryFormated(df.format(quasiMonetary));
		                }
		            	
		            	//短期有息负债(短期借款+一年内到期的非流动负债)
		            	double shortTermForeignDebt = rs.getDouble("shortTermForeignDebt");
		            	if (shortTermForeignDebt == 0) {
		                    rsf.setShortTermForeignDebtFormated("");
		                } else {
		                	rsf.setShortTermForeignDebtFormated(df.format(shortTermForeignDebt));
		                }
		            	
		            	//准货币资金-短期有息负债
		            	double shortTermDebtRepaymentRisk = rs.getDouble("shortTermDebtRepaymentRisk");
		            	if (shortTermDebtRepaymentRisk == 0) {
		                    rsf.setShortTermDebtRepaymentRiskFormated("");
		                } else {
		                	rsf.setShortTermDebtRepaymentRiskFormated(df.format(shortTermDebtRepaymentRisk));
		                }
		            	
		            	//准货币资金占总资产比率
		            	double quasiMonetaryCapitalRatio= rs.getDouble("quasiMonetaryCapitalRatio");
		            	if(quasiMonetaryCapitalRatio ==0) {
		            		rsf.setQuasiMonetaryCapitalRatioFormated("");
		            	}else {
		            		rsf.setQuasiMonetaryCapitalRatioFormated(df1.format(quasiMonetaryCapitalRatio));
		            	}
		            	
		            	//应付票据
		            	double notesPayable = rs.getDouble("notesPayable");
		            	if (notesPayable == 0) {
		                    rsf.setNotesPayableFormated("");
		                } else {
		                	rsf.setNotesPayableFormated(df.format(notesPayable));
		                }
		            	
		            	//应付账款
		            	double accountsPayable = rs.getDouble("accountsPayable");
		            	if (accountsPayable == 0) {
		                    rsf.setAccountsPayableFormated("");
		                } else {
		                	rsf.setAccountsPayableFormated(df.format(accountsPayable));
		                }
		            	
		            	//预收款项
		            	double advanceReceipts = rs.getDouble("advanceReceipts");
		            	if (advanceReceipts == 0) {
		                    rsf.setAdvanceReceiptsFormated("");
		                } else {
		                	rsf.setAdvanceReceiptsFormated(df.format(advanceReceipts));
		                }
		            	
		            	//应付预收合计
		            	double totalAccountsPayablePrepaid = rs.getDouble("totalAccountsPayablePrepaid");
		            	if (totalAccountsPayablePrepaid == 0) {
		                    rsf.setTotalAccountsPayablePrepaidFormated("");
		                } else {
		                	rsf.setTotalAccountsPayablePrepaidFormated(df.format(totalAccountsPayablePrepaid));
		                }
		            	
		            	//应收票据
		            	double billReceivable = rs.getDouble("billReceivable");
		            	if (billReceivable == 0) {
		                    rsf.setBillReceivableFormated("");
		                } else {
		                	rsf.setBillReceivableFormated(df.format(billReceivable));
		                }
		            	
		            	//应收账款
		            	double accountsReceivable = rs.getDouble("accountsReceivable");
		            	if (accountsReceivable == 0) {
		                    rsf.setAccountsReceivableFormated("");
		                } else {
		                	rsf.setAccountsReceivableFormated(df.format(accountsReceivable));
		                }
		            	
		            	//应收款项融资
		            	double accountsReceivableFinancing = rs.getDouble("accountsReceivableFinancing");
		            	if (accountsReceivableFinancing == 0) {
		                    rsf.setAccountsReceivableFinancingFormated("");
		                } else {
		                	rsf.setAccountsReceivableFinancingFormated(df.format(accountsReceivableFinancing));
		                }
		            	
		            	//合同资产
		            	double contractAssets = rs.getDouble("contractAssets");
		            	if (contractAssets == 0) {
		                    rsf.setContractAssetsFormated("");
		                } else {
		                	rsf.setContractAssetsFormated(df.format(contractAssets));
		                }
		            	
		            	//预付款项
		            	double prepayments = rs.getDouble("prepayments");
		            	if (prepayments == 0) {
		                    rsf.setPrepaymentsFormated("");
		                } else {
		                	rsf.setPrepaymentsFormated(df.format(prepayments));
		                }
		            	
		            	//合同负债
		            	double contractLiabilities = rs.getDouble("contractLiabilities");
		            	if (contractLiabilities == 0) {
		                    rsf.setContractLiabilitiesFormated("");
		                } else {
		                	rsf.setContractLiabilitiesFormated(df.format(contractLiabilities));
		                }
		            	
		            	//应收预付合计
		            	double totalAccountsReceivablePrepayments = rs.getDouble("totalAccountsReceivablePrepayments");
		            	if (totalAccountsReceivablePrepayments == 0) {
		                    rsf.setTotalAccountsReceivablePrepaymentsFormated("");
		                } else {
		                	rsf.setTotalAccountsReceivablePrepaymentsFormated(df.format(totalAccountsReceivablePrepayments));
		                }
		            	
		            	//应付预收合计-应收预付合计
		            	double occupySomeoneElseFunds = rs.getDouble("occupySomeoneElseFunds");
		            	if (occupySomeoneElseFunds == 0) {
		                    rsf.setOccupySomeoneElseFundsFormated("");
		                } else {
		                	rsf.setOccupySomeoneElseFundsFormated(df.format(occupySomeoneElseFunds));
		                }
		            	
		            	//应收账款占总资产的比率
		            	double accountsReceivableRatio = rs.getDouble("accountsReceivableRatio");
		            	if (accountsReceivableRatio == 0) {
		                    rsf.setAccountsReceivableRatioFormated("");
		                } else {
		                	rsf.setAccountsReceivableRatioFormated(df1.format(accountsReceivableRatio));
		                }
		            	
		            	//固定资产
		            	double fixedAssets = rs.getDouble("fixedAssets");
		            	if (fixedAssets == 0) {
		                    rsf.setFixedAssetsFormated("");
		                } else {
		                	rsf.setFixedAssetsFormated(df.format(fixedAssets));
		                }
		            	
		            	//在建工程
		            	double constructionInProgress = rs.getDouble("constructionInProgress");
		            	if (constructionInProgress == 0) {
		                    rsf.setConstructionInProgressFormated("");
		                } else {
		                	rsf.setConstructionInProgressFormated(df.format(constructionInProgress));
		                }
		            	
		            	//固产合计
		            	double totalTFxedAssets = rs.getDouble("totalTFxedAssets");
		            	if (totalTFxedAssets == 0) {
		                    rsf.setTotalTFxedAssetsFormated("");
		                } else {
		                	rsf.setTotalTFxedAssetsFormated(df.format(totalTFxedAssets));
		                }
		            	
		            	//固产合计占总资产的比率
		            	double fixedAssetRatio = rs.getDouble("fixedAssetRatio");
		            	if (fixedAssetRatio == 0) {
		                    rsf.setFixedAssetRatioFormated("");
		                } else {
		                	rsf.setFixedAssetRatioFormated(df1.format(fixedAssetRatio));
		                }
		            	
		            	//交易性金融资产
		            	double tradingFinancialAssets = rs.getDouble("tradingFinancialAssets");
		            	if (tradingFinancialAssets == 0) {
		                    rsf.setTradingFinancialAssetsFormated("");
		                } else {
		                	rsf.setTradingFinancialAssetsFormated(df.format(tradingFinancialAssets));
		                }
		            	
		            	//其他非流动金融资产
		            	double otherNonCurrentFinancialAssets = rs.getDouble("otherNonCurrentFinancialAssets");
		            	if (otherNonCurrentFinancialAssets == 0) {
		                    rsf.setOtherNonCurrentFinancialAssetsFormated("");
		                } else {
		                	rsf.setOtherNonCurrentFinancialAssetsFormated(df.format(otherNonCurrentFinancialAssets));
		                }
		            	
		            	//投资性房地产
		            	double investmentRealEstate = rs.getDouble("investmentRealEstate");
		            	if (investmentRealEstate == 0) {
		                    rsf.setInvestmentRealEstateFormated("");
		                } else {
		                	rsf.setInvestmentRealEstateFormated(df.format(investmentRealEstate));
		                }
		            	
		            	//长期股权投资
		            	double longTermEquityInvestment = rs.getDouble("longTermEquityInvestment");
		            	if (longTermEquityInvestment == 0) {
		                    rsf.setLongTermEquityInvestmentFormated("");
		                } else {
		                	rsf.setLongTermEquityInvestmentFormated(df.format(longTermEquityInvestment));
		                }
		            	
		            	//投资类资产小计
		            	double subtotalOfInvestmentAssets = rs.getDouble("subtotalOfInvestmentAssets");
		            	if (subtotalOfInvestmentAssets == 0) {
		                    rsf.setSubtotalOfInvestmentAssetsFormated("");
		                } else {
		                	rsf.setSubtotalOfInvestmentAssetsFormated(df.format(subtotalOfInvestmentAssets));
		                }
		            	
		            	//投资类资产占总资产的比率
		            	double investmentAssetRatio = rs.getDouble("investmentAssetRatio");
		            	if (investmentAssetRatio == 0) {
		                    rsf.setInvestmentAssetRatioFormated("");
		                } else {
		                	rsf.setInvestmentAssetRatioFormated(df1.format(investmentAssetRatio));
		                }
		            	
		            	//无形资产
		            	double intangibleAssets = rs.getDouble("intangibleAssets");
		            	if (intangibleAssets == 0) {
		                    rsf.setIntangibleAssetsFormated("");
		                } else {
		                	rsf.setIntangibleAssetsFormated(df.format(intangibleAssets));
		                }
		            	
		            	//商誉
		            	double goodwill = rs.getDouble("goodwill");
		            	if (goodwill == 0) {
		                    rsf.setGoodwillFormated("");
		                } else {
		                	rsf.setGoodwillFormated(df.format(goodwill));
		                }
		            	
		            	//无形资产占比
		            	double theProportionOfIntangibleAssets = rs.getDouble("theProportionOfIntangibleAssets");
		            	if (theProportionOfIntangibleAssets == 0) {
		                    rsf.setTheProportionOfIntangibleAssetsFormated("");
		                } else {
		                	rsf.setTheProportionOfIntangibleAssetsFormated(df1.format(theProportionOfIntangibleAssets));
		                }
		            	
		            	//商誉占比
		            	double goodwillProportion = rs.getDouble("goodwillProportion");
		            	if (goodwillProportion == 0) {
		                    rsf.setGoodwillProportionFormated("");
		                } else {
		                	rsf.setGoodwillProportionFormated(df1.format(goodwillProportion));
		                }
		            	
		            	//应付职工薪酬
		            	double payrollPayable = rs.getDouble("payrollPayable");
		            	if (payrollPayable == 0) {
		                    rsf.setPayrollPayableFormated("");
		                } else {
		                	rsf.setPayrollPayableFormated(df.format(payrollPayable));
		                }
		            	
		            	//支付给职工以及为职工支付的现金
		            	double cashPaidToAndOnBehalfOfEmployees = rs.getDouble("cashPaidToAndOnBehalfOfEmployees");
		            	if (cashPaidToAndOnBehalfOfEmployees == 0) {
		                    rsf.setCashPaidToAndOnBehalfOfEmployeesFormated("");
		                } else {
		                	rsf.setCashPaidToAndOnBehalfOfEmployeesFormated(df.format(cashPaidToAndOnBehalfOfEmployees));
		                }
		            	
		            	//当年职工总薪酬
		            	double totalEmployeeCompensation = rs.getDouble("totalEmployeeCompensation");
		            	if (totalEmployeeCompensation == 0) {
		                    rsf.setTotalEmployeeCompensationFormated("");
		                } else {
		                	rsf.setTotalEmployeeCompensationFormated(df.format(totalEmployeeCompensation));
		                }
		            	
		            	//总人数
		            	int totalNumberOfPeople = rs.getInt("totalNumberOfPeople");
		            	rsf.setTotalNumberOfPeople(totalNumberOfPeople);
		            	
		            	//财报年份
		            	int reportYear = rs.getInt("reportYear");
		            	rsf.setReportYear(reportYear);
		            	
		            	//人均年薪
		            	double perCapitaAnnualSalary = rs.getDouble("perCapitaAnnualSalary");
		            	if (perCapitaAnnualSalary == 0) {
		                    rsf.setPerCapitaAnnualSalaryFormated("");
		                } else {
		                	rsf.setPerCapitaAnnualSalaryFormated(df.format(perCapitaAnnualSalary));
		                }
		            	
		            	//人均月薪
		            	double perCapitaMonthlySalary = rs.getDouble("perCapitaMonthlySalary");
		            	if (perCapitaMonthlySalary == 0) {
		                    rsf.setPerCapitaMonthlySalaryFormated("");
		                } else {
		                	rsf.setPerCapitaMonthlySalaryFormated(df.format(perCapitaMonthlySalary));
		                }
		            	
		            	//营业收入
		            	double operatingRevenue = rs.getDouble("operatingRevenue");
		            	if (operatingRevenue == 0) {
		                    rsf.setOperatingRevenueFormated("");
		                } else {
		                	rsf.setOperatingRevenueFormated(df.format(operatingRevenue));
		                }
		            	
		            	//营业收入增长率
		            	double revenueGrowthRate = rs.getDouble("revenueGrowthRate");
		            	if (revenueGrowthRate == 0) {
		                    rsf.setRevenueGrowthRateFormated("");
		                } else {
		                	rsf.setRevenueGrowthRateFormated(df1.format(revenueGrowthRate));
		                }
		            	
		            	//总资产周转率
		            	double totalAssetTurnover = rs.getDouble("totalAssetTurnover");
		            	if (totalAssetTurnover == 0) {
		                    rsf.setTotalAssetTurnoverFormated("");
		                } else {
		                	rsf.setTotalAssetTurnoverFormated(df1.format(totalAssetTurnover));
		                }
		            	
		            	//销售商品、提供劳务收到的现金
		            	double cashReceivedFromSellingGoodsAndProvidingServices = rs.getDouble("cashReceivedFromSellingGoodsAndProvidingServices");
		            	if (cashReceivedFromSellingGoodsAndProvidingServices == 0) {
		                    rsf.setCashReceivedFromSellingGoodsAndProvidingServicesFormated("");
		                } else {
		                	rsf.setCashReceivedFromSellingGoodsAndProvidingServicesFormated(df.format(cashReceivedFromSellingGoodsAndProvidingServices));
		                }
		            	
		            	//销售商品、提供劳务收到的现金占营收的比率
		            	double proportionOfCashSellingGoodsProvidingServices = rs.getDouble("proportionOfCashSellingGoodsProvidingServices");
		            	if (proportionOfCashSellingGoodsProvidingServices == 0) {
		                    rsf.setProportionOfCashSellingGoodsProvidingServicesFormated("");
		                } else {
		                	rsf.setProportionOfCashSellingGoodsProvidingServicesFormated(df1.format(proportionOfCashSellingGoodsProvidingServices));
		                }
		            	
		            	//其他应收款
		            	double otherReceivables = rs.getDouble("otherReceivables");
		            	if (otherReceivables == 0) {
		                    rsf.setOtherReceivablesFormated("");
		                } else {
		                	rsf.setOtherReceivablesFormated(df.format(otherReceivables));
		                }
		            	
		            	//存货
		            	double inventory = rs.getDouble("inventory");
		            	if (inventory == 0) {
		                    rsf.setInventoryFormated("");
		                } else {
		                	rsf.setInventoryFormated(df.format(inventory));
		                }
		            	
		            	//存货增长率
		            	double inventoryGrowthRate = rs.getDouble("inventoryGrowthRate");
		            	if (inventoryGrowthRate == 0) {
		                    rsf.setInventoryGrowthRateFormated("");
		                } else {
		                	rsf.setInventoryGrowthRateFormated(df1.format(inventoryGrowthRate));
		                }
		            	
		            	//应收账款/总资产
		            	double accountsReceivablePercentageOfRevenue = rs.getDouble("accountsReceivablePercentageOfRevenue");
		            	if (accountsReceivablePercentageOfRevenue == 0) {
		                    rsf.setAccountsReceivablePercentageOfRevenueFormated("");
		                } else {
		                	rsf.setAccountsReceivablePercentageOfRevenueFormated(df1.format(accountsReceivablePercentageOfRevenue));
		                }
		            	
		            	//预付款项/总资产
		            	double prepaymentsPercentageOfRevenue = rs.getDouble("prepaymentsPercentageOfRevenue");
		            	if (prepaymentsPercentageOfRevenue == 0) {
		                    rsf.setPrepaymentsPercentageOfRevenueFormated("");
		                } else {
		                	rsf.setPrepaymentsPercentageOfRevenueFormated(df1.format(prepaymentsPercentageOfRevenue));
		                }
		            	
		            	//其他应收款/总资产
		            	double otherReceivablesPercentageOfRevenue = rs.getDouble("otherReceivablesPercentageOfRevenue");
		            	if (otherReceivablesPercentageOfRevenue == 0) {
		                    rsf.setOtherReceivablesPercentageOfRevenueFormated("");
		                } else {
		                	rsf.setOtherReceivablesPercentageOfRevenueFormated(df1.format(otherReceivablesPercentageOfRevenue));
		                }
		            	
		            	//存货/总资产
		            	double inventoryToRevenueRatio = rs.getDouble("inventoryToRevenueRatio");
		            	if (inventoryToRevenueRatio == 0) {
		                    rsf.setInventoryToRevenueRatioFormated("");
		                } else {
		                	rsf.setInventoryToRevenueRatioFormated(df1.format(inventoryToRevenueRatio));
		                }
		            	
		            	//营业成本
		            	double operatingCosts = rs.getDouble("operatingCosts");
		            	if (operatingCosts == 0) {
		                    rsf.setOperatingCostsFormated("");
		                } else {
		                	rsf.setOperatingCostsFormated(df.format(operatingCosts));
		                }
		            	
		            	//毛利率
		            	double grossMargin = rs.getDouble("grossMargin");
		            	if (grossMargin == 0) {
		                    rsf.setGrossMarginFormated("");
		                } else {
		                	rsf.setGrossMarginFormated(df1.format(grossMargin));
		                }
		            	
		            	//销售费用
		            	double sellingExpenses = rs.getDouble("sellingExpenses");
		            	if (sellingExpenses == 0) {
		                    rsf.setSellingExpensesFormated("");
		                } else {
		                	rsf.setSellingExpensesFormated(df.format(sellingExpenses));
		                }
		            	
		            	//销售费用率
		            	double salesExpenseRate = rs.getDouble("salesExpenseRate");
		            	if (salesExpenseRate == 0) {
		                    rsf.setSalesExpenseRateFormated("");
		                } else {
		                	rsf.setSalesExpenseRateFormated(df1.format(salesExpenseRate));
		                }
		            	
		            	//管理费用
		            	double overhead = rs.getDouble("overhead");
		            	if (overhead == 0) {
		                    rsf.setOverheadFormated("");
		                } else {
		                	rsf.setOverheadFormated(df.format(overhead));
		                }
		            	
		            	//管理费用率
		            	double managementExpenseRate = rs.getDouble("managementExpenseRate");
		            	if (managementExpenseRate == 0) {
		                    rsf.setManagementExpenseRateFormated("");
		                } else {
		                	rsf.setManagementExpenseRateFormated(df1.format(managementExpenseRate));
		                }
		            	
		            	//研发费用
		            	double researchAndDevelopment = rs.getDouble("researchAndDevelopment");
		            	if (researchAndDevelopment == 0) {
		                    rsf.setResearchAndDevelopmentFormated("");
		                } else {
		                	rsf.setResearchAndDevelopmentFormated(df.format(researchAndDevelopment));
		                }
		            	
		            	//研发费用率
		            	double researchAndDevelopmentRate = rs.getDouble("researchAndDevelopmentRate");
		            	if (researchAndDevelopmentRate == 0) {
		                    rsf.setResearchAndDevelopmentRateFormated("");
		                } else {
		                	rsf.setResearchAndDevelopmentRateFormated(df1.format(researchAndDevelopmentRate));
		                }
		            	
		            	//财务费用
		            	double financialExpenses = rs.getDouble("financialExpenses");
		            	if (financialExpenses == 0) {
		                    rsf.setFinancialExpensesFormated("");
		                } else {
		                	rsf.setFinancialExpensesFormated(df.format(financialExpenses));
		                }
		            	
		            	//费用率
		            	double expense = rs.getDouble("expense");
		            	if (expense == 0) {
		                    rsf.setExpenseFormated("");
		                } else {
		                	rsf.setExpenseFormated(df1.format(expense));
		                }
		            	
		            	//费用率占毛利率的比率
		            	double expenseRateToGrossProfitMargin = rs.getDouble("expenseRateToGrossProfitMargin");
		            	if (expense == 0) {
		                    rsf.setExpenseRateToGrossProfitMarginFormated("");
		                } else {
		                	rsf.setExpenseRateToGrossProfitMarginFormated(df1.format(expenseRateToGrossProfitMargin));
		                }
		            	
		            	//税金及附加
		            	double taxesAndSurcharges = rs.getDouble("taxesAndSurcharges");
		            	if (taxesAndSurcharges == 0) {
		                    rsf.setTaxesAndSurchargesFormated("");
		                } else {
		                	rsf.setTaxesAndSurchargesFormated(df.format(taxesAndSurcharges));
		                }
		            	
		            	//四项费用
		            	double fourExpenses = rs.getDouble("fourExpenses");
		            	if (fourExpenses == 0) {
		                    rsf.setFourExpensesFormated("");
		                } else {
		                	rsf.setFourExpensesFormated(df.format(fourExpenses));
		                }
		            	
		            	//利润总额
		            	double totalProfit = rs.getDouble("totalProfit");
		            	if (totalProfit == 0) {
		                    rsf.setTotalProfitFormated("");
		                } else {
		                	rsf.setTotalProfitFormated(df.format(totalProfit));
		                }
		            	
		            	//主营利润
		            	double mainProfit = rs.getDouble("mainProfit");
		            	if (mainProfit == 0) {
		                    rsf.setMainProfitFormated("");
		                } else {
		                	rsf.setMainProfitFormated(df.format(mainProfit));
		                }
		            	
		            	//主营利润率
		            	double mainProfitMargin = rs.getDouble("mainProfitMargin");
		            	if (mainProfitMargin == 0) {
		                    rsf.setMainProfitMarginFormated("");
		                } else {
		                	rsf.setMainProfitMarginFormated(df1.format(mainProfitMargin));
		                }
		            	
		            	//营业利润
		            	double operatingProfit = rs.getDouble("operatingProfit");
		            	if (mainProfit == 0) {
		                    rsf.setOperatingProfitFormated("");
		                } else {
		                	rsf.setOperatingProfitFormated(df.format(operatingProfit));
		                }
		            	
		            	//主营利润占营业利润比例
		            	double operatingMargin = rs.getDouble("operatingMargin");
		            	if (operatingMargin == 0) {
		                    rsf.setOperatingMarginFormated("");
		                } else {
		                	rsf.setOperatingMarginFormated(df1.format(operatingMargin));
		                }
		            	
		            	//主营利润占利润总额的比例
		            	double mainOperatingProfitToTotalProfit = rs.getDouble("mainOperatingProfitToTotalProfit");
		            	if (mainOperatingProfitToTotalProfit == 0) {
		                    rsf.setMainOperatingProfitToTotalProfitFormated("");
		                } else {
		                	rsf.setMainOperatingProfitToTotalProfitFormated(df1.format(mainOperatingProfitToTotalProfit));
		                }
		            	
		            	//净利润
		            	double netProfit = rs.getDouble("netProfit");
		            	if (netProfit == 0) {
		                    rsf.setNetProfitFormated("");
		                } else {
		                	rsf.setNetProfitFormated(df.format(netProfit));
		                }
		            	
		            	//净利润增长率
		            	double netProfitGrowthRate = rs.getDouble("netProfitGrowthRate");
		            	if (netProfitGrowthRate == 0) {
		                    rsf.setNetProfitGrowthRateFormated("");
		                } else {
		                	rsf.setNetProfitGrowthRateFormated(df1.format(netProfitGrowthRate));
		                }
		            	
		            	//净利润率
		            	double netProfitMargin = rs.getDouble("netProfitMargin");
		            	if (netProfitMargin == 0) {
		                    rsf.setNetProfitMarginFormated("");
		                } else {
		                	rsf.setNetProfitMarginFormated(df1.format(netProfitMargin));
		                }
		            	
		            	//经营活动产生的现金流量净额
		            	double netCashFlowFromOperating = rs.getDouble("netCashFlowFromOperating");
		            	if (netCashFlowFromOperating == 0) {
		                    rsf.setNetCashFlowFromOperatingFormated("");
		                } else {
		                	rsf.setNetCashFlowFromOperatingFormated(df.format(netCashFlowFromOperating));
		                }
		            	
		            	//经营活动产生的现金流量净额同比增长
		            	double growthRateOfNetCashFlowFromOperating = rs.getDouble("growthRateOfNetCashFlowFromOperating");
		            	if (growthRateOfNetCashFlowFromOperating == 0) {
		                    rsf.setGrowthRateOfNetCashFlowFromOperatingFormated("");
		                } else {
		                	rsf.setGrowthRateOfNetCashFlowFromOperatingFormated(df1.format(growthRateOfNetCashFlowFromOperating));
		                }
		            	
		            	//净利润现金比率
		            	double netProfitCashRatio = rs.getDouble("netProfitCashRatio");
		            	if (netProfitCashRatio == 0) {
		                    rsf.setNetProfitCashRatioFormated("");
		                } else {
		                	rsf.setNetProfitCashRatioFormated(df1.format(netProfitCashRatio));
		                }
		            	
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
		            	
		            	//ROE
		            	double ROE = rs.getDouble("ROE");
		            	if (ROE == 0) {
		                    rsf.setROEFormated("");
		                } else {
		                	rsf.setROEFormated(df1.format(ROE));
		                }
		            	
		            	//固定资产折旧
		            	double depreciation = rs.getDouble("depreciation");
		            	if (depreciation == 0) {
		                    rsf.setDepreciationFormated("");
		                } else {
		                	rsf.setDepreciationFormated(df.format(depreciation));
		                }
		            	
		            	//无形资产摊销
		            	double amortizationOfIntangibleAssets = rs.getDouble("amortizationOfIntangibleAssets");
		            	if (amortizationOfIntangibleAssets == 0) {
		                    rsf.setAmortizationOfIntangibleAssetsFormated("");
		                } else {
		                	rsf.setAmortizationOfIntangibleAssetsFormated(df.format(amortizationOfIntangibleAssets));
		                }
		            	
		            	//现金股利(分配股利、利润或偿付利息支付的现金)
		            	double cashPaidForDistributingDividendsProfitsPayingInterest = rs.getDouble("cashPaidForDistributingDividendsProfitsPayingInterest");
		            	if (cashPaidForDistributingDividendsProfitsPayingInterest == 0) {
		                    rsf.setCashPaidForDistributingDividendsProfitsPayingInterestFormated("");
		                } else {
		                	rsf.setCashPaidForDistributingDividendsProfitsPayingInterestFormated(df.format(cashPaidForDistributingDividendsProfitsPayingInterest));
		                }
		            	
		            	//经营活动产生的现金流量净额减去以上三项的余额
		            	double remainingCash = rs.getDouble("remainingCash");
		            	if (remainingCash == 0) {
		                    rsf.setRemainingCashFormated("");
		                } else {
		                	rsf.setRemainingCashFormated(df.format(remainingCash));
		                }
		            	
		            	//购建固定资产、无形资产和其他长期资产支付的现金
		            	double cashPaidForPurchaseConstructionFixedIntangibleLongTermAssets = rs.getDouble("cashPaidForPurchaseConstructionFixedIntangibleLongTermAssets");
		            	if (cashPaidForPurchaseConstructionFixedIntangibleLongTermAssets == 0) {
		                    rsf.setCashPaidForPurchaseConstructionFixedIntangibleLongTermAssetsFormated("");
		                } else {
		                	rsf.setCashPaidForPurchaseConstructionFixedIntangibleLongTermAssetsFormated(df.format(cashPaidForPurchaseConstructionFixedIntangibleLongTermAssets));
		                }
		            	
		            	//处置固定、无形和其他长期资产收回现金
		            	double netCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssets = rs.getDouble("netCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssets");
		            	if (netCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssets == 0) {
		                    rsf.setNetCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssetsFormated("");
		                } else {
		                	rsf.setNetCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssetsFormated(df.format(netCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssets));
		                }
		            	
		            	//购建固产占经营活动产生的现金比
		            	double purchaseConstructionFixedIntangibleLongTermAssetsProportion = rs.getDouble("purchaseConstructionFixedIntangibleLongTermAssetsProportion");
		            	if (purchaseConstructionFixedIntangibleLongTermAssetsProportion == 0) {
		                    rsf.setPurchaseConstructionFixedIntangibleLongTermAssetsProportionFormated("");
		                } else {
		                	rsf.setPurchaseConstructionFixedIntangibleLongTermAssetsProportionFormated(df1.format(purchaseConstructionFixedIntangibleLongTermAssetsProportion));
		                }
		            	
		            	//处置固定资产、无形资产和其他长期资产收回的现金净额占购建资产支付的现金比
		            	double netCashReceivedFromDisposalProportionTopurchase = rs.getDouble("netCashReceivedFromDisposalProportionTopurchase");
		            	if (netCashReceivedFromDisposalProportionTopurchase == 0) {
		                    rsf.setNetCashReceivedFromDisposalProportionTopurchaseFormated("");
		                } else {
		                	rsf.setNetCashReceivedFromDisposalProportionTopurchaseFormated(df1.format(netCashReceivedFromDisposalProportionTopurchase));
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
		            	
		            	//投资活动产生的现金流量净额
		            	double netCashFlowGeneratedFromInvestmentActivities = rs.getDouble("netCashFlowGeneratedFromInvestmentActivities");
		            	if (netCashFlowGeneratedFromInvestmentActivities == 0) {
		                    rsf.setNetCashFlowGeneratedFromInvestmentActivitiesFormated("");
		                } else {
		                	rsf.setNetCashFlowGeneratedFromInvestmentActivitiesFormated(df.format(netCashFlowGeneratedFromInvestmentActivities));
		                }
		            	
		            	//筹资活动产生的现金流量净额
		            	double netCashFlowGeneratedFromFinancingActivities = rs.getDouble("netCashFlowGeneratedFromFinancingActivities");
		            	if (netCashFlowGeneratedFromFinancingActivities == 0) {
		                    rsf.setNetCashFlowGeneratedFromFinancingActivitiesFormated("");
		                } else {
		                	rsf.setNetCashFlowGeneratedFromFinancingActivitiesFormated(df.format(netCashFlowGeneratedFromFinancingActivities));
		                }
		            	
		            	//现金及现金等价物净增加额
		            	double netIncreaseInCashAndCashEquivalents = rs.getDouble("netIncreaseInCashAndCashEquivalents");
		            	if (netIncreaseInCashAndCashEquivalents == 0) {
		                    rsf.setNetIncreaseInCashAndCashEquivalentsFormated("");
		                } else {
		                	rsf.setNetIncreaseInCashAndCashEquivalentsFormated(df.format(netIncreaseInCashAndCashEquivalents));
		                }
		            	
		            	//公司类型
		            	String companyType =rs.getString("companyType");
		            	rsf.setCompanyType(companyType);
		            	
		            	//加现金分红的现金及现金等价物净增加额
		            	double netIncreaseInCashAndCashEquivalentsAddBonus = rs.getDouble("netIncreaseInCashAndCashEquivalentsAddBonus");
		            	if (netIncreaseInCashAndCashEquivalentsAddBonus == 0) {
		                    rsf.setNetIncreaseInCashAndCashEquivalentsAddBonusFormated("");
		                } else {
		                	rsf.setNetIncreaseInCashAndCashEquivalentsAddBonusFormated(df.format(netIncreaseInCashAndCashEquivalentsAddBonus));
		                }
		            	
		            	//期末现金及现金等价物余额
		            	double closingBalanceOfCashAndCashEquivalents = rs.getDouble("closingBalanceOfCashAndCashEquivalents");
		            	if (closingBalanceOfCashAndCashEquivalents == 0) {
		                    rsf.setClosingBalanceOfCashAndCashEquivalentsFormated("");
		                } else {
		                	rsf.setClosingBalanceOfCashAndCashEquivalentsFormated(df.format(closingBalanceOfCashAndCashEquivalents));
		                }
		            	
		            	//创建时间
		            	String createDateTime =rs.getString("createDateTime");
		            	rsf.setCreateDateTime(createDateTime);
		            	
		            	//数据来源：页面确认，自动触发
		            	String dataResource =rs.getString("dataResource");
		            	rsf.setDataResource(dataResource);
		            	
		            	list.add(rsf);
		            }
				}
			}catch (SQLException e) {
		        e.printStackTrace();
		    }

		    return list;
		}
		
		//获取单个企业最后五个财年内的指标信息(用于做图表)
		public ArrayList<Reportsummary> getReportstatisticsForChart(String AShareCode){
			ArrayList<Reportsummary> list= new ArrayList<Reportsummary>();
			String sql="select * from reportstatistics where AShareCode=?  order by reportYear asc limit 5";
			try(PreparedStatement statement=con.prepareStatement(sql)){
				statement.setString(1, AShareCode);
			
				try (ResultSet rs = statement.executeQuery()) {
		            while (rs.next()) {
		            	Reportsummary rf= new Reportsummary();
		            	
		            	rf.setAShareCode(rs.getString("AShareCode"));
		            	rf.setAShareName(rs.getString("AShareName"));
		            	rf.setPrimaryIndustry(rs.getString("primaryIndustry"));
		            	rf.setSecondaryIndustry(rs.getString("secondaryIndustry"));
		            	rf.setFinancialReportingYear(rs.getString("financialReportingYear"));
		            	rf.setThirdLevelIndustry(rs.getString("thirdLevelIndustry"));
		            	rf.setRegion(rs.getString("region"));
		            	rf.setFinancialReportingYear(rs.getString("financialReportingYear"));
		            	rf.setReportYear(rs.getInt("reportYear"));
		            	
		            	rf.setTotalAssets(rs.getDouble("totalAssets"));
		            	rf.setTotalAssetsGrowthRate(rs.getDouble("totalAssetsGrowthRate"));
		            	rf.setTotalOwnersEquity(rs.getDouble("totalOwnersEquity"));
		            	rf.setEquityMultiplier(rs.getDouble("equityMultiplier"));
		            	rf.setTotalLiabilities(rs.getDouble("totalLiabilities"));
		            	rf.setAssetLiabilityRatio(rs.getDouble("assetLiabilityRatio"));
		            	rf.setMonetaryCapital(rs.getDouble("monetaryCapital"));
		            	rf.setShortTermBorrowing(rs.getDouble("shortTermBorrowing"));
		            	rf.setNonCurrentLiabilitiesDueWithinOneYear(rs.getDouble("nonCurrentLiabilitiesDueWithinOneYear"));
		            	rf.setLongTermLoan(rs.getDouble("longTermLoan"));
		            	rf.setBondsPayable(rs.getDouble("bondsPayable"));
		            	rf.setLongTermPayables(rs.getDouble("longTermPayables"));
		            	rf.setInterestBearingLiabilities(rs.getDouble("interestBearingLiabilities"));
		            	rf.setDebtRepaymentRisk(rs.getDouble("debtRepaymentRisk"));
		            	rf.setTradingFinancialAssetsManagement(rs.getDouble("tradingFinancialAssetsManagement"));
		            	rf.setOtherCurrentAssetsManagement(rs.getDouble("otherCurrentAssetsManagement"));
		            	rf.setQuasiMonetary(rs.getDouble("quasiMonetary"));
		            	rf.setShortTermForeignDebt(rs.getDouble("shortTermForeignDebt"));
		            	rf.setShortTermDebtRepaymentRisk(rs.getDouble("shortTermDebtRepaymentRisk"));
		            	rf.setQuasiMonetaryCapitalRatio(rs.getDouble("quasiMonetaryCapitalRatio"));
		            	rf.setNotesPayable(rs.getDouble("notesPayable"));
		            	rf.setAccountsPayable(rs.getDouble("accountsPayable"));
		            	rf.setAdvanceReceipts(rs.getDouble("advanceReceipts"));
		            	rf.setTotalAccountsPayablePrepaid(rs.getDouble("totalAccountsPayablePrepaid"));
		            	rf.setBillReceivable(rs.getDouble("billReceivable"));
		            	rf.setAccountsReceivable(rs.getDouble("accountsReceivable"));
		            	rf.setAccountsReceivableFinancing(rs.getDouble("accountsReceivableFinancing"));
		            	rf.setContractAssets(rs.getDouble("contractAssets"));
		            	rf.setPrepayments(rs.getDouble("prepayments"));
		            	rf.setContractLiabilities(rs.getDouble("contractLiabilities"));
		            	rf.setTotalAccountsReceivablePrepayments(rs.getDouble("totalAccountsReceivablePrepayments"));
		            	rf.setOccupySomeoneElseFunds(rs.getDouble("occupySomeoneElseFunds"));
		            	rf.setAccountsReceivableRatio(rs.getDouble("accountsReceivableRatio"));
		            	rf.setFixedAssets(rs.getDouble("fixedAssets"));
		            	rf.setConstructionInProgress(rs.getDouble("constructionInProgress"));
		            	rf.setTotalTFxedAssets(rs.getDouble("totalTFxedAssets"));
		            	rf.setFixedAssetRatio(rs.getDouble("fixedAssetRatio"));
		            	rf.setTradingFinancialAssets(rs.getDouble("tradingFinancialAssets"));
		            	rf.setOtherNonCurrentFinancialAssets(rs.getDouble("otherNonCurrentFinancialAssets"));
		            	rf.setInvestmentRealEstate(rs.getDouble("investmentRealEstate"));
		            	rf.setLongTermEquityInvestment(rs.getDouble("longTermEquityInvestment"));
		            	rf.setSubtotalOfInvestmentAssets(rs.getDouble("subtotalOfInvestmentAssets"));
		            	rf.setInvestmentAssetRatio(rs.getDouble("investmentAssetRatio"));
		            	rf.setIntangibleAssets(rs.getDouble("intangibleAssets"));
		            	rf.setGoodwill(rs.getDouble("goodwill"));
		            	rf.setTheProportionOfIntangibleAssets(rs.getDouble("theProportionOfIntangibleAssets"));
		            	rf.setGoodwillProportion(rs.getDouble("goodwillProportion"));
		            	rf.setPayrollPayable(rs.getDouble("payrollPayable"));
		            	rf.setCashPaidToAndOnBehalfOfEmployees(rs.getDouble("cashPaidToAndOnBehalfOfEmployees"));
		            	rf.setTotalEmployeeCompensation(rs.getDouble("totalEmployeeCompensation"));
		            	rf.setTotalNumberOfPeople(rs.getInt("totalNumberOfPeople"));
		            	rf.setPerCapitaAnnualSalary(rs.getDouble("perCapitaAnnualSalary"));
		            	rf.setPerCapitaMonthlySalary(rs.getDouble("perCapitaMonthlySalary"));
		            	rf.setOperatingRevenue(rs.getDouble("operatingRevenue"));
		            	rf.setRevenueGrowthRate(rs.getDouble("revenueGrowthRate"));
		            	rf.setTotalAssetTurnover(rs.getDouble("totalAssetTurnover"));
		            	rf.setCashReceivedFromSellingGoodsAndProvidingServices(rs.getDouble("cashReceivedFromSellingGoodsAndProvidingServices"));
		            	rf.setProportionOfCashSellingGoodsProvidingServices(rs.getDouble("proportionOfCashSellingGoodsProvidingServices"));
		            	rf.setOtherReceivables(rs.getDouble("otherReceivables"));
		            	rf.setInventory(rs.getDouble("inventory"));
		            	rf.setInventoryGrowthRate(rs.getDouble("inventoryGrowthRate"));
		            	rf.setAccountsReceivablePercentageOfRevenue(rs.getDouble("accountsReceivablePercentageOfRevenue"));
		            	rf.setPrepaymentsPercentageOfRevenue(rs.getDouble("prepaymentsPercentageOfRevenue"));
		            	rf.setOtherReceivablesPercentageOfRevenue(rs.getDouble("otherReceivablesPercentageOfRevenue"));
		            	rf.setInventoryToRevenueRatio(rs.getDouble("inventoryToRevenueRatio"));
		            	rf.setOperatingCosts(rs.getDouble("operatingCosts"));
		            	rf.setGrossMargin(rs.getDouble("grossMargin"));
		            	rf.setSellingExpenses(rs.getDouble("sellingExpenses"));
		            	rf.setSalesExpenseRate(rs.getDouble("salesExpenseRate"));
		            	rf.setOverhead(rs.getDouble("overhead"));
		            	rf.setManagementExpenseRate(rs.getDouble("managementExpenseRate"));
		            	rf.setResearchAndDevelopment(rs.getDouble("researchAndDevelopment"));
		            	rf.setResearchAndDevelopmentRate(rs.getDouble("researchAndDevelopmentRate"));
		            	rf.setFinancialExpenses(rs.getDouble("financialExpenses"));
		            	rf.setExpense(rs.getDouble("expense"));
		            	rf.setExpenseRateToGrossProfitMargin(rs.getDouble("expenseRateToGrossProfitMargin"));
		            	rf.setTaxesAndSurcharges(rs.getDouble("taxesAndSurcharges"));
		            	rf.setFourExpenses(rs.getDouble("fourExpenses"));
		            	rf.setTotalProfit(rs.getDouble("totalProfit"));
		            	rf.setMainProfit(rs.getDouble("mainProfit"));
		            	rf.setMainProfitMargin(rs.getDouble("mainProfitMargin"));
		            	rf.setMainOperatingProfitToTotalProfit(rs.getDouble("mainOperatingProfitToTotalProfit"));
		            	rf.setOperatingProfit(rs.getDouble("operatingProfit"));
		            	rf.setOperatingMargin(rs.getDouble("operatingMargin"));
		            	rf.setNetProfit(rs.getDouble("netProfit"));
		            	rf.setNetProfitGrowthRate(rs.getDouble("netProfitGrowthRate"));
		            	rf.setNetProfitMargin(rs.getDouble("netProfitMargin"));
		            	rf.setNetCashFlowFromOperating(rs.getDouble("netCashFlowFromOperating"));
		            	rf.setGrowthRateOfNetCashFlowFromOperating(rs.getDouble("growthRateOfNetCashFlowFromOperating"));
		            	rf.setNetProfitCashRatio(rs.getDouble("netProfitCashRatio"));
		            	rf.setNetIncomeAttributableToShareholders(rs.getDouble("netIncomeAttributableToShareholders"));
		            	rf.setGrowthRateOfNetIncomeAttributableToShareholders(rs.getDouble("growthRateOfNetIncomeAttributableToShareholders"));
		            	rf.setDepreciation(rs.getDouble("depreciation"));
		            	rf.setAmortizationOfIntangibleAssets(rs.getDouble("amortizationOfIntangibleAssets"));
		            	rf.setCashPaidForDistributingDividendsProfitsPayingInterest(rs.getDouble("cashPaidForDistributingDividendsProfitsPayingInterest"));
		            	rf.setRemainingCash(rs.getDouble("remainingCash"));
		            	rf.setCashPaidForPurchaseConstructionFixedIntangibleLongTermAssets(rs.getDouble("cashPaidForPurchaseConstructionFixedIntangibleLongTermAssets"));
		            	rf.setNetCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssets(rs.getDouble("netCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssets"));
		            	rf.setPurchaseConstructionFixedIntangibleLongTermAssetsProportion(rs.getDouble("purchaseConstructionFixedIntangibleLongTermAssetsProportion"));
		            	rf.setNetCashReceivedFromDisposalProportionTopurchase(rs.getDouble("netCashReceivedFromDisposalProportionTopurchase"));
		            	rf.setFinancialReportDividends(rs.getDouble("financialReportDividends"));
		            	rf.setDividendRate(rs.getDouble("dividendRate"));
		            	rf.setNetCashFlowGeneratedFromInvestmentActivities(rs.getDouble("netCashFlowGeneratedFromInvestmentActivities"));
		            	rf.setNetCashFlowGeneratedFromFinancingActivities(rs.getDouble("netCashFlowGeneratedFromFinancingActivities"));
		            	rf.setCompanyType(rs.getString("companyType"));
		            	rf.setNetIncreaseInCashAndCashEquivalents(rs.getDouble("netIncreaseInCashAndCashEquivalents"));
		            	rf.setNetIncreaseInCashAndCashEquivalentsAddBonus(rs.getDouble("netIncreaseInCashAndCashEquivalentsAddBonus"));
		            	rf.setClosingBalanceOfCashAndCashEquivalents(rs.getDouble("closingBalanceOfCashAndCashEquivalents"));
		            	rf.setCreateDateTime(rs.getString("createDateTime"));
		            	rf.setROE(rs.getDouble("ROE"));
		            	
		            	list.add(rf);
		            }
				}
			}catch (SQLException e) {
		        e.printStackTrace();
		    }

		    return list;
		}
		
		
		//查询指标信息
		public ArrayList<ReportSummaryFormated> queryReportstatistics(String AShareCode ,String AShareName, String financialReportingYear, String totalAssetsFormated, String totalAssetsGrowthRateFormated, 
				String revenueGrowthRateFormated, String assetLiabilityRatioFormated, String dividendRateFormated, String grossMarginFormated, String netProfitGrowthRateFormated, String netProfitCashRatioFormated, String ROEFormated, String industry1, String industry2, String industry3, String region){
			
			ArrayList<ReportSummaryFormated> list= new ArrayList<ReportSummaryFormated>();
			
			String sql="select * from reportstatistics where 1=1";
			ArrayList<Object> params = new ArrayList<>();
			
			if (AShareCode != null && !AShareCode.isEmpty()) {
			    sql += " and AShareCode=?";
			    params.add(AShareCode);
			}
			
			if (AShareName != null && !AShareName.isEmpty()) {
				sql += " and AShareName like ?";
			    params.add("%" + AShareName + "%");
			}
			
			if (financialReportingYear != null && !financialReportingYear.isEmpty()) {
			    sql += " and financialReportingYear=?";
			    params.add(financialReportingYear);
			}
			
			if (totalAssetsFormated != null && !totalAssetsFormated.isEmpty()) {
				double totalAssets1;
				totalAssets1=Double.parseDouble(totalAssetsFormated.replace(",", ""));
			    sql += " and totalAssets>?";
			    params.add(totalAssets1);
			}
			
			if (totalAssetsGrowthRateFormated != null && !totalAssetsGrowthRateFormated.isEmpty()) {
				double totalAssetsGrowthRate1;
				totalAssetsGrowthRate1=Double.parseDouble(totalAssetsGrowthRateFormated.replace("%", ""))/100;
			    sql += " and totalAssetsGrowthRate>?";
			    params.add(totalAssetsGrowthRate1);
			}
			
			if (revenueGrowthRateFormated != null && !revenueGrowthRateFormated.isEmpty()) {
				double revenueGrowthRate1;
				revenueGrowthRate1=Double.parseDouble(revenueGrowthRateFormated.replace("%", ""))/100;
			    sql += " and revenueGrowthRate>?";
			    params.add(revenueGrowthRate1);
			}
			
			if (assetLiabilityRatioFormated != null && !assetLiabilityRatioFormated.isEmpty()) {
				double assetLiabilityRatio1;
				assetLiabilityRatio1=Double.parseDouble(assetLiabilityRatioFormated.replace("%", ""))/100;
			    sql += " and assetLiabilityRatio<?";
			    params.add(assetLiabilityRatio1);
			}

			if (dividendRateFormated != null && !dividendRateFormated.isEmpty()) {
				double dividendRate1;
				dividendRate1=Double.parseDouble(dividendRateFormated.replace("%", ""))/100;
			    sql += " and dividendRate>?";
			    params.add(dividendRate1);
			}
			
			if (grossMarginFormated != null && !grossMarginFormated.isEmpty()) {
				double grossMargin1;
				grossMargin1=Double.parseDouble(grossMarginFormated.replace("%", ""))/100;
			    sql += " and grossMargin>?";
			    params.add(grossMargin1);
			}

			if (netProfitGrowthRateFormated != null && !netProfitGrowthRateFormated.isEmpty()) {
				double netProfitGrowthRate1;
				netProfitGrowthRate1=Double.parseDouble(netProfitGrowthRateFormated.replace("%", ""))/100;
			    sql += " and netProfitGrowthRate>?";
			    params.add(netProfitGrowthRate1);
			}
			
			if (netProfitCashRatioFormated != null && !netProfitCashRatioFormated.isEmpty()) {
				double netProfitCashRatio1;
				netProfitCashRatio1=Double.parseDouble(netProfitCashRatioFormated.replace("%", ""))/100;
			    sql += " and netProfitCashRatio>?";
			    params.add(netProfitCashRatio1);
			}

			if (netProfitCashRatioFormated != null && !netProfitCashRatioFormated.isEmpty()) {
				double netProfitCashRatio1;
				netProfitCashRatio1=Double.parseDouble(netProfitCashRatioFormated.replace("%", ""))/100;
			    sql += " and netProfitCashRatio>?";
			    params.add(netProfitCashRatio1);
			}
			
			if (ROEFormated != null && !ROEFormated.isEmpty()) {
				double ROE;
				ROE=Double.parseDouble(ROEFormated.replace("%", ""))/100;
			    sql += " and ROE>?";
			    params.add(ROE);
			}

			if (industry1 != null && !industry1.isEmpty()) {
				sql += " and primaryIndustry like ?";
			    params.add("%" + industry1 + "%");
			}
			
			if (industry2 != null && !industry2.isEmpty()) {
				sql += " and secondaryIndustry like ?";
			    params.add("%" + industry2 + "%");
			}
			
			if (industry3 != null && !industry3.isEmpty()) {
				sql += " and thirdLevelIndustry like ?";
			    params.add("%" + industry3 + "%");
			}
			
			if (region != null && !region.isEmpty()) {
				sql += " and region like ?";
			    params.add("%" + region + "%");
			}
			
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
		            	ReportSummaryFormated rsf = new ReportSummaryFormated();
		            	DecimalFormat df = new DecimalFormat("#,###.00");
		            	DecimalFormat df1 = new DecimalFormat("0.00%");
		            	
		            	rsf.setAShareCode(rs.getString("AShareCode"));
		            	rsf.setAShareName(rs.getString("AShareName"));
		            	rsf.setFinancialReportingYear(rs.getString("financialReportingYear"));
		            	rsf.setRegion(rs.getString("region"));
		            	//System.out.print("财年："+rsf.getFinancialReportingYear());
		            	
		            	//总资产
		            	double totalAssets=rs.getDouble("totalAssets");
		            	if (totalAssets == 0) {
		                    rsf.setTotalAssetsFormated("");
		                } else {
		                	rsf.setTotalAssetsFormated(df.format(totalAssets));
		                }
		            	
		            	//总资产增长率
		            	double totalAssetsGrowthRate= rs.getDouble("totalAssetsGrowthRate");
		            	if(totalAssetsGrowthRate ==0) {
		            		rsf.setTotalAssetsGrowthRateFormated("");
		            	}else {
		            		rsf.setTotalAssetsGrowthRateFormated(df1.format(totalAssetsGrowthRate));
		            	}
		            	
		            		
		            	
		            	//总负债
		            	double totalLiabilities = rs.getDouble("totalLiabilities");
		            	if (totalLiabilities == 0) {
		                    rsf.setTotalLiabilitiesFormated("");
		                } else {
		                	rsf.setTotalLiabilitiesFormated(df.format(totalLiabilities));
		                }
		            	
		            	//资产负债率
		            	double assetLiabilityRatio= rs.getDouble("assetLiabilityRatio");
		            	if(assetLiabilityRatio ==0) {
		            		rsf.setAssetLiabilityRatioFormated("");
		            	}else {
		            		rsf.setAssetLiabilityRatioFormated(df1.format(assetLiabilityRatio));
		            	}
	            	
		            	//营业收入增长率
		            	double revenueGrowthRate = rs.getDouble("revenueGrowthRate");
		            	if (revenueGrowthRate == 0) {
		                    rsf.setRevenueGrowthRateFormated("");
		                } else {
		                	rsf.setRevenueGrowthRateFormated(df1.format(revenueGrowthRate));
		                }
		            	           	
		            	
		            	//毛利率
		            	double grossMargin = rs.getDouble("grossMargin");
		            	if (grossMargin == 0) {
		                    rsf.setGrossMarginFormated("");
		                } else {
		                	rsf.setGrossMarginFormated(df1.format(grossMargin));
		                }
		            	   	
		            	
		            	//净利润增长率
		            	double netProfitGrowthRate = rs.getDouble("netProfitGrowthRate");
		            	if (netProfitGrowthRate == 0) {
		                    rsf.setNetProfitGrowthRateFormated("");
		                } else {
		                	rsf.setNetProfitGrowthRateFormated(df1.format(netProfitGrowthRate));
		                }
		            
		            	
		            	//净利润现金比率
		            	double netProfitCashRatio = rs.getDouble("netProfitCashRatio");
		            	if (netProfitCashRatio == 0) {
		                    rsf.setNetProfitCashRatioFormated("");
		                } else {
		                	rsf.setNetProfitCashRatioFormated(df1.format(netProfitCashRatio));
		                }

		            	
		            	//ROE
		            	double ROE = rs.getDouble("ROE");
		            	if (ROE == 0) {
		                    rsf.setROEFormated("");
		                } else {
		                	rsf.setROEFormated(df1.format(ROE));
		                }
		            	System.out.print(rsf.getROEFormated());
		            	
		            	
		            	//分红率（股利支付率）
		            	double dividendRate = rs.getDouble("dividendRate");
		            	if (dividendRate == 0) {
		                    rsf.setDividendRateFormated("");
		                } else {
		                	rsf.setDividendRateFormated(df1.format(dividendRate));
		                }
		            	
		            	//公司类型
		            	String companyType =rs.getString("companyType");
		            	rsf.setCompanyType(companyType);
		            	
		            	list.add(rsf);
		            }
				}
			}catch (SQLException e) {
		        e.printStackTrace();
		    }

		    return list;
		    
		}
		
		

		//查询指标记录数
		public Integer getReportstatisticsCounts (String AShareCode ,String AShareName, String financialReportingYear, String totalAssetsFormated, String totalAssetsGrowthRateFormated, 
				String revenueGrowthRateFormated, String assetLiabilityRatioFormated, String dividendRateFormated, String grossMarginFormated, String netProfitGrowthRateFormated, String netProfitCashRatioFormated, String ROEFormated, String industry1, String industry2, String industry3, String region) throws SQLException {
			int totalCounts=0;
			
			String sql="select count(*) from reportstatistics where 1=1";
			ArrayList<Object> params = new ArrayList<>();
			
			
			if (AShareCode != null && !AShareCode.isEmpty()) {
			    sql += " and AShareCode=?";
			    params.add(AShareCode);
			}
			
			if (AShareName != null && !AShareName.isEmpty()) {
				sql += " and AShareName like ?";
			    params.add("%" + AShareName + "%");
			}
			
			if (financialReportingYear != null && !financialReportingYear.isEmpty()) {
			    sql += " and financialReportingYear=?";
			    params.add(financialReportingYear);
			}
			
			if (totalAssetsFormated != null && !totalAssetsFormated.isEmpty()) {
				double totalAssets1;
				totalAssets1=Double.parseDouble(totalAssetsFormated.replace(",", ""));
			    sql += " and totalAssets>?";
			    params.add(totalAssets1);
			}
			
			if (totalAssetsGrowthRateFormated != null && !totalAssetsGrowthRateFormated.isEmpty()) {
				double totalAssetsGrowthRate1;
				totalAssetsGrowthRate1=Double.parseDouble(totalAssetsGrowthRateFormated.replace("%", ""))/100;
			    sql += " and totalAssetsGrowthRate>?";
			    params.add(totalAssetsGrowthRate1);
			}
			
			if (revenueGrowthRateFormated != null && !revenueGrowthRateFormated.isEmpty()) {
				double revenueGrowthRate1;
				revenueGrowthRate1=Double.parseDouble(revenueGrowthRateFormated.replace("%", ""))/100;
			    sql += " and revenueGrowthRate>?";
			    params.add(revenueGrowthRate1);
			}
			
			if (assetLiabilityRatioFormated != null && !assetLiabilityRatioFormated.isEmpty()) {
				double assetLiabilityRatio1;
				assetLiabilityRatio1=Double.parseDouble(assetLiabilityRatioFormated.replace("%", ""))/100;
			    sql += " and assetLiabilityRatio<?";
			    params.add(assetLiabilityRatio1);
			}

			if (dividendRateFormated != null && !dividendRateFormated.isEmpty()) {
				double dividendRate1;
				dividendRate1=Double.parseDouble(dividendRateFormated.replace("%", ""))/100;
			    sql += " and dividendRate>?";
			    params.add(dividendRate1);
			}
			
			if (grossMarginFormated != null && !grossMarginFormated.isEmpty()) {
				double grossMargin1;
				grossMargin1=Double.parseDouble(grossMarginFormated.replace("%", ""))/100;
			    sql += " and grossMargin>?";
			    params.add(grossMargin1);
			}

			if (netProfitGrowthRateFormated != null && !netProfitGrowthRateFormated.isEmpty()) {
				double netProfitGrowthRate1;
				netProfitGrowthRate1=Double.parseDouble(netProfitGrowthRateFormated.replace("%", ""))/100;
			    sql += " and netProfitGrowthRate>?";
			    params.add(netProfitGrowthRate1);
			}
			
			if (ROEFormated != null && !ROEFormated.isEmpty()) {
				double ROE;
				ROE=Double.parseDouble(ROEFormated.replace("%", ""))/100;
			    sql += " and ROE>?";
			    params.add(ROE);
			}

			if (industry1 != null && !industry1.isEmpty()) {
				sql += " and primaryIndustry like ?";
			    params.add("%" + industry1 + "%");
			}
			
			if (industry2 != null && !industry2.isEmpty()) {
				sql += " and secondaryIndustry like ?";
			    params.add("%" + industry2 + "%");
			}
			
			if (industry3 != null && !industry3.isEmpty()) {
				sql += " and thirdLevelIndustry like ?";
			    params.add("%" + industry3 + "%");
			}
			
			if (region != null && !region.isEmpty()) {
				sql += " and region like ?";
			    params.add("%" + region + "%");
			}
			
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
		
			
		//删除指标记录
		public boolean delReportAnalysis(String AShareCode ,String financialReportingYear) {
			String sql= "delete from reportstatistics where AShareCode=? and financialReportingYear=?";
			try(PreparedStatement statement = con.prepareStatement(sql)) {
				statement.setNString(1, AShareCode);
				statement.setNString(2, financialReportingYear);
				statement.executeUpdate();
				return true; // 修改成功，返回true
		    } catch (SQLException e) {
		        e.printStackTrace();
		       
		        return false; // 修改失败，返回false
		    }
		
		}
}
