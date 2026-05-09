package com.analysis.company.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "fr_head")
@EntityListeners(AuditingEntityListener.class)
public class FrHead {

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
     * 审计意见
     */
    @Column(name = "audit_opinion", length = 255)
    private String auditOpinion;

    /**
     * 季度
     */
    @Column(name = "report_quarter", length = 2)
    private String reportQuarter;

    /**
     * 创建时间
     */
    @CreatedDate
    @Column(name = "create_time", updatable = false, nullable = false)
    private LocalDateTime createTime;

    /**
     * 最后修改时间
     */
    @LastModifiedDate
    @Column(name = "update_time", nullable = false)
    private LocalDateTime updateTime;
}