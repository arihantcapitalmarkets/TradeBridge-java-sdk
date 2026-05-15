package com.arihant.client.model.details;

import com.arihant.client.model.portfolio.SymbolDto;

import java.util.Objects;

public class PnlCash {
    private String sellVal = null;
    private SymbolDto sym = null;
    private String otherCharges = null;
    private String buyDate = null;
    private String sellAvg = null;
    private String sellQty = null;
    private String buyAvg = null;
    private String buyQty = null;
    private String qty = null;
    private String buyVal = null;
    private String sellDate = null;

    public PnlCash(String sellVal, SymbolDto sym, String otherCharges, String buyDate, String sellAvg, String sellQty, String buyAvg, String buyQty, String qty, String buyVal, String sellDate) {
        this.sellVal = sellVal;
        this.sym = sym;
        this.otherCharges = otherCharges;
        this.buyDate = buyDate;
        this.sellAvg = sellAvg;
        this.sellQty = sellQty;
        this.buyAvg = buyAvg;
        this.buyQty = buyQty;
        this.qty = qty;
        this.buyVal = buyVal;
        this.sellDate = sellDate;
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

    public String getOtherCharges() {
        return otherCharges;
    }

    public void setOtherCharges(String otherCharges) {
        this.otherCharges = otherCharges;
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

    public String getSellDate() {
        return sellDate;
    }

    public void setSellDate(String sellDate) {
        this.sellDate = sellDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PnlCash pnlCash = (PnlCash) o;
        return Objects.equals(sellVal, pnlCash.sellVal) && Objects.equals(sym, pnlCash.sym) && Objects.equals(otherCharges, pnlCash.otherCharges) && Objects.equals(buyDate, pnlCash.buyDate) && Objects.equals(sellAvg, pnlCash.sellAvg) && Objects.equals(sellQty, pnlCash.sellQty) && Objects.equals(buyAvg, pnlCash.buyAvg) && Objects.equals(buyQty, pnlCash.buyQty) && Objects.equals(qty, pnlCash.qty) && Objects.equals(buyVal, pnlCash.buyVal) && Objects.equals(sellDate, pnlCash.sellDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sellVal, sym, otherCharges, buyDate, sellAvg, sellQty, buyAvg, buyQty, qty, buyVal, sellDate);
    }

    @Override
    public String toString() {
        return "PnlCash{" +
                "sellVal='" + sellVal + '\'' +
                ", sym=" + sym +
                ", otherCharges='" + otherCharges + '\'' +
                ", buyDate='" + buyDate + '\'' +
                ", sellAvg='" + sellAvg + '\'' +
                ", sellQty='" + sellQty + '\'' +
                ", buyAvg='" + buyAvg + '\'' +
                ", buyQty='" + buyQty + '\'' +
                ", qty='" + qty + '\'' +
                ", buyVal='" + buyVal + '\'' +
                ", sellDate='" + sellDate + '\'' +
                '}';
    }
}
