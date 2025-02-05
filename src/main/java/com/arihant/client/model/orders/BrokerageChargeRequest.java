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
 * BrokerageChargeRequest
 */
public class BrokerageChargeRequest {
    @SerializedName("symbol")
    private String symbol = null;

    /**
     * Gets or Sets orderAction
     */
    @JsonAdapter(OrderActionEnum.Adapter.class)
    public enum OrderActionEnum {
        @SerializedName("BUY")
        BUY("BUY"),
        @SerializedName("SELL")
        SELL("SELL"),
        @SerializedName("SHORT")
        SHORT("SHORT"),
        @SerializedName("NONE")
        NONE("NONE");

        private String value;

        OrderActionEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static OrderActionEnum fromValue(String input) {
            for (OrderActionEnum b : OrderActionEnum.values()) {
                if (b.value.equals(input)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<OrderActionEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final OrderActionEnum enumeration) throws IOException {
                jsonWriter.value(String.valueOf(enumeration.getValue()));
            }

            @Override
            public OrderActionEnum read(final JsonReader jsonReader) throws IOException {
                Object value = jsonReader.nextString();
                return OrderActionEnum.fromValue((String) (value));
            }
        }
    }

    @SerializedName("ordAction")
    private OrderActionEnum ordAction = null;

    @SerializedName("excToken")
    private String excToken = null;

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
    private String qty = null;

    @SerializedName("price")
    private String price = null;

    /**
     * Gets or Sets product
     */
    @JsonAdapter(ProductEnum.Adapter.class)
    public enum ProductEnum {
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

        ProductEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static ProductEnum fromValue(String input) {
            for (ProductEnum b : ProductEnum.values()) {
                if (b.value.equals(input)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<ProductEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final ProductEnum enumeration) throws IOException {
                jsonWriter.value(String.valueOf(enumeration.getValue()));
            }

            @Override
            public ProductEnum read(final JsonReader jsonReader) throws IOException {
                Object value = jsonReader.nextString();
                return ProductEnum.fromValue((String) (value));
            }
        }
    }

    @SerializedName("prdType")
    private ProductEnum prdType = null;

    @SerializedName("triggerPrice")
    private String triggerPrice = null;

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

    public BrokerageChargeRequest symbol(String symbol) {
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

    public BrokerageChargeRequest orderAction(OrderActionEnum orderAction) {
        this.ordAction = orderAction;
        return this;
    }

    /**
     * Get orderAction
     *
     * @return orderAction
     **/
    @Schema(required = true, description = "")
    public OrderActionEnum getOrdAction() {
        return ordAction;
    }

    public void setOrdAction(OrderActionEnum ordAction) {
        this.ordAction = ordAction;
    }

    public BrokerageChargeRequest orderType(OrdTypeEnum orderType) {
        this.ordType = orderType;
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

    public void setOrdType(OrdTypeEnum orderType) {
        this.ordType = orderType;
    }


    public BrokerageChargeRequest excToken(String excToken) {
        this.excToken = excToken;
        return this;
    }

    /**
     * Get excToken
     *
     * @return excToken
     **/
    @Schema(required = true, description = "")
    public String getExcToken() {
        return excToken;
    }

    public void setExcToken(String excToken) {
        this.excToken = excToken;
    }

    public BrokerageChargeRequest exc(ExcEnum exc) {
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

    public BrokerageChargeRequest qty(String qty) {
        this.qty = qty;
        return this;
    }

    /**
     * Get qty
     *
     * @return qty
     **/
    @Schema(required = true, description = "")
    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public BrokerageChargeRequest price(String price) {
        this.price = price;
        return this;
    }

    /**
     * Get price
     *
     * @return price
     **/
    @Schema(required = true, description = "")
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public BrokerageChargeRequest product(ProductEnum product) {
        this.prdType = product;
        return this;
    }

    /**
     * Get product
     *
     * @return product
     **/
    @Schema(required = true, description = "")
    public ProductEnum getPrdType() {
        return prdType;
    }

    public void setPrdType(ProductEnum prdType) {
        this.prdType = prdType;
    }

    public BrokerageChargeRequest triggerPrice(String triggerPrice) {
        this.triggerPrice = triggerPrice;
        return this;
    }

    /**
     * Get triggerPrice
     *
     * @return triggerPrice
     **/
    @Schema(required = true, description = "")
    public String getTriggerPrice() {
        return triggerPrice;
    }

    public void setTriggerPrice(String triggerPrice) {
        this.triggerPrice = triggerPrice;
    }

    public BrokerageChargeRequest instrument(InstrumentEnum instrument) {
        this.instrument = instrument;
        return this;
    }

    /**
     * Get instrument
     *
     * @return instrument
     **/
    @Schema(description = "")
    public InstrumentEnum getInstrument() {
        return instrument;
    }

    public void setInstrument(InstrumentEnum instrument) {
        this.instrument = instrument;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BrokerageChargeRequest brokerageChargeRequest = (BrokerageChargeRequest) o;
        return Objects.equals(this.symbol, brokerageChargeRequest.symbol) &&
                Objects.equals(this.ordAction, brokerageChargeRequest.ordAction) &&
                Objects.equals(this.excToken, brokerageChargeRequest.excToken) &&
                Objects.equals(this.exc, brokerageChargeRequest.exc) &&
                Objects.equals(this.qty, brokerageChargeRequest.qty) &&
                Objects.equals(this.price, brokerageChargeRequest.price) &&
                Objects.equals(this.prdType, brokerageChargeRequest.prdType) &&
                Objects.equals(this.ordType, brokerageChargeRequest.ordType) &&
                Objects.equals(this.triggerPrice, brokerageChargeRequest.triggerPrice) &&
                Objects.equals(this.instrument, brokerageChargeRequest.instrument);
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol, ordAction, excToken, exc, qty, ordType, price, prdType, triggerPrice, instrument);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BrokerageChargeRequest {\n");

        sb.append("symbol: ").append(toIndentedString(symbol)).append("\n");
        sb.append("ordAction: ").append(toIndentedString(ordAction)).append("\n");
        sb.append("excToken: ").append(toIndentedString(excToken)).append("\n");
        sb.append("exc: ").append(toIndentedString(exc)).append("\n");
        sb.append("qty: ").append(toIndentedString(qty)).append("\n");
        sb.append("price: ").append(toIndentedString(price)).append("\n");
        sb.append("prdType: ").append(toIndentedString(prdType)).append("\n");
        sb.append("ordType: ").append(toIndentedString(ordType)).append("\n");
        sb.append("triggerPrice: ").append(toIndentedString(triggerPrice)).append("\n");
        sb.append("instrument: ").append(toIndentedString(instrument)).append("\n");
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
