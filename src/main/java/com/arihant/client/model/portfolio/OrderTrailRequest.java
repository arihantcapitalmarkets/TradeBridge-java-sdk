package com.arihant.client.model.portfolio;

import com.arihant.client.enums.InstrumentEnum;
import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * OrderTrailRequest
 */

public class OrderTrailRequest {
    @SerializedName("ordId")
    private String ordId = null;

    @SerializedName("instrument")
    private InstrumentEnum instrument = null;

    public OrderTrailRequest ordId(String ordId) {
        this.ordId = ordId;
        return this;
    }

    /**
     * Get ordId
     *
     * @return ordId
     **/
    @Schema(required = true, description = "")
    public String getOrdId() {
        return ordId;
    }

    public void setOrdId(String ordId) {
        this.ordId = ordId;
    }

    public OrderTrailRequest instrument(InstrumentEnum instrument) {
        this.instrument = instrument;
        return this;
    }

    /**
     * Get instrument
     *
     * @return instrument
     **/
    @Schema(description = "")
    public InstrumentEnum getInstrument() {
        return instrument;
    }

    public void setInstrument(InstrumentEnum instrument) {
        this.instrument = instrument;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrderTrailRequest orderTrailRequest = (OrderTrailRequest) o;
        return Objects.equals(this.ordId, orderTrailRequest.ordId) &&
                Objects.equals(this.instrument, orderTrailRequest.instrument);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ordId, instrument);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderTrailRequest {\n");

        sb.append("ordId: ").append(toIndentedString(ordId)).append("\n");
        sb.append("instrument: ").append(toIndentedString(instrument)).append("\n");
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
