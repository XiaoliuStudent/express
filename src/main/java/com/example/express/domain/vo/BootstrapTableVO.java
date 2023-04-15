package com.example.express.domain.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author 刘航宇 唐志颖 刘磊 杨子龙 孙伟昊
 * @date 2023年4月15日04月23日 18:11
 */
@Data
public class BootstrapTableVO<T> implements Serializable {
    /**
     * 总记录数
     */
    private Long total;
    /**
     * 记录
     */
    private List<T> rows;
}
