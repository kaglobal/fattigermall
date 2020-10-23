package com.kaglobal.malladmin.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import lombok.Data;

/**
 * 产品属性分类表DTO
 * 
 * @author bianj
 * @version 2020-10-19
 */
@Data
@ApiModel(description = "产品属性分类表DTO")
public class PmsProductAttributeCategoryDTO  {
    /** id */
    @ApiModelProperty(value = "")
    private Long id;
    /** name */
    @ApiModelProperty(value = "", position = 1)
    private String name;
    /** 属性数量 */
    @ApiModelProperty(value = "属性数量", position = 2)
    private Integer attributeCount;
    /** 参数数量 */
    @ApiModelProperty(value = "参数数量", position = 3)
    private Integer paramCount;
}