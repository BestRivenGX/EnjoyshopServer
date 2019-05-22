package com.liuyanzhao.sens.service.impl;

import com.liuyanzhao.sens.entity.Activity;
import com.liuyanzhao.sens.mapper.ActivityMapper;
import com.liuyanzhao.sens.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 言曌
 * @date 2019-05-22 21:21
 */

@Service
public class ActivityServiceImpl implements ActivityService {

    @Autowired
    private ActivityMapper activityMapper;

    @Override
    public void saveByActivity(Activity activity) {
        //2.修改
        if (activity != null && activity.getId() != null) {
            activityMapper.updateById(activity);
        } else {
            activityMapper.insert(activity);
        }
    }

    @Override
    public Activity findByActivityId(Long activityId) {
        return activityMapper.selectById(activityId);
    }

    @Override
    public void removeActivity(Long activityId) {
        activityMapper.deleteById(activityId);
    }

    @Override
    public List<Activity> findAll() {
        return activityMapper.selectList(null);
    }
}
