package com.arihant.client.model.details;

import java.util.Objects;

public class TaxFoSummary {
    private String realisedPnl = null;
    private String optTurnOver = null;
    private String charges = null;
    private String futProfit = null;
    private String optProfit = null;
    private String futTurnOver = null;
    private String grossProfit = null;

    public String getRealisedPnl() {
        return realisedPnl;
    }

    public void setRealisedPnl(String realisedPnl) {
        this.realisedPnl = realisedPnl;
    }

    public String getOptTurnOver() {
        return optTurnOver;
    }

    public void setOptTurnOver(String optTurnOver) {
        this.optTurnOver = optTurnOver;
    }

    public String getCharges() {
        return charges;
    }

    public void setCharges(String charges) {
        this.charges = charges;
    }

    public String getFutProfit() {
        return futProfit;
    }

    public void setFutProfit(String futProfit) {
        this.futProfit = futProfit;
    }

    public String getOptProfit() {
        return optProfit;
    }

    public void setOptProfit(String optProfit) {
        this.optProfit = optProfit;
    }

    public String getFutTurnOver() {
        return futTurnOver;
    }

    public void setFutTurnOver(String futTurnOver) {
        this.futTurnOver = futTurnOver;
    }

    public String getGrossProfit() {
        return grossProfit;
    }

    public void setGrossProfit(String grossProfit) {
        this.grossProfit = grossProfit;
    }

    @Override
    public String toString() {
        return "TaxFoSummary{" +
                "realisedPnl='" + realisedPnl + '\'' +
                ", optTurnOver='" + optTurnOver + '\'' +
                ", charges='" + charges + '\'' +
                ", futProfit='" + futProfit + '\'' +
                ", optProfit='" + optProfit + '\'' +
                ", futTurnOver='" + futTurnOver + '\'' +
                ", grossProfit='" + grossProfit + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        TaxFoSummary that = (TaxFoSummary) o;
        return Objects.equals(realisedPnl, that.realisedPnl) && Objects.equals(optTurnOver, that.optTurnOver) && Objects.equals(charges, that.charges) && Objects.equals(futProfit, that.futProfit) && Objects.equals(optProfit, that.optProfit) && Objects.equals(futTurnOver, that.futTurnOver) && Objects.equals(grossProfit, that.grossProfit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(realisedPnl, optTurnOver, charges, futProfit, optProfit, futTurnOver, grossProfit);
    }
}
