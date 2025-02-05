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
 * TradeBook
 */
public class TradeBook {
    @SerializedName("symbol")
    private SymbolDto symbol = null;

    @SerializedName("ordId")
    private String ordId = null;

    @SerializedName("exchTrdId")
    private String exchTrdId = null;

    @SerializedName("exchOrdId")
    private String exchOrdId = null;

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

    @SerializedName("tradedPrice")
    private Double tradedPrice = null;

    @SerializedName("tradeTime")
    private String tradeTime = null;

    @SerializedName("tradedQty")
    private Integer tradedQty = null;

    @SerializedName("remainQty")
    private Integer remainQty = null;

    @SerializedName("qty")
    private Integer qty = null;

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

    @SerializedName("undAsset")
    private String undAsset = null;

    public TradeBook symbol(SymbolDto symbol) {
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

    public TradeBook ordId(String ordId) {
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

    public TradeBook exchTrdId(String exchTrdId) {
        this.exchTrdId = exchTrdId;
        return this;
    }

    /**
     * Get exchTrdId
     *
     * @return exchTrdId
     **/
    @Schema(description = "")
    public String getExchTrdId() {
        return exchTrdId;
    }

    public void setExchTrdId(String exchTrdId) {
        this.exchTrdId = exchTrdId;
    }

    public TradeBook exchOrdId(String exchOrdId) {
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

    public TradeBook prdType(PrdTypeEnum prdType) {
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

    public TradeBook ordAction(OrdActionEnum ordAction) {
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

    public TradeBook ordType(OrdTypeEnum ordType) {
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

    public TradeBook tradedPrice(Double tradedPrice) {
        this.tradedPrice = tradedPrice;
        return this;
    }

    /**
     * Get tradedPrice
     *
     * @return tradedPrice
     **/
    @Schema(description = "")
    public Double getTradedPrice() {
        return tradedPrice;
    }

    public void setTradedPrice(Double tradedPrice) {
        this.tradedPrice = tradedPrice;
    }

    public TradeBook tradeTime(String tradeTime) {
        this.tradeTime = tradeTime;
        return this;
    }

    /**
     * Get tradeTime
     *
     * @return tradeTime
     **/
    @Schema(description = "")
    public String getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(String tradeTime) {
        this.tradeTime = tradeTime;
    }

    public TradeBook tradedQty(Integer tradedQty) {
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

    public TradeBook remainQty(Integer remainQty) {
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

    public TradeBook qty(Integer qty) {
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

    public TradeBook ordValidity(OrdValidityEnum ordValidity) {
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

    public TradeBook undAsset(String undAsset) {
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


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TradeBook tradeBook = (TradeBook) o;
        return Objects.equals(this.symbol, tradeBook.symbol) &&
                Objects.equals(this.ordId, tradeBook.ordId) &&
                Objects.equals(this.exchTrdId, tradeBook.exchTrdId) &&
                Objects.equals(this.exchOrdId, tradeBook.exchOrdId) &&
                Objects.equals(this.prdType, tradeBook.prdType) &&
                Objects.equals(this.ordAction, tradeBook.ordAction) &&
                Objects.equals(this.ordType, tradeBook.ordType) &&
                Objects.equals(this.tradedPrice, tradeBook.tradedPrice) &&
                Objects.equals(this.tradeTime, tradeBook.tradeTime) &&
                Objects.equals(this.tradedQty, tradeBook.tradedQty) &&
                Objects.equals(this.remainQty, tradeBook.remainQty) &&
                Objects.equals(this.qty, tradeBook.qty) &&
                Objects.equals(this.ordValidity, tradeBook.ordValidity) &&
                Objects.equals(this.undAsset, tradeBook.undAsset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol, ordId, exchTrdId, exchOrdId, prdType, ordAction, ordType, tradedPrice, tradeTime, tradedQty, remainQty, qty, ordValidity, undAsset);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TradeBook {\n");

        sb.append("symbol: ").append(toIndentedString(symbol)).append("\n");
        sb.append("ordId: ").append(toIndentedString(ordId)).append("\n");
        sb.append("exchTrdId: ").append(toIndentedString(exchTrdId)).append("\n");
        sb.append("exchOrdId: ").append(toIndentedString(exchOrdId)).append("\n");
        sb.append("prdType: ").append(toIndentedString(prdType)).append("\n");
        sb.append("ordAction: ").append(toIndentedString(ordAction)).append("\n");
        sb.append("ordType: ").append(toIndentedString(ordType)).append("\n");
        sb.append("tradedPrice: ").append(toIndentedString(tradedPrice)).append("\n");
        sb.append("tradeTime: ").append(toIndentedString(tradeTime)).append("\n");
        sb.append("tradedQty: ").append(toIndentedString(tradedQty)).append("\n");
        sb.append("remainQty: ").append(toIndentedString(remainQty)).append("\n");
        sb.append("qty: ").append(toIndentedString(qty)).append("\n");
        sb.append("ordValidity: ").append(toIndentedString(ordValidity)).append("\n");
        sb.append("undAsset: ").append(toIndentedString(undAsset)).append("\n");
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
