package com.arihant.client.model.orders;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * ExitOrderResponse
 */

public class ExitOrderResponse {
    @SerializedName("infoID")
    private String infoID = null;

    @SerializedName("infoMsg")
    private String infoMsg = null;

    @SerializedName("timestamp")
    private Long timestamp = null;

    //@SerializedName("data")
//    private ExitOrderData data = null;

    public ExitOrderResponse infoID(String infoID) {
        this.infoID = infoID;
        return this;
    }

    /**
     * Get infoID
     *
     * @return infoID
     **/
    @Schema(description = "")
    public String getInfoID() {
        return infoID;
    }

    public void setInfoID(String infoID) {
        this.infoID = infoID;
    }

    public ExitOrderResponse infoMsg(String infoMsg) {
        this.infoMsg = infoMsg;
        return this;
    }

    /**
     * Get infoMsg
     *
     * @return infoMsg
     **/
    @Schema(description = "")
    public String getInfoMsg() {
        return infoMsg;
    }

    public void setInfoMsg(String infoMsg) {
        this.infoMsg = infoMsg;
    }

    public ExitOrderResponse timestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Get timestamp
     *
     * @return timestamp
     **/
    @Schema(description = "")
    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

//    public ExitOrderResponse data(ExitOrderData data) {
//        this.data = data;
//        return this;
//    }

    /**
     * Get data
     *
     * @return data
     **/
//    @Schema(description = "")
//    public ExitOrderData getData() {
//        return data;
//    }
//
//    public void setData(ExitOrderData data) {
//        this.data = data;
//    }
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExitOrderResponse exitOrderResponse = (ExitOrderResponse) o;
        return Objects.equals(this.infoID, exitOrderResponse.infoID) &&
                Objects.equals(this.infoMsg, exitOrderResponse.infoMsg) &&
                Objects.equals(this.timestamp, exitOrderResponse.timestamp);
        //  Objects.equals(this.data, exitOrderResponse.data);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(infoID, infoMsg, timestamp, data);
//    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExitOrderResponse {\n");

        sb.append("infoID: ").append(toIndentedString(infoID)).append("\n");
        sb.append("infoMsg: ").append(toIndentedString(infoMsg)).append("\n");
        sb.append("timestamp: ").append(toIndentedString(timestamp)).append("\n");
        //sb.append("data: ").append(toIndentedString(data)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return null;
        }
        return o.toString().replace("\n", "\n    ");
    }

}
