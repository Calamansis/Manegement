package com.example.demo.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @TableName employee
 */
@TableName(value ="employee")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private String gender;

    /**
     * 
     */
    private Integer age;

    /**
     * 
     */
    private String marry;

    /**
     * 
     */
    private String contact;

    /**
     * 
     */
    private String education;

    /**
     * 
     */
    private String title;

    /**
     * 
     */
    private BigDecimal salary;

    /**
     * 
     */
    private Integer departmentId;

    /**
     * 
     */
    private Date joinDate;

    /**
     * 
     */
    private Date leaveDate;

    /**
     * 
     */
    private String assessmentResult;

    /**
     * 0停用 1启用
     */
    private Integer retireStatus;

    /**
     * 
     */
    private String resume;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}