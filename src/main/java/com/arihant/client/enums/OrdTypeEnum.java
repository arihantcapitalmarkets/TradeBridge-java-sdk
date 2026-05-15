package com.arihant.client.enums;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

@JsonAdapter(OrdTypeEnum.Adapter.class)
public enum OrdTypeEnum {
    @SerializedName("Market")
    MARKET("Market"),
    @SerializedName("Limit")
    LIMIT("Limit"),
    @SerializedName("SL-M")
    SL_M("SL-M"),
    @SerializedName("SL")
    SL("SL");

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
