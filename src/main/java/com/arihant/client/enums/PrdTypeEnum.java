package com.arihant.client.enums;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

@JsonAdapter(PrdTypeEnum.Adapter.class)
public enum PrdTypeEnum {
    @SerializedName("CASH")
    CASH("CASH"),
    @SerializedName("MTF")
    MTF("MTF"),
    @SerializedName("INTRADAY")
    INTRADAY("INTRADAY"),
    @SerializedName("COVER_ORDER")
    COVER_ORDER("COVER_ORDER"),
    @SerializedName("BRACKET_ORDER")
    BRACKET_ORDER("BRACKET_ORDER"),
    @SerializedName("NRML")
    NRML("NRML"),
    @SerializedName("DELIVERY")
    DELIVERY("DELIVERY"),
    @SerializedName("CARRYFORWARD")
    CARRYFORWARD("CARRYFORWARD");

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
