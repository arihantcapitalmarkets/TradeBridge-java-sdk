package com.arihant.client.model.details;

import com.arihant.client.model.portfolio.SymbolDto;

import java.util.Objects;

public class TaxPnLCash {
    private String realisedPnl = null;
    private String realisedPnlPerc = null;
    private String sellVal = null;
    private SymbolDto sym = null;
    private String buyDate = null;
    private String sellAvg = null;
    private String sellQty = null;
    private String fmv = null;
    private String noOfDays = null;
    private String buyAvg = null;
    private String buyQty = null;
    private String specPrlo = null;
    private String qty = null;
    private String buyVal = null;
    private String longPrlo = null;
    private String sellDate = null;
    private String shortPrlo = null;
    private String ltcg = null;

    public String getRealisedPnl() {
        return realisedPnl;
    }

    public void setRealisedPnl(String realisedPnl) {
        this.realisedPnl = realisedPnl;
    }

    public String getRealisedPnlPerc() {
        return realisedPnlPerc;
    }

    public void setRealisedPnlPerc(String realisedPnlPerc) {
        this.realisedPnlPerc = realisedPnlPerc;
    }

    public String getSellVal() {
        return sellVal;
    }

    public void setSellVal(String sellVal) {
        this.sellVal = sellVal;
    }

    public SymbolDto getSym() {
        return sym;
    }

    public void setSym(SymbolDto sym) {
        this.sym = sym;
    }

    public String getBuyDate() {
        return buyDate;
    }

    public void setBuyDate(String buyDate) {
        this.buyDate = buyDate;
    }

    public String getSellAvg() {
        return sellAvg;
    }

    public void setSellAvg(String sellAvg) {
        this.sellAvg = sellAvg;
    }

    public String getSellQty() {
        return sellQty;
    }

    public void setSellQty(String sellQty) {
        this.sellQty = sellQty;
    }

    public String getFmv() {
        return fmv;
    }

    public void setFmv(String fmv) {
        this.fmv = fmv;
    }

    public String getNoOfDays() {
        return noOfDays;
    }

    public void setNoOfDays(String noOfDays) {
        this.noOfDays = noOfDays;
    }

    public String getBuyAvg() {
        return buyAvg;
    }

    public void setBuyAvg(String buyAvg) {
        this.buyAvg = buyAvg;
    }

    public String getBuyQty() {
        return buyQty;
    }

    public void setBuyQty(String buyQty) {
        this.buyQty = buyQty;
    }

    public String getSpecPrlo() {
        return specPrlo;
    }

    public void setSpecPrlo(String specPrlo) {
        this.specPrlo = specPrlo;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public String getBuyVal() {
        return buyVal;
    }

    public void setBuyVal(String buyVal) {
        this.buyVal = buyVal;
    }

    public String getLongPrlo() {
        return longPrlo;
    }

    public void setLongPrlo(String longPrlo) {
        this.longPrlo = longPrlo;
    }

    public String getSellDate() {
        return sellDate;
    }

    public void setSellDate(String sellDate) {
        this.sellDate = sellDate;
    }

    public String getShortPrlo() {
        return shortPrlo;
    }

    public void setShortPrlo(String shortPrlo) {
        this.shortPrlo = shortPrlo;
    }

    public String getLtcg() {
        return ltcg;
    }

    public void setLtcg(String ltcg) {
        this.ltcg = ltcg;
    }

    @Override
    public String toString() {
        return "TaxPnLCash{" +
                "realisedPnl='" + realisedPnl + '\'' +
                ", realisedPnlPerc='" + realisedPnlPerc + '\'' +
                ", sellVal='" + sellVal + '\'' +
                ", sym=" + sym +
                ", buyDate='" + buyDate + '\'' +
                ", sellAvg='" + sellAvg + '\'' +
                ", sellQty='" + sellQty + '\'' +
                ", fmv='" + fmv + '\'' +
                ", noOfDays='" + noOfDays + '\'' +
                ", buyAvg='" + buyAvg + '\'' +
                ", buyQty='" + buyQty + '\'' +
                ", specPrlo='" + specPrlo + '\'' +
                ", qty='" + qty + '\'' +
                ", buyVal='" + buyVal + '\'' +
                ", longPrlo='" + longPrlo + '\'' +
                ", sellDate='" + sellDate + '\'' +
                ", shortPrlo='" + shortPrlo + '\'' +
                ", ltcg='" + ltcg + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        TaxPnLCash that = (TaxPnLCash) o;
        return Objects.equals(realisedPnl, that.realisedPnl) && Objects.equals(realisedPnlPerc, that.realisedPnlPerc) && Objects.equals(sellVal, that.sellVal) && Objects.equals(sym, that.sym) && Objects.equals(buyDate, that.buyDate) && Objects.equals(sellAvg, that.sellAvg) && Objects.equals(sellQty, that.sellQty) && Objects.equals(fmv, that.fmv) && Objects.equals(noOfDays, that.noOfDays) && Objects.equals(buyAvg, that.buyAvg) && Objects.equals(buyQty, that.buyQty) && Objects.equals(specPrlo, that.specPrlo) && Objects.equals(qty, that.qty) && Objects.equals(buyVal, that.buyVal) && Objects.equals(longPrlo, that.longPrlo) && Objects.equals(sellDate, that.sellDate) && Objects.equals(shortPrlo, that.shortPrlo) && Objects.equals(ltcg, that.ltcg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(realisedPnl, realisedPnlPerc, sellVal, sym, buyDate, sellAvg, sellQty, fmv, noOfDays, buyAvg, buyQty, specPrlo, qty, buyVal, longPrlo, sellDate, shortPrlo, ltcg);
    }
}
