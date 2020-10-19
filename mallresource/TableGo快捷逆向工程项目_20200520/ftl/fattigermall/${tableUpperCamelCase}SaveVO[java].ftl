package ${jsonParam.moduleName}.vo;

<#assign importDate = false />
<#assign importBigDecimal = false />
<#assign importValidator = false />
<#list tableInfo.fieldInfos as fieldInfo>
    <#if !importDate && fieldInfo.javaType == "Date">
        <#assign importDate = true />
    <#elseif !importBigDecimal && fieldInfo.javaType == "BigDecimal">
        <#assign importBigDecimal = true />
    <#elseif !importValidator && fieldInfo.javaType == "String">
        <#assign importValidator = true />
    </#if>
</#list>
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
<#if importDate>
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
</#if>
<#if importBigDecimal>import java.math.BigDecimal;</#if>
import javax.validation.constraints.NotNull;
<#if importValidator>
import org.hibernate.validator.constraints.*;
</#if>
import lombok.Data;

/**
 * ${tableInfo.remark}VO
 * 
 * @author ${paramConfig.author}
 * @version ${today}
 */
@Data
@ApiModel(description = "${tableInfo.simpleRemark}VO")
public class ${tableInfo.upperCamelCase}SaveVO {
<#if tableInfo.fieldInfos??>
    <#list tableInfo.fieldInfos as fieldInfo>
    <#if paramConfig.buildFieldRemark == 0>
    /** <#if fieldInfo.remark?? && fieldInfo.remark?trim != "">${fieldInfo.remark}<#else>${fieldInfo.proName}</#if> */
    </#if>
    @ApiModelProperty(value = "${fieldInfo.remark?replace("\"","")}"<#if fieldInfo_index gt 0>, position = ${fieldInfo_index}</#if> <#if fieldInfo.isNotNull>, required = true</#if>)
    <#if fieldInfo.isNotNull>
    @NotNull(message = "${fieldInfo.remark}不能为空")
    </#if>
    <#if fieldInfo.javaType == "String">
    @Length(max=${fieldInfo.length}, message = "${fieldInfo.remark}不能大于${fieldInfo.length}")
    </#if>
    <#if fieldInfo.javaType == "Date">
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    </#if>
    private ${fieldInfo.javaType} ${fieldInfo.proName};
    </#list>
</#if>
}