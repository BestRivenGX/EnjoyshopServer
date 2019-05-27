package com.liuyanzhao.sens.dto;

import lombok.Data;

/**
 * @author 言曌
 * @date 2019-05-27 21:34
 */

@Data
public class CampaignSimpleDto {

    private Long id;

    private String title;

    private String imgUrl;


    public CampaignSimpleDto() {
    }

    public CampaignSimpleDto(Long id, String title, String imgUrl) {
        this.id = id;
        this.title = title;
        this.imgUrl = imgUrl;
    }
}
