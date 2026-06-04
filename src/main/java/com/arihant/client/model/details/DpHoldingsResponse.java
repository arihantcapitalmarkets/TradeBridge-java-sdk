package com.arihant.client.model.details;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class DpHoldingsResponse {
    @SerializedName("infoID")
    private String infoID = null;

    @SerializedName("infoMsg")
    private String infoMsg = null;

    @SerializedName("timestamp")
    private Long timestamp = null;

    @SerializedName("data")
    private HoldingsData data = null;

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

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public HoldingsData getData() {
        return data;
    }

    public void setData(HoldingsData data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "DpHoldingsResponse{" +
                "infoID='" + infoID + '\'' +
                ", infoMsg='" + infoMsg + '\'' +
                ", timestamp=" + timestamp +
                ", data=" + data +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        DpHoldingsResponse that = (DpHoldingsResponse) o;
        return Objects.equals(infoID, that.infoID) && Objects.equals(infoMsg, that.infoMsg) && Objects.equals(timestamp, that.timestamp) && Objects.equals(data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(infoID, infoMsg, timestamp, data);
    }
}
