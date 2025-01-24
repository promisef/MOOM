package com.momo.controller;


import com.momo.response.ResponseResult;
import com.momo.service.UserLoginService;
import com.momo.user.dto.RegisterDto;
import com.momo.user.dto.UserLoginDto;
import com.momo.user.vo.UserLoginVo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 用户登录控制器
 */
@RestController
@RequestMapping("/azaz/user/login")
public class UserLoginController {

    @Resource
    private UserLoginService userLoginService;
    /**
     * 用户注册
     * @param registerDto 注册信息
     * @return 登录结果
     */
    @PostMapping("/register")
    public ResponseResult register(RegisterDto registerDto) {
        return userLoginService.register(registerDto);
    }

    /**
     * 用户登录
     * @param userLoginDto 登录信息
     * @return 登录结果
     */
    @PostMapping
    public ResponseResult<UserLoginVo> userLogin(UserLoginDto userLoginDto) {
        return userLoginService.userLogin(userLoginDto);
    }
}
