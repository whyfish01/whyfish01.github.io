package com.analysis.company.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 分红分析表
 */
@Data
@Entity
@Table(name = "dividendsanalysis")
public class DividendsAnalysis {

    /**
     * 财报编号（主键）
     */
    @Id
    @Column(name = "report_no", length = 50, nullable = false)  // 从20改成50
    private String reportNo;

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
     * 一级行业
     */
    @Column(name = "primary_industry", length = 64)
    private String primaryIndustry;

    /**
     * 二级行业
     */
    @Column(name = "secondary_industry", length = 64)
    private String secondaryIndustry;

    /**
     * 三级行业
     */
    @Column(name = "third_industry", length = 64)
    private String thirdIndustry;

    /**
     * 所属地区
     */
    @Column(name = "region", length = 64)
    private String region;

    /**
     * 股东权益
     */
    private BigDecimal equity;

    /**
     * 归属于母公司净利润
     */
    private BigDecimal netProfitParent;

    /**
     * 归属于母公司净利润增长率
     */
    private BigDecimal netProfitParentGrowth;

    /**
     * 可分配利润
     */
    private BigDecimal distributiveProfits;

    /**
     * 财报披露分红金额
     */
    private BigDecimal financialReportDividends;

    /**
     * 分红率
     */
    private BigDecimal dividendRate;

    /**
     * 每10股分红金额
     */
    private BigDecimal dividendPerTenShares;

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