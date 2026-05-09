package com.analysis.company.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "reportstatistics")
public class ReportStatistics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "a_share_code", length = 10, nullable = false)
    private String aShareCode;

    @Column(name = "a_share_name", length = 64)
    private String aShareName;

    @Column(name = "report_year", nullable = false)
    private Integer reportYear;

    // 财务指标字段
    private BigDecimal totalAssets;
    private BigDecimal totalAssetsGrowthRate;
    private BigDecimal totalOwnersEquity;
    private BigDecimal equityMultiplier;
    private BigDecimal totalLiabilities;
    private BigDecimal assetLiabilityRatio;
    private BigDecimal monetaryCap;
    private BigDecimal shortTermBorrowing;
    private BigDecimal nonCurrentLiabilitiesDueOneYear;
    private BigDecimal longTermLoan;
    private BigDecimal bondsPayable;
    private BigDecimal longTermPayables;
    private BigDecimal interestBearingLiabilities;
    private BigDecimal debtRepaymentRisk;
    private BigDecimal tradingFinancialAssetsMgt;
    private BigDecimal otherCurrentAssetsMgt;
    private BigDecimal quasiMonetary;
    private BigDecimal shortTermForeignDebt;
    private BigDecimal shortTermDebtRepaymentRisk;
    private BigDecimal quasiMonetaryRatio;
    private BigDecimal notesPayable;
    private BigDecimal accountsPayable;
    private BigDecimal advanceReceipts;
    private BigDecimal totalPayablesPrepaid;
    private BigDecimal billReceivable;
    private BigDecimal accountsReceivable;
    private BigDecimal accountsReceivableFinancing;
    private BigDecimal contractAssets;
    private BigDecimal prepayments;
    private BigDecimal contractLiabilities;
    private BigDecimal totalReceivablesPrepayments;
    private BigDecimal occupyOthersFunds;
    private BigDecimal receivablesRatio;
    private BigDecimal fixedAssets;
    private BigDecimal constructionInProgress;
    private BigDecimal totalFixedAssets;
    private BigDecimal fixedAssetRatio;
    private BigDecimal tradingFinancialAssets;
    private BigDecimal otherNonCurrentFinancialAssets;
    private BigDecimal investmentRealEstate;
    private BigDecimal longTermEquityInvestment;
    private BigDecimal investmentAssetsSubtotal;
    private BigDecimal investmentAssetRatio;
    private BigDecimal intangibleAssets;
    private BigDecimal goodwill;
    private BigDecimal intangibleAssetRatio;
    private BigDecimal goodwillRatio;
    private BigDecimal payrollPayable;
    private BigDecimal cashToEmployees;
    private BigDecimal totalEmployeeCompensation;
    private Integer totalPeople;
    private BigDecimal perCapitaAnnualSalary;
    private BigDecimal perCapitaMonthlySalary;
    private BigDecimal operatingRevenue;
    private BigDecimal revenueGrowthRate;
    private BigDecimal totalAssetTurnover;
    private BigDecimal cashSellGoodsServices;
    private BigDecimal cashRevenueRatio;
    private BigDecimal otherReceivables;
    private BigDecimal inventory;
    private BigDecimal inventoryGrowthRate;
    private BigDecimal receivablesToAssetRatio;
    private BigDecimal prepaymentsToAssetRatio;
    private BigDecimal otherReceivablesToAssetRatio;
    private BigDecimal inventoryToAssetRatio;
    private BigDecimal operatingCosts;
    private BigDecimal grossMargin;
    private BigDecimal sellingExpenses;
    private BigDecimal salesExpenseRate;
    private BigDecimal overhead;
    private BigDecimal managementExpenseRate;
    private BigDecimal researchDevelopment;
    private BigDecimal rdRate;
    private BigDecimal financialExpenses;
    private BigDecimal expenseTotal;
    private BigDecimal expenseGrossMarginRatio;
    private BigDecimal taxesSurcharges;
    private BigDecimal fourExpenses;
    private BigDecimal totalProfit;
    private BigDecimal mainProfit;
    private BigDecimal mainProfitMargin;
    private BigDecimal mainProfitToTotalProfit;
    private BigDecimal operatingProfit;
    private BigDecimal operatingMargin;
    private BigDecimal netProfit;
    private BigDecimal netProfitGrowthRate;
    private BigDecimal netProfitMargin;
    private BigDecimal netCashOperating;
    private BigDecimal netCashOperatingGrowth;
    private BigDecimal netProfitCashRatio;
    private BigDecimal netProfitParent;
    private BigDecimal netProfitParentGrowth;
    private BigDecimal roe;
    private BigDecimal depreciation;
    private BigDecimal intangibleAmortization;
    private BigDecimal cashDividendInterestPaid;
    private BigDecimal remainingCash;
    private BigDecimal cashPurchaseLongAssets;
    private BigDecimal netCashDisposeLongAssets;
    private BigDecimal capitalExpenditureToOperatingCash;
    private BigDecimal disposeToPurchaseRatio;
    private BigDecimal financialReportDividends;
    private BigDecimal dividendRate;
    private BigDecimal netCashInvestment;
    private BigDecimal netCashFinancing;

    @Column(name = "company_type", length = 32)
    private String companyType;

    private BigDecimal netIncCashEquivalents;
    private BigDecimal netIncCashAddBonus;
    private BigDecimal closingCashBalance;

    @Column(name = "data_resource", length = 64)
    private String dataResource;

    @Column(name = "primary_industry", length = 64)
    private String primaryIndustry;

    @Column(name = "secondary_industry", length = 64)
    private String secondaryIndustry;

    @Column(name = "third_industry", length = 64)
    private String thirdIndustry;

    @Column(name = "region", length = 64)
    private String region;

    @Column(name = "report_quarter", length = 2)
    private String reportQuarter;

    @Column(name = "create_time", nullable = false)
    private LocalDateTime createTime;

    @Column(name = "update_time", nullable = false)
    private LocalDateTime updateTime;
}