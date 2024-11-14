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
 * ExitOrderRequest
 */

public class ExitOrderRequest {
    @SerializedName("symbol")
    private String symbol = null;

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

    @SerializedName("boOrdStatus")
    private String boOrdStatus = null;

    @SerializedName("ordId")
    private String ordId = null;

    @SerializedName("parOrdId")
    private String parOrdId = null;

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
                Objects.equals(this.parOrdId, exitOrderRequest.parOrdId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol, exc, prdType, boOrdStatus, ordId, parOrdId);
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
