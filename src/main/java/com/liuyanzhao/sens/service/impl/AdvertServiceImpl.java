package com.liuyanzhao.sens.service.impl;

import com.liuyanzhao.sens.entity.Advert;
import com.liuyanzhao.sens.mapper.AdvertMapper;
import com.liuyanzhao.sens.service.AdvertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * @author 言曌
 * @date 2019-05-22 21:21
 */

@Service
public class AdvertServiceImpl implements AdvertService {

    @Autowired(required = false)
    private AdvertMapper advertMapper;

    @Override
    public void saveByAdvert(Advert advert) {
        if (advert != null && advert.getId() != null) {
            advertMapper.updateById(advert);
        } else {
            advertMapper.insert(advert);
        }
    }


    @Override
    public Advert findByAdvertId(Long advertId) {
        return advertMapper.selectById(advertId);
    }

    @Override
    public void removeAdvert(Long advertId) {
        advertMapper.deleteById(advertId);
    }

    @Override
    public List<Advert> findByUserId(Long userId) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("user_id", userId);
        return advertMapper.selectByMap(map);
    }

    @Override
    public List<Advert> findAll() {
        return advertMapper.selectList(null);
    }

    @Override
    public List<Advert> findByType(Integer type) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("type", type);
        return advertMapper.selectByMap(map);
    }
}
