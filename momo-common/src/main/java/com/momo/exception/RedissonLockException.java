package com.momo.exception;

/**
 */
public class RedissonLockException extends CustomException{
    public RedissonLockException(){
        super("redisson加锁失败");
    }
    public RedissonLockException(String msg){
        super(msg);
    }
}
