package com.arihant.client.model.marginCalculator;


import java.util.Objects;

public class MarginCalculatorResponse {
    private String infoID;

    private String infoMsg;

    private Long timestamp;

    private MarginCalculatorData data = null;

    public MarginCalculatorResponse(String infoID, String infoMsg, Long timestamp, MarginCalculatorData data) {
        this.infoID = infoID;
        this.infoMsg = infoMsg;
        this.timestamp = timestamp;
        this.data = data;
    }

    public MarginCalculatorResponse() {
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

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public MarginCalculatorData getData() {
        return data;
    }

    public void setData(MarginCalculatorData data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MarginCalculatorResponse that = (MarginCalculatorResponse) o;
        return Objects.equals(infoID, that.infoID) && Objects.equals(infoMsg, that.infoMsg) && Objects.equals(timestamp, that.timestamp) && Objects.equals(data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(infoID, infoMsg, timestamp, data);
    }

    @Override
    public String toString() {
        return "MarginCalculatorResponse{" +
                "infoID='" + infoID + '\'' +
                ", infoMsg='" + infoMsg + '\'' +
                ", timestamp=" + timestamp +
                ", data=" + data +
                '}';
    }
}
