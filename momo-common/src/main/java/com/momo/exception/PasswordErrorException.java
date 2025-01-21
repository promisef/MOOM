package com.momo.exception;

import com.momo.constant.ResponseConstant;

/**
 */
public class PasswordErrorException extends CustomException{

        public PasswordErrorException() {
            super(ResponseConstant.PASSWORD_ERROR);
        }

        public PasswordErrorException(String msg) {
            super(msg);
        }
}
