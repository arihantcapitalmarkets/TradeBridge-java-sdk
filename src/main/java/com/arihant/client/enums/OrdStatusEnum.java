package com.arihant.client.enums;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

@JsonAdapter(OrdStatusEnum.Adapter.class)
public enum OrdStatusEnum {
    @SerializedName("Executed")
    EXECUTED("Executed"),
    @SerializedName("Pending")
    PENDING("Pending"),
    @SerializedName("Cancelled")
    CANCELLED("Cancelled"),
    @SerializedName("Rejected")
    REJECTED("Rejected");

    private String value;

    OrdStatusEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static OrdStatusEnum fromValue(String input) {
        for (OrdStatusEnum b : OrdStatusEnum.values()) {
            if (b.value.equals(input)) {
                return b;
            }
        }
        return null;
    }

    public static class Adapter extends TypeAdapter<OrdStatusEnum> {
        @Override
        public void write(final JsonWriter jsonWriter, final OrdStatusEnum enumeration) throws IOException {
            jsonWriter.value(String.valueOf(enumeration.getValue()));
        }

        @Override
        public OrdStatusEnum read(final JsonReader jsonReader) throws IOException {
            Object value = jsonReader.nextString();
            return OrdStatusEnum.fromValue((String) (value));
        }
    }
}