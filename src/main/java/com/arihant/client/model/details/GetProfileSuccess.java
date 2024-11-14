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

    @SerializedName("data")
    private GetProfileSuccessData data = null;

    @SerializedName("infoMsg")
    private String infoMsg = null;

    @SerializedName("timestamp")
    private String timestamp = null;

    public GetProfileSuccess infoID(String infoID) {
        this.infoID = infoID;
        return this;
    }

    public GetProfileSuccess(String infoMsg, String timestamp) {
        this.infoMsg = infoMsg;
        this.timestamp = timestamp;
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

    /**
     * Get infoID
     *
     * @return infoID
     **/
    @Schema(example = "0", description = "")
    public String getInfoID() {
        return infoID;
    }

    public void setInfoID(String infoID) {
        this.infoID = infoID;
    }

    public GetProfileSuccess data(GetProfileSuccessData data) {
        this.data = data;
        return this;
    }

    /**
     * Get data
     *
     * @return data
     **/
    @Schema(description = "")
    public GetProfileSuccessData getData() {
        return data;
    }

    public void setData(GetProfileSuccessData data) {
        this.data = data;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetProfileSuccess getProfileSucsess = (GetProfileSuccess) o;
        return Objects.equals(this.infoID, getProfileSucsess.infoID) &&
                Objects.equals(this.data, getProfileSucsess.data) && Objects.equals(infoMsg, getProfileSucsess.infoMsg) && Objects.equals(timestamp, getProfileSucsess.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(infoID, data);
    }


    @Override
    public String toString() {

        return "class GetProfileSuccess {\n" +
                "infoID='" + infoID + '\'' +
                ", data=" + data +
                ", infoMsg='" + infoMsg + '\'' +
                ", timestamp='" + timestamp + '\'' +
                '}';
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
