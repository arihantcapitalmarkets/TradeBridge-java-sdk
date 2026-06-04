package com.arihant.client.model.details;

import com.arihant.client.enums.OrdActionEnum;
import com.arihant.client.model.portfolio.SymbolDto;

import java.util.Objects;

public class TradeReport {
    private String date = null;
    private String tradeTime = null;
    private String netAmt = null;
    private OrdActionEnum ordAction = null;
    private String netQty = null;
    private String orderNo = null;
    private SymbolDto sym = null;
    private String avgPrice = null;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(String tradeTime) {
        this.tradeTime = tradeTime;
    }

    public String getNetAmt() {
        return netAmt;
    }

    public void setNetAmt(String netAmt) {
        this.netAmt = netAmt;
    }

    public OrdActionEnum getOrdAction() {
        return ordAction;
    }

    public void setOrdAction(OrdActionEnum ordAction) {
        this.ordAction = ordAction;
    }

    public String getNetQty() {
        return netQty;
    }

    public void setNetQty(String netQty) {
        this.netQty = netQty;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public SymbolDto getSym() {
        return sym;
    }

    public void setSym(SymbolDto sym) {
        this.sym = sym;
    }

    public String getAvgPrice() {
        return avgPrice;
    }

    public void setAvgPrice(String avgPrice) {
        this.avgPrice = avgPrice;
    }

    @Override
    public String toString() {
        return "TradeReport{" +
                "date='" + date + '\'' +
                ", tradeTime='" + tradeTime + '\'' +
                ", netAmt='" + netAmt + '\'' +
                ", ordAction=" + ordAction +
                ", netQty='" + netQty + '\'' +
                ", orderNo='" + orderNo + '\'' +
                ", sym=" + sym +
                ", avgPrice='" + avgPrice + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        TradeReport that = (TradeReport) o;
        return Objects.equals(date, that.date) && Objects.equals(tradeTime, that.tradeTime) && Objects.equals(netAmt, that.netAmt) && ordAction == that.ordAction && Objects.equals(netQty, that.netQty) && Objects.equals(orderNo, that.orderNo) && Objects.equals(sym, that.sym) && Objects.equals(avgPrice, that.avgPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, tradeTime, netAmt, ordAction, netQty, orderNo, sym, avgPrice);
    }
}
