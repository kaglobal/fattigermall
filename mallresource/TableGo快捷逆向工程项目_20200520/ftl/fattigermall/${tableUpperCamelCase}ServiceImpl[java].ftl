package ${jsonParam.moduleName}.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import ${jsonParam.moduleName}.dao.${tableInfo.upperCamelCase}DAO;
import ${jsonParam.moduleName}.entity.${tableInfo.upperCamelCase};
import ${jsonParam.moduleName}.service.${tableInfo.upperCamelCase}Service;
import org.springframework.stereotype.Service;

/**
 * ${tableInfo.remark} Service 实现类
 * 
 * @author ${paramConfig.author}
 * @version ${today}
 */
@Service
public class ${tableInfo.upperCamelCase}ServiceImpl extends ServiceImpl<${tableInfo.upperCamelCase}DAO,${tableInfo.upperCamelCase}> implements ${tableInfo.upperCamelCase}Service {

	private ${tableInfo.upperCamelCase}DAO ${tableInfo.lowerCamelCase}DAO;

	${tableInfo.upperCamelCase}ServiceImpl(${tableInfo.upperCamelCase}DAO ${tableInfo.lowerCamelCase}DAO){
		this.${tableInfo.lowerCamelCase}DAO = ${tableInfo.lowerCamelCase}DAO;
	}

}