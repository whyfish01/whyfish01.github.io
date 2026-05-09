package com.analysis.company.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

/**
 * 行业信息表
 */
@Data
@Entity
@Table(name = "industryinfo")
public class IndustryInfo {

    /**
     * 行业编号（主键）
     */
    @Id
    @Column(name = "industry_id", length = 10, nullable = false)
    private String industryId;

    /**
     * 一级行业名称
     */
    @Column(name = "primary_industry", length = 64)
    private String primaryIndustry;

    /**
     * 二级行业名称
     */
    @Column(name = "secondary_industry", length = 64)
    private String secondaryIndustry;

    /**
     * 三级行业名称
     */
    @Column(name = "third_industry", length = 64)
    private String thirdIndustry;

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