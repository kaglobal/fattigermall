package com.kaglobal.malladmin.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.math.BigDecimal;
import lombok.Data;

/**
 * 商品信息DTO
 * 
 * @author bianj
 * @version 2020-10-19
 */
@Data
@ApiModel(description = "商品信息DTO")
public class PmsProductDTO  {
    /** id */
    @ApiModelProperty(value = "")
    private Long id;
    /** brandId */
    @ApiModelProperty(value = "", position = 1)
    private Long brandId;
    /** productCategoryId */
    @ApiModelProperty(value = "", position = 2)
    private Long productCategoryId;
    /** feightTemplateId */
    @ApiModelProperty(value = "", position = 3)
    private Long feightTemplateId;
    /** productAttributeCategoryId */
    @ApiModelProperty(value = "", position = 4)
    private Long productAttributeCategoryId;
    /** name */
    @ApiModelProperty(value = "", position = 5)
    private String name;
    /** pic */
    @ApiModelProperty(value = "", position = 6)
    private String pic;
    /** 货号 */
    @ApiModelProperty(value = "货号", position = 7)
    private String productSn;
    /** 删除状态：0->未删除；1->已删除 */
    @ApiModelProperty(value = "删除状态：0->未删除；1->已删除", position = 8)
    private Integer deleteStatus;
    /** 上架状态：0->下架；1->上架 */
    @ApiModelProperty(value = "上架状态：0->下架；1->上架", position = 9)
    private Integer publishStatus;
    /** 新品状态:0->不是新品；1->新品 */
    @ApiModelProperty(value = "新品状态:0->不是新品；1->新品", position = 10)
    private Integer newStatus;
    /** 推荐状态；0->不推荐；1->推荐 */
    @ApiModelProperty(value = "推荐状态；0->不推荐；1->推荐", position = 11)
    private Integer recommandStatus;
    /** 审核状态：0->未审核；1->审核通过 */
    @ApiModelProperty(value = "审核状态：0->未审核；1->审核通过", position = 12)
    private Integer verifyStatus;
    /** 排序 */
    @ApiModelProperty(value = "排序", position = 13)
    private Integer sort;
    /** 销量 */
    @ApiModelProperty(value = "销量", position = 14)
    private Integer sale;
    /** price */
    @ApiModelProperty(value = "", position = 15)
    private BigDecimal price;
    /** 促销价格 */
    @ApiModelProperty(value = "促销价格", position = 16)
    private BigDecimal promotionPrice;
    /** 赠送的成长值 */
    @ApiModelProperty(value = "赠送的成长值", position = 17)
    private Integer giftGrowth;
    /** 赠送的积分 */
    @ApiModelProperty(value = "赠送的积分", position = 18)
    private Integer giftPoint;
    /** 限制使用的积分数 */
    @ApiModelProperty(value = "限制使用的积分数", position = 19)
    private Integer usePointLimit;
    /** 副标题 */
    @ApiModelProperty(value = "副标题", position = 20)
    private String subTitle;
    /** 商品描述 */
    @ApiModelProperty(value = "商品描述", position = 21)
    private String description;
    /** 市场价 */
    @ApiModelProperty(value = "市场价", position = 22)
    private BigDecimal originalPrice;
    /** 库存 */
    @ApiModelProperty(value = "库存", position = 23)
    private Integer stock;
    /** 库存预警值 */
    @ApiModelProperty(value = "库存预警值", position = 24)
    private Integer lowStock;
    /** 单位 */
    @ApiModelProperty(value = "单位", position = 25)
    private String unit;
    /** 商品重量，默认为克 */
    @ApiModelProperty(value = "商品重量，默认为克", position = 26)
    private BigDecimal weight;
    /** 是否为预告商品：0->不是；1->是 */
    @ApiModelProperty(value = "是否为预告商品：0->不是；1->是", position = 27)
    private Integer previewStatus;
    /** 以逗号分割的产品服务：1->无忧退货；2->快速退款；3->免费包邮 */
    @ApiModelProperty(value = "以逗号分割的产品服务：1->无忧退货；2->快速退款；3->免费包邮", position = 28)
    private String serviceIds;
    /** keywords */
    @ApiModelProperty(value = "", position = 29)
    private String keywords;
    /** note */
    @ApiModelProperty(value = "", position = 30)
    private String note;
    /** 画册图片，连产品图片限制为5张，以逗号分割 */
    @ApiModelProperty(value = "画册图片，连产品图片限制为5张，以逗号分割", position = 31)
    private String albumPics;
    /** detailTitle */
    @ApiModelProperty(value = "", position = 32)
    private String detailTitle;
    /** detailDesc */
    @ApiModelProperty(value = "", position = 33)
    private String detailDesc;
    /** 产品详情网页内容 */
    @ApiModelProperty(value = "产品详情网页内容", position = 34)
    private String detailHtml;
    /** 移动端网页详情 */
    @ApiModelProperty(value = "移动端网页详情", position = 35)
    private String detailMobileHtml;
    /** 促销开始时间 */
    @ApiModelProperty(value = "促销开始时间", position = 36)
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date promotionStartTime;
    /** 促销结束时间 */
    @ApiModelProperty(value = "促销结束时间", position = 37)
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date promotionEndTime;
    /** 活动限购数量 */
    @ApiModelProperty(value = "活动限购数量", position = 38)
    private Integer promotionPerLimit;
    /** 促销类型：0->没有促销使用原价;1->使用促销价；2->使用会员价；3->使用阶梯价格；4->使用满减价格；5->限时购 */
    @ApiModelProperty(value = "促销类型：0->没有促销使用原价;1->使用促销价；2->使用会员价；3->使用阶梯价格；4->使用满减价格；5->限时购", position = 39)
    private Integer promotionType;
    /** 品牌名称 */
    @ApiModelProperty(value = "品牌名称", position = 40)
    private String brandName;
    /** 商品分类名称 */
    @ApiModelProperty(value = "商品分类名称", position = 41)
    private String productCategoryName;
}