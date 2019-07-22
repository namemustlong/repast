package plant.repastapi.controller;

import com.common.dict.SystemDictionary;
import demo.DemoVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.Date;


/**
 * @author li.wei
 * @date 2019/7/13 15:47
 **/
@Api(value = "HomeController ")
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

    @ApiOperation(value = "测试")
    @RequestMapping(value="demo",method = RequestMethod.POST)
    public String demo(@RequestBody DemoVo demoVo){
        return demoVo.name+demoVo.age+demoVo.address;
    }

}
