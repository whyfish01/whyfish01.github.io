package report.bean.daolmp;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;

import report.bean.dao.IndustryAnalysisDao;
import report.bean.entity.*;
import report.bean.util.DataBase;

public class IndustryAnalysisDaoImp extends DataBase implements IndustryAnalysisDao{

		//行业内比较：总资产与负债
		public ArrayList<ReportSummaryFormated> getIndustryReportstatistics01(String industry1, String industry2, String industry3, String financialReportingYear){
			ArrayList<ReportSummaryFormated> list= new ArrayList<ReportSummaryFormated>();
			String sql="select * from reportstatistics where primaryIndustry=? and  financialReportingYear=? ";
			ArrayList<Object> params = new ArrayList<>();
			
			if (industry2 != null && !industry2.isEmpty()) {
				sql += " and secondaryIndustry like ?";
			    params.add("%" + industry2 + "%");
			}
			
			if (industry3 != null && !industry3.isEmpty()) {
				sql += " and thirdLevelIndustry like ?";
			    params.add("%" + industry3 + "%");
			}
			
			sql += " ORDER BY totalAssets DESC";
			
			try(PreparedStatement statement=con.prepareStatement(sql)){
				statement.setString(1, industry1);
				statement.setString(2, financialReportingYear);
				for (int i = 0; i < params.size(); i++) {
				    Object param = params.get(i);
				    if (param instanceof String) {
				    	statement.setString(i + 3, (String) param);
				    } else if (param instanceof Double) {
				    	statement.setDouble(i + 3, (Double) param);
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
		            	rsf.setPrimaryIndustry(industry1);
		            	rsf.setSecondaryIndustry(industry2);
		            	rsf.setThirdLevelIndustry(industry3);
		            	
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
		            	
		            	//净资产
		            	double totalOwnersEquity=rs.getDouble("totalOwnersEquity");
		            	if(totalOwnersEquity==0) {
		            		rsf.setTotalOwnersEquityFormated("");
		            	}else {
		            		rsf.setTotalOwnersEquityFormated(df.format(totalOwnersEquity));
		            	}
		            	
		            	//权益乘数
		            	double equityMultiplier=rs.getDouble("equityMultiplier");
		            	if(equityMultiplier==0) {
		            		rsf.setEquityMultiplierFormated("");
		            	}else {
		            		rsf.setEquityMultiplierFormated(df.format(equityMultiplier));
		            	}
		            	
		            	//总负债
		            	double totalLiabilities=rs.getDouble("totalLiabilities");
		            	if(totalLiabilities==0) {
		            		rsf.setTotalLiabilitiesFormated("");
		            	}else {
		            		rsf.setTotalLiabilitiesFormated(df.format(totalLiabilities));
		            	}
		            	
		            	//资产负债率
		            	double assetLiabilityRatio=rs.getDouble("assetLiabilityRatio");
		            	if(assetLiabilityRatio==0) {
		            		rsf.setAssetLiabilityRatioFormated("");
		            	}else {
		            		rsf.setAssetLiabilityRatioFormated(df1.format(assetLiabilityRatio));
		            	}
		            	
		            	list.add(rsf);
		            }
				}
			}catch (SQLException e) {
		        e.printStackTrace();
		    }

		    return list;
		    
		}
		
		
		//行业内比较：准货币资金实力
		public ArrayList<ReportSummaryFormated> getIndustryReportstatistics02(String industry1, String industry2, String industry3, String financialReportingYear){
			ArrayList<ReportSummaryFormated> list= new ArrayList<ReportSummaryFormated>();
			String sql="select * from reportstatistics where primaryIndustry=? and  financialReportingYear=? ";
			ArrayList<Object> params = new ArrayList<>();
			
			if (industry2 != null && !industry2.isEmpty()) {
				sql += " and secondaryIndustry like ?";
			    params.add("%" + industry2 + "%");
			}
			
			if (industry3 != null && !industry3.isEmpty()) {
				sql += " and thirdLevelIndustry like ?";
			    params.add("%" + industry3 + "%");
			}
			
			sql += " ORDER BY totalAssets DESC";
			
			try(PreparedStatement statement=con.prepareStatement(sql)){
				statement.setString(1, industry1);
				statement.setString(2, financialReportingYear);
				for (int i = 0; i < params.size(); i++) {
				    Object param = params.get(i);
				    if (param instanceof String) {
				    	statement.setString(i + 3, (String) param);
				    } else if (param instanceof Double) {
				    	statement.setDouble(i + 3, (Double) param);
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
		            	rsf.setPrimaryIndustry(industry1);
		            	rsf.setSecondaryIndustry(industry2);
		            	rsf.setThirdLevelIndustry(industry3);
		            	
		            	//货币资金
		            	double monetaryCapital=rs.getDouble("monetaryCapital");
		            	if (monetaryCapital == 0) {
		                    rsf.setMonetaryCapitalFormated("");
		                } else {
		                	rsf.setMonetaryCapitalFormated(df.format(monetaryCapital));
		                }
		            	
		            	//准货币资金
		            	double quasiMonetary= rs.getDouble("quasiMonetary");
		            	if(quasiMonetary ==0) {
		            		rsf.setQuasiMonetaryFormated("");
		            	}else {
		            		rsf.setQuasiMonetaryFormated(df.format(quasiMonetary));
		            	}
		            	
		            	//准货币资金/总资产
		            	double quasiMonetaryCapitalRatio=rs.getDouble("quasiMonetaryCapitalRatio");
		            	if(quasiMonetaryCapitalRatio==0) {
		            		rsf.setQuasiMonetaryCapitalRatioFormated("");
		            	}else {
		            		rsf.setQuasiMonetaryCapitalRatioFormated(df1.format(quasiMonetaryCapitalRatio));
		            	}
		            	
		            	//短期有息负债
		            	double shortTermForeignDebt=rs.getDouble("shortTermForeignDebt");
		            	if(shortTermForeignDebt==0) {
		            		rsf.setShortTermForeignDebtFormated("");
		            	}else {
		            		rsf.setShortTermForeignDebtFormated(df.format(shortTermForeignDebt));
		            	}
		            	
		            	//准货币资金-短期有息负债
		            	double shortTermDebtRepaymentRisk=rs.getDouble("shortTermDebtRepaymentRisk");
		            	if(shortTermDebtRepaymentRisk==0) {
		            		rsf.setShortTermDebtRepaymentRiskFormated("");
		            	}else {
		            		rsf.setShortTermDebtRepaymentRiskFormated(df.format(shortTermDebtRepaymentRisk));
		            	}
		            	
		            	//有息负债
		            	double interestBearingLiabilities=rs.getDouble("interestBearingLiabilities");
		            	if(interestBearingLiabilities==0) {
		            		rsf.setInterestBearingLiabilitiesFormated("");
		            	}else {
		            		rsf.setInterestBearingLiabilitiesFormated(df.format(interestBearingLiabilities));
		            	}
		            	
		            	//净现金
		            	double debtRepaymentRisk=rs.getDouble("debtRepaymentRisk");
		            	if(debtRepaymentRisk==0) {
		            		rsf.setDebtRepaymentRiskFormated("");
		            	}else {
		            		rsf.setDebtRepaymentRiskFormated(df.format(debtRepaymentRisk));
		            	}
		            	
		            	list.add(rsf);
		            }
				}
			}catch (SQLException e) {
		        e.printStackTrace();
		    }

		    return list;
		    
		}
		
		//行业内比较：行业上下游竞争力
		public ArrayList<ReportSummaryFormated> getIndustryReportstatistics03(String industry1, String industry2, String industry3, String financialReportingYear){
			ArrayList<ReportSummaryFormated> list= new ArrayList<ReportSummaryFormated>();
			String sql="select * from reportstatistics where primaryIndustry=? and  financialReportingYear=? ";
			ArrayList<Object> params = new ArrayList<>();
			
			if (industry2 != null && !industry2.isEmpty()) {
				sql += " and secondaryIndustry like ?";
			    params.add("%" + industry2 + "%");
			}
			
			if (industry3 != null && !industry3.isEmpty()) {
				sql += " and thirdLevelIndustry like ?";
			    params.add("%" + industry3 + "%");
			}
			
			sql += " ORDER BY totalAssets DESC";
			
			try(PreparedStatement statement=con.prepareStatement(sql)){
				statement.setString(1, industry1);
				statement.setString(2, financialReportingYear);
				for (int i = 0; i < params.size(); i++) {
				    Object param = params.get(i);
				    if (param instanceof String) {
				    	statement.setString(i + 3, (String) param);
				    } else if (param instanceof Double) {
				    	statement.setDouble(i + 3, (Double) param);
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
		            	rsf.setPrimaryIndustry(industry1);
		            	rsf.setSecondaryIndustry(industry2);
		            	rsf.setThirdLevelIndustry(industry3);
		            	
		            	//应付预收合计
		            	double totalAccountsPayablePrepaid=rs.getDouble("totalAccountsPayablePrepaid");
		            	if (totalAccountsPayablePrepaid == 0) {
		                    rsf.setTotalAccountsPayablePrepaidFormated("");
		                } else {
		                	rsf.setTotalAccountsPayablePrepaidFormated(df.format(totalAccountsPayablePrepaid));
		                }
		            	
		            	//应收预付合计
		            	double totalAccountsReceivablePrepayments= rs.getDouble("totalAccountsReceivablePrepayments");
		            	if(totalAccountsReceivablePrepayments ==0) {
		            		rsf.setTotalAccountsReceivablePrepaymentsFormated("");
		            	}else {
		            		rsf.setTotalAccountsReceivablePrepaymentsFormated(df.format(totalAccountsReceivablePrepayments));
		            	}
		            	
		            	//应付预收-应收预付
		            	double occupySomeoneElseFunds=rs.getDouble("occupySomeoneElseFunds");
		            	if(occupySomeoneElseFunds==0) {
		            		rsf.setOccupySomeoneElseFundsFormated("");
		            	}else {
		            		rsf.setOccupySomeoneElseFundsFormated(df.format(occupySomeoneElseFunds));
		            	}
		            	
		            	//合同负债
		            	double contractLiabilities=rs.getDouble("contractLiabilities");
		            	if(contractLiabilities==0) {
		            		rsf.setContractLiabilitiesFormated("");
		            	}else {
		            		rsf.setContractLiabilitiesFormated(df.format(contractLiabilities));
		            	}
		            	
		            	//应收账款占总资产的比率
		            	double accountsReceivablePercentageOfRevenue=rs.getDouble("accountsReceivablePercentageOfRevenue");
		            	if(accountsReceivablePercentageOfRevenue==0) {
		            		rsf.setAccountsReceivablePercentageOfRevenueFormated("");
		            	}else {
		            		rsf.setAccountsReceivablePercentageOfRevenueFormated(df1.format(accountsReceivablePercentageOfRevenue));
		            	}
		            	
		            	//预付款项/总资产
		            	double prepaymentsPercentageOfRevenue=rs.getDouble("prepaymentsPercentageOfRevenue");
		            	if(prepaymentsPercentageOfRevenue==0) {
		            		rsf.setPrepaymentsPercentageOfRevenueFormated("");
		            	}else {
		            		rsf.setPrepaymentsPercentageOfRevenueFormated(df1.format(prepaymentsPercentageOfRevenue));
		            	}
		            	
		            	list.add(rsf);
		            }
				}
			}catch (SQLException e) {
		        e.printStackTrace();
		    }

		    return list;
		    
		}
		
		//行业内比较：资产构成风险
		public ArrayList<ReportSummaryFormated> getIndustryReportstatistics04(String industry1, String industry2, String industry3, String financialReportingYear){
			ArrayList<ReportSummaryFormated> list= new ArrayList<ReportSummaryFormated>();
			String sql="select * from reportstatistics where primaryIndustry=? and  financialReportingYear=? ";
			ArrayList<Object> params = new ArrayList<>();
			
			if (industry2 != null && !industry2.isEmpty()) {
				sql += " and secondaryIndustry like ?";
			    params.add("%" + industry2 + "%");
			}
			
			if (industry3 != null && !industry3.isEmpty()) {
				sql += " and thirdLevelIndustry like ?";
			    params.add("%" + industry3 + "%");
			}
			
			sql += " ORDER BY totalAssets DESC";
			
			try(PreparedStatement statement=con.prepareStatement(sql)){
				statement.setString(1, industry1);
				statement.setString(2, financialReportingYear);
				for (int i = 0; i < params.size(); i++) {
				    Object param = params.get(i);
				    if (param instanceof String) {
				    	statement.setString(i + 3, (String) param);
				    } else if (param instanceof Double) {
				    	statement.setDouble(i + 3, (Double) param);
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
		            	rsf.setPrimaryIndustry(industry1);
		            	rsf.setSecondaryIndustry(industry2);
		            	rsf.setThirdLevelIndustry(industry3);
		            	
		            	//总资产
		            	double totalAssets=rs.getDouble("totalAssets");
		            	if (totalAssets == 0) {
		                    rsf.setTotalAssetsFormated("");
		                } else {
		                	rsf.setTotalAssetsFormated(df.format(totalAssets));
		                }
		            	
		            	//存货
		            	double inventory= rs.getDouble("inventory");
		            	if(inventory ==0) {
		            		rsf.setInventoryFormated("");
		            	}else {
		            		rsf.setInventoryFormated(df.format(inventory));
		            	}
		            	
		            	//存货/总资产
		            	double inventoryToRevenueRatio=rs.getDouble("inventoryToRevenueRatio");
		            	if(inventoryToRevenueRatio==0) {
		            		rsf.setInventoryToRevenueRatioFormated("");
		            	}else {
		            		rsf.setInventoryToRevenueRatioFormated(df1.format(inventoryToRevenueRatio));
		            	}
		            	
		            	//存货增长率
		            	double inventoryGrowthRate=rs.getDouble("inventoryGrowthRate");
		            	if(inventoryGrowthRate==0) {
		            		rsf.setInventoryGrowthRateFormated("");
		            	}else {
		            		rsf.setInventoryGrowthRateFormated(df1.format(inventoryGrowthRate));
		            	}
		            	
		            	//固产合计/总资产
		            	double fixedAssetRatio=rs.getDouble("fixedAssetRatio");
		            	if(fixedAssetRatio==0) {
		            		rsf.setFixedAssetRatioFormated("");
		            	}else {
		            		rsf.setFixedAssetRatioFormated(df1.format(fixedAssetRatio));
		            	}
		            	
		            	//投资类资产占总资产
		            	double investmentAssetRatio=rs.getDouble("investmentAssetRatio");
		            	if(investmentAssetRatio==0) {
		            		rsf.setInvestmentAssetRatioFormated("");
		            	}else {
		            		rsf.setInvestmentAssetRatioFormated(df1.format(investmentAssetRatio));
		            	}
		            	
		            	//商誉/总资产
		            	double goodwillProportion=rs.getDouble("goodwillProportion");
		            	if(goodwillProportion==0) {
		            		rsf.setGoodwillProportionFormated("");
		            	}else {
		            		rsf.setGoodwillProportionFormated(df1.format(goodwillProportion));
		            	}
		            	
		            	//无形资产/总资产
		            	double theProportionOfIntangibleAssets=rs.getDouble("theProportionOfIntangibleAssets");
		            	if(theProportionOfIntangibleAssets==0) {
		            		rsf.setTheProportionOfIntangibleAssetsFormated("");
		            	}else {
		            		rsf.setTheProportionOfIntangibleAssetsFormated(df1.format(theProportionOfIntangibleAssets));
		            	}
		            	
		            	//其他应收款/总资产
		            	double otherReceivablesPercentageOfRevenue=rs.getDouble("otherReceivablesPercentageOfRevenue");
		            	if(otherReceivablesPercentageOfRevenue==0) {
		            		rsf.setOtherReceivablesPercentageOfRevenueFormated("");
		            	}else {
		            		rsf.setOtherReceivablesPercentageOfRevenueFormated(df1.format(otherReceivablesPercentageOfRevenue));
		            	}
		            	
		            	list.add(rsf);
		            }
				}
			}catch (SQLException e) {
		        e.printStackTrace();
		    }

		    return list;
		    
		}
		
		//行业内比较：营收增长及毛利率比较
		public ArrayList<ReportSummaryFormated> getIndustryReportstatistics05(String industry1, String industry2, String industry3, String financialReportingYear){
			ArrayList<ReportSummaryFormated> list= new ArrayList<ReportSummaryFormated>();
			String sql="select * from reportstatistics where primaryIndustry=? and  financialReportingYear=? ";
			ArrayList<Object> params = new ArrayList<>();
			
			if (industry2 != null && !industry2.isEmpty()) {
				sql += " and secondaryIndustry like ?";
			    params.add("%" + industry2 + "%");
			}
			
			if (industry3 != null && !industry3.isEmpty()) {
				sql += " and thirdLevelIndustry like ?";
			    params.add("%" + industry3 + "%");
			}
			
			sql += " ORDER BY totalAssets DESC";
			
			try(PreparedStatement statement=con.prepareStatement(sql)){
				statement.setString(1, industry1);
				statement.setString(2, financialReportingYear);
				for (int i = 0; i < params.size(); i++) {
				    Object param = params.get(i);
				    if (param instanceof String) {
				    	statement.setString(i + 3, (String) param);
				    } else if (param instanceof Double) {
				    	statement.setDouble(i + 3, (Double) param);
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
		            	rsf.setPrimaryIndustry(industry1);
		            	rsf.setSecondaryIndustry(industry2);
		            	rsf.setThirdLevelIndustry(industry3);
		            	
		            	//总资产
		            	double totalAssets=rs.getDouble("totalAssets");
		            	if (totalAssets == 0) {
		                    rsf.setTotalAssetsFormated("");
		                } else {
		                	rsf.setTotalAssetsFormated(df.format(totalAssets));
		                }
		            	
		            	//营业收入
		            	double operatingRevenue= rs.getDouble("operatingRevenue");
		            	if(operatingRevenue ==0) {
		            		rsf.setOperatingRevenueFormated("");
		            	}else {
		            		rsf.setOperatingRevenueFormated(df.format(operatingRevenue));
		            	}
		            	
		            	//营业收入增长率
		            	double revenueGrowthRate=rs.getDouble("revenueGrowthRate");
		            	if(revenueGrowthRate==0) {
		            		rsf.setRevenueGrowthRateFormated("");
		            	}else {
		            		rsf.setRevenueGrowthRateFormated(df1.format(revenueGrowthRate));
		            	}
		            	
		            	//总资产周转率
		            	double totalAssetTurnover=rs.getDouble("totalAssetTurnover");
		            	if(totalAssetTurnover==0) {
		            		rsf.setTotalAssetTurnoverFormated("");
		            	}else {
		            		rsf.setTotalAssetTurnoverFormated(df1.format(totalAssetTurnover));
		            	}
		            	
		            	//营业成本
		            	double operatingCosts=rs.getDouble("operatingCosts");
		            	if(operatingCosts==0) {
		            		rsf.setOperatingCostsFormated("");
		            	}else {
		            		rsf.setOperatingCostsFormated(df.format(operatingCosts));
		            	}
		            	
		            	//毛利率
		            	double grossMargin=rs.getDouble("grossMargin");
		            	if(grossMargin==0) {
		            		rsf.setGrossMarginFormated("");
		            	}else {
		            		rsf.setGrossMarginFormated(df1.format(grossMargin));
		            	}
		            	
		            	//销售商品、提供劳务收到的现金
		            	double cashReceivedFromSellingGoodsAndProvidingServices=rs.getDouble("cashReceivedFromSellingGoodsAndProvidingServices");
		            	if(cashReceivedFromSellingGoodsAndProvidingServices==0) {
		            		rsf.setCashReceivedFromSellingGoodsAndProvidingServicesFormated("");
		            	}else {
		            		rsf.setCashReceivedFromSellingGoodsAndProvidingServicesFormated(df.format(cashReceivedFromSellingGoodsAndProvidingServices));
		            	}
		            	
		            	//销售商品、提供劳务收到的现金营收占比
		            	double proportionOfCashSellingGoodsProvidingServices=rs.getDouble("proportionOfCashSellingGoodsProvidingServices");
		            	if(proportionOfCashSellingGoodsProvidingServices==0) {
		            		rsf.setProportionOfCashSellingGoodsProvidingServicesFormated("");
		            	}else {
		            		rsf.setProportionOfCashSellingGoodsProvidingServicesFormated(df1.format(proportionOfCashSellingGoodsProvidingServices));
		            	}
		            	
		            	list.add(rsf);
		            }
				}
			}catch (SQLException e) {
		        e.printStackTrace();
		    }

		    return list;
		    
		}
		
		//行业内比较：费用率比较
		public ArrayList<ReportSummaryFormated> getIndustryReportstatistics06(String industry1, String industry2, String industry3, String financialReportingYear){
			ArrayList<ReportSummaryFormated> list= new ArrayList<ReportSummaryFormated>();
			String sql="select * from reportstatistics where primaryIndustry=? and  financialReportingYear=? ";
			ArrayList<Object> params = new ArrayList<>();
			
			if (industry2 != null && !industry2.isEmpty()) {
				sql += " and secondaryIndustry like ?";
			    params.add("%" + industry2 + "%");
			}
			
			if (industry3 != null && !industry3.isEmpty()) {
				sql += " and thirdLevelIndustry like ?";
			    params.add("%" + industry3 + "%");
			}
			
			sql += " ORDER BY totalAssets DESC";
			
			try(PreparedStatement statement=con.prepareStatement(sql)){
				statement.setString(1, industry1);
				statement.setString(2, financialReportingYear);
				for (int i = 0; i < params.size(); i++) {
				    Object param = params.get(i);
				    if (param instanceof String) {
				    	statement.setString(i + 3, (String) param);
				    } else if (param instanceof Double) {
				    	statement.setDouble(i + 3, (Double) param);
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
		            	rsf.setPrimaryIndustry(industry1);
		            	rsf.setSecondaryIndustry(industry2);
		            	rsf.setThirdLevelIndustry(industry3);
		            	
		            	//四项费用合计
		            	double fourExpenses=rs.getDouble("fourExpenses");
		            	if (fourExpenses == 0) {
		                    rsf.setFourExpensesFormated("");
		                } else {
		                	rsf.setFourExpensesFormated(df.format(fourExpenses));
		                }
		            	
		            	//销售费用率
		            	double salesExpenseRate= rs.getDouble("salesExpenseRate");
		            	if(salesExpenseRate ==0) {
		            		rsf.setSalesExpenseRateFormated("");
		            	}else {
		            		rsf.setSalesExpenseRateFormated(df1.format(salesExpenseRate));
		            	}
		            	
		            	//管理费用率
		            	double managementExpenseRate=rs.getDouble("managementExpenseRate");
		            	if(managementExpenseRate==0) {
		            		rsf.setManagementExpenseRateFormated("");
		            	}else {
		            		rsf.setManagementExpenseRateFormated(df1.format(managementExpenseRate));
		            	}
		            	
		            	//研发费用率
		            	double researchAndDevelopmentRate=rs.getDouble("researchAndDevelopmentRate");
		            	if(researchAndDevelopmentRate==0) {
		            		rsf.setResearchAndDevelopmentRateFormated("");
		            	}else {
		            		rsf.setResearchAndDevelopmentRateFormated(df1.format(researchAndDevelopmentRate));
		            	}
		            	
		            	//费用率
		            	double expense=rs.getDouble("expense");
		            	if(expense==0) {
		            		rsf.setExpenseFormated("");
		            	}else {
		            		rsf.setExpenseFormated(df1.format(expense));
		            	}
		            	
		            	//费用率占毛利率的比率
		            	double expenseRateToGrossProfitMargin=rs.getDouble("expenseRateToGrossProfitMargin");
		            	if(expenseRateToGrossProfitMargin==0) {
		            		rsf.setExpenseRateToGrossProfitMarginFormated("");
		            	}else {
		            		rsf.setExpenseRateToGrossProfitMarginFormated(df1.format(expenseRateToGrossProfitMargin));
		            	}
		            	
		            	
		            	list.add(rsf);
		            }
				}
			}catch (SQLException e) {
		        e.printStackTrace();
		    }

		    return list;
		    
		}
		
		//行业内比较：利润及构成比较
		public ArrayList<ReportSummaryFormated> getIndustryReportstatistics07(String industry1, String industry2, String industry3, String financialReportingYear){
			ArrayList<ReportSummaryFormated> list= new ArrayList<ReportSummaryFormated>();
			String sql="select * from reportstatistics where primaryIndustry=? and  financialReportingYear=? ";
			ArrayList<Object> params = new ArrayList<>();
			
			if (industry2 != null && !industry2.isEmpty()) {
				sql += " and secondaryIndustry like ?";
			    params.add("%" + industry2 + "%");
			}
			
			if (industry3 != null && !industry3.isEmpty()) {
				sql += " and thirdLevelIndustry like ?";
			    params.add("%" + industry3 + "%");
			}
			
			sql += " ORDER BY totalAssets DESC";
			
			try(PreparedStatement statement=con.prepareStatement(sql)){
				statement.setString(1, industry1);
				statement.setString(2, financialReportingYear);
				for (int i = 0; i < params.size(); i++) {
				    Object param = params.get(i);
				    if (param instanceof String) {
				    	statement.setString(i + 3, (String) param);
				    } else if (param instanceof Double) {
				    	statement.setDouble(i + 3, (Double) param);
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
		            	rsf.setPrimaryIndustry(industry1);
		            	rsf.setSecondaryIndustry(industry2);
		            	rsf.setThirdLevelIndustry(industry3);
		            	
		            	//利润总额
		            	double totalProfit=rs.getDouble("totalProfit");
		            	if (totalProfit == 0) {
		                    rsf.setTotalProfitFormated("");
		                } else {
		                	rsf.setTotalProfitFormated(df.format(totalProfit));
		                }
		            	
		            	//主营利润/营收
		            	double mainProfitMargin= rs.getDouble("mainProfitMargin");
		            	if(mainProfitMargin ==0) {
		            		rsf.setMainProfitMarginFormated("");
		            	}else {
		            		rsf.setMainProfitMarginFormated(df1.format(mainProfitMargin));
		            	}
		            	
		            	//主营利润/利润总额
		            	double mainOperatingProfitToTotalProfit=rs.getDouble("mainOperatingProfitToTotalProfit");
		            	if(mainOperatingProfitToTotalProfit==0) {
		            		rsf.setMainOperatingProfitToTotalProfitFormated("");
		            	}else {
		            		rsf.setMainOperatingProfitToTotalProfitFormated(df1.format(mainOperatingProfitToTotalProfit));
		            	}
		            	
		            	//主营利润/营业利润
		            	double operatingMargin=rs.getDouble("operatingMargin");
		            	if(operatingMargin==0) {
		            		rsf.setOperatingMarginFormated("");
		            	}else {
		            		rsf.setOperatingMarginFormated(df1.format(operatingMargin));
		            	}
		            	
		            	//净利润
		            	double netProfit=rs.getDouble("netProfit");
		            	if(netProfit==0) {
		            		rsf.setNetProfitFormated("");
		            	}else {
		            		rsf.setNetProfitFormated(df.format(netProfit));
		            	}
		            	
		            	//净利润增长率
		            	double netProfitGrowthRate=rs.getDouble("netProfitGrowthRate");
		            	if(netProfitGrowthRate==0) {
		            		rsf.setNetProfitGrowthRateFormated("");
		            	}else {
		            		rsf.setNetProfitGrowthRateFormated(df1.format(netProfitGrowthRate));
		            	}
		            	
		            	//归母净利润增长率
		            	double growthRateOfNetIncomeAttributableToShareholders=rs.getDouble("growthRateOfNetIncomeAttributableToShareholders");
		            	if(growthRateOfNetIncomeAttributableToShareholders==0) {
		            		rsf.setGrowthRateOfNetIncomeAttributableToShareholdersFormated("");
		            	}else {
		            		rsf.setGrowthRateOfNetIncomeAttributableToShareholdersFormated(df1.format(growthRateOfNetIncomeAttributableToShareholders));
		            	}
		            	
		            	//净利润/营收
		            	double netProfitMargin=rs.getDouble("netProfitMargin");
		            	if(netProfitMargin==0) {
		            		rsf.setNetProfitMarginFormated("");
		            	}else {
		            		rsf.setNetProfitMarginFormated(df1.format(netProfitMargin));
		            	}
		            	
		            	//净利润现金比率
		            	double netProfitCashRatio=rs.getDouble("netProfitCashRatio");
		            	if(netProfitCashRatio==0) {
		            		rsf.setNetProfitCashRatioFormated("");
		            	}else {
		            		rsf.setNetProfitCashRatioFormated(df1.format(netProfitCashRatio));
		            	}
		            	
		            	//ROE
		            	double ROE=rs.getDouble("ROE");
		            	if(ROE==0) {
		            		rsf.setROEFormated("");
		            	}else {
		            		rsf.setROEFormated(df1.format(ROE));
		            	}
		            	
		            	list.add(rsf);
		            }
				}
			}catch (SQLException e) {
		        e.printStackTrace();
		    }

		    return list;
		    
		}

		//行业内比较：归母净利润与分红比较
		public ArrayList<ReportSummaryFormated> getIndustryReportstatistics08(String industry1, String industry2, String industry3, String financialReportingYear){
			ArrayList<ReportSummaryFormated> list= new ArrayList<ReportSummaryFormated>();
			String sql="select * from reportstatistics where primaryIndustry=? and  financialReportingYear=? ";
			ArrayList<Object> params = new ArrayList<>();
			
			if (industry2 != null && !industry2.isEmpty()) {
				sql += " and secondaryIndustry like ?";
			    params.add("%" + industry2 + "%");
			}
			
			if (industry3 != null && !industry3.isEmpty()) {
				sql += " and thirdLevelIndustry like ?";
			    params.add("%" + industry3 + "%");
			}
			
			sql += " ORDER BY totalAssets DESC";
			
			try(PreparedStatement statement=con.prepareStatement(sql)){
				statement.setString(1, industry1);
				statement.setString(2, financialReportingYear);
				for (int i = 0; i < params.size(); i++) {
				    Object param = params.get(i);
				    if (param instanceof String) {
				    	statement.setString(i + 3, (String) param);
				    } else if (param instanceof Double) {
				    	statement.setDouble(i + 3, (Double) param);
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
		            	rsf.setPrimaryIndustry(industry1);
		            	rsf.setSecondaryIndustry(industry2);
		            	rsf.setThirdLevelIndustry(industry3);
		            	
		            	//归属于母公司所有者的净利润
		            	double netIncomeAttributableToShareholders=rs.getDouble("netIncomeAttributableToShareholders");
		            	if (netIncomeAttributableToShareholders == 0) {
		                    rsf.setNetIncomeAttributableToShareholdersFormated("");
		                } else {
		                	rsf.setNetIncomeAttributableToShareholdersFormated(df.format(netIncomeAttributableToShareholders));
		                }
		            	
		            	//归母净利润增长率
		            	double growthRateOfNetIncomeAttributableToShareholders= rs.getDouble("growthRateOfNetIncomeAttributableToShareholders");
		            	if(growthRateOfNetIncomeAttributableToShareholders ==0) {
		            		rsf.setGrowthRateOfNetIncomeAttributableToShareholdersFormated("");
		            	}else {
		            		rsf.setGrowthRateOfNetIncomeAttributableToShareholdersFormated(df1.format(growthRateOfNetIncomeAttributableToShareholders));
		            	}
		            	
		            	//现金分红金额
		            	double financialReportDividends=rs.getDouble("financialReportDividends");
		            	if(financialReportDividends==0) {
		            		rsf.setFinancialReportDividendsFormated("");
		            	}else {
		            		rsf.setFinancialReportDividendsFormated(df.format(financialReportDividends));
		            	}
		            	
		            	//分红率
		            	double dividendRate=rs.getDouble("dividendRate");
		            	if(dividendRate==0) {
		            		rsf.setDividendRateFormated("");
		            	}else {
		            		rsf.setDividendRateFormated(df1.format(dividendRate));
		            	}
		            	
		            	
		            	list.add(rsf);
		            }
				}
			}catch (SQLException e) {
		        e.printStackTrace();
		    }

		    return list;
		    
		}
		
		//行业内比较：现金流量比较
		public ArrayList<ReportSummaryFormated> getIndustryReportstatistics09(String industry1, String industry2, String industry3, String financialReportingYear){
			ArrayList<ReportSummaryFormated> list= new ArrayList<ReportSummaryFormated>();
			String sql="select * from reportstatistics where primaryIndustry=? and  financialReportingYear=? ";
			ArrayList<Object> params = new ArrayList<>();
			
			if (industry2 != null && !industry2.isEmpty()) {
				sql += " and secondaryIndustry like ?";
			    params.add("%" + industry2 + "%");
			}
			
			if (industry3 != null && !industry3.isEmpty()) {
				sql += " and thirdLevelIndustry like ?";
			    params.add("%" + industry3 + "%");
			}
			
			sql += " ORDER BY totalAssets DESC";
			
			try(PreparedStatement statement=con.prepareStatement(sql)){
				statement.setString(1, industry1);
				statement.setString(2, financialReportingYear);
				for (int i = 0; i < params.size(); i++) {
				    Object param = params.get(i);
				    if (param instanceof String) {
				    	statement.setString(i + 3, (String) param);
				    } else if (param instanceof Double) {
				    	statement.setDouble(i + 3, (Double) param);
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
		            	rsf.setPrimaryIndustry(industry1);
		            	rsf.setSecondaryIndustry(industry2);
		            	rsf.setThirdLevelIndustry(industry3);
		            	rsf.setCompanyType(rs.getString("companyType"));
		            	
		            	//经营活动产生的现金流量净额
		            	double netCashFlowFromOperating=rs.getDouble("netCashFlowFromOperating");
		            	if (netCashFlowFromOperating == 0) {
		                    rsf.setNetCashFlowFromOperatingFormated("");
		                } else {
		                	rsf.setNetCashFlowFromOperatingFormated(df.format(netCashFlowFromOperating));
		                }
		            	
		            	//经营活动产生的现金流量净额增长率
		            	double growthRateOfNetCashFlowFromOperating= rs.getDouble("growthRateOfNetCashFlowFromOperating");
		            	if(growthRateOfNetCashFlowFromOperating ==0) {
		            		rsf.setGrowthRateOfNetCashFlowFromOperatingFormated("");
		            	}else {
		            		rsf.setGrowthRateOfNetCashFlowFromOperatingFormated(df1.format(growthRateOfNetCashFlowFromOperating));
		            	}
		            	
		            	
		            	//现金及现金等价物净增加额
		            	double netIncreaseInCashAndCashEquivalents=rs.getDouble("netIncreaseInCashAndCashEquivalents");
		            	if(netIncreaseInCashAndCashEquivalents==0) {
		            		rsf.setNetIncreaseInCashAndCashEquivalentsFormated("");
		            	}else {
		            		rsf.setNetIncreaseInCashAndCashEquivalentsFormated(df.format(netIncreaseInCashAndCashEquivalents));
		            	}
		            	
		            	//加现金分红的现金及现金等价物净增加额
		            	double netIncreaseInCashAndCashEquivalentsAddBonus=rs.getDouble("netIncreaseInCashAndCashEquivalentsAddBonus");
		            	if(netIncreaseInCashAndCashEquivalentsAddBonus==0) {
		            		rsf.setNetIncreaseInCashAndCashEquivalentsAddBonusFormated("");
		            	}else {
		            		rsf.setNetIncreaseInCashAndCashEquivalentsAddBonusFormated(df.format(netIncreaseInCashAndCashEquivalentsAddBonus));
		            	}
		            	
		            	//期末现金及现金等价物余额	
		            	double closingBalanceOfCashAndCashEquivalents=rs.getDouble("closingBalanceOfCashAndCashEquivalents");
		            	if(closingBalanceOfCashAndCashEquivalents==0) {
		            		rsf.setClosingBalanceOfCashAndCashEquivalentsFormated("");
		            	}else {
		            		rsf.setClosingBalanceOfCashAndCashEquivalentsFormated(df.format(closingBalanceOfCashAndCashEquivalents));
		            	}
		            	
		            	//购建固产占经营活动产生的现金比
		            	double purchaseConstructionFixedIntangibleLongTermAssetsProportion=rs.getDouble("purchaseConstructionFixedIntangibleLongTermAssetsProportion");
		            	if(purchaseConstructionFixedIntangibleLongTermAssetsProportion==0) {
		            		rsf.setPurchaseConstructionFixedIntangibleLongTermAssetsProportionFormated("");
		            	}else {
		            		rsf.setPurchaseConstructionFixedIntangibleLongTermAssetsProportionFormated(df1.format(purchaseConstructionFixedIntangibleLongTermAssetsProportion));
		            	}
		            	
		            	//处置固定无形和其他长期资产收回现金占购置比率
		            	double netCashReceivedFromDisposalProportionTopurchase=rs.getDouble("netCashReceivedFromDisposalProportionTopurchase");
		            	if(netCashReceivedFromDisposalProportionTopurchase==0) {
		            		rsf.setNetCashReceivedFromDisposalProportionTopurchaseFormated("");
		            	}else {
		            		rsf.setNetCashReceivedFromDisposalProportionTopurchaseFormated(df1.format(netCashReceivedFromDisposalProportionTopurchase));
		            	}
		            	
		            	list.add(rsf);
		            }
				}
			}catch (SQLException e) {
		        e.printStackTrace();
		    }

		    return list;
		    
		}

}
