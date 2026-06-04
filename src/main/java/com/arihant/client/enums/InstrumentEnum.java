package com.arihant.client.enums;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

@JsonAdapter(InstrumentEnum.Adapter.class)
public enum InstrumentEnum {
    @SerializedName("STK")
    STK("STK"),
    @SerializedName("ETF")
    ETF("ETF"),
    @SerializedName("IDX")
    IDX("IDX"),
    @SerializedName("FUTSTK")
    FUTSTK("FUTSTK"),
    @SerializedName("FUTIDX")
    FUTIDX("FUTIDX"),
    @SerializedName("FUTCUR")
    FUTCUR("FUTCUR"),
    @SerializedName("OPTIDX")
    OPTIDX("OPTIDX"),
    @SerializedName("OPTSTK")
    OPTSTK("OPTSTK"),
    @SerializedName("OPTCUR")
    OPTCUR("OPTCUR");


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

