package com.analysis.company.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

/**
 * 公司基本信息表
 */
@Data
@Entity
@Table(name = "companyinfo")
public class CompanyInfo {

    /**
     * A股代码（主键）
     */
    @Id
    @Column(name = "a_share_code", length = 10, nullable = false)
    private String aShareCode;

    /**
     * 公司全称
     */
    @Column(name = "company_name", length = 128)
    private String companyName;

    /**
     * 企业简称（A股名称）
     */
    @Column(name = "a_share_name", length = 64)
    private String aShareName;

    /**
     * 公司注册地址
     */
    @Column(name = "company_address", length = 255)
    private String companyAddress;

    /**
     * 所属地区
     */
    @Column(name = "region", length = 64)
    private String region;

    /**
     * 成立日期
     */
    @Column(name = "established_date", length = 16)
    private String establishedDate;

    /**
     * 上市类型
     */
    @Column(name = "listing_type", length = 32)
    private String listingType;

    /**
     * 上市日期
     */
    @Column(name = "listing_date", length = 16)
    private String listingDate;

    /**
     * 注册资本
     */
    @Column(name = "registered_capital", length = 64)
    private String registeredCapital;

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
     * 法定代表人
     */
    @Column(name = "legal_representative", length = 32)
    private String legalRepresentative;

    /**
     * 经营范围
     */
    @Column(name = "business_scope", length = 1000)
    private String businessScope;

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
