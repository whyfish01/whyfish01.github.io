package com.analysis.company.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

/**
 * 财报分析表
 */
@Data
@Entity
@Table(name = "reportanalysis")
public class ReportAnalysis {

    /**
     * 分析编号（主键）
     */
    @Id
    @Column(name = "analysis_id", length = 20, nullable = false)
    private String analysisId;

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
     * 指标名称
     */
    @Column(name = "indicator_name", length = 64)
    private String indicatorName;

    /**
     * 指标编号
     */
    @Column(name = "indicator_id", length = 20, nullable = false)
    private String indicatorId;

    /**
     * 统计等级
     */
    @Column(name = "statistics_grade", length = 32)
    private String statisticsGrade;

    /**
     * 异常分析
     */
    @Column(name = "abnormal_analysis", length = 1000)
    private String abnormalAnalysis;

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