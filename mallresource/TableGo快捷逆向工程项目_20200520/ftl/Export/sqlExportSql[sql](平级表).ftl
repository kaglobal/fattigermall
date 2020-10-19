<#-- 自定义模板导出数据生成SQL -->
<#if CollectionUtils.isNotEmpty(tableInfoList)>
    <#if jsonParam.sqlList?has_content>
        <#list jsonParam.sqlList as sql>
            <#list tableInfoList as tableInfo>
                <#if StringUtils.indexOfIgnoreCase(sql.tableNames, tableInfo.tableName) != -1>
TRUNCATE TABLE ${tableInfo.originalTableName};
                </#if>
            </#list>
        </#list>
    </#if>
    <#list tableInfoList as tableInfo>
        <#if tableInfo.sqlQueryData?has_content>

            <#list tableInfo.sqlQueryData?values as queryData>
                <#list queryData as data>
INSERT INTO ${tableInfo.originalTableName}(<#list tableInfo.fieldInfos as fieldInfo>${fieldInfo.originalColName}<#if fieldInfo_has_next>, </#if></#list>) VALUES (<#list tableInfo.fieldInfos as fieldInfo><#if !data[fieldInfo.originalColName]??>NULL<#elseif fieldInfo.isNumericType>${data[fieldInfo.originalColName]}<#else>'${data[fieldInfo.originalColName]}'</#if><#if fieldInfo_has_next>, </#if></#list>);
                </#list>
            </#list>
        </#if>
    </#list>
</#if>