package com.kaglobal.malladmin.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import lombok.Data;

/**
 * 存储产品参数信息的表DTO
 * 
 * @author bianj
 * @version 2020-10-19
 */
@Data
@ApiModel(description = "存储产品参数信息的表DTO")
public class PmsProductAttributeValueDTO  {
    /** id */
    @ApiModelProperty(value = "")
    private Long id;
    /** productId */
    @ApiModelProperty(value = "", position = 1)
    private Long productId;
    /** productAttributeId */
    @ApiModelProperty(value = "", position = 2)
    private Long productAttributeId;
    /** 手动添加规格或参数的值，参数单值，规格有多个时以逗号隔开 */
    @ApiModelProperty(value = "手动添加规格或参数的值，参数单值，规格有多个时以逗号隔开", position = 3)
    private String value;
}