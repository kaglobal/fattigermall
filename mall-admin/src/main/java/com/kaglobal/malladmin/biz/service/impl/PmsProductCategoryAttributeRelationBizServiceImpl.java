package com.kaglobal.malladmin.biz.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.kaglobal.malladmin.biz.service.PmsProductCategoryAttributeRelationBizService;
import com.kaglobal.malladmin.dto.PmsProductCategoryAttributeRelationDTO;
import com.kaglobal.malladmin.entity.PmsProductCategoryAttributeRelation;
import com.kaglobal.malladmin.vo.PmsProductCategoryAttributeRelationQueryVO;
import com.kaglobal.malladmin.vo.PmsProductCategoryAttributeRelationSaveVO;
import com.kaglobal.malladmin.service.PmsProductCategoryAttributeRelationService;
import org.springframework.stereotype.Service;
import java.util.Objects;

/**
 * 产品的分类和属性的关系表，用于设置分类筛选条件（只支持一级分类） 业务Service 实现类
 * 
 * @author bianj
 * @version 2020-10-19
 */
@Service
public class PmsProductCategoryAttributeRelationBizServiceImpl implements PmsProductCategoryAttributeRelationBizService {
    
	private PmsProductCategoryAttributeRelationService pmsProductCategoryAttributeRelationService;

	PmsProductCategoryAttributeRelationBizServiceImpl(PmsProductCategoryAttributeRelationService pmsProductCategoryAttributeRelationService){
		this.pmsProductCategoryAttributeRelationService = pmsProductCategoryAttributeRelationService;
	}

    
    protected void setCriteriaForQuery(PmsProductCategoryAttributeRelationQueryVO vo, QueryWrapper<PmsProductCategoryAttributeRelation> criteria) {
        if(Objects.nonNull(vo.getProductCategoryId())){
            criteria.eq("product_category_id", vo.getProductCategoryId());
        }
        if(Objects.nonNull(vo.getProductAttributeId())){
            criteria.eq("product_attribute_id", vo.getProductAttributeId());
        }
    }
}