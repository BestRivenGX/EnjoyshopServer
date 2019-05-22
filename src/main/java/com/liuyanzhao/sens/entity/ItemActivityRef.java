package com.liuyanzhao.sens.entity;

import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @author 言曌
 * @date 2019-05-22 21:02
 */
@Data
@TableName("item_activity_ref")
public class ItemActivityRef implements Serializable {

    private static final long serialVersionUID = -5144055068797033748L;


    private Long item_id;

    private String activity_id;


}

