<#-- 用于生成JavaBean的自定义模板 -->
<#if jsonParam.searchFeilds?? && jsonParam.searchFeilds["${tableInfo.upperTableName}"]??>
    <#-- 初始化表的查询字段 -->
    <#assign searchFeilds = jsonParam.searchFeilds["${tableInfo.upperTableName}"] />
</#if>
package ${jsonParam.packagePath}

<#assign importDate = false />
<#assign importBigDecimal = false />
<#list tableInfo.fieldInfos as fieldInfo>
    <#list searchFeilds as fieldName>
        <#if StringUtils.equalsIgnoreCase(fieldInfo.colName, fieldName)>
            <#if !importDate && fieldInfo.javaType == "Date">
                <#assign importDate = true />
            <#elseif !importBigDecimal && fieldInfo.javaType == "BigDecimal">
                <#assign importBigDecimal = true />
            </#if>
        </#if>
    </#list>
</#list>
<#if importDate>
import java.util.Date;
import cn.hutool.core.date.DatePattern;
import com.fasterxml.jackson.annotation.JsonFormat;
</#if>
<#if importBigDecimal>
import java.math.BigDecimal;
</#if>
import com.expect.cloud.common.domain.condition.BaseCondition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <#if StringUtils.isNotBlank(tableInfo.simpleRemark)>${tableInfo.simpleRemark}<#else>${tableInfo.tableName}</#if>查询条件
 * 
 * @author ${paramConfig.author}
 * @version 1.0.0 ${today}
 */
@ApiModel(description = "${tableInfo.simpleRemark!tableInfo.tableName}查询条件")
public class ${tableInfo.upperCamelCase}Condition extends BaseCondition {
    /** 版本号 */
    private static final long serialVersionUID = ${tableInfo.serialVersionUID!'1'}L;
<#if searchFeilds??>
    <#list tableInfo.fieldInfos as fieldInfo>
        <#list searchFeilds as fieldName>
            <#if StringUtils.equalsIgnoreCase(fieldInfo.colName, fieldName)>

    <#if fieldInfo.javaType == "Date">
    @ApiModelProperty(value = "${fieldInfo.remark}(开始)")
    @JsonFormat(timezone = "GMT+8", pattern = DatePattern.NORM_DATE_PATTERN)
    private ${fieldInfo.javaType} ${fieldInfo.proName}Begin;

    @ApiModelProperty(value = "${fieldInfo.remark}(结束)")
    @JsonFormat(timezone = "GMT+8", pattern = DatePattern.NORM_DATE_PATTERN)
    private ${fieldInfo.javaType} ${fieldInfo.proName}End;
    <#else>
    @ApiModelProperty(value = "${fieldInfo.remark}")
    private ${fieldInfo.javaType} ${fieldInfo.proName};
    </#if>
            </#if>
        </#list>
    </#list>
    <#list tableInfo.fieldInfos as fieldInfo>
        <#list searchFeilds as fieldName>
            <#if StringUtils.equalsIgnoreCase(fieldInfo.colName, fieldName)>

    <#if fieldInfo.javaType == "Date">
    /**
     * 获取${fieldInfo.simpleRemark!fieldInfo.proName}(开始)
     * 
     * @return ${fieldInfo.simpleRemark!fieldInfo.proName}(开始)
     */
    public ${fieldInfo.javaType} get${fieldInfo.upperCamelCase}Begin() {
        return this.${fieldInfo.proName}Begin;
    }

    /**
     * 设置${fieldInfo.simpleRemark!fieldInfo.proName}(开始)
     * 
     * @param ${fieldInfo.proName}Begin
    <#if StringUtils.isNotBlank(fieldInfo.simpleRemark)>
     *          ${fieldInfo.simpleRemark}(开始)
    </#if>
     */
    public void set${fieldInfo.upperCamelCase}Begin(${fieldInfo.javaType} ${fieldInfo.proName}Begin) {
        this.${fieldInfo.proName}Begin = ${fieldInfo.proName}Begin;
    }

    /**
     * 获取${fieldInfo.simpleRemark!fieldInfo.proName}(结束)
     * 
     * @return ${fieldInfo.simpleRemark!fieldInfo.proName}(结束)
     */
    public ${fieldInfo.javaType} get${fieldInfo.upperCamelCase}End() {
        return this.${fieldInfo.proName}End;
    }

    /**
     * 设置${fieldInfo.simpleRemark!fieldInfo.proName}(结束)
     * 
     * @param ${fieldInfo.proName}End
    <#if StringUtils.isNotBlank(fieldInfo.simpleRemark)>
     *          ${fieldInfo.simpleRemark}(结束)
    </#if>
     */
    public void set${fieldInfo.upperCamelCase}End(${fieldInfo.javaType} ${fieldInfo.proName}End) {
        this.${fieldInfo.proName}End = ${fieldInfo.proName}End;
    }
    <#else>
    /**
     * 获取${fieldInfo.remark!fieldInfo.proName}
     * 
     * @return ${fieldInfo.simpleRemark!fieldInfo.proName}
     */
    public ${fieldInfo.javaType} get${fieldInfo.upperCamelCase}() {
        return this.${fieldInfo.proName};
    }

    /**
     * 设置${fieldInfo.remark!fieldInfo.proName}
     * 
     * @param ${fieldInfo.proName}
    <#if StringUtils.isNotBlank(fieldInfo.simpleRemark)>
     *          ${fieldInfo.simpleRemark}
    </#if>
     */
    public void set${fieldInfo.upperCamelCase}(${fieldInfo.javaType} ${fieldInfo.proName}) {
        this.${fieldInfo.proName} = ${fieldInfo.proName};
    }
    </#if>
            </#if>
        </#list>
    </#list>
</#if>
}