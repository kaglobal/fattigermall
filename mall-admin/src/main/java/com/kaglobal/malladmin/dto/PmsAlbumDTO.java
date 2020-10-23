package com.kaglobal.malladmin.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import lombok.Data;

/**
 * 相册表DTO
 * 
 * @author bianj
 * @version 2020-10-19
 */
@Data
@ApiModel(description = "相册表DTO")
public class PmsAlbumDTO  {
    /** id */
    @ApiModelProperty(value = "")
    private Long id;
    /** name */
    @ApiModelProperty(value = "", position = 1)
    private String name;
    /** coverPic */
    @ApiModelProperty(value = "", position = 2)
    private String coverPic;
    /** picCount */
    @ApiModelProperty(value = "", position = 3)
    private Integer picCount;
    /** sort */
    @ApiModelProperty(value = "", position = 4)
    private Integer sort;
    /** description */
    @ApiModelProperty(value = "", position = 5)
    private String description;
}