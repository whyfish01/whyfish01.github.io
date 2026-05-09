package com.analysis.company.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "reportsummary")
public class ReportSummary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "a_share_code", length = 10, nullable = false)
    private String aShareCode;

    @Column(name = "report_year", nullable = false)
    private Integer reportYear;

    @Column(name = "summary_type", length = 32, nullable = false)
    private String summaryType;

    @Column(name = "a_share_name", length = 64)
    private String aShareName;

    @Column(name = "summary", length = 2000)
    private String summary;

    @Column(name = "report_quarter", length = 2)
    private String reportQuarter;

    @Column(name = "create_time", nullable = false)
    private LocalDateTime createTime;

    @Column(name = "update_time", nullable = false)
    private LocalDateTime updateTime;
}