package com.arihant.client.model.orders;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * PlaceOrderResponse
 */
public class PlaceOrderResponse {
    @SerializedName("infoID")
    private String infoId = null;

    @SerializedName("infoMsg")
    private String infoMsg = null;

    @SerializedName("timestamp")
    private Long timestamp = null;

    @SerializedName("data")
    private PlaceOrderData respnseData = null;

    public PlaceOrderResponse infoID(String infoId) {
        this.infoId = infoId;
        return this;
    }

    /**
     * Get infoID
     *
     * @return infoID
     **/
    @Schema(description = "")
    public String getInfoID() {
        return infoId;
    }

    public void setInfoID(String infoID) {
        this.infoId = infoID;
    }

    public PlaceOrderResponse infoMsg(String infoMsg) {
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

    public PlaceOrderResponse timestamp(Long timestamp) {
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

    public PlaceOrderResponse data(PlaceOrderData data) {
        this.respnseData = data;
        return this;
    }

    /**
     * Get data
     *
     * @return data
     **/
    @Schema(description = "")
    public PlaceOrderData getRespnseData() {
        return respnseData;
    }

    public void setData(PlaceOrderData data) {
        this.respnseData = data;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PlaceOrderResponse placeOrderResponse = (PlaceOrderResponse) o;
        return Objects.equals(this.infoId, placeOrderResponse.infoId) &&
                Objects.equals(this.infoMsg, placeOrderResponse.infoMsg) &&
                Objects.equals(this.timestamp, placeOrderResponse.timestamp) &&
                Objects.equals(this.respnseData, placeOrderResponse.respnseData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(infoId, infoMsg, timestamp, respnseData);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PlaceOrderResponse {\n");

        sb.append("infoID: ").append(toIndentedString(infoId)).append("\n");
        sb.append("infoMsg: ").append(toIndentedString(infoMsg)).append("\n");
        sb.append("timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("data: ").append(toIndentedString(respnseData)).append("\n");
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
