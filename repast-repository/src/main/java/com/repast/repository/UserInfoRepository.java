package com.repast.repository;

import com.common.model.UserInfo;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @author li.wei
 * @date 2019-07-22
 */
@Repository
public class UserInfoRepository {
    @Resource
    private SqlSessionTemplate tigerSqlSessionTemplate;

    public UserInfo getUserInfoByUserId(Integer userId){
        return  tigerSqlSessionTemplate.selectOne("UserInfoMapper.selectUserInfoByUserId",userId);
    }
}
