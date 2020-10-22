package com.kaglobal.malladmin.biz.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.kaglobal.malladmin.biz.service.PmsProductAttributeCategoryBizService;
import com.kaglobal.malladmin.dto.PmsProductAttributeCategoryDTO;
import com.kaglobal.malladmin.entity.PmsProductAttributeCategory;
import com.kaglobal.malladmin.vo.PmsProductAttributeCategoryQueryVO;
import com.kaglobal.malladmin.vo.PmsProductAttributeCategorySaveVO;
import com.kaglobal.malladmin.service.PmsProductAttributeCategoryService;
import org.springframework.stereotype.Service;
import java.util.Objects;

/**
 * 产品属性分类表 业务Service 实现类
 * 
 * @author bianj
 * @version 2020-10-19
 */
@Service
public class PmsProductAttributeCategoryBizServiceImpl implements PmsProductAttributeCategoryBizService {
    
	private PmsProductAttributeCategoryService pmsProductAttributeCategoryService;

	PmsProductAttributeCategoryBizServiceImpl(PmsProductAttributeCategoryService pmsProductAttributeCategoryService){
		this.pmsProductAttributeCategoryService = pmsProductAttributeCategoryService;
	}

    
    protected void setCriteriaForQuery(PmsProductAttributeCategoryQueryVO vo, QueryWrapper<PmsProductAttributeCategory> criteria) {
        if(Objects.nonNull(vo.getName())){
            criteria.eq("name", vo.getName());
        }
        if(Objects.nonNull(vo.getAttributeCount())){
            criteria.eq("attribute_count", vo.getAttributeCount());
        }
        if(Objects.nonNull(vo.getParamCount())){
            criteria.eq("param_count", vo.getParamCount());
        }
    }
}