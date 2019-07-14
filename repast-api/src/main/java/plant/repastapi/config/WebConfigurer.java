package plant.repastapi.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import plant.repastapi.config.intercepors.RequestInterceptor;

import javax.annotation.Resource;

/**
 * @author li.wei
 * @date 2019/7/13 15:58
 **/
@Configuration
public class WebConfigurer implements WebMvcConfigurer {

    private static final String EXCLUDE_URL_HOME = "/version";

    private static final String EXCLUDE_URL_LOGIN = "/login";

    private static final String EXCLUDE_URL_REGISTER = "/register";

    @Resource
    private RequestInterceptor requestInterceptor;
    @Override
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(requestInterceptor).addPathPatterns("/**").excludePathPatterns(EXCLUDE_URL_LOGIN, EXCLUDE_URL_REGISTER,EXCLUDE_URL_HOME);
    }
}
