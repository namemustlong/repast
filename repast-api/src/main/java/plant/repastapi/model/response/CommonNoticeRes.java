package plant.repastapi.model.response;

import com.common.model.AdNotice;

import java.util.List;

public class CommonNoticeRes  extends BaseResponse{

    private List<AdNotice> data;

    public List<AdNotice> getData() {
        return data;
    }

    public void setData(List<AdNotice> data) {
        this.data = data;
    }
}

