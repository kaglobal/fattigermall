package com.kaglobal.malladmin.biz.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.kaglobal.malladmin.biz.service.PmsProductBizService;
import com.kaglobal.malladmin.dto.PmsProductDTO;
import com.kaglobal.malladmin.entity.PmsProduct;
import com.kaglobal.malladmin.vo.PmsProductQueryVO;
import com.kaglobal.malladmin.vo.PmsProductSaveVO;
import com.kaglobal.malladmin.service.PmsProductService;
import org.springframework.stereotype.Service;
import java.util.Objects;

/**
 * 商品信息 业务Service 实现类
 * 
 * @author bianj
 * @version 2020-10-19
 */
@Service
public class PmsProductBizServiceImpl implements PmsProductBizService {
    
	private PmsProductService pmsProductService;

	PmsProductBizServiceImpl(PmsProductService pmsProductService){
		this.pmsProductService = pmsProductService;
	}

    
    protected void setCriteriaForQuery(PmsProductQueryVO vo, QueryWrapper<PmsProduct> criteria) {
        if(Objects.nonNull(vo.getBrandId())){
            criteria.eq("brand_id", vo.getBrandId());
        }
        if(Objects.nonNull(vo.getProductCategoryId())){
            criteria.eq("product_category_id", vo.getProductCategoryId());
        }
        if(Objects.nonNull(vo.getFeightTemplateId())){
            criteria.eq("feight_template_id", vo.getFeightTemplateId());
        }
        if(Objects.nonNull(vo.getProductAttributeCategoryId())){
            criteria.eq("product_attribute_category_id", vo.getProductAttributeCategoryId());
        }
        if(Objects.nonNull(vo.getName())){
            criteria.eq("name", vo.getName());
        }
        if(Objects.nonNull(vo.getPic())){
            criteria.eq("pic", vo.getPic());
        }
        if(Objects.nonNull(vo.getProductSn())){
            criteria.eq("product_sn", vo.getProductSn());
        }
        if(Objects.nonNull(vo.getDeleteStatus())){
            criteria.eq("delete_status", vo.getDeleteStatus());
        }
        if(Objects.nonNull(vo.getPublishStatus())){
            criteria.eq("publish_status", vo.getPublishStatus());
        }
        if(Objects.nonNull(vo.getNewStatus())){
            criteria.eq("new_status", vo.getNewStatus());
        }
        if(Objects.nonNull(vo.getRecommandStatus())){
            criteria.eq("recommand_status", vo.getRecommandStatus());
        }
        if(Objects.nonNull(vo.getVerifyStatus())){
            criteria.eq("verify_status", vo.getVerifyStatus());
        }
        if(Objects.nonNull(vo.getSort())){
            criteria.eq("sort", vo.getSort());
        }
        if(Objects.nonNull(vo.getSale())){
            criteria.eq("sale", vo.getSale());
        }
        if(Objects.nonNull(vo.getPrice())){
            criteria.eq("price", vo.getPrice());
        }
        if(Objects.nonNull(vo.getPromotionPrice())){
            criteria.eq("promotion_price", vo.getPromotionPrice());
        }
        if(Objects.nonNull(vo.getGiftGrowth())){
            criteria.eq("gift_growth", vo.getGiftGrowth());
        }
        if(Objects.nonNull(vo.getGiftPoint())){
            criteria.eq("gift_point", vo.getGiftPoint());
        }
        if(Objects.nonNull(vo.getUsePointLimit())){
            criteria.eq("use_point_limit", vo.getUsePointLimit());
        }
        if(Objects.nonNull(vo.getSubTitle())){
            criteria.eq("sub_title", vo.getSubTitle());
        }
        if(Objects.nonNull(vo.getDescription())){
            criteria.eq("description", vo.getDescription());
        }
        if(Objects.nonNull(vo.getOriginalPrice())){
            criteria.eq("original_price", vo.getOriginalPrice());
        }
        if(Objects.nonNull(vo.getStock())){
            criteria.eq("stock", vo.getStock());
        }
        if(Objects.nonNull(vo.getLowStock())){
            criteria.eq("low_stock", vo.getLowStock());
        }
        if(Objects.nonNull(vo.getUnit())){
            criteria.eq("unit", vo.getUnit());
        }
        if(Objects.nonNull(vo.getWeight())){
            criteria.eq("weight", vo.getWeight());
        }
        if(Objects.nonNull(vo.getPreviewStatus())){
            criteria.eq("preview_status", vo.getPreviewStatus());
        }
        if(Objects.nonNull(vo.getServiceIds())){
            criteria.eq("service_ids", vo.getServiceIds());
        }
        if(Objects.nonNull(vo.getKeywords())){
            criteria.eq("keywords", vo.getKeywords());
        }
        if(Objects.nonNull(vo.getNote())){
            criteria.eq("note", vo.getNote());
        }
        if(Objects.nonNull(vo.getAlbumPics())){
            criteria.eq("album_pics", vo.getAlbumPics());
        }
        if(Objects.nonNull(vo.getDetailTitle())){
            criteria.eq("detail_title", vo.getDetailTitle());
        }
        if(Objects.nonNull(vo.getDetailDesc())){
            criteria.eq("detail_desc", vo.getDetailDesc());
        }
        if(Objects.nonNull(vo.getDetailHtml())){
            criteria.eq("detail_html", vo.getDetailHtml());
        }
        if(Objects.nonNull(vo.getDetailMobileHtml())){
            criteria.eq("detail_mobile_html", vo.getDetailMobileHtml());
        }
        if(Objects.nonNull(vo.getPromotionStartTime())){
            criteria.eq("promotion_start_time", vo.getPromotionStartTime());
        }
        if(Objects.nonNull(vo.getPromotionEndTime())){
            criteria.eq("promotion_end_time", vo.getPromotionEndTime());
        }
        if(Objects.nonNull(vo.getPromotionPerLimit())){
            criteria.eq("promotion_per_limit", vo.getPromotionPerLimit());
        }
        if(Objects.nonNull(vo.getPromotionType())){
            criteria.eq("promotion_type", vo.getPromotionType());
        }
        if(Objects.nonNull(vo.getBrandName())){
            criteria.eq("brand_name", vo.getBrandName());
        }
        if(Objects.nonNull(vo.getProductCategoryName())){
            criteria.eq("product_category_name", vo.getProductCategoryName());
        }
    }
}