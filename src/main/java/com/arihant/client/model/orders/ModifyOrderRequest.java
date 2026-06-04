package com.arihant.client.model.orders;

import com.arihant.client.enums.*;
import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * ModifyOrderRequest
 */
public class ModifyOrderRequest {
    @SerializedName("triggerPrice")
    private Double triggerPrice = null;

    @SerializedName("ordType")
    private OrdTypeEnum ordType = null;

    @SerializedName("prdType")
    private PrdTypeEnum prdType = null;

    @SerializedName("instrument")
    private InstrumentEnum instrument = null;

    @SerializedName("exc")
    private ExcEnum exc = null;

    @SerializedName("qty")
    private Integer qty = null;

    @SerializedName("lotSize")
    private Integer lotSize = null;

    @SerializedName("symbol")
    private String symbol = null;

    @SerializedName("ordId")
    private String ordId = null;

    @SerializedName("ordAction")
    private OrdActionEnum ordAction = null;

    @SerializedName("limitPrice")
    private Double limitPrice = null;

    @SerializedName("disQty")
    private Integer disQty = null;

    @SerializedName("ordValidity")
    private OrdValidityEnum ordValidity = null;

    @SerializedName("tradedQty")
    private Integer tradedQty = null;

    @SerializedName("ordValidityDays")
    private Integer ordValidityDays = null;

    @SerializedName("exchangeToken")
    private String exchangeToken = null;

    @SerializedName("amo")
    private Boolean amo = null;

    @SerializedName("remarks")
    private String remarks = null;

    public ModifyOrderRequest remarks(String remarks) {
        this.remarks = remarks;
        return this;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public ModifyOrderRequest triggerPrice(Double triggerPrice) {
        this.triggerPrice = triggerPrice;
        return this;
    }

    /**
     * Get triggerPrice
     *
     * @return triggerPrice
     **/
    @Schema(required = true, description = "")
    public Double getTriggerPrice() {
        return triggerPrice;
    }

    public void setTriggerPrice(Double triggerPrice) {
        this.triggerPrice = triggerPrice;
    }

    public ModifyOrderRequest ordType(OrdTypeEnum ordType) {
        this.ordType = ordType;
        return this;
    }

    /**
     * Get ordType
     *
     * @return ordType
     **/
    @Schema(required = true, description = "")
    public OrdTypeEnum getOrdType() {
        return ordType;
    }

    public void setOrdType(OrdTypeEnum ordType) {
        this.ordType = ordType;
    }

    public ModifyOrderRequest prdType(PrdTypeEnum prdType) {
        this.prdType = prdType;
        return this;
    }

    /**
     * Get prdType
     *
     * @return prdType
     **/
    @Schema(required = true, description = "")
    public PrdTypeEnum getPrdType() {
        return prdType;
    }

    public void setPrdType(PrdTypeEnum prdType) {
        this.prdType = prdType;
    }

    public ModifyOrderRequest instrument(InstrumentEnum instrument) {
        this.instrument = instrument;
        return this;
    }

    /**
     * Get instrument
     *
     * @return instrument
     **/
    @Schema(required = true, description = "")
    public InstrumentEnum getInstrument() {
        return instrument;
    }

    public void setInstrument(InstrumentEnum instrument) {
        this.instrument = instrument;
    }

    public ModifyOrderRequest exc(ExcEnum exc) {
        this.exc = exc;
        return this;
    }

    /**
     * Get exc
     *
     * @return exc
     **/
    @Schema(required = true, description = "")
    public ExcEnum getExc() {
        return exc;
    }

    public void setExc(ExcEnum exc) {
        this.exc = exc;
    }

    public ModifyOrderRequest qty(Integer qty) {
        this.qty = qty;
        return this;
    }

    /**
     * Get qty
     *
     * @return qty
     **/
    @Schema(required = true, description = "")
    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public ModifyOrderRequest lotSize(Integer lotSize) {
        this.lotSize = lotSize;
        return this;
    }

    /**
     * Get lotSize
     *
     * @return lotSize
     **/
    @Schema(required = true, description = "")
    public Integer getLotSize() {
        return lotSize;
    }

    public void setLotSize(Integer lotSize) {
        this.lotSize = lotSize;
    }

    public ModifyOrderRequest symbol(String symbol) {
        this.symbol = symbol;
        return this;
    }

    /**
     * Get symbol
     *
     * @return symbol
     **/
    @Schema(required = true, description = "")
    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public ModifyOrderRequest ordId(String ordId) {
        this.ordId = ordId;
        return this;
    }

    /**
     * Get ordId
     *
     * @return ordId
     **/
    @Schema(required = true, description = "")
    public String getOrdId() {
        return ordId;
    }

    public void setOrdId(String ordId) {
        this.ordId = ordId;
    }

    public ModifyOrderRequest ordAction(OrdActionEnum ordAction) {
        this.ordAction = ordAction;
        return this;
    }

    /**
     * Get ordAction
     *
     * @return ordAction
     **/
    @Schema(required = true, description = "")
    public OrdActionEnum getOrdAction() {
        return ordAction;
    }

    public void setOrdAction(OrdActionEnum ordAction) {
        this.ordAction = ordAction;
    }

    public ModifyOrderRequest limitPrice(Double limitPrice) {
        this.limitPrice = limitPrice;
        return this;
    }

    /**
     * Get limitPrice
     *
     * @return limitPrice
     **/
    @Schema(required = true, description = "")
    public Double getLimitPrice() {
        return limitPrice;
    }

    public void setLimitPrice(Double limitPrice) {
        this.limitPrice = limitPrice;
    }

    public ModifyOrderRequest disQty(Integer disQty) {
        this.disQty = disQty;
        return this;
    }

    /**
     * Get disQty
     *
     * @return disQty
     **/
    @Schema(required = true, description = "")
    public Integer getDisQty() {
        return disQty;
    }

    public void setDisQty(Integer disQty) {
        this.disQty = disQty;
    }

    public ModifyOrderRequest ordValidity(OrdValidityEnum ordValidity) {
        this.ordValidity = ordValidity;
        return this;
    }

    /**
     * Get ordValidity
     *
     * @return ordValidity
     **/
    @Schema(required = true, description = "")
    public OrdValidityEnum getOrdValidity() {
        return ordValidity;
    }

    public void setOrdValidity(OrdValidityEnum ordValidity) {
        this.ordValidity = ordValidity;
    }

    public ModifyOrderRequest tradedQty(Integer tradedQty) {
        this.tradedQty = tradedQty;
        return this;
    }

    /**
     * Get tradedQty
     *
     * @return tradedQty
     **/
    @Schema(required = true, description = "")
    public Integer getTradedQty() {
        return tradedQty;
    }

    public void setTradedQty(Integer tradedQty) {
        this.tradedQty = tradedQty;
    }

    public ModifyOrderRequest ordValidityDays(Integer ordValidityDays) {
        this.ordValidityDays = ordValidityDays;
        return this;
    }

    /**
     * Get ordValidityDays
     *
     * @return ordValidityDays
     **/
    @Schema(required = true, description = "")
    public Integer getOrdValidityDays() {
        return ordValidityDays;
    }

    public void setOrdValidityDays(Integer ordValidityDays) {
        this.ordValidityDays = ordValidityDays;
    }

    public ModifyOrderRequest exchangeToken(String exchangeToken) {
        this.exchangeToken = exchangeToken;
        return this;
    }

    /**
     * Get exchangeToken
     *
     * @return exchangeToken
     **/
    @Schema(description = "")
    public String getExchangeToken() {
        return exchangeToken;
    }

    public void setExchangeToken(String exchangeToken) {
        this.exchangeToken = exchangeToken;
    }

    public ModifyOrderRequest amo(Boolean amo) {
        this.amo = amo;
        return this;
    }

    /**
     * Get amo
     *
     * @return amo
     **/
    @Schema(description = "")
    public Boolean isAmo() {
        return amo;
    }

    public void setAmo(Boolean amo) {
        this.amo = amo;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ModifyOrderRequest modifyOrderRequest = (ModifyOrderRequest) o;
        return Objects.equals(this.triggerPrice, modifyOrderRequest.triggerPrice) &&
                Objects.equals(this.ordType, modifyOrderRequest.ordType) &&
                Objects.equals(this.prdType, modifyOrderRequest.prdType) &&
                Objects.equals(this.instrument, modifyOrderRequest.instrument) &&
                Objects.equals(this.exc, modifyOrderRequest.exc) &&
                Objects.equals(this.qty, modifyOrderRequest.qty) &&
                Objects.equals(this.lotSize, modifyOrderRequest.lotSize) &&
                Objects.equals(this.symbol, modifyOrderRequest.symbol) &&
                Objects.equals(this.ordId, modifyOrderRequest.ordId) &&
                Objects.equals(this.ordAction, modifyOrderRequest.ordAction) &&
                Objects.equals(this.limitPrice, modifyOrderRequest.limitPrice) &&
                Objects.equals(this.disQty, modifyOrderRequest.disQty) &&
                Objects.equals(this.ordValidity, modifyOrderRequest.ordValidity) &&
                Objects.equals(this.tradedQty, modifyOrderRequest.tradedQty) &&
                Objects.equals(this.ordValidityDays, modifyOrderRequest.ordValidityDays) &&
                Objects.equals(this.exchangeToken, modifyOrderRequest.exchangeToken) &&
                Objects.equals(this.amo, modifyOrderRequest.amo) &&
                Objects.equals(this.remarks, modifyOrderRequest.remarks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(triggerPrice, ordType, prdType, instrument, exc, qty, lotSize, symbol, ordId, ordAction, limitPrice, disQty, ordValidity, tradedQty, ordValidityDays, exchangeToken, amo, remarks);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyOrderRequest {\n");

        sb.append("triggerPrice: ").append(toIndentedString(triggerPrice)).append("\n");
        sb.append("ordType: ").append(toIndentedString(ordType)).append("\n");
        sb.append("prdType: ").append(toIndentedString(prdType)).append("\n");
        sb.append("instrument: ").append(toIndentedString(instrument)).append("\n");
        sb.append("exc: ").append(toIndentedString(exc)).append("\n");
        sb.append("qty: ").append(toIndentedString(qty)).append("\n");
        sb.append("lotSize: ").append(toIndentedString(lotSize)).append("\n");
        sb.append("symbol: ").append(toIndentedString(symbol)).append("\n");
        sb.append("ordId: ").append(toIndentedString(ordId)).append("\n");
        sb.append("ordAction: ").append(toIndentedString(ordAction)).append("\n");
        sb.append("limitPrice: ").append(toIndentedString(limitPrice)).append("\n");
        sb.append("disQty: ").append(toIndentedString(disQty)).append("\n");
        sb.append("ordValidity: ").append(toIndentedString(ordValidity)).append("\n");
        sb.append("tradedQty: ").append(toIndentedString(tradedQty)).append("\n");
        sb.append("ordValidityDays: ").append(toIndentedString(ordValidityDays)).append("\n");
        sb.append("exchangeToken: ").append(toIndentedString(exchangeToken)).append("\n");
        sb.append("amo: ").append(toIndentedString(amo)).append("\n");
        sb.append("remarks: ").append(toIndentedString(remarks)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return null;
        }
        return o.toString().replace("\n", "\n    ");
    }

}
