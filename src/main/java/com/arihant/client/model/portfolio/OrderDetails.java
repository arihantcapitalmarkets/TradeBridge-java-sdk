package com.arihant.client.model.portfolio;

import java.util.Objects;

public class OrderDetails {
    private int tradedQty = 0;
    private TradeBook.OrdValidityEnum ordValidity = null;
    private TradeBook.OrdActionEnum ordAction = null;
    private Double triggerPrice = 0.0;
    private TradeBook.PrdTypeEnum prdType = null;
    private int qty = 0;
    private int pendingQty = 0;
    private int disQty = 0;
    private Double avgPrice = 0.0;
    private String ordId = null;
    private TradeBook.OrdTypeEnum ordType = null;
    private String currentOrdStatus = null;
    private String rejReason = null;

    public OrderDetails(int tradedQty, TradeBook.OrdValidityEnum ordValidity, TradeBook.OrdActionEnum ordAction, Double triggerPrice, TradeBook.PrdTypeEnum prdType, int qty, int pendingQty, int disQty, Double avgPrice, String ordId, TradeBook.OrdTypeEnum ordType, String currentOrdStatus, String rejReason) {
        this.tradedQty = tradedQty;
        this.ordValidity = ordValidity;
        this.ordAction = ordAction;
        this.triggerPrice = triggerPrice;
        this.prdType = prdType;
        this.qty = qty;
        this.pendingQty = pendingQty;
        this.disQty = disQty;
        this.avgPrice = avgPrice;
        this.ordId = ordId;
        this.ordType = ordType;
        this.currentOrdStatus = currentOrdStatus;
        this.rejReason = rejReason;
    }

    public int getTradedQty() {
        return tradedQty;
    }

    public void setTradedQty(int tradedQty) {
        this.tradedQty = tradedQty;
    }

    public TradeBook.OrdValidityEnum getOrdValidity() {
        return ordValidity;
    }

    public void setOrdValidity(TradeBook.OrdValidityEnum ordValidity) {
        this.ordValidity = ordValidity;
    }

    public TradeBook.OrdActionEnum getOrdAction() {
        return ordAction;
    }

    public void setOrdAction(TradeBook.OrdActionEnum ordAction) {
        this.ordAction = ordAction;
    }

    public Double getTriggerPrice() {
        return triggerPrice;
    }

    public void setTriggerPrice(Double triggerPrice) {
        this.triggerPrice = triggerPrice;
    }

    public TradeBook.PrdTypeEnum getPrdType() {
        return prdType;
    }

    public void setPrdType(TradeBook.PrdTypeEnum prdType) {
        this.prdType = prdType;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getPendingQty() {
        return pendingQty;
    }

    public void setPendingQty(int pendingQty) {
        this.pendingQty = pendingQty;
    }

    public int getDisQty() {
        return disQty;
    }

    public void setDisQty(int disQty) {
        this.disQty = disQty;
    }

    public Double getAvgPrice() {
        return avgPrice;
    }

    public void setAvgPrice(Double avgPrice) {
        this.avgPrice = avgPrice;
    }

    public String getOrdId() {
        return ordId;
    }

    public void setOrdId(String ordId) {
        this.ordId = ordId;
    }

    public TradeBook.OrdTypeEnum getOrdType() {
        return ordType;
    }

    public void setOrdType(TradeBook.OrdTypeEnum ordType) {
        this.ordType = ordType;
    }

    public String getCurrentOrdStatus() {
        return currentOrdStatus;
    }

    public void setCurrentOrdStatus(String currentOrdStatus) {
        this.currentOrdStatus = currentOrdStatus;
    }

    public String getRejReason() {
        return rejReason;
    }

    public void setRejReason(String rejReason) {
        this.rejReason = rejReason;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OrderDetails {\n");
        sb.append("    tradedQty: ").append(toIndentedString(tradedQty)).append("\n");
        sb.append("    ordValidity: ").append(toIndentedString(ordValidity)).append("\n");
        sb.append("    ordAction: ").append(toIndentedString(ordAction)).append("\n");
        sb.append("    triggerPrice: ").append(toIndentedString(triggerPrice)).append("\n");
        sb.append("    prdType: ").append(toIndentedString(prdType)).append("\n");
        sb.append("    qty: ").append(toIndentedString(qty)).append("\n");
        sb.append("    pendingQty: ").append(toIndentedString(pendingQty)).append("\n");
        sb.append("    disQty: ").append(toIndentedString(disQty)).append("\n");
        sb.append("    avgPrice: ").append(toIndentedString(avgPrice)).append("\n");
        sb.append("    ordId: ").append(toIndentedString(ordId)).append("\n");
        sb.append("    ordType: ").append(toIndentedString(ordType)).append("\n");
        sb.append("    currentOrdStatus: ").append(toIndentedString(currentOrdStatus)).append("\n");
        sb.append("    rejReason: ").append(toIndentedString(rejReason)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderDetails that = (OrderDetails) o;
        return tradedQty == that.tradedQty && qty == that.qty && pendingQty == that.pendingQty && disQty == that.disQty && ordValidity == that.ordValidity && ordAction == that.ordAction && Objects.equals(triggerPrice, that.triggerPrice) && prdType == that.prdType && Objects.equals(avgPrice, that.avgPrice) && Objects.equals(ordId, that.ordId) && ordType == that.ordType && Objects.equals(currentOrdStatus, that.currentOrdStatus) && Objects.equals(rejReason, that.rejReason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tradedQty, ordValidity, ordAction, triggerPrice, prdType, qty, pendingQty, disQty, avgPrice, ordId, ordType, currentOrdStatus, rejReason);
    }
}
