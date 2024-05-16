package com.ecmall4j.cloud.ecmall4cloudcoupon.dao;

import com.ecmall4j.cloud.ecmall4cloudcoupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author Elric
 * @email sunlightcs@gmail.com
 * @date 2024-05-16 15:33:36
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}