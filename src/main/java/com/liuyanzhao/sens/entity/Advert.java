package com.liuyanzhao.sens.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

import java.io.Serializable;

/**
 *
 * 广告
 *
 */
@Data
@TableName("advert")
public class Advert implements Serializable {

    private static final long serialVersionUID = -5144055068797033748L;

    /**
     * 编号
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    private String name;

    private String imgUrl;

    private String description;

    /**
     * 广告类型：首页1，其他2
     */
    private Integer type;

    public Advert() {
    }

    public Advert(Long id, String name, String imgUrl, String description) {
        this.id = id;
        this.name = name;
        this.imgUrl = imgUrl;
        this.description = description;
    }
}
