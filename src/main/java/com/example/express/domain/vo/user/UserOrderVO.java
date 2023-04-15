package com.example.express.domain.vo.user;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 普通用户端，OrderVO
 *
 * @author 刘航宇 唐志颖 刘磊 杨子龙 孙伟昊
 * @date 2023年4月15日04月24日 22:24
 */
@Data
@Builder
public class UserOrderVO implements Serializable {
    /**
     * 订单号
     */
    private String id;
    /**
     * 快递单号
     */
    private String odd;
    /**
     * 快递公司
     */
    private String company;
    /**
     * 支付状态
     */
    private Integer paymentStatus;
    /**
     * 支付金额
     */
    private String payment;
    /**
     * 订单状态
     */
    private Integer orderStatus;
    /**
     * 删除原因
     */
    private Integer deleteType;
    /**
     * 能否评分，1可以，0可以
     */
    private String canScore;
    /**
     * 下单时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime createDate;
}
