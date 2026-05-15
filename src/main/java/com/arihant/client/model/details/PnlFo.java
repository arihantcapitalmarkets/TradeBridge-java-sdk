package com.arihant.client.model.details;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class PnlFo {
    private String scripName;
    private String realisedPnl;
    private String date;
    private String realisedPnlPerc;
    private String unRealisedPnl;
    private String saleVal;
    private String sellAvg;
    private String buyAvg;
    private String dispQty;
    private String charges;
    private String qty;
    private String buyVal;
    private String mrktVal;
    private String unRealisedPnlPerc;
    private String closePrice;
    @SerializedName("isRealized")
    private boolean isRealized;

    public PnlFo(String scripName, String realisedPnl, String date, String realisedPnlPerc, String unRealisedPnl, String saleVal, String sellAvg, String buyAvg, String dispQty, String charges, String qty, String buyVal, String mrktVal, String unRealisedPnlPerc, String closePrice, boolean isRealized) {
        this.scripName = scripName;
        this.realisedPnl = realisedPnl;
        this.date = date;
        this.realisedPnlPerc = realisedPnlPerc;
        this.unRealisedPnl = unRealisedPnl;
        this.saleVal = saleVal;
        this.sellAvg = sellAvg;
        this.buyAvg = buyAvg;
        this.dispQty = dispQty;
        this.charges = charges;
        this.qty = qty;
        this.buyVal = buyVal;
        this.mrktVal = mrktVal;
        this.unRealisedPnlPerc = unRealisedPnlPerc;
        this.closePrice = closePrice;
        this.isRealized = isRealized;
    }

    public String getScripName() {
        return scripName;
    }

    public void setScripName(String scripName) {
        this.scripName = scripName;
    }

    public String getRealisedPnl() {
        return realisedPnl;
    }

    public void setRealisedPnl(String realisedPnl) {
        this.realisedPnl = realisedPnl;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getRealisedPnlPerc() {
        return realisedPnlPerc;
    }

    public void setRealisedPnlPerc(String realisedPnlPerc) {
        this.realisedPnlPerc = realisedPnlPerc;
    }

    public String getUnRealisedPnl() {
        return unRealisedPnl;
    }

    public void setUnRealisedPnl(String unRealisedPnl) {
        this.unRealisedPnl = unRealisedPnl;
    }

    public String getSaleVal() {
        return saleVal;
    }

    public void setSaleVal(String saleVal) {
        this.saleVal = saleVal;
    }

    public String getSellAvg() {
        return sellAvg;
    }

    public void setSellAvg(String sellAvg) {
        this.sellAvg = sellAvg;
    }

    public String getBuyAvg() {
        return buyAvg;
    }

    public void setBuyAvg(String buyAvg) {
        this.buyAvg = buyAvg;
    }

    public String getDispQty() {
        return dispQty;
    }

    public void setDispQty(String dispQty) {
        this.dispQty = dispQty;
    }

    public String getCharges() {
        return charges;
    }

    public void setCharges(String charges) {
        this.charges = charges;
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

    public String getMrktVal() {
        return mrktVal;
    }

    public void setMrktVal(String mrktVal) {
        this.mrktVal = mrktVal;
    }

    public String getUnRealisedPnlPerc() {
        return unRealisedPnlPerc;
    }

    public void setUnRealisedPnlPerc(String unRealisedPnlPerc) {
        this.unRealisedPnlPerc = unRealisedPnlPerc;
    }

    public String getClosePrice() {
        return closePrice;
    }

    public void setClosePrice(String closePrice) {
        this.closePrice = closePrice;
    }

    public boolean isRealized() {
        return isRealized;
    }

    public void setRealized(boolean realized) {
        this.isRealized = realized;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PnlFo pnlFo = (PnlFo) o;
        return isRealized == pnlFo.isRealized && Objects.equals(scripName, pnlFo.scripName) && Objects.equals(realisedPnl, pnlFo.realisedPnl) && Objects.equals(date, pnlFo.date) && Objects.equals(realisedPnlPerc, pnlFo.realisedPnlPerc) && Objects.equals(unRealisedPnl, pnlFo.unRealisedPnl) && Objects.equals(saleVal, pnlFo.saleVal) && Objects.equals(sellAvg, pnlFo.sellAvg) && Objects.equals(buyAvg, pnlFo.buyAvg) && Objects.equals(dispQty, pnlFo.dispQty) && Objects.equals(charges, pnlFo.charges) && Objects.equals(qty, pnlFo.qty) && Objects.equals(buyVal, pnlFo.buyVal) && Objects.equals(mrktVal, pnlFo.mrktVal) && Objects.equals(unRealisedPnlPerc, pnlFo.unRealisedPnlPerc) && Objects.equals(closePrice, pnlFo.closePrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scripName, realisedPnl, date, realisedPnlPerc, unRealisedPnl, saleVal, sellAvg, buyAvg, dispQty, charges, qty, buyVal, mrktVal, unRealisedPnlPerc, closePrice, isRealized);
    }

    @Override
    public String toString() {
        return "PnlFo{" +
                "scripName='" + scripName + '\'' +
                ", realisedPnl='" + realisedPnl + '\'' +
                ", date='" + date + '\'' +
                ", realisedPnlPerc='" + realisedPnlPerc + '\'' +
                ", unRealisedPnl='" + unRealisedPnl + '\'' +
                ", saleVal='" + saleVal + '\'' +
                ", sellAvg='" + sellAvg + '\'' +
                ", buyAvg='" + buyAvg + '\'' +
                ", dispQty='" + dispQty + '\'' +
                ", charges='" + charges + '\'' +
                ", qty='" + qty + '\'' +
                ", buyVal='" + buyVal + '\'' +
                ", mrktVal='" + mrktVal + '\'' +
                ", unRealisedPnlPerc='" + unRealisedPnlPerc + '\'' +
                ", closePrice='" + closePrice + '\'' +
                ", isRealized=" + isRealized +
                '}';
    }
}
