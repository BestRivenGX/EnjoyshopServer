package com.example.demo5.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.demo5.dao.BannerMapper;
import com.example.demo5.model.Banner;
import com.example.demo5.vo.BannerList;
import com.example.demo5.vo.BannerVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.example.demo5.dao.BannerDynamicSqlSupport.banner;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.ArrayList;
import java.util.List;

@Service
public class BannerService {

    private BannerMapper bannerMapper;
    @Autowired
    public BannerService(BannerMapper bannerMapper){
        this.bannerMapper = bannerMapper;
    }



    public JSONArray banner(Integer type) {
        List<Banner> bannerByType = bannerMapper
                .selectByExample()
                .where(banner.type,isEqualTo(type))
                .build()
                .execute();

        List<BannerVO> bannerVOList = new ArrayList<BannerVO>();
        JSONArray array = (JSONArray) JSONArray.parse(JSON.toJSONString(bannerVOList));
        for (Banner banner :bannerByType ){
            array.add(toBannerVO(banner));
        }


        return array;

    }

    private BannerVO toBannerVO(Banner banner) {
        BannerVO vo = new BannerVO();
        vo.setImgUrl(banner.getImgurl());
        vo.setName(banner.getName());
        vo.setId(banner.getId());
        vo.setType(banner.getType());
        return vo;
    }
}
