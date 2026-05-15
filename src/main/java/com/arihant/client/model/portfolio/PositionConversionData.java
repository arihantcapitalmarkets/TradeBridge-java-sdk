package com.arihant.client.model.portfolio;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * PositionConversionData
 */

public class PositionConversionData {
    @SerializedName("message")
    private String message = null;

    public PositionConversionData message(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get message
     *
     * @return message
     **/
    @Schema(description = "")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PositionConversionData positionConversionData = (PositionConversionData) o;
        return Objects.equals(this.message, positionConversionData.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PositionConversionData {\n");

        sb.append("message: ").append(toIndentedString(message)).append("\n");
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
