package com.example.express.domain.vo.admin;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 用户信息VO，管理员用
 *
 * @author 刘航宇 唐志颖 刘磊 杨子龙 孙伟昊
 * @date 2023年4月15日05月02日 12:29
 */
@Data
@Builder
public class AdminUserInfoVO implements Serializable {
    private String id;

    private String username;

    private String tel;

    private Integer role;
    /**
     * 是否实名认证
     */
    private Boolean hasReal;
    /**
     * 是否启用
     */
    private Boolean hasEnable;
    /**
     * 用户评分
     */
    private String score;
    /**
     * 账户解冻时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime lockDate;
    /**
     * 注册时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime createDate;
}
