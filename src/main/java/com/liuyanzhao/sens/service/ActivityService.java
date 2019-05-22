package com.liuyanzhao.sens.service;

import com.liuyanzhao.sens.entity.Activity;

import java.util.List;


/**
 * <pre>
 *     活动业务逻辑接口
 * </pre>
 *
 */
public interface ActivityService {

    /**
     * 新增/修改活动
     *
     * @param activity activity
     * @return Role
     */
    void saveByActivity(Activity activity);

    /**
     * 根据活动Id获得活动
     *
     * @param activityId 活动名
     * @return 活动
     */
    Activity findByActivityId(Long activityId);

    /**
     * 删除活动
     *
     * @param activityId 活动Id
     */
    void removeActivity(Long activityId);

    /**
     * 活动列表
     * @return
     */
    List<Activity> findAll();

}
