package com.common.api;


public interface ApiCacheService {

    String setPhoneVerifyCode(String phone);

    String getPhoneVerifyCode(String phone);

    void setSessionKey(String phone,String sessionKey);

}
