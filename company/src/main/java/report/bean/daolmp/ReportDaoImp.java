package report.bean.daolmp;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;

import report.bean.dao.ReportDao;
import report.bean.entity.*;
import report.bean.util.DataBase;

public class ReportDaoImp extends DataBase implements ReportDao{

	@Override
	public boolean insertBalanceSheet(BalanceSheet bs){
		
		
		String sql1="insert into fr_head values(?,?,?,?,?)";
		
		String sql2 = "INSERT INTO fr_balancesheet VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, " +
			    "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? ,?, ? ,?, ? ,?, ? ,?, ? ,?, ? ,?, ? ,?, ? ,?, ? ,?, ? ,?, ? ,?, " +
			    "?, ? ,?, ? ,?, ? ,?, ? ,?, ? ,?, ? ,?, ? ,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

			try (PreparedStatement statement1 = con.prepareStatement(sql1);
				PreparedStatement statement2 = con.prepareStatement(sql2);) {
				
				try {
					con.setAutoCommit(false);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				statement1.setString(1, bs.getFinancialReportingNo());
				statement1.setString(2, bs.getAShareCode());
				statement1.setString(3, bs.getAShareName());
				statement1.setString(4, bs.getFinancialReportingYear());
				statement1.setString(5, bs.getAuditOpinion());
				
				statement1.executeUpdate();
				
				statement2.setString(1, bs.getFinancialReportingNo());
			    statement2.setDouble(2, bs.getMonetaryCapital());
			    statement2.setDouble(3, bs.getSettlementProvisions());
			    statement2.setDouble(4, bs.getLendingFunds());
			    statement2.setDouble(5, bs.getTradingFinancialAssets());
			    statement2.setDouble(6, bs.getTradingFinancialAssetsManagement());
			    statement2.setDouble(7, bs.getDerivativeFinancialAssets());
			    statement2.setDouble(8, bs.getBillReceivable());
			    statement2.setDouble(9, bs.getAccountsReceivable());
			    statement2.setDouble(10, bs.getAccountsReceivableFinancing());
			    statement2.setDouble(11, bs.getPrepayments());
			    statement2.setDouble(12, bs.getPremiumReceivable());
			    statement2.setDouble(13, bs.getAccountsReceivableReinsurance());
			    statement2.setDouble(14, bs.getReceivableReserveForReinsuranceContracts());
			    statement2.setDouble(15, bs.getOtherReceivables());
			    statement2.setDouble(16, bs.getInterestReceivable());
			    statement2.setDouble(17, bs.getDividendReceivable());
			    statement2.setDouble(18, bs.getBuyingBackFinancialAssets());
			    statement2.setDouble(19, bs.getInventory());
			    statement2.setDouble(20, bs.getContractAssets());
			    statement2.setDouble(21, bs.getAssetsHeldForSale());
			    statement2.setDouble(22, bs.getNonCurrentAssetsDueWithinOneYear());
			    statement2.setDouble(23, bs.getOtherCurrentAssets());
			    statement2.setDouble(24, bs.getOtherCurrentAssetsManagement());
			    statement2.setDouble(25, bs.getTotalCurrentAssets());
			    statement2.setDouble(26, bs.getGrantingLoansAndAdvances());
			    statement2.setDouble(27, bs.getDebtInvestment());
			    statement2.setDouble(28, bs.getOtherDebtInvestment());
			    statement2.setDouble(29, bs.getLongTermReceivables());
			    statement2.setDouble(30, bs.getLongTermEquityInvestment());
			    statement2.setDouble(31, bs.getOtherEquityInstrumentInvestments());
			    statement2.setDouble(32, bs.getOtherNonCurrentFinancialAssets());
			    statement2.setDouble(33, bs.getInvestmentRealEstate());
			    statement2.setDouble(34, bs.getFixedAssets());
			    statement2.setDouble(35, bs.getConstructionInProgress());
			    statement2.setDouble(36, bs.getProductiveBiologicalAssets());
			    statement2.setDouble(37, bs.getOilAndGasAssets());
			    statement2.setDouble(38, bs.getRightOfUseAssets());
			    statement2.setDouble(39, bs.getIntangibleAssets());
			    statement2.setDouble(40, bs.getDevelopmentExpenditure());
			    statement2.setDouble(41, bs.getGoodwill());
			    statement2.setDouble(42, bs.getLongTermDeferredExpense());
			    statement2.setDouble(43, bs.getDeferredTaxAssets());
			    statement2.setDouble(44, bs.getOtherNonCurrentAssets());
			    statement2.setDouble(45, bs.getTotalNonCurrentAssets());
			    statement2.setDouble(46, bs.getTotalAssets());
			    statement2.setDouble(47, bs.getLongTermEquityInvestmentsUnrelatedToMainBusiness());
			    statement2.setDouble(48, bs.getIncomeFromLongTermEquityInvestments());
			    statement2.setDouble(49, bs.getShortTermBorrowing());
			    statement2.setDouble(50, bs.getBorrowingFromTheCentralBank());
			    statement2.setDouble(51, bs.getBorrowingFunds());
			    statement2.setDouble(52, bs.getTradingFinancialLiabilities());
			    statement2.setDouble(53, bs.getDerivativeFinancialLiabilities());
			    statement2.setDouble(54, bs.getNotesPayable());
			    statement2.setDouble(55, bs.getAccountsPayable());
			    statement2.setDouble(56, bs.getAdvanceReceipts());
			    statement2.setDouble(57, bs.getContractLiabilities());
			    statement2.setDouble(58, bs.getFinancialAssetsSoldForRepurchase());
			    statement2.setDouble(59, bs.getDepositAbsorptionAndInterbankDeposits());
			    statement2.setDouble(60, bs.getActingTradingSecurities());
			    statement2.setDouble(61, bs.getActingUnderwritingSecurities());
			    statement2.setDouble(62, bs.getPayrollPayable());
			    statement2.setInt(63, bs.getTotalNumberOfPeople());
			    statement2.setDouble(64, bs.getTaxPayable());
			    statement2.setDouble(65, bs.getOtherPayables());
			    statement2.setDouble(66, bs.getInterestPayable());
			    statement2.setDouble(67, bs.getDividendPayable());
			    statement2.setDouble(68, bs.getPayableHandlingFeesAndCommissions());
			    statement2.setDouble(69, bs.getAccountsPayableReinsurance());
			    statement2.setDouble(70, bs.getHeldForSaleLiabilities());
			    statement2.setDouble(71, bs.getNonCurrentLiabilitiesDueWithinOneYear());
			    statement2.setDouble(72, bs.getOtherCurrentLiabilities());
			    statement2.setDouble(73, bs.getTotalCurrentLiabilities());
			    statement2.setDouble(74, bs.getInsuranceContractReserves());
			    statement2.setDouble(75, bs.getLongTermLoan());
			    statement2.setDouble(76, bs.getBondsPayable());
			    statement2.setDouble(77, bs.getBondsPayablepreferredShares());
			    statement2.setDouble(78, bs.getBondsPayableperpetualCapitalSecurities());
			    statement2.setDouble(79, bs.getLeaseLiabilities());
			    statement2.setDouble(80, bs.getLongTermPayables());
			    statement2.setDouble(81, bs.getLongTermEmployeeCompensationPayable());
			    statement2.setDouble(82, bs.getEstimatedLiabilities());
			    statement2.setDouble(83, bs.getDeferredIncome());
			    statement2.setDouble(84, bs.getDeferredIncomeTaxes());
			    statement2.setDouble(85, bs.getOtherNonCurrentLiabilities());
			    statement2.setDouble(86, bs.getTotalNonCurrentLiabilities());
			    statement2.setDouble(87, bs.getTotalLiabilities());
			    statement2.setDouble(88, bs.getEquity());
			    statement2.setDouble(89, bs.getOtherEquityInstruments());
			    statement2.setDouble(90, bs.getOtherEquityInstrumentspreferredShares());
			    statement2.setDouble(91, bs.getOtherEquityInstrumentspetualCapitalSecurities());
			    statement2.setDouble(92, bs.getCapitalReserve());
			    statement2.setDouble(93, bs.getTreasuryStock());
			    statement2.setDouble(94, bs.getOtherComprehensiveIncome());
			    statement2.setDouble(95, bs.getSpecialReserves());
			    statement2.setDouble(96, bs.getSurplusReserves());
			    statement2.setDouble(97, bs.getGeneralRiskProvisions());
			    statement2.setDouble(98, bs.getUndistributedProfit());
			    statement2.setDouble(99, bs.getTotalEquityAttributableOfParentCompany());
			    statement2.setDouble(100, bs.getMinorityInterest());
			    statement2.setDouble(101, bs.getTotalOwnersEquity());
			    statement2.setDouble(102, bs.getTotalLiabilitiesAndOwnersEquity());
			    statement2.setString(103, bs.getCreateDateTime());
			    statement2.setString(104, bs.getUpdateDateTime());
			  
			    statement2.executeUpdate();
			    
			 // 手动提交事务
		        con.commit();
		        
				return true; // 插入成功，返回true
				
			} catch (SQLException e) {
			    e.printStackTrace();
			    try {
					con.rollback();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			    return false; // 插入失败，返回false
			}
	}

	
	public ArrayList<BalanceSheet> frHead() {
	    ArrayList<BalanceSheet> list = new ArrayList<>();
	    String sql = "SELECT * FROM fr_head JOIN fr_balancesheet ON fr_head.financialReportingNo = fr_balancesheet.financialReportingNo ORDER BY fr_balancesheet.createDateTime DESC LIMIT 1";

	    try {
	        ResultSet rs = this.getResult(sql);
	        while (rs.next()) {
	            BalanceSheet bs = new BalanceSheet();
	            bs.setFinancialReportingNo(rs.getString("financialReportingNo"));
	            bs.setAShareCode(rs.getString("AShareCode"));
	            bs.setAShareName(rs.getString("AShareName"));
	            bs.setFinancialReportingYear(rs.getString("financialReportingYear"));
	            bs.setAuditOpinion(rs.getString("auditOpinion"));
	            list.add(bs);
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }

	    return list;
	}
		
	public boolean insertIncomeStatement(IncomeStatement is) {
		
		String sql="insert into fr_incomestatement values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"
				+ "?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		try (PreparedStatement statement = con.prepareStatement(sql)){
			
			statement.setString(1,is.getFinancialReportingNo());
			statement.setDouble(2, is.getGrossRevenue());
			statement.setDouble(3, is.getOperatingRevenue());
			statement.setDouble(4, is.getInterestIncome());
			statement.setDouble(5, is.getEarnedPremium());
			statement.setDouble(6, is.getFeeAndCommissionIncome());
			statement.setDouble(7, is.getTotalOperatingCost());
			statement.setDouble(8, is.getOperatingCosts());
			statement.setDouble(9, is.getInterestExpense());
			statement.setDouble(10, is.getHandlingFeesAndCommissionExpenses());
			statement.setDouble(11, is.getSurrender());
			statement.setDouble(12, is.getNetCompensationExpenses());
			statement.setDouble(13, is.getExpendituresDividendPolicy());
			statement.setDouble(14, is.getWithdrawalOfReserveFundsForInsuranceLiabilityContracts());
			statement.setDouble(15, is.getReinsuranceExpenses());
			statement.setDouble(16, is.getTaxesAndSurcharges());
			statement.setDouble(17, is.getSellingExpenses());
			statement.setDouble(18, is.getOverhead());
			statement.setDouble(19, is.getResearchAndDevelopment());
			statement.setDouble(20, is.getFinancialExpenses());
			statement.setDouble(21, is.getFinancialExpensesInterestExpenses());
			statement.setDouble(22, is.getFinancialExpensesInterestIncome());
			statement.setDouble(23, is.getOtherIncome());
			statement.setDouble(24, is.getIncomeFromInvestment());
			statement.setDouble(25, is.getInvestmentIncomeFromAssociatesAndJointVentures());
			statement.setDouble(26, is.getExchangeGains());
			statement.setDouble(27, is.getIncomeFromDerecognitionOfFinancialAssetsMeasuredAtAmortizedCost());
			statement.setDouble(28, is.getNetExposureHedgingIncome());
			statement.setDouble(29, is.getIncomeFromChangesInFairValue());
			statement.setDouble(30, is.getCreditImpairmentLoss());
			statement.setDouble(31, is.getImpairmentLoss());
			statement.setDouble(32, is.getAssetDisposalIncome());
			statement.setDouble(33, is.getOperatingProfit());
			statement.setDouble(34, is.getNonOperatingIncome());
			statement.setDouble(35, is.getNonOperatingExpenses());
			statement.setDouble(36, is.getTotalProfit());
			statement.setDouble(37, is.getIncomeTaxExpense());
			statement.setDouble(38, is.getNetProfit());
			statement.setDouble(39, is.getNetProfitFromContinuingOperations());
			statement.setDouble(40, is.getNetProfitFromDiscontinuedOperations());
			statement.setDouble(41, is.getNetIncomeAttributableToShareholders());
			statement.setDouble(42, is.getMinorityInterest());
			statement.setDouble(43, is.getAfterTaxNetAmountOfOtherComprehensiveIncomeAttributable());
			statement.setDouble(44, is.getOtherComprehensiveIncomeCannotBeReclassifiedIntoProfitOrLoss());
			statement.setDouble(45, is.getRemeasureChangesInDefinedBenefitPlans());
			statement.setDouble(46, is.getOtherIncomeCannotBeConvertedToProfitOrLossUnderTheEquityMethod());
			statement.setDouble(47, is.getChangesInFairValueOfOtherEquityInstrumentInvestments());
			statement.setDouble(48, is.getChangesInFairValueOfCorporateCreditRisk());
			statement.setDouble(49, is.getOthers());
			statement.setDouble(50, is.getOtherIncomeReclassifiedToProfitOrLoss());
			statement.setDouble(51, is.getOtherIncomeCanBeConvertedToProfitOrLossUnderTheEquityMethod());
			statement.setDouble(52, is.getChangesInFairValueOfOtherDebtInvestments());
			statement.setDouble(53, is.getReclassificationOfFinancialAssetsInOtherComprehensiveIncome());
			statement.setDouble(54, is.getProvisionForOtherDebtInvestments());
			statement.setDouble(55, is.getCashFlowHedgingReserves());
			statement.setDouble(56, is.getCurrencyTranslationDifferences());
			statement.setDouble(57, is.getOthers1());
			statement.setDouble(58, is.getOtherIncomeAfterTaxAttributableToMinorityShareholders());
			statement.setDouble(59, is.getTotalComprehensiveIncome());
			statement.setDouble(60, is.getTotalComprehensiveIncomeToTheOwnersOfTheParentCompany());
			statement.setDouble(61, is.getTotalComprehensiveIncomeToMinorityShareholders());
			statement.setDouble(62, is.getBasicEarningsPerShare());
			statement.setDouble(63, is.getDilutedEarningsPerShare());
			statement.setDouble(64, is.getROE());
			statement.setDouble(65, is.getFinancialReportDividends());
			statement.setString(66, is.getCreateDateTime());
			statement.setString(67, is.getUpdateDateTime());
			
			statement.executeUpdate();
			return true; // 插入成功，返回true
		
	} catch (SQLException e) {
	    e.printStackTrace();
	    return false; // 插入失败，返回false
	}
	}
	
	@Override
	public int getMaxNumberFromDatabase() throws SQLException {
		int maxNumber = 0;
		String sql = "SELECT MAX(SUBSTRING(financialReportingNo, 10)) AS maxnumber FROM fr_head WHERE SUBSTRING(financialReportingNo, 1, 4) = YEAR(CURDATE())";
		ResultSet rs=this.getResult(sql);
		if (rs.next()) {
            maxNumber = rs.getInt("maxnumber");
        }
		return maxNumber;
	}


	@Override
	public boolean insertCashflowStatement(CashflowStatement cs) {
		// TODO Auto-generated method stub
		String sql="insert into fr_cashflowstatement values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"
				+ "?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try (PreparedStatement statement = con.prepareStatement(sql)){
			statement.setString(1, cs.getFinancialReportingNo());
			statement.setDouble(2, cs.getCashReceivedFromSellingGoodsAndProvidingServices());
			statement.setDouble(3, cs.getNetIncreaseInCustomerDepositsAndInterbankDeposits());
			statement.setDouble(4, cs.getNetIncreaseInBorrowingFromTheCentralBank());
			statement.setDouble(5, cs.getNetIncreaseInBorrowingFundsFromOtherFinancialInstitutions());
			statement.setDouble(6, cs.getCashReceivedFromPremiumOfOriginalInsuranceContract());
			statement.setDouble(7, cs.getReceiptOfReinsuranceNetCash());
			statement.setDouble(8, cs.getNetIncreaseInDepositsFromPolicyholders());
			statement.setDouble(9, cs.getCashChargeInterestFeesAndCommissions());
			statement.setDouble(10, cs.getNetIncreaseInBorrowedFunds());
			statement.setDouble(11, cs.getNetIncreaseInRepurchaseBusinessFunds());
			statement.setDouble(12, cs.getNetCashReceivedFromProxyTradingOfSecurities());
			statement.setDouble(13, cs.getRefundsOfTaxes());
			statement.setDouble(14, cs.getOtherCashReceivedRelatingToOperatingActivities());
			statement.setDouble(15, cs.getBusinessActivitiesSubtotalOfCashInflows());
			statement.setDouble(16, cs.getCashPaidForPurchasingGoodsAndReceivingServices());
			statement.setDouble(17, cs.getNetIncreaseInCustomerLoansAndAdvances());
			statement.setDouble(18, cs.getNetIncreaseInDepositsWithCentralBanksAndInterbankFunds());
			statement.setDouble(19, cs.getPaymentOfTheOriginalInsuranceContractToPayTheAmountOfCash());
			statement.setDouble(20, cs.getNetIncreaseInLendingFunds());
			statement.setDouble(21, cs.getCashPaidForInterestHandlingFeesAndCommissions());
			statement.setDouble(22, cs.getCashPaidForPolicyDividends());
			statement.setDouble(23, cs.getCashPaidToAndOnBehalfOfEmployees());
			statement.setDouble(24, cs.getTaxesPaid());
			statement.setDouble(25, cs.getPaymentOfOtherCashRelatedToOperatingActivities());
			statement.setDouble(26, cs.getSubtotalOfCashOutflowsFromOperatingActivities());
			statement.setDouble(27, cs.getNetCashFlowFromOperating());
			statement.setDouble(28, cs.getCashReceivedFromInvestmentRecovery());
			statement.setDouble(29, cs.getCashReceivedFromObtainingInvestmentReturns());
			statement.setDouble(30, cs.getNetCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssets());
			statement.setDouble(31, cs.getNetCashReceivedFromDisposalOfSubsidiariesAndOtherOperatingUnits());
			statement.setDouble(32, cs.getReceivedOtherCashRelatedToInvestmentActivities());
			statement.setDouble(33, cs.getSubtotalOfCashInflowsFromInvestmentActivities());
			statement.setDouble(34, cs.getCashPaidForPurchaseConstructionFixedIntangibleLongTermAssets());
			statement.setDouble(35, cs.getCashPaidForInvestment());
			statement.setDouble(36, cs.getNetIncreaseInPledgedLoans());
			statement.setDouble(37, cs.getNetCashPaidToSubsidiariesAndOtherBusinessUnits());
			statement.setDouble(38, cs.getPaymentOfOtherCashRelatedToInvestmentActivities());
			statement.setDouble(39, cs.getSubtotalOfCashOutflowsFromInvestmentActivities());
			statement.setDouble(40, cs.getNetCashFlowGeneratedFromInvestmentActivities());
			statement.setDouble(41, cs.getCashReceivedFromAbsorbingInvestments());
			statement.setDouble(42, cs.getCashReceivedFromMinorityInvestmentInSubsidiaries());
			statement.setDouble(43, cs.getCashReceivedFromObtainingLoans());
			statement.setDouble(44, cs.getReceivedOtherCashRelatedToFinancingActivities());
			statement.setDouble(45, cs.getSubtotalOfCashInflowsFromFinancingActivities());
			statement.setDouble(46, cs.getCashRepaymentsOfAmountsBorrowed());
			statement.setDouble(47, cs.getCashPaidForDistributingDividendsProfitsPayingInterest());
			statement.setDouble(48, cs.getDividendsAndProfitsAaidBySubsidiariesToMinorityShareholders());
			statement.setDouble(49, cs.getPaymentOfOtherCashRelatedToFinancingActivities());
			statement.setDouble(50, cs.getSubtotalOfCashOutflowsFromFinancingActivities());
			statement.setDouble(51, cs.getNetCashFlowGeneratedFromFinancingActivities());
			statement.setDouble(52, cs.getTheImpactOfExchangeRateFluctuationsOnCashAndCashEquivalents());
			statement.setDouble(53, cs.getNetIncreaseInCashAndCashEquivalents());
			statement.setDouble(54, cs.getOpeningCashAndCashEquivalentsBalance());
			statement.setDouble(55, cs.getClosingBalanceOfCashAndCashEquivalents());
			statement.setString(56, cs.getCreateDateTime());
			statement.setString(57, cs.getUpdateDateTime());
			
			statement.executeUpdate();
			return true; // 插入成功，返回true
		
		} catch (SQLException e) {
			e.printStackTrace();
			return false; // 插入失败，返回false
	}
	}

	public boolean insertCashflowSupplement(CashflowSupplement cfs) {
		String sql="insert into fr_cashflowsupplement values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try (PreparedStatement statement = con.prepareStatement(sql)){
			statement.setString(1, cfs.getFinancialReportingNo());
			statement.setDouble(2, cfs.getImpairmentOfAssets());
			statement.setDouble(3,cfs.getDepreciation());
			statement.setDouble(4,cfs.getDepreciationOfRightOfUseAssets());
			statement.setDouble(5,cfs.getAmortizationOfIntangibleAssets());
			statement.setDouble(6,cfs.getAmortizationOfLongTermDeferredExpenses());
			statement.setDouble(7,cfs.getLossOnDisposalOfAssets());
			statement.setDouble(8,cfs.getLossesOnScrappingOfFixedAssets());
			statement.setDouble(9,cfs.getLossFromChangesInFairValue());
			statement.setDouble(10,cfs.getFinancialExpenses());
			statement.setDouble(11,cfs.getInvestmentLosses());
			statement.setDouble(12,cfs.getDecreaseInDeferredIncomeTaxAssets());
			statement.setDouble(13,cfs.getIncreaseInDeferredIncomeTaxLiabilities());
			statement.setDouble(14,cfs.getReductionOfInventory());
			statement.setDouble(15,cfs.getReductionOfOperatingReceivables());
			statement.setDouble(16,cfs.getIncreaseInOperationalPayables());
			statement.setDouble(17,cfs.getConversionOfDebtIntoCapital());
			statement.setDouble(18,cfs.getConvertibleCorporatebondsDueWithinOneYear());
			statement.setDouble(19,cfs.getFixedAssetsUnderFinancingLease());
			statement.setString(20,cfs.getCreateDateTime());
			statement.setString(21,cfs.getUpdateDateTime());
			statement.executeUpdate();
			return true; // 插入成功，返回true
		
		} catch (SQLException e) {
			e.printStackTrace();
			return false; // 插入失败，返回false
	}
	}
	
	
	@Override
	public ArrayList<BalanceSheetFormated> getReportHead(String AShareCode, String AShareName,
			String financialReportingYear,String auditOpinion) {
		// TODO Auto-generated method stub
		ArrayList<BalanceSheetFormated> list=new ArrayList<BalanceSheetFormated>();
		String sql="select * from fr_head where AShareCode like '%"+AShareCode+"%' and AShareName like '%"+AShareName+"%' and financialReportingYear like '%"+financialReportingYear+"%'and auditOpinion like '%"+auditOpinion+"%'";
		ResultSet rs=this.getResult(sql);

		try {
			while(rs.next()) {
				BalanceSheetFormated bs=new BalanceSheetFormated();
				bs.setFinancialReportingNo(rs.getString("financialReportingNo"));
				bs.setAShareCode(rs.getString("AShareCode"));
				bs.setAShareName(rs.getString("AShareName"));
				bs.setFinancialReportingYear(rs.getString("financialReportingYear"));
				bs.setAuditOpinion(rs.getString("auditOpinion"));
				list.add(bs);
			}
		}catch(SQLException e) {
				e.printStackTrace();
		}
		return list;
	}
	
	@Override
	public ArrayList<BalanceSheetFormated> getReportHead(String financialReportingNo) {
		// TODO Auto-generated method stub
		ArrayList<BalanceSheetFormated> list=new ArrayList<BalanceSheetFormated>();
		String sql="select * from fr_head where financialReportingNo ='"+financialReportingNo+"'";
		ResultSet rs=this.getResult(sql);

		try {
			while(rs.next()) {
				BalanceSheetFormated bs=new BalanceSheetFormated();
				bs.setFinancialReportingNo(rs.getString("financialReportingNo"));
				bs.setAShareCode(rs.getString("AShareCode"));
				bs.setAShareName(rs.getString("AShareName"));
				bs.setFinancialReportingYear(rs.getString("financialReportingYear"));
				bs.setAuditOpinion(rs.getString("auditOpinion"));
				list.add(bs);
			}
		}catch(SQLException e) {
				e.printStackTrace();
		}
		return list;
	}
	public Integer getReportCount(String AShareCode, String AShareName,
			String financialReportingYear,String auditOpinion) throws SQLException{
		int totalCounts=1;
		String sql="select count(*) from fr_head where AShareCode like '"+AShareCode+"%' and AShareName like '%"+AShareName+"%' and financialReportingYear like '%"+financialReportingYear+"%'and auditOpinion like '%"+auditOpinion+"%'";
		ResultSet rs=this.getResult(sql);
		if(rs.next()) {
			totalCounts=rs.getInt(1);
		}
		return totalCounts;
		
	}
	
	@Override
	public ArrayList<BalanceSheetFormated> getBalanceSheet(String financialReportingNo) {
		// TODO Auto-generated method stub
		ArrayList<BalanceSheetFormated> bsList=new ArrayList<BalanceSheetFormated>();
		String sql="select * from fr_balancesheet where financialReportingNo='"+financialReportingNo+"'";
		ResultSet rs=this.getResult(sql);
		try {
		while(rs.next()) {
			BalanceSheetFormated bsf=new BalanceSheetFormated();
			DecimalFormat df = new DecimalFormat("#,###.00");
			bsf.setFinancialReportingNo(rs.getString("financialReportingNo"));
			
			double monetaryCapital=rs.getDouble("monetaryCapital");
			if (monetaryCapital == 0) {
                bsf.setMonetaryCapitalFormated("");
            } else {
                bsf.setMonetaryCapitalFormated(df.format(monetaryCapital));
            }
			
			double settlementProvisions=rs.getDouble("settlementProvisions");
			if (settlementProvisions == 0) {
                bsf.setSettlementProvisionsFormated("");
            } else {
                bsf.setSettlementProvisionsFormated(df.format(settlementProvisions));
            }
			
			double lendingFunds=rs.getDouble("lendingFunds");
			if (lendingFunds == 0) {
                bsf.setLendingFundsFormated("");
            } else {
                bsf.setLendingFundsFormated(df.format(lendingFunds));
            }
			
			double tradingFinancialAssets=rs.getDouble("tradingFinancialAssets");
			if (tradingFinancialAssets == 0) {
                bsf.setTradingFinancialAssetsFormated("");
            } else {
                bsf.setTradingFinancialAssetsFormated(df.format(tradingFinancialAssets));
            }
			
			double tradingFinancialAssetsManagement=rs.getDouble("tradingFinancialAssetsManagement");
			if (tradingFinancialAssetsManagement == 0) {
                bsf.setTradingFinancialAssetsManagementFormated("");
            } else {
                bsf.setTradingFinancialAssetsManagementFormated(df.format(tradingFinancialAssetsManagement));
            }
			
			double derivativeFinancialAssets=rs.getDouble("derivativeFinancialAssets");
			if (derivativeFinancialAssets == 0) {
                bsf.setDerivativeFinancialAssetsFormated("");
            } else {
                bsf.setDerivativeFinancialAssetsFormated(df.format(derivativeFinancialAssets));
            }
			
			double billReceivable=rs.getDouble("billReceivable");
			if (billReceivable == 0) {
                bsf.setBillReceivableFormated("");
            } else {
                bsf.setBillReceivableFormated(df.format(billReceivable));
            }
			
			double accountsReceivable=rs.getDouble("accountsReceivable");
			if (accountsReceivable == 0) {
                bsf.setAccountsReceivableFormated("");
            } else {
                bsf.setAccountsReceivableFormated(df.format(accountsReceivable));
            }
			
			double accountsReceivableFinancing=rs.getDouble("accountsReceivableFinancing");
			if (accountsReceivableFinancing == 0) {
                bsf.setAccountsReceivableFinancingFormated("");
            } else {
                bsf.setAccountsReceivableFinancingFormated(df.format(accountsReceivableFinancing));
            }
			
			double prepayments=rs.getDouble("prepayments");
			if (prepayments == 0) {
                bsf.setPrepaymentsFormated("");
            } else {
                bsf.setPrepaymentsFormated(df.format(prepayments));
            }

			double premiumReceivable=rs.getDouble("premiumReceivable");
			if (premiumReceivable == 0) {
                bsf.setPremiumReceivableFormated("");
            } else {
                bsf.setPremiumReceivableFormated(df.format(premiumReceivable));
            }

			double accountsReceivableReinsurance=rs.getDouble("accountsReceivableReinsurance");
			if (accountsReceivableReinsurance == 0) {
                bsf.setAccountsReceivableReinsuranceFormated("");
            } else {
                bsf.setAccountsReceivableReinsuranceFormated(df.format(accountsReceivableReinsurance));
            }

			double receivableReserveForReinsuranceContracts=rs.getDouble("receivableReserveForReinsuranceContracts");
			if (receivableReserveForReinsuranceContracts == 0) {
                bsf.setReceivableReserveForReinsuranceContractsFormated("");
            } else {
                bsf.setReceivableReserveForReinsuranceContractsFormated(df.format(receivableReserveForReinsuranceContracts));
            }

			double otherReceivables=rs.getDouble("otherReceivables");
			if (otherReceivables == 0) {
                bsf.setOtherReceivablesFormated("");
            } else {
                bsf.setOtherReceivablesFormated(df.format(otherReceivables));
            }

			double interestReceivable=rs.getDouble("interestReceivable");
			if (interestReceivable == 0) {
                bsf.setInterestReceivableFormated("");
            } else {
                bsf.setInterestReceivableFormated(df.format(interestReceivable));
            }

			double dividendReceivable=rs.getDouble("dividendReceivable");
			if (dividendReceivable == 0) {
                bsf.setDividendReceivableFormated("");
            } else {
                bsf.setDividendReceivableFormated(df.format(dividendReceivable));
            }

			double buyingBackFinancialAssets=rs.getDouble("buyingBackFinancialAssets");
			if (buyingBackFinancialAssets == 0) {
                bsf.setBuyingBackFinancialAssetsFormated("");
            } else {
                bsf.setBuyingBackFinancialAssetsFormated(df.format(buyingBackFinancialAssets));
            }

			double inventory=rs.getDouble("inventory");
			if (inventory == 0) {
                bsf.setInventoryFormated("");
            } else {
                bsf.setInventoryFormated(df.format(inventory));
            }

			double contractAssets=rs.getDouble("contractAssets");
			if (contractAssets == 0) {
                bsf.setContractAssetsFormated("");
            } else {
                bsf.setContractAssetsFormated(df.format(contractAssets));
            }

			double assetsHeldForSale=rs.getDouble("assetsHeldForSale");
			if (assetsHeldForSale == 0) {
                bsf.setAssetsHeldForSaleFormated("");
            } else {
                bsf.setAssetsHeldForSaleFormated(df.format(assetsHeldForSale));
            }

			double nonCurrentAssetsDueWithinOneYear=rs.getDouble("nonCurrentAssetsDueWithinOneYear");
			if (nonCurrentAssetsDueWithinOneYear == 0) {
                bsf.setNonCurrentAssetsDueWithinOneYearFormated("");
            } else {
                bsf.setNonCurrentAssetsDueWithinOneYearFormated(df.format(nonCurrentAssetsDueWithinOneYear));
            }

			double otherCurrentAssets=rs.getDouble("otherCurrentAssets");
			if (otherCurrentAssets == 0) {
                bsf.setOtherCurrentAssetsFormated("");
            } else {
                bsf.setOtherCurrentAssetsFormated(df.format(otherCurrentAssets));
            }
			
			double otherCurrentAssetsManagement=rs.getDouble("otherCurrentAssetsManagement");
			if (otherCurrentAssetsManagement == 0) {
                bsf.setOtherCurrentAssetsManagementFormated("");
            } else {
                bsf.setOtherCurrentAssetsManagementFormated(df.format(otherCurrentAssetsManagement));
            }
			
			double totalCurrentAssets=rs.getDouble("totalCurrentAssets");
			if (totalCurrentAssets == 0) {
                bsf.setTotalCurrentAssetsFormated("");
            } else {
                bsf.setTotalCurrentAssetsFormated(df.format(totalCurrentAssets));
            }

			double grantingLoansAndAdvances=rs.getDouble("grantingLoansAndAdvances");
			if (grantingLoansAndAdvances == 0) {
                bsf.setGrantingLoansAndAdvancesFormated("");
            } else {
                bsf.setGrantingLoansAndAdvancesFormated(df.format(grantingLoansAndAdvances));
            }

			double debtInvestment=rs.getDouble("debtInvestment");
			if (debtInvestment == 0) {
                bsf.setDebtInvestmentFormated("");
            } else {
                bsf.setDebtInvestmentFormated(df.format(debtInvestment));
            }

			double otherDebtInvestment=rs.getDouble("otherDebtInvestment");
			if (otherDebtInvestment == 0) {
                bsf.setOtherDebtInvestmentFormated("");
            } else {
                bsf.setOtherDebtInvestmentFormated(df.format(otherDebtInvestment));
            }

			double longTermReceivables=rs.getDouble("longTermReceivables");
			if (longTermReceivables == 0) {
                bsf.setLongTermReceivablesFormated("");
            } else {
                bsf.setLongTermReceivablesFormated(df.format(longTermReceivables));
            }

			double longTermEquityInvestment=rs.getDouble("longTermEquityInvestment");
			if (longTermEquityInvestment == 0) {
                bsf.setLongTermEquityInvestmentFormated("");
            } else {
                bsf.setLongTermEquityInvestmentFormated(df.format(longTermEquityInvestment));
            }

			double otherEquityInstrumentInvestments=rs.getDouble("otherEquityInstrumentInvestments");
			if (otherEquityInstrumentInvestments == 0) {
                bsf.setOtherEquityInstrumentInvestmentsFormated("");
            } else {
                bsf.setOtherEquityInstrumentInvestmentsFormated(df.format(otherEquityInstrumentInvestments));
            }

			double otherNonCurrentFinancialAssets=rs.getDouble("otherNonCurrentFinancialAssets");
			if (otherNonCurrentFinancialAssets == 0) {
                bsf.setOtherNonCurrentFinancialAssetsFormated("");
            } else {
                bsf.setOtherNonCurrentFinancialAssetsFormated(df.format(otherNonCurrentFinancialAssets));
            }
		
			double investmentRealEstate=rs.getDouble("investmentRealEstate");
			if (investmentRealEstate == 0) {
                bsf.setInvestmentRealEstateFormated("");
            } else {
                bsf.setInvestmentRealEstateFormated(df.format(investmentRealEstate));
            }
			
			double fixedAssets=rs.getDouble("fixedAssets");
			if (fixedAssets == 0) {
                bsf.setFixedAssetsFormated("");
            } else {
                bsf.setFixedAssetsFormated(df.format(fixedAssets));
            }

			double constructionInProgress=rs.getDouble("constructionInProgress");
			if (constructionInProgress == 0) {
                bsf.setConstructionInProgressFormated("");
            } else {
                bsf.setConstructionInProgressFormated(df.format(constructionInProgress));
            }

			double productiveBiologicalAssets=rs.getDouble("productiveBiologicalAssets");
			if (productiveBiologicalAssets == 0) {
                bsf.setProductiveBiologicalAssetsFormated("");
            } else {
                bsf.setProductiveBiologicalAssetsFormated(df.format(productiveBiologicalAssets));
            }

			double oilAndGasAssets=rs.getDouble("oilAndGasAssets");
			if (oilAndGasAssets == 0) {
                bsf.setOilAndGasAssetsFormated("");
            } else {
                bsf.setOilAndGasAssetsFormated(df.format(oilAndGasAssets));
            }

			double rightOfUseAssets=rs.getDouble("rightOfUseAssets");
			if (rightOfUseAssets == 0) {
                bsf.setRightOfUseAssetsFormated("");
            } else {
                bsf.setRightOfUseAssetsFormated(df.format(rightOfUseAssets));
            }

			double intangibleAssets=rs.getDouble("intangibleAssets");
			if (intangibleAssets == 0) {
                bsf.setIntangibleAssetsFormated("");
            } else {
                bsf.setIntangibleAssetsFormated(df.format(intangibleAssets));
            }

			double developmentExpenditure=rs.getDouble("developmentExpenditure");
			if (developmentExpenditure == 0) {
                bsf.setDevelopmentExpenditureFormated("");
            } else {
                bsf.setDevelopmentExpenditureFormated(df.format(developmentExpenditure));
            }

			double goodwill=rs.getDouble("goodwill");
			if (goodwill == 0) {
                bsf.setGoodwillFormated("");
            } else {
                bsf.setGoodwillFormated(df.format(goodwill));
            }

			double longTermDeferredExpense=rs.getDouble("longTermDeferredExpense");
			if (longTermDeferredExpense == 0) {
                bsf.setLongTermDeferredExpenseFormated("");
            } else {
                bsf.setLongTermDeferredExpenseFormated(df.format(longTermDeferredExpense));
            }
			
			double deferredTaxAssets=rs.getDouble("deferredTaxAssets");
			if (deferredTaxAssets == 0) {
                bsf.setDeferredTaxAssetsFormated("");
            } else {
                bsf.setDeferredTaxAssetsFormated(df.format(deferredTaxAssets));
            }


			double otherNonCurrentAssets=rs.getDouble("otherNonCurrentAssets");
			if (otherNonCurrentAssets == 0) {
                bsf.setOtherNonCurrentAssetsFormated("");
            } else {
                bsf.setOtherNonCurrentAssetsFormated(df.format(otherNonCurrentAssets));
            }

			double totalNonCurrentAssets=rs.getDouble("totalNonCurrentAssets");
			if (totalNonCurrentAssets == 0) {
                bsf.setTotalNonCurrentAssetsFormated("");
            } else {
                bsf.setTotalNonCurrentAssetsFormated(df.format(totalNonCurrentAssets));
            }

			double totalAssets=rs.getDouble("totalAssets");
			if (totalAssets == 0) {
                bsf.setTotalAssetsFormated("");
            } else {
                bsf.setTotalAssetsFormated(df.format(totalAssets));
            }

			double longTermEquityInvestmentsUnrelatedToMainBusiness=rs.getDouble("longTermEquityInvestmentsUnrelatedToMainBusiness");
			if (longTermEquityInvestmentsUnrelatedToMainBusiness == 0) {
                bsf.setLongTermEquityInvestmentsUnrelatedToMainBusinessFormated("");
            } else {
                bsf.setLongTermEquityInvestmentsUnrelatedToMainBusinessFormated(df.format(longTermEquityInvestmentsUnrelatedToMainBusiness));
            }

			double incomeFromLongTermEquityInvestments=rs.getDouble("incomeFromLongTermEquityInvestments");
			if (incomeFromLongTermEquityInvestments == 0) {
                bsf.setIncomeFromLongTermEquityInvestmentsFormated("");
            } else {
                bsf.setIncomeFromLongTermEquityInvestmentsFormated(df.format(incomeFromLongTermEquityInvestments));
            }

			double shortTermBorrowing=rs.getDouble("shortTermBorrowing");
			if (shortTermBorrowing == 0) {
                bsf.setShortTermBorrowingFormated("");
            } else {
                bsf.setShortTermBorrowingFormated(df.format(shortTermBorrowing));
            }
			
			double borrowingFromTheCentralBank=rs.getDouble("borrowingFromTheCentralBank");
			if (borrowingFromTheCentralBank == 0) {
                bsf.setBorrowingFromTheCentralBankFormated("");
            } else {
                bsf.setBorrowingFromTheCentralBankFormated(df.format(borrowingFromTheCentralBank));
            }

			double borrowingFunds=rs.getDouble("borrowingFunds");
			if (borrowingFunds == 0) {
                bsf.setBorrowingFundsFormated("");
            } else {
                bsf.setBorrowingFundsFormated(df.format(borrowingFunds));
            }

			double tradingFinancialLiabilities=rs.getDouble("tradingFinancialLiabilities");
			if (tradingFinancialLiabilities == 0) {
                bsf.setTradingFinancialLiabilitiesFormated("");
            } else {
                bsf.setTradingFinancialLiabilitiesFormated(df.format(tradingFinancialLiabilities));
            }
			

			double derivativeFinancialLiabilities=rs.getDouble("derivativeFinancialLiabilities");
			if (derivativeFinancialLiabilities == 0) {
                bsf.setDerivativeFinancialLiabilitiesFormated("");
            } else {
                bsf.setDerivativeFinancialLiabilitiesFormated(df.format(derivativeFinancialLiabilities));
            }

			double notesPayable=rs.getDouble("notesPayable");
			if (notesPayable == 0) {
                bsf.setNotesPayableFormated("");
            } else {
                bsf.setNotesPayableFormated(df.format(notesPayable));
            }

			double accountsPayable=rs.getDouble("accountsPayable");
			if (accountsPayable == 0) {
                bsf.setAccountsPayableFormated("");
            } else {
                bsf.setAccountsPayableFormated(df.format(accountsPayable));
            }
			
			double advanceReceipts=rs.getDouble("advanceReceipts");
			if (advanceReceipts == 0) {
                bsf.setAdvanceReceiptsFormated("");
            } else {
                bsf.setAdvanceReceiptsFormated(df.format(advanceReceipts));
            }

			double contractLiabilities=rs.getDouble("contractLiabilities");
			if (contractLiabilities == 0) {
                bsf.setContractLiabilitiesFormated("");
            } else {
                bsf.setContractLiabilitiesFormated(df.format(contractLiabilities));
            }

			double financialAssetsSoldForRepurchase=rs.getDouble("financialAssetsSoldForRepurchase");
			if (financialAssetsSoldForRepurchase == 0) {
                bsf.setFinancialAssetsSoldForRepurchaseFormated("");
            } else {
                bsf.setFinancialAssetsSoldForRepurchaseFormated(df.format(financialAssetsSoldForRepurchase));
            }

			double depositAbsorptionAndInterbankDeposits=rs.getDouble("depositAbsorptionAndInterbankDeposits");
			if (depositAbsorptionAndInterbankDeposits == 0) {
                bsf.setDepositAbsorptionAndInterbankDepositsFormated("");
            } else {
                bsf.setDepositAbsorptionAndInterbankDepositsFormated(df.format(depositAbsorptionAndInterbankDeposits));
            }

			double actingTradingSecurities=rs.getDouble("actingTradingSecurities");
			if (actingTradingSecurities == 0) {
                bsf.setActingTradingSecuritiesFormated("");
            } else {
                bsf.setActingTradingSecuritiesFormated(df.format(actingTradingSecurities));
            }

			double actingUnderwritingSecurities=rs.getDouble("actingUnderwritingSecurities");
			if (actingUnderwritingSecurities == 0) {
                bsf.setActingUnderwritingSecuritiesFormated("");
            } else {
                bsf.setActingUnderwritingSecuritiesFormated(df.format(actingUnderwritingSecurities));
            }
			
			double payrollPayable=rs.getDouble("payrollPayable");
			if (payrollPayable == 0) {
                bsf.setPayrollPayableFormated("");
            } else {
                bsf.setPayrollPayableFormated(df.format(payrollPayable));
            }

			bsf.setTotalNumberOfPeople(rs.getInt("totalNumberOfPeople"));
			
			double taxPayable=rs.getDouble("taxPayable");
			if (taxPayable == 0) {
                bsf.setTaxPayableFormated("");
            } else {
                bsf.setTaxPayableFormated(df.format(taxPayable));
            }

			double otherPayables=rs.getDouble("otherPayables");
			if (otherPayables == 0) {
                bsf.setOtherPayablesFormated("");
            } else {
                bsf.setOtherPayablesFormated(df.format(otherPayables));
            }

			double interestPayable=rs.getDouble("interestPayable");
			if (interestPayable == 0) {
                bsf.setInterestPayableFormated("");
            } else {
                bsf.setInterestPayableFormated(df.format(interestPayable));
            }

			double dividendPayable=rs.getDouble("dividendPayable");
			if (dividendPayable == 0) {
                bsf.setDividendPayableFormated("");
            } else {
                bsf.setDividendPayableFormated(df.format(dividendPayable));
            }

			double payableHandlingFeesAndCommissions=rs.getDouble("payableHandlingFeesAndCommissions");
			if (payableHandlingFeesAndCommissions == 0) {
                bsf.setPayableHandlingFeesAndCommissionsFormated("");
            } else {
                bsf.setPayableHandlingFeesAndCommissionsFormated(df.format(payableHandlingFeesAndCommissions));
            }

			double accountsPayableReinsurance=rs.getDouble("accountsPayableReinsurance");
			if (accountsPayableReinsurance == 0) {
                bsf.setAccountsPayableReinsuranceFormated("");
            } else {
                bsf.setAccountsPayableReinsuranceFormated(df.format(accountsPayableReinsurance));
            }

			double heldForSaleLiabilities=rs.getDouble("heldForSaleLiabilities");
			if (heldForSaleLiabilities == 0) {
                bsf.setHeldForSaleLiabilitiesFormated("");
            } else {
                bsf.setHeldForSaleLiabilitiesFormated(df.format(heldForSaleLiabilities));
            }

			double nonCurrentLiabilitiesDueWithinOneYear=rs.getDouble("nonCurrentLiabilitiesDueWithinOneYear");
			if (nonCurrentLiabilitiesDueWithinOneYear == 0) {
                bsf.setNonCurrentLiabilitiesDueWithinOneYearFormated("");
            } else {
                bsf.setNonCurrentLiabilitiesDueWithinOneYearFormated(df.format(nonCurrentLiabilitiesDueWithinOneYear));
            }

			double otherCurrentLiabilities=rs.getDouble("otherCurrentLiabilities");
			if (otherCurrentLiabilities == 0) {
                bsf.setOtherCurrentLiabilitiesFormated("");
            } else {
                bsf.setOtherCurrentLiabilitiesFormated(df.format(otherCurrentLiabilities));
            }

			double totalCurrentLiabilities=rs.getDouble("totalCurrentLiabilities");
			if (totalCurrentLiabilities == 0) {
                bsf.setTotalCurrentLiabilitiesFormated("");
            } else {
                bsf.setTotalCurrentLiabilitiesFormated(df.format(totalCurrentLiabilities));
            }
			
			double insuranceContractReserves=rs.getDouble("insuranceContractReserves");
			if (insuranceContractReserves == 0) {
                bsf.setInsuranceContractReservesFormated("");
            } else {
                bsf.setInsuranceContractReservesFormated(df.format(insuranceContractReserves));
            }

			double longTermLoan=rs.getDouble("longTermLoan");
			if (longTermLoan == 0) {
                bsf.setLongTermLoanFormated("");
            } else {
                bsf.setLongTermLoanFormated(df.format(longTermLoan));
            }

			double bondsPayable=rs.getDouble("bondsPayable");
			if (bondsPayable == 0) {
                bsf.setBondsPayableFormated("");
            } else {
                bsf.setBondsPayableFormated(df.format(bondsPayable));
            }

			double bondsPayablepreferredShares=rs.getDouble("bondsPayablepreferredShares");
			if (bondsPayablepreferredShares == 0) {
                bsf.setBondsPayablepreferredSharesFormated("");
            } else {
                bsf.setBondsPayablepreferredSharesFormated(df.format(bondsPayablepreferredShares));
            }

			double bondsPayableperpetualCapitalSecurities=rs.getDouble("bondsPayableperpetualCapitalSecurities");
			if (bondsPayableperpetualCapitalSecurities == 0) {
                bsf.setBondsPayableperpetualCapitalSecuritiesFormated("");
            } else {
                bsf.setBondsPayableperpetualCapitalSecuritiesFormated(df.format(bondsPayableperpetualCapitalSecurities));
            }

			double leaseLiabilities=rs.getDouble("leaseLiabilities");
			if (leaseLiabilities == 0) {
                bsf.setLeaseLiabilitiesFormated("");
            } else {
                bsf.setLeaseLiabilitiesFormated(df.format(leaseLiabilities));
            }

			double longTermPayables=rs.getDouble("longTermPayables");
			if (longTermPayables == 0) {
                bsf.setLongTermPayablesFormated("");
            } else {
                bsf.setLongTermPayablesFormated(df.format(longTermPayables));
            }

			double longTermEmployeeCompensationPayable=rs.getDouble("longTermEmployeeCompensationPayable");
			if (longTermEmployeeCompensationPayable == 0) {
                bsf.setLongTermEmployeeCompensationPayableFormated("");
            } else {
                bsf.setLongTermEmployeeCompensationPayableFormated(df.format(longTermEmployeeCompensationPayable));
            }

			double estimatedLiabilities=rs.getDouble("estimatedLiabilities");
			if (estimatedLiabilities == 0) {
                bsf.setEstimatedLiabilitiesFormated("");
            } else {
                bsf.setEstimatedLiabilitiesFormated(df.format(estimatedLiabilities));
            }

			double deferredIncome=rs.getDouble("deferredIncome");
			if (deferredIncome == 0) {
                bsf.setDeferredIncomeFormated("");
            } else {
                bsf.setDeferredIncomeFormated(df.format(deferredIncome));
            }

			double deferredIncomeTaxes=rs.getDouble("deferredIncomeTaxes");
			if (deferredIncomeTaxes == 0) {
                bsf.setDeferredIncomeTaxesFormated("");
            } else {
                bsf.setDeferredIncomeTaxesFormated(df.format(deferredIncomeTaxes));
            }

			double otherNonCurrentLiabilities=rs.getDouble("otherNonCurrentLiabilities");
			if (otherNonCurrentLiabilities == 0) {
                bsf.setOtherNonCurrentLiabilitiesFormated("");
            } else {
                bsf.setOtherNonCurrentLiabilitiesFormated(df.format(otherNonCurrentLiabilities));
            }

			double totalNonCurrentLiabilities=rs.getDouble("totalNonCurrentLiabilities");
			if (totalNonCurrentLiabilities == 0) {
                bsf.setTotalNonCurrentLiabilitiesFormated("");
            } else {
                bsf.setTotalNonCurrentLiabilitiesFormated(df.format(totalNonCurrentLiabilities));
            }

			double totalLiabilities=rs.getDouble("totalLiabilities");
			if (totalLiabilities == 0) {
                bsf.setTotalLiabilitiesFormated("");
            } else {
                bsf.setTotalLiabilitiesFormated(df.format(totalLiabilities));
            }

			double equity=rs.getDouble("equity");
			if (equity == 0) {
                bsf.setEquityFormated("");
            } else {
                bsf.setEquityFormated(df.format(equity));
            }

			double otherEquityInstruments=rs.getDouble("otherEquityInstruments");
			if (otherEquityInstruments == 0) {
                bsf.setOtherEquityInstrumentsFormated("");
            } else {
                bsf.setOtherEquityInstrumentsFormated(df.format(otherEquityInstruments));
            }

			double otherEquityInstrumentspreferredShares=rs.getDouble("otherEquityInstrumentspreferredShares");
			if (otherEquityInstrumentspreferredShares == 0) {
                bsf.setOtherEquityInstrumentspreferredSharesFormated("");
            } else {
                bsf.setOtherEquityInstrumentspreferredSharesFormated(df.format(otherEquityInstrumentspreferredShares));
            }

			double otherEquityInstrumentspetualCapitalSecurities=rs.getDouble("otherEquityInstrumentspetualCapitalSecurities");
			if (otherEquityInstrumentspetualCapitalSecurities == 0) {
                bsf.setOtherEquityInstrumentspetualCapitalSecuritiesFormated("");
            } else {
                bsf.setOtherEquityInstrumentspetualCapitalSecuritiesFormated(df.format(otherEquityInstrumentspetualCapitalSecurities));
            }

			double capitalReserve=rs.getDouble("capitalReserve");
			if (capitalReserve == 0) {
                bsf.setCapitalReserveFormated("");
            } else {
                bsf.setCapitalReserveFormated(df.format(capitalReserve));
            }

			double treasuryStock=rs.getDouble("treasuryStock");
			if (treasuryStock == 0) {
                bsf.setTreasuryStockFormated("");
            } else {
                bsf.setTreasuryStockFormated(df.format(treasuryStock));
            }

			double otherComprehensiveIncome=rs.getDouble("otherComprehensiveIncome");
			if (otherComprehensiveIncome == 0) {
                bsf.setOtherComprehensiveIncomeFormated("");
            } else {
                bsf.setOtherComprehensiveIncomeFormated(df.format(otherComprehensiveIncome));
            }

			double specialReserves=rs.getDouble("specialReserves");
			if (specialReserves == 0) {
                bsf.setSpecialReservesFormated("");
            } else {
                bsf.setSpecialReservesFormated(df.format(specialReserves));
            }

			double surplusReserves=rs.getDouble("surplusReserves");
			if (surplusReserves == 0) {
                bsf.setSurplusReservesFormated("");
            } else {
                bsf.setSurplusReservesFormated(df.format(surplusReserves));
            }

			double generalRiskProvisions=rs.getDouble("generalRiskProvisions");
			if (generalRiskProvisions == 0) {
                bsf.setGeneralRiskProvisionsFormated("");
            } else {
                bsf.setGeneralRiskProvisionsFormated(df.format(generalRiskProvisions));
            }

			double undistributedProfit=rs.getDouble("undistributedProfit");
			if (undistributedProfit == 0) {
                bsf.setUndistributedProfitFormated("");
            } else {
                bsf.setUndistributedProfitFormated(df.format(undistributedProfit));
            }

			double totalEquityAttributableOfParentCompany=rs.getDouble("totalEquityAttributableOfParentCompany");
			if (totalEquityAttributableOfParentCompany == 0) {
                bsf.setTotalEquityAttributableOfParentCompanyFormated("");
            } else {
                bsf.setTotalEquityAttributableOfParentCompanyFormated(df.format(totalEquityAttributableOfParentCompany));
            }

			double minorityInterest=rs.getDouble("minorityInterest");
			if (minorityInterest == 0) {
                bsf.setMinorityInterestFormated("");
            } else {
                bsf.setMinorityInterestFormated(df.format(minorityInterest));
            }

			double totalOwnersEquity=rs.getDouble("totalOwnersEquity");
			if (totalOwnersEquity == 0) {
                bsf.setTotalOwnersEquityFormated("");
            } else {
                bsf.setTotalOwnersEquityFormated(df.format(totalOwnersEquity));
            }

			double totalLiabilitiesAndOwnersEquity=rs.getDouble("totalLiabilitiesAndOwnersEquity");
			if (totalLiabilitiesAndOwnersEquity == 0) {
                bsf.setTotalLiabilitiesAndOwnersEquityFormated("");
            } else {
                bsf.setTotalLiabilitiesAndOwnersEquityFormated(df.format(totalLiabilitiesAndOwnersEquity));
            }

			bsf.setCreateDateTime(rs.getString("createDateTime"));
			bsf.setUpdateDateTime("upDateTime");
			bsList.add(bsf);
		}
		}catch(SQLException e) {
			e.printStackTrace();
	}
		return bsList;
	}
	

	@Override
	public ArrayList<IncomeStatementFormated> getIncomeStatement(String financialReportingNo) {
		// TODO Auto-generated method stub
		ArrayList<IncomeStatementFormated> isList=new ArrayList<IncomeStatementFormated>();
		String sql="select * from fr_incomestatement where financialReportingNo='"+financialReportingNo+"'";
		ResultSet rs=this.getResult(sql);
		try {
		while(rs.next()) {
			IncomeStatementFormated isf=new IncomeStatementFormated();
			DecimalFormat df = new DecimalFormat("#,###.00");
			DecimalFormat df1 = new DecimalFormat("0.00%");
			
			//财报编号：A股代码+财报年份
			isf.setFinancialReportingNo(rs.getString("financialReportingNo"));
			
			//营业总收入
			double grossRevenue=rs.getDouble("grossRevenue");
			if (grossRevenue == 0) {
                isf.setGrossRevenueFormated("");
            } else {
                isf.setGrossRevenueFormated(df.format(grossRevenue));
            }
			
			//营业收入
			double operatingRevenue=rs.getDouble("operatingRevenue");
			if (operatingRevenue == 0) {
                isf.setOperatingRevenueFormated("");
            } else {
                isf.setOperatingRevenueFormated(df.format(operatingRevenue));
            }

			//利息收入
			double interestIncome=rs.getDouble("interestIncome");
			if (interestIncome == 0) {
                isf.setInterestIncomeFormated("");
            } else {
                isf.setInterestIncomeFormated(df.format(interestIncome));
            }

			//已赚保费
			double earnedPremium=rs.getDouble("earnedPremium");
			if (earnedPremium == 0) {
                isf.setEarnedPremiumFormated("");
            } else {
                isf.setEarnedPremiumFormated(df.format(earnedPremium));
            }

			//手续费及佣金收入
			double feeAndCommissionIncome=rs.getDouble("feeAndCommissionIncome");
			if (feeAndCommissionIncome == 0) {
                isf.setFeeAndCommissionIncomeFormated("");
            } else {
                isf.setFeeAndCommissionIncomeFormated(df.format(feeAndCommissionIncome));
            }

			//营业总成本
			double totalOperatingCost=rs.getDouble("totalOperatingCost");
			if (totalOperatingCost == 0) {
                isf.setTotalOperatingCostFormated("");
            } else {
                isf.setTotalOperatingCostFormated(df.format(totalOperatingCost));
            }

			//营业成本
			double operatingCosts=rs.getDouble("operatingCosts");
			if (operatingCosts == 0) {
                isf.setOperatingCostsFormated("");
            } else {
                isf.setOperatingCostsFormated(df.format(operatingCosts));
            }

			//利息支出
			double interestExpense=rs.getDouble("interestExpense");
			if (interestExpense == 0) {
                isf.setInterestExpenseFormated("");
            } else {
                isf.setInterestExpenseFormated(df.format(interestExpense));
            }

			//手续费及佣金支出
			double handlingFeesAndCommissionExpenses=rs.getDouble("handlingFeesAndCommissionExpenses");
			if (handlingFeesAndCommissionExpenses == 0) {
                isf.setHandlingFeesAndCommissionExpensesFormated("");
            } else {
                isf.setHandlingFeesAndCommissionExpensesFormated(df.format(handlingFeesAndCommissionExpenses));
            }

			//退保金
			double surrender=rs.getDouble("surrender");
			if (surrender == 0) {
                isf.setSurrenderFormated("");
            } else {
                isf.setSurrenderFormated(df.format(surrender));
            }

			//赔付支出净额
			double netCompensationExpenses=rs.getDouble("netCompensationExpenses");
			if (netCompensationExpenses == 0) {
                isf.setNetCompensationExpensesFormated("");
            } else {
                isf.setNetCompensationExpensesFormated(df.format(netCompensationExpenses));
            }
			
			//保单红利支出
			double expendituresDividendPolicy=rs.getDouble("expendituresDividendPolicy");
			if (expendituresDividendPolicy == 0) {
                isf.setExpendituresDividendPolicyFormated("");
            } else {
                isf.setExpendituresDividendPolicyFormated(df.format(expendituresDividendPolicy));
            }

			//提取保险责任合同准备金净额
			double withdrawalOfReserveFundsForInsuranceLiabilityContracts=rs.getDouble("withdrawalOfReserveFundsForInsuranceLiabilityContracts");
			if (withdrawalOfReserveFundsForInsuranceLiabilityContracts == 0) {
                isf.setWithdrawalOfReserveFundsForInsuranceLiabilityContractsFormated("");
            } else {
                isf.setWithdrawalOfReserveFundsForInsuranceLiabilityContractsFormated(df.format(withdrawalOfReserveFundsForInsuranceLiabilityContracts));
            }

			//分保费用
			double reinsuranceExpenses=rs.getDouble("reinsuranceExpenses");
			if (reinsuranceExpenses == 0) {
                isf.setReinsuranceExpensesFormated("");
            } else {
                isf.setReinsuranceExpensesFormated(df.format(reinsuranceExpenses));
            }

			//税金及附加
			double taxesAndSurcharges=rs.getDouble("taxesAndSurcharges");
			if (taxesAndSurcharges == 0) {
                isf.setTaxesAndSurchargesFormated("");
            } else {
                isf.setTaxesAndSurchargesFormated(df.format(taxesAndSurcharges));
            }

			//销售费用
			double sellingExpenses=rs.getDouble("sellingExpenses");
			if (sellingExpenses == 0) {
                isf.setSellingExpensesFormated("");
            } else {
                isf.setSellingExpensesFormated(df.format(sellingExpenses));
            }

			//管理费用
			double overhead=rs.getDouble("overhead");
			if (overhead == 0) {
                isf.setOverheadFormated("");
            } else {
                isf.setOverheadFormated(df.format(overhead));
            }

			//研发费用
			double researchAndDevelopment=rs.getDouble("researchAndDevelopment");
			if (researchAndDevelopment == 0) {
                isf.setResearchAndDevelopmentFormated("");
            } else {
                isf.setResearchAndDevelopmentFormated(df.format(researchAndDevelopment));
            }

			//财务费用
			double financialExpenses=rs.getDouble("financialExpenses");
			if (financialExpenses == 0) {
                isf.setFinancialExpensesFormated("");
            } else {
                isf.setFinancialExpensesFormated(df.format(financialExpenses));
            }

			//财务费用：利息费用
			double financialExpensesInterestExpenses=rs.getDouble("financialExpensesInterestExpenses");
			if (financialExpensesInterestExpenses == 0) {
                isf.setFinancialExpensesInterestExpensesFormated("");
            } else {
                isf.setFinancialExpensesInterestExpensesFormated(df.format(financialExpensesInterestExpenses));
            }

			//财务费用：利息收入
			double financialExpensesInterestIncome=rs.getDouble("financialExpensesInterestIncome");
			if (financialExpensesInterestIncome == 0) {
                isf.setFinancialExpensesInterestIncomeFormated("");
            } else {
                isf.setFinancialExpensesInterestIncomeFormated(df.format(financialExpensesInterestIncome));
            }

			//其他收益
			double otherIncome=rs.getDouble("otherIncome");
			if (otherIncome == 0) {
                isf.setOtherIncomeFormated("");
            } else {
                isf.setOtherIncomeFormated(df.format(otherIncome));
            }

			//投资收益
			double incomeFromInvestment=rs.getDouble("incomeFromInvestment");
			if (incomeFromInvestment == 0) {
                isf.setIncomeFromInvestmentFormated("");
            } else {
                isf.setIncomeFromInvestmentFormated(df.format(incomeFromInvestment));
            }

			//其中：对联营企业和合营企业的投资收益
			double investmentIncomeFromAssociatesAndJointVentures=rs.getDouble("investmentIncomeFromAssociatesAndJointVentures");
			if (investmentIncomeFromAssociatesAndJointVentures == 0) {
                isf.setInvestmentIncomeFromAssociatesAndJointVenturesFormated("");
            } else {
                isf.setInvestmentIncomeFromAssociatesAndJointVenturesFormated(df.format(investmentIncomeFromAssociatesAndJointVentures));
            }

			//汇兑收益
			double exchangeGains=rs.getDouble("exchangeGains");
			if (exchangeGains == 0) {
                isf.setExchangeGainsFormated("");
            } else {
                isf.setExchangeGainsFormated(df.format(exchangeGains));
            }

			//以摊余成本计量的金融资产终止确认收益
			double incomeFromDerecognitionOfFinancialAssetsMeasuredAtAmortizedCost=rs.getDouble("incomeFromDerecognitionOfFinancialAssetsMeasuredAtAmortizedCost");
			if (incomeFromDerecognitionOfFinancialAssetsMeasuredAtAmortizedCost == 0) {
                isf.setIncomeFromDerecognitionOfFinancialAssetsMeasuredAtAmortizedCostFormated("");
            } else {
                isf.setIncomeFromDerecognitionOfFinancialAssetsMeasuredAtAmortizedCostFormated(df.format(incomeFromDerecognitionOfFinancialAssetsMeasuredAtAmortizedCost));
            }

			//净敞口套期收益
			double netExposureHedgingIncome=rs.getDouble("netExposureHedgingIncome");
			if (netExposureHedgingIncome == 0) {
                isf.setNetExposureHedgingIncomeFormated("");
            } else {
                isf.setNetExposureHedgingIncomeFormated(df.format(netExposureHedgingIncome));
            }

			//公允价值变动收益
			double incomeFromChangesInFairValue=rs.getDouble("incomeFromChangesInFairValue");
			if (incomeFromChangesInFairValue == 0) {
                isf.setIncomeFromChangesInFairValueFormated("");
            } else {
                isf.setIncomeFromChangesInFairValueFormated(df.format(incomeFromChangesInFairValue));
            }
			
			//信用减值损失
			double creditImpairmentLoss=rs.getDouble("creditImpairmentLoss");
			if (creditImpairmentLoss == 0) {
                isf.setCreditImpairmentLossFormated("");
            } else {
                isf.setCreditImpairmentLossFormated(df.format(creditImpairmentLoss));
            }

			//资产减值损失
			double impairmentLoss=rs.getDouble("impairmentLoss");
			if (impairmentLoss == 0) {
                isf.setImpairmentLossFormated("");
            } else {
                isf.setImpairmentLossFormated(df.format(impairmentLoss));
            }

			//资产处置收益
			double assetDisposalIncome=rs.getDouble("assetDisposalIncome");
			if (assetDisposalIncome == 0) {
                isf.setAssetDisposalIncomeFormated("");
            } else {
                isf.setAssetDisposalIncomeFormated(df.format(assetDisposalIncome));
            }

			//营业利润
			double operatingProfit=rs.getDouble("operatingProfit");
			if (operatingProfit == 0) {
                isf.setOperatingProfitFormated("");
            } else {
                isf.setOperatingProfitFormated(df.format(operatingProfit));
            }
			
			double nonOperatingIncome=rs.getDouble("nonOperatingIncome");
			if (nonOperatingIncome == 0) {
                isf.setNonOperatingIncomeFormated("");
            } else {
                isf.setNonOperatingIncomeFormated(df.format(nonOperatingIncome));
            }

			double nonOperatingExpenses=rs.getDouble("nonOperatingExpenses");
			if (nonOperatingExpenses == 0) {
                isf.setNonOperatingExpensesFormated("");
            } else {
                isf.setNonOperatingExpensesFormated(df.format(nonOperatingExpenses));
            }

			double totalProfit=rs.getDouble("totalProfit");
			if (totalProfit == 0) {
                isf.setTotalProfitFormated("");
            } else {
                isf.setTotalProfitFormated(df.format(totalProfit));
            }

			double incomeTaxExpense=rs.getDouble("incomeTaxExpense");
			if (incomeTaxExpense == 0) {
                isf.setIncomeTaxExpenseFormated("");
            } else {
                isf.setIncomeTaxExpenseFormated(df.format(incomeTaxExpense));
            }

			double netProfit=rs.getDouble("netProfit");
			if (netProfit == 0) {
                isf.setNetProfitFormated("");
            } else {
                isf.setNetProfitFormated(df.format(netProfit));
            }

			double netProfitFromContinuingOperations=rs.getDouble("netProfitFromContinuingOperations");
			if (netProfitFromContinuingOperations == 0) {
                isf.setNetProfitFromContinuingOperationsFormated("");
            } else {
                isf.setNetProfitFromContinuingOperationsFormated(df.format(netProfitFromContinuingOperations));
            }

			double netProfitFromDiscontinuedOperations=rs.getDouble("netProfitFromDiscontinuedOperations");
			if (netProfitFromDiscontinuedOperations == 0) {
                isf.setNetProfitFromDiscontinuedOperationsFormated("");
            } else {
                isf.setNetProfitFromDiscontinuedOperationsFormated(df.format(netProfitFromDiscontinuedOperations));
            }

			double netIncomeAttributableToShareholders=rs.getDouble("netIncomeAttributableToShareholders");
			if (netIncomeAttributableToShareholders == 0) {
                isf.setNetIncomeAttributableToShareholdersFormated("");
            } else {
                isf.setNetIncomeAttributableToShareholdersFormated(df.format(netIncomeAttributableToShareholders));
            }

			double minorityInterest=rs.getDouble("minorityInterest");
			if (minorityInterest == 0) {
                isf.setMinorityInterestFormated("");
            } else {
                isf.setMinorityInterestFormated(df.format(minorityInterest));
            }

			double afterTaxNetAmountOfOtherComprehensiveIncomeAttributable=rs.getDouble("afterTaxNetAmountOfOtherComprehensiveIncomeAttributable");
			if (afterTaxNetAmountOfOtherComprehensiveIncomeAttributable == 0) {
                isf.setAfterTaxNetAmountOfOtherComprehensiveIncomeAttributableFormated("");
            } else {
                isf.setAfterTaxNetAmountOfOtherComprehensiveIncomeAttributableFormated(df.format(afterTaxNetAmountOfOtherComprehensiveIncomeAttributable));
            }

			double otherComprehensiveIncomeCannotBeReclassifiedIntoProfitOrLoss=rs.getDouble("otherComprehensiveIncomeCannotBeReclassifiedIntoProfitOrLoss");
			if (otherComprehensiveIncomeCannotBeReclassifiedIntoProfitOrLoss == 0) {
                isf.setOtherComprehensiveIncomeCannotBeReclassifiedIntoProfitOrLossFormated("");
            } else {
                isf.setOtherComprehensiveIncomeCannotBeReclassifiedIntoProfitOrLossFormated(df.format(otherComprehensiveIncomeCannotBeReclassifiedIntoProfitOrLoss));
            }

			double remeasureChangesInDefinedBenefitPlans=rs.getDouble("remeasureChangesInDefinedBenefitPlans");
			if (remeasureChangesInDefinedBenefitPlans == 0) {
                isf.setRemeasureChangesInDefinedBenefitPlansFormated("");
            } else {
                isf.setRemeasureChangesInDefinedBenefitPlansFormated(df.format(remeasureChangesInDefinedBenefitPlans));
            }

			double otherIncomeCannotBeConvertedToProfitOrLossUnderTheEquityMethod=rs.getDouble("otherIncomeCannotBeConvertedToProfitOrLossUnderTheEquityMethod");
			if (otherIncomeCannotBeConvertedToProfitOrLossUnderTheEquityMethod == 0) {
                isf.setOtherIncomeCannotBeConvertedToProfitOrLossUnderTheEquityMethodFormated("");
            } else {
                isf.setOtherIncomeCannotBeConvertedToProfitOrLossUnderTheEquityMethodFormated(df.format(otherIncomeCannotBeConvertedToProfitOrLossUnderTheEquityMethod));
            }

			double changesInFairValueOfOtherEquityInstrumentInvestments=rs.getDouble("changesInFairValueOfOtherEquityInstrumentInvestments");
			if (changesInFairValueOfOtherEquityInstrumentInvestments == 0) {
                isf.setChangesInFairValueOfOtherEquityInstrumentInvestmentsFormated("");
            } else {
                isf.setChangesInFairValueOfOtherEquityInstrumentInvestmentsFormated(df.format(changesInFairValueOfOtherEquityInstrumentInvestments));
            }

			double changesInFairValueOfCorporateCreditRisk=rs.getDouble("changesInFairValueOfCorporateCreditRisk");
			if (changesInFairValueOfCorporateCreditRisk == 0) {
                isf.setChangesInFairValueOfCorporateCreditRiskFormated("");
            } else {
                isf.setChangesInFairValueOfCorporateCreditRiskFormated(df.format(changesInFairValueOfCorporateCreditRisk));
            }

			double others=rs.getDouble("others");
			if (others == 0) {
                isf.setOthersFormated("");
            } else {
                isf.setOthersFormated(df.format(others));
            }

			double otherIncomeReclassifiedToProfitOrLoss=rs.getDouble("otherIncomeReclassifiedToProfitOrLoss");
			if (otherIncomeReclassifiedToProfitOrLoss == 0) {
                isf.setOtherIncomeReclassifiedToProfitOrLossFormated("");
            } else {
                isf.setOtherIncomeReclassifiedToProfitOrLossFormated(df.format(otherIncomeReclassifiedToProfitOrLoss));
            }

			double otherIncomeCanBeConvertedToProfitOrLossUnderTheEquityMethod=rs.getDouble("otherIncomeCanBeConvertedToProfitOrLossUnderTheEquityMethod");
			if (otherIncomeCanBeConvertedToProfitOrLossUnderTheEquityMethod == 0) {
                isf.setOtherIncomeCanBeConvertedToProfitOrLossUnderTheEquityMethodFormated("");
            } else {
                isf.setOtherIncomeCanBeConvertedToProfitOrLossUnderTheEquityMethodFormated(df.format(otherIncomeCanBeConvertedToProfitOrLossUnderTheEquityMethod));
            }

			double changesInFairValueOfOtherDebtInvestments=rs.getDouble("changesInFairValueOfOtherDebtInvestments");
			if (changesInFairValueOfOtherDebtInvestments == 0) {
                isf.setChangesInFairValueOfOtherDebtInvestmentsFormated("");
            } else {
                isf.setChangesInFairValueOfOtherDebtInvestmentsFormated(df.format(changesInFairValueOfOtherDebtInvestments));
            }


			double reclassificationOfFinancialAssetsInOtherComprehensiveIncome=rs.getDouble("reclassificationOfFinancialAssetsInOtherComprehensiveIncome");
			if (reclassificationOfFinancialAssetsInOtherComprehensiveIncome == 0) {
                isf.setReclassificationOfFinancialAssetsInOtherComprehensiveIncomeFormated("");
            } else {
                isf.setReclassificationOfFinancialAssetsInOtherComprehensiveIncomeFormated(df.format(reclassificationOfFinancialAssetsInOtherComprehensiveIncome));
            }

			double provisionForOtherDebtInvestments=rs.getDouble("provisionForOtherDebtInvestments");
			if (provisionForOtherDebtInvestments == 0) {
                isf.setProvisionForOtherDebtInvestmentsFormated("");
            } else {
                isf.setProvisionForOtherDebtInvestmentsFormated(df.format(provisionForOtherDebtInvestments));
            }

			double cashFlowHedgingReserves=rs.getDouble("cashFlowHedgingReserves");
			if (cashFlowHedgingReserves == 0) {
                isf.setCashFlowHedgingReservesFormated("");
            } else {
                isf.setCashFlowHedgingReservesFormated(df.format(cashFlowHedgingReserves));
            }

			double currencyTranslationDifferences=rs.getDouble("currencyTranslationDifferences");
			if (currencyTranslationDifferences == 0) {
                isf.setCurrencyTranslationDifferencesFormated("");
            } else {
                isf.setCurrencyTranslationDifferencesFormated(df.format(currencyTranslationDifferences));
            }

			double others1=rs.getDouble("others1");
			if (others1 == 0) {
                isf.setOthers1Formated("");
            } else {
                isf.setOthers1Formated(df.format(others1));
            }

			double otherIncomeAfterTaxAttributableToMinorityShareholders=rs.getDouble("otherIncomeAfterTaxAttributableToMinorityShareholders");
			if (otherIncomeAfterTaxAttributableToMinorityShareholders == 0) {
                isf.setOtherIncomeAfterTaxAttributableToMinorityShareholdersFormated("");
            } else {
                isf.setOtherIncomeAfterTaxAttributableToMinorityShareholdersFormated(df.format(otherIncomeAfterTaxAttributableToMinorityShareholders));
            }

			double totalComprehensiveIncome=rs.getDouble("totalComprehensiveIncome");
			if (totalComprehensiveIncome == 0) {
                isf.setTotalComprehensiveIncomeFormated("");
            } else {
                isf.setTotalComprehensiveIncomeFormated(df.format(totalComprehensiveIncome));
            }

			double totalComprehensiveIncomeToTheOwnersOfTheParentCompany=rs.getDouble("totalComprehensiveIncomeToTheOwnersOfTheParentCompany");
			if (totalComprehensiveIncomeToTheOwnersOfTheParentCompany == 0) {
                isf.setTotalComprehensiveIncomeToTheOwnersOfTheParentCompanyFormated("");
            } else {
                isf.setTotalComprehensiveIncomeToTheOwnersOfTheParentCompanyFormated(df.format(totalComprehensiveIncomeToTheOwnersOfTheParentCompany));
            }

			double totalComprehensiveIncomeToMinorityShareholders=rs.getDouble("totalComprehensiveIncomeToMinorityShareholders");
			if (totalComprehensiveIncomeToMinorityShareholders == 0) {
                isf.setTotalComprehensiveIncomeToMinorityShareholdersFormated("");
            } else {
                isf.setTotalComprehensiveIncomeToMinorityShareholdersFormated(df.format(totalComprehensiveIncomeToMinorityShareholders));
            }

			double basicEarningsPerShare=rs.getDouble("basicEarningsPerShare");
			if (basicEarningsPerShare == 0) {
                isf.setBasicEarningsPerShareFormated("");
            } else {
                isf.setBasicEarningsPerShareFormated(df.format(basicEarningsPerShare));
            }

			double dilutedEarningsPerShare=rs.getDouble("dilutedEarningsPerShare");
			if (dilutedEarningsPerShare == 0) {
                isf.setDilutedEarningsPerShareFormated("");
            } else {
                isf.setDilutedEarningsPerShareFormated(df.format(dilutedEarningsPerShare));
            }


			double ROED=rs.getDouble("ROE");
			if (ROED == 0) {
                isf.setROE("");
            } else {
                isf.setROE(df1.format(ROED));
            }
			

			double financialReportDividends=rs.getDouble("financialReportDividends");
			if (financialReportDividends == 0) {
                isf.setFinancialReportDividendsFormated("");
            } else {
                isf.setFinancialReportDividendsFormated(df.format(financialReportDividends));
            }
			


			isf.setCreateDateTime(rs.getString("createDateTime"));
			isf.setUpdateDateTime("upDateTime");
			isList.add(isf);
		}
		}
		catch(SQLException e) {
			e.printStackTrace();
	}
		return isList;
	}


	@Override
	public ArrayList<CashflowStatementFormated> getCashflowStatement(String financialReportingNo) {
		// TODO Auto-generated method stub
		ArrayList<CashflowStatementFormated> csList=new ArrayList<CashflowStatementFormated>();
		String sql="select * from fr_cashflowstatement where financialReportingNo='"+financialReportingNo+"'";
		ResultSet rs=this.getResult(sql);
		try {
		while(rs.next()) {
			CashflowStatementFormated csf=new CashflowStatementFormated();
			DecimalFormat df = new DecimalFormat("#,###.00");
			csf.setFinancialReportingNo(rs.getString("financialReportingNo"));
			
			double cashReceivedFromSellingGoodsAndProvidingServices=rs.getDouble("cashReceivedFromSellingGoodsAndProvidingServices");
			if (cashReceivedFromSellingGoodsAndProvidingServices == 0) {
                csf.setCashReceivedFromSellingGoodsAndProvidingServicesFormated("");
            } else {
                csf.setCashReceivedFromSellingGoodsAndProvidingServicesFormated(df.format(cashReceivedFromSellingGoodsAndProvidingServices));
            }
			
			double netIncreaseInCustomerDepositsAndInterbankDeposits=rs.getDouble("netIncreaseInCustomerDepositsAndInterbankDeposits");
			if (netIncreaseInCustomerDepositsAndInterbankDeposits == 0) {
                csf.setNetIncreaseInCustomerDepositsAndInterbankDepositsFormated("");
            } else {
                csf.setNetIncreaseInCustomerDepositsAndInterbankDepositsFormated(df.format(netIncreaseInCustomerDepositsAndInterbankDeposits));
            }
			
			double netIncreaseInBorrowingFromTheCentralBank=rs.getDouble("netIncreaseInBorrowingFromTheCentralBank");
			if (netIncreaseInBorrowingFromTheCentralBank == 0) {
                csf.setNetIncreaseInBorrowingFromTheCentralBankFormated("");
            } else {
                csf.setNetIncreaseInBorrowingFromTheCentralBankFormated(df.format(netIncreaseInBorrowingFromTheCentralBank));
            }

			double netIncreaseInBorrowingFundsFromOtherFinancialInstitutions=rs.getDouble("netIncreaseInBorrowingFundsFromOtherFinancialInstitutions");
			if (netIncreaseInBorrowingFundsFromOtherFinancialInstitutions == 0) {
                csf.setNetIncreaseInBorrowingFundsFromOtherFinancialInstitutionsFormated("");
            } else {
                csf.setNetIncreaseInBorrowingFundsFromOtherFinancialInstitutionsFormated(df.format(netIncreaseInBorrowingFundsFromOtherFinancialInstitutions));
            }

			double cashReceivedFromPremiumOfOriginalInsuranceContract=rs.getDouble("cashReceivedFromPremiumOfOriginalInsuranceContract");
			if (cashReceivedFromPremiumOfOriginalInsuranceContract == 0) {
                csf.setCashReceivedFromPremiumOfOriginalInsuranceContractFormated("");
            } else {
                csf.setCashReceivedFromPremiumOfOriginalInsuranceContractFormated(df.format(cashReceivedFromPremiumOfOriginalInsuranceContract));
            }

			double receiptOfReinsuranceNetCash=rs.getDouble("receiptOfReinsuranceNetCash");
			if (receiptOfReinsuranceNetCash == 0) {
                csf.setReceiptOfReinsuranceNetCashFormated("");
            } else {
                csf.setReceiptOfReinsuranceNetCashFormated(df.format(receiptOfReinsuranceNetCash));
            }

			double netIncreaseInDepositsFromPolicyholders=rs.getDouble("netIncreaseInDepositsFromPolicyholders");
			if (netIncreaseInDepositsFromPolicyholders == 0) {
                csf.setNetIncreaseInDepositsFromPolicyholdersFormated("");
            } else {
                csf.setNetIncreaseInDepositsFromPolicyholdersFormated(df.format(netIncreaseInDepositsFromPolicyholders));
            }

			double cashChargeInterestFeesAndCommissions=rs.getDouble("cashChargeInterestFeesAndCommissions");
			if (cashChargeInterestFeesAndCommissions == 0) {
                csf.setCashChargeInterestFeesAndCommissionsFormated("");
            } else {
                csf.setCashChargeInterestFeesAndCommissionsFormated(df.format(cashChargeInterestFeesAndCommissions));
            }

			double netIncreaseInBorrowedFunds=rs.getDouble("netIncreaseInBorrowedFunds");
			if (netIncreaseInBorrowedFunds == 0) {
                csf.setNetIncreaseInBorrowedFundsFormated("");
            } else {
                csf.setNetIncreaseInBorrowedFundsFormated(df.format(netIncreaseInBorrowedFunds));
            }

			double netIncreaseInRepurchaseBusinessFunds=rs.getDouble("netIncreaseInRepurchaseBusinessFunds");
			if (netIncreaseInRepurchaseBusinessFunds == 0) {
                csf.setNetIncreaseInRepurchaseBusinessFundsFormated("");
            } else {
                csf.setNetIncreaseInRepurchaseBusinessFundsFormated(df.format(netIncreaseInRepurchaseBusinessFunds));
            }

			double netCashReceivedFromProxyTradingOfSecurities=rs.getDouble("netCashReceivedFromProxyTradingOfSecurities");
			if (netCashReceivedFromProxyTradingOfSecurities == 0) {
                csf.setNetCashReceivedFromProxyTradingOfSecuritiesFormated("");
            } else {
                csf.setNetCashReceivedFromProxyTradingOfSecuritiesFormated(df.format(netCashReceivedFromProxyTradingOfSecurities));
            }

			double refundsOfTaxes=rs.getDouble("refundsOfTaxes");
			if (refundsOfTaxes == 0) {
                csf.setRefundsOfTaxesFormated("");
            } else {
                csf.setRefundsOfTaxesFormated(df.format(refundsOfTaxes));
            }

			double otherCashReceivedRelatingToOperatingActivities=rs.getDouble("otherCashReceivedRelatingToOperatingActivities");
			if (otherCashReceivedRelatingToOperatingActivities == 0) {
                csf.setOtherCashReceivedRelatingToOperatingActivitiesFormated("");
            } else {
                csf.setOtherCashReceivedRelatingToOperatingActivitiesFormated(df.format(otherCashReceivedRelatingToOperatingActivities));
            }

			double businessActivitiesSubtotalOfCashInflows=rs.getDouble("businessActivitiesSubtotalOfCashInflows");
			if (businessActivitiesSubtotalOfCashInflows == 0) {
                csf.setBusinessActivitiesSubtotalOfCashInflowsFormated("");
            } else {
                csf.setBusinessActivitiesSubtotalOfCashInflowsFormated(df.format(businessActivitiesSubtotalOfCashInflows));
            }

			double cashPaidForPurchasingGoodsAndReceivingServices=rs.getDouble("cashPaidForPurchasingGoodsAndReceivingServices");
			if (cashPaidForPurchasingGoodsAndReceivingServices == 0) {
                csf.setCashPaidForPurchasingGoodsAndReceivingServicesFormated("");
            } else {
                csf.setCashPaidForPurchasingGoodsAndReceivingServicesFormated(df.format(cashPaidForPurchasingGoodsAndReceivingServices));
            }

			double netIncreaseInCustomerLoansAndAdvances=rs.getDouble("netIncreaseInCustomerLoansAndAdvances");
			if (netIncreaseInCustomerLoansAndAdvances == 0) {
                csf.setNetIncreaseInCustomerLoansAndAdvancesFormated("");
            } else {
                csf.setNetIncreaseInCustomerLoansAndAdvancesFormated(df.format(netIncreaseInCustomerLoansAndAdvances));
            }

			double netIncreaseInDepositsWithCentralBanksAndInterbankFunds=rs.getDouble("netIncreaseInDepositsWithCentralBanksAndInterbankFunds");
			if (netIncreaseInDepositsWithCentralBanksAndInterbankFunds == 0) {
                csf.setNetIncreaseInDepositsWithCentralBanksAndInterbankFundsFormated("");
            } else {
                csf.setNetIncreaseInDepositsWithCentralBanksAndInterbankFundsFormated(df.format(netIncreaseInDepositsWithCentralBanksAndInterbankFunds));
            }

			double paymentOfTheOriginalInsuranceContractToPayTheAmountOfCash=rs.getDouble("paymentOfTheOriginalInsuranceContractToPayTheAmountOfCash");
			if (paymentOfTheOriginalInsuranceContractToPayTheAmountOfCash == 0) {
                csf.setPaymentOfTheOriginalInsuranceContractToPayTheAmountOfCashFormated("");
            } else {
                csf.setPaymentOfTheOriginalInsuranceContractToPayTheAmountOfCashFormated(df.format(paymentOfTheOriginalInsuranceContractToPayTheAmountOfCash));
            }

			double netIncreaseInLendingFunds=rs.getDouble("netIncreaseInLendingFunds");
			if (netIncreaseInLendingFunds == 0) {
                csf.setNetIncreaseInLendingFundsFormated("");
            } else {
                csf.setNetIncreaseInLendingFundsFormated(df.format(netIncreaseInLendingFunds));
            }

			double cashPaidForInterestHandlingFeesAndCommissions=rs.getDouble("cashPaidForInterestHandlingFeesAndCommissions");
			if (cashPaidForInterestHandlingFeesAndCommissions == 0) {
                csf.setCashPaidForInterestHandlingFeesAndCommissionsFormated("");
            } else {
                csf.setCashPaidForInterestHandlingFeesAndCommissionsFormated(df.format(cashPaidForInterestHandlingFeesAndCommissions));
            }

			double cashPaidForPolicyDividends=rs.getDouble("cashPaidForPolicyDividends");
			if (cashPaidForPolicyDividends == 0) {
                csf.setCashPaidForPolicyDividendsFormated("");
            } else {
                csf.setCashPaidForPolicyDividendsFormated(df.format(cashPaidForPolicyDividends));
            }

			double cashPaidToAndOnBehalfOfEmployees=rs.getDouble("cashPaidToAndOnBehalfOfEmployees");
			if (cashPaidToAndOnBehalfOfEmployees == 0) {
                csf.setCashPaidToAndOnBehalfOfEmployeesFormated("");
            } else {
                csf.setCashPaidToAndOnBehalfOfEmployeesFormated(df.format(cashPaidToAndOnBehalfOfEmployees));
            }

			double taxesPaid=rs.getDouble("taxesPaid");
			if (taxesPaid == 0) {
                csf.setTaxesPaidFormated("");
            } else {
                csf.setTaxesPaidFormated(df.format(taxesPaid));
            }

			double paymentOfOtherCashRelatedToOperatingActivities=rs.getDouble("paymentOfOtherCashRelatedToOperatingActivities");
			if (paymentOfOtherCashRelatedToOperatingActivities == 0) {
                csf.setPaymentOfOtherCashRelatedToOperatingActivitiesFormated("");
            } else {
                csf.setPaymentOfOtherCashRelatedToOperatingActivitiesFormated(df.format(paymentOfOtherCashRelatedToOperatingActivities));
            }

			double subtotalOfCashOutflowsFromOperatingActivities=rs.getDouble("subtotalOfCashOutflowsFromOperatingActivities");
			if (subtotalOfCashOutflowsFromOperatingActivities == 0) {
                csf.setSubtotalOfCashOutflowsFromOperatingActivitiesFormated("");
            } else {
                csf.setSubtotalOfCashOutflowsFromOperatingActivitiesFormated(df.format(subtotalOfCashOutflowsFromOperatingActivities));
            }

			double netCashFlowFromOperating=rs.getDouble("netCashFlowFromOperating");
			if (netCashFlowFromOperating == 0) {
                csf.setNetCashFlowFromOperatingFormated("");
            } else {
                csf.setNetCashFlowFromOperatingFormated(df.format(netCashFlowFromOperating));
            }

			double cashReceivedFromInvestmentRecovery=rs.getDouble("cashReceivedFromInvestmentRecovery");
			if (cashReceivedFromInvestmentRecovery == 0) {
                csf.setCashReceivedFromInvestmentRecoveryFormated("");
            } else {
                csf.setCashReceivedFromInvestmentRecoveryFormated(df.format(cashReceivedFromInvestmentRecovery));
            }

			double cashReceivedFromObtainingInvestmentReturns=rs.getDouble("cashReceivedFromObtainingInvestmentReturns");
			if (cashReceivedFromObtainingInvestmentReturns == 0) {
                csf.setCashReceivedFromObtainingInvestmentReturnsFormated("");
            } else {
                csf.setCashReceivedFromObtainingInvestmentReturnsFormated(df.format(cashReceivedFromObtainingInvestmentReturns));
            }

			double netCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssets=rs.getDouble("netCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssets");
			if (netCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssets == 0) {
                csf.setNetCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssetsFormated("");
            } else {
                csf.setNetCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssetsFormated(df.format(netCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssets));
            }

			double netCashReceivedFromDisposalOfSubsidiariesAndOtherOperatingUnits=rs.getDouble("netCashReceivedFromDisposalOfSubsidiariesAndOtherOperatingUnits");
			if (netCashReceivedFromDisposalOfSubsidiariesAndOtherOperatingUnits == 0) {
                csf.setNetCashReceivedFromDisposalOfSubsidiariesAndOtherOperatingUnitsFormated("");
            } else {
                csf.setNetCashReceivedFromDisposalOfSubsidiariesAndOtherOperatingUnitsFormated(df.format(netCashReceivedFromDisposalOfSubsidiariesAndOtherOperatingUnits));
            }

			double receivedOtherCashRelatedToInvestmentActivities=rs.getDouble("receivedOtherCashRelatedToInvestmentActivities");
			if (receivedOtherCashRelatedToInvestmentActivities == 0) {
                csf.setReceivedOtherCashRelatedToInvestmentActivitiesFormated("");
            } else {
                csf.setReceivedOtherCashRelatedToInvestmentActivitiesFormated(df.format(receivedOtherCashRelatedToInvestmentActivities));
            }

			double subtotalOfCashInflowsFromInvestmentActivities=rs.getDouble("subtotalOfCashInflowsFromInvestmentActivities");
			if (subtotalOfCashInflowsFromInvestmentActivities == 0) {
                csf.setSubtotalOfCashInflowsFromInvestmentActivitiesFormated("");
            } else {
                csf.setSubtotalOfCashInflowsFromInvestmentActivitiesFormated(df.format(subtotalOfCashInflowsFromInvestmentActivities));
            }

			double cashPaidForPurchaseConstructionFixedIntangibleLongTermAssets=rs.getDouble("cashPaidForPurchaseConstructionFixedIntangibleLongTermAssets");
			if (cashPaidForPurchaseConstructionFixedIntangibleLongTermAssets == 0) {
                csf.setCashPaidForPurchaseConstructionFixedIntangibleLongTermAssetsFormated("");
            } else {
                csf.setCashPaidForPurchaseConstructionFixedIntangibleLongTermAssetsFormated(df.format(cashPaidForPurchaseConstructionFixedIntangibleLongTermAssets));
            }

			double cashPaidForInvestment=rs.getDouble("cashPaidForInvestment");
			if (cashPaidForInvestment == 0) {
                csf.setCashPaidForInvestmentFormated("");
            } else {
                csf.setCashPaidForInvestmentFormated(df.format(cashPaidForInvestment));
            }

			double netIncreaseInPledgedLoans=rs.getDouble("netIncreaseInPledgedLoans");
			if (netIncreaseInPledgedLoans == 0) {
                csf.setNetIncreaseInPledgedLoansFormated("");
            } else {
                csf.setNetIncreaseInPledgedLoansFormated(df.format(netIncreaseInPledgedLoans));
            }

			double netCashPaidToSubsidiariesAndOtherBusinessUnits=rs.getDouble("netCashPaidToSubsidiariesAndOtherBusinessUnits");
			if (netCashPaidToSubsidiariesAndOtherBusinessUnits == 0) {
                csf.setNetCashPaidToSubsidiariesAndOtherBusinessUnitsFormated("");
            } else {
                csf.setNetCashPaidToSubsidiariesAndOtherBusinessUnitsFormated(df.format(netCashPaidToSubsidiariesAndOtherBusinessUnits));
            }

			double paymentOfOtherCashRelatedToInvestmentActivities=rs.getDouble("paymentOfOtherCashRelatedToInvestmentActivities");
			if (paymentOfOtherCashRelatedToInvestmentActivities == 0) {
                csf.setPaymentOfOtherCashRelatedToInvestmentActivitiesFormated("");
            } else {
                csf.setPaymentOfOtherCashRelatedToInvestmentActivitiesFormated(df.format(paymentOfOtherCashRelatedToInvestmentActivities));
            }

			double subtotalOfCashOutflowsFromInvestmentActivities=rs.getDouble("subtotalOfCashOutflowsFromInvestmentActivities");
			if (subtotalOfCashOutflowsFromInvestmentActivities == 0) {
                csf.setSubtotalOfCashOutflowsFromInvestmentActivitiesFormated("");
            } else {
                csf.setSubtotalOfCashOutflowsFromInvestmentActivitiesFormated(df.format(subtotalOfCashOutflowsFromInvestmentActivities));
            }

			double netCashFlowGeneratedFromInvestmentActivities=rs.getDouble("netCashFlowGeneratedFromInvestmentActivities");
			if (netCashFlowGeneratedFromInvestmentActivities == 0) {
                csf.setNetCashFlowGeneratedFromInvestmentActivitiesFormated("");
            } else {
                csf.setNetCashFlowGeneratedFromInvestmentActivitiesFormated(df.format(netCashFlowGeneratedFromInvestmentActivities));
            }

			double cashReceivedFromAbsorbingInvestments=rs.getDouble("cashReceivedFromAbsorbingInvestments");
			if (cashReceivedFromAbsorbingInvestments == 0) {
                csf.setCashReceivedFromAbsorbingInvestmentsFormated("");
            } else {
                csf.setCashReceivedFromAbsorbingInvestmentsFormated(df.format(cashReceivedFromAbsorbingInvestments));
            }

			double cashReceivedFromMinorityInvestmentInSubsidiaries=rs.getDouble("cashReceivedFromMinorityInvestmentInSubsidiaries");
			if (cashReceivedFromMinorityInvestmentInSubsidiaries == 0) {
                csf.setCashReceivedFromMinorityInvestmentInSubsidiariesFormated("");
            } else {
                csf.setCashReceivedFromMinorityInvestmentInSubsidiariesFormated(df.format(cashReceivedFromMinorityInvestmentInSubsidiaries));
            }

			double cashReceivedFromObtainingLoans=rs.getDouble("cashReceivedFromObtainingLoans");
			if (cashReceivedFromObtainingLoans == 0) {
                csf.setCashReceivedFromObtainingLoansFormated("");
            } else {
                csf.setCashReceivedFromObtainingLoansFormated(df.format(cashReceivedFromObtainingLoans));
            }

			double receivedOtherCashRelatedToFinancingActivities=rs.getDouble("receivedOtherCashRelatedToFinancingActivities");
			if (receivedOtherCashRelatedToFinancingActivities == 0) {
                csf.setReceivedOtherCashRelatedToFinancingActivitiesFormated("");
            } else {
                csf.setReceivedOtherCashRelatedToFinancingActivitiesFormated(df.format(receivedOtherCashRelatedToFinancingActivities));
            }

			double subtotalOfCashInflowsFromFinancingActivities=rs.getDouble("subtotalOfCashInflowsFromFinancingActivities");
			if (subtotalOfCashInflowsFromFinancingActivities == 0) {
                csf.setSubtotalOfCashInflowsFromFinancingActivitiesFormated("");
            } else {
                csf.setSubtotalOfCashInflowsFromFinancingActivitiesFormated(df.format(subtotalOfCashInflowsFromFinancingActivities));
            }

			double cashRepaymentsOfAmountsBorrowed=rs.getDouble("cashRepaymentsOfAmountsBorrowed");
			if (cashRepaymentsOfAmountsBorrowed == 0) {
                csf.setCashRepaymentsOfAmountsBorrowedFormated("");
            } else {
                csf.setCashRepaymentsOfAmountsBorrowedFormated(df.format(cashRepaymentsOfAmountsBorrowed));
            }

			double cashPaidForDistributingDividendsProfitsPayingInterest=rs.getDouble("cashPaidForDistributingDividendsProfitsPayingInterest");
			if (cashPaidForDistributingDividendsProfitsPayingInterest == 0) {
                csf.setCashPaidForDistributingDividendsProfitsPayingInterestFormated("");
            } else {
                csf.setCashPaidForDistributingDividendsProfitsPayingInterestFormated(df.format(cashPaidForDistributingDividendsProfitsPayingInterest));
            }

			double dividendsAndProfitsAaidBySubsidiariesToMinorityShareholders=rs.getDouble("dividendsAndProfitsAaidBySubsidiariesToMinorityShareholders");
			if (dividendsAndProfitsAaidBySubsidiariesToMinorityShareholders == 0) {
                csf.setDividendsAndProfitsAaidBySubsidiariesToMinorityShareholdersFormated("");
            } else {
                csf.setDividendsAndProfitsAaidBySubsidiariesToMinorityShareholdersFormated(df.format(dividendsAndProfitsAaidBySubsidiariesToMinorityShareholders));
            }

			double paymentOfOtherCashRelatedToFinancingActivities=rs.getDouble("paymentOfOtherCashRelatedToFinancingActivities");
			if (paymentOfOtherCashRelatedToFinancingActivities == 0) {
                csf.setPaymentOfOtherCashRelatedToFinancingActivitiesFormated("");
            } else {
                csf.setPaymentOfOtherCashRelatedToFinancingActivitiesFormated(df.format(paymentOfOtherCashRelatedToFinancingActivities));
            }

			double subtotalOfCashOutflowsFromFinancingActivities=rs.getDouble("subtotalOfCashOutflowsFromFinancingActivities");
			if (subtotalOfCashOutflowsFromFinancingActivities == 0) {
                csf.setSubtotalOfCashOutflowsFromFinancingActivitiesFormated("");
            } else {
                csf.setSubtotalOfCashOutflowsFromFinancingActivitiesFormated(df.format(subtotalOfCashOutflowsFromFinancingActivities));
            }

			double netCashFlowGeneratedFromFinancingActivities=rs.getDouble("netCashFlowGeneratedFromFinancingActivities");
			if (netCashFlowGeneratedFromFinancingActivities == 0) {
                csf.setNetCashFlowGeneratedFromFinancingActivitiesFormated("");
            } else {
                csf.setNetCashFlowGeneratedFromFinancingActivitiesFormated(df.format(netCashFlowGeneratedFromFinancingActivities));
            }

			double theImpactOfExchangeRateFluctuationsOnCashAndCashEquivalents=rs.getDouble("theImpactOfExchangeRateFluctuationsOnCashAndCashEquivalents");
			if (theImpactOfExchangeRateFluctuationsOnCashAndCashEquivalents == 0) {
                csf.setTheImpactOfExchangeRateFluctuationsOnCashAndCashEquivalentsFormated("");
            } else {
                csf.setTheImpactOfExchangeRateFluctuationsOnCashAndCashEquivalentsFormated(df.format(theImpactOfExchangeRateFluctuationsOnCashAndCashEquivalents));
            }

			double netIncreaseInCashAndCashEquivalents=rs.getDouble("netIncreaseInCashAndCashEquivalents");
			if (netIncreaseInCashAndCashEquivalents == 0) {
                csf.setNetIncreaseInCashAndCashEquivalentsFormated("");
            } else {
                csf.setNetIncreaseInCashAndCashEquivalentsFormated(df.format(netIncreaseInCashAndCashEquivalents));
            }

			double openingCashAndCashEquivalentsBalance=rs.getDouble("openingCashAndCashEquivalentsBalance");
			if (openingCashAndCashEquivalentsBalance == 0) {
                csf.setOpeningCashAndCashEquivalentsBalanceFormated("");
            } else {
                csf.setOpeningCashAndCashEquivalentsBalanceFormated(df.format(openingCashAndCashEquivalentsBalance));
            }

			double closingBalanceOfCashAndCashEquivalents=rs.getDouble("closingBalanceOfCashAndCashEquivalents");
			if (closingBalanceOfCashAndCashEquivalents == 0) {
                csf.setClosingBalanceOfCashAndCashEquivalentsFormated("");
            } else {
                csf.setClosingBalanceOfCashAndCashEquivalentsFormated(df.format(closingBalanceOfCashAndCashEquivalents));
            }
			
			csf.setCreateDateTime(rs.getString("createDateTime"));
			csf.setUpdateDateTime("upDateTime");
			csList.add(csf);
		}
		}
		catch(SQLException e) {
			e.printStackTrace();
	}
		return csList;
	}

	public ArrayList<CashflowSupplementFormated> getCashflowSupplement(String financialReportingNo){
		ArrayList<CashflowSupplementFormated> cfsList=new ArrayList<CashflowSupplementFormated>();
		String sql="select * from fr_cashflowsupplement where financialReportingNo='"+financialReportingNo+"'";
		ResultSet rs=this.getResult(sql);
		try {
		while(rs.next()) {
			CashflowSupplementFormated cfs=new CashflowSupplementFormated();
			DecimalFormat df = new DecimalFormat("#,###.00");
			cfs.setFinancialReportingNo(rs.getString("financialReportingNo"));
			System.out.print(financialReportingNo);
			
			double impairmentOfAssets=rs.getDouble("impairmentOfAssets");
			if (impairmentOfAssets == 0) {
				cfs.setImpairmentOfAssetsFormated("");
            } else {
            	cfs.setImpairmentOfAssetsFormated(df.format(impairmentOfAssets));
            }
			
			double depreciation=rs.getDouble("depreciation");
			if (depreciation == 0) {
				cfs.setDepreciationFormated("");
            } else {
            	cfs.setDepreciationFormated(df.format(depreciation));
            }
			
			double depreciationOfRightOfUseAssets=rs.getDouble("depreciationOfRightOfUseAssets");
			if (depreciationOfRightOfUseAssets == 0) {
				cfs.setDepreciationOfRightOfUseAssetsFormated("");
            } else {
            	cfs.setDepreciationOfRightOfUseAssetsFormated(df.format(depreciationOfRightOfUseAssets));
            }
			
			double amortizationOfIntangibleAssets=rs.getDouble("amortizationOfIntangibleAssets");
			if (amortizationOfIntangibleAssets == 0) {
				cfs.setAmortizationOfIntangibleAssetsFormated("");
            } else {
            	cfs.setAmortizationOfIntangibleAssetsFormated(df.format(amortizationOfIntangibleAssets));
            }
			
			double amortizationOfLongTermDeferredExpenses=rs.getDouble("amortizationOfLongTermDeferredExpenses");
			if (amortizationOfLongTermDeferredExpenses == 0) {
				cfs.setAmortizationOfLongTermDeferredExpensesFormated("");
            } else {
            	cfs.setAmortizationOfLongTermDeferredExpensesFormated(df.format(amortizationOfLongTermDeferredExpenses));
            }
			
			double lossOnDisposalOfAssets=rs.getDouble("lossOnDisposalOfAssets");
			if (lossOnDisposalOfAssets == 0) {
				cfs.setLossOnDisposalOfAssetsFormated("");
            } else {
            	cfs.setLossOnDisposalOfAssetsFormated(df.format(lossOnDisposalOfAssets));
            }
			
			double lossesOnScrappingOfFixedAssets=rs.getDouble("lossesOnScrappingOfFixedAssets");
			if (lossesOnScrappingOfFixedAssets == 0) {
				cfs.setLossesOnScrappingOfFixedAssetsFormated("");
            } else {
            	cfs.setLossesOnScrappingOfFixedAssetsFormated(df.format(lossesOnScrappingOfFixedAssets));
            }
			
			double lossFromChangesInFairValue=rs.getDouble("lossFromChangesInFairValue");
			if (lossFromChangesInFairValue == 0) {
				cfs.setLossFromChangesInFairValueFormated("");
            } else {
            	cfs.setLossFromChangesInFairValueFormated(df.format(lossFromChangesInFairValue));
            }
			
			double financialExpenses=rs.getDouble("financialExpenses");
			if (financialExpenses == 0) {
				cfs.setFinancialExpensesFormated("");
            } else {
            	cfs.setFinancialExpensesFormated(df.format(financialExpenses));
            }
			
			double investmentLosses=rs.getDouble("investmentLosses");
			if (investmentLosses == 0) {
				cfs.setInvestmentLossesFormated("");
            } else {
            	cfs.setInvestmentLossesFormated(df.format(investmentLosses));
            }
			
			double decreaseInDeferredIncomeTaxAssets=rs.getDouble("decreaseInDeferredIncomeTaxAssets");
			if (decreaseInDeferredIncomeTaxAssets == 0) {
				cfs.setDecreaseInDeferredIncomeTaxAssetsFormated("");
            } else {
            	cfs.setDecreaseInDeferredIncomeTaxAssetsFormated(df.format(decreaseInDeferredIncomeTaxAssets));
            }
			
			double increaseInDeferredIncomeTaxLiabilities=rs.getDouble("increaseInDeferredIncomeTaxLiabilities");
			if (increaseInDeferredIncomeTaxLiabilities == 0) {
				cfs.setIncreaseInDeferredIncomeTaxLiabilitiesFormated("");
            } else {
            	cfs.setIncreaseInDeferredIncomeTaxLiabilitiesFormated(df.format(increaseInDeferredIncomeTaxLiabilities));
            }
			
			double reductionOfInventory=rs.getDouble("reductionOfInventory");
			if (reductionOfInventory == 0) {
				cfs.setReductionOfInventoryFormated("");
            } else {
            	cfs.setReductionOfInventoryFormated(df.format(reductionOfInventory));
            }
			
			double reductionOfOperatingReceivables=rs.getDouble("reductionOfOperatingReceivables");
			if (reductionOfOperatingReceivables == 0) {
				cfs.setReductionOfOperatingReceivablesFormated("");
            } else {
            	cfs.setReductionOfOperatingReceivablesFormated(df.format(reductionOfOperatingReceivables));
            }
			
			double increaseInOperationalPayables=rs.getDouble("increaseInOperationalPayables");
			if (increaseInOperationalPayables == 0) {
				cfs.setIncreaseInOperationalPayablesFormated("");
            } else {
            	cfs.setIncreaseInOperationalPayablesFormated(df.format(increaseInOperationalPayables));
            }
			
			
			double conversionOfDebtIntoCapital=rs.getDouble("conversionOfDebtIntoCapital");
			if (conversionOfDebtIntoCapital == 0) {
				cfs.setConversionOfDebtIntoCapitalFormated("");
            } else {
            	cfs.setConversionOfDebtIntoCapitalFormated(df.format(conversionOfDebtIntoCapital));
            }
			
			double convertibleCorporatebondsDueWithinOneYear=rs.getDouble("convertibleCorporatebondsDueWithinOneYear");
			if (convertibleCorporatebondsDueWithinOneYear == 0) {
				cfs.setConvertibleCorporatebondsDueWithinOneYearFormated("");
            } else {
            	cfs.setConvertibleCorporatebondsDueWithinOneYearFormated(df.format(convertibleCorporatebondsDueWithinOneYear));
            }
			
			double fixedAssetsUnderFinancingLease=rs.getDouble("fixedAssetsUnderFinancingLease");
			if (fixedAssetsUnderFinancingLease == 0) {
				cfs.setFixedAssetsUnderFinancingLeaseFormated("");
            } else {
            	cfs.setFixedAssetsUnderFinancingLeaseFormated(df.format(fixedAssetsUnderFinancingLease));
            }
			
			cfs.setCreateDateTime(rs.getString("createDateTime"));
			cfs.setUpdateDateTime("upDateTime");
			cfsList.add(cfs);
		}
		}
		catch(SQLException e) {
			e.printStackTrace();
	}
		return cfsList;
	}

	@Override
	public boolean delReport(String financialReportingNo) {
		// TODO Auto-generated method stub
		String sql1="delete from fr_head where financialReportingNo=?";
		String sql2="delete from fr_balancesheet where financialReportingNo=?";
		String sql3="delete from fr_incomestatement where financialReportingNo=?";
		String sql4="delete from fr_cashflowstatement  where financialReportingNo=?";
		String sql5="delete from fr_cashflowsupplement  where financialReportingNo=?";
		try(PreparedStatement statement1 = con.prepareStatement(sql1);PreparedStatement statement2 = con.prepareStatement(sql2);
			PreparedStatement statement3 = con.prepareStatement(sql3);PreparedStatement statement4 = con.prepareStatement(sql4);
			PreparedStatement statement5 = con.prepareStatement(sql5))
		{
			con.setAutoCommit(false);
			statement1.setString(1,financialReportingNo);
			statement1.executeUpdate();
			statement2.setString(1,financialReportingNo);
			statement2.executeUpdate();
			statement3.setString(1,financialReportingNo);
			statement3.executeUpdate();
			statement4.setString(1,financialReportingNo);
			statement4.executeUpdate();
			statement5.setString(1,financialReportingNo);
			statement4.executeUpdate();
			con.commit();
	        return true; // 修改成功，返回true
	    } catch (SQLException e) {
	        e.printStackTrace();
	       
	        return false; // 修改失败，返回false
	    }
	}


	@Override
	public boolean updateBalanceSheet(BalanceSheet bs) {
		// TODO Auto-generated method stub
		String sql="update fr_balancesheet set monetaryCapital=?,settlementProvisions=?,lendingFunds=?,tradingFinancialAssets=?,tradingFinancialAssetsManagement=?,derivativeFinancialAssets=?,"
				+ "billReceivable=?,accountsReceivable=?,accountsReceivableFinancing=?,prepayments=?,premiumReceivable=?,accountsReceivableReinsurance=?,receivableReserveForReinsuranceContracts=?,"
				+ "otherReceivables=?,interestReceivable=?,dividendReceivable=?,buyingBackFinancialAssets=?,inventory=?,contractAssets=?,assetsHeldForSale=?,nonCurrentAssetsDueWithinOneYear=?,"
				+ "otherCurrentAssets=?,otherCurrentAssetsManagement=?,totalCurrentAssets=?,grantingLoansAndAdvances=?,debtInvestment=?,otherDebtInvestment=?,longTermReceivables=?,"
				+ "longTermEquityInvestment=?,otherEquityInstrumentInvestments=?,otherNonCurrentFinancialAssets=?,investmentRealEstate=?,fixedAssets=?,constructionInProgress=?,"
				+ "productiveBiologicalAssets=?,oilAndGasAssets=?,rightOfUseAssets=?,intangibleAssets=?,developmentExpenditure=?,goodwill=?,longTermDeferredExpense=?,deferredTaxAssets=?,"
				+ "otherNonCurrentAssets=?,totalNonCurrentAssets=?,totalAssets=?,longTermEquityInvestmentsUnrelatedToMainBusiness=?,incomeFromLongTermEquityInvestments=?,shortTermBorrowing=?,"
				+ "borrowingFromTheCentralBank=?,borrowingFunds=?,tradingFinancialLiabilities=?,derivativeFinancialLiabilities=?,notesPayable=?,accountsPayable=?,advanceReceipts=?,"
				+ "contractLiabilities=?,financialAssetsSoldForRepurchase=?,depositAbsorptionAndInterbankDeposits=?,actingTradingSecurities=?,actingUnderwritingSecurities=?,payrollPayable=?,"
				+ "totalNumberOfPeople=?,taxPayable=?,otherPayables=?,interestPayable=?,dividendPayable=?,payableHandlingFeesAndCommissions=?,accountsPayableReinsurance=?,heldForSaleLiabilities=?,"
				+ "nonCurrentLiabilitiesDueWithinOneYear=?,otherCurrentLiabilities=?,totalCurrentLiabilities=?,insuranceContractReserves=?,longTermLoan=?,bondsPayable=?,bondsPayablepreferredShares=?,"
				+ "bondsPayableperpetualCapitalSecurities=?,leaseLiabilities=?,longTermPayables=?,longTermEmployeeCompensationPayable=?,estimatedLiabilities=?,deferredIncome=?,deferredIncomeTaxes=?,"
				+ "otherNonCurrentLiabilities=?,totalNonCurrentLiabilities=?,totalLiabilities=?,equity=?,otherEquityInstruments=?,otherEquityInstrumentspreferredShares=?,otherEquityInstrumentspetualCapitalSecurities=?,"
				+ "capitalReserve=?,treasuryStock=?,otherComprehensiveIncome=?,specialReserves=?,surplusReserves=?,generalRiskProvisions=?,undistributedProfit=?,totalEquityAttributableOfParentCompany=?,"
				+ "minorityInterest=?,totalOwnersEquity=?,totalLiabilitiesAndOwnersEquity=?,upDateTime=? where financialReportingNo='"+bs.getFinancialReportingNo()+"'";
		try(PreparedStatement statement = con.prepareStatement(sql)){
			statement.setDouble(1, bs.getMonetaryCapital());
		    statement.setDouble(2, bs.getSettlementProvisions());
		    statement.setDouble(3, bs.getLendingFunds());
		    statement.setDouble(4, bs.getTradingFinancialAssets());
		    statement.setDouble(5, bs.getTradingFinancialAssetsManagement());
		    statement.setDouble(6, bs.getDerivativeFinancialAssets());
		    statement.setDouble(7, bs.getBillReceivable());
		    statement.setDouble(8, bs.getAccountsReceivable());
		    statement.setDouble(9, bs.getAccountsReceivableFinancing());
		    statement.setDouble(10, bs.getPrepayments());
		    statement.setDouble(11, bs.getPremiumReceivable());
		    statement.setDouble(12, bs.getAccountsReceivableReinsurance());
		    statement.setDouble(13, bs.getReceivableReserveForReinsuranceContracts());
		    statement.setDouble(14, bs.getOtherReceivables());
		    statement.setDouble(15, bs.getInterestReceivable());
		    statement.setDouble(16, bs.getDividendReceivable());
		    statement.setDouble(17, bs.getBuyingBackFinancialAssets());
		    statement.setDouble(18, bs.getInventory());
		    statement.setDouble(19, bs.getContractAssets());
		    statement.setDouble(20, bs.getAssetsHeldForSale());
		    statement.setDouble(21, bs.getNonCurrentAssetsDueWithinOneYear());
		    statement.setDouble(22, bs.getOtherCurrentAssets());
		    statement.setDouble(23, bs.getOtherCurrentAssetsManagement());
		    statement.setDouble(24, bs.getTotalCurrentAssets());
		    statement.setDouble(25, bs.getGrantingLoansAndAdvances());
		    statement.setDouble(26, bs.getDebtInvestment());
		    statement.setDouble(27, bs.getOtherDebtInvestment());
		    statement.setDouble(28, bs.getLongTermReceivables());
		    statement.setDouble(29, bs.getLongTermEquityInvestment());
		    statement.setDouble(30, bs.getOtherEquityInstrumentInvestments());
		    statement.setDouble(31, bs.getOtherNonCurrentFinancialAssets());
		    statement.setDouble(32, bs.getInvestmentRealEstate());
		    statement.setDouble(33, bs.getFixedAssets());
		    statement.setDouble(34, bs.getConstructionInProgress());
		    statement.setDouble(35, bs.getProductiveBiologicalAssets());
		    statement.setDouble(36, bs.getOilAndGasAssets());
		    statement.setDouble(37, bs.getRightOfUseAssets());
		    statement.setDouble(38, bs.getIntangibleAssets());
		    statement.setDouble(39, bs.getDevelopmentExpenditure());
		    statement.setDouble(40, bs.getGoodwill());
		    statement.setDouble(41, bs.getLongTermDeferredExpense());
		    statement.setDouble(42, bs.getDeferredTaxAssets());
		    statement.setDouble(43, bs.getOtherNonCurrentAssets());
		    statement.setDouble(44, bs.getTotalNonCurrentAssets());
		    statement.setDouble(45, bs.getTotalAssets());
		    statement.setDouble(46, bs.getLongTermEquityInvestmentsUnrelatedToMainBusiness());
		    statement.setDouble(47, bs.getIncomeFromLongTermEquityInvestments());
		    statement.setDouble(48, bs.getShortTermBorrowing());
		    statement.setDouble(49, bs.getBorrowingFromTheCentralBank());
		    statement.setDouble(50, bs.getBorrowingFunds());
		    statement.setDouble(51, bs.getTradingFinancialLiabilities());
		    statement.setDouble(52, bs.getDerivativeFinancialLiabilities());
		    statement.setDouble(53, bs.getNotesPayable());
		    statement.setDouble(54, bs.getAccountsPayable());
		    statement.setDouble(55, bs.getAdvanceReceipts());
		    statement.setDouble(56, bs.getContractLiabilities());
		    statement.setDouble(57, bs.getFinancialAssetsSoldForRepurchase());
		    statement.setDouble(58, bs.getDepositAbsorptionAndInterbankDeposits());
		    statement.setDouble(59, bs.getActingTradingSecurities());
		    statement.setDouble(60, bs.getActingUnderwritingSecurities());
		    statement.setDouble(61, bs.getPayrollPayable());
		    statement.setInt(62, bs.getTotalNumberOfPeople());
		    statement.setDouble(63, bs.getTaxPayable());
		    statement.setDouble(64, bs.getOtherPayables());
		    statement.setDouble(65, bs.getInterestPayable());
		    statement.setDouble(66, bs.getDividendPayable());
		    statement.setDouble(67, bs.getPayableHandlingFeesAndCommissions());
		    statement.setDouble(68, bs.getAccountsPayableReinsurance());
		    statement.setDouble(69, bs.getHeldForSaleLiabilities());
		    statement.setDouble(70, bs.getNonCurrentLiabilitiesDueWithinOneYear());
		    statement.setDouble(71, bs.getOtherCurrentLiabilities());
		    statement.setDouble(72, bs.getTotalCurrentLiabilities());
		    statement.setDouble(73, bs.getInsuranceContractReserves());
		    statement.setDouble(74, bs.getLongTermLoan());
		    statement.setDouble(75, bs.getBondsPayable());
		    statement.setDouble(76, bs.getBondsPayablepreferredShares());
		    statement.setDouble(77, bs.getBondsPayableperpetualCapitalSecurities());
		    statement.setDouble(78, bs.getLeaseLiabilities());
		    statement.setDouble(79, bs.getLongTermPayables());
		    statement.setDouble(80, bs.getLongTermEmployeeCompensationPayable());
		    statement.setDouble(81, bs.getEstimatedLiabilities());
		    statement.setDouble(82, bs.getDeferredIncome());
		    statement.setDouble(83, bs.getDeferredIncomeTaxes());
		    statement.setDouble(84, bs.getOtherNonCurrentLiabilities());
		    statement.setDouble(85, bs.getTotalNonCurrentLiabilities());
		    statement.setDouble(86, bs.getTotalLiabilities());
		    statement.setDouble(87, bs.getEquity());
		    statement.setDouble(88, bs.getOtherEquityInstruments());
		    statement.setDouble(89, bs.getOtherEquityInstrumentspreferredShares());
		    statement.setDouble(90, bs.getOtherEquityInstrumentspetualCapitalSecurities());
		    statement.setDouble(91, bs.getCapitalReserve());
		    statement.setDouble(92, bs.getTreasuryStock());
		    statement.setDouble(93, bs.getOtherComprehensiveIncome());
		    statement.setDouble(94, bs.getSpecialReserves());
		    statement.setDouble(95, bs.getSurplusReserves());
		    statement.setDouble(96, bs.getGeneralRiskProvisions());
		    statement.setDouble(97, bs.getUndistributedProfit());
		    statement.setDouble(98, bs.getTotalEquityAttributableOfParentCompany());
		    statement.setDouble(99, bs.getMinorityInterest());
		    statement.setDouble(100, bs.getTotalOwnersEquity());
		    statement.setDouble(101, bs.getTotalLiabilitiesAndOwnersEquity());
		    statement.setString(102, bs.getUpdateDateTime());

		    statement.executeUpdate();
		    return true; // 修改成功，返回true
		}catch (SQLException e) {
		    e.printStackTrace();
		    return false; // 修改失败，返回false
		}
	}

	@Override
	public boolean updateIncomeStatement(IncomeStatement is){
		// TODO Auto-generated method stub
		String sql="update fr_incomestatement set grossRevenue=?,operatingRevenue=?,interestIncome=?,earnedPremium=?,feeAndCommissionIncome=?,totalOperatingCost=?,"
				+ "operatingCosts=?,interestExpense=?,handlingFeesAndCommissionExpenses=?,surrender=?,netCompensationExpenses=?,expendituresDividendPolicy=?,withdrawalOfReserveFundsForInsuranceLiabilityContracts=?,reinsuranceExpenses=?,"
				+ "taxesAndSurcharges=?,sellingExpenses=?,overhead=?,researchAndDevelopment=?,financialExpenses=?,financialExpensesInterestExpenses=?,financialExpensesInterestIncome=?,otherIncome=?,"
				+ "incomeFromInvestment=?,investmentIncomeFromAssociatesAndJointVentures=?,exchangeGains=?,incomeFromDerecognitionOfFinancialAssetsMeasuredAtAmortizedCost=?,netExposureHedgingIncome=?,"
				+ "incomeFromChangesInFairValue=?,creditImpairmentLoss=?,impairmentLoss=?,assetDisposalIncome=?,operatingProfit=?,nonOperatingIncome=?,nonOperatingExpenses=?,totalProfit=?,incomeTaxExpense=?,"
				+ "netProfit=?,netProfitFromContinuingOperations=?,netProfitFromDiscontinuedOperations=?,netIncomeAttributableToShareholders=?,minorityInterest=?,afterTaxNetAmountOfOtherComprehensiveIncomeAttributable=?,"
				+ "otherComprehensiveIncomeCannotBeReclassifiedIntoProfitOrLoss=?,remeasureChangesInDefinedBenefitPlans=?,otherIncomeCannotBeConvertedToProfitOrLossUnderTheEquityMethod=?,"
				+ "changesInFairValueOfOtherEquityInstrumentInvestments=?,changesInFairValueOfCorporateCreditRisk=?,others=?,otherIncomeReclassifiedToProfitOrLoss=?,otherIncomeCanBeConvertedToProfitOrLossUnderTheEquityMethod=?,"
				+ "changesInFairValueOfOtherDebtInvestments=?,reclassificationOfFinancialAssetsInOtherComprehensiveIncome=?,provisionForOtherDebtInvestments=?,cashFlowHedgingReserves=?,currencyTranslationDifferences=?,"
				+ "others1=?,otherIncomeAfterTaxAttributableToMinorityShareholders=?,totalComprehensiveIncome=?,totalComprehensiveIncomeToTheOwnersOfTheParentCompany=?,totalComprehensiveIncomeToMinorityShareholders=?,"
				+ "basicEarningsPerShare=?,dilutedEarningsPerShare=?,ROE=?,financialReportDividends=?,upDateTime=? where financialReportingNo='"+is.getFinancialReportingNo()+"'";
		try(PreparedStatement statement = con.prepareStatement(sql)){

			statement.setDouble(1, is.getGrossRevenue());
			statement.setDouble(2, is.getOperatingRevenue());
			statement.setDouble(3, is.getInterestIncome());
			statement.setDouble(4, is.getEarnedPremium());
			statement.setDouble(5, is.getFeeAndCommissionIncome());
			statement.setDouble(6, is.getTotalOperatingCost());
			statement.setDouble(7, is.getOperatingCosts());
			statement.setDouble(8, is.getInterestExpense());
			statement.setDouble(9, is.getHandlingFeesAndCommissionExpenses());
			statement.setDouble(10, is.getSurrender());
			statement.setDouble(11, is.getNetCompensationExpenses());
			statement.setDouble(12, is.getExpendituresDividendPolicy());
			statement.setDouble(13, is.getWithdrawalOfReserveFundsForInsuranceLiabilityContracts());
			statement.setDouble(14, is.getReinsuranceExpenses());
			statement.setDouble(15, is.getTaxesAndSurcharges());
			statement.setDouble(16, is.getSellingExpenses());
			statement.setDouble(17, is.getOverhead());
			statement.setDouble(18, is.getResearchAndDevelopment());
			statement.setDouble(19, is.getFinancialExpenses());
			statement.setDouble(20, is.getFinancialExpensesInterestExpenses());
			statement.setDouble(21, is.getFinancialExpensesInterestIncome());
			statement.setDouble(22, is.getOtherIncome());
			statement.setDouble(23, is.getIncomeFromInvestment());
			statement.setDouble(24, is.getInvestmentIncomeFromAssociatesAndJointVentures());
			statement.setDouble(25, is.getExchangeGains());
			statement.setDouble(26, is.getIncomeFromDerecognitionOfFinancialAssetsMeasuredAtAmortizedCost());
			statement.setDouble(27, is.getNetExposureHedgingIncome());
			statement.setDouble(28, is.getIncomeFromChangesInFairValue());
			statement.setDouble(29, is.getCreditImpairmentLoss());
			statement.setDouble(30, is.getImpairmentLoss());
			statement.setDouble(31, is.getAssetDisposalIncome());
			statement.setDouble(32, is.getOperatingProfit());
			statement.setDouble(33, is.getNonOperatingIncome());
			statement.setDouble(34, is.getNonOperatingExpenses());
			statement.setDouble(35, is.getTotalProfit());
			statement.setDouble(36, is.getIncomeTaxExpense());
			statement.setDouble(37, is.getNetProfit());
			statement.setDouble(38, is.getNetProfitFromContinuingOperations());
			statement.setDouble(39, is.getNetProfitFromDiscontinuedOperations());
			statement.setDouble(40, is.getNetIncomeAttributableToShareholders());
			statement.setDouble(41, is.getMinorityInterest());
			statement.setDouble(42, is.getAfterTaxNetAmountOfOtherComprehensiveIncomeAttributable());
			statement.setDouble(43, is.getOtherComprehensiveIncomeCannotBeReclassifiedIntoProfitOrLoss());
			statement.setDouble(44, is.getRemeasureChangesInDefinedBenefitPlans());
			statement.setDouble(45, is.getOtherIncomeCannotBeConvertedToProfitOrLossUnderTheEquityMethod());
			statement.setDouble(46, is.getChangesInFairValueOfOtherEquityInstrumentInvestments());
			statement.setDouble(47, is.getChangesInFairValueOfCorporateCreditRisk());
			statement.setDouble(48, is.getOthers());
			statement.setDouble(49, is.getOtherIncomeReclassifiedToProfitOrLoss());
			statement.setDouble(50, is.getOtherIncomeCanBeConvertedToProfitOrLossUnderTheEquityMethod());
			statement.setDouble(51, is.getChangesInFairValueOfOtherDebtInvestments());
			statement.setDouble(52, is.getReclassificationOfFinancialAssetsInOtherComprehensiveIncome());
			statement.setDouble(53, is.getProvisionForOtherDebtInvestments());
			statement.setDouble(54, is.getCashFlowHedgingReserves());
			statement.setDouble(55, is.getCurrencyTranslationDifferences());
			statement.setDouble(56, is.getOthers1());
			statement.setDouble(57, is.getOtherIncomeAfterTaxAttributableToMinorityShareholders());
			statement.setDouble(58, is.getTotalComprehensiveIncome());
			statement.setDouble(59, is.getTotalComprehensiveIncomeToTheOwnersOfTheParentCompany());
			statement.setDouble(60, is.getTotalComprehensiveIncomeToMinorityShareholders());
			statement.setDouble(61, is.getBasicEarningsPerShare());
			statement.setDouble(62, is.getDilutedEarningsPerShare());
			statement.setDouble(63, is.getROE());
			statement.setDouble(64, is.getFinancialReportDividends());
			statement.setString(65, is.getUpdateDateTime());
			statement.executeUpdate();
		    return true; // 修改成功，返回true
		    
		}catch (SQLException e) {
		    e.printStackTrace();
		    return false; // 修改失败，返回false
		}
	}
	
	@Override
	public boolean updateCashflowStatement(CashflowStatement cs) {
		// TODO Auto-generated method stub
		String sql="update fr_cashflowstatement set cashReceivedFromSellingGoodsAndProvidingServices=?,netIncreaseInCustomerDepositsAndInterbankDeposits=?,netIncreaseInBorrowingFromTheCentralBank=?,netIncreaseInBorrowingFundsFromOtherFinancialInstitutions=?,"
				+ "cashReceivedFromPremiumOfOriginalInsuranceContract=?,receiptOfReinsuranceNetCash=?,netIncreaseInDepositsFromPolicyholders=?,cashChargeInterestFeesAndCommissions=?,netIncreaseInBorrowedFunds=?,netIncreaseInRepurchaseBusinessFunds=?,"
				+ "netCashReceivedFromProxyTradingOfSecurities=?,refundsOfTaxes=?,otherCashReceivedRelatingToOperatingActivities=?,businessActivitiesSubtotalOfCashInflows=?,cashPaidForPurchasingGoodsAndReceivingServices=?,netIncreaseInCustomerLoansAndAdvances=?,"
				+ "netIncreaseInDepositsWithCentralBanksAndInterbankFunds=?,paymentOfTheOriginalInsuranceContractToPayTheAmountOfCash=?,netIncreaseInLendingFunds=?,cashPaidForInterestHandlingFeesAndCommissions=?,cashPaidForPolicyDividends=?,"
				+ "cashPaidToAndOnBehalfOfEmployees=?,taxesPaid=?,paymentOfOtherCashRelatedToOperatingActivities=?,subtotalOfCashOutflowsFromOperatingActivities=?,netCashFlowFromOperating=?,cashReceivedFromInvestmentRecovery=?,cashReceivedFromObtainingInvestmentReturns=?,"
				+ "netCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssets=?,netCashReceivedFromDisposalOfSubsidiariesAndOtherOperatingUnits=?,receivedOtherCashRelatedToInvestmentActivities=?,subtotalOfCashInflowsFromInvestmentActivities=?,"
				+ "cashPaidForPurchaseConstructionFixedIntangibleLongTermAssets=?,cashPaidForInvestment=?,netIncreaseInPledgedLoans=?,netCashPaidToSubsidiariesAndOtherBusinessUnits=?,paymentOfOtherCashRelatedToInvestmentActivities=?,subtotalOfCashOutflowsFromInvestmentActivities=?,"
				+ "netCashFlowGeneratedFromInvestmentActivities=?,cashReceivedFromAbsorbingInvestments=?,cashReceivedFromMinorityInvestmentInSubsidiaries=?,cashReceivedFromObtainingLoans=?,receivedOtherCashRelatedToFinancingActivities=?,subtotalOfCashInflowsFromFinancingActivities=?,"
				+ "cashRepaymentsOfAmountsBorrowed=?,cashPaidForDistributingDividendsProfitsPayingInterest=?,dividendsAndProfitsAaidBySubsidiariesToMinorityShareholders=?,paymentOfOtherCashRelatedToFinancingActivities=?,subtotalOfCashOutflowsFromFinancingActivities=?,"
				+ "netCashFlowGeneratedFromFinancingActivities=?,theImpactOfExchangeRateFluctuationsOnCashAndCashEquivalents=?,netIncreaseInCashAndCashEquivalents=?,openingCashAndCashEquivalentsBalance=?,closingBalanceOfCashAndCashEquivalents=?,upDateTime=? where financialReportingNo='"+cs.getFinancialReportingNo()+"'";
		try(PreparedStatement statement = con.prepareStatement(sql)){

			statement.setDouble(1, cs.getCashReceivedFromSellingGoodsAndProvidingServices());
			statement.setDouble(2, cs.getNetIncreaseInCustomerDepositsAndInterbankDeposits());
			statement.setDouble(3, cs.getNetIncreaseInBorrowingFromTheCentralBank());
			statement.setDouble(4, cs.getNetIncreaseInBorrowingFundsFromOtherFinancialInstitutions());
			statement.setDouble(5, cs.getCashReceivedFromPremiumOfOriginalInsuranceContract());
			statement.setDouble(6, cs.getReceiptOfReinsuranceNetCash());
			statement.setDouble(7, cs.getNetIncreaseInDepositsFromPolicyholders());
			statement.setDouble(8, cs.getCashChargeInterestFeesAndCommissions());
			statement.setDouble(9, cs.getNetIncreaseInBorrowedFunds());
			statement.setDouble(10, cs.getNetIncreaseInRepurchaseBusinessFunds());
			statement.setDouble(11, cs.getNetCashReceivedFromProxyTradingOfSecurities());
			statement.setDouble(12, cs.getRefundsOfTaxes());
			statement.setDouble(13, cs.getOtherCashReceivedRelatingToOperatingActivities());
			statement.setDouble(14, cs.getBusinessActivitiesSubtotalOfCashInflows());
			statement.setDouble(15, cs.getCashPaidForPurchasingGoodsAndReceivingServices());
			statement.setDouble(16, cs.getNetIncreaseInCustomerLoansAndAdvances());
			statement.setDouble(17, cs.getNetIncreaseInDepositsWithCentralBanksAndInterbankFunds());
			statement.setDouble(18, cs.getPaymentOfTheOriginalInsuranceContractToPayTheAmountOfCash());
			statement.setDouble(19, cs.getNetIncreaseInLendingFunds());
			statement.setDouble(20, cs.getCashPaidForInterestHandlingFeesAndCommissions());
			statement.setDouble(21, cs.getCashPaidForPolicyDividends());
			statement.setDouble(22, cs.getCashPaidToAndOnBehalfOfEmployees());
			statement.setDouble(23, cs.getTaxesPaid());
			statement.setDouble(24, cs.getPaymentOfOtherCashRelatedToOperatingActivities());
			statement.setDouble(25, cs.getSubtotalOfCashOutflowsFromOperatingActivities());
			statement.setDouble(26, cs.getNetCashFlowFromOperating());
			statement.setDouble(27, cs.getCashReceivedFromInvestmentRecovery());
			statement.setDouble(28, cs.getCashReceivedFromObtainingInvestmentReturns());
			statement.setDouble(29, cs.getNetCashReceivedFromDisposalOfFixedIntangibleOtherLongTermAssets());
			statement.setDouble(30, cs.getNetCashReceivedFromDisposalOfSubsidiariesAndOtherOperatingUnits());
			statement.setDouble(31, cs.getReceivedOtherCashRelatedToInvestmentActivities());
			statement.setDouble(32, cs.getSubtotalOfCashInflowsFromInvestmentActivities());
			statement.setDouble(33, cs.getCashPaidForPurchaseConstructionFixedIntangibleLongTermAssets());
			statement.setDouble(34, cs.getCashPaidForInvestment());
			statement.setDouble(35, cs.getNetIncreaseInPledgedLoans());
			statement.setDouble(36, cs.getNetCashPaidToSubsidiariesAndOtherBusinessUnits());
			statement.setDouble(37, cs.getPaymentOfOtherCashRelatedToInvestmentActivities());
			statement.setDouble(38, cs.getSubtotalOfCashOutflowsFromInvestmentActivities());
			statement.setDouble(39, cs.getNetCashFlowGeneratedFromInvestmentActivities());
			statement.setDouble(40, cs.getCashReceivedFromAbsorbingInvestments());
			statement.setDouble(41, cs.getCashReceivedFromMinorityInvestmentInSubsidiaries());
			statement.setDouble(42, cs.getCashReceivedFromObtainingLoans());
			statement.setDouble(43, cs.getReceivedOtherCashRelatedToFinancingActivities());
			statement.setDouble(44, cs.getSubtotalOfCashInflowsFromFinancingActivities());
			statement.setDouble(45, cs.getCashRepaymentsOfAmountsBorrowed());
			statement.setDouble(46, cs.getCashPaidForDistributingDividendsProfitsPayingInterest());
			statement.setDouble(47, cs.getDividendsAndProfitsAaidBySubsidiariesToMinorityShareholders());
			statement.setDouble(48, cs.getPaymentOfOtherCashRelatedToFinancingActivities());
			statement.setDouble(49, cs.getSubtotalOfCashOutflowsFromFinancingActivities());
			statement.setDouble(50, cs.getNetCashFlowGeneratedFromFinancingActivities());
			statement.setDouble(51, cs.getTheImpactOfExchangeRateFluctuationsOnCashAndCashEquivalents());
			statement.setDouble(52, cs.getNetIncreaseInCashAndCashEquivalents());
			statement.setDouble(53, cs.getOpeningCashAndCashEquivalentsBalance());
			statement.setDouble(54, cs.getClosingBalanceOfCashAndCashEquivalents());
			statement.setString(55, cs.getUpdateDateTime());
		statement.executeUpdate();
	    return true; // 修改成功，返回true
	}catch (SQLException e) {
	    e.printStackTrace();
	    return false; // 修改失败，返回false
	}
	}
	
	public boolean updateCashflowSupplement(CashflowSupplement cfs) {
		String sql = "UPDATE fr_cashflowsupplement SET impairmentOfAssets=?, depreciation=?, depreciationOfRightOfUseAssets=?, amortizationOfIntangibleAssets=?, "
	            + "amortizationOfLongTermDeferredExpenses=?, lossOnDisposalOfAssets=?, lossesOnScrappingOfFixedAssets=?, lossFromChangesInFairValue=?, "
	            + "financialExpenses=?, investmentLosses=?, decreaseInDeferredIncomeTaxAssets=?, increaseInDeferredIncomeTaxLiabilities=?, reductionOfInventory=?, "
	            + "reductionOfOperatingReceivables=?, increaseInOperationalPayables=?, conversionOfDebtIntoCapital=?, convertibleCorporatebondsDueWithinOneYear=?, "
	            + "fixedAssetsUnderFinancingLease=? ,upDateTime=? WHERE financialReportingNo='"+cfs.getFinancialReportingNo()+"'";		
		
		try(PreparedStatement statement = con.prepareStatement(sql)){
			statement.setDouble(1,cfs.getImpairmentOfAssets());
			statement.setDouble(2,cfs.getDepreciation());
			statement.setDouble(3,cfs.getDepreciationOfRightOfUseAssets());
			statement.setDouble(4,cfs.getAmortizationOfIntangibleAssets());
			statement.setDouble(5,cfs.getAmortizationOfLongTermDeferredExpenses());
			statement.setDouble(6,cfs.getLossOnDisposalOfAssets());
			statement.setDouble(7,cfs.getLossesOnScrappingOfFixedAssets());
			statement.setDouble(8,cfs.getLossFromChangesInFairValue());
			statement.setDouble(9,cfs.getFinancialExpenses());
			statement.setDouble(10,cfs.getInvestmentLosses());
			statement.setDouble(11,cfs.getDecreaseInDeferredIncomeTaxAssets());
			statement.setDouble(12,cfs.getIncreaseInDeferredIncomeTaxLiabilities());
			statement.setDouble(13,cfs.getReductionOfInventory());
			statement.setDouble(14, cfs.getReductionOfOperatingReceivables());
			statement.setDouble(15,cfs.getIncreaseInOperationalPayables());
			statement.setDouble(16,cfs.getConversionOfDebtIntoCapital());
			statement.setDouble(17,cfs.getConvertibleCorporatebondsDueWithinOneYear());
			statement.setDouble(18,cfs.getFixedAssetsUnderFinancingLease());
			statement.setString(19,cfs.getUpdateDateTime());
			statement.executeUpdate();
	    return true; // 修改成功，返回true
	}catch (SQLException e) {
	    e.printStackTrace();
	    return false; // 修改失败，返回false
	}
	}


}
