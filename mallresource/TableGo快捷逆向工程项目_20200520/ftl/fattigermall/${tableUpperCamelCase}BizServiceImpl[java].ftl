package ${jsonParam.moduleName}.biz.sevice.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import ${jsonParam.moduleName}.biz.service.${tableInfo.upperCamelCase}BizService;
import ${jsonParam.moduleName}.dto.${tableInfo.upperCamelCase}DTO;
import ${jsonParam.moduleName}.entity.${tableInfo.upperCamelCase};
import ${jsonParam.moduleName}.vo.${tableInfo.upperCamelCase}QueryVO;
import ${jsonParam.moduleName}.vo.${tableInfo.upperCamelCase}SaveVO;
import ${jsonParam.moduleName}.service.${tableInfo.upperCamelCase}Service;
import org.springframework.stereotype.Service;
import java.util.Objects;

/**
 * ${tableInfo.remark} 业务Service 实现类
 * 
 * @author ${paramConfig.author}
 * @version ${today}
 */
@Service
public class ${tableInfo.upperCamelCase}BizServiceImpl implements ${tableInfo.upperCamelCase}BizService {
    
	private ${tableInfo.upperCamelCase}Service ${tableInfo.lowerCamelCase}Service;

	${tableInfo.upperCamelCase}BizServiceImpl(${tableInfo.upperCamelCase}Service ${tableInfo.lowerCamelCase}Service){
		this.${tableInfo.lowerCamelCase}Service = ${tableInfo.lowerCamelCase}Service;
	}

    
    protected void setCriteriaForQuery(${tableInfo.upperCamelCase}QueryVO vo, QueryWrapper<${tableInfo.upperCamelCase}> criteria) {
        <#list tableInfo.fieldInfos as fieldInfo>
        <#if fieldInfo.lowerColName != 'id'>
        if(Objects.nonNull(vo.get${fieldInfo.upperCamelCase}())){
            criteria.eq("${fieldInfo.originalColName}", vo.get${fieldInfo.upperCamelCase}());
        }
        </#if>
        </#list>
    }
}