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
 * OrderTrailRequest
 */

public class OrderTrailRequest {
    @SerializedName("ordId")
    private String ordId = null;

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

    public OrderTrailRequest ordId(String ordId) {
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

    public OrderTrailRequest instrument(InstrumentEnum instrument) {
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
        OrderTrailRequest orderTrailRequest = (OrderTrailRequest) o;
        return Objects.equals(this.ordId, orderTrailRequest.ordId) &&
                Objects.equals(this.instrument, orderTrailRequest.instrument);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ordId, instrument);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderTrailRequest {\n");

        sb.append("ordId: ").append(toIndentedString(ordId)).append("\n");
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
