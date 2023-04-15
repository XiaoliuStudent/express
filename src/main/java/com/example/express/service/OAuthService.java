package com.example.express.service;

public interface OAuthService {

    /**
     * 生成并保存state入缓存
     *
     * @since 2023年4月15日
     */
    String genState();

    /**
     * 校验state
     * @since 2023年4月15日
     */
    boolean checkState(String state);
}
