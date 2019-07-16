package demo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class DemoVo {

    @ApiModelProperty(value = "测试对象名称")
    public String name;

    @ApiModelProperty(value = "测试对象年龄")
    public String age;

    @ApiModelProperty(value = "测试对象住址")
    public String address;

}
