package com.momo.mapper;

import com.momo.user.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户登录Mapper
 */
@Mapper
public interface UserMapper extends com.baomidou.mybatisplus.core.mapper.BaseMapper<User>{
}
