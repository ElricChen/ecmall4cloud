package com.ecmall4j.cloud.ecmall4cloudadmin.modules.sys.service;

import com.ecmall4j.cloud.ecmall4cloudadmin.modules.sys.entity.SysUserEntity;
import com.ecmall4j.cloud.ecmall4cloudadmin.modules.sys.entity.SysUserTokenEntity;

import java.util.Set;

/**
 * shiro相关接口
 *
 * @author Mark sunlightcs@gmail.com
 */
public interface ShiroService {
    /**
     * 获取用户权限列表
     */
    Set<String> getUserPermissions(long userId);

    SysUserTokenEntity queryByToken(String token);

    /**
     * 根据用户ID，查询用户
     * @param userId
     */
    SysUserEntity queryUser(Long userId);
}
