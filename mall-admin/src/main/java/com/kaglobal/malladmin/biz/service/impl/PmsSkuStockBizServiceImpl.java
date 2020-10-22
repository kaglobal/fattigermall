package com.kaglobal.malladmin.biz.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.kaglobal.malladmin.biz.service.PmsSkuStockBizService;
import com.kaglobal.malladmin.dto.PmsSkuStockDTO;
import com.kaglobal.malladmin.entity.PmsSkuStock;
import com.kaglobal.malladmin.vo.PmsSkuStockQueryVO;
import com.kaglobal.malladmin.vo.PmsSkuStockSaveVO;
import com.kaglobal.malladmin.service.PmsSkuStockService;
import org.springframework.stereotype.Service;
import java.util.Objects;

/**
 * sku的库存 业务Service 实现类
 * 
 * @author bianj
 * @version 2020-10-19
 */
@Service
public class PmsSkuStockBizServiceImpl implements PmsSkuStockBizService {
    
	private PmsSkuStockService pmsSkuStockService;

	PmsSkuStockBizServiceImpl(PmsSkuStockService pmsSkuStockService){
		this.pmsSkuStockService = pmsSkuStockService;
	}

    
    protected void setCriteriaForQuery(PmsSkuStockQueryVO vo, QueryWrapper<PmsSkuStock> criteria) {
        if(Objects.nonNull(vo.getProductId())){
            criteria.eq("product_id", vo.getProductId());
        }
        if(Objects.nonNull(vo.getSkuCode())){
            criteria.eq("sku_code", vo.getSkuCode());
        }
        if(Objects.nonNull(vo.getPrice())){
            criteria.eq("price", vo.getPrice());
        }
        if(Objects.nonNull(vo.getStock())){
            criteria.eq("stock", vo.getStock());
        }
        if(Objects.nonNull(vo.getLowStock())){
            criteria.eq("low_stock", vo.getLowStock());
        }
        if(Objects.nonNull(vo.getPic())){
            criteria.eq("pic", vo.getPic());
        }
        if(Objects.nonNull(vo.getSale())){
            criteria.eq("sale", vo.getSale());
        }
        if(Objects.nonNull(vo.getPromotionPrice())){
            criteria.eq("promotion_price", vo.getPromotionPrice());
        }
        if(Objects.nonNull(vo.getLockStock())){
            criteria.eq("lock_stock", vo.getLockStock());
        }
        if(Objects.nonNull(vo.getSpData())){
            criteria.eq("sp_data", vo.getSpData());
        }
    }
}