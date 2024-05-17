package com.ecmall4j.cloud.ecmall4cloudproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import ecmall4j.cloud.ecmall4cloudcommon.common.utils.PageUtils;
import com.ecmall4j.cloud.ecmall4cloudproduct.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author Elric
 * @date 2024-05-16 16:53:38
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

