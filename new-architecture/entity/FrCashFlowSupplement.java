package com.analysis.company.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 现金流量表补充资料
 */
@Data
@Entity
@Table(name = "fr_cash_flow_supplement")
public class FrCashFlowSupplement {
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
     * 净利润
     */
    private BigDecimal netProfit;

    /**
     * 加：资产减值准备
     */
    private BigDecimal assetImpairmentProvision;

    /**
     * 其他调整项目
     */
    private BigDecimal otherAdjustmentItems;

    /**
     * 经营活动现金流量净额
     */
    private BigDecimal operatingCashFlowNet;

    /**
     * 资产减值损失
     */
    private BigDecimal assetImpairment;

    /**
     * 固定资产折旧、油气资产折耗、生产性生物资产折旧
     */
    private BigDecimal depreciation;

    /**
     * 使用权资产折旧
     */
    private BigDecimal rightUseAssetDepreciation;

    /**
     * 无形资产摊销
     */
    private BigDecimal intangibleAssetAmortization;

    /**
     * 长期待摊费用摊销
     */
    private BigDecimal longDeferredExpAmortization;

    /**
     * 处置固定资产、无形资产和其他长期资产的损失（收益以“－”号填列）
     */
    private BigDecimal assetDisposalLoss;

    /**
     * 固定资产报废损失（收益以“－”号填列）
     */
    private BigDecimal fixedAssetScrapLoss;

    /**
     * 公允价值变动损失（收益以“－”号填列）
     */
    private BigDecimal fairValueLoss;

    /**
     * 财务费用（收益以“－”号填列）
     */
    private BigDecimal financialExp;

    /**
     * 投资损失（收益以“－”号填列）
     */
    private BigDecimal investmentLoss;

    /**
     * 递延所得税资产减少（增加以“－”号填列）
     */
    private BigDecimal deferredTaxAssetDecrease;

    /**
     * 递延所得税负债增加（减少以“－”号填列）
     */
    private BigDecimal deferredTaxLiabilityIncrease;

    /**
     * 存货的减少（增加以“－”号填列）
     */
    private BigDecimal inventoryDecrease;

    /**
     * 经营性应收项目的减少（增加以“－”号填列）
     */
    private BigDecimal operatingReceivablesDecrease;

    /**
     * 经营性应付项目的增加（减少以“－”号填列）
     */
    private BigDecimal operatingPayablesIncrease;

    /**
     * 债务转为资本
     */
    private BigDecimal debtToCapital;

    /**
     * 一年内到期的可转换公司债券
     */
    private BigDecimal convertibleBondsDueOneYear;

    /**
     * 融资租入固定资产
     */
    private BigDecimal financeLeaseFixedAssets;

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