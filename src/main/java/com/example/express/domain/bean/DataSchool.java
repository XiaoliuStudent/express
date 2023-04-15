package com.example.express.domain.bean;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * 高校数据
 *
 * @author 刘航宇 唐志颖 刘磊 杨子龙 孙伟昊
 * @date 2023年4月15日04月21日 12:40
 */
@Data
public class DataSchool implements Serializable {
    @TableId
    private Integer id;
    /**
     * 学校名称
     */
    private String name;
    /**
     * 省份ID
     */
    private Integer provinceId;
    /**
     * 学校级别
     */
    private String level;
    /**
     * 学校网址
     */
    private String website;
    /**
     * 学校简称
     */
    private String abbreviation;
}

