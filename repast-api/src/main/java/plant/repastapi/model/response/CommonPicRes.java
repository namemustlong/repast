package plant.repastapi.model.response;

import java.util.List;

public class CommonPicRes extends BaseResponse{

    private List<String> data;

    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }
}
