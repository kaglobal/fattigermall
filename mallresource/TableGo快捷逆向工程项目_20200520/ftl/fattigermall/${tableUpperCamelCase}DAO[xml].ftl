<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd">

<!-- <#if tableInfo.simpleRemark?? && tableInfo.simpleRemark?trim != "">${tableInfo.simpleRemark}<#else>${tableInfo.tableName}</#if> -->
<mapper namespace="${jsonParam.moduleName}.dao.${tableInfo.upperCamelCase}DAO">
    <sql id="allColumns">
        <#list tableInfo.pagingFieldInfos as pagingList>
        <#list pagingList as fieldInfo>t.${fieldInfo.colName} as ${fieldInfo.lowerCamelCase}<#if fieldInfo_has_next>, </#if></#list><#if pagingList_has_next>, </#if>
        </#list>
    </sql>
</mapper>