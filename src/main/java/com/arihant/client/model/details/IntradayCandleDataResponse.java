package com.arihant.client.model.details;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * IntradayCandleDataResponse
 */

public class IntradayCandleDataResponse {
    @SerializedName("infoID")
    private String infoID = null;

    @SerializedName("data")
    private IntradaySuccessData data = null;

    @SerializedName("infoMsg")
    private String infoMsg = null;

    @SerializedName("timestamp")
    private String timestamp = null;


    public IntradayCandleDataResponse(String infoID, IntradaySuccessData data, String infoMsg, String timestamp) {
        this.infoID = infoID;
        this.data = data;
        this.infoMsg = infoMsg;
        this.timestamp = timestamp;
    }

    public String getInfoID() {
        return infoID;
    }

    public void setInfoID(String infoID) {
        this.infoID = infoID;
    }

    public IntradaySuccessData getData() {
        return data;
    }

    public void setData(IntradaySuccessData data) {
        this.data = data;
    }

    public String getInfoMsg() {
        return infoMsg;
    }

    public void setInfoMsg(String infoMsg) {
        this.infoMsg = infoMsg;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IntradayCandleDataResponse that = (IntradayCandleDataResponse) o;
        return Objects.equals(infoID, that.infoID) && Objects.equals(data, that.data) && Objects.equals(infoMsg, that.infoMsg) && Objects.equals(timestamp, that.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(infoID, data, infoMsg, timestamp);
    }

    @Override
    public String toString() {
        return "IntradayCandleDataResponse{" +
                "infoID='" + infoID + '\'' +
                ", data=" + data +
                ", infoMsg='" + infoMsg + '\'' +
                ", timestamp='" + timestamp + '\'' +
                '}';
    }
}
