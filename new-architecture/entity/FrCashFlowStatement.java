package com.analysis.company.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 现金流量表
 */
@Data
@Entity
@Table(name = "fr_cashflowstatement")
public class FrCashFlowStatement {

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
     * 销售商品、提供劳务收到的现金
     */
    private BigDecimal cashSellGoodsServices;

    /**
     * 客户存款和同业存放款项净增加额
     */
    private BigDecimal netIncCustomerDeposits;

    /**
     * 向中央银行借款净增加额
     */
    private BigDecimal netIncCentralBankBorrow;

    /**
     * 向其他金融机构拆入资金净增加额
     */
    private BigDecimal netIncOtherFinancialInstBorrow;

    /**
     * 收到原保险合同保费取得的现金
     */
    private BigDecimal cashOriginalInsurancePremium;

    /**
     * 收到再保业务现金净额
     */
    private BigDecimal cashReinsuranceNet;

    /**
     * 保户储金及投资款净增加额
     */
    private BigDecimal netIncPolicyholderDeposits;

    /**
     * 收取利息、手续费及佣金的现金
     */
    private BigDecimal cashInterestFeeCommission;

    /**
     * 拆入资金净增加额
     */
    private BigDecimal netIncBorrowedFunds;

    /**
     * 回购业务资金净增加额
     */
    private BigDecimal netIncRepurchaseFunds;

    /**
     * 代理买卖证券收到的现金净额
     */
    private BigDecimal netCashSecuritiesProxyTrade;

    /**
     * 收到的税费返还
     */
    private BigDecimal taxRefunds;

    /**
     * 收到其他与经营活动有关的现金
     */
    private BigDecimal otherCashOperatingActivities;

    /**
     * 经营活动现金流入小计
     */
    private BigDecimal subtotalInflowOperating;

    /**
     * 购买商品、接受劳务支付的现金
     */
    private BigDecimal cashPurchaseGoodsServices;

    /**
     * 客户贷款及垫款净增加额
     */
    private BigDecimal netIncCustomerLoansAdvances;

    /**
     * 存放中央银行和同业款项净增加额
     */
    private BigDecimal netIncCentralBankDeposits;

    /**
     * 支付原保险合同赔付款项的现金
     */
    private BigDecimal cashOriginalInsurancePayout;

    /**
     * 拆出资金净增加额
     */
    private BigDecimal netIncLendingFunds;

    /**
     * 支付利息、手续费及佣金的现金
     */
    private BigDecimal cashInterestFeeCommissionPaid;

    /**
     * 支付保单红利的现金
     */
    private BigDecimal cashPolicyDividendPaid;

    /**
     * 支付给职工以及为职工支付的现金
     */
    private BigDecimal cashToEmployees;

    /**
     * 支付的各项税费
     */
    private BigDecimal taxesPaid;

    /**
     * 支付其他与经营活动有关的现金
     */
    private BigDecimal otherCashPaidOperating;

    /**
     * 经营活动现金流出小计
     */
    private BigDecimal subtotalOutflowOperating;

    /**
     * 经营活动产生的现金流量净额
     */
    private BigDecimal netCashOperating;

    /**
     * 收回投资收到的现金
     */
    private BigDecimal cashRecoveryInvestment;

    /**
     * 取得投资收益收到的现金
     */
    private BigDecimal cashInvestmentReturns;

    /**
     * 处置固定资产、无形资产和其他长期资产收回的现金净额
     */
    private BigDecimal netCashDisposeLongAssets;

    /**
     * 处置子公司及其他营业单位收到的现金净额
     */
    private BigDecimal netCashDisposeSubsidiaries;

    /**
     * 收到其他与投资活动有关的现金
     */
    private BigDecimal otherCashInvestmentActivities;

    /**
     * 投资活动现金流入小计
     */
    private BigDecimal subtotalInflowInvestment;

    /**
     * 购建固定资产、无形资产和其他长期资产支付的现金
     */
    private BigDecimal cashPurchaseLongAssets;

    /**
     * 投资支付的现金
     */
    private BigDecimal cashPaidInvestment;

    /**
     * 质押贷款净增加额
     */
    private BigDecimal netIncPledgedLoans;

    /**
     * 取得子公司及其他营业单位支付的现金净额
     */
    private BigDecimal netCashAcquireSubsidiaries;

    /**
     * 支付其他与投资活动有关的现金
     */
    private BigDecimal otherCashPaidInvestment;

    /**
     * 投资活动现金流出小计
     */
    private BigDecimal subtotalOutflowInvestment;

    /**
     * 投资活动产生的现金流量净额
     */
    private BigDecimal netCashInvestment;

    /**
     * 吸收投资收到的现金
     */
    private BigDecimal cashAbsorbInvestment;

    /**
     * 其中：子公司吸收少数股东投资收到的现金
     */
    private BigDecimal cashMinorityInvestment;

    /**
     * 取得借款收到的现金
     */
    private BigDecimal cashObtainLoans;

    /**
     * 收到其他与筹资活动有关的现金
     */
    private BigDecimal otherCashFinancingActivities;

    /**
     * 筹资活动现金流入小计
     */
    private BigDecimal subtotalInflowFinancing;

    /**
     * 偿还债务支付的现金
     */
    private BigDecimal cashRepayDebt;

    /**
     * 分配股利、利润或偿付利息支付的现金
     */
    private BigDecimal cashDividendInterestPaid;

    /**
     * 其中：子公司支付给少数股东的股利、利润
     */
    private BigDecimal cashDividendMinorityShareholders;

    /**
     * 支付其他与筹资活动有关的现金
     */
    private BigDecimal otherCashPaidFinancing;

    /**
     * 筹资活动现金流出小计
     */
    private BigDecimal subtotalOutflowFinancing;

    /**
     * 筹资活动产生的现金流量净额
     */
    private BigDecimal netCashFinancing;

    /**
     * 四、汇率变动对现金及现金等价物的影响
     */
    private BigDecimal exchangeRateEffect;

    /**
     * 五、现金及现金等价物净增加额
     */
    private BigDecimal netIncCashEquivalents;

    /**
     * 加：期初现金及现金等价物余额
     */
    private BigDecimal openingCashBalance;

    /**
     * 六、期末现金及现金等价物余额
     */
    private BigDecimal closingCashBalance;

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