package com.arihant.client.model.details;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * FundsSuccess
 */

public class FundsSuccess {
    @SerializedName("infoID")
    private String infoId = null;

    @SerializedName("data")
    private FundsSuccessData data = null;

    @SerializedName("infoMsg")
    private String infoMsg = null;

    @SerializedName("timestamp")
    private Float timestamp = null;

    public FundsSuccess infoid(String infoid) {
        this.infoId = infoid;
        return this;
    }

    /**
     * Get infoId
     *
     * @return infoId
     **/
    @Schema(example = "200", description = "")
    public String getInfoId() {
        return infoId;
    }

    public void setInfoId(String infoId) {
        this.infoId = infoId;
    }

    public FundsSuccess data(FundsSuccessData data) {
        this.data = data;
        return this;
    }

    /**
     * Get data
     *
     * @return data
     **/
    @Schema(description = "")
    public FundsSuccessData getData() {
        return data;
    }

    public void setData(FundsSuccessData data) {
        this.data = data;
    }

    public FundsSuccess infomsg(String infomsg) {
        this.infoMsg = infomsg;
        return this;
    }

    /**
     * Get infoMsg
     *
     * @return infoMsg
     **/
    @Schema(example = "success", description = "")
    public String getInfoMsg() {
        return infoMsg;
    }

    public void setInfoMsg(String infoMsg) {
        this.infoMsg = infoMsg;
    }

    public FundsSuccess timestamp(Float timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Get timestamp
     *
     * @return timestamp
     **/
    @Schema(example = "6478390.03", description = "")
    public Float getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Float timestamp) {
        this.timestamp = timestamp;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FundsSuccess fundsSucess = (FundsSuccess) o;
        return Objects.equals(this.infoId, fundsSucess.infoId) &&
                Objects.equals(this.data, fundsSucess.data) &&
                Objects.equals(this.infoMsg, fundsSucess.infoMsg) &&
                Objects.equals(this.timestamp, fundsSucess.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(infoId, data, infoMsg, timestamp);
    }


    @Override
    public String toString() {

        return "class FundsSucess {\n" +
                "    infoID: " + toIndentedString(infoId) + "\n" +
                "    data: " + toIndentedString(data) + "\n" +
                "    infoMsg: " + toIndentedString(infoMsg) + "\n" +
                "    timestamp: " + toIndentedString(timestamp) + "\n" +
                "}";
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
