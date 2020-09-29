package com.kaglobal.mallcommon.base;

/**
 * @ClassName ResponseCode
 * @Description TODO
 * @Author fuhang
 * @Date 2020/9/29 11:22
 * @Version 1.0.0
 **/
public enum ResponseCode {
    SUCCESS("SUCCESS"),
    PARAMETER_EXCEPTION("PARAM.EXCEPTION"),
    BUSSINESS_EXCEPTION("BIZ.BUSSINESS_EXCEPTION"),
    UNKNOWN_EXCEPTION("SYS.UNKNOWN_EXCEPTION"),
    SERVER_ERROR("SYS.SERVER_ERROR"),
    SYSTEM_EXCEPTION("SYS.SYSTEM_EXCEPTION"),
    DB_EXCEPTION("SYS.DB_EXCEPTION"),
    CACHE_EXCEPTION("SYS.CACHE_EXCEPTION"),
    CALLS_OVER_LIMIT("SYS.CALL_OVER_LIMIT"),
    RPC_EXCEPTION("SYS.RPC_EXCEPTION"),
    TOKEN_EXPIRATION("BIZ.TOKEN_EXPIRATION"),
    SESSION_NULL("BIZ.SESSION_NULL"),
    DATA_NOT_EXIST("BIZ.DATA_NOT_EXIST"),
    DATA_CONFLICT("BIZ.DATA_CONFLICT"),
    BEGDATE_GT_ENDDATE("BIZ.BEGDATE_GT_ENDDATE"),
    PASSPORT_ERROR("BIZ.PASSPORT_ERROR");

    private final String code;

    private ResponseCode(String code) {
        this.code = code;
    }

    public String code() {
        return this.code;
    }
}