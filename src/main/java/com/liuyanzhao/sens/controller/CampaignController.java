package com.liuyanzhao.sens.controller;

import com.liuyanzhao.sens.entity.Campaign;
import com.liuyanzhao.sens.service.CampaignService;
import com.liuyanzhao.sens.utils.JsonResult;
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
    public   List<Campaign>  list() {
        try {
            return campaignService.findAll();
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }


}
