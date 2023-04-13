package src.main.java.com.apollo247.phr.dto.dbo;

import java.util.List;

public class DrupalAPIResponse {
    private String success;
    private String msg;
    private List<MongoInformativeContent> data;

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<MongoInformativeContent> getData() {
        return data;
    }

    public void setData(List<MongoInformativeContent> data) {
        this.data = data;
    }

}
