package com.kaglobal.malladmin.biz.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.kaglobal.malladmin.biz.service.PmsProductAttributeBizService;
import com.kaglobal.malladmin.dto.PmsProductAttributeDTO;
import com.kaglobal.malladmin.entity.PmsProductAttribute;
import com.kaglobal.malladmin.vo.PmsProductAttributeQueryVO;
import com.kaglobal.malladmin.vo.PmsProductAttributeSaveVO;
import com.kaglobal.malladmin.service.PmsProductAttributeService;
import org.springframework.stereotype.Service;
import java.util.Objects;

/**
 * 商品属性参数表 业务Service 实现类
 * 
 * @author bianj
 * @version 2020-10-19
 */
@Service
public class PmsProductAttributeBizServiceImpl implements PmsProductAttributeBizService {
    
	private PmsProductAttributeService pmsProductAttributeService;

	PmsProductAttributeBizServiceImpl(PmsProductAttributeService pmsProductAttributeService){
		this.pmsProductAttributeService = pmsProductAttributeService;
	}

    
    protected void setCriteriaForQuery(PmsProductAttributeQueryVO vo, QueryWrapper<PmsProductAttribute> criteria) {
        if(Objects.nonNull(vo.getProductAttributeCategoryId())){
            criteria.eq("product_attribute_category_id", vo.getProductAttributeCategoryId());
        }
        if(Objects.nonNull(vo.getName())){
            criteria.eq("name", vo.getName());
        }
        if(Objects.nonNull(vo.getSelectType())){
            criteria.eq("select_type", vo.getSelectType());
        }
        if(Objects.nonNull(vo.getInputType())){
            criteria.eq("input_type", vo.getInputType());
        }
        if(Objects.nonNull(vo.getInputList())){
            criteria.eq("input_list", vo.getInputList());
        }
        if(Objects.nonNull(vo.getSort())){
            criteria.eq("sort", vo.getSort());
        }
        if(Objects.nonNull(vo.getFilterType())){
            criteria.eq("filter_type", vo.getFilterType());
        }
        if(Objects.nonNull(vo.getSearchType())){
            criteria.eq("search_type", vo.getSearchType());
        }
        if(Objects.nonNull(vo.getRelatedStatus())){
            criteria.eq("related_status", vo.getRelatedStatus());
        }
        if(Objects.nonNull(vo.getHandAddStatus())){
            criteria.eq("hand_add_status", vo.getHandAddStatus());
        }
        if(Objects.nonNull(vo.getType())){
            criteria.eq("type", vo.getType());
        }
    }
}