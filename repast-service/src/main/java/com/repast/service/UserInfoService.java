package com.repast.service;

import com.common.model.UserInfo;

/**
 * @author li.wei
 * @date 2019-07-22
 */
public interface UserInfoService {
    UserInfo getUserInfoByUserId(Integer userId);
}
