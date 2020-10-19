<#-- 自定义模板生成导出数据生成字典常量类 -->
package common.constant;

/**
 * 字典常量类
 * 
 * @author bianj
 * @version 1.0.0 ${today}
 */
public class DictConstant {
<#if CollectionUtils.isNotEmpty(tableInfoList)>
    <#list tableInfoList as tableInfo>
        <#if tableInfo.sqlQueryData?? && tableInfo.sqlQueryData.dictTypeList?has_content>
            <#list tableInfo.sqlQueryData.dictTypeList as dictType>
    /** ${dictType.TYPE_NAME} */
    public static class ${dictType.TYPE_CODE?cap_first} {
                <#if CollectionUtils.isNotEmpty(dictType.dictList)>
                    <#list dictType.dictList as dict>
        /** ${dict.DICT_NAME} */
        public static final String ${dict.DICT_CODE} = "${dict.DICT_CODE}";
                        <#if dict_has_next>

                        </#if>
                    </#list>
                </#if>
    }

            </#list>
        </#if>
    </#list>
</#if>
}
