package com.liuyanzhao.sens.service.impl;

import com.liuyanzhao.sens.entity.Campaign;
import com.liuyanzhao.sens.mapper.CampaignMapper;
import com.liuyanzhao.sens.service.CampaignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 言曌
 * @date 2019-05-22 21:21
 */

@Service
public class CampaignServiceImpl implements CampaignService {

    @Autowired
    private CampaignMapper campaignMapper;

    @Override
    public void saveByCampaign(Campaign campaign) {
        //2.修改
        if (campaign != null && campaign.getId() != null) {
            campaignMapper.updateById(campaign);
        } else {
            campaignMapper.insert(campaign);
        }
    }

    @Override
    public Campaign findByCampaignId(Long campaignId) {
        return campaignMapper.selectById(campaignId);
    }

    @Override
    public void removeCampaign(Long campaignId) {
        campaignMapper.deleteById(campaignId);
    }

    @Override
    public List<Campaign> findAll() {
        return campaignMapper.selectList(null);
    }
}
