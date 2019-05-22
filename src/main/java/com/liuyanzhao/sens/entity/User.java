package com.liuyanzhao.sens.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.io.Serializable;

/**
 *
 * 用户
 *
 */
@Data
@TableName("user")
public class User implements Serializable {

    private static final long serialVersionUID = -5144055068797033748L;

    /**
     * 编号
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 手机
     */
    private String mobi;

    /**
     * Email
     */
    private String email;

    /**
     * 密码
     */
    @JsonIgnore
    private String password;


    /**
     * 用户名
     */
    private String username;

    /**
     * 头像URL
     */
    private String logoUrl;

    /**
     * token
     */
    @JsonIgnore
    private String token;

}
