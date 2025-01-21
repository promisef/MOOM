package com.momo.exception;

import com.momo.constant.ResponseConstant;

/**
 */
public class NullParamException extends CustomException {

    public NullParamException() {
        super(ResponseConstant.PARAM_REQUIRE);
    }
    public NullParamException(String msg) {
        super(msg);
    }
}
