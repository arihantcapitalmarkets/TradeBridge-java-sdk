package com.arihant.client.model.details;

import com.arihant.client.enums.*;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class CheckMarginRequest {
    @SerializedName("symbol")
    private String symbol = null;

    @SerializedName("exc")
    private ExcEnum exc = null;

    @SerializedName("ordAction")
    private OrdActionEnum ordAction = null;

    @SerializedName("ordValidity")
    private OrdValidityEnum ordValidity = null;

    @SerializedName("ordType")
    private OrdTypeEnum ordType = null;

    @SerializedName("prdType")
    private PrdTypeEnum prdType = null;

    @SerializedName("qty")
    private Integer qty = null;

    @SerializedName("lotSize")
    private Integer lotSize = null;

    @SerializedName("triggerPrice")
    private Double triggerPrice = null;

    @SerializedName("instrument")
    private InstrumentEnum instrument = null;

    @SerializedName("limitPrice")
    private Double limitPrice = null;

    @SerializedName("amo")
    private Boolean amo = null;

    @SerializedName("excToken")
    private String excToken = null;

    @SerializedName("boStpLoss")
    private Double boStpLoss = null;

    @SerializedName("boTgtPrice")
    private Double boTgtPrice = null;

    public CheckMarginRequest() {
    }

    public CheckMarginRequest(String symbol, ExcEnum exc, OrdActionEnum ordAction, OrdValidityEnum ordValidity, OrdTypeEnum ordType, PrdTypeEnum prdType, Integer qty, Integer lotSize, Double triggerPrice, InstrumentEnum instrument, Double limitPrice, Boolean amo, String excToken, Double boStpLoss, Double boTgtPrice) {
        this.symbol = symbol;
        this.exc = exc;
        this.ordAction = ordAction;
        this.ordValidity = ordValidity;
        this.ordType = ordType;
        this.prdType = prdType;
        this.qty = qty;
        this.lotSize = lotSize;
        this.triggerPrice = triggerPrice;
        this.instrument = instrument;
        this.limitPrice = limitPrice;
        this.amo = amo;
        this.excToken = excToken;
        this.boStpLoss = boStpLoss;
        this.boTgtPrice = boTgtPrice;
    }

    public OrdTypeEnum getOrdType() {
        return ordType;
    }

    public void setOrdType(OrdTypeEnum ordType) {
        this.ordType = ordType;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public ExcEnum getExc() {
        return exc;
    }

    public void setExc(ExcEnum exc) {
        this.exc = exc;
    }

    public OrdActionEnum getOrdAction() {
        return ordAction;
    }

    public void setOrdAction(OrdActionEnum ordAction) {
        this.ordAction = ordAction;
    }

    public OrdValidityEnum getOrdValidity() {
        return ordValidity;
    }

    public void setOrdValidity(OrdValidityEnum ordValidity) {
        this.ordValidity = ordValidity;
    }

    public PrdTypeEnum getPrdType() {
        return prdType;
    }

    public void setPrdType(PrdTypeEnum prdType) {
        this.prdType = prdType;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public Integer getLotSize() {
        return lotSize;
    }

    public void setLotSize(Integer lotSize) {
        this.lotSize = lotSize;
    }

    public Double getTriggerPrice() {
        return triggerPrice;
    }

    public void setTriggerPrice(Double triggerPrice) {
        this.triggerPrice = triggerPrice;
    }

    public InstrumentEnum getInstrument() {
        return instrument;
    }

    public void setInstrument(InstrumentEnum instrument) {
        this.instrument = instrument;
    }

    public Double getLimitPrice() {
        return limitPrice;
    }

    public void setLimitPrice(Double limitPrice) {
        this.limitPrice = limitPrice;
    }

    public Boolean getAmo() {
        return amo;
    }

    public void setAmo(Boolean amo) {
        this.amo = amo;
    }

    public String getExcToken() {
        return excToken;
    }

    public void setExcToken(String excToken) {
        this.excToken = excToken;
    }

    public Double getBoStpLoss() {
        return boStpLoss;
    }

    public void setBoStpLoss(Double boStpLoss) {
        this.boStpLoss = boStpLoss;
    }

    public Double getBoTgtPrice() {
        return boTgtPrice;
    }

    public void setBoTgtPrice(Double boTgtPrice) {
        this.boTgtPrice = boTgtPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CheckMarginRequest that = (CheckMarginRequest) o;
        return Objects.equals(symbol, that.symbol) && exc == that.exc && ordAction == that.ordAction && ordValidity == that.ordValidity && ordType == that.ordType && prdType == that.prdType && Objects.equals(qty, that.qty) && Objects.equals(lotSize, that.lotSize) && Objects.equals(triggerPrice, that.triggerPrice) && instrument == that.instrument && Objects.equals(limitPrice, that.limitPrice) && Objects.equals(amo, that.amo) && Objects.equals(excToken, that.excToken) && Objects.equals(boStpLoss, that.boStpLoss) && Objects.equals(boTgtPrice, that.boTgtPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol, exc, ordAction, ordValidity, ordType, prdType, qty, lotSize, triggerPrice, instrument, limitPrice, amo, excToken, boStpLoss, boTgtPrice);
    }

    @Override
    public String toString() {
        return "CheckMarginRequest{" +
                "symbol='" + symbol + '\'' +
                ", exc=" + exc +
                ", ordAction=" + ordAction +
                ", ordValidity=" + ordValidity +
                ", ordType=" + ordType +
                ", prdType=" + prdType +
                ", qty=" + qty +
                ", lotSize=" + lotSize +
                ", triggerPrice=" + triggerPrice +
                ", instrument=" + instrument +
                ", limitPrice=" + limitPrice +
                ", amo=" + amo +
                ", excToken='" + excToken + '\'' +
                ", boStpLoss=" + boStpLoss +
                ", boTgtPrice=" + boTgtPrice +
                '}';
    }
}
