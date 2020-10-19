<#-- 生成Controller的自定义模板 -->
package ${jsonParam.packagePath}

import org.springframework.data.domain.Page;
import com.expect.cloud.common.controller.BaseController;
import com.expect.cloud.common.domain.PageQueryResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.collections.CollectionUtils;
import ${jsonParam.basePackagePath}.api.core.domain.${jsonParam.moduleName}.${tableInfo.upperCamelCase};
import ${jsonParam.basePackagePath}.api.core.condition.${jsonParam.moduleName}.${tableInfo.upperCamelCase}Condition;
import ${jsonParam.basePackagePath}.${jsonParam.moduleName}.service.${tableInfo.upperCamelCase}Service;

/**
 * ${tableInfo.simpleRemark}Controller
 * 
 * @author ${paramConfig.author}
 * @version 1.0.0 ${today}
 */
@Api(tags = "${tableInfo.simpleRemark!tableInfo.tableName}微服务")
@RestController
@RequestMapping("/${tableInfo.lowerCamelCase}")
public class ${tableInfo.upperCamelCase}Controller extends BaseController {
    @Autowired
    private ${tableInfo.upperCamelCase}Service ${tableInfo.lowerCamelCase}Service;

    @ApiOperation(value = "根据查询参数分页查询${tableInfo.simpleRemark}列表")
    @ApiImplicitParam(name = "condition", value = "${tableInfo.simpleRemark}查询条件", required = true, dataType = "${tableInfo.upperCamelCase}Condition", paramType = "body")
    @PostMapping("/list${tableInfo.upperCamelCase}Page")
    public PageQueryResult<${tableInfo.upperCamelCase}> list${tableInfo.upperCamelCase}Page(@RequestBody ${tableInfo.upperCamelCase}Condition condition) {
        Page<${tableInfo.upperCamelCase}> page = ${tableInfo.lowerCamelCase}Service.list${tableInfo.upperCamelCase}Page(condition);
        return new PageQueryResult<>(condition.getPage(), page.getTotalElements(), page.getTotalPages(), page.getContent());
    }

    @ApiOperation(value = "根据主键ID查询${tableInfo.simpleRemark}")
    @ApiImplicitParam(name = "${tableInfo.pkLowerCamelName}", value = "主键ID", required = true, dataType = "string", paramType = "body")
    @PostMapping("/get${tableInfo.upperCamelCase}ById")
    public ${tableInfo.upperCamelCase} get${tableInfo.upperCamelCase}ById(@RequestBody String ${tableInfo.pkLowerCamelName}) {
        if (StringUtils.isBlank(${tableInfo.pkLowerCamelName})) {
            return null;
        }
        return ${tableInfo.lowerCamelCase}Service.get${tableInfo.upperCamelCase}ById(${tableInfo.pkLowerCamelName});
    }

    @ApiOperation(value = "保存${tableInfo.simpleRemark}")
    @ApiImplicitParam(name = "${tableInfo.lowerCamelCase}", value = "${tableInfo.simpleRemark}信息", required = true, dataType = "${tableInfo.upperCamelCase}", paramType = "body")
    @PostMapping("/save${tableInfo.upperCamelCase}")
    public Boolean save${tableInfo.upperCamelCase}(@RequestBody ${tableInfo.upperCamelCase} ${tableInfo.lowerCamelCase}) {
        return ${tableInfo.lowerCamelCase}Service.save${tableInfo.upperCamelCase}(${tableInfo.lowerCamelCase});
    }

    @ApiOperation(value = "批量保存${tableInfo.simpleRemark}")
    @ApiImplicitParam(name = "${tableInfo.lowerCamelCase}List", value = "${tableInfo.simpleRemark}信息列表", required = true, dataType = "${tableInfo.upperCamelCase}", paramType = "body", allowMultiple = true)
    @PostMapping("/batchSave${tableInfo.upperCamelCase}")
    public Boolean batchSave${tableInfo.upperCamelCase}(@RequestBody List<${tableInfo.upperCamelCase}> ${tableInfo.lowerCamelCase}List) {
        return ${tableInfo.lowerCamelCase}Service.batchSave${tableInfo.upperCamelCase}(${tableInfo.lowerCamelCase}List);
    }

    @ApiOperation(value = "根据主键ID删除${tableInfo.simpleRemark}")
    @ApiImplicitParam(name = "${tableInfo.pkLowerCamelName}", value = "主键ID", required = true, dataType = "${tableInfo.pkJavaType?uncap_first}", paramType = "body")
    @PostMapping("/delete${tableInfo.upperCamelCase}ById")
    public Boolean delete${tableInfo.upperCamelCase}ById(@RequestBody ${tableInfo.pkJavaType} ${tableInfo.pkLowerCamelName}) {
        if (StringUtils.isBlank(${tableInfo.pkLowerCamelName})) {
            return false;
        }
        return ${tableInfo.lowerCamelCase}Service.delete${tableInfo.upperCamelCase}ById(${tableInfo.pkLowerCamelName});
    }

    @ApiOperation(value = "根据主键ID集合批量删除${tableInfo.simpleRemark}")
    @ApiImplicitParam(name = "ids", value = "主键ID集合", required = true, paramType = "body", allowMultiple = true)
    @PostMapping("/delete${tableInfo.upperCamelCase}ByIds")
    public Boolean delete${tableInfo.upperCamelCase}ByIds(@RequestBody List<${tableInfo.pkJavaType}> ids) {
        if (CollectionUtils.isEmpty(ids)) {
            return false;
        }
        return ${tableInfo.lowerCamelCase}Service.delete${tableInfo.upperCamelCase}ByIds(ids);
    }

    @ApiOperation("创建${tableInfo.simpleRemark}索引")
    @PostMapping("/create${tableInfo.upperCamelCase}Index")
    public Boolean create${tableInfo.upperCamelCase}Index() {
        Boolean b1 = ${tableInfo.lowerCamelCase}Service.create${tableInfo.upperCamelCase}Index();
        Boolean b2 = ${tableInfo.lowerCamelCase}Service.putMapping${tableInfo.upperCamelCase}Index();
        return b1 && b2;
    }

    @ApiOperation("删除${tableInfo.simpleRemark}索引")
    @PostMapping("/delete${tableInfo.upperCamelCase}Index")
    public Boolean delete${tableInfo.upperCamelCase}Index() {
        return ${tableInfo.lowerCamelCase}Service.delete${tableInfo.upperCamelCase}Index();
    }
}