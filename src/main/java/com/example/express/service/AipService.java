package com.example.express.service;

import com.example.express.domain.ResponseResult;

/**
 * 人脸识别接口
 *
 * @author 刘航宇 唐志颖 刘磊 杨子龙 孙伟昊
 * @date 2023年4月15日05月02日 18:18
 */
public interface AipService {
    /**
     * 人脸检测
     * @param isQuality 是否开启质量校验
     */
    ResponseResult faceDetectByBase64(String image, boolean isQuality);
    /**
     * 人脸注册
     * 注：先调用人脸检测，开启质量校验
     */
    ResponseResult faceRegistryByFaceToken(String faceToken, String userId);
    /**
     * 人脸搜索
     */
    ResponseResult faceSearchByBase64(String image);
    /**
     * 人脸更新
     * 注：先调用人脸检测，开启质量校验
     */
    ResponseResult faceUpdateByFaceToken(String faceToken, String userId);
}
