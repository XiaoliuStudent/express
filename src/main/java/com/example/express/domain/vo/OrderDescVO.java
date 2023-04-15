package com.example.express.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author 刘航宇 唐志颖 刘磊 杨子龙 孙伟昊
 * @date 2023年4月15日04月23日 23:45
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderDescVO implements Serializable {
    /**
     * 订单号
     */
    private String orderId;
    /**
     * 快递单号
     */
    private String odd;
    /**
     * 快递公司
     */
    private String companyName;
    /**
     * 收件人
     */
    private String recName;
    /**
     * 收件电话
     */
    private String recTel;
    /**
     * 快递寄达地址
     */
    private String address;
    /**
     * 收货地址
     */
    private String recAddress;
    /**
     * 备注
     */
    private String remark;
    /**
     * 配送员前台名
     */
    private String courierFrontName;
    /**
     * 订单状态
     */
    private String orderStatus;
    /**
     * 配送员备注
     */
    private String courierRemark;
    /**
     * 支付状态
     */
    private String paymentStatus;
    /**
     * 支付方式
     */
    private String paymentType;
    /**
     * 支付流水号
     */
    private String paymentId;
    /**
     * 支付金额
     */
    private String payment;
}
