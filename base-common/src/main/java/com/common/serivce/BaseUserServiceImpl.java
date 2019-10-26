package com.common.serivce;

import com.common.api.BaseUserService;
import com.common.model.BaseUser;
import com.common.model.BaseUserExample;
import mapper.BaseUserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BaseUserServiceImpl implements BaseUserService {

    private static Logger logger = LoggerFactory.getLogger(BaseUserServiceImpl.class);

    @Autowired
    private BaseUserMapper baseUserMapper;
    @Override
    public BaseUser qryUserByPhone(String phone) {
        BaseUserExample example =  new BaseUserExample();
        example.createCriteria().andPhoneEqualTo(phone);
        List<BaseUser> list = baseUserMapper.selectByExample(example);
        if(list==null){
            return null;
        }else{
            if(list.size()>1){
                logger.error(phone+"手机号存在多条用户记录!");
            }
            return list.get(0);
        }
    }

    @Override
    public BaseUser qryUserBysessionKey(String sessionKey) {
        BaseUserExample example =  new BaseUserExample();
        example.createCriteria().andSessionKeyEqualTo(sessionKey);
        List<BaseUser> list = baseUserMapper.selectByExample(example);
        if(list==null){
            return null;
        }else{
            if(list.size()>1){
                logger.error(sessionKey+"存在多条用户记录!");
            }
            return list.get(0);
        }
    }

    @Override
    public int addUser(BaseUser baseUser) {
        return baseUserMapper.insertSelective(baseUser);
    }

    @Override
    public int updateByPrimaryKeySelective(BaseUser record) {
        return baseUserMapper.updateByPrimaryKeySelective(record);
    }
}
