package com.kaglobal.malladmin.biz.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.kaglobal.malladmin.biz.service.PmsProductAttributeValueBizService;
import com.kaglobal.malladmin.dto.PmsProductAttributeValueDTO;
import com.kaglobal.malladmin.entity.PmsProductAttributeValue;
import com.kaglobal.malladmin.vo.PmsProductAttributeValueQueryVO;
import com.kaglobal.malladmin.vo.PmsProductAttributeValueSaveVO;
import com.kaglobal.malladmin.service.PmsProductAttributeValueService;
import org.springframework.stereotype.Service;
import java.util.Objects;

/**
 * 存储产品参数信息的表 业务Service 实现类
 * 
 * @author bianj
 * @version 2020-10-19
 */
@Service
public class PmsProductAttributeValueBizServiceImpl implements PmsProductAttributeValueBizService {
    
	private PmsProductAttributeValueService pmsProductAttributeValueService;

	PmsProductAttributeValueBizServiceImpl(PmsProductAttributeValueService pmsProductAttributeValueService){
		this.pmsProductAttributeValueService = pmsProductAttributeValueService;
	}

    
    protected void setCriteriaForQuery(PmsProductAttributeValueQueryVO vo, QueryWrapper<PmsProductAttributeValue> criteria) {
        if(Objects.nonNull(vo.getProductId())){
            criteria.eq("product_id", vo.getProductId());
        }
        if(Objects.nonNull(vo.getProductAttributeId())){
            criteria.eq("product_attribute_id", vo.getProductAttributeId());
        }
        if(Objects.nonNull(vo.getValue())){
            criteria.eq("value", vo.getValue());
        }
    }
}