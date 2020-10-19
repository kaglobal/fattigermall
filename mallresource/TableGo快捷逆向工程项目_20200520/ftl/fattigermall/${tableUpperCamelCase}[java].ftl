package ${jsonParam.moduleName}.entity;

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
</#if>
<#if importBigDecimal>import java.math.BigDecimal;</#if>
import lombok.*;

/**
 * ${tableInfo.remark}
 * 
 * @author ${paramConfig.author}
 * @version ${today}
 */
@Getter
@Setter
public class ${tableInfo.upperCamelCase} {
<#if tableInfo.fieldInfos??>
    <#list tableInfo.fieldInfos as fieldInfo>
    <#if paramConfig.buildFieldRemark == 0>
    /** <#if fieldInfo.remark?? && fieldInfo.remark?trim != "">${fieldInfo.remark}<#else>${fieldInfo.proName}</#if> */
    </#if>
    private ${fieldInfo.javaType} ${fieldInfo.proName};
    </#list>
</#if>
}