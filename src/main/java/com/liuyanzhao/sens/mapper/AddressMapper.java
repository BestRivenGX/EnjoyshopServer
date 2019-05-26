package com.liuyanzhao.sens.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.liuyanzhao.sens.entity.Address;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author liuyanzhao
 */
@Mapper
public interface AddressMapper extends BaseMapper<Address> {

    /**
     * 去掉该用户的其他默认地址
     * @param userId
     * @return
     */
    Integer resetDefaultAddress(Long userId);
}

