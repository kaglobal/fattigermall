<#-- 用于生成ElasticSearch的JavaBean的自定义模板 -->
package ${jsonParam.packagePath}

<#assign importDate = false />
<#assign importBigDecimal = false />
<#list tableInfo.fieldInfos as fieldInfo>
    <#if !importDate && fieldInfo.javaType == "Date">
        <#assign importDate = true />
    <#elseif !importBigDecimal && fieldInfo.javaType == "BigDecimal">
        <#assign importBigDecimal = true />
    </#if>
</#list>
<#if importDate>
import java.util.Date;
import cn.hutool.core.date.DatePattern;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.elasticsearch.annotations.DateFormat;
</#if>
<#if importBigDecimal>
import java.math.BigDecimal;
</#if>
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.annotation.Id;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.expect.cloud.common.domain.BaseDomain;

/**
 * <#if StringUtils.isNotBlank(tableInfo.remark)>${tableInfo.remark}(${tableInfo.tableName})<#else>${tableInfo.tableName}</#if>
 * 
 * @author ${paramConfig.author}
 * @version 1.0.0 ${today}
 */
@ApiModel(description = "${tableInfo.simpleRemark!tableInfo.tableName}")
@Document(indexName = "${tableInfo.lowerTableName}")
public class ${tableInfo.upperCamelCase} extends BaseDomain {
    /** 版本号 */
    private static final long serialVersionUID = ${tableInfo.serialVersionUID!'1'}L;
<#if tableInfo.fieldInfos?? && tableInfo.fieldInfos?size gt 0>
    <#if paramConfig.fileUpdateMode == 0 || paramConfig.fileUpdateMode == 1>

    /* ${String.format(paramConfig.mergeFileMarkBegin, 1)} */
    </#if>
    <#list tableInfo.fieldInfos as fieldInfo>

    @ApiModelProperty(value = "${fieldInfo.remark}")
    <#if fieldInfo.javaType == "Date">
    @JsonFormat(timezone = "GMT+8", pattern = DatePattern.NORM_DATETIME_PATTERN)
    @Field(type = FieldType.Date, format = DateFormat.custom, pattern = DatePattern.NORM_DATETIME_PATTERN)
    </#if>
    <#if fieldInfo.primaryKey>
    @Id
    </#if>
    private ${fieldInfo.javaType} ${fieldInfo.proName};
    </#list>
    <#if paramConfig.fileUpdateMode == 0 || paramConfig.fileUpdateMode == 1>

    /* ${String.format(paramConfig.mergeFileMarkEnd, 1)} */
    </#if>
    <#if paramConfig.fileUpdateMode == 0 || paramConfig.fileUpdateMode == 1>

    /* ${String.format(paramConfig.mergeFileMarkBegin, 2)} */
    </#if>
    <#list tableInfo.fieldInfos as fieldInfo>

    <#if paramConfig.buildFieldRemark == 0>
    /**
     * 获取${fieldInfo.remark!fieldInfo.proName}
     * 
     * @return ${fieldInfo.simpleRemark!fieldInfo.proName}
     */
    </#if>
    public ${fieldInfo.javaType} get${fieldInfo.upperCamelCase}() {
        return this.${fieldInfo.proName};
    }

    <#if paramConfig.buildFieldRemark == 0>
    /**
     * 设置${fieldInfo.remark!fieldInfo.proName}
     * 
     * @param ${fieldInfo.proName}
<#if StringUtils.isNotBlank(fieldInfo.simpleRemark)>
     *          ${fieldInfo.simpleRemark}
</#if>
     */
    </#if>
    public void set${fieldInfo.upperCamelCase}(${fieldInfo.javaType} ${fieldInfo.proName}) {
        this.${fieldInfo.proName} = ${fieldInfo.proName};
    }
    </#list>
    <#if paramConfig.fileUpdateMode == 0 || paramConfig.fileUpdateMode == 1>

    /* ${String.format(paramConfig.mergeFileMarkEnd, 2)} */
    </#if>
</#if>
}