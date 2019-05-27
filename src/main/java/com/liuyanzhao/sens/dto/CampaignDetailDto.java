package com.liuyanzhao.sens.dto;

import lombok.Data;

/**
 * @author 言曌
 * @date 2019-05-27 21:41
 */

@Data
public class CampaignDetailDto {

    private Long id;

    private String title;

    private CampaignSimpleDto cpOne;

    private CampaignSimpleDto cpTwo;

    private CampaignSimpleDto cpThree;

    public CampaignDetailDto() {
    }

    public CampaignDetailDto(Long id, String title, CampaignSimpleDto cpOne, CampaignSimpleDto cpTwo, CampaignSimpleDto cpThree) {
        this.id = id;
        this.title = title;
        this.cpOne = cpOne;
        this.cpTwo = cpTwo;
        this.cpThree = cpThree;
    }
}
