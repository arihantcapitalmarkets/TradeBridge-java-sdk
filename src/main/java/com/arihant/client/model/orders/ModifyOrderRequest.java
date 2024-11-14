package com.arihant.client.model.orders;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.IOException;
import java.util.Objects;

/**
 * ModifyOrderRequest
 */
public class ModifyOrderRequest {
    @SerializedName("triggerPrice")
    private Double triggerPrice = null;

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
     * Gets or Sets instrument
     */
    @JsonAdapter(InstrumentEnum.Adapter.class)
    public enum InstrumentEnum {
        @SerializedName("STK")
        STK("STK"),
        @SerializedName("ETF")
        ETF("ETF"),
        @SerializedName("IDX")
        IDX("IDX"),
        @SerializedName("COM")
        COM("COM"),
        @SerializedName("UNDCUR")
        UNDCUR("UNDCUR"),
        @SerializedName("CUR")
        CUR("CUR"),
        @SerializedName("FUTIVX")
        FUTIVX("FUTIVX"),
        @SerializedName("FUTSTK")
        FUTSTK("FUTSTK"),
        @SerializedName("FUTIDX")
        FUTIDX("FUTIDX"),
        @SerializedName("FUTCUR")
        FUTCUR("FUTCUR"),
        @SerializedName("FUTIRD")
        FUTIRD("FUTIRD"),
        @SerializedName("FUTIRC")
        FUTIRC("FUTIRC"),
        @SerializedName("FUTIRT")
        FUTIRT("FUTIRT"),
        @SerializedName("FUTIRF")
        FUTIRF("FUTIRF"),
        @SerializedName("FUTCOM")
        FUTCOM("FUTCOM"),
        @SerializedName("FUTBLN")
        FUTBLN("FUTBLN"),
        @SerializedName("FUTENR")
        FUTENR("FUTENR"),
        @SerializedName("FUTMET")
        FUTMET("FUTMET"),
        @SerializedName("FUTAGR")
        FUTAGR("FUTAGR"),
        @SerializedName("OPTIDX")
        OPTIDX("OPTIDX"),
        @SerializedName("OPTSTK")
        OPTSTK("OPTSTK"),
        @SerializedName("OPTCOM")
        OPTCOM("OPTCOM"),
        @SerializedName("OPTBLN")
        OPTBLN("OPTBLN"),
        @SerializedName("OPTENR")
        OPTENR("OPTENR"),
        @SerializedName("OPTAGR")
        OPTAGR("OPTAGR"),
        @SerializedName("OPTCUR")
        OPTCUR("OPTCUR"),
        @SerializedName("OPTIRC")
        OPTIRC("OPTIRC"),
        @SerializedName("OPTIRD")
        OPTIRD("OPTIRD"),
        @SerializedName("UNDCOM")
        UNDCOM("UNDCOM"),
        @SerializedName("AUCSO")
        AUCSO("AUCSO"),
        @SerializedName("FUTIDXSPR")
        FUTIDXSPR("FUTIDXSPR"),
        @SerializedName("FUTSTKSPR")
        FUTSTKSPR("FUTSTKSPR"),
        @SerializedName("FUTCURSPR")
        FUTCURSPR("FUTCURSPR"),
        @SerializedName("FUTIRTSPR")
        FUTIRTSPR("FUTIRTSPR"),
        @SerializedName("FUTIRCSPR")
        FUTIRCSPR("FUTIRCSPR"),
        @SerializedName("FUTIRDSPR")
        FUTIRDSPR("FUTIRDSPR"),
        @SerializedName("OPTCURSPR")
        OPTCURSPR("OPTCURSPR"),
        @SerializedName("OPTIRCSPR")
        OPTIRCSPR("OPTIRCSPR"),
        @SerializedName("FUTCOMSPR")
        FUTCOMSPR("FUTCOMSPR"),
        @SerializedName("OPTCOMSPR")
        OPTCOMSPR("OPTCOMSPR"),
        @SerializedName("UNDIRC")
        UNDIRC("UNDIRC"),
        @SerializedName("UNDIRD")
        UNDIRD("UNDIRD"),
        @SerializedName("UNDIRT")
        UNDIRT("UNDIRT"),
        @SerializedName("NONE")
        NONE("NONE");

        private String value;

        InstrumentEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static InstrumentEnum fromValue(String input) {
            for (InstrumentEnum b : InstrumentEnum.values()) {
                if (b.value.equals(input)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<InstrumentEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final InstrumentEnum enumeration) throws IOException {
                jsonWriter.value(String.valueOf(enumeration.getValue()));
            }

            @Override
            public InstrumentEnum read(final JsonReader jsonReader) throws IOException {
                Object value = jsonReader.nextString();
                return InstrumentEnum.fromValue((String) (value));
            }
        }
    }

    @SerializedName("instrument")
    private InstrumentEnum instrument = null;

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

    @SerializedName("qty")
    private Integer qty = null;

    @SerializedName("lotSize")
    private Integer lotSize = null;

    @SerializedName("symbol")
    private String symbol = null;

    @SerializedName("ordId")
    private String ordId = null;

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

    @SerializedName("limitPrice")
    private Double limitPrice = null;

    @SerializedName("disQty")
    private Integer disQty = null;

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

    @SerializedName("tradedQty")
    private Integer tradedQty = null;

    @SerializedName("ordValidityDays")
    private Integer ordValidityDays = null;

    @SerializedName("exchangeToken")
    private String exchangeToken = null;

    @SerializedName("amo")
    private Boolean amo = null;

    public ModifyOrderRequest triggerPrice(Double triggerPrice) {
        this.triggerPrice = triggerPrice;
        return this;
    }

    /**
     * Get triggerPrice
     *
     * @return triggerPrice
     **/
    @Schema(required = true, description = "")
    public Double getTriggerPrice() {
        return triggerPrice;
    }

    public void setTriggerPrice(Double triggerPrice) {
        this.triggerPrice = triggerPrice;
    }

    public ModifyOrderRequest ordType(OrdTypeEnum ordType) {
        this.ordType = ordType;
        return this;
    }

    /**
     * Get ordType
     *
     * @return ordType
     **/
    @Schema(required = true, description = "")
    public OrdTypeEnum getOrdType() {
        return ordType;
    }

    public void setOrdType(OrdTypeEnum ordType) {
        this.ordType = ordType;
    }

    public ModifyOrderRequest prdType(PrdTypeEnum prdType) {
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

    public ModifyOrderRequest instrument(InstrumentEnum instrument) {
        this.instrument = instrument;
        return this;
    }

    /**
     * Get instrument
     *
     * @return instrument
     **/
    @Schema(required = true, description = "")
    public InstrumentEnum getInstrument() {
        return instrument;
    }

    public void setInstrument(InstrumentEnum instrument) {
        this.instrument = instrument;
    }

    public ModifyOrderRequest exc(ExcEnum exc) {
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

    public ModifyOrderRequest qty(Integer qty) {
        this.qty = qty;
        return this;
    }

    /**
     * Get qty
     *
     * @return qty
     **/
    @Schema(required = true, description = "")
    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public ModifyOrderRequest lotSize(Integer lotSize) {
        this.lotSize = lotSize;
        return this;
    }

    /**
     * Get lotSize
     *
     * @return lotSize
     **/
    @Schema(required = true, description = "")
    public Integer getLotSize() {
        return lotSize;
    }

    public void setLotSize(Integer lotSize) {
        this.lotSize = lotSize;
    }

    public ModifyOrderRequest symbol(String symbol) {
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

    public ModifyOrderRequest ordId(String ordId) {
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

    public ModifyOrderRequest ordAction(OrdActionEnum ordAction) {
        this.ordAction = ordAction;
        return this;
    }

    /**
     * Get ordAction
     *
     * @return ordAction
     **/
    @Schema(required = true, description = "")
    public OrdActionEnum getOrdAction() {
        return ordAction;
    }

    public void setOrdAction(OrdActionEnum ordAction) {
        this.ordAction = ordAction;
    }

    public ModifyOrderRequest limitPrice(Double limitPrice) {
        this.limitPrice = limitPrice;
        return this;
    }

    /**
     * Get limitPrice
     *
     * @return limitPrice
     **/
    @Schema(required = true, description = "")
    public Double getLimitPrice() {
        return limitPrice;
    }

    public void setLimitPrice(Double limitPrice) {
        this.limitPrice = limitPrice;
    }

    public ModifyOrderRequest disQty(Integer disQty) {
        this.disQty = disQty;
        return this;
    }

    /**
     * Get disQty
     *
     * @return disQty
     **/
    @Schema(required = true, description = "")
    public Integer getDisQty() {
        return disQty;
    }

    public void setDisQty(Integer disQty) {
        this.disQty = disQty;
    }

    public ModifyOrderRequest ordValidity(OrdValidityEnum ordValidity) {
        this.ordValidity = ordValidity;
        return this;
    }

    /**
     * Get ordValidity
     *
     * @return ordValidity
     **/
    @Schema(required = true, description = "")
    public OrdValidityEnum getOrdValidity() {
        return ordValidity;
    }

    public void setOrdValidity(OrdValidityEnum ordValidity) {
        this.ordValidity = ordValidity;
    }

    public ModifyOrderRequest tradedQty(Integer tradedQty) {
        this.tradedQty = tradedQty;
        return this;
    }

    /**
     * Get tradedQty
     *
     * @return tradedQty
     **/
    @Schema(required = true, description = "")
    public Integer getTradedQty() {
        return tradedQty;
    }

    public void setTradedQty(Integer tradedQty) {
        this.tradedQty = tradedQty;
    }

    public ModifyOrderRequest ordValidityDays(Integer ordValidityDays) {
        this.ordValidityDays = ordValidityDays;
        return this;
    }

    /**
     * Get ordValidityDays
     *
     * @return ordValidityDays
     **/
    @Schema(required = true, description = "")
    public Integer getOrdValidityDays() {
        return ordValidityDays;
    }

    public void setOrdValidityDays(Integer ordValidityDays) {
        this.ordValidityDays = ordValidityDays;
    }

    public ModifyOrderRequest exchangeToken(String exchangeToken) {
        this.exchangeToken = exchangeToken;
        return this;
    }

    /**
     * Get exchangeToken
     *
     * @return exchangeToken
     **/
    @Schema(description = "")
    public String getExchangeToken() {
        return exchangeToken;
    }

    public void setExchangeToken(String exchangeToken) {
        this.exchangeToken = exchangeToken;
    }

    public ModifyOrderRequest amo(Boolean amo) {
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


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ModifyOrderRequest modifyOrderRequest = (ModifyOrderRequest) o;
        return Objects.equals(this.triggerPrice, modifyOrderRequest.triggerPrice) &&
                Objects.equals(this.ordType, modifyOrderRequest.ordType) &&
                Objects.equals(this.prdType, modifyOrderRequest.prdType) &&
                Objects.equals(this.instrument, modifyOrderRequest.instrument) &&
                Objects.equals(this.exc, modifyOrderRequest.exc) &&
                Objects.equals(this.qty, modifyOrderRequest.qty) &&
                Objects.equals(this.lotSize, modifyOrderRequest.lotSize) &&
                Objects.equals(this.symbol, modifyOrderRequest.symbol) &&
                Objects.equals(this.ordId, modifyOrderRequest.ordId) &&
                Objects.equals(this.ordAction, modifyOrderRequest.ordAction) &&
                Objects.equals(this.limitPrice, modifyOrderRequest.limitPrice) &&
                Objects.equals(this.disQty, modifyOrderRequest.disQty) &&
                Objects.equals(this.ordValidity, modifyOrderRequest.ordValidity) &&
                Objects.equals(this.tradedQty, modifyOrderRequest.tradedQty) &&
                Objects.equals(this.ordValidityDays, modifyOrderRequest.ordValidityDays) &&
                Objects.equals(this.exchangeToken, modifyOrderRequest.exchangeToken) &&
                Objects.equals(this.amo, modifyOrderRequest.amo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(triggerPrice, ordType, prdType, instrument, exc, qty, lotSize, symbol, ordId, ordAction, limitPrice, disQty, ordValidity, tradedQty, ordValidityDays, exchangeToken, amo);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyOrderRequest {\n");

        sb.append("triggerPrice: ").append(toIndentedString(triggerPrice)).append("\n");
        sb.append("ordType: ").append(toIndentedString(ordType)).append("\n");
        sb.append("prdType: ").append(toIndentedString(prdType)).append("\n");
        sb.append("instrument: ").append(toIndentedString(instrument)).append("\n");
        sb.append("exc: ").append(toIndentedString(exc)).append("\n");
        sb.append("qty: ").append(toIndentedString(qty)).append("\n");
        sb.append("lotSize: ").append(toIndentedString(lotSize)).append("\n");
        sb.append("symbol: ").append(toIndentedString(symbol)).append("\n");
        sb.append("ordId: ").append(toIndentedString(ordId)).append("\n");
        sb.append("ordAction: ").append(toIndentedString(ordAction)).append("\n");
        sb.append("limitPrice: ").append(toIndentedString(limitPrice)).append("\n");
        sb.append("disQty: ").append(toIndentedString(disQty)).append("\n");
        sb.append("ordValidity: ").append(toIndentedString(ordValidity)).append("\n");
        sb.append("tradedQty: ").append(toIndentedString(tradedQty)).append("\n");
        sb.append("ordValidityDays: ").append(toIndentedString(ordValidityDays)).append("\n");
        sb.append("exchangeToken: ").append(toIndentedString(exchangeToken)).append("\n");
        sb.append("amo: ").append(toIndentedString(amo)).append("\n");
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
