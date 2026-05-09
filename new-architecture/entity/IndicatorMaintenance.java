package com.analysis.company.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

/**
 * 指标维护表
 * 用于管理财务分析指标的基础配置
 */
@Data
@Entity
@Table(name = "indicatormaintenance")
public class IndicatorMaintenance {

    /**
     * 指标编号（主键）
     */
    @Id
    @Column(name = "indicator_id", length = 20, nullable = false)
    private String indicatorId;

    /**
     * 指标名称
     */
    @Column(name = "indicator_name", length = 64, nullable = false)
    private String indicatorName;

    /**
     * 指标分类（如盈利能力、偿债能力、营运能力等）
     */
    @Column(name = "indicator_categories", length = 64)
    private String indicatorCategories;

    /**
     * 高质量边界（指标优质区间）
     */
    @Column(name = "high_quality_boundaries", length = 255)
    private String highQualityBoundaries;

    /**
     * 运算范围/计算规则
     */
    @Column(name = "scope_operation", length = 255)
    private String scopeOperation;

    /**
     * 指标说明
     */
    @Column(name = "indicator_desc", length = 1000)
    private String indicatorDesc;

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