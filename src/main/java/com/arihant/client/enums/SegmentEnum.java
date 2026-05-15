package com.arihant.client.enums;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

@JsonAdapter(SegmentEnum.Adapter.class)
public enum SegmentEnum {
    @SerializedName("equity")
    EQUITY("equity"),
    @SerializedName("derivative")
    DERIVATIVE("derivative"),
    @SerializedName("index")
    INDEX("index"),
    @SerializedName("currency")
    CURRENCY("currency");

    private String value;

    SegmentEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SegmentEnum fromValue(String input) {
        for (SegmentEnum b : SegmentEnum.values()) {
            if (b.value.equals(input)) {
                return b;
            }
        }
        return null;
    }

    public static class Adapter extends TypeAdapter<SegmentEnum> {
        @Override
        public void write(final JsonWriter jsonWriter, final SegmentEnum enumeration) throws IOException {
            jsonWriter.value(String.valueOf(enumeration.getValue()));
        }

        @Override
        public SegmentEnum read(final JsonReader jsonReader) throws IOException {
            Object value = jsonReader.nextString();
            return SegmentEnum.fromValue((String) (value));
        }
    }
}
