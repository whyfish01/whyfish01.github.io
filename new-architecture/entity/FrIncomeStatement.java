package com.analysis.company.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 利润表
 */
@Data
@Entity
@Table(name = "fr_income_statement")
public class FrIncomeStatement {

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
     * 一、营业总收入
     */
    private BigDecimal grossRevenue;

    /**
     * 其中：营业收入
     */
    private BigDecimal operatingRevenue;

    /**
     * 利息收入
     */
    private BigDecimal interestIncome;

    /**
     * 已赚保费
     */
    private BigDecimal earnedPremium;

    /**
     * 手续费及佣金收入
     */
    private BigDecimal feeCommissionIncome;

    /**
     * 二、营业总成本
     */
    private BigDecimal totalOperatingCost;

    /**
     * 其中：营业成本
     */
    private BigDecimal operatingCosts;

    /**
     * 利息支出
     */
    private BigDecimal interestExpense;

    /**
     * 手续费及佣金支出
     */
    private BigDecimal handlingFeesCommissionExp;

    /**
     * 退保金
     */
    private BigDecimal surrender;

    /**
     * 赔付支出净额
     */
    private BigDecimal netCompensationExp;

    /**
     * 保单红利支出
     */
    private BigDecimal dividendPolicyExp;

    /**
     * 提取保险责任合同准备金净额
     */
    private BigDecimal withdrawInsuranceReserve;

    /**
     * 分保费用
     */
    private BigDecimal reinsuranceExp;

    /**
     * 税金及附加
     */
    private BigDecimal taxesSurcharges;

    /**
     * 销售费用
     */
    private BigDecimal sellingExpenses;

    /**
     * 管理费用
     */
    private BigDecimal overhead;

    /**
     * 研发费用
     */
    private BigDecimal researchDevelopment;

    /**
     * 财务费用
     */
    private BigDecimal financialExpenses;

    /**
     * 其中：利息费用
     */
    private BigDecimal financialExpInterest;

    /**
     * 利息收入
     */
    private BigDecimal financialExpInterestIncome;

    /**
     * 加：其他收益
     */
    private BigDecimal otherIncome;

    /**
     * 投资收益（损失以“－”号填 列）
     */
    private BigDecimal incomeInvestment;

    /**
     * 其中：对联营企业和合营企业的投资收益
     */
    private BigDecimal investmentIncomeAssociates;

    /**
     * 汇兑收益（损失以“-”号填列）
     */
    private BigDecimal exchangeGains;

    /**
     * 以摊余成本计量的金融资产终止确认收益
     */
    private BigDecimal derecognitionFinancialAssetsIncome;

    /**
     * 净敞口套期收益（损失以 “－”号填列）
     */
    private BigDecimal netHedgingIncome;

    /**
     * 公允价值变动收益（损失以 “－”号填列）
     */
    private BigDecimal fairValueChangeIncome;

    /**
     * 信用减值损失（损失以“-”号 填列）
     */
    private BigDecimal creditImpairmentLoss;

    /**
     * 资产减值损失（损失以“-”号 填列）
     */
    private BigDecimal impairmentLoss;

    /**
     * 资产处置收益（损失以“-”号 填列）
     */
    private BigDecimal assetDisposalIncome;

    /**
     * 三、营业利润（亏损以“－”号填列）
     */
    private BigDecimal operatingProfit;

    /**
     *  营业外收入
     */
    private BigDecimal nonOperatingIncome;

    /**
     * 减：营业外支出
     */
    private BigDecimal nonOperatingExpenses;

    /**
     * 四、利润总额（亏损总额以“－”号填列）
     */
    private BigDecimal totalProfit;

    /**
     * 减：所得税费用
     */
    private BigDecimal incomeTaxExpense;

    /**
     * 五、净利润（净亏损以“－”号填列）
     */
    private BigDecimal netProfit;

    /**
     * 1.持续经营净利润（净亏损以“－”号填列）
     */
    private BigDecimal netProfitContinuing;

    /**
     * 2.终止经营净利润（净亏损以“－”号填列）
     */
    private BigDecimal netProfitDiscontinued;

    /**
     * 1.归属于母公司股东的净利润
     */
    private BigDecimal netProfitParent;

    /**
     * 2.少数股东损益
     */
    private BigDecimal minorityInterest;

    /**
     * 六、其他综合收益的税后净额
     */
    private BigDecimal otherCompIncomeAfterTax;

    /**
     * （一）不能重分类进损益的其他综合收益
     */
    private BigDecimal otherCompIncomeNoReclass;

    /**
     * 1.重新计量设定受益计划变动额
     */
    private BigDecimal definedBenefitPlanChange;

    /**
     * 2.权益法下不能转损益的其他综合收益
     */
    private BigDecimal equityMethodOtherIncomeNo;

    /**
     * 3.其他权益工具投资公允价值变动
     */
    private BigDecimal otherEquityInvestmentFvChange;

    /**
     * 4.企业自身信用风险公允价值变动
     */
    private BigDecimal ownCreditRiskFvChange;

    /**
     * 5.其他
     */
    private BigDecimal others;

    /**
     * （二）将重分类进损益的其他综合收益
     */
    private BigDecimal otherCompIncomeReclass;

    /**
     * 1.权益法下可转损益的其他综合收益
     */
    private BigDecimal equityMethodOtherIncomeYes;

    /**
     * 2.其他债权投资公允价值变动
     */
    private BigDecimal otherDebtInvestmentFvChange;

    /**
     * 3.金融资产重分类计入其他综合收益的金额
     */
    private BigDecimal financialAssetsReclassOtherComp;

    /**
     * 4.其他债权投资信用减值准备
     */
    private BigDecimal otherDebtInvestmentProvision;

    /**
     * 5.现金流量套期储备
     */
    private BigDecimal cashFlowHedgeReserve;

    /**
     * 6.外币财务报表折算差额
     */
    private BigDecimal currencyTranslationDiff;

    /**
     * 7.其他
     */
    private BigDecimal others1;

    /**
     * 归属于少数股东的其他综合收益的税后净额
     */
    private BigDecimal otherCompIncomeMinorityAfterTax;

    /**
     * 七、综合收益总额
     */
    private BigDecimal totalComprehensiveIncome;

    /**
     * 归属于母公司所有者的综合收益总额
     */
    private BigDecimal totalComprehensiveIncomeParent;

    /**
     * 归属于少数股东的综合收益总额
     */
    private BigDecimal totalComprehensiveIncomeMinority;

    /**
     * （一）基本每股收益
     */
    private BigDecimal basicEps;

    /**
     * （二）稀释每股收益
     */
    private BigDecimal dilutedEps;

    /**
     * 净资产收益率（无需导入，公式计算）
     */
    private BigDecimal roe;

    /**
     * 财报披露分红金额（无需导入，前台导入）
     */
    private BigDecimal financialReportDividends;

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