package com.ecmall4j.cloud.ecmall4cloudware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import ecmall4j.cloud.ecmall4cloudcommon.common.utils.PageUtils;
import com.ecmall4j.cloud.ecmall4cloudware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author Elric
 * @date 2024-05-16 16:54:58
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

