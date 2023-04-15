package com.example.express.domain.bean;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 用户评分表
 *
 * @author 刘航宇 唐志颖 刘磊 杨子龙 孙伟昊
 * @date 2023年4月15日05月03日 23:47
 */
@Data
@Builder
public class UserEvaluate {
    @TableId(type = IdType.INPUT)
    private String userId;
    /**
     * 用户评分
     */
    private BigDecimal score;
    /**
     * 评分基数
     */
    private Integer count;

    @Version
    private Integer version;

    @TableField(fill = FieldFill.UPDATE)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime updateDate;
}
