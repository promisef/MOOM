package com.momo.interceptor;


import com.momo.utils.ThreadLocalUtil;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.context.annotation.Configuration;

/**
 * @desciption feign请求全局添加Token
 * @date 2021/4/15 19:15
 * @className MyFeignRequestInterceptor
 */
@Configuration
public class MyFeignRequestInterceptor implements RequestInterceptor {
    @Override
    public void apply(RequestTemplate requestTemplate) {
        requestTemplate.header("userId", ThreadLocalUtil.getUserId().toString());
    }
}
