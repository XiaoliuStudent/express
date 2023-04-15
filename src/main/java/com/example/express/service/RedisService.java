package com.example.express.service;

import java.util.concurrent.TimeUnit;

/**
 * @author 刘航宇 唐志颖 刘磊 杨子龙 孙伟昊
 * @date 2023年4月15日04月30日 16:29
 */
public interface RedisService {
    boolean checkRequestRateLimit(final String key, final int expireTime, final int max, TimeUnit timeUnit, String userAgent);
}
