package com.example.layui.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 用于饼状图
 */
@Data
@AllArgsConstructor
public class PieVO {

    // 属性值必须与echart的字段值一致
    private Integer value;

    // 也可以使用注解，指定返回的json对应的key
    @JsonProperty("name")
    private String name;


}
