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
 * OrderBook
 */
public class OrderBook {
    @SerializedName("symbol")
    private SymbolDto symbol = null;

    @SerializedName("ordId")
    private String ordId = null;

    @SerializedName("exchOrdId")
    private String exchOrdId = null;

    @SerializedName("parOrdId")
    private String parOrdId = null;

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

    /**
     * Gets or Sets ordAction
     */
    @JsonAdapter(OrdActionEnum.Adapter.class)
    public enum OrdActionEnum {
        @SerializedName("BUY")
        BUY("BUY"),
        @SerializedName("SELL")
        SELL("SELL"),
        @SerializedName("SHORT")
        SHORT("SHORT"),
        @SerializedName("NONE")
        NONE("NONE");

        private String value;

        OrdActionEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static OrdActionEnum fromValue(String input) {
            for (OrdActionEnum b : OrdActionEnum.values()) {
                if (b.value.equals(input)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<OrdActionEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final OrdActionEnum enumeration) throws IOException {
                jsonWriter.value(String.valueOf(enumeration.getValue()));
            }

            @Override
            public OrdActionEnum read(final JsonReader jsonReader) throws IOException {
                Object value = jsonReader.nextString();
                return OrdActionEnum.fromValue((String) (value));
            }
        }
    }

    @SerializedName("ordAction")
    private OrdActionEnum ordAction = null;

    /**
     * Gets or Sets ordType
     */
    @JsonAdapter(OrdTypeEnum.Adapter.class)
    public enum OrdTypeEnum {
        @SerializedName("Market")
        MARKET("Market"),
        @SerializedName("Limit")
        LIMIT("Limit"),
        @SerializedName("Stop")
        STOP("Stop"),
        @SerializedName("Stop-loss")
        STOP_LOSS("Stop-loss"),
        @SerializedName("SL-M")
        SL_M("SL-M"),
        @SerializedName("SL")
        SL("SL"),
        @SerializedName("None")
        NONE("None");

        private String value;

        OrdTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static OrdTypeEnum fromValue(String input) {
            for (OrdTypeEnum b : OrdTypeEnum.values()) {
                if (b.value.equals(input)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<OrdTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final OrdTypeEnum enumeration) throws IOException {
                jsonWriter.value(String.valueOf(enumeration.getValue()));
            }

            @Override
            public OrdTypeEnum read(final JsonReader jsonReader) throws IOException {
                Object value = jsonReader.nextString();
                return OrdTypeEnum.fromValue((String) (value));
            }
        }
    }

    @SerializedName("ordType")
    private OrdTypeEnum ordType = null;

    /**
     * Gets or Sets prdType
     */
    @JsonAdapter(PrdTypeEnum.Adapter.class)
    public enum PrdTypeEnum {
        @SerializedName("CASH")
        CASH("CASH"),
        @SerializedName("MTF")
        MTF("MTF"),
        @SerializedName("INTRADAY")
        INTRADAY("INTRADAY"),
        @SerializedName("MARGIN")
        MARGIN("MARGIN"),
        @SerializedName("SHORTSELL")
        SHORTSELL("SHORTSELL"),
        @SerializedName("COVER_ORDER")
        COVER_ORDER("COVER_ORDER"),
        @SerializedName("BRACKET_ORDER")
        BRACKET_ORDER("BRACKET_ORDER"),
        @SerializedName("NRML")
        NRML("NRML"),
        @SerializedName("TNC")
        TNC("TNC"),
        @SerializedName("DELIVERY")
        DELIVERY("DELIVERY"),
        @SerializedName("CARRYFORWARD")
        CARRYFORWARD("CARRYFORWARD"),
        @SerializedName("NONE")
        NONE("NONE");

        private String value;

        PrdTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static PrdTypeEnum fromValue(String input) {
            for (PrdTypeEnum b : PrdTypeEnum.values()) {
                if (b.value.equals(input)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<PrdTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final PrdTypeEnum enumeration) throws IOException {
                jsonWriter.value(String.valueOf(enumeration.getValue()));
            }

            @Override
            public PrdTypeEnum read(final JsonReader jsonReader) throws IOException {
                Object value = jsonReader.nextString();
                return PrdTypeEnum.fromValue((String) (value));
            }
        }
    }

    @SerializedName("prdType")
    private PrdTypeEnum prdType = null;

    /**
     * Gets or Sets ordValidity
     */
    @JsonAdapter(OrdValidityEnum.Adapter.class)
    public enum OrdValidityEnum {
        @SerializedName("DAY")
        DAY("DAY"),
        @SerializedName("IOC")
        IOC("IOC"),
        @SerializedName("GMT")
        GMT("GMT"),
        @SerializedName("GTC")
        GTC("GTC"),
        @SerializedName("AMO")
        AMO("AMO"),
        @SerializedName("GTD")
        GTD("GTD"),
        @SerializedName("NONE")
        NONE("NONE");

        private String value;

        OrdValidityEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static OrdValidityEnum fromValue(String input) {
            for (OrdValidityEnum b : OrdValidityEnum.values()) {
                if (b.value.equals(input)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<OrdValidityEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final OrdValidityEnum enumeration) throws IOException {
                jsonWriter.value(String.valueOf(enumeration.getValue()));
            }

            @Override
            public OrdValidityEnum read(final JsonReader jsonReader) throws IOException {
                Object value = jsonReader.nextString();
                return OrdValidityEnum.fromValue((String) (value));
            }
        }
    }

    @SerializedName("ordValidity")
    private OrdValidityEnum ordValidity = null;

    @SerializedName("modifiedBy")
    private String modifiedBy = null;

    @SerializedName("price")
    private Double price = null;

    @SerializedName("triggerPrice")
    private Double triggerPrice = null;

    @SerializedName("avgPrice")
    private Double avgPrice = null;

    @SerializedName("remarks")
    private String remarks = null;

    @SerializedName("rejReason")
    private String rejReason = null;

    @SerializedName("ordDate")
    private String ordDate = null;

    @SerializedName("excOrdTime")
    private String excOrdTime = null;

    @SerializedName("boOrdStatus")
    private String boOrdStatus = null;

    @SerializedName("exitable")
    private String exitable = null;

    @SerializedName("qty")
    private Integer qty = null;

    @SerializedName("disQty")
    private Integer disQty = null;

    @SerializedName("tradedQty")
    private Integer tradedQty = null;

    @SerializedName("remainQty")
    private Integer remainQty = null;

    @SerializedName("cancelledQty")
    private Integer cancelledQty = null;

    @SerializedName("mktPro")
    private String mktPro = null;

    @SerializedName("undAsset")
    private String undAsset = null;

    @SerializedName("amo")
    private Boolean amo = null;

    @SerializedName("modifiable")
    private Boolean modifiable = null;

    @SerializedName("cancellable")
    private Boolean cancellable = null;

    public OrderBook symbol(SymbolDto symbol) {
        this.symbol = symbol;
        return this;
    }

    /**
     * Get symbol
     *
     * @return symbol
     **/
    @Schema(description = "")
    public SymbolDto getSymbol() {
        return symbol;
    }

    public void setSymbol(SymbolDto symbol) {
        this.symbol = symbol;
    }

    public OrderBook ordId(String ordId) {
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

    public OrderBook exchOrdId(String exchOrdId) {
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

    public OrderBook parOrdId(String parOrdId) {
        this.parOrdId = parOrdId;
        return this;
    }

    /**
     * Get parOrdId
     *
     * @return parOrdId
     **/
    @Schema(description = "")
    public String getParOrdId() {
        return parOrdId;
    }

    public void setParOrdId(String parOrdId) {
        this.parOrdId = parOrdId;
    }

    public OrderBook status(StatusEnum status) {
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

    public OrderBook ordAction(OrdActionEnum ordAction) {
        this.ordAction = ordAction;
        return this;
    }

    /**
     * Get ordAction
     *
     * @return ordAction
     **/
    @Schema(description = "")
    public OrdActionEnum getOrdAction() {
        return ordAction;
    }

    public void setOrdAction(OrdActionEnum ordAction) {
        this.ordAction = ordAction;
    }

    public OrderBook ordType(OrdTypeEnum ordType) {
        this.ordType = ordType;
        return this;
    }

    /**
     * Get ordType
     *
     * @return ordType
     **/
    @Schema(description = "")
    public OrdTypeEnum getOrdType() {
        return ordType;
    }

    public void setOrdType(OrdTypeEnum ordType) {
        this.ordType = ordType;
    }

    public OrderBook prdType(PrdTypeEnum prdType) {
        this.prdType = prdType;
        return this;
    }

    /**
     * Get prdType
     *
     * @return prdType
     **/
    @Schema(description = "")
    public PrdTypeEnum getPrdType() {
        return prdType;
    }

    public void setPrdType(PrdTypeEnum prdType) {
        this.prdType = prdType;
    }

    public OrderBook ordValidity(OrdValidityEnum ordValidity) {
        this.ordValidity = ordValidity;
        return this;
    }

    /**
     * Get ordValidity
     *
     * @return ordValidity
     **/
    @Schema(description = "")
    public OrdValidityEnum getOrdValidity() {
        return ordValidity;
    }

    public void setOrdValidity(OrdValidityEnum ordValidity) {
        this.ordValidity = ordValidity;
    }

    public OrderBook modifiedBy(String modifiedBy) {
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

    public OrderBook price(Double price) {
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

    public OrderBook triggerPrice(Double triggerPrice) {
        this.triggerPrice = triggerPrice;
        return this;
    }

    /**
     * Get triggerPrice
     *
     * @return triggerPrice
     **/
    @Schema(description = "")
    public Double getTriggerPrice() {
        return triggerPrice;
    }

    public void setTriggerPrice(Double triggerPrice) {
        this.triggerPrice = triggerPrice;
    }

    public OrderBook avgPrice(Double avgPrice) {
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

    public OrderBook remarks(String remarks) {
        this.remarks = remarks;
        return this;
    }

    /**
     * Get remarks
     *
     * @return remarks
     **/
    @Schema(description = "")
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public OrderBook rejReason(String rejReason) {
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

    public OrderBook ordDate(String ordDate) {
        this.ordDate = ordDate;
        return this;
    }

    /**
     * Get ordDate
     *
     * @return ordDate
     **/
    @Schema(description = "")
    public String getOrdDate() {
        return ordDate;
    }

    public void setOrdDate(String ordDate) {
        this.ordDate = ordDate;
    }

    public OrderBook excOrdTime(String excOrdTime) {
        this.excOrdTime = excOrdTime;
        return this;
    }

    /**
     * Get excOrdTime
     *
     * @return excOrdTime
     **/
    @Schema(description = "")
    public String getExcOrdTime() {
        return excOrdTime;
    }

    public void setExcOrdTime(String excOrdTime) {
        this.excOrdTime = excOrdTime;
    }

    public OrderBook boOrdStatus(String boOrdStatus) {
        this.boOrdStatus = boOrdStatus;
        return this;
    }

    /**
     * Get boOrdStatus
     *
     * @return boOrdStatus
     **/
    @Schema(description = "")
    public String getBoOrdStatus() {
        return boOrdStatus;
    }

    public void setBoOrdStatus(String boOrdStatus) {
        this.boOrdStatus = boOrdStatus;
    }

    public OrderBook exitable(String exitable) {
        this.exitable = exitable;
        return this;
    }

    /**
     * Get exitable
     *
     * @return exitable
     **/
    @Schema(description = "")
    public String getExitable() {
        return exitable;
    }

    public void setExitable(String exitable) {
        this.exitable = exitable;
    }

    public OrderBook qty(Integer qty) {
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

    public OrderBook disQty(Integer disQty) {
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

    public OrderBook tradedQty(Integer tradedQty) {
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

    public OrderBook remainQty(Integer remainQty) {
        this.remainQty = remainQty;
        return this;
    }

    /**
     * Get remainQty
     *
     * @return remainQty
     **/
    @Schema(description = "")
    public Integer getRemainQty() {
        return remainQty;
    }

    public void setRemainQty(Integer remainQty) {
        this.remainQty = remainQty;
    }

    public OrderBook cancelledQty(Integer cancelledQty) {
        this.cancelledQty = cancelledQty;
        return this;
    }

    /**
     * Get cancelledQty
     *
     * @return cancelledQty
     **/
    @Schema(description = "")
    public Integer getCancelledQty() {
        return cancelledQty;
    }

    public void setCancelledQty(Integer cancelledQty) {
        this.cancelledQty = cancelledQty;
    }

    public OrderBook mktPro(String mktPro) {
        this.mktPro = mktPro;
        return this;
    }

    /**
     * Get mktPro
     *
     * @return mktPro
     **/
    @Schema(description = "")
    public String getMktPro() {
        return mktPro;
    }

    public void setMktPro(String mktPro) {
        this.mktPro = mktPro;
    }

    public OrderBook undAsset(String undAsset) {
        this.undAsset = undAsset;
        return this;
    }

    /**
     * Get undAsset
     *
     * @return undAsset
     **/
    @Schema(description = "")
    public String getUndAsset() {
        return undAsset;
    }

    public void setUndAsset(String undAsset) {
        this.undAsset = undAsset;
    }

    public OrderBook amo(Boolean amo) {
        this.amo = amo;
        return this;
    }

    /**
     * Get amo
     *
     * @return amo
     **/
    @Schema(description = "")
    public Boolean isAmo() {
        return amo;
    }

    public void setAmo(Boolean amo) {
        this.amo = amo;
    }

    public OrderBook modifiable(Boolean modifiable) {
        this.modifiable = modifiable;
        return this;
    }

    /**
     * Get modifiable
     *
     * @return modifiable
     **/
    @Schema(description = "")
    public Boolean isModifiable() {
        return modifiable;
    }

    public void setModifiable(Boolean modifiable) {
        this.modifiable = modifiable;
    }

    public OrderBook cancellable(Boolean cancellable) {
        this.cancellable = cancellable;
        return this;
    }

    /**
     * Get cancellable
     *
     * @return cancellable
     **/
    @Schema(description = "")
    public Boolean isCancellable() {
        return cancellable;
    }

    public void setCancellable(Boolean cancellable) {
        this.cancellable = cancellable;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrderBook orderBook = (OrderBook) o;
        return Objects.equals(this.symbol, orderBook.symbol) &&
                Objects.equals(this.ordId, orderBook.ordId) &&
                Objects.equals(this.exchOrdId, orderBook.exchOrdId) &&
                Objects.equals(this.parOrdId, orderBook.parOrdId) &&
                Objects.equals(this.status, orderBook.status) &&
                Objects.equals(this.ordAction, orderBook.ordAction) &&
                Objects.equals(this.ordType, orderBook.ordType) &&
                Objects.equals(this.prdType, orderBook.prdType) &&
                Objects.equals(this.ordValidity, orderBook.ordValidity) &&
                Objects.equals(this.modifiedBy, orderBook.modifiedBy) &&
                Objects.equals(this.price, orderBook.price) &&
                Objects.equals(this.triggerPrice, orderBook.triggerPrice) &&
                Objects.equals(this.avgPrice, orderBook.avgPrice) &&
                Objects.equals(this.remarks, orderBook.remarks) &&
                Objects.equals(this.rejReason, orderBook.rejReason) &&
                Objects.equals(this.ordDate, orderBook.ordDate) &&
                Objects.equals(this.excOrdTime, orderBook.excOrdTime) &&
                Objects.equals(this.boOrdStatus, orderBook.boOrdStatus) &&
                Objects.equals(this.exitable, orderBook.exitable) &&
                Objects.equals(this.qty, orderBook.qty) &&
                Objects.equals(this.disQty, orderBook.disQty) &&
                Objects.equals(this.tradedQty, orderBook.tradedQty) &&
                Objects.equals(this.remainQty, orderBook.remainQty) &&
                Objects.equals(this.cancelledQty, orderBook.cancelledQty) &&
                Objects.equals(this.mktPro, orderBook.mktPro) &&
                Objects.equals(this.undAsset, orderBook.undAsset) &&
                Objects.equals(this.amo, orderBook.amo) &&
                Objects.equals(this.modifiable, orderBook.modifiable) &&
                Objects.equals(this.cancellable, orderBook.cancellable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol, ordId, exchOrdId, parOrdId, status, ordAction, ordType, prdType, ordValidity, modifiedBy, price, triggerPrice, avgPrice, remarks, rejReason, ordDate, excOrdTime, boOrdStatus, exitable, qty, disQty, tradedQty, remainQty, cancelledQty, mktPro, undAsset, amo, modifiable, cancellable);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderBook {\n");

        sb.append("symbol: ").append(toIndentedString(symbol)).append("\n");
        sb.append("ordId: ").append(toIndentedString(ordId)).append("\n");
        sb.append("exchOrdId: ").append(toIndentedString(exchOrdId)).append("\n");
        sb.append("parOrdId: ").append(toIndentedString(parOrdId)).append("\n");
        sb.append("status: ").append(toIndentedString(status)).append("\n");
        sb.append("ordAction: ").append(toIndentedString(ordAction)).append("\n");
        sb.append("ordType: ").append(toIndentedString(ordType)).append("\n");
        sb.append("prdType: ").append(toIndentedString(prdType)).append("\n");
        sb.append("ordValidity: ").append(toIndentedString(ordValidity)).append("\n");
        sb.append("modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
        sb.append("price: ").append(toIndentedString(price)).append("\n");
        sb.append("triggerPrice: ").append(toIndentedString(triggerPrice)).append("\n");
        sb.append("avgPrice: ").append(toIndentedString(avgPrice)).append("\n");
        sb.append("remarks: ").append(toIndentedString(remarks)).append("\n");
        sb.append("rejReason: ").append(toIndentedString(rejReason)).append("\n");
        sb.append("ordDate: ").append(toIndentedString(ordDate)).append("\n");
        sb.append("excOrdTime: ").append(toIndentedString(excOrdTime)).append("\n");
        sb.append("boOrdStatus: ").append(toIndentedString(boOrdStatus)).append("\n");
        sb.append("exitable: ").append(toIndentedString(exitable)).append("\n");
        sb.append("qty: ").append(toIndentedString(qty)).append("\n");
        sb.append("disQty: ").append(toIndentedString(disQty)).append("\n");
        sb.append("tradedQty: ").append(toIndentedString(tradedQty)).append("\n");
        sb.append("remainQty: ").append(toIndentedString(remainQty)).append("\n");
        sb.append("cancelledQty: ").append(toIndentedString(cancelledQty)).append("\n");
        sb.append("mktPro: ").append(toIndentedString(mktPro)).append("\n");
        sb.append("undAsset: ").append(toIndentedString(undAsset)).append("\n");
        sb.append("amo: ").append(toIndentedString(amo)).append("\n");
        sb.append("modifiable: ").append(toIndentedString(modifiable)).append("\n");
        sb.append("cancellable: ").append(toIndentedString(cancellable)).append("\n");
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
