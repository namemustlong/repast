package plant.repastapi.controller;

import com.common.api.ApiCacheService;
import com.common.api.BaseUserService;
import com.common.model.BaseUser;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import plant.repastapi.model.request.UserBindReq;
import plant.repastapi.model.request.UserLoginReq;
import plant.repastapi.model.response.BaseResponse;
import plant.repastapi.model.response.UserLoginRes;

import static com.common.dict.ErrorCode.PHONE_NOT_EXIST;
import static com.common.dict.ErrorCode.VERIFY_CODE_EMPTY;
import static com.common.dict.ErrorCode.VERIFY_CODE_NOT_MATCH;

@Api(value = "UserController ")
@RestController
public class UserController {
    @Autowired
    private ApiCacheService apiCacheService;
    @Autowired
    private BaseUserService baseUserService;

    /**
     * 1校验短信验证码是否正确
     * 2更新sessionkey
     *
     * @param userBindReq
     * @return
     */
    @RequestMapping(value="/api/user/bind",method = RequestMethod.POST)
    public BaseResponse userBind(@RequestBody UserBindReq userBindReq){
        BaseResponse baseResponse = new BaseResponse();
        String code = apiCacheService.getPhoneVerifyCode(userBindReq.getTel());
        if(StringUtils.isEmpty(code)){
            baseResponse.errorResponse(VERIFY_CODE_EMPTY);
        }else if(!code.equals("")){
            baseResponse.errorResponse(VERIFY_CODE_NOT_MATCH);
        }else{
            BaseUser baseUser = baseUserService.qryUserByPhone(userBindReq.getTel());
            if(null==baseUser){
                baseResponse.errorResponse(PHONE_NOT_EXIST);
            }else{
                BaseUser baseUser4Update = new BaseUser();
                baseUser4Update.setId(baseUser.getId());
                baseUser4Update.setSessionKey(userBindReq.getSessionKey());
                baseUserService.updateByPrimaryKeySelective(baseUser4Update);
            }
        }
        return baseResponse;

    }


    @RequestMapping(value="/api/user/login",method = RequestMethod.POST)
    public UserLoginRes userLogin(@RequestBody UserLoginReq userLoginReq){



        return null;
    }

}
