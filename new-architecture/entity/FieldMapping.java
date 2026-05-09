package com.analysis.company.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

/**
 * 字段映射表
 * 用于记录数据表字段的新旧映射关系
 */
@Data
@Entity
@Table(name = "field_mapping")
public class FieldMapping {

    /**
     * 主键ID（自增）
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 表名
     */
    @Column(name = "table_name", length = 64, nullable = false)
    private String tableName;

    /**
     * 旧字段名
     */
    @Column(name = "old_field", length = 64, nullable = false)
    private String oldField;

    /**
     * 新字段名
     */
    @Column(name = "new_field", length = 64, nullable = false)
    private String newField;

    /**
     * 数据类型（如VARCHAR、BIGDECIMAL、INT等）
     */
    @Column(name = "data_type", length = 32, nullable = false)
    private String dataType;

    /**
     * 是否可为空（YES/NO）
     */
    @Column(name = "nullable", length = 8, nullable = false)
    private String nullable;

    /**
     * 字段说明/备注
     */
    @Column(name = "comment", length = 255)
    private String comment;

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