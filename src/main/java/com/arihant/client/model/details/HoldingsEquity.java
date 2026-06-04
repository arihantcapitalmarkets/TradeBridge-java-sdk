package com.arihant.client.model.details;

import com.arihant.client.model.portfolio.SymbolDto;

import java.util.Objects;

public class HoldingsEquity {
    private String scripName = null;
    private String rate = null;
    private SymbolDto sym = null;
    private String freeQty = null;
    private String pledgeQty = null;
    private String totQty = null;
    private String mrktVal = null;

    public String getScripName() {
        return scripName;
    }

    public void setScripName(String scripName) {
        this.scripName = scripName;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public SymbolDto getSym() {
        return sym;
    }

    public void setSym(SymbolDto sym) {
        this.sym = sym;
    }

    public String getFreeQty() {
        return freeQty;
    }

    public void setFreeQty(String freeQty) {
        this.freeQty = freeQty;
    }

    public String getPledgeQty() {
        return pledgeQty;
    }

    public void setPledgeQty(String pledgeQty) {
        this.pledgeQty = pledgeQty;
    }

    public String getTotQty() {
        return totQty;
    }

    public void setTotQty(String totQty) {
        this.totQty = totQty;
    }

    public String getMrktVal() {
        return mrktVal;
    }

    public void setMrktVal(String mrktVal) {
        this.mrktVal = mrktVal;
    }

    @Override
    public String toString() {
        return "HoldingsEquity{" +
                "scripName='" + scripName + '\'' +
                ", rate='" + rate + '\'' +
                ", sym=" + sym +
                ", freeQty='" + freeQty + '\'' +
                ", pledgeQty='" + pledgeQty + '\'' +
                ", totQty='" + totQty + '\'' +
                ", mrktVal='" + mrktVal + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        HoldingsEquity that = (HoldingsEquity) o;
        return Objects.equals(scripName, that.scripName) && Objects.equals(rate, that.rate) && Objects.equals(sym, that.sym) && Objects.equals(freeQty, that.freeQty) && Objects.equals(pledgeQty, that.pledgeQty) && Objects.equals(totQty, that.totQty) && Objects.equals(mrktVal, that.mrktVal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scripName, rate, sym, freeQty, pledgeQty, totQty, mrktVal);
    }
}
