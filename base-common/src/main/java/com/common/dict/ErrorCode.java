package com.common.dict;

public enum  ErrorCode {

    SUCCESS("0","成功"),
    SYS_ERR("1001","系统异常"),
    VERIFY_CODE_EMPTY("1002","短信验证码已失效"),
    VERIFY_CODE_NOT_MATCH("1003","短信验证码不正确"),
    PHONE_NOT_EXIST("1004","手机号无对应的注册信息"),



    DEFAULT("9999","未知异常");

    public String code;
    public String desc;

    ErrorCode(String code,String desc){
        this.code = code;
        this.desc = desc;
    }

}
