package com.kaglobal.malladmin.biz.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.kaglobal.malladmin.biz.service.PmsFeightTemplateBizService;
import com.kaglobal.malladmin.dto.PmsFeightTemplateDTO;
import com.kaglobal.malladmin.entity.PmsFeightTemplate;
import com.kaglobal.malladmin.vo.PmsFeightTemplateQueryVO;
import com.kaglobal.malladmin.vo.PmsFeightTemplateSaveVO;
import com.kaglobal.malladmin.service.PmsFeightTemplateService;
import org.springframework.stereotype.Service;
import java.util.Objects;

/**
 * 运费模版 业务Service 实现类
 * 
 * @author bianj
 * @version 2020-10-19
 */
@Service
public class PmsFeightTemplateBizServiceImpl implements PmsFeightTemplateBizService {
    
	private PmsFeightTemplateService pmsFeightTemplateService;

	PmsFeightTemplateBizServiceImpl(PmsFeightTemplateService pmsFeightTemplateService){
		this.pmsFeightTemplateService = pmsFeightTemplateService;
	}

    
    protected void setCriteriaForQuery(PmsFeightTemplateQueryVO vo, QueryWrapper<PmsFeightTemplate> criteria) {
        if(Objects.nonNull(vo.getName())){
            criteria.eq("name", vo.getName());
        }
        if(Objects.nonNull(vo.getChargeType())){
            criteria.eq("charge_type", vo.getChargeType());
        }
        if(Objects.nonNull(vo.getFirstWeight())){
            criteria.eq("first_weight", vo.getFirstWeight());
        }
        if(Objects.nonNull(vo.getFirstFee())){
            criteria.eq("first_fee", vo.getFirstFee());
        }
        if(Objects.nonNull(vo.getContinueWeight())){
            criteria.eq("continue_weight", vo.getContinueWeight());
        }
        if(Objects.nonNull(vo.getContinmeFee())){
            criteria.eq("continme_fee", vo.getContinmeFee());
        }
        if(Objects.nonNull(vo.getDest())){
            criteria.eq("dest", vo.getDest());
        }
    }
}