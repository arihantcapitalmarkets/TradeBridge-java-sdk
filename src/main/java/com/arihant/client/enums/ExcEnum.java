package com.arihant.client.enums;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

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
    CDS("CDS");

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
