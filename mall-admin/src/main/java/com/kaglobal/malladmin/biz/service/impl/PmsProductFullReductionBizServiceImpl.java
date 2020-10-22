package com.kaglobal.malladmin.biz.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.kaglobal.malladmin.biz.service.PmsProductFullReductionBizService;
import com.kaglobal.malladmin.dto.PmsProductFullReductionDTO;
import com.kaglobal.malladmin.entity.PmsProductFullReduction;
import com.kaglobal.malladmin.vo.PmsProductFullReductionQueryVO;
import com.kaglobal.malladmin.vo.PmsProductFullReductionSaveVO;
import com.kaglobal.malladmin.service.PmsProductFullReductionService;
import org.springframework.stereotype.Service;
import java.util.Objects;

/**
 * 产品满减表(只针对同商品) 业务Service 实现类
 * 
 * @author bianj
 * @version 2020-10-19
 */
@Service
public class PmsProductFullReductionBizServiceImpl implements PmsProductFullReductionBizService {
    
	private PmsProductFullReductionService pmsProductFullReductionService;

	PmsProductFullReductionBizServiceImpl(PmsProductFullReductionService pmsProductFullReductionService){
		this.pmsProductFullReductionService = pmsProductFullReductionService;
	}

    
    protected void setCriteriaForQuery(PmsProductFullReductionQueryVO vo, QueryWrapper<PmsProductFullReduction> criteria) {
        if(Objects.nonNull(vo.getProductId())){
            criteria.eq("product_id", vo.getProductId());
        }
        if(Objects.nonNull(vo.getFullPrice())){
            criteria.eq("full_price", vo.getFullPrice());
        }
        if(Objects.nonNull(vo.getReducePrice())){
            criteria.eq("reduce_price", vo.getReducePrice());
        }
    }
}