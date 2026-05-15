package com.arihant.client.model.details;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * GetProfileSuccess
 */

public class GetProfileSuccess {
    @SerializedName("infoID")
    private String infoID = null;

    @SerializedName("infoMsg")
    private String infoMsg = null;

    @SerializedName("timestamp")
    private String timestamp = null;

    @SerializedName("data")
    private GetProfileSuccessData data = null;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        GetProfileSuccess that = (GetProfileSuccess) o;
        return Objects.equals(infoID, that.infoID) && Objects.equals(infoMsg, that.infoMsg) && Objects.equals(timestamp, that.timestamp) && Objects.equals(data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(infoID, infoMsg, timestamp, data);
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

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public GetProfileSuccessData getData() {
        return data;
    }

    public void setData(GetProfileSuccessData data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "GetProfileSuccess{" +
                "infoID='" + infoID + '\'' +
                ", infoMsg='" + infoMsg + '\'' +
                ", timestamp='" + timestamp + '\'' +
                ", data=" + data +
                '}';
    }
}
