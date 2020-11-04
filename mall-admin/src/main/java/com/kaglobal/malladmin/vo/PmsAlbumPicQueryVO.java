package com.kaglobal.malladmin.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import lombok.Data;

/**
 * 查询画册图片表VO
 * 
 * @author bianj
 * @version 2020-10-19
 */
@Data
@ApiModel(description = "查询画册图片表VO")
public class PmsAlbumPicQueryVO {

    /** id */
    @ApiModelProperty(value = "")
    private Long id;

    /** albumId */
    @ApiModelProperty(value = "", position = 1)
    private Long albumId;

    /** pic */
    @ApiModelProperty(value = "", position = 2)
    private String pic;
}