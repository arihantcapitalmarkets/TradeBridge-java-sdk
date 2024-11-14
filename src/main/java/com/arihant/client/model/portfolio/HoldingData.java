package com.arihant.client.model.portfolio;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * HoldingData
 */

public class HoldingData {
    @SerializedName("todaysPnl")
    private BigDecimal todaysPnl = null;

    @SerializedName("invested")
    private BigDecimal invested = null;

    @SerializedName("unRealizedPnl")
    private BigDecimal unRealizedPnl = null;

    @SerializedName("marketValue")
    private BigDecimal marketValue = null;

    @SerializedName("holdings")
    private List<Holding> holdings = null;

    public HoldingData todaysPnl(BigDecimal todaysPnl) {
        this.todaysPnl = todaysPnl;
        return this;
    }

    /**
     * Get todaysPnl
     *
     * @return todaysPnl
     **/
    @Schema(description = "")
    public BigDecimal getTodaysPnl() {
        return todaysPnl;
    }

    public void setTodaysPnl(BigDecimal todaysPnl) {
        this.todaysPnl = todaysPnl;
    }

    public HoldingData invested(BigDecimal invested) {
        this.invested = invested;
        return this;
    }

    /**
     * Get invested
     *
     * @return invested
     **/
    @Schema(description = "")
    public BigDecimal getInvested() {
        return invested;
    }

    public void setInvested(BigDecimal invested) {
        this.invested = invested;
    }

    public HoldingData unRealizedPnl(BigDecimal unRealizedPnl) {
        this.unRealizedPnl = unRealizedPnl;
        return this;
    }

    /**
     * Get unRealizedPnl
     *
     * @return unRealizedPnl
     **/
    @Schema(description = "")
    public BigDecimal getUnRealizedPnl() {
        return unRealizedPnl;
    }

    public void setUnRealizedPnl(BigDecimal unRealizedPnl) {
        this.unRealizedPnl = unRealizedPnl;
    }

    public HoldingData marketValue(BigDecimal marketValue) {
        this.marketValue = marketValue;
        return this;
    }

    /**
     * Get marketValue
     *
     * @return marketValue
     **/
    @Schema(description = "")
    public BigDecimal getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(BigDecimal marketValue) {
        this.marketValue = marketValue;
    }

    public HoldingData holdings(List<Holding> holdings) {
        this.holdings = holdings;
        return this;
    }

    public HoldingData addHoldingsItem(Holding holdingsItem) {
        if (this.holdings == null) {
            this.holdings = new ArrayList<Holding>();
        }
        this.holdings.add(holdingsItem);
        return this;
    }

    /**
     * Get holdings
     *
     * @return holdings
     **/
    @Schema(description = "")
    public List<Holding> getHoldings() {
        return holdings;
    }

    public void setHoldings(List<Holding> holdings) {
        this.holdings = holdings;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HoldingData holdingData = (HoldingData) o;
        return Objects.equals(this.todaysPnl, holdingData.todaysPnl) &&
                Objects.equals(this.invested, holdingData.invested) &&
                Objects.equals(this.unRealizedPnl, holdingData.unRealizedPnl) &&
                Objects.equals(this.marketValue, holdingData.marketValue) &&
                Objects.equals(this.holdings, holdingData.holdings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(todaysPnl, invested, unRealizedPnl, marketValue, holdings);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HoldingData {\n");

        sb.append("todaysPnl: ").append(toIndentedString(todaysPnl)).append("\n");
        sb.append("invested: ").append(toIndentedString(invested)).append("\n");
        sb.append("unRealizedPnl: ").append(toIndentedString(unRealizedPnl)).append("\n");
        sb.append("marketValue: ").append(toIndentedString(marketValue)).append("\n");
        sb.append("holdings: ").append(toIndentedString(holdings)).append("\n");
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
