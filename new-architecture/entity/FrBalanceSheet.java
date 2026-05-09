package com.analysis.company.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 资产负债表
 */
@Data
@Entity
@Table(name = "fr_balancesheet")
public class FrBalanceSheet {

    /**
     * 财报编号（主键）
     */
    @Id
    @Column(name = "report_no", length = 100, nullable = false)  // 从20改成100
    private String reportNo;

    /**
     * A股代码
     */
    @Column(name = "a_share_code", length = 10, nullable = false)
    private String aShareCode;

    /**
     * 财报年份
     */
    @Column(name = "report_year", nullable = false)
    private Integer reportYear;

    /**
     * 财报季度（Q1/Q2/Q3/Q4）
     */
    @Column(name = "report_quarter", length = 2)
    private String reportQuarter;

    /**
     * 货币资金
     */
    private BigDecimal monetaryCap;

    /**
     * 结算备付金
     */
    private BigDecimal settlementProvisions;

    /**
     * 拆出资金
     */
    private BigDecimal lendingFunds;

    /**
     * 交易性金融资产
     */
    private BigDecimal tradingFinancialAssets;

    /**
     * 交易性金融资产
     */
    private BigDecimal tradingFinancialAssetsMgt;

    /**
     * 衍生金融资产
     */
    private BigDecimal derivativeFinancialAssets;

    /**
     * 应收票据
     */
    private BigDecimal billReceivable;

    /**
     * 应收账款
     */
    private BigDecimal accountsReceivable;

    /**
     * 应收款项融资
     */
    private BigDecimal accountsReceivableFinancing;

    /**
     * 预付款项
     */
    private BigDecimal prepayments;

    /**
     * 应收保费
     */
    private BigDecimal premiumReceivable;

    /**
     * 应收分保账款
     */
    private BigDecimal accountsReceivableReinsurance;

    /**
     * 应收分保合同准备金
     */
    private BigDecimal receivableReserveReinsurance;

    /**
     * 其他应收款
     */
    private BigDecimal otherReceivables;

    /**
     * 其中：应收利息
     */
    private BigDecimal interestReceivable;

    /**
     * 应收股利
     */
    private BigDecimal dividendReceivable;

    /**
     * 买入返售金融资产
     */
    private BigDecimal buyingBackFinancialAssets;

    /**
     * 存货
     */
    private BigDecimal inventory;

    /**
     * 合同资产
     */
    private BigDecimal contractAssets;

    /**
     * 持有待售资产
     */
    private BigDecimal assetsHeldForSale;

    /**
     * 一年内到期的非流动资产
     */
    private BigDecimal nonCurrentAssetsDueWithinOneYear;

    /**
     * 其他流动资产
     */
    private BigDecimal otherCurrentAssets;

    /**
     * 其他流动资产（理财部分，无需导入，前台录入）
     */
    private BigDecimal otherCurrentAssetsMgt;

    /**
     * 流动资产合计
     */
    private BigDecimal totalCurrentAssets;

    /**
     * 发放贷款和垫款
     */
    private BigDecimal grantingLoansAdvances;

    /**
     * 债权投资
     */
    private BigDecimal debtInvestment;

    /**
     * 其他债权投资（无需导入，前台录入）
     */
    private BigDecimal otherDebtInvestment;

    /**
     * 长期应收款
     */
    private BigDecimal longTermReceivables;

    /**
     * 长期股权投资
     */
    private BigDecimal longTermEquityInvestment;

    /**
     * 其他权益工具投资
     */
    private BigDecimal otherEquityInvestments;

    /**
     * 其他非流动金融资产
     */
    private BigDecimal otherNonCurrentFinancialAssets;

    /**
     * 投资性房地产
     */
    private BigDecimal investmentRealEstate;

    /**
     * 固定资产
     */
    private BigDecimal fixedAssets;

    /**
     * 在建工程
     */
    private BigDecimal constructionInProgress;

    /**
     * 生产性生物资产
     */
    private BigDecimal productiveBiologicalAssets;

    /**
     * 油气资产
     */
    private BigDecimal oilGasAssets;

    /**
     * 使用权资产
     */
    private BigDecimal rightOfUseAssets;

    /**
     * 无形资产
     */
    private BigDecimal intangibleAssets;

    /**
     * 开发支出
     */
    private BigDecimal developmentExpenditure;

    /**
     * 商誉
     */
    private BigDecimal goodwill;

    /**
     * 长期待摊费用
     */
    private BigDecimal longTermDeferredExpense;

    /**
     * 递延所得税资产
     */
    private BigDecimal deferredTaxAssets;

    /**
     * 其他非流动资产
     */
    private BigDecimal otherNonCurrentAssets;

    /**
     * 非流动资产合计
     */
    private BigDecimal totalNonCurrentAssets;

    /**
     * 资产总计
     */
    private BigDecimal totalAssets;

    /**
     * 与主业无关的长期股权投资（无需导入，前台录入）
     */
    private BigDecimal longTermEquityInvestmentsUnrelated;

    /**
     * 长期股权投资收益（无需导入，前台录入）
     */
    private BigDecimal incomeLongTermEquityInvestments;

    /**
     * 短期借款
     */
    private BigDecimal shortTermBorrowing;

    /**
     * 向中央银行借款
     */
    private BigDecimal borrowingCentralBank;

    /**
     * 拆入资金
     */
    private BigDecimal borrowingFunds;

    /**
     * 交易性金融负债
     */
    private BigDecimal tradingFinancialLiabilities;

    /**
     * 衍生金融负债
     */
    private BigDecimal derivativeFinancialLiabilities;

    /**
     * 应付票据
     */
    private BigDecimal notesPayable;

    /**
     * 应付账款
     */
    private BigDecimal accountsPayable;

    /**
     * 预收款项
     */
    private BigDecimal advanceReceipts;

    /**
     * 合同负债
     */
    private BigDecimal contractLiabilities;

    /**
     * 卖出回购金融资产款
     */
    private BigDecimal financialAssetsSoldRepurchase;

    /**
     * 吸收存款及同业存放
     */
    private BigDecimal depositAbsorptionInterbank;

    /**
     * 代理买卖证券款
     */
    private BigDecimal actingTradingSecurities;

    /**
     * 代理承销证券款
     */
    private BigDecimal actingUnderwritingSecurities;

    /**
     * 应付职工薪酬
     */
    private BigDecimal payrollPayable;

    /**
     * 员工总人数（无需导入，前台录入）
     */
    private Integer totalPeople;

    /**
     * 应交税费
     */
    private BigDecimal taxPayable;

    /**
     * 其他应付款
     */
    private BigDecimal otherPayables;

    /**
     * 其中：应付利息
     */
    private BigDecimal interestPayable;

    /**
     * 应付股利
     */
    private BigDecimal dividendPayable;

    /**
     * 应付手续费及佣金
     */
    private BigDecimal payableHandlingFeesCommissions;

    /**
     * 应付分保账款
     */
    private BigDecimal accountsPayableReinsurance;

    /**
     * 持有待售负债
     */
    private BigDecimal heldForSaleLiabilities;

    /**
     * 一年内到期的非流动负债
     */
    private BigDecimal nonCurrentLiabilitiesDueOneYear;

    /**
     * 其他流动负债
     */
    private BigDecimal otherCurrentLiabilities;

    /**
     * 流动负债合计
     */
    private BigDecimal totalCurrentLiabilities;

    /**
     * 保险合同准备金
     */
    private BigDecimal insuranceContractReserves;

    /**
     * 长期借款
     */
    private BigDecimal longTermLoan;

    /**
     * 应付债券
     */
    private BigDecimal bondsPayable;

    /**
     * 其中：优先股
     */
    private BigDecimal bondsPayablePreferred;

    /**
     * 永续债
     */
    private BigDecimal bondsPayablePerpetual;

    /**
     * 长期应付款
     */
    private BigDecimal longTermPayables;

    /**
     * 长期应付款（优先股）
     */
    private BigDecimal longTermPayablesPreferred;

    /**
     * 长期应付款（永续债）
     */
    private BigDecimal longTermPayablesPerpetual;

    /**
     * 专项应付款
     */
    private BigDecimal specialPayables;

    /**
     * 预计负债
     */
    private BigDecimal estimatedLiabilities;

    /**
     * 递延收益
     */
    private BigDecimal deferredIncome;

    /**
     * 递延所得税负债
     */
    private BigDecimal deferredTaxLiabilities;

    /**
     * 其他非流动负债
     */
    private BigDecimal otherNonCurrentLiabilities;

    /**
     * 非流动负债合计
     */
    private BigDecimal totalNonCurrentLiabilities;

    /**
     * 负债合计
     */
    private BigDecimal totalLiabilities;

    /**
     * 股本
     */
    private BigDecimal paidInCapitalOrdinary;

    /**
     * 其他权益工具
     */
    private BigDecimal paidInCapitalPreferred;

    /**
     * 其中：优先股
     */
    private BigDecimal otherEquityInstrumentsPreferred;

    /**
     * 永续债
     */
    private BigDecimal otherEquityInstrumentsPerpetual;

    /**
     * 资本公积
     */
    private BigDecimal capitalReserve;

    /**
     * 减：库存股
     */
    private BigDecimal lessTreasuryStock;

    /**
     * 其他综合收益
     */
    private BigDecimal otherComprehensiveIncome;

    /**
     * 专项储备
     */
    private BigDecimal specialReserve;

    /**
     * 盈余公积
     */
    private BigDecimal surplusReserve;

    /**
     * 一般风险准备
     */
    private BigDecimal generalRiskReserve;

    /**
     * 未分配利润
     */
    private BigDecimal undistributedProfits;

    // ===================== 你新增的 2 个字段 =====================

    /**
     * 归属于母公司所有者权益合计
     */
    private BigDecimal totalOwnersEquityParent;


    /**
     * 少数股东权益
     */

    private BigDecimal minorityInterest;


    // ==========================================================

    /**
     * 所有者权益合计
     */
    private BigDecimal totalOwnersEquity;

    /**
     * 负债和所有者权益总计
     */
    private BigDecimal totalLiabilitiesOwnersEquity;

    /**
     * 创建时间
     */
    @Column(name = "create_time", nullable = false)
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time", nullable = false)
    private LocalDateTime updateTime;
}