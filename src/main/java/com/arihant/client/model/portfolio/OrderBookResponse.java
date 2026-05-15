package com.arihant.client.model.portfolio;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * OrderBookResponse
 */

public class OrderBookResponse {
    @SerializedName("infoID")
    private String infoId = null;

    @SerializedName("infoMsg")
    private String infoMsg = null;

    @SerializedName("timestamp")
    private Long timestamp = null;
    @SerializedName("data")
    private OrderBookData data = null;

    public OrderBookResponse infoID(String infoId) {
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

    public OrderBookResponse infoMsg(String infoMsg) {
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

    public OrderBookResponse timestamp(Long timestamp) {
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

    public OrderBookResponse data(OrderBookData data) {
        this.data = data;
        return this;
    }

    /**
     * Get data
     *
     * @return data
     **/
    @Schema(description = "")
    public OrderBookData getData() {
        return data;
    }

    public void setData(OrderBookData data) {
        this.data = data;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderBookResponse {\n");
        sb.append("infoID: ").append(toIndentedString(infoId)).append("\n");
        sb.append("infoMsg: ").append(toIndentedString(infoMsg)).append("\n");
        sb.append("timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("data: ").append(toIndentedString(data)).append("\n");
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderBookResponse that = (OrderBookResponse) o;
        return Objects.equals(infoId, that.infoId) && Objects.equals(infoMsg, that.infoMsg) && Objects.equals(timestamp, that.timestamp) && Objects.equals(data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(infoId, infoMsg, timestamp, data);
    }
}
