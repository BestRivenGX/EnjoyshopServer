package com.liuyanzhao.sens.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

import java.io.Serializable;

/**
 *
 * 活动
 * @author 言曌
 * @date 2019-05-22 21:02
 */
@Data
@TableName("campaign")
public class Campaign implements Serializable {

    private static final long serialVersionUID = -5144055068797033748L;

    /**
     * 编号
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    private String title;

    private String cpOne;

    private String cpTwo;

    private String cpThree;

    public Campaign() {
    }

    public Campaign(Long id, String title, String cpOne, String cpTwo, String cpThree) {
        this.id = id;
        this.title = title;
        this.cpOne = cpOne;
        this.cpTwo = cpTwo;
        this.cpThree = cpThree;
    }
}

