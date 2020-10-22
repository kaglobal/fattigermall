package com.kaglobal.malladmin.biz.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.kaglobal.malladmin.biz.service.PmsProductCategoryBizService;
import com.kaglobal.malladmin.dto.PmsProductCategoryDTO;
import com.kaglobal.malladmin.entity.PmsProductCategory;
import com.kaglobal.malladmin.vo.PmsProductCategoryQueryVO;
import com.kaglobal.malladmin.vo.PmsProductCategorySaveVO;
import com.kaglobal.malladmin.service.PmsProductCategoryService;
import org.springframework.stereotype.Service;
import java.util.Objects;

/**
 * 产品分类 业务Service 实现类
 * 
 * @author bianj
 * @version 2020-10-19
 */
@Service
public class PmsProductCategoryBizServiceImpl implements PmsProductCategoryBizService {
    
	private PmsProductCategoryService pmsProductCategoryService;

	PmsProductCategoryBizServiceImpl(PmsProductCategoryService pmsProductCategoryService){
		this.pmsProductCategoryService = pmsProductCategoryService;
	}

    
    protected void setCriteriaForQuery(PmsProductCategoryQueryVO vo, QueryWrapper<PmsProductCategory> criteria) {
        if(Objects.nonNull(vo.getParentId())){
            criteria.eq("parent_id", vo.getParentId());
        }
        if(Objects.nonNull(vo.getName())){
            criteria.eq("name", vo.getName());
        }
        if(Objects.nonNull(vo.getLevel())){
            criteria.eq("level", vo.getLevel());
        }
        if(Objects.nonNull(vo.getProductCount())){
            criteria.eq("product_count", vo.getProductCount());
        }
        if(Objects.nonNull(vo.getProductUnit())){
            criteria.eq("product_unit", vo.getProductUnit());
        }
        if(Objects.nonNull(vo.getNavStatus())){
            criteria.eq("nav_status", vo.getNavStatus());
        }
        if(Objects.nonNull(vo.getShowStatus())){
            criteria.eq("show_status", vo.getShowStatus());
        }
        if(Objects.nonNull(vo.getSort())){
            criteria.eq("sort", vo.getSort());
        }
        if(Objects.nonNull(vo.getIcon())){
            criteria.eq("icon", vo.getIcon());
        }
        if(Objects.nonNull(vo.getKeywords())){
            criteria.eq("keywords", vo.getKeywords());
        }
        if(Objects.nonNull(vo.getDescription())){
            criteria.eq("description", vo.getDescription());
        }
    }
}