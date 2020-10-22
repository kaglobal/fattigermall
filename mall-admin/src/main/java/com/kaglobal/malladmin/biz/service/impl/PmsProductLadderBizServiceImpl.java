package com.kaglobal.malladmin.biz.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.kaglobal.malladmin.biz.service.PmsProductLadderBizService;
import com.kaglobal.malladmin.dto.PmsProductLadderDTO;
import com.kaglobal.malladmin.entity.PmsProductLadder;
import com.kaglobal.malladmin.vo.PmsProductLadderQueryVO;
import com.kaglobal.malladmin.vo.PmsProductLadderSaveVO;
import com.kaglobal.malladmin.service.PmsProductLadderService;
import org.springframework.stereotype.Service;
import java.util.Objects;

/**
 * 产品阶梯价格表(只针对同商品) 业务Service 实现类
 * 
 * @author bianj
 * @version 2020-10-19
 */
@Service
public class PmsProductLadderBizServiceImpl implements PmsProductLadderBizService {
    
	private PmsProductLadderService pmsProductLadderService;

	PmsProductLadderBizServiceImpl(PmsProductLadderService pmsProductLadderService){
		this.pmsProductLadderService = pmsProductLadderService;
	}

    
    protected void setCriteriaForQuery(PmsProductLadderQueryVO vo, QueryWrapper<PmsProductLadder> criteria) {
        if(Objects.nonNull(vo.getProductId())){
            criteria.eq("product_id", vo.getProductId());
        }
        if(Objects.nonNull(vo.getCount())){
            criteria.eq("count", vo.getCount());
        }
        if(Objects.nonNull(vo.getDiscount())){
            criteria.eq("discount", vo.getDiscount());
        }
        if(Objects.nonNull(vo.getPrice())){
            criteria.eq("price", vo.getPrice());
        }
    }
}