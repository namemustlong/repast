package plant.repastapi.model.response;

import plant.repastapi.model.vo.LocationListResVO;

import java.util.List;

public class LocationListRes extends BaseResponse{

    private List<LocationListResVO> data;

    public List<LocationListResVO> getData() {
        return data;
    }

    public void setData(List<LocationListResVO> data) {
        this.data = data;
    }
}
