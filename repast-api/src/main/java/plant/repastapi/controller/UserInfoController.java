package plant.repastapi.controller;

import com.common.model.UserInfo;
import com.common.utils.JsonUtil;
import com.repast.service.UserInfoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author li.wei
 * @date 2019-07-22
 */
@RestController
@RequestMapping(value="/User")
public class UserInfoController {
    @Resource
    private UserInfoService userInfoService;

    @RequestMapping(value="/UserInfo")
    public String getUserInfo(){
        UserInfo userInfo = userInfoService.getUserInfoByUserId(11);
        return JsonUtil.getJson(userInfo);
    }
}
