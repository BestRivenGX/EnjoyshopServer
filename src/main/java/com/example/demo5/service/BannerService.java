package com.example.demo5.service;

import com.example.demo5.dao.BannerMapper;
import com.example.demo5.model.Banner;
import com.example.demo5.vo.BannerVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.example.demo5.dao.BannerDynamicSqlSupport.banner;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;

@Service
public class BannerService {

    private BannerMapper bannerMapper;
    @Autowired
    public BannerService(BannerMapper bannerMapper){
        this.bannerMapper = bannerMapper;
    }

    public BannerVO banner(Integer type) {
        List<Banner> bannerByType = bannerMapper
                .selectByExample()
                .where(banner.type,isEqualTo(type))
                .build()
                .execute();

        Banner record = bannerByType.get(0);
        BannerVO vo = new BannerVO();
        vo.setId(record.getId());
        vo.setName(record.getName());
        vo.setImgUrl(record.getImgurl());
        return vo;
    }
}
