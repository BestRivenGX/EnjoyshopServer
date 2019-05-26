package com.liuyanzhao.sens.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.liuyanzhao.sens.entity.Item;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author liuyanzhao
 */
@Mapper
public interface ItemMapper extends BaseMapper<Item> {

    List<Item> findByCampaignId(@Param("campaignId") Long campaignId, Pagination pagination);

    List<Item> findByCategoryId(@Param("categoryId") Long categoryId, Pagination pagination);

    List<Item> findAll(Pagination pagination);
}

