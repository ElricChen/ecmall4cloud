package com.ecmall4j.cloud.ecmall4cloudadmin.modules.app.controller;


import com.ecmall4j.cloud.ecmall4cloudadmin.common.utils.R;
import com.ecmall4j.cloud.ecmall4cloudadmin.common.validator.ValidatorUtils;
import com.ecmall4j.cloud.ecmall4cloudadmin.modules.app.entity.UserEntity;
import com.ecmall4j.cloud.ecmall4cloudadmin.modules.app.form.RegisterForm;
import com.ecmall4j.cloud.ecmall4cloudadmin.modules.app.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * 注册
 *
 * @author Mark sunlightcs@gmail.com
 */
@RestController
@RequestMapping("/app")
@Api("APP注册接口")
public class AppRegisterController {
    @Autowired
    private UserService userService;

    @PostMapping("register")
    @ApiOperation("注册")
    public R register(@RequestBody RegisterForm form){
        //表单校验
        ValidatorUtils.validateEntity(form);

        UserEntity user = new UserEntity();
        user.setMobile(form.getMobile());
        user.setUsername(form.getMobile());
        user.setPassword(DigestUtils.sha256Hex(form.getPassword()));
        user.setCreateTime(new Date());
        userService.save(user);

        return R.ok();
    }
}
