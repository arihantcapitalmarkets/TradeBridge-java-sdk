package com.arihant.client.enums;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

@JsonAdapter(OrdActionEnum.Adapter.class)
public enum OrdActionEnum {
    @SerializedName("BUY")
    BUY("BUY"),
    @SerializedName("SELL")
    SELL("SELL");

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
