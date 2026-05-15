package com.arihant.client.enums;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

@JsonAdapter(OrdValidityEnum.Adapter.class)
public enum OrdValidityEnum {
    @SerializedName("DAY")
    DAY("DAY"),
    @SerializedName("IOC")
    IOC("IOC");

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
