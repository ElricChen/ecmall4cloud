package com.ecmall4j.cloud.ecmall4cloudadmin.modules.app.controller;


import com.ecmall4j.cloud.ecmall4cloudadmin.common.utils.R;
import com.ecmall4j.cloud.ecmall4cloudadmin.common.validator.ValidatorUtils;
import com.ecmall4j.cloud.ecmall4cloudadmin.modules.app.form.LoginForm;
import com.ecmall4j.cloud.ecmall4cloudadmin.modules.app.service.UserService;
import com.ecmall4j.cloud.ecmall4cloudadmin.modules.app.utils.JwtUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * APP登录授权
 *
 * @author Mark sunlightcs@gmail.com
 */
@RestController
@RequestMapping("/app")
@Api("APP登录接口")
public class AppLoginController {
    @Autowired
    private UserService userService;
    @Autowired
    private JwtUtils jwtUtils;

    /**
     * 登录
     */
    @PostMapping("login")
    @ApiOperation("登录")
    public R login(@RequestBody LoginForm form){
        //表单校验
        ValidatorUtils.validateEntity(form);

        //用户登录
        long userId = userService.login(form);

        //生成token
        String token = jwtUtils.generateToken(userId);

        Map<String, Object> map = new HashMap<>();
        map.put("token", token);
        map.put("expire", jwtUtils.getExpire());

        return R.ok(map);
    }

}
