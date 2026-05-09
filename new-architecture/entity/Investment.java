package com.analysis.company.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 投资分析表
 */
@Data
@Entity
@Table(name = "investment")
public class Investment {

    /**
     * 预算编号（主键）
     */
    @Id
    @Column(name = "budget_id", length = 64, nullable = false)
    private String budgetId;

    /**
     * A股代码
     */
    @Column(name = "a_share_code", length = 10, nullable = false)
    private String aShareCode;

    /**
     * 企业名称
     */
    @Column(name = "a_share_name", length = 64)
    private String aShareName;

    /**
     * 财报年份
     */
    @Column(name = "report_year", nullable = false)
    private Integer reportYear;

    /**
     * 单价
     */
    private BigDecimal unitPrice;

    /**
     * 持股数量
     */
    private Integer stockNumber;

    /**
     * 总成本
     */
    private BigDecimal totalCost;

    /**
     * 每10股分红金额
     */
    private BigDecimal dividendPerTenShares;

    /**
     * 分红收益
     */
    private BigDecimal dividendIncome;

    /**
     * 股息率
     */
    private BigDecimal dividendYield;

    /**
     * 预估总成本
     */
    private BigDecimal estimatedTotalCost;

    /**
     * 预估单价
     */
    private BigDecimal estimatedUnitPrice;

    /**
     * 当前总成本
     */
    private BigDecimal currentTotalCost;

    /**
     * 当前单价
     */
    private BigDecimal currentUnitPrice;

    /**
     * 公允价值变动收益
     */
    private BigDecimal fairValueChangeIncome;

    /**
     * 是否卖出（YES/NO）
     */
    @Column(name = "whether_to_sell", length = 8)
    private String whetherToSell;

    /**
     * 卖出时间
     */
    @Column(name = "sell_time", length = 16)
    private String sellTime;

    /**
     * 卖出数量
     */
    private Integer sellNumbers;

    /**
     * 卖出价格
     */
    private BigDecimal sellPrice;

    /**
     * 实际收益
     */
    private BigDecimal realReturn;

    /**
     * 实际收益率
     */
    private BigDecimal realReturnRate;

    /**
     * 财报季度（Q1/Q2/Q3/Q4）
     */
    @Column(name = "report_quarter", length = 2)
    private String reportQuarter;

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