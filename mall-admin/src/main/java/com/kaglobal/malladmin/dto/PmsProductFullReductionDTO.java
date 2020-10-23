package com.kaglobal.malladmin.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import lombok.Data;

/**
 * 产品满减表(只针对同商品)DTO
 * 
 * @author bianj
 * @version 2020-10-19
 */
@Data
@ApiModel(description = "产品满减表(只针对同商品)DTO")
public class PmsProductFullReductionDTO  {
    /** id */
    @ApiModelProperty(value = "")
    private Long id;
    /** productId */
    @ApiModelProperty(value = "", position = 1)
    private Long productId;
    /** fullPrice */
    @ApiModelProperty(value = "", position = 2)
    private BigDecimal fullPrice;
    /** reducePrice */
    @ApiModelProperty(value = "", position = 3)
    private BigDecimal reducePrice;
}