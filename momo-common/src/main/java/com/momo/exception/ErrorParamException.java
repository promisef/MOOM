package com.momo.exception;

import com.momo.constant.ResponseConstant;

/**
 */
public class ErrorParamException extends CustomException{

    public ErrorParamException() {
        super(ResponseConstant.PARAM_INVALID);
    }

    public ErrorParamException(String msg) {
        super(msg);
    }
}
