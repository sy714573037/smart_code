package com.t.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * 一个字段信息
 * 
 * @author: shuyi
 * @date 2019/1/23 14:29
 */
@Getter
@Setter
public class FieldProperty {

    /**
     * name 表中对应的字段名字
     */
    private String name;

    /**
     * fieldName
     */
    private String fieldName;

    /**
     * type
     */
    private String type;

    /**
     * length
     */
    private String length;

    /**
     * 注解
     */
    private String comment;

}
