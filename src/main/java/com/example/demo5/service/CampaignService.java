package com.example.demo5.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.example.demo5.dao.CampaignMapper;
import com.example.demo5.dao.HomecampaignMapper;
import com.example.demo5.model.Campaign;
import com.example.demo5.model.Homecampaign;
import com.example.demo5.vo.CampaignVO;
import com.example.demo5.vo.HomeCampaignVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.example.demo5.dao.CampaignDynamicSqlSupport.campaign;
import static com.example.demo5.dao.HomecampaignDynamicSqlSupport.homecampaign;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.ArrayList;
import java.util.List;

@Service
public class CampaignService {

    private CampaignMapper campaignMapper;
    private HomecampaignMapper homecampaignMapper;

    @Autowired
    public CampaignService(CampaignMapper campaignMapper,HomecampaignMapper homecampaignMapper) {

        this.campaignMapper = campaignMapper;
        this.homecampaignMapper = homecampaignMapper;
    }

    public JSONArray campaign(Integer type){

        List<Campaign> campaignByType = campaignMapper
                .selectByExample()
                .where(campaign.type,isEqualTo(type))
                .build()
                .execute();
        List<Homecampaign> homecampaignByType = homecampaignMapper
                .selectByExample()
                .where(campaign.type,isEqualTo(type))
                .build()
                .execute();

        List<HomeCampaignVO> homeCampaignVOList = new ArrayList<HomeCampaignVO>();
        JSONArray array = JSON.parseArray(JSON.toJSONString(homeCampaignVOList));
        for (int i=0;i<homecampaignByType.size();++i){
            array.add(toHomeCampaignVO(homecampaignByType.get(i),campaignByType.get(i)));

        }

        return array;
    }


    private HomeCampaignVO toHomeCampaignVO(Homecampaign homecampaign,Campaign campaign){

        HomeCampaignVO vo = new HomeCampaignVO();
        vo.setId(homecampaign.getId());
        vo.setTitle(homecampaign.getTitle());
        vo.setCpOne(toCampaignVO(campaign));
        vo.setCpTwo(toCampaignVO(campaign));
        vo.setCpThree(toCampaignVO(campaign));

        return vo;
    }

    private CampaignVO toCampaignVO(Campaign campaign){

        CampaignVO vo = new CampaignVO();
        vo.setId(campaign.getId());
        vo.setTitle(campaign.getTitle());
        vo.setImgUrl(campaign.getImgurl());
        return vo;
    }
}
