package com.kaglobal.malladmin.biz.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.kaglobal.malladmin.biz.service.PmsBrandBizService;
import com.kaglobal.malladmin.dto.PmsBrandDTO;
import com.kaglobal.malladmin.entity.PmsBrand;
import com.kaglobal.malladmin.vo.PmsBrandQueryVO;
import com.kaglobal.malladmin.vo.PmsBrandSaveVO;
import com.kaglobal.malladmin.service.PmsBrandService;
import org.springframework.stereotype.Service;
import java.util.Objects;

/**
 * 品牌表 业务Service 实现类
 * 
 * @author bianj
 * @version 2020-10-19
 */
@Service
public class PmsBrandBizServiceImpl implements PmsBrandBizService {
    
	private PmsBrandService pmsBrandService;

	PmsBrandBizServiceImpl(PmsBrandService pmsBrandService){
		this.pmsBrandService = pmsBrandService;
	}

    
    protected void setCriteriaForQuery(PmsBrandQueryVO vo, QueryWrapper<PmsBrand> criteria) {
        if(Objects.nonNull(vo.getName())){
            criteria.eq("name", vo.getName());
        }
        if(Objects.nonNull(vo.getFirstLetter())){
            criteria.eq("first_letter", vo.getFirstLetter());
        }
        if(Objects.nonNull(vo.getSort())){
            criteria.eq("sort", vo.getSort());
        }
        if(Objects.nonNull(vo.getFactoryStatus())){
            criteria.eq("factory_status", vo.getFactoryStatus());
        }
        if(Objects.nonNull(vo.getShowStatus())){
            criteria.eq("show_status", vo.getShowStatus());
        }
        if(Objects.nonNull(vo.getProductCount())){
            criteria.eq("product_count", vo.getProductCount());
        }
        if(Objects.nonNull(vo.getProductCommentCount())){
            criteria.eq("product_comment_count", vo.getProductCommentCount());
        }
        if(Objects.nonNull(vo.getLogo())){
            criteria.eq("logo", vo.getLogo());
        }
        if(Objects.nonNull(vo.getBigPic())){
            criteria.eq("big_pic", vo.getBigPic());
        }
        if(Objects.nonNull(vo.getBrandStory())){
            criteria.eq("brand_story", vo.getBrandStory());
        }
    }
}