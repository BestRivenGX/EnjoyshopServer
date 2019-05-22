package com.liuyanzhao.sens.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

import java.io.Serializable;

/**
 *
 * 地址
 *
 */
@Data
@TableName("address")
public class Address implements Serializable {

    private static final long serialVersionUID = -5144055068797033748L;

    /**
     * 编号
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    private Long userId;

    /**
     * 收件人
     */
    private String consignee;

    private String phone;

    private String addr;

    private String zipCode;

    private Boolean isDefault;



}
