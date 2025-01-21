package com.momo.exception;

import com.momo.constant.ResponseConstant;

/**
 */
public class UserNotExitedException extends CustomException {

    public UserNotExitedException() {
        super(ResponseConstant.USER_NOT_EXIST);
    }

    public UserNotExitedException(String message) {
        super(message);
    }
}
