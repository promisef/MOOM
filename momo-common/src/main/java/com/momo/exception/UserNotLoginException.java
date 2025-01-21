package com.momo.exception;

import com.momo.constant.ResponseConstant;

/**
 * 用户未登录异常
 */
public class UserNotLoginException extends CustomException {
    public UserNotLoginException() {
        super(ResponseConstant.NEED_LOGIN);
    }
}
