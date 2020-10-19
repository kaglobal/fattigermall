package ${jsonParam.moduleName}.rest.v1;

import ${jsonParam.moduleName}.biz.sevice.${tableInfo.upperCamelCase}BizService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能：${tableInfo.remark} 接口
 * @author ${paramConfig.author}
 * @version ${today}
 */
@Api(tags = "${tableInfo.lowerTableName?replace('_','-')}",description = "${tableInfo.remark?replace("\"","")}")
@RestController
@RequestMapping("/v1/${jsonParam.webModule}/${tableInfo.lowerTableName?replace('_','-')}")
public class ${tableInfo.upperCamelCase}Controller {
	
	private ${tableInfo.upperCamelCase}BizService ${tableInfo.lowerCamelCase}BizService;

	${tableInfo.upperCamelCase}Controller(${tableInfo.upperCamelCase}BizService ${tableInfo.lowerCamelCase}BizService){
		this.${tableInfo.lowerCamelCase}BizService = ${tableInfo.lowerCamelCase}BizService;
	}
	
}