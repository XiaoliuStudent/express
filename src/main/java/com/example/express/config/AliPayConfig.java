package com.example.express.config;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 刘航宇 唐志颖 刘磊 杨子龙 孙伟昊
 * @date 2023年4月15日04月23日 0:29
 */
@Getter
@Configuration
public class AliPayConfig {
    @Value("${project.alipay.gateway-url}")
    private String serverUrl;
    @Value("${project.alipay.app-id}")
    private String appId;
    @Value("${project.alipay.merchant-private-key}")
    private String privateKey;
    @Value("${project.alipay.alipay-public-key}")
    private String alipayPublicKey;
    @Value("${project.alipay.sign-type}")
    private String signType;
    @Value("${project.alipay.uid}")
    private String sellerId;
    @Value("${project.alipay.notify-url}")
    private String notifyUrl;
    @Value("${project.alipay.return-url}")
    private String returnUrl;

    @Bean
    public AlipayClient alipayClient() {
        return new DefaultAlipayClient(serverUrl, appId, privateKey, "json", "utf-8", alipayPublicKey, signType);
    }
}
