package com.arihant.client.model.login;

import java.util.Map;
import java.util.Objects;

public class SuccessResponse {
    private String infoID;
    private String infoMsg;
    private Map<String, String> data;
    private Long timestamp;

    public SuccessResponse(String infoID, String infoMsg, Map<String, String> data, Long timestamp) {
        this.infoID = infoID;
        this.infoMsg = infoMsg;
        this.data = data;
        this.timestamp = timestamp;
    }

    public SuccessResponse() {
    }

    public String getInfoID() {
        return infoID;
    }

    public void setInfoID(String infoID) {
        this.infoID = infoID;
    }

    public String getInfoMsg() {
        return infoMsg;
    }

    public void setInfoMsg(String infoMsg) {
        this.infoMsg = infoMsg;
    }

    public Map<String, String> getData() {
        return data;
    }

    public void setData(Map<String, String> data) {
        this.data = data;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SuccessResponse that = (SuccessResponse) o;
        return Objects.equals(infoID, that.infoID) && Objects.equals(infoMsg, that.infoMsg) && Objects.equals(data, that.data) && Objects.equals(timestamp, that.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(infoID, infoMsg, data, timestamp);
    }

    @Override
    public String toString() {
        return "SuccessResponse{" +
                "infoID='" + infoID + '\'' +
                ", infoMsg='" + infoMsg + '\'' +
                ", data=" + data +
                ", timestamp=" + timestamp +
                '}';
    }
}
