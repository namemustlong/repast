package plant.repastapi.controller;


import com.common.api.AdNoticeService;
import com.common.api.AdPicService;
import com.common.api.BaseDeliveryAddressService;
import com.common.model.AdNotice;
import com.common.model.AdPic;
import com.common.model.BaseDeliveryAddress;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import plant.repastapi.model.response.CommonNoticeRes;
import plant.repastapi.model.response.CommonPicRes;
import plant.repastapi.model.response.LocationListRes;
import plant.repastapi.model.vo.LocationListResVO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Api(value = "CommonController ")
@RestController
public class CommonController {



    @Autowired
    private AdPicService adPicService;
    @Autowired
    private AdNoticeService adNoticeService;
    @Autowired
    private BaseDeliveryAddressService baseDeliveryAddressService;




    @RequestMapping(value="/api/location/list",method = RequestMethod.GET)
    public LocationListRes locationList() {
        List<BaseDeliveryAddress> list = baseDeliveryAddressService.qryAllDeliveryAddress();
        List<LocationListResVO> mList = new ArrayList<>();
        for(BaseDeliveryAddress baseDeliveryAddress:list){
            LocationListResVO locationListResVO = new LocationListResVO();
            locationListResVO.setId(String.valueOf(baseDeliveryAddress.getId()));
            locationListResVO.setName(baseDeliveryAddress.getAddress());
            mList.add(locationListResVO);
        }
        LocationListRes locationListRes = new LocationListRes();
        locationListRes.setData(mList);
        return locationListRes;
    }

    @RequestMapping(value="/api/common/pic",method = RequestMethod.GET)
    public CommonPicRes commonPic(){
        List<AdPic> list = adPicService.qryAllPic();
        List<String> sList = new ArrayList<>();
        for(AdPic adPic:list){
            sList.add(adPic.getUrl());
        }
        CommonPicRes commonPicRes = new CommonPicRes();
        commonPicRes.setData(sList);
        return commonPicRes;
    }


    @RequestMapping(value="/api/common/notice",method = RequestMethod.GET)
    public CommonNoticeRes commonNotice(){
        List<AdNotice> list = adNoticeService.qryAllNotice();
        CommonNoticeRes commonNoticeRes = new CommonNoticeRes();
        commonNoticeRes.setData(list);
        return commonNoticeRes;
    }




}
