package com.momo.service;

import com.momo.interact.dto.MessageListDto;
import com.momo.interact.dto.MessageSendDto;
import com.momo.interact.vo.ChatListVo;
import com.momo.interact.vo.MessageListVo;
import com.momo.response.ResponseResult;
import org.springframework.stereotype.Service;

/**
 * 私信service
 */
@Service
public interface PrivateMessageService {
    /**
     * 发送私信
     * @param messageSendDto 私信发送dto
     * @return ResponseResult
     */
    ResponseResult sendPrivateMessage(MessageSendDto messageSendDto);

    /**
     * 私信列表
     * @param messageListDto 私信列表dto
     * @return ResponseResult
     */
    ResponseResult<MessageListVo> privateMessageList(MessageListDto messageListDto);

    /**
     * 私信列表
     * @return ResponseResult
     */
    ResponseResult<ChatListVo> chatList();
}
