package com.arihant.client.model.details;

import java.util.Objects;

public class TaxPnLFo {
    private String scripName = null;
    private String realisedPnl = null;
    private String date = null;
    private String realisedPnlPerc = null;
    private String saleVal = null;
    private String sellAvg = null;
    private String buyAvg = null;
    private String dispQty = null;
    private String qty = null;
    private String futProfit = null;
    private String optProfit = null;
    private String buyVal = null;
    private String mrktVal = null;
    private String closePrice = null;

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

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
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

    public String getClosePrice() {
        return closePrice;
    }

    public void setClosePrice(String closePrice) {
        this.closePrice = closePrice;
    }

    @Override
    public String toString() {
        return "TaxPnLFo{" +
                "scripName='" + scripName + '\'' +
                ", realisedPnl='" + realisedPnl + '\'' +
                ", date='" + date + '\'' +
                ", realisedPnlPerc='" + realisedPnlPerc + '\'' +
                ", saleVal='" + saleVal + '\'' +
                ", sellAvg='" + sellAvg + '\'' +
                ", buyAvg='" + buyAvg + '\'' +
                ", dispQty='" + dispQty + '\'' +
                ", qty='" + qty + '\'' +
                ", futProfit='" + futProfit + '\'' +
                ", optProfit='" + optProfit + '\'' +
                ", buyVal='" + buyVal + '\'' +
                ", mrktVal='" + mrktVal + '\'' +
                ", closePrice='" + closePrice + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        TaxPnLFo taxPnLFo = (TaxPnLFo) o;
        return Objects.equals(scripName, taxPnLFo.scripName) && Objects.equals(realisedPnl, taxPnLFo.realisedPnl) && Objects.equals(date, taxPnLFo.date) && Objects.equals(realisedPnlPerc, taxPnLFo.realisedPnlPerc) && Objects.equals(saleVal, taxPnLFo.saleVal) && Objects.equals(sellAvg, taxPnLFo.sellAvg) && Objects.equals(buyAvg, taxPnLFo.buyAvg) && Objects.equals(dispQty, taxPnLFo.dispQty) && Objects.equals(qty, taxPnLFo.qty) && Objects.equals(futProfit, taxPnLFo.futProfit) && Objects.equals(optProfit, taxPnLFo.optProfit) && Objects.equals(buyVal, taxPnLFo.buyVal) && Objects.equals(mrktVal, taxPnLFo.mrktVal) && Objects.equals(closePrice, taxPnLFo.closePrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scripName, realisedPnl, date, realisedPnlPerc, saleVal, sellAvg, buyAvg, dispQty, qty, futProfit, optProfit, buyVal, mrktVal, closePrice);
    }
}
