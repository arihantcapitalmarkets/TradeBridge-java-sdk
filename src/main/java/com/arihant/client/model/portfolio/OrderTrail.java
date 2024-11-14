package com.arihant.client.model.portfolio;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.IOException;
import java.util.Objects;

/**
 * OrderTrail
 */

public class OrderTrail {
    @SerializedName("limitPrice")
    private Double limitPrice = null;

    @SerializedName("lupdateDateTime")
    private String lupdateDateTime = null;

    @SerializedName("ordDesc")
    private String ordDesc = null;

    @SerializedName("modifiedBy")
    private String modifiedBy = null;

    /**
     * Gets or Sets status
     */
    @JsonAdapter(StatusEnum.Adapter.class)
    public enum StatusEnum {
        @SerializedName("Executed")
        EXECUTED("Executed"),
        @SerializedName("Pending")
        PENDING("Pending"),
        @SerializedName("Cancelled")
        CANCELLED("Cancelled"),
        @SerializedName("Transit")
        TRANSIT("Transit"),
        @SerializedName("Rejected")
        REJECTED("Rejected"),
        @SerializedName("Requested")
        REQUESTED("Requested"),
        @SerializedName("None")
        NONE("None");

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static StatusEnum fromValue(String input) {
            for (StatusEnum b : StatusEnum.values()) {
                if (b.value.equals(input)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<StatusEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
                jsonWriter.value(String.valueOf(enumeration.getValue()));
            }

            @Override
            public StatusEnum read(final JsonReader jsonReader) throws IOException {
                Object value = jsonReader.nextString();
                return StatusEnum.fromValue((String) (value));
            }
        }
    }

    @SerializedName("status")
    private StatusEnum status = null;

    @SerializedName("rejReason")
    private String rejReason = null;

    @SerializedName("avgPrice")
    private Double avgPrice = null;

    @SerializedName("qty")
    private Integer qty = null;

    @SerializedName("pendingQty")
    private Integer pendingQty = null;

    @SerializedName("disQty")
    private Integer disQty = null;

    @SerializedName("price")
    private Double price = null;

    /**
     * Gets or Sets exc
     */
    @JsonAdapter(ExcEnum.Adapter.class)
    public enum ExcEnum {
        @SerializedName("NSE")
        NSE("NSE"),
        @SerializedName("BSE")
        BSE("BSE"),
        @SerializedName("NFO")
        NFO("NFO"),
        @SerializedName("BFO")
        BFO("BFO"),
        @SerializedName("CDS")
        CDS("CDS"),
        @SerializedName("BCD")
        BCD("BCD"),
        @SerializedName("MCXSX")
        MCXSX("MCXSX"),
        @SerializedName("MCX")
        MCX("MCX"),
        @SerializedName("NCO")
        NCO("NCO"),
        @SerializedName("BCO")
        BCO("BCO"),
        @SerializedName("ICEX")
        ICEX("ICEX");

        private String value;

        ExcEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static ExcEnum fromValue(String input) {
            for (ExcEnum b : ExcEnum.values()) {
                if (b.value.equals(input)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<ExcEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final ExcEnum enumeration) throws IOException {
                jsonWriter.value(String.valueOf(enumeration.getValue()));
            }

            @Override
            public ExcEnum read(final JsonReader jsonReader) throws IOException {
                Object value = jsonReader.nextString();
                return ExcEnum.fromValue((String) (value));
            }
        }
    }

    @SerializedName("exc")
    private ExcEnum exc = null;

    @SerializedName("ordId")
    private String ordId = null;

    @SerializedName("exchOrdId")
    private String exchOrdId = null;

    @SerializedName("currentOrdStatus")
    private String currentOrdStatus = null;

    @SerializedName("tradedQty")
    private Integer tradedQty = null;


    public OrderTrail limitPrice(Double limitPrice) {
        this.limitPrice = limitPrice;
        return this;
    }

    /**
     * Get limitPrice
     *
     * @return limitPrice
     **/
    @Schema(description = "")
    public Double getLimitPrice() {
        return limitPrice;
    }

    public void setLimitPrice(Double limitPrice) {
        this.limitPrice = limitPrice;
    }

    public OrderTrail lupdateDateTime(String lupdateDateTime) {
        this.lupdateDateTime = lupdateDateTime;
        return this;
    }

    /**
     * Get lupdateDateTime
     *
     * @return lupdateDateTime
     **/
    @Schema(description = "")
    public String getLupdateDateTime() {
        return lupdateDateTime;
    }

    public void setLupdateDateTime(String lupdateDateTime) {
        this.lupdateDateTime = lupdateDateTime;
    }

    public OrderTrail ordDesc(String ordDesc) {
        this.ordDesc = ordDesc;
        return this;
    }

    /**
     * Get ordDesc
     *
     * @return ordDesc
     **/
    @Schema(description = "")
    public String getOrdDesc() {
        return ordDesc;
    }

    public void setOrdDesc(String ordDesc) {
        this.ordDesc = ordDesc;
    }

    public OrderTrail modifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }

    /**
     * Get modifiedBy
     *
     * @return modifiedBy
     **/
    @Schema(description = "")
    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public OrderTrail status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     **/
    @Schema(description = "")
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public OrderTrail rejReason(String rejReason) {
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

    public OrderTrail avgPrice(Double avgPrice) {
        this.avgPrice = avgPrice;
        return this;
    }

    /**
     * Get avgPrice
     *
     * @return avgPrice
     **/
    @Schema(description = "")
    public Double getAvgPrice() {
        return avgPrice;
    }

    public void setAvgPrice(Double avgPrice) {
        this.avgPrice = avgPrice;
    }

    public OrderTrail qty(Integer qty) {
        this.qty = qty;
        return this;
    }

    /**
     * Get qty
     *
     * @return qty
     **/
    @Schema(description = "")
    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public OrderTrail pendingQty(Integer pendingQty) {
        this.pendingQty = pendingQty;
        return this;
    }

    /**
     * Get pendingQty
     *
     * @return pendingQty
     **/
    @Schema(description = "")
    public Integer getPendingQty() {
        return pendingQty;
    }

    public void setPendingQty(Integer pendingQty) {
        this.pendingQty = pendingQty;
    }

    public OrderTrail disQty(Integer disQty) {
        this.disQty = disQty;
        return this;
    }

    /**
     * Get disQty
     *
     * @return disQty
     **/
    @Schema(description = "")
    public Integer getDisQty() {
        return disQty;
    }

    public void setDisQty(Integer disQty) {
        this.disQty = disQty;
    }

    public OrderTrail price(Double price) {
        this.price = price;
        return this;
    }

    /**
     * Get price
     *
     * @return price
     **/
    @Schema(description = "")
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public OrderTrail exc(ExcEnum exc) {
        this.exc = exc;
        return this;
    }

    /**
     * Get exc
     *
     * @return exc
     **/
    @Schema(description = "")
    public ExcEnum getExc() {
        return exc;
    }

    public void setExc(ExcEnum exc) {
        this.exc = exc;
    }

    public OrderTrail ordId(String ordId) {
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

    public OrderTrail exchOrdId(String exchOrdId) {
        this.exchOrdId = exchOrdId;
        return this;
    }

    /**
     * Get exchOrdId
     *
     * @return exchOrdId
     **/
    @Schema(description = "")
    public String getExchOrdId() {
        return exchOrdId;
    }

    public void setExchOrdId(String exchOrdId) {
        this.exchOrdId = exchOrdId;
    }

    public OrderTrail currentOrdStatus(String currentOrdStatus) {
        this.currentOrdStatus = currentOrdStatus;
        return this;
    }

    /**
     * Get currentOrdStatus
     *
     * @return currentOrdStatus
     **/
    @Schema(description = "")
    public String getCurrentOrdStatus() {
        return currentOrdStatus;
    }

    public void setCurrentOrdStatus(String currentOrdStatus) {
        this.currentOrdStatus = currentOrdStatus;
    }

    public OrderTrail tradedQty(Integer tradedQty) {
        this.tradedQty = tradedQty;
        return this;
    }

    /**
     * Get tradedQty
     *
     * @return tradedQty
     **/
    @Schema(description = "")
    public Integer getTradedQty() {
        return tradedQty;
    }

    public void setTradedQty(Integer tradedQty) {
        this.tradedQty = tradedQty;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrderTrail orderTrail = (OrderTrail) o;
        return Objects.equals(this.limitPrice, orderTrail.limitPrice) &&
                Objects.equals(this.lupdateDateTime, orderTrail.lupdateDateTime) &&
                Objects.equals(this.ordDesc, orderTrail.ordDesc) &&
                Objects.equals(this.modifiedBy, orderTrail.modifiedBy) &&
                Objects.equals(this.status, orderTrail.status) &&
                Objects.equals(this.rejReason, orderTrail.rejReason) &&
                Objects.equals(this.avgPrice, orderTrail.avgPrice) &&
                Objects.equals(this.qty, orderTrail.qty) &&
                Objects.equals(this.pendingQty, orderTrail.pendingQty) &&
                Objects.equals(this.disQty, orderTrail.disQty) &&
                Objects.equals(this.price, orderTrail.price) &&
                Objects.equals(this.exc, orderTrail.exc) &&
                Objects.equals(this.ordId, orderTrail.ordId) &&
                Objects.equals(this.exchOrdId, orderTrail.exchOrdId) &&
                Objects.equals(this.currentOrdStatus, orderTrail.currentOrdStatus) &&
                Objects.equals(this.tradedQty, orderTrail.tradedQty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limitPrice, lupdateDateTime, ordDesc, modifiedBy, status, rejReason, avgPrice, qty, pendingQty, disQty, price, exc, ordId, exchOrdId, currentOrdStatus, tradedQty);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderTrail {\n");

        sb.append("limitPrice: ").append(toIndentedString(limitPrice)).append("\n");
        sb.append("lupdateDateTime: ").append(toIndentedString(lupdateDateTime)).append("\n");
        sb.append("ordDesc: ").append(toIndentedString(ordDesc)).append("\n");
        sb.append("modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
        sb.append("status: ").append(toIndentedString(status)).append("\n");
        sb.append("rejReason: ").append(toIndentedString(rejReason)).append("\n");
        sb.append("avgPrice: ").append(toIndentedString(avgPrice)).append("\n");
        sb.append("qty: ").append(toIndentedString(qty)).append("\n");
        sb.append("pendingQty: ").append(toIndentedString(pendingQty)).append("\n");
        sb.append("disQty: ").append(toIndentedString(disQty)).append("\n");
        sb.append("price: ").append(toIndentedString(price)).append("\n");
        sb.append("exc: ").append(toIndentedString(exc)).append("\n");
        sb.append("ordId: ").append(toIndentedString(ordId)).append("\n");
        sb.append("exchOrdId: ").append(toIndentedString(exchOrdId)).append("\n");
        sb.append("currentOrdStatus: ").append(toIndentedString(currentOrdStatus)).append("\n");
        sb.append("tradedQty: ").append(toIndentedString(tradedQty)).append("\n");
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
