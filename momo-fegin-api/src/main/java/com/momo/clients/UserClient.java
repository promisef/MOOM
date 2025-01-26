package com.momo.clients;


import com.momo.interceptor.MyFeignRequestInterceptor;
import com.momo.response.ResponseResult;
import com.momo.user.vo.UserPersonalInfoVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 用户服务客户端接口
 */
@FeignClient(value = "momo-service-user", configuration = MyFeignRequestInterceptor.class)
public interface UserClient {

    /**
     * 获取用户个人信息
     * @param userId 用户id
     * @return ResponseResult
     */
    @GetMapping("/momo/user/personal")
    ResponseResult<UserPersonalInfoVo> getUserPersonalInfo(@RequestParam("userId") Long userId);
}
