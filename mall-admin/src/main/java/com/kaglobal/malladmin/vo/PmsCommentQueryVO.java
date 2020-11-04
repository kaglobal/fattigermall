package com.kaglobal.malladmin.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

/**
 * 查询商品评价表VO
 * 
 * @author bianj
 * @version 2020-10-19
 */
@Data
@ApiModel(description = "查询商品评价表VO")
public class PmsCommentQueryVO {

    /** id */
    @ApiModelProperty(value = "")
    private Long id;

    /** productId */
    @ApiModelProperty(value = "", position = 1)
    private Long productId;

    /** memberNickName */
    @ApiModelProperty(value = "", position = 2)
    private String memberNickName;

    /** productName */
    @ApiModelProperty(value = "", position = 3)
    private String productName;

    /** 评价星数：0->5 */
    @ApiModelProperty(value = "评价星数：0->5", position = 4)
    private Integer star;

    /** 评价的ip */
    @ApiModelProperty(value = "评价的ip", position = 5)
    private String memberIp;

    /** createTime */
    @ApiModelProperty(value = "", position = 6)
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /** showStatus */
    @ApiModelProperty(value = "", position = 7)
    private Integer showStatus;

    /** 购买时的商品属性 */
    @ApiModelProperty(value = "购买时的商品属性", position = 8)
    private String productAttribute;

    /** collectCouont */
    @ApiModelProperty(value = "", position = 9)
    private Integer collectCouont;

    /** readCount */
    @ApiModelProperty(value = "", position = 10)
    private Integer readCount;

    /** content */
    @ApiModelProperty(value = "", position = 11)
    private String content;

    /** 上传图片地址，以逗号隔开 */
    @ApiModelProperty(value = "上传图片地址，以逗号隔开", position = 12)
    private String pics;

    /** 评论用户头像 */
    @ApiModelProperty(value = "评论用户头像", position = 13)
    private String memberIcon;

    /** replayCount */
    @ApiModelProperty(value = "", position = 14)
    private Integer replayCount;
}