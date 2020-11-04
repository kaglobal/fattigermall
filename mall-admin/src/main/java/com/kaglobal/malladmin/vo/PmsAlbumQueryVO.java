package com.kaglobal.malladmin.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import lombok.Data;

/**
 * 查询相册表VO
 * 
 * @author bianj
 * @version 2020-10-19
 */
@Data
@ApiModel(description = "查询相册表VO")
public class PmsAlbumQueryVO {

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