package com.arihant.client.model.details;

import java.util.Objects;

public class TaxEquitySummary {
    private String realisedPnl = null;
    private String charges = null;
    private String shortTermPrc = null;
    private String specTermPrc = null;
    private String longTermPrc = null;
    private String turnOver = null;

    public String getRealisedPnl() {
        return realisedPnl;
    }

    public void setRealisedPnl(String realisedPnl) {
        this.realisedPnl = realisedPnl;
    }

    public String getCharges() {
        return charges;
    }

    public void setCharges(String charges) {
        this.charges = charges;
    }

    public String getShortTermPrc() {
        return shortTermPrc;
    }

    public void setShortTermPrc(String shortTermPrc) {
        this.shortTermPrc = shortTermPrc;
    }

    public String getSpecTermPrc() {
        return specTermPrc;
    }

    public void setSpecTermPrc(String specTermPrc) {
        this.specTermPrc = specTermPrc;
    }

    public String getLongTermPrc() {
        return longTermPrc;
    }

    public void setLongTermPrc(String longTermPrc) {
        this.longTermPrc = longTermPrc;
    }

    public String getTurnOver() {
        return turnOver;
    }

    public void setTurnOver(String turnOver) {
        this.turnOver = turnOver;
    }

    @Override
    public String toString() {
        return "TaxEquitySummary{" +
                "realisedPnl='" + realisedPnl + '\'' +
                ", charges='" + charges + '\'' +
                ", shortTermPrc='" + shortTermPrc + '\'' +
                ", specTermPrc='" + specTermPrc + '\'' +
                ", longTermPrc='" + longTermPrc + '\'' +
                ", turnOver='" + turnOver + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        TaxEquitySummary that = (TaxEquitySummary) o;
        return Objects.equals(realisedPnl, that.realisedPnl) && Objects.equals(charges, that.charges) && Objects.equals(shortTermPrc, that.shortTermPrc) && Objects.equals(specTermPrc, that.specTermPrc) && Objects.equals(longTermPrc, that.longTermPrc) && Objects.equals(turnOver, that.turnOver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(realisedPnl, charges, shortTermPrc, specTermPrc, longTermPrc, turnOver);
    }
}
