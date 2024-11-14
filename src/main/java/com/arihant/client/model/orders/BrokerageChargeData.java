package com.arihant.client.model.orders;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * BrokerageChargeData
 */

public class BrokerageChargeData {
    @SerializedName("brokerage")
    private BrokerageCharge brokerage = null;

    public BrokerageChargeData brokerage(BrokerageCharge brokerage) {
        this.brokerage = brokerage;
        return this;
    }

    /**
     * Get brokerage
     *
     * @return brokerage
     **/
    @Schema(description = "")
    public BrokerageCharge getBrokerage() {
        return brokerage;
    }

    public void setBrokerage(BrokerageCharge brokerage) {
        this.brokerage = brokerage;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BrokerageChargeData brokerageChargeData = (BrokerageChargeData) o;
        return Objects.equals(this.brokerage, brokerageChargeData.brokerage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brokerage);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BrokerageChargeData {\n");

        sb.append("brokerage: ").append(toIndentedString(brokerage)).append("\n");
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
