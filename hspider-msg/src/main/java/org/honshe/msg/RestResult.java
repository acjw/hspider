package org.honshe.msg;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by honshe on 2016/6/15.
 */
public class RestResult {
    private String code = "200";
    private Map<String, Object> data = new HashMap<>();
    private String requestId;
    private boolean successResponse = true;

    public RestResult() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public boolean isSuccessResponse() {
        return successResponse;
    }

    public void setSuccessResponse(boolean successResponse) {
        this.successResponse = successResponse;
    }
}
