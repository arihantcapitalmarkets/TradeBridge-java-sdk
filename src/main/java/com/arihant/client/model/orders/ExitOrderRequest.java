package com.arihant.client.model.orders;

import com.arihant.client.enums.PrdTypeEnum;
import com.arihant.client.enums.ExcEnum;
import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * ExitOrderRequest
 */

public class ExitOrderRequest {
    @SerializedName("symbol")
    private String symbol = null;

    @SerializedName("exc")
    private ExcEnum exc = null;

    @SerializedName("prdType")
    private PrdTypeEnum prdType = null;

    @SerializedName("boOrdStatus")
    private String boOrdStatus = null;

    @SerializedName("ordId")
    private String ordId = null;

    @SerializedName("parOrdId")
    private String parOrdId = null;

    @SerializedName("remarks")
    private String remarks = null;

    public ExitOrderRequest remarks(String remarks) {
        this.remarks = remarks;
        return this;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public ExitOrderRequest symbol(String symbol) {
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

    public ExitOrderRequest exc(ExcEnum exc) {
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

    public ExitOrderRequest prdType(PrdTypeEnum prdType) {
        this.prdType = prdType;
        return this;
    }

    /**
     * Get prdType
     *
     * @return prdType
     **/
    @Schema(required = true, description = "")
    public PrdTypeEnum getPrdType() {
        return prdType;
    }

    public void setPrdType(PrdTypeEnum prdType) {
        this.prdType = prdType;
    }

    public ExitOrderRequest boOrdStatus(String boOrdStatus) {
        this.boOrdStatus = boOrdStatus;
        return this;
    }

    /**
     * Get boOrdStatus
     *
     * @return boOrdStatus
     **/
    @Schema(required = true, description = "")
    public String getBoOrdStatus() {
        return boOrdStatus;
    }

    public void setBoOrdStatus(String boOrdStatus) {
        this.boOrdStatus = boOrdStatus;
    }

    public ExitOrderRequest ordId(String ordId) {
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

    public ExitOrderRequest parOrdId(String parOrdId) {
        this.parOrdId = parOrdId;
        return this;
    }

    /**
     * Get parOrdId
     *
     * @return parOrdId
     **/
    @Schema(required = true, description = "")
    public String getParOrdId() {
        return parOrdId;
    }

    public void setParOrdId(String parOrdId) {
        this.parOrdId = parOrdId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExitOrderRequest exitOrderRequest = (ExitOrderRequest) o;
        return Objects.equals(this.symbol, exitOrderRequest.symbol) &&
                Objects.equals(this.exc, exitOrderRequest.exc) &&
                Objects.equals(this.prdType, exitOrderRequest.prdType) &&
                Objects.equals(this.boOrdStatus, exitOrderRequest.boOrdStatus) &&
                Objects.equals(this.ordId, exitOrderRequest.ordId) &&
                Objects.equals(this.parOrdId, exitOrderRequest.parOrdId) &&
                Objects.equals(this.remarks, exitOrderRequest.remarks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol, exc, prdType, boOrdStatus, ordId, parOrdId, remarks);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExitOrderRequest {\n");

        sb.append("symbol: ").append(toIndentedString(symbol)).append("\n");
        sb.append("exc: ").append(toIndentedString(exc)).append("\n");
        sb.append("prdType: ").append(toIndentedString(prdType)).append("\n");
        sb.append("boOrdStatus: ").append(toIndentedString(boOrdStatus)).append("\n");
        sb.append("ordId: ").append(toIndentedString(ordId)).append("\n");
        sb.append("parOrdId: ").append(toIndentedString(parOrdId)).append("\n");
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
