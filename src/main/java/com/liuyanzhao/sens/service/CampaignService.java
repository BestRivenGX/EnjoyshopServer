package com.liuyanzhao.sens.service;

import com.liuyanzhao.sens.entity.Campaign;

import java.util.List;


/**
 * <pre>
 *     活动业务逻辑接口
 * </pre>
 *
 */
public interface CampaignService {

    /**
     * 新增/修改活动
     *
     * @param campaign campaign
     * @return Role
     */
    void saveByCampaign(Campaign campaign);

    /**
     * 根据活动Id获得活动
     *
     * @param campaignId 活动名
     * @return 活动
     */
    Campaign findByCampaignId(Long campaignId);

    /**
     * 删除活动
     *
     * @param campaignId 活动Id
     */
    void removeCampaign(Long campaignId);

    /**
     * 活动列表
     * @return
     */
    List<Campaign> findAll();

}
