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
 * ModifyOrderData
 */

public class ModifyOrderData {
    @SerializedName("ordId")
    private String ordId = null;

    /**
     * Gets or Sets ordStatus
     */
    @JsonAdapter(OrdStatusEnum.Adapter.class)
    public enum OrdStatusEnum {
        @SerializedName("Executed")
        EXECUTED("Executed"),
        @SerializedName("Pending")
        PENDING("Pending"),
        @SerializedName("Cancelled")
        CANCELLED("Cancelled"),
        @SerializedName("Transit")
        TRANSIT("Transit"),
        @SerializedName("Rejected")
        REJECTED("Rejected"),
        @SerializedName("Requested")
        REQUESTED("Requested"),
        @SerializedName("None")
        NONE("None");

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

    @SerializedName("ordStatus")
    private OrdStatusEnum ordStatus = null;

    @SerializedName("rejReason")
    private String rejReason = null;

    public ModifyOrderData ordId(String ordId) {
        this.ordId = ordId;
        return this;
    }

    /**
     * Get ordId
     *
     * @return ordId
     **/
    @Schema(description = "")
    public String getOrdId() {
        return ordId;
    }

    public void setOrdId(String ordId) {
        this.ordId = ordId;
    }

    public ModifyOrderData ordStatus(OrdStatusEnum ordStatus) {
        this.ordStatus = ordStatus;
        return this;
    }

    /**
     * Get ordStatus
     *
     * @return ordStatus
     **/
    @Schema(description = "")
    public OrdStatusEnum getOrdStatus() {
        return ordStatus;
    }

    public void setOrdStatus(OrdStatusEnum ordStatus) {
        this.ordStatus = ordStatus;
    }

    public ModifyOrderData rejReason(String rejReason) {
        this.rejReason = rejReason;
        return this;
    }

    /**
     * Get rejReason
     *
     * @return rejReason
     **/
    @Schema(description = "")
    public String getRejReason() {
        return rejReason;
    }

    public void setRejReason(String rejReason) {
        this.rejReason = rejReason;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ModifyOrderData modifyOrderData = (ModifyOrderData) o;
        return Objects.equals(this.ordId, modifyOrderData.ordId) &&
                Objects.equals(this.ordStatus, modifyOrderData.ordStatus) &&
                Objects.equals(this.rejReason, modifyOrderData.rejReason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ordId, ordStatus, rejReason);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyOrderData {\n");

        sb.append("ordId: ").append(toIndentedString(ordId)).append("\n");
        sb.append("ordStatus: ").append(toIndentedString(ordStatus)).append("\n");
        sb.append("rejReason: ").append(toIndentedString(rejReason)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
