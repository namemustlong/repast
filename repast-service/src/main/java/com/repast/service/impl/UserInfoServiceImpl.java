package com.repast.service.impl;

import com.common.model.UserInfo;
import com.repast.repository.UserInfoRepository;
import com.repast.service.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author li.wei
 * @date 2019-07-22
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Resource
    private UserInfoRepository userInfoRepository;

    public UserInfo getUserInfoByUserId(Integer userId) {
        return userInfoRepository.getUserInfoByUserId(userId);
    }
}
