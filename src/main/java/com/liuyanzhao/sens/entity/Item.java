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

    private Integer price;

    /**
     * 销量
     */
    private Integer sale = 0;

    private Long userId;


    /**
     * 分类Id
     */
    private Long categoryId = 1L;

    /**
     * 活动Id
     */
    private Long campaignId = 1L;

    public Item() {
    }

    public Item(String name, String imgUrl, Integer price, Long userId) {
        this.name = name;
        this.imgUrl = imgUrl;
        this.price = price;
        this.userId = userId;
    }

    public Item(String name, String imgUrl, Integer price, Long userId, Long categoryId, Long campaignId) {
        this.name = name;
        this.imgUrl = imgUrl;
        this.price = price;
        this.userId = userId;
        this.categoryId = categoryId;
        this.campaignId = campaignId;
    }
}
