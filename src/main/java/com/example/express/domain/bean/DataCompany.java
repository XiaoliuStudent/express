package com.example.express.domain.bean;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * 快递公司数据
 *
 * @author 刘航宇 唐志颖 刘磊 杨子龙 孙伟昊
 * @date 2023年4月15日04月24日 14:52
 */
@Data
public class DataCompany implements Serializable {
    @TableId
    private Integer id;

    private String name;

    private String code;
}
