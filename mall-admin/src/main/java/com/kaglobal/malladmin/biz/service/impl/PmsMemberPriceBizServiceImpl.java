package com.kaglobal.malladmin.biz.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.kaglobal.malladmin.biz.service.PmsMemberPriceBizService;
import com.kaglobal.malladmin.dto.PmsMemberPriceDTO;
import com.kaglobal.malladmin.entity.PmsMemberPrice;
import com.kaglobal.malladmin.vo.PmsMemberPriceQueryVO;
import com.kaglobal.malladmin.vo.PmsMemberPriceSaveVO;
import com.kaglobal.malladmin.service.PmsMemberPriceService;
import org.springframework.stereotype.Service;
import java.util.Objects;

/**
 * 商品会员价格表 业务Service 实现类
 * 
 * @author bianj
 * @version 2020-10-19
 */
@Service
public class PmsMemberPriceBizServiceImpl implements PmsMemberPriceBizService {
    
	private PmsMemberPriceService pmsMemberPriceService;

	PmsMemberPriceBizServiceImpl(PmsMemberPriceService pmsMemberPriceService){
		this.pmsMemberPriceService = pmsMemberPriceService;
	}

    
    protected void setCriteriaForQuery(PmsMemberPriceQueryVO vo, QueryWrapper<PmsMemberPrice> criteria) {
        if(Objects.nonNull(vo.getProductId())){
            criteria.eq("product_id", vo.getProductId());
        }
        if(Objects.nonNull(vo.getMemberLevelId())){
            criteria.eq("member_level_id", vo.getMemberLevelId());
        }
        if(Objects.nonNull(vo.getMemberPrice())){
            criteria.eq("member_price", vo.getMemberPrice());
        }
        if(Objects.nonNull(vo.getMemberLevelName())){
            criteria.eq("member_level_name", vo.getMemberLevelName());
        }
    }
}