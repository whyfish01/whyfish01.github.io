package report.bean.daolmp;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;

import report.bean.dao.AnalysisDao;
import report.bean.entity.*;
import report.bean.util.DataBase;

public class AnalysisDaoImp extends DataBase implements AnalysisDao{
	
	//获得企业信息
	public ArrayList<Company> getCompanyInfo(String AShareCode){
		ArrayList<Company> list=new ArrayList<Company>();
		String sql="select * from companyinfo where AShareCode='"+AShareCode+"'";
		ResultSet rs=this.getResult(sql);
			
			try{
				 while (rs.next()) {
					 Company cop =new Company();
					 cop.setAShareCode(rs.getString("AShareCode"));
					 cop.setAShareName(rs.getString("AShareName"));
					 cop.setCompanyName(rs.getString("companyName"));
					 cop.setPrimaryIndustry(rs.getString("primaryIndustry"));
					 cop.setSecondaryIndustry(rs.getString("secondaryIndustry"));
					 cop.setThirdLevelIndustry(rs.getString("thirdLevelIndustry"));
					 cop.setRegion(rs.getString("region"));
					 list.add(cop);
				 }
			}catch(SQLException e) {
				e.printStackTrace();
		}
		return list;
		}
	
	
	//指标一：总资产情况
	public ArrayList<ReportSummaryFormated> getTotalAssetsSituation (String AShareCode,String financialReportingYear){
		ArrayList<ReportSummaryFormated> list=new ArrayList<ReportSummaryFormated>();
		String financialReportingNo=AShareCode+financialReportingYear;
		int year= Integer.parseInt(financialReportingYear);
		int lastYear=year-1;
		String lastYearStr=String.valueOf(lastYear);
		String lastfinancialReportingNo = AShareCode+lastYearStr;
		
		String sql = "select totalAssets, financialReportingNo from fr_balancesheet where financialReportingNo IN (?, ?)";
		try(PreparedStatement statement = con.prepareStatement(sql)){
			statement.setString(1,financialReportingNo);
			statement.setString(2,lastfinancialReportingNo);
			
			ReportSummaryFormated rsf=new ReportSummaryFormated();
			DecimalFormat df = new DecimalFormat("#,###.00");
			NumberFormat percentFormat = NumberFormat.getPercentInstance();
			percentFormat.setMaximumFractionDigits(2); // 设置小数点后保留的位数
			
			try(ResultSet rs = statement.executeQuery()){
				double currentYearAssets = 0;
			    double lastYearAssets = 0;

			    while (rs.next()) {
			        String reportYear = rs.getString("financialReportingNo");
			        double totalAssets = rs.getDouble("totalAssets");

			        if (reportYear.equals(financialReportingNo)) {
			            currentYearAssets = totalAssets;
			        } else if (reportYear.equals(lastfinancialReportingNo)) {
			            lastYearAssets = totalAssets;
			        }
			        
			        //当前总资产
			        if (currentYearAssets == 0) {
			            rsf.setTotalAssetsFormated("");
			        } else {
			            rsf.setTotalAssetsFormated(df.format(currentYearAssets));
			        }

			      //总资产增长率
			        if (lastYearAssets == 0 || currentYearAssets == 0) {
			            rsf.setTotalAssetsGrowthRateFormated("");
			        } else {
			            double totalAssetsGrowthRate = (currentYearAssets - lastYearAssets) / lastYearAssets;
			            rsf.setTotalAssetsGrowthRateFormated(percentFormat.format(totalAssetsGrowthRate));
			        }
			        
			     // 清空 list
			     list.clear();
			     
			     // 将单个 ReportSummaryFormated 对象添加到 ryList1 中
			     list.add(rsf);
		       }
		}catch(SQLException e) {
					e.printStackTrace();
			}
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			return list;
			
			}
	
		//指标一：总资产情况：净资产情况
		public ArrayList<ReportSummaryFormated> getTotalAssetsSituation1 (String AShareCode,String financialReportingYear){
			ArrayList<ReportSummaryFormated> list=new ArrayList<ReportSummaryFormated>();
			String financialReportingNo=AShareCode+financialReportingYear;
			String sql="select * from fr_balancesheet where financialReportingNo='"+financialReportingNo+"'";
			ResultSet rs = this.getResult(sql);
			try{
				while(rs.next()) {
					ReportSummaryFormated rsf=new ReportSummaryFormated();
					DecimalFormat df = new DecimalFormat("#,###.00");
					NumberFormat percentFormat = NumberFormat.getPercentInstance();
				    percentFormat.setMaximumFractionDigits(2); // 设置小数点后保留的位数
				   
				    // 总资产
		            double totalAssets = rs.getDouble("totalAssets");
		            if (totalAssets == 0) {
		                rsf.setTotalAssetsFormated("");
		            } else {
		                rsf.setTotalAssetsFormated(df.format(totalAssets));
		            }
		            
				    //股东权益合计（净资产）
					double totalOwnersEquity=rs.getDouble("totalOwnersEquity");
					if (totalOwnersEquity == 0) {
		                rsf.setTotalOwnersEquityFormated("");
		            } else {
		                rsf.setTotalOwnersEquityFormated(df.format(totalOwnersEquity));
		                
		            }
					
					
					//权益乘数（总资产/净资产）
					if(totalAssets==0 || totalOwnersEquity == 0) {
						rsf.setEquityMultiplierFormated("");
					}else {
						double equityMultiplier = totalAssets / totalOwnersEquity;
						rsf.setEquityMultiplierFormated(df.format(equityMultiplier));
					}
					list.add(rsf);
				}
			}catch(SQLException e) {
				e.printStackTrace();
		}
		return list;
		}
		
		//指标二：资产负债率情况
		public ArrayList<ReportSummaryFormated> getAssetLiabilityRatio (String AShareCode,String financialReportingYear){
			ArrayList<ReportSummaryFormated> list=new ArrayList<ReportSummaryFormated>();
			String financialReportingNo=AShareCode+financialReportingYear;
			String sql1="select * from fr_balancesheet where financialReportingNo='"+financialReportingNo+"'";
			ResultSet rs1 = this.getResult(sql1);
			try{
				while(rs1.next()) {
					ReportSummaryFormated rsf=new ReportSummaryFormated();
					DecimalFormat df = new DecimalFormat("#,###.00");
					NumberFormat percentFormat = NumberFormat.getPercentInstance();
				    percentFormat.setMaximumFractionDigits(2); // 设置小数点后保留的位数
				    
				    //总资产
					double totalAssets=rs1.getDouble("totalAssets");
					if (totalAssets == 0) {
		                rsf.setTotalAssetsFormated("");
		            } else {
		                rsf.setTotalAssetsFormated(df.format(totalAssets));
		            }
					
					//总负债
					double totalLiabilities=rs1.getDouble("totalLiabilities");
					if(totalLiabilities==0) {
						rsf.setTotalLiabilitiesFormated("");
					}else {
						rsf.setTotalLiabilitiesFormated(df.format(totalLiabilities));
					}

					//资产负债率
					if(totalAssets==0 || totalLiabilities==0) {
						rsf.setAssetLiabilityRatioFormated("");
					}else {
						double assetLiabilityRatio= totalLiabilities / totalAssets;
						rsf.setAssetLiabilityRatioFormated(percentFormat.format(assetLiabilityRatio));
					}
					list.add(rsf);
				}
			}catch(SQLException e) {
				e.printStackTrace();
		}
		return list;
		}
	
		//指标三：有息负债与货币资金
		public ArrayList<ReportSummaryFormated> getInterestBearingLiabilitiesAndMonetaryFunds(String AShareCode,String financialReportingYear){
			ArrayList<ReportSummaryFormated> list=new ArrayList<ReportSummaryFormated>();
			String financialReportingNo=AShareCode+financialReportingYear;
			String sql1="select * from fr_balancesheet where financialReportingNo='"+financialReportingNo+"'";
			ResultSet rs1 = this.getResult(sql1);
			try{
				while(rs1.next()) {
					ReportSummaryFormated rsf=new ReportSummaryFormated();
					DecimalFormat df = new DecimalFormat("#,###.00");
					NumberFormat percentFormat = NumberFormat.getPercentInstance();
				    percentFormat.setMaximumFractionDigits(2); // 设置小数点后保留的位数
				    
				    //货币资金
					double monetaryCapital=rs1.getDouble("monetaryCapital");
					if(monetaryCapital==0) {
						rsf.setMonetaryCapitalFormated("");
					}else {
						rsf.setMonetaryCapitalFormated(df.format(monetaryCapital));
					}
					
					//短期借款
					double shortTermBorrowing=rs1.getDouble("shortTermBorrowing");
					if(shortTermBorrowing==0) {
						rsf.setShortTermBorrowingFormated("");
					}else {
						rsf.setShortTermBorrowingFormated(df.format(shortTermBorrowing));
					}
					
					//一年内到期的非流动负债
					double nonCurrentLiabilitiesDueWithinOneYear=rs1.getDouble("nonCurrentLiabilitiesDueWithinOneYear");
					if(nonCurrentLiabilitiesDueWithinOneYear==0) {
						rsf.setNonCurrentLiabilitiesDueWithinOneYearFormated("");
					}else {
						rsf.setNonCurrentLiabilitiesDueWithinOneYearFormated(df.format(nonCurrentLiabilitiesDueWithinOneYear));
					}
					
					//长期借款
					double longTermLoan=rs1.getDouble("longTermLoan");
					if(longTermLoan==0) {
						rsf.setLongTermLoanFormated("");
					}else {
						rsf.setLongTermLoanFormated(df.format(longTermLoan));
					}
					
					//应付债券
					double bondsPayable=rs1.getDouble("bondsPayable");
					if(bondsPayable==0) {
						rsf.setBondsPayableFormated("");
					}else {
						rsf.setBondsPayableFormated(df.format(bondsPayable));
					}
					
					//长期应付款
					double longTermPayables=rs1.getDouble("longTermPayables");
					if(longTermPayables==0) {
						rsf.setLongTermPayablesFormated("");
					}else {
						rsf.setLongTermPayablesFormated(df.format(longTermPayables));
					}
					
					//有息负债(短期借款+一年内到期的非流动负债+长期借款+应付债券+长期应付款)
					double interestBearingLiabilities= shortTermBorrowing + nonCurrentLiabilitiesDueWithinOneYear + longTermLoan + bondsPayable + longTermPayables;
					if(interestBearingLiabilities==0) {
						rsf.setInterestBearingLiabilitiesFormated("");
					}else {
						rsf.setInterestBearingLiabilitiesFormated(df.format(interestBearingLiabilities));
					}
					
					//货币资金-有息负债
					double debtRepaymentRisk= monetaryCapital - interestBearingLiabilities;
					if (debtRepaymentRisk==0) {
						rsf.setDebtRepaymentRiskFormated("");
					}else {
						rsf.setDebtRepaymentRiskFormated(df.format(debtRepaymentRisk));
					}
					list.add(rsf);
				}
			}catch(SQLException e) {
				e.printStackTrace();
		}
		return list;
		}
		
		//指标四：准货币资金
		public ArrayList<ReportSummaryFormated> getQuasiMonetaryFunds(String AShareCode,String financialReportingYear){
			ArrayList<ReportSummaryFormated> list=new ArrayList<ReportSummaryFormated>();
			String financialReportingNo=AShareCode+financialReportingYear;
			String sql1="select * from fr_balancesheet where financialReportingNo='"+financialReportingNo+"'";
			ResultSet rs1 = this.getResult(sql1);
			try{
				while(rs1.next()) {
					ReportSummaryFormated rsf=new ReportSummaryFormated();
					DecimalFormat df = new DecimalFormat("#,###.00");
					NumberFormat percentFormat = NumberFormat.getPercentInstance();
				    percentFormat.setMaximumFractionDigits(2); // 设置小数点后保留的位数
				    
				    //货币资金
					double monetaryCapital=rs1.getDouble("monetaryCapital");
					if(monetaryCapital==0) {
						rsf.setMonetaryCapitalFormated("");
					}else {
						rsf.setMonetaryCapitalFormated(df.format(monetaryCapital));
					}
					
					//交易性金融资产中的理财产品
					double tradingFinancialAssetsManagement=rs1.getDouble("tradingFinancialAssetsManagement");
					if(tradingFinancialAssetsManagement==0) {
						rsf.setTradingFinancialAssetsManagementFormated("");
					}else {
						rsf.setTradingFinancialAssetsManagementFormated(df.format(tradingFinancialAssetsManagement));
					}
					
					//其他流动资产的理财产品
					double otherCurrentAssetsManagement=rs1.getDouble("otherCurrentAssetsManagement");
					if(otherCurrentAssetsManagement==0) {
						rsf.setOtherCurrentAssetsManagementFormated("");
					}else {
						rsf.setOtherCurrentAssetsManagementFormated(df.format(otherCurrentAssetsManagement));
					}

					//准货币资金= 货币资金+ 交易性金融资产中的理财产品 + 其他流动资产的理财产品
					double quasiMonetary = monetaryCapital + tradingFinancialAssetsManagement + otherCurrentAssetsManagement;
					if(quasiMonetary==0) {
						rsf.setQuasiMonetaryFormated("");
					}else {
						rsf.setQuasiMonetaryFormated(df.format(quasiMonetary));
					}

					//短期借款
					double shortTermBorrowing=rs1.getDouble("shortTermBorrowing");
					if(shortTermBorrowing==0) {
						rsf.setShortTermBorrowingFormated("");
					}else {
						rsf.setShortTermBorrowingFormated(df.format(shortTermBorrowing));
					}
					
					//一年内到期的非流动负债
					double nonCurrentLiabilitiesDueWithinOneYear=rs1.getDouble("nonCurrentLiabilitiesDueWithinOneYear");
					if(nonCurrentLiabilitiesDueWithinOneYear==0) {
						rsf.setNonCurrentLiabilitiesDueWithinOneYearFormated("");
					}else {
						rsf.setNonCurrentLiabilitiesDueWithinOneYearFormated(df.format(nonCurrentLiabilitiesDueWithinOneYear));
					}
					
					//短期有息负债(短期借款+一年内到期的非流动负债)
					double shortTermForeignDebt = shortTermBorrowing + nonCurrentLiabilitiesDueWithinOneYear;
					if(shortTermForeignDebt==0) {
						rsf.setShortTermForeignDebtFormated("");
					}else {
						rsf.setShortTermForeignDebtFormated(df.format(shortTermForeignDebt));
					}
							
					//准货币资金-短期有息负债
					double shortTermDebtRepaymentRisk = quasiMonetary - shortTermForeignDebt;
					if(shortTermDebtRepaymentRisk==0) {
						rsf.setShortTermDebtRepaymentRiskFormated("");
					}else {
						rsf.setShortTermDebtRepaymentRiskFormated(df.format(shortTermDebtRepaymentRisk));
					}
					
					//总资产
					double totalAssets=rs1.getDouble("totalAssets");
					if (totalAssets == 0) {
		                rsf.setTotalAssetsFormated("");
		            } else {
		                rsf.setTotalAssetsFormated(df.format(totalAssets));
		            }
					
					//准货币资金占总资产比率(准货币资金/总资产)
					if(quasiMonetary==0 || totalAssets==0) {
						rsf.setQuasiMonetaryCapitalRatioFormated("");
					}else {
						double quasiMonetaryCapitalRatio = quasiMonetary / totalAssets;
						rsf.setQuasiMonetaryCapitalRatioFormated(percentFormat.format(quasiMonetaryCapitalRatio));
					}
					
					list.add(rsf);
				}
			}catch(SQLException e) {
				e.printStackTrace();
		}
		return list;
		}
		
		//指标五：“应收预付”和“应付预收”
		public ArrayList<ReportSummaryFormated> getAccountPayable(String AShareCode,String financialReportingYear){
			ArrayList<ReportSummaryFormated> list=new ArrayList<ReportSummaryFormated>();
			String financialReportingNo=AShareCode+financialReportingYear;
			String sql1="select * from fr_balancesheet where financialReportingNo='"+financialReportingNo+"'";
			ResultSet rs1 = this.getResult(sql1);
			try{
				while(rs1.next()) {
					ReportSummaryFormated rsf=new ReportSummaryFormated();
					DecimalFormat df = new DecimalFormat("#,###.00");
					NumberFormat percentFormat = NumberFormat.getPercentInstance();
				    percentFormat.setMaximumFractionDigits(2); // 设置小数点后保留的位数
				    
				    //应付票据
					double notesPayable = rs1.getDouble("notesPayable");
					if(notesPayable==0) {
						rsf.setNotesPayableFormated("");
					}else {
						rsf.setNotesPayableFormated(df.format(notesPayable));
					}
					
					//应付账款
					double accountsPayable= rs1.getDouble("accountsPayable");
					if(accountsPayable==0) {
						rsf.setAccountsPayableFormated("");
					}else {
						rsf.setAccountsPayableFormated(df.format(accountsPayable));
					}
					
					//预收款项
					double advanceReceipts = rs1.getDouble("advanceReceipts");
					if(advanceReceipts==0) {
						rsf.setAdvanceReceiptsFormated("");
					}else {
						rsf.setAdvanceReceiptsFormated(df.format(advanceReceipts));
					}
					
					//合同负债
					double contractLiabilities = rs1.getDouble("contractLiabilities");
					if(contractLiabilities==0) {
						rsf.setContractLiabilitiesFormated("");
					}else {
						rsf.setContractLiabilitiesFormated(df.format(contractLiabilities));
					}
					
					//应付预收合计 ( 应付票据 + 应付账款 + 预收款项 + 合同负债)
					double totalAccountsPayablePrepaid = notesPayable + accountsPayable + advanceReceipts + contractLiabilities;
					if(totalAccountsPayablePrepaid==0) {
						rsf.setTotalAccountsPayablePrepaidFormated("");
					}else {
						rsf.setTotalAccountsPayablePrepaidFormated(df.format(totalAccountsPayablePrepaid));
					}
							
					//应收票据
					double billReceivable =rs1.getDouble("billReceivable");
					if(billReceivable==0) {
						rsf.setBillReceivableFormated("");
					}else {
						rsf.setBillReceivableFormated(df.format(billReceivable));
					}
					
					//应收账款
					double accountsReceivable = rs1.getDouble("accountsReceivable");
					if(accountsReceivable==0) {
						rsf.setAccountsReceivableFormated("");
					}else {
						rsf.setAccountsReceivableFormated(df.format(accountsReceivable));
					}

					//应收款项融资
					double accountsReceivableFinancing = rs1.getDouble("accountsReceivableFinancing");
					if(accountsReceivableFinancing==0) {
						rsf.setAccountsReceivableFinancingFormated("");
					}else {
						rsf.setAccountsReceivableFinancingFormated(df.format(accountsReceivableFinancing));
					}
					
					//合同资产
	            	double contractAssets = rs1.getDouble("contractAssets");
	            	if (contractAssets == 0) {
	                    rsf.setContractAssetsFormated("");
	                } else {
	                	rsf.setContractAssetsFormated(df.format(contractAssets));
	                }
					
					//预付款项
					double prepayments = rs1.getDouble("prepayments");
					if(prepayments==0) {
						rsf.setPrepaymentsFormated("");
					}else {
						rsf.setPrepaymentsFormated(df.format(prepayments));
					}
					
					
					//应收预付合计(应收票据 + 应收账款 + 应收款项融资 + 预付款项 + 合同资产)
					double totalAccountsReceivablePrepayments = billReceivable + accountsReceivable + accountsReceivableFinancing + prepayments + contractAssets;
					if(totalAccountsReceivablePrepayments==0) {
						rsf.setTotalAccountsReceivablePrepaymentsFormated("");
					}else {
						rsf.setTotalAccountsReceivablePrepaymentsFormated(df.format(totalAccountsReceivablePrepayments));
					}

					//应付预收合计-应收预付合计
					double occupySomeoneElseFunds = totalAccountsPayablePrepaid - totalAccountsReceivablePrepayments ;
					if(occupySomeoneElseFunds==0) {
						rsf.setOccupySomeoneElseFundsFormated("");
					}else {
						rsf.setOccupySomeoneElseFundsFormated(df.format(occupySomeoneElseFunds));
					}

					//总资产
					double totalAssets=rs1.getDouble("totalAssets");
					if (totalAssets == 0) {
		                rsf.setTotalAssetsFormated("");
		            } else {
		                rsf.setTotalAssetsFormated(df.format(totalAssets));
		            }
					
					//应收账款占总资产的比率
					if(accountsReceivable==0 || totalAssets==0) {
						rsf.setAccountsReceivableRatioFormated("");
					}else {
						double accountsReceivableRatio = accountsReceivable / totalAssets;
						rsf.setAccountsReceivableRatioFormated(percentFormat.format(accountsReceivableRatio));
					}
				    list.add(rsf);
				}
			}catch(SQLException e) {
				e.printStackTrace();
		}
		return list;
		}
		
		//指标六：固定资产
		public ArrayList<ReportSummaryFormated> getFixedAssets(String AShareCode,String financialReportingYear){
			ArrayList<ReportSummaryFormated> list=new ArrayList<ReportSummaryFormated>();
			String financialReportingNo=AShareCode+financialReportingYear;
			String sql1="select * from fr_balancesheet where financialReportingNo='"+financialReportingNo+"'";
			ResultSet rs1 = this.getResult(sql1);
			try{
				while(rs1.next()) {
					ReportSummaryFormated rsf=new ReportSummaryFormated();
					DecimalFormat df = new DecimalFormat("#,###.00");
					NumberFormat percentFormat = NumberFormat.getPercentInstance();
				    percentFormat.setMaximumFractionDigits(2); // 设置小数点后保留的位数
				    
				  //固定资产
					double fixedAssets =rs1.getDouble("fixedAssets");
					if(fixedAssets==0) {
						rsf.setFixedAssetsFormated("");
					}else {
						rsf.setFixedAssetsFormated(df.format(fixedAssets));
					}
							
					//在建工程
					double constructionInProgress=rs1.getDouble("constructionInProgress");
					if(constructionInProgress==0) {
						rsf.setConstructionInProgressFormated("");
					}else {
						rsf.setConstructionInProgressFormated(df.format(constructionInProgress));
					}
					
					//固产合计( 固定资产 + 在建工程)
					double totalTFxedAssets = fixedAssets + constructionInProgress;
					if(totalTFxedAssets==0) {
						rsf.setTotalTFxedAssetsFormated("");
					}else {
						rsf.setTotalTFxedAssetsFormated(df.format(totalTFxedAssets));
					}
					
					//总资产
					double totalAssets=rs1.getDouble("totalAssets");
					if (totalAssets == 0) {
		                rsf.setTotalAssetsFormated("");
		            } else {
		                rsf.setTotalAssetsFormated(df.format(totalAssets));
		            }
					
					//固产合计占总资产的比率
					if(totalTFxedAssets==0 || totalAssets==0) {
						rsf.setFixedAssetRatioFormated("");
					}else {
						double fixedAssetRatio = totalTFxedAssets / totalAssets;
						rsf.setFixedAssetRatioFormated(percentFormat.format(fixedAssetRatio));
					}
				    
				    list.add(rsf);
				}
			}catch(SQLException e) {
				e.printStackTrace();
		}
		return list;
		}
		
		//指标七：投资类资产
		public ArrayList<ReportSummaryFormated> getInvestmentAssets(String AShareCode,String financialReportingYear){
			ArrayList<ReportSummaryFormated> list=new ArrayList<ReportSummaryFormated>();
			String financialReportingNo=AShareCode+financialReportingYear;
			String sql1="select * from fr_balancesheet where financialReportingNo='"+financialReportingNo+"'";
			ResultSet rs1 = this.getResult(sql1);
			try{
				while(rs1.next()) {
					ReportSummaryFormated rsf=new ReportSummaryFormated();
					DecimalFormat df = new DecimalFormat("#,###.00");
					NumberFormat percentFormat = NumberFormat.getPercentInstance();
				    percentFormat.setMaximumFractionDigits(2); // 设置小数点后保留的位数
				    
				  //交易性金融资产
					double tradingFinancialAssets = rs1.getDouble("tradingFinancialAssets");
					if(tradingFinancialAssets==0) {
						rsf.setTradingFinancialAssetsFormated("");
					}else {
						rsf.setTradingFinancialAssetsFormated(df.format(tradingFinancialAssets));
					}
					
					//其他非流动金融资产
					double otherNonCurrentFinancialAssets = rs1.getDouble("otherNonCurrentFinancialAssets");
					if(otherNonCurrentFinancialAssets==0) {
						rsf.setOtherNonCurrentFinancialAssetsFormated("");
					}else {
						rsf.setOtherNonCurrentFinancialAssetsFormated(df.format(otherNonCurrentFinancialAssets));
					}
					
					//投资性房地产
					double investmentRealEstate = rs1.getDouble("investmentRealEstate");
					if(investmentRealEstate==0) {
						rsf.setInvestmentRealEstateFormated("");
					}else {
						rsf.setInvestmentRealEstateFormated(df.format(investmentRealEstate));
					}
					
					//长期股权投资
					double longTermEquityInvestment = rs1.getDouble("longTermEquityInvestment");
					if(longTermEquityInvestment==0) {
						rsf.setLongTermEquityInvestmentFormated("");
					}else {
						rsf.setLongTermEquityInvestmentFormated(df.format(longTermEquityInvestment));
					}
					
					//投资类资产小计( 交易性金融资产 + 其他非流动金融资产 + 投资性房地产 + 长期股权投资)
					double subtotalOfInvestmentAssets = tradingFinancialAssets + otherNonCurrentFinancialAssets + investmentRealEstate + longTermEquityInvestment;
					if(subtotalOfInvestmentAssets==0) {
						rsf.setSubtotalOfInvestmentAssetsFormated("");
					}else {
						rsf.setSubtotalOfInvestmentAssetsFormated(df.format(subtotalOfInvestmentAssets));
					}
					
					//总资产
					double totalAssets=rs1.getDouble("totalAssets");
					if (totalAssets == 0) {
		                rsf.setTotalAssetsFormated("");
		            } else {
		                rsf.setTotalAssetsFormated(df.format(totalAssets));
		            }
					
					//投资类资产占总资产的比率
					if(subtotalOfInvestmentAssets==0 || totalAssets==0) {
						rsf.setInvestmentAssetRatioFormated("");
					}else {
						double investmentAssetRatio = subtotalOfInvestmentAssets / totalAssets;
						rsf.setInvestmentAssetRatioFormated(percentFormat.format(investmentAssetRatio));
					}
				    list.add(rsf);
				}
			}catch(SQLException e) {
				e.printStackTrace();
		}
		return list;
		}
		
		//指标八：其他资产
		public ArrayList<ReportSummaryFormated> getOtherAssets(String AShareCode,String financialReportingYear){
			ArrayList<ReportSummaryFormated> list=new ArrayList<ReportSummaryFormated>();
			String financialReportingNo=AShareCode+financialReportingYear;
			String sql1="select * from fr_balancesheet where financialReportingNo='"+financialReportingNo+"'";
			ResultSet rs1 = this.getResult(sql1);
			try{
				while(rs1.next()) {
					ReportSummaryFormated rsf=new ReportSummaryFormated();
					DecimalFormat df = new DecimalFormat("#,###.00");
					NumberFormat percentFormat = NumberFormat.getPercentInstance();
				    percentFormat.setMaximumFractionDigits(2); // 设置小数点后保留的位数
				    //无形资产
					double intangibleAssets = rs1.getDouble("intangibleAssets");
					if(intangibleAssets==0) {
						rsf.setIntangibleAssetsFormated("");
					}else {
						rsf.setIntangibleAssetsFormated(df.format(intangibleAssets));
					}
					
					//商誉
					double goodwill = rs1.getDouble("goodwill");
					if(goodwill==0) {
						rsf.setGoodwillFormated("");
					}else {
						rsf.setGoodwillFormated(df.format(goodwill));
					}

					//总资产
					double totalAssets=rs1.getDouble("totalAssets");
					if (totalAssets == 0) {
		                rsf.setTotalAssetsFormated("");
		            } else {
		                rsf.setTotalAssetsFormated(df.format(totalAssets));
		            }
					
					//无形资产占比
					if(intangibleAssets==0 || totalAssets==0) {
						rsf.setTheProportionOfIntangibleAssetsFormated("");
					}else {
						double theProportionOfIntangibleAssets = intangibleAssets / totalAssets;
						rsf.setTheProportionOfIntangibleAssetsFormated(percentFormat.format(theProportionOfIntangibleAssets));
					}

					//商誉占比
					if(goodwill==0 || totalAssets==0) {
						rsf.setGoodwillProportionFormated("");
					}else {
						double goodwillProportion = goodwill / totalAssets;
						rsf.setGoodwillProportionFormated(percentFormat.format(goodwillProportion));
					}
				    list.add(rsf);

				}
			}catch(SQLException e) {
				e.printStackTrace();
		}
		return list;
		}
		
		//指标九：职工薪酬
		public ArrayList<ReportSummaryFormated> getEmployeeCompensation(String AShareCode,String financialReportingYear){
			ArrayList<ReportSummaryFormated> list=new ArrayList<ReportSummaryFormated>();
			String financialReportingNo=AShareCode+financialReportingYear;
			int year= Integer.parseInt(financialReportingYear);
			int lastYear=year-1;
			String lastYearStr=String.valueOf(lastYear);
			String lastfinancialReportingNo = AShareCode+lastYearStr;
			String sql="select fr_balancesheet.financialReportingNo,fr_balancesheet.payrollPayable, fr_balancesheet.totalNumberOfPeople, fr_cashflowstatement.cashPaidToAndOnBehalfOfEmployees from fr_balancesheet join fr_cashflowstatement on fr_balancesheet.financialReportingNo = fr_cashflowstatement.financialReportingNo where fr_balancesheet.financialReportingNo in  (?, ?)";
			
			try(PreparedStatement statement = con.prepareStatement(sql)){
				statement.setString(1,financialReportingNo);
				statement.setString(2,lastfinancialReportingNo);
				
				ReportSummaryFormated rsf=new ReportSummaryFormated();
				DecimalFormat df = new DecimalFormat("#,###.00");
				NumberFormat percentFormat = NumberFormat.getPercentInstance();
		        percentFormat.setMaximumFractionDigits(2); // 设置小数点后保留的位数
				
		        try(ResultSet rs = statement.executeQuery()){
					double currentPayrollPayable = 0;
				    double lastPayrollPayable = 0;

				    while (rs.next()) {
		        	
				    	String reportYear = rs.getString("financialReportingNo");
				        double payrollPayable = rs.getDouble("payrollPayable");

				        if (reportYear.equals(financialReportingNo)) {
				        	currentPayrollPayable = payrollPayable;
				        } else if (reportYear.equals(lastfinancialReportingNo)) {
				        	lastPayrollPayable = payrollPayable;
				        }
				        
				    	//应付职工薪酬
				    	if(currentPayrollPayable==0) {
				    		rsf.setPayrollPayableFormated("");
				    	}else {
				    		rsf.setPayrollPayableFormated(df.format(currentPayrollPayable));
				    	}
				
				
				    	//支付给职工以及为职工支付的现金
				    	double cashPaidToAndOnBehalfOfEmployees= rs.getDouble("cashPaidToAndOnBehalfOfEmployees");
				    	if(cashPaidToAndOnBehalfOfEmployees==0) {
				    		rsf.setCashPaidToAndOnBehalfOfEmployeesFormated("");
				    	}else {
				    		rsf.setCashPaidToAndOnBehalfOfEmployeesFormated(df.format(cashPaidToAndOnBehalfOfEmployees));
				    	}
	          	
				    	//总人数
				    	int totalNumberOfPeople= rs.getInt("totalNumberOfPeople");
				    	rsf.setTotalNumberOfPeople(totalNumberOfPeople);
	           
				    	//当年职工总薪酬（应付职工薪酬+支付给职工以及为职工支付的现金-去年应付职工薪酬）
				    	double totalEmployeeCompensation = currentPayrollPayable + cashPaidToAndOnBehalfOfEmployees - lastPayrollPayable;
				    	if(totalEmployeeCompensation==0) {
				    		rsf.setTotalEmployeeCompensationFormated("");
				    	}else {
				    		rsf.setTotalEmployeeCompensationFormated(df.format(totalEmployeeCompensation));
				    	}
	    		 
				    	//人均年薪(当年职工总薪酬 / 总人数)
				    	if(totalEmployeeCompensation==0 || totalNumberOfPeople==0) {
				    		rsf.setPerCapitaAnnualSalaryFormated("");
				    	}else {
				    		double perCapitaAnnualSalary = totalEmployeeCompensation / totalNumberOfPeople;
				    		rsf.setPerCapitaAnnualSalaryFormated(df.format(perCapitaAnnualSalary));
				    	}	
	                
				    	//人均月薪(当年职工总薪酬 / 总人数 / 12)
				    	if(totalEmployeeCompensation==0 || totalNumberOfPeople==0) {
				    		rsf.setPerCapitaMonthlySalaryFormated("");
				    	}else {
				    		double perCapitaMonthlySalary = totalEmployeeCompensation / totalNumberOfPeople / 12;
				    		rsf.setPerCapitaMonthlySalaryFormated(df.format(perCapitaMonthlySalary));
				    	}
				    }
				    
				    // 清空 list
				    list.clear();
				     
				     
				    list.add(rsf);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
	}
	return list;
	}
		
		//指标十：营业收入及增长
		public ArrayList<ReportSummaryFormated> getOperatingRevenueAndGrowth(String AShareCode,String financialReportingYear){
			ArrayList<ReportSummaryFormated> list=new ArrayList<ReportSummaryFormated>();
			String financialReportingNo=AShareCode+financialReportingYear;
			int year= Integer.parseInt(financialReportingYear);
			int lastYear=year-1;
			String lastYearStr=String.valueOf(lastYear);
			String lastfinancialReportingNo = AShareCode+lastYearStr;
			String sql="select operatingRevenue, financialReportingNo from fr_incomestatement where financialReportingNo IN (?, ?) ";
			
			try(PreparedStatement statement = con.prepareStatement(sql)){
				statement.setString(1,financialReportingNo);
				statement.setString(2,lastfinancialReportingNo);
				
				ReportSummaryFormated rsf=new ReportSummaryFormated();
				DecimalFormat df = new DecimalFormat("#,###.00");
				NumberFormat percentFormat = NumberFormat.getPercentInstance();
				percentFormat.setMaximumFractionDigits(2); // 设置小数点后保留的位数
				
				try(ResultSet rs = statement.executeQuery()){
					double currentOperatingRevenue = 0;
				    double lastOperatingRevenue = 0;

				    while (rs.next()) {
				        String reportYear = rs.getString("financialReportingNo");
				        double operatingRevenue = rs.getDouble("operatingRevenue");

				        if (reportYear.equals(financialReportingNo)) {
				        	currentOperatingRevenue = operatingRevenue;
				        } else if (reportYear.equals(lastfinancialReportingNo)) {
				        	lastOperatingRevenue = operatingRevenue;
				        }
				        
						//营业收入
						if(currentOperatingRevenue==0) {
							rsf.setOperatingRevenueFormated("");
						}else {
							rsf.setOperatingRevenueFormated(df.format(currentOperatingRevenue));
						}
						
				        //营业收入增长率
						if(lastOperatingRevenue==0) {
							rsf.setRevenueGrowthRateFormated("");
						}else {
							double revenueGrowthRate=(currentOperatingRevenue-lastOperatingRevenue)/lastOperatingRevenue;
							rsf.setRevenueGrowthRateFormated(percentFormat.format(revenueGrowthRate));
						}
					}
				    	// 清空 list
				    	list.clear();
				    
				    	list.add(rsf);
				}
			catch(SQLException e) {
						e.printStackTrace();
				}
			
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				return list;
				
				}
					
		
		//指标十：总资产周转率
		public ArrayList<ReportSummaryFormated> getOperatingRevenueAndGrowth1(String AShareCode,String financialReportingYear){
			ArrayList<ReportSummaryFormated> list=new ArrayList<ReportSummaryFormated>();
			String financialReportingNo=AShareCode+financialReportingYear;
			String sql="select fr_balancesheet.totalAssets, fr_incomestatement.operatingRevenue from fr_balancesheet join fr_incomestatement on fr_balancesheet.financialReportingNo = fr_incomestatement.financialReportingNo where fr_balancesheet.financialReportingNo='"+financialReportingNo+"'";
			try(ResultSet rs= this.getResult(sql)){
				while(rs.next()) {
					ReportSummaryFormated rsf=new ReportSummaryFormated();
					DecimalFormat df = new DecimalFormat("#,###.00");
					NumberFormat percentFormat = NumberFormat.getPercentInstance();
			        percentFormat.setMaximumFractionDigits(2); // 设置小数点后保留的位数
			        
			        //营业收入
					double operatingRevenue =rs.getDouble("operatingRevenue");
					if(operatingRevenue==0) {
						rsf.setOperatingRevenueFormated("");
					}else {
						rsf.setOperatingRevenueFormated(df.format(operatingRevenue));
					}
					
					//总资产
					double totalAssets=rs.getDouble("totalAssets");
					if(totalAssets==0) {
						rsf.setTotalAssetsFormated("");
					}else {
						rsf.setTotalAssetsFormated(df.format(totalAssets));
					}
					
					//总资产周转率（营业收入/总资产）
					if(operatingRevenue==0 || totalAssets==0) {
						rsf.setTotalAssetTurnoverFormated("");
					}else {
						double totalAssetTurnover=operatingRevenue/totalAssets;
						rsf.setTotalAssetTurnoverFormated(percentFormat.format(totalAssetTurnover));
					}
					list.add(rsf);
				}
			}catch (SQLException e) {
		        e.printStackTrace();
		    }
		return list;
		}
		
		//指标十：销售商品、提供劳务收到的现金营收占比
		public ArrayList<ReportSummaryFormated> getOperatingRevenueAndGrowth2(String AShareCode,String financialReportingYear){
			ArrayList<ReportSummaryFormated> list=new ArrayList<ReportSummaryFormated>();
			String financialReportingNo=AShareCode+financialReportingYear;
			String sql="select fr_incomestatement.operatingRevenue,fr_cashflowstatement.cashReceivedFromSellingGoodsAndProvidingServices from fr_incomestatement join fr_cashflowstatement on fr_incomestatement.financialReportingNo= fr_cashflowstatement.financialReportingNo where fr_incomestatement.financialReportingNo='"+financialReportingNo+"'";
			try(ResultSet rs = this.getResult(sql)){
				while(rs.next()) {
					ReportSummaryFormated rsf=new ReportSummaryFormated();
					DecimalFormat df = new DecimalFormat("#,###.00");
					NumberFormat percentFormat = NumberFormat.getPercentInstance();
			        percentFormat.setMaximumFractionDigits(2); // 设置小数点后保留的位数
			        
			        //营业收入
					double operatingRevenue =rs.getDouble("operatingRevenue");
					if(operatingRevenue==0) {
						rsf.setOperatingRevenueFormated("");
					}else {
						rsf.setOperatingRevenueFormated(df.format(operatingRevenue));
					}
					
					//销售商品、提供劳务收到的现金
					double cashReceivedFromSellingGoodsAndProvidingServices = rs.getDouble("cashReceivedFromSellingGoodsAndProvidingServices");
					if(cashReceivedFromSellingGoodsAndProvidingServices==0) {
						rsf.setCashReceivedFromSellingGoodsAndProvidingServicesFormated("");
					}else {
						rsf.setCashReceivedFromSellingGoodsAndProvidingServicesFormated(df.format(cashReceivedFromSellingGoodsAndProvidingServices));
					}
							
					//销售商品、提供劳务收到的现金占营收的比率
					if(cashReceivedFromSellingGoodsAndProvidingServices==0 || operatingRevenue==0) {
						rsf.setProportionOfCashSellingGoodsProvidingServicesFormated("");
					}else {
						double proportionOfCashSellingGoodsProvidingServices=cashReceivedFromSellingGoodsAndProvidingServices/operatingRevenue;
						rsf.setProportionOfCashSellingGoodsProvidingServicesFormated(percentFormat.format(proportionOfCashSellingGoodsProvidingServices));
					}
					
					list.add(rsf);
				}
			}catch(SQLException e) {
				e.printStackTrace();
		}
		return list;
		}
		
		
		//指标十一：营业收入构成风险
		public ArrayList<ReportSummaryFormated> getRiskPosedByOperatingIncomeComposition(String AShareCode,String financialReportingYear){
			ArrayList<ReportSummaryFormated> list=new ArrayList<ReportSummaryFormated>();
			String financialReportingNo=AShareCode+financialReportingYear;
			String sql="select * from fr_balancesheet  where financialReportingNo=?";
			try(PreparedStatement statement = con.prepareStatement(sql)){
				statement.setString(1,financialReportingNo);
				
				ReportSummaryFormated rsf=new ReportSummaryFormated();
				DecimalFormat df = new DecimalFormat("#,###.00");
				NumberFormat percentFormat = NumberFormat.getPercentInstance();
				percentFormat.setMaximumFractionDigits(2); // 设置小数点后保留的位数
				
				try(ResultSet rs = statement.executeQuery()){        
					while (rs.next()) {  
						//总资产
						double totalAssets =rs.getDouble("totalAssets");
						if(totalAssets==0) {
							rsf.setTotalAssetsFormated("");
						}else {
							rsf.setTotalAssetsFormated(df.format(totalAssets));
						}
						
						//应收账款
						double accountsReceivable = rs.getDouble("accountsReceivable");
						if(accountsReceivable==0) {
							rsf.setAccountsReceivableFormated("");
						}else {
							rsf.setAccountsReceivableFormated(df.format(accountsReceivable));
						}
						
						//预付款项
						double prepayments = rs.getDouble("prepayments");
						if(prepayments==0) {
							rsf.setPrepaymentsFormated("");
						}else {
							rsf.setPrepaymentsFormated(df.format(prepayments));
						}
						
						//应收账款/总资产
						if(accountsReceivable==0 || totalAssets==0) {
							rsf.setAccountsReceivablePercentageOfRevenueFormated("");
						}else {
						double accountsReceivablePercentageOfRevenue=accountsReceivable/totalAssets;
						rsf.setAccountsReceivablePercentageOfRevenueFormated(percentFormat.format(accountsReceivablePercentageOfRevenue));
						}
						
						//预付款项/总资产
						if(prepayments==0 || totalAssets==0) {
							rsf.setPrepaymentsPercentageOfRevenueFormated("");
						}else {
						double prepaymentsPercentageOfRevenue=prepayments/totalAssets;
						rsf.setPrepaymentsPercentageOfRevenueFormated(percentFormat.format(prepaymentsPercentageOfRevenue));
						}
						
						//其他应收款
						double otherReceivables = rs.getDouble("otherReceivables");
						if(otherReceivables==0) {
							rsf.setOtherReceivablesFormated("");
						}else {
							rsf.setOtherReceivablesFormated(df.format(otherReceivables));
						}
						
						//其他应收款/总资产
						if(otherReceivables==0 || totalAssets==0) {
							rsf.setOtherReceivablesPercentageOfRevenueFormated("");
						}else {
						double otherReceivablesPercentageOfRevenue=otherReceivables/totalAssets;
						rsf.setOtherReceivablesPercentageOfRevenueFormated(percentFormat.format(otherReceivablesPercentageOfRevenue));
						}
				        
						//存货
				        double inventory = rs.getDouble("inventory");
				        if(inventory==0) {
							rsf.setInventoryFormated("");
						}else {
							rsf.setInventoryFormated(df.format(inventory));
						}
						
						
						//存货/总资产
						if(inventory==0 || totalAssets==0) {
							rsf.setInventoryToRevenueRatioFormated("");
						}else {
						double inventoryToRevenueRatio=inventory/totalAssets;
						rsf.setInventoryToRevenueRatioFormated(percentFormat.format(inventoryToRevenueRatio));
						}
					}
				     
				     list.add(rsf);
				     
					}
				}catch(SQLException e) {
					e.printStackTrace();
			}
			return list;
			}
		
		//指标十一：营业收入构成风险：存货增长率
		public ArrayList<ReportSummaryFormated> getRiskPosedByOperatingIncomeComposition1(String AShareCode,String financialReportingYear){
			ArrayList<ReportSummaryFormated> list=new ArrayList<ReportSummaryFormated>();
			String financialReportingNo=AShareCode+financialReportingYear;
			int year= Integer.parseInt(financialReportingYear);
			int lastYear=year-1;
			String lastYearStr=String.valueOf(lastYear);
			String lastfinancialReportingNo = AShareCode+lastYearStr;
			String sql="select * from fr_balancesheet  where financialReportingNo  IN (?, ?)";
			try(PreparedStatement statement = con.prepareStatement(sql)){
				statement.setString(1,financialReportingNo);
				statement.setString(2,lastfinancialReportingNo);
				
				ReportSummaryFormated rsf=new ReportSummaryFormated();
				NumberFormat percentFormat = NumberFormat.getPercentInstance();
				percentFormat.setMaximumFractionDigits(2); // 设置小数点后保留的位数
				
				try(ResultSet rs = statement.executeQuery()){        
					double currentInventory =0;
					double lastInventory =0;
	
					while (rs.next()) {  
						
						String reportYear = rs.getString("financialReportingNo");
				        double inventory = rs.getDouble("inventory");
				        
				        if (reportYear.equals(financialReportingNo)) {
				        	currentInventory = inventory;
				        } else if (reportYear.equals(lastfinancialReportingNo)) {
				        	lastInventory = inventory;
				        }
						
						//存货增长率
						if (currentInventory != 0 && lastInventory != 0) {
			                double inventoryGrowthRate = (currentInventory - lastInventory) / lastInventory;
			                rsf.setInventoryGrowthRateFormated(percentFormat.format(inventoryGrowthRate));
			            } else {
			                rsf.setInventoryGrowthRateFormated(""); // 存货为零时设置增长率为空
			            }
					}
				
			// 清空 list
		     list.clear();
		     
		     list.add(rsf);
		     
			}
		}catch(SQLException e) {
			e.printStackTrace();
	}
	return list;
	}
			
		
		
		//指标十二：毛利率
		public ArrayList<ReportSummaryFormated> getGrossMargin(String AShareCode,String financialReportingYear){
			ArrayList<ReportSummaryFormated> list=new ArrayList<ReportSummaryFormated>();
			String financialReportingNo=AShareCode+financialReportingYear;
			String sql1="select * from fr_incomestatement where financialReportingNo='"+financialReportingNo+"'";
			ResultSet rs1 = this.getResult(sql1);
			try{
				while(rs1.next()) {
					ReportSummaryFormated rsf=new ReportSummaryFormated();
					DecimalFormat df = new DecimalFormat("#,###.00");
					NumberFormat percentFormat = NumberFormat.getPercentInstance();
					percentFormat.setMaximumFractionDigits(2); // 设置小数点后保留的位数
					
					//营业收入
					double operatingRevenue =rs1.getDouble("operatingRevenue");
					if(operatingRevenue==0) {
						rsf.setOperatingRevenueFormated("");
					}else {
						rsf.setOperatingRevenueFormated(df.format(operatingRevenue));
					}
					
					//营业成本
					double operatingCosts =rs1.getDouble("operatingCosts");
					if(operatingCosts==0) {
						rsf.setOperatingCostsFormated("");
					}else {
						rsf.setOperatingCostsFormated(df.format(operatingCosts));
					}
					
					//毛利率（营业收入-营业成本）/营业收入
					if(operatingRevenue==0 || operatingCosts==0) {
						rsf.setGrossMarginFormated("");
					}else {
					double grossMargin=(operatingRevenue-operatingCosts)/operatingRevenue;
					rsf.setGrossMarginFormated(percentFormat.format(grossMargin));
					}
					list.add(rsf);
				}
			}catch(SQLException e) {
				e.printStackTrace();
		}
		return list;
		}
		
		//指标十三：费用率
		public ArrayList<ReportSummaryFormated> getExpense(String AShareCode,String financialReportingYear){
			ArrayList<ReportSummaryFormated> list=new ArrayList<ReportSummaryFormated>();
			String financialReportingNo=AShareCode+financialReportingYear;
			String sql1="select * from fr_incomestatement where financialReportingNo='"+financialReportingNo+"'";
			ResultSet rs1 = this.getResult(sql1);
			try{
				while(rs1.next()) {
					ReportSummaryFormated rsf=new ReportSummaryFormated();
					DecimalFormat df = new DecimalFormat("#,###.00");
					NumberFormat percentFormat = NumberFormat.getPercentInstance();
					percentFormat.setMaximumFractionDigits(2); // 设置小数点后保留的位数
					
					//营业收入
					double operatingRevenue =rs1.getDouble("operatingRevenue");
					if(operatingRevenue==0) {
						rsf.setOperatingRevenueFormated("");
					}else {
						rsf.setOperatingRevenueFormated(df.format(operatingRevenue));
					}
					
					//销售费用
					double sellingExpenses = rs1.getDouble("sellingExpenses");
					if(sellingExpenses==0) {
						rsf.setSellingExpensesFormated("");
					}else {
						rsf.setSellingExpensesFormated(df.format(sellingExpenses));
					}
					
					//销售费用率（销售费用 / 营业收入）
					if(sellingExpenses==0 || operatingRevenue==0) {
						rsf.setSalesExpenseRateFormated("");
					}else {
					double salesExpenseRate= sellingExpenses / operatingRevenue;
					rsf.setSalesExpenseRateFormated(percentFormat.format(salesExpenseRate));
					}
					
					//管理费用
					double overhead = rs1.getDouble("overhead");
					if(overhead==0) {
						rsf.setOverheadFormated("");
					}else {
						rsf.setOverheadFormated(df.format(overhead));
					}
					
					//管理费用率（管理费用 / 营业收入）
					if(overhead==0 || operatingRevenue==0) {
						rsf.setManagementExpenseRateFormated("");
					}else {
					double managementExpenseRate= overhead / operatingRevenue;
					rsf.setManagementExpenseRateFormated(percentFormat.format(managementExpenseRate));
					}
					
					//研发费用
					double researchAndDevelopment=rs1.getDouble("researchAndDevelopment");
					if(researchAndDevelopment==0) {
						rsf.setResearchAndDevelopmentFormated("");
					}else {
						rsf.setResearchAndDevelopmentFormated(df.format(researchAndDevelopment));
					}
					
					//研发费用率（研发费用 / 营业收入）
					if(researchAndDevelopment==0 || operatingRevenue==0) {
						rsf.setResearchAndDevelopmentRateFormated("");
					}else {
					double researchAndDevelopmentRate= researchAndDevelopment / operatingRevenue;
					rsf.setResearchAndDevelopmentRateFormated(percentFormat.format(researchAndDevelopmentRate));
					}
					
					//财务费用
					double financialExpenses = rs1.getDouble("financialExpenses");
					if(financialExpenses==0) {
						rsf.setFinancialExpensesFormated("");
					}else {
						rsf.setFinancialExpensesFormated(df.format(financialExpenses));
					}
					
					//四项费用 (销售费用 + 管理费用 + 研发费用 + 财务费用)
					double fourExpenses = sellingExpenses + overhead + researchAndDevelopment + financialExpenses;
					if(fourExpenses==0) {
						rsf.setFourExpensesFormated("");
					}else {
						rsf.setFourExpensesFormated(df.format(fourExpenses));
					}
					
					//费用率 (四项费用 / 营业收入)
					if(fourExpenses==0 || operatingRevenue==0) {
						rsf.setExpenseFormated("");
					}else {
					double expense= fourExpenses / operatingRevenue;
					rsf.setExpenseFormated(percentFormat.format(expense));
					}
					
					//营业成本
					double operatingCosts =rs1.getDouble("operatingCosts");
					if(operatingCosts==0) {
						rsf.setOperatingCostsFormated("");
					}else {
						rsf.setOperatingCostsFormated(df.format(operatingCosts));
					}
					
					//费用率占毛利率的比率( 费用率 / 毛利率)
					double expense= fourExpenses / operatingRevenue;
					double grossMargin=(operatingRevenue-operatingCosts)/operatingRevenue;
					if(expense==0 || grossMargin==0  ) {
						rsf.setExpenseRateToGrossProfitMarginFormated("");
					}else {
					double expenseRateToGrossProfitMargin= expense / grossMargin;
					rsf.setExpenseRateToGrossProfitMarginFormated(percentFormat.format(expenseRateToGrossProfitMargin));
					}
					list.add(rsf);
				}
			}catch(SQLException e) {
				e.printStackTrace();
		}
		return list;
		}
		
		//指标十四：主营利润和营业利润率
		public ArrayList<ReportSummaryFormated> getMainOperatingProfitAndOperatingProfitMargin(String AShareCode,String financialReportingYear){
			ArrayList<ReportSummaryFormated> list=new ArrayList<ReportSummaryFormated>();
			String financialReportingNo=AShareCode+financialReportingYear;
			String sql="select * from fr_incomestatement where financialReportingNo='"+financialReportingNo+"'";
			ResultSet rs = this.getResult(sql);
			try{
				while(rs.next()) {
					ReportSummaryFormated rsf=new ReportSummaryFormated();
					DecimalFormat df = new DecimalFormat("#,###.00");
					NumberFormat percentFormat = NumberFormat.getPercentInstance();
					percentFormat.setMaximumFractionDigits(2); // 设置小数点后保留的位数
					
					//营业收入
					double operatingRevenue =rs.getDouble("operatingRevenue");
					if(operatingRevenue==0) {
						rsf.setOperatingRevenueFormated("");
					}else {
						rsf.setOperatingRevenueFormated(df.format(operatingRevenue));
					}
					
					//营业成本
					double operatingCosts =rs.getDouble("operatingCosts");
					if(operatingCosts==0) {
						rsf.setOperatingCostsFormated("");
					}else {
						rsf.setOperatingCostsFormated(df.format(operatingCosts));
					}
					
					//税金及附加
					double taxesAndSurcharges =rs.getDouble("taxesAndSurcharges");
					if(taxesAndSurcharges==0) {
						rsf.setTaxesAndSurchargesFormated("");
					}else {
						rsf.setTaxesAndSurchargesFormated(df.format(taxesAndSurcharges));
					}
					
					//利润总额
					double totalProfit = rs.getDouble("totalProfit");
					if(totalProfit==0) {
						rsf.setTotalProfitFormated("");
					}else {
						rsf.setTotalProfitFormated(df.format(totalProfit));
					}
					
					//销售费用
					double sellingExpenses = rs.getDouble("sellingExpenses");
					if(sellingExpenses==0) {
						rsf.setSellingExpensesFormated("");
					}else {
						rsf.setSellingExpensesFormated(df.format(sellingExpenses));
					}
					
					//管理费用
					double overhead = rs.getDouble("overhead");
					if(overhead==0) {
						rsf.setOverheadFormated("");
					}else {
						rsf.setOverheadFormated(df.format(overhead));
					}
					
					//研发费用
					double researchAndDevelopment=rs.getDouble("researchAndDevelopment");
					if(researchAndDevelopment==0) {
						rsf.setResearchAndDevelopmentFormated("");
					}else {
						rsf.setResearchAndDevelopmentFormated(df.format(researchAndDevelopment));
					}
					
					//财务费用
					double financialExpenses = rs.getDouble("financialExpenses");
					if(financialExpenses==0) {
						rsf.setFinancialExpensesFormated("");
					}else {
						rsf.setFinancialExpensesFormated(df.format(financialExpenses));
					}
					
					//四项费用 (销售费用 + 管理费用 + 研发费用 + 财务费用)
					double fourExpenses = sellingExpenses + overhead + researchAndDevelopment + financialExpenses;
					if(fourExpenses==0) {
						rsf.setFourExpensesFormated("");
					}else {
						rsf.setFourExpensesFormated(df.format(fourExpenses));
					}
					
					//主营利润 (营业收入 - 营业成本 - 税金及附加 - 四项费用)
					double mainProfit = operatingRevenue - operatingCosts - taxesAndSurcharges - fourExpenses;
					if(mainProfit==0) {
						rsf.setMainProfitFormated("");
					}else {
						rsf.setMainProfitFormated(df.format(mainProfit));
					}
					
					//主营利润率 （主营利润 / 营业收入）
					if(mainProfit==0 || operatingRevenue==0  ) {
						rsf.setMainProfitMarginFormated("");
					}else {
					double mainProfitMargin= mainProfit / operatingRevenue;
					rsf.setMainProfitMarginFormated(percentFormat.format(mainProfitMargin));
					}

					//营业利润
					double operatingProfit = rs.getDouble("operatingProfit");
					if(operatingProfit==0) {
						rsf.setOperatingProfitFormated("");
					}else {
						rsf.setOperatingProfitFormated(df.format(operatingProfit));
					}
					
					
					//主营利润占利润总额的比例 (主营利润 / 利润总额)
					if(mainProfit==0 || totalProfit==0  ) {
						rsf.setMainOperatingProfitToTotalProfitFormated("");
					}else {
					double mainOperatingProfitToTotalProfit= mainProfit / totalProfit;
					rsf.setMainOperatingProfitToTotalProfitFormated(percentFormat.format(mainOperatingProfitToTotalProfit));
					
					}
					
					//主营利润占营业利润的比例（主营利润 / 营业利润）
					if(mainProfit==0 || operatingProfit==0  ) {
						rsf.setOperatingMarginFormated("");
					}else {
					double operatingMargin= mainProfit / operatingProfit;
					rsf.setOperatingMarginFormated(percentFormat.format(operatingMargin));
					
					}
					list.add(rsf);
				}
			}catch(SQLException e) {
				e.printStackTrace();
		}
		return list;
		}
		
		//指标十五：净利润：净利润增长
		public ArrayList<ReportSummaryFormated> getNetProfit(String AShareCode,String financialReportingYear){
			ArrayList<ReportSummaryFormated> list=new ArrayList<ReportSummaryFormated>();
			String financialReportingNo=AShareCode+financialReportingYear;
			int year= Integer.parseInt(financialReportingYear);
			int lastYear=year-1;
			String lastYearStr=String.valueOf(lastYear);
			String lastfinancialReportingNo = AShareCode+lastYearStr;
			String sql="select netProfit, financialReportingNo from fr_incomestatement where financialReportingNo in (?,?) ";

			try(PreparedStatement statement = con.prepareStatement(sql)){
				statement.setString(1,financialReportingNo);
				statement.setString(2,lastfinancialReportingNo);
				ReportSummaryFormated rsf=new ReportSummaryFormated();
				DecimalFormat df = new DecimalFormat("#,###.00");
				NumberFormat percentFormat = NumberFormat.getPercentInstance();
				percentFormat.setMaximumFractionDigits(2); // 设置小数点后保留的位数
				try(ResultSet rs = statement.executeQuery()){
					double currentNetProfit = 0;
				    double lastNetProfit = 0;
					
				    while (rs.next()) {
				        String reportYear = rs.getString("financialReportingNo");
				        double netProfit = rs.getDouble("netProfit");
				        
				        if (reportYear.equals(financialReportingNo)) {
				        	currentNetProfit = netProfit;
				        } else if (reportYear.equals(lastfinancialReportingNo)) {
				        	lastNetProfit = netProfit;
				        }
				        
					//净利润
					if(currentNetProfit==0) {
						rsf.setNetProfitFormated("");
					}else {
						rsf.setNetProfitFormated(df.format(currentNetProfit));
						System.out.print("净利润："+currentNetProfit);
					}
						
					//净利润增长率
					 if (currentNetProfit != 0 && lastNetProfit != 0) {
			                double netProfitGrowthRate = (currentNetProfit - lastNetProfit) / lastNetProfit;
			                rsf.setNetProfitGrowthRateFormated(percentFormat.format(netProfitGrowthRate));
			                System.out.print("净利润增长率："+netProfitGrowthRate);
					 } else {
			                rsf.setNetProfitGrowthRateFormated(""); // 
			            }
					
					// 清空 list
				     list.clear();
				     
					 list.add(rsf);
					}
		            } catch (SQLException e) {
		                e.printStackTrace();
		            }
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		return list;
		}
		
		//指标十五：净利润：净利润率
		public ArrayList<ReportSummaryFormated> getNetProfit1(String AShareCode,String financialReportingYear){
			ArrayList<ReportSummaryFormated> list=new ArrayList<ReportSummaryFormated>();
			String financialReportingNo=AShareCode+financialReportingYear;
			String sql="select * from fr_incomestatement where financialReportingNo='"+financialReportingNo+"'";

			try(ResultSet rs = this.getResult(sql)){
				while(rs.next()) {
					ReportSummaryFormated rsf=new ReportSummaryFormated();
					DecimalFormat df = new DecimalFormat("#,###.00");
					NumberFormat percentFormat = NumberFormat.getPercentInstance();
					percentFormat.setMaximumFractionDigits(2); // 设置小数点后保留的位数
							
							//净利润
							double netProfit = rs.getDouble("netProfit");
							if(netProfit==0) {
								rsf.setNetProfitFormated("");
							}else {
								rsf.setNetProfitFormated(df.format(netProfit));
							}
							
							//营业收入
							double operatingRevenue = rs.getDouble("operatingRevenue");
							if(operatingRevenue==0) {
								rsf.setOperatingRevenueFormated("");
							}else {
								rsf.setOperatingRevenueFormated(df.format(operatingRevenue));
							}
							
							//净利润率
							if(netProfit==0 || operatingRevenue==0  ) {
								rsf.setNetProfitMarginFormated("");
							}else {
								double netProfitMargin= netProfit/operatingRevenue;
								rsf.setNetProfitMarginFormated(percentFormat.format(netProfitMargin));
							} 
							list.add(rsf);
				    }
			} catch (SQLException e) {
				     e.printStackTrace();
			}
			return list;
		}
		
		//指标十五：净利润：净现比
				public ArrayList<ReportSummaryFormated> getNetProfit2(String AShareCode,String financialReportingYear){
					ArrayList<ReportSummaryFormated> list=new ArrayList<ReportSummaryFormated>();
					String financialReportingNo=AShareCode+financialReportingYear;
					
					String sql="select fr_incomestatement.netProfit, fr_cashflowstatement.netCashFlowFromOperating from fr_incomestatement join fr_cashflowstatement on  fr_incomestatement.financialReportingNo = fr_cashflowstatement.financialReportingNo where fr_incomestatement.financialReportingNo='"+financialReportingNo+"'";
							try(ResultSet rs = this.getResult(sql)){
								while(rs.next()) {
									ReportSummaryFormated rsf=new ReportSummaryFormated();
									DecimalFormat df = new DecimalFormat("#,###.00");
									NumberFormat percentFormat = NumberFormat.getPercentInstance();
									percentFormat.setMaximumFractionDigits(2); // 设置小数点后保留的位数
									
									//净利润
									double netProfit = rs.getDouble("netProfit");
									if(netProfit==0) {
										rsf.setNetProfitFormated("");
									}else {
										rsf.setNetProfitFormated(df.format(netProfit));
									}
									
									//经营活动产生的现金流量净额
						             double netCashFlowFromOperating = rs.getDouble("netCashFlowFromOperating");
						             if(netCashFlowFromOperating==0) {
						                rsf.setNetCashFlowFromOperatingFormated("");
						            }else {
						                rsf.setNetCashFlowFromOperatingFormated(df.format(netCashFlowFromOperating));
						             }
						             
						             //净利润现金比率（经营活动产生的现金流量净额 / 净利润）
									if(netCashFlowFromOperating==0 || netProfit==0  ) {
										rsf.setNetProfitCashRatioFormated("");
									}else {
										double netProfitCashRatio= netCashFlowFromOperating / netProfit;
										rsf.setNetProfitCashRatioFormated(percentFormat.format(netProfitCashRatio));
									}
									
									list.add(rsf);
						       }
						            } catch (SQLException e) {
							                e.printStackTrace();
							        }
									
						return list;
						}
		
		//指标十六：归母净利润
		public ArrayList<ReportSummaryFormated> getNetProfitAttributableToShareholders(String AShareCode,String financialReportingYear){
			ArrayList<ReportSummaryFormated> list=new ArrayList<ReportSummaryFormated>();
			String financialReportingNo=AShareCode+financialReportingYear;
			int year= Integer.parseInt(financialReportingYear);
			int lastYear=year-1;
			String lastYearStr=String.valueOf(lastYear);
			String lastfinancialReportingNo = AShareCode+lastYearStr;
			String sql="select * from fr_incomestatement where financialReportingNo in (?,?)";
			try(PreparedStatement statement = con.prepareStatement(sql)){
				statement.setString(1,financialReportingNo);
				statement.setString(2,lastfinancialReportingNo);
				ReportSummaryFormated rsf=new ReportSummaryFormated();
				DecimalFormat df = new DecimalFormat("#,###.00");
				NumberFormat percentFormat = NumberFormat.getPercentInstance();
				percentFormat.setMaximumFractionDigits(2); // 设置小数点后保留的位数
			
				try(ResultSet rs = statement.executeQuery()){
					double currentYearNetIncomeAttributableToShareholders = 0;
				    double lastYearNetIncomeAttributableToShareholders = 0;

				    while (rs.next()) {
					
				    	 String reportYear = rs.getString("financialReportingNo");
				    	 double netIncomeAttributableToShareholders = rs.getDouble("netIncomeAttributableToShareholders");
					
				    	 if (reportYear.equals(financialReportingNo)) {
				    		 currentYearNetIncomeAttributableToShareholders = netIncomeAttributableToShareholders;
					        } else if (reportYear.equals(lastfinancialReportingNo)) {
					         lastYearNetIncomeAttributableToShareholders = netIncomeAttributableToShareholders;
					        }
				    	 
				    	 //今年归属于母公司所有者的净利润
				    	 if(currentYearNetIncomeAttributableToShareholders==0) {
				    		 rsf.setNetIncomeAttributableToShareholdersFormated("");
				    	 }else {
				    		 rsf.setNetIncomeAttributableToShareholdersFormated(df.format(currentYearNetIncomeAttributableToShareholders));
				    	 }
					
				    	 //ROE
				    	 Double ROE = rs.getDouble("ROE");
				    	 if(ROE==0) {
				    		 rsf.setROEFormated("");
				    	 }else {
				    		 rsf.setROEFormated(percentFormat.format(ROE));
				    	 } 


			             // 归母净利润增长率
				    	 if (currentYearNetIncomeAttributableToShareholders != 0 && lastYearNetIncomeAttributableToShareholders != 0) {
				                double growthRateOfNetIncomeAttributableToShareholders = (currentYearNetIncomeAttributableToShareholders - lastYearNetIncomeAttributableToShareholders) / lastYearNetIncomeAttributableToShareholders;
				                rsf.setGrowthRateOfNetIncomeAttributableToShareholdersFormated(percentFormat.format(growthRateOfNetIncomeAttributableToShareholders));
				            } else {
				                rsf.setGrowthRateOfNetIncomeAttributableToShareholdersFormated(""); // 存货为零时设置增长率为空
				            
			            }
				    	// 清空 list
					     list.clear();
					     
					     
			            list.add(rsf);
					 }
				}catch(SQLException e) {
							e.printStackTrace();
					}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
		}
	return list;
}
	
		//指标十七：经营活动产生的现金流量净额
		public ArrayList<ReportSummaryFormated> getNetCashFlowGeneratedFromOperatingActivities(String AShareCode,String financialReportingYear){
			ArrayList<ReportSummaryFormated> list=new ArrayList<ReportSummaryFormated>();
			String financialReportingNo=AShareCode+financialReportingYear;
			String sql="select fr_cashflowstatement.netCashFlowFromOperating, fr_cashflowstatement.cashPaidForDistributingDividendsProfitsPayingInterest, fr_cashflowsupplement.depreciation, fr_cashflowsupplement.amortizationOfIntangibleAssets from fr_cashflowstatement join fr_cashflowsupplement on fr_cashflowstatement.financialReportingNo = fr_cashflowsupplement.financialReportingNo where fr_cashflowstatement.financialReportingNo='"+financialReportingNo+"'";
			
			try(ResultSet rs= this.getResult(sql))
			{
				while(rs.next()) {
					ReportSummaryFormated rsf=new ReportSummaryFormated();
					DecimalFormat df = new DecimalFormat("#,###.00");
					NumberFormat percentFormat = NumberFormat.getPercentInstance();
					percentFormat.setMaximumFractionDigits(2); // 设置小数点后保留的位数
					
					//经营活动产生的现金流量净额
					double netCashFlowFromOperating =rs.getDouble("netCashFlowFromOperating");
					if(netCashFlowFromOperating==0) {
						rsf.setNetCashFlowFromOperatingFormated("");
					}else {
						rsf.setNetCashFlowFromOperatingFormated(df.format(netCashFlowFromOperating));
					}
					
					//现金股利(分配股利、利润或偿付利息支付的现金)
					double cashPaidForDistributingDividendsProfitsPayingInterest =rs.getDouble("cashPaidForDistributingDividendsProfitsPayingInterest");
					if(cashPaidForDistributingDividendsProfitsPayingInterest==0) {
						rsf.setCashPaidForDistributingDividendsProfitsPayingInterestFormated("");
					}else {
						rsf.setCashPaidForDistributingDividendsProfitsPayingInterestFormated(df.format(cashPaidForDistributingDividendsProfitsPayingInterest));
					}
					
		            //固定资产折旧
					double depreciation = rs.getDouble("depreciation");
					if(depreciation==0) {
						rsf.setDepreciationFormated("");
					}else {
						rsf.setDepreciationFormated(df.format(depreciation));
					}
							
					//无形资产摊销
					double amortizationOfIntangibleAssets = rs.getDouble("amortizationOfIntangibleAssets");
					if(amortizationOfIntangibleAssets==0) {
						rsf.setAmortizationOfIntangibleAssetsFormated("");
					}else {
						rsf.setAmortizationOfIntangibleAssetsFormated(df.format(amortizationOfIntangibleAssets));
					}
							
					//经营活动产生的现金流量净额减去以上三项的余额
					double remainingCash = netCashFlowFromOperating - depreciation - amortizationOfIntangibleAssets -cashPaidForDistributingDividendsProfitsPayingInterest;
						if(remainingCash==0) {
							rsf.setRemainingCashFormated("");
						}else {
							rsf.setRemainingCashFormated(df.format(remainingCash));
						}
						
					list.add(rsf);
		          }
		  } catch (SQLException e) {
		                e.printStackTrace();
		  }
			
		return list;
		}
		
		//指标十八：购建固定资产、无形资产和其他长期资产支付的现金
		public ArrayList<ReportSummaryFormated> getCashPaid(String AShareCode,String financialReportingYear){
			ArrayList<ReportSummaryFormated> list=new ArrayList<ReportSummaryFormated>();
			String financialReportingNo=AShareCode+financialReportingYear;
			String sql1="select * from fr_cashflowstatement where financialReportingNo='"+financialReportingNo+"'";
			ResultSet rs1 = this.getResult(sql1);
			try{
				while(rs1.next()) {
					ReportSummaryFormated rsf=new ReportSummaryFormated();
					DecimalFormat df = new DecimalFormat("#,###.00");
					NumberFormat percentFormat = NumberFormat.getPercentInstance();
					percentFormat.setMaximumFractionDigits(2); // 设置小数点后保留的位数
			
					//经营活动产生的现金流量净额
					double netCashFlowFromOperating =rs1.getDouble("netCashFlowFromOperating");
					if(netCashFlowFromOperating==0) {
						rsf.setNetCashFlowFromOperatingFormated("");
					}else {
						rsf.setNetCashFlowFromOperatingFormated(df.format(netCashFlowFromOperating));
					}
					
					//购建固定资产、无形资产和其他长期资产支付的现金
					double cashPaidForPurchaseConstructionFixedIntangibleLongTermAssets = rs1.getDouble("cashPaidForPurchaseConstructionFixedIntangibleLongTermAssets");
					if(cashPaidForPurchaseConstructionFixedIntangibleLongTermAssets==0) {
						rsf.setCashPaidForPurchaseConstructionFixedIntangibleLongTermAssetsFormated("");
					}else {
						rsf.setCashPaidForPurchaseConstructionFixedIntangibleLongTermAssetsFormated(df.format(cashPaidForPurchaseConstructionFixedIntangibleLongTermAssets));
					}
					
					//处置固定、无形和其他长期资产收回现金
					double netCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssets = rs1.getDouble("netCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssets");
					if(netCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssets==0) {
						rsf.setNetCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssetsFormated("");
					}else {
						rsf.setNetCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssetsFormated(df.format(netCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssets));
					}

					//购建固产占经营活动产生的现金比（购建固定资产、无形资产和其他长期资产支付的现金 / 经营活动产生的现金流量净额）
					if(cashPaidForPurchaseConstructionFixedIntangibleLongTermAssets==0 || netCashFlowFromOperating==0  ) {
						rsf.setPurchaseConstructionFixedIntangibleLongTermAssetsProportionFormated("");
					}else {
					double purchaseConstructionFixedIntangibleLongTermAssetsProportion= cashPaidForPurchaseConstructionFixedIntangibleLongTermAssets / netCashFlowFromOperating;
					rsf.setPurchaseConstructionFixedIntangibleLongTermAssetsProportionFormated(percentFormat.format(purchaseConstructionFixedIntangibleLongTermAssetsProportion));
					}
					
					//处置固定资产、无形资产和其他长期资产收回的现金净额占购建资产支付的现金比（处置固定、无形和其他长期资产收回现金 / 购建固定资产、无形资产和其他长期资产支付的现金）
					if(netCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssets==0 || cashPaidForPurchaseConstructionFixedIntangibleLongTermAssets==0  ) {
						rsf.setNetCashReceivedFromDisposalProportionTopurchaseFormated("");
					}else {
					double netCashReceivedFromDisposalProportionTopurchase= netCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssets / cashPaidForPurchaseConstructionFixedIntangibleLongTermAssets;
					rsf.setNetCashReceivedFromDisposalProportionTopurchaseFormated(percentFormat.format(netCashReceivedFromDisposalProportionTopurchase));
					}
					
					list.add(rsf);
				}
			}catch(SQLException e) {
				e.printStackTrace();
		}
		return list;
		}
		
		//指标十九：分红率
		public ArrayList<ReportSummaryFormated> getDividendRate(String AShareCode,String financialReportingYear){
			ArrayList<ReportSummaryFormated> list=new ArrayList<ReportSummaryFormated>();
			String financialReportingNo=AShareCode+financialReportingYear;
			String sql1="select * from fr_incomestatement where financialReportingNo='"+financialReportingNo+"'";
			ResultSet rs1 = this.getResult(sql1);
			try	{
				while(rs1.next()) {
					ReportSummaryFormated rsf=new ReportSummaryFormated();
					DecimalFormat df = new DecimalFormat("#,###.00");
					NumberFormat percentFormat = NumberFormat.getPercentInstance();
					percentFormat.setMaximumFractionDigits(2); // 设置小数点后保留的位数
					
					//现金分红金额
					double financialReportDividends = rs1.getDouble("financialReportDividends");
					if(financialReportDividends==0) {
						rsf.setFinancialReportDividendsFormated("");
					}else {
						rsf.setFinancialReportDividendsFormated(df.format(financialReportDividends));
					}
					
					//归属于母公司所有者的净利润
					double netIncomeAttributableToShareholders = rs1.getDouble("netIncomeAttributableToShareholders");
					if(netIncomeAttributableToShareholders==0) {
						rsf.setNetIncomeAttributableToShareholdersFormated("");
					}else {
						rsf.setNetIncomeAttributableToShareholdersFormated(df.format(netIncomeAttributableToShareholders));
					}
					
					//分红率（股利支付率）(现金分红金额 / 归属于母公司所有者的净利润)
					if(financialReportDividends==0 || netIncomeAttributableToShareholders==0  ) {
						rsf.setDividendRateFormated("");
					}else {
					double dividendRate= financialReportDividends / netIncomeAttributableToShareholders;
					rsf.setDividendRateFormated(percentFormat.format(dividendRate));
					}
					
					list.add(rsf);
				}
			}catch(SQLException e) {
				e.printStackTrace();
		}
		return list;
		}
		
		//指标二十：三大现金流量净额的组合类型
		public ArrayList<ReportSummaryFormated> getCompanyType(String AShareCode,String financialReportingYear){
			ArrayList<ReportSummaryFormated> list=new ArrayList<ReportSummaryFormated>();
			String financialReportingNo=AShareCode+financialReportingYear;
			String sql="select * from fr_cashflowstatement where financialReportingNo=?";
			
			try(PreparedStatement statement = con.prepareStatement(sql)){
				statement.setString(1,financialReportingNo);
				try(ResultSet rs = statement.executeQuery()){
					while(rs.next()) {
					ReportSummaryFormated rsf=new ReportSummaryFormated();
					DecimalFormat df = new DecimalFormat("#,###.00");
					NumberFormat percentFormat = NumberFormat.getPercentInstance();
					percentFormat.setMaximumFractionDigits(2); // 设置小数点后保留的位数
					
					//经营活动产生的现金流量净额
					double netCashFlowFromOperating =rs.getDouble("netCashFlowFromOperating");
					if(netCashFlowFromOperating==0) {
						rsf.setNetCashFlowFromOperatingFormated("");
					}else {
						rsf.setNetCashFlowFromOperatingFormated(df.format(netCashFlowFromOperating));
					}
					
					//投资活动产生的现金流量净额
					double netCashFlowGeneratedFromInvestmentActivities = rs.getDouble("netCashFlowGeneratedFromInvestmentActivities");
					if(netCashFlowGeneratedFromInvestmentActivities==0) {
						rsf.setNetCashFlowGeneratedFromInvestmentActivitiesFormated("");
					}else {
						rsf.setNetCashFlowGeneratedFromInvestmentActivitiesFormated(df.format(netCashFlowGeneratedFromInvestmentActivities));
					}

					//筹资活动产生的现金流量净额
					double netCashFlowGeneratedFromFinancingActivities = rs.getDouble("netCashFlowGeneratedFromFinancingActivities");
					if(netCashFlowGeneratedFromFinancingActivities==0) {
						rsf.setNetCashFlowGeneratedFromFinancingActivitiesFormated("");
					}else {
						rsf.setNetCashFlowGeneratedFromFinancingActivitiesFormated(df.format(netCashFlowGeneratedFromFinancingActivities));
					}
					
					//公司类型
					String companyType=null;
					if(netCashFlowFromOperating>0 && netCashFlowGeneratedFromInvestmentActivities<0 && netCashFlowGeneratedFromFinancingActivities<0) {
						companyType="正负负";
					}else if(netCashFlowFromOperating>0 && netCashFlowGeneratedFromInvestmentActivities<0 && netCashFlowGeneratedFromFinancingActivities>0) {
						companyType="正负正";
					}else if(netCashFlowFromOperating>0 && netCashFlowGeneratedFromInvestmentActivities>0 && netCashFlowGeneratedFromFinancingActivities<0) {
						companyType="正正负";
					}else if(netCashFlowFromOperating>0 && netCashFlowGeneratedFromInvestmentActivities>0 && netCashFlowGeneratedFromFinancingActivities>0) {
						companyType="正正正";
					}else if(netCashFlowFromOperating<0 && netCashFlowGeneratedFromInvestmentActivities>0 && netCashFlowGeneratedFromFinancingActivities>0) {
						companyType="负正正";
					}else if(netCashFlowFromOperating<0 && netCashFlowGeneratedFromInvestmentActivities<0 && netCashFlowGeneratedFromFinancingActivities>0) {
						companyType="负负正";
					}else if(netCashFlowFromOperating<0 && netCashFlowGeneratedFromInvestmentActivities<0 && netCashFlowGeneratedFromFinancingActivities<0) {
						companyType="负负负";
					}else {
						companyType="负正负";
					}
					rsf.setCompanyType(companyType);
					
					list.add(rsf);
				}
				}
			}catch(SQLException e) {
				e.printStackTrace();
		}
		return list;
		}
		
		//指标二十：三大现金流量净额的组合类型:经营活动产生的现金流量净额增长率
		public ArrayList<ReportSummaryFormated> getCompanyType1(String AShareCode,String financialReportingYear){
			ArrayList<ReportSummaryFormated> list=new ArrayList<ReportSummaryFormated>();
			String financialReportingNo=AShareCode+financialReportingYear;
			int year= Integer.parseInt(financialReportingYear);
			int lastYear=year-1;
			String lastYearStr=String.valueOf(lastYear);
			String lastfinancialReportingNo = AShareCode+lastYearStr;
			String sql="select * from fr_cashflowstatement where financialReportingNo in (?,?)";
		
			try(PreparedStatement statement = con.prepareStatement(sql)){
				statement.setString(1,financialReportingNo);
				statement.setString(2,lastfinancialReportingNo);
				
				ReportSummaryFormated rsf=new ReportSummaryFormated();
				NumberFormat percentFormat = NumberFormat.getPercentInstance();
				percentFormat.setMaximumFractionDigits(2); // 设置小数点后保留的位数
				
				try(ResultSet rs = statement.executeQuery()){
					double currentYearNetCashFlowFromOperating = 0;
				    double lastYearNetCashFlowFromOperating = 0;

				    while (rs.next()) {
				        String reportYear = rs.getString("financialReportingNo");
				        double netCashFlowFromOperating = rs.getDouble("netCashFlowFromOperating");
		
				        if (reportYear.equals(financialReportingNo)) {
				        	currentYearNetCashFlowFromOperating = netCashFlowFromOperating;
				        } else if (reportYear.equals(lastfinancialReportingNo)) {
				        	lastYearNetCashFlowFromOperating = netCashFlowFromOperating;
				        }
				
				//经营活动产生的现金流量净额增长率
				        if (currentYearNetCashFlowFromOperating != 0 && lastYearNetCashFlowFromOperating != 0) {
			                double growthRateOfNetCashFlowFromOperating = (currentYearNetCashFlowFromOperating - lastYearNetCashFlowFromOperating) / lastYearNetCashFlowFromOperating;
			                rsf.setGrowthRateOfNetCashFlowFromOperatingFormated(percentFormat.format(growthRateOfNetCashFlowFromOperating));
			            } else {
			                rsf.setGrowthRateOfNetCashFlowFromOperatingFormated(""); 
			            }
				        
				     // 清空 list
					     list.clear();
					     
					     // 将单个 ReportSummaryFormated 对象添加到 ryList1 中
					     list.add(rsf);
				       }
				}catch(SQLException e) {
							e.printStackTrace();
					}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					return list;
					
					}
		
		//指标二十一：现金及现金等价物的净增加额
		public ArrayList<ReportSummaryFormated> getNetIncreaseInCashAndCashEquivalents(String AShareCode,String financialReportingYear){
			ArrayList<ReportSummaryFormated> list=new ArrayList<ReportSummaryFormated>();
			String financialReportingNo=AShareCode+financialReportingYear;
			String sql="select fr_cashflowstatement.netIncreaseInCashAndCashEquivalents, fr_cashflowstatement.closingBalanceOfCashAndCashEquivalents, fr_incomestatement.financialReportDividends from fr_cashflowstatement join fr_incomestatement on fr_cashflowstatement.financialReportingNo = fr_incomestatement.financialReportingNo where fr_cashflowstatement.financialReportingNo='"+financialReportingNo+"'";
			try(ResultSet rs = this.getResult(sql))
				{
					while(rs.next()) {
						ReportSummaryFormated rsf=new ReportSummaryFormated();
						DecimalFormat df = new DecimalFormat("#,###.00");
						NumberFormat percentFormat = NumberFormat.getPercentInstance();
						percentFormat.setMaximumFractionDigits(2); // 设置小数点后保留的位数
						
						//现金及现金等价物净增加额
						double netIncreaseInCashAndCashEquivalents = rs.getDouble("netIncreaseInCashAndCashEquivalents");
						if(netIncreaseInCashAndCashEquivalents==0) {
							rsf.setNetIncreaseInCashAndCashEquivalentsFormated("");
						}else {
							rsf.setNetIncreaseInCashAndCashEquivalentsFormated(df.format(netIncreaseInCashAndCashEquivalents));
						}
						
						
						//现金分红金额
			            double financialReportDividends = rs.getDouble("financialReportDividends");
						if(financialReportDividends==0) {
							rsf.setFinancialReportDividendsFormated("");
						}else {
							rsf.setFinancialReportDividendsFormated(df.format(financialReportDividends));
						}
								
						//加现金分红的现金及现金等价物净增加额（现金及现金等价物净增加额 + 现金分红金额）
						double netIncreaseInCashAndCashEquivalentsAddBonus = netIncreaseInCashAndCashEquivalents + financialReportDividends;
						if(netIncreaseInCashAndCashEquivalentsAddBonus==0) {
							rsf.setNetIncreaseInCashAndCashEquivalentsAddBonusFormated("");
						}else {
							rsf.setNetIncreaseInCashAndCashEquivalentsAddBonusFormated(df.format(netIncreaseInCashAndCashEquivalentsAddBonus));
						}
						
						//期末现金及现金等价物余额
						double closingBalanceOfCashAndCashEquivalents = rs.getDouble("closingBalanceOfCashAndCashEquivalents");
						if(closingBalanceOfCashAndCashEquivalents==0) {
							rsf.setClosingBalanceOfCashAndCashEquivalentsFormated("");
						}else {
							rsf.setClosingBalanceOfCashAndCashEquivalentsFormated(df.format(closingBalanceOfCashAndCashEquivalents));
						}
						
						list.add(rsf);
					}
				}catch(SQLException e) {
					e.printStackTrace();
			}
			return list;
			}
		
}
