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
 * @TableName salary
 */
@TableName(value ="salary")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Salary implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 
     */
    private Integer employeeId;

    /**
     * 
     */
    private Date adjustDate;

    /**
     * 
     */
    private BigDecimal newSalary;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}