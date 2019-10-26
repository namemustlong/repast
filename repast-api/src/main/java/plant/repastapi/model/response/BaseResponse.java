package plant.repastapi.model.response;


import com.common.dict.ErrorCode;

public class BaseResponse {

    private String error_code;
    private String error_desc;

    public BaseResponse(){
        error_code = ErrorCode.SUCCESS.code;
        error_desc = ErrorCode.SUCCESS.desc;
    }

    public void errorResponse(ErrorCode errorCode){
        error_code = errorCode.code;
        error_desc = errorCode.desc;
    }


    public String getError_code() {
        return error_code;
    }

    public void setError_code(String error_code) {
        this.error_code = error_code;
    }

    public String getError_desc() {
        return error_desc;
    }

    public void setError_desc(String error_desc) {
        this.error_desc = error_desc;
    }
}
