package com.momo.service;


import com.momo.response.ResponseResult;
import com.momo.user.dto.RegisterDto;
import com.momo.user.dto.UserLoginDto;
import com.momo.user.vo.UserLoginVo;
import org.springframework.stereotype.Service;

/**
 * 用户登录服务接口
 */
@Service
public interface UserLoginService {
    /**
     * 用户注册
     * @param registerDto 注册信息
     * @return 注册结果
     */
    ResponseResult register(RegisterDto registerDto);

    /**
     * 用户登录
     * @param userLoginDto 登录信息
     * @return 登录结果
     */
    ResponseResult<UserLoginVo> userLogin(UserLoginDto userLoginDto);
}
