package plant.repastapi.config.intercepors;

import com.common.dict.HttpStatusDict;
import com.common.dict.UserDictionary;
import com.common.model.UserInfo;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author li.wei
 * @date 2019/7/13 16:01
 **/
@Component
public class RequestInterceptor implements HandlerInterceptor {

    private static final String HTTP_RESPONSE_TYPE = "text/html;charset=UTF-8";
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws Exception {
        HttpSession session = request.getSession();
        UserInfo userInfo = (UserInfo)session.getAttribute(UserDictionary.LOGIN_USER_AGENT);
        if(null == userInfo){
            response.setStatus(HttpStatusDict.Unauthorized);
            response.setHeader("Content-type", HTTP_RESPONSE_TYPE);
            response.getWriter().write("请先登录");
            return false;
        }
        return true;
    }
}
