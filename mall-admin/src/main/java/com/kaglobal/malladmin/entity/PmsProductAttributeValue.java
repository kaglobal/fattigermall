package com.kaglobal.malladmin.entity;


import lombok.*;

/**
 * 存储产品参数信息的表
 * 
 * @author bianj
 * @version 2020-10-19
 */
@Getter
@Setter
public class PmsProductAttributeValue {
    /** id */
    private Long id;
    /** productId */
    private Long productId;
    /** productAttributeId */
    private Long productAttributeId;
    /** 手动添加规格或参数的值，参数单值，规格有多个时以逗号隔开 */
    private String value;
}