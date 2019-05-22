package com.liuyanzhao.sens.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

import java.io.Serializable;

/**
 *
 * 商品
 *
 */
@Data
@TableName("item")
public class Item implements Serializable {

    private static final long serialVersionUID = -5144055068797033748L;

    /**
     * 编号
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    private String name;

    private String imgUrl;

    private String description;

    private Integer price;


}
