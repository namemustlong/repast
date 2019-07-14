package plant.repastapi.controller;

import com.common.dict.SystemDictionary;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


/**
 * @author li.wei
 * @date 2019/7/13 15:47
 **/
@RestController
public class HomeController {
    @RequestMapping(value="version")
    public String getVersion(){
        return SystemDictionary.APPLICATION_REPAST_NAME + SystemDictionary.APPLICATION_VERSION;
    }
    @RequestMapping(value="time")
    public String getTime(){
        return new Date().toString();
    }
}
