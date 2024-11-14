package com.arihant.client.model.portfolio;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * TradeBookData
 */

public class TradeBookData {
    @SerializedName("trades")
    private List<TradeBook> trades = null;

    public TradeBookData trades(List<TradeBook> trades) {
        this.trades = trades;
        return this;
    }

    public TradeBookData addTradesItem(TradeBook tradesItem) {
        if (this.trades == null) {
            this.trades = new ArrayList<TradeBook>();
        }
        this.trades.add(tradesItem);
        return this;
    }

    /**
     * Get trades
     *
     * @return trades
     **/
    @Schema(description = "")
    public List<TradeBook> getTrades() {
        return trades;
    }

    public void setTrades(List<TradeBook> trades) {
        this.trades = trades;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TradeBookData tradeBookData = (TradeBookData) o;
        return Objects.equals(this.trades, tradeBookData.trades);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trades);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TradeBookData {\n");

        sb.append("trades: ").append(toIndentedString(trades)).append("\n");
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
