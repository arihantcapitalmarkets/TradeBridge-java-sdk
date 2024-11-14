package com.arihant.client.model.details;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * HistoricalCandleDataResponse
 */

public class HistoricalCandleDataResponse {
    @SerializedName("infoID")
    private String infoID = null;

    @SerializedName("data")
    private HistoricalCandleData data = null;

    @SerializedName("infoMsg")
    private String infoMsg = null;

    @SerializedName("timestamp")
    private String timestamp = null;

    public HistoricalCandleDataResponse(String infoID, HistoricalCandleData data, String infoMsg, String timestamp) {
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

    public HistoricalCandleData getData() {
        return data;
    }

    public void setData(HistoricalCandleData data) {
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
        HistoricalCandleDataResponse that = (HistoricalCandleDataResponse) o;
        return Objects.equals(infoID, that.infoID) && Objects.equals(data, that.data) && Objects.equals(infoMsg, that.infoMsg) && Objects.equals(timestamp, that.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(infoID, data, infoMsg, timestamp);
    }

    @Override
    public String toString() {
        return "HistoricalCandleDataResponse{" +
                "infoID='" + infoID + '\'' +
                ", data=" + data +
                ", infoMsg='" + infoMsg + '\'' +
                ", timestamp='" + timestamp + '\'' +
                '}';
    }
}
