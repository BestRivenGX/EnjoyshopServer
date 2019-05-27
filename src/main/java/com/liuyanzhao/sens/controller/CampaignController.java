package com.liuyanzhao.sens.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.liuyanzhao.sens.dto.CampaignDetailDto;
import com.liuyanzhao.sens.dto.CampaignSimpleDto;
import com.liuyanzhao.sens.entity.Campaign;
import com.liuyanzhao.sens.service.CampaignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


/**
 * @author 言曌
 * @date 2019-05-22 21:55
 */

@RestController
@RequestMapping("/course_api")
public class CampaignController {

    @Autowired
    private CampaignService campaignService;

    /**
     * 活动列表
     *
     * @return
     */
    @GetMapping("/campaign/recommend")
    public List<CampaignDetailDto> list() {
        try {
            List<Campaign> campaigns = campaignService.findAll();
            //处理数据
            List<CampaignDetailDto> campaignDetailDtos = new ArrayList<>();
            for (int i = 0; i < campaigns.size(); i++) {
                CampaignDetailDto campaignDetailDto = new CampaignDetailDto();
                campaignDetailDto.setId(campaigns.get(i).getId());
                campaignDetailDto.setTitle(campaigns.get(i).getTitle());
                campaignDetailDto.setCpOne((JSON.parseObject(campaigns.get(i).getCpOne())).toJavaObject(CampaignSimpleDto.class));
                campaignDetailDto.setCpTwo((JSON.parseObject(campaigns.get(i).getCpTwo())).toJavaObject(CampaignSimpleDto.class));
                campaignDetailDto.setCpThree((JSON.parseObject(campaigns.get(i).getCpThree())).toJavaObject(CampaignSimpleDto.class));
                campaignDetailDtos.add(campaignDetailDto);
            }
            return campaignDetailDtos;
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }


}
