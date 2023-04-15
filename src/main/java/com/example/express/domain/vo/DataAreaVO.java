package com.example.express.domain.vo;

import com.example.express.common.util.CollectionUtils;
import com.example.express.domain.bean.DataArea;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author 刘航宇 唐志颖 刘磊 杨子龙 孙伟昊
 * @date 2023年4月15日04月21日 23:49
 */
@Data
public class DataAreaVO implements Serializable {
    /**
     * ID
     */
    private Integer id;
    /**
     * 名称
     */
    private String name;

    public static List<DataAreaVO> convert(List<DataArea> areas) {
        if(CollectionUtils.isListEmpty(areas)) {
            return Collections.emptyList();
        }

        return areas.stream().map(DataAreaVO::convert).collect(Collectors.toList());
    }

    public static DataAreaVO convert(DataArea area) {
        DataAreaVO vo = new DataAreaVO();
        BeanUtils.copyProperties(area, vo);

        return vo;
    }
}
