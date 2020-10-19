package com.kaglobal.malladmin.vo;

<#assign importDate = false />
<#assign importBigDecimal = false />
<#list tableInfo.fieldInfos as fieldInfo>
    <#if !importDate && fieldInfo.javaType == "Date">
        <#assign importDate = true />
    <#elseif !importBigDecimal && fieldInfo.javaType == "BigDecimal">
        <#assign importBigDecimal = true />
    </#if>
</#list>
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
<#if importDate>
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
</#if>
<#if importBigDecimal>import java.math.BigDecimal;</#if>
import lombok.Data;

/**
 * 查询${tableInfo.remark}VO
 * 
 * @author ${paramConfig.author}
 * @version ${today}
 */
@Data
@ApiModel(description = "查询${tableInfo.simpleRemark}VO")
public class ${tableInfo.upperCamelCase}QueryVO {
<#if tableInfo.fieldInfos??>
    <#list tableInfo.fieldInfos as fieldInfo>

    <#if paramConfig.buildFieldRemark == 0>
    /** <#if fieldInfo.remark?? && fieldInfo.remark?trim != "">${fieldInfo.remark}<#else>${fieldInfo.proName}</#if> */
    </#if>
    @ApiModelProperty(value = "${fieldInfo.remark?replace("\"","")}"<#if fieldInfo_index gt 0>, position = ${fieldInfo_index}</#if>)
    <#if fieldInfo.javaType == "Date">
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    </#if>
    private ${fieldInfo.javaType} ${fieldInfo.proName};
    </#list>
</#if>
}