package com.momo.interact.vo;

import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * 视频列表Vo类
 */
@Data
@Builder
public class VideoListVo {

    /**
     *  本次总数
     */
    private Integer total;

    /**
     *  视频列表
     */
    private List<VideoDetail> videoList;
}
