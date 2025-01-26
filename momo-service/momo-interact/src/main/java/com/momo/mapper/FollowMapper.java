package com.momo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.momo.interact.pojo.Follow;
import org.apache.ibatis.annotations.Mapper;

/**
 * 关注mapper接口类
 * @author shigc
 */
@Mapper
public interface FollowMapper extends BaseMapper<Follow> {
}
