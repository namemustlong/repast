package com.common.api;

import com.common.model.BaseUser;

public interface BaseUserService {

    BaseUser qryUserByPhone(String phone);
    BaseUser qryUserBysessionKey(String sessionKey);

    int addUser(BaseUser baseUser);

    int updateByPrimaryKeySelective(BaseUser record);

}
