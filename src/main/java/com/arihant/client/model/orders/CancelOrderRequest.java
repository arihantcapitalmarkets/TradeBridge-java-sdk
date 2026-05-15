package com.arihant.client.model.orders;

import com.arihant.client.enums.ExcEnum;
import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * CancelOrderRequest
 */

public class CancelOrderRequest {
    @SerializedName("symbol")
    private String symbol = null;

    @SerializedName("exc")
    private ExcEnum exc = null;

    @SerializedName("ordId")
    private String ordId = null;

    @SerializedName("remarks")
    private String remarks = null;

    public CancelOrderRequest remarks(String remarks) {
        this.remarks = remarks;
        return this;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public CancelOrderRequest symbol(String symbol) {
        this.symbol = symbol;
        return this;
    }

    /**
     * Get symbol
     *
     * @return symbol
     **/
    @Schema(required = true, description = "")
    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public CancelOrderRequest exc(ExcEnum exc) {
        this.exc = exc;
        return this;
    }

    /**
     * Get exc
     *
     * @return exc
     **/
    @Schema(required = true, description = "")
    public ExcEnum getExc() {
        return exc;
    }

    public void setExc(ExcEnum exc) {
        this.exc = exc;
    }

    public CancelOrderRequest ordId(String ordId) {
        this.ordId = ordId;
        return this;
    }

    /**
     * Get ordId
     *
     * @return ordId
     **/
    @Schema(required = true, description = "")
    public String getOrdId() {
        return ordId;
    }

    public void setOrdId(String ordId) {
        this.ordId = ordId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CancelOrderRequest cancelOrderRequest = (CancelOrderRequest) o;
        return Objects.equals(this.symbol, cancelOrderRequest.symbol) &&
                Objects.equals(this.exc, cancelOrderRequest.exc) &&
                Objects.equals(this.ordId, cancelOrderRequest.ordId) &&
                Objects.equals(this.remarks, cancelOrderRequest.remarks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol, exc, ordId, remarks);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CancelOrderRequest {\n");

        sb.append("symbol: ").append(toIndentedString(symbol)).append("\n");
        sb.append("exc: ").append(toIndentedString(exc)).append("\n");
        sb.append("ordId: ").append(toIndentedString(ordId)).append("\n");
        sb.append("remarks: ").append(toIndentedString(remarks)).append("\n");
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
