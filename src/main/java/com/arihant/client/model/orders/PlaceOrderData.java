package com.arihant.client.model.orders;

import com.arihant.client.enums.OrdStatusEnum;
import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * PlaceOrderData
 */

public class PlaceOrderData {
    @SerializedName("ordId")
    private String ordId = null;

    @SerializedName("ordStatus")
    private OrdStatusEnum ordStatus = null;

    @SerializedName("rejReason")
    private String rejReason = null;

    public PlaceOrderData ordId(String ordId) {
        this.ordId = ordId;
        return this;
    }

    /**
     * Get ordId
     *
     * @return ordId
     **/
    @Schema(description = "")
    public String getOrdId() {
        return ordId;
    }

    public void setOrdId(String ordId) {
        this.ordId = ordId;
    }

    public PlaceOrderData ordStatus(OrdStatusEnum ordStatus) {
        this.ordStatus = ordStatus;
        return this;
    }

    /**
     * Get ordStatus
     *
     * @return ordStatus
     **/
    @Schema(description = "")
    public OrdStatusEnum getOrdStatus() {
        return ordStatus;
    }

    public void setOrdStatus(OrdStatusEnum ordStatus) {
        this.ordStatus = ordStatus;
    }

    public PlaceOrderData rejReason(String rejReason) {
        this.rejReason = rejReason;
        return this;
    }

    /**
     * Get rejReason
     *
     * @return rejReason
     **/
    @Schema(description = "")
    public String getRejReason() {
        return rejReason;
    }

    public void setRejReason(String rejReason) {
        this.rejReason = rejReason;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PlaceOrderData placeOrderData = (PlaceOrderData) o;
        return Objects.equals(this.ordId, placeOrderData.ordId) &&
                Objects.equals(this.ordStatus, placeOrderData.ordStatus) &&
                Objects.equals(this.rejReason, placeOrderData.rejReason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ordId, ordStatus, rejReason);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PlaceOrderData {\n");
        sb.append("ordId: ").append(toIndentedString(ordId)).append("\n");
        sb.append("ordStatus: ").append(toIndentedString(ordStatus)).append("\n");
        sb.append("rejReason: ").append(toIndentedString(rejReason)).append("\n");
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
