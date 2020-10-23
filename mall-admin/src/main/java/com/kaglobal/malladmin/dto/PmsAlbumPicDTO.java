package com.kaglobal.malladmin.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import lombok.Data;

/**
 * 画册图片表DTO
 * 
 * @author bianj
 * @version 2020-10-19
 */
@Data
@ApiModel(description = "画册图片表DTO")
public class PmsAlbumPicDTO  {
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