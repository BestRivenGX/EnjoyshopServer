package com.liuyanzhao.sens.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

import java.io.Serializable;

/**r
 *
 * 订单
 *
 */
@Data
@TableName("order")
public class Order implements Serializable {

    private static final long serialVersionUID = -5144055068797033748L;

    /**
     * 编号
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    private Long userId;

    /**
     * 价格
     */
    private Integer amount;

    /**
     * 商品JSON
     */
    private String itemJson;

    private Long addrId;

    private String payChannel;

}
