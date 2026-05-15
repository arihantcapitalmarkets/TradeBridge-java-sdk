package com.arihant.client.model.orders;

import com.arihant.client.enums.*;
import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * PlaceOrderRequest
 */
public class PlaceOrderRequest {
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

    @SerializedName("disQty")
    private Integer disQty = null;

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

    @SerializedName("build")
    private String build = null;

    @SerializedName("excToken")
    private String excToken = null;

    @SerializedName("boStpLoss")
    private Double boStpLoss = null;

    @SerializedName("boTgtPrice")
    private Double boTgtPrice = null;

    @SerializedName("trailingSL")
    private Double trailingSL = null;

    @SerializedName("remarks")
    private String remarks = null;

    @SerializedName("excAlgoId")
    private String excAlgoId = null;

    public String getExcAlgoId() {
        return excAlgoId;
    }

    public void setExcAlgoId(String excAlgoId) {
        this.excAlgoId = excAlgoId;
    }

    public PlaceOrderRequest remarks(String remarks) {
        this.remarks = remarks;
        return this;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public PlaceOrderRequest symbol(String symbol) {
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

    public PlaceOrderRequest exc(ExcEnum exc) {
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

    public PlaceOrderRequest ordAction(OrdActionEnum ordAction) {
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

    public PlaceOrderRequest ordValidity(OrdValidityEnum ordValidity) {
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

    public PlaceOrderRequest ordType(OrdTypeEnum ordType) {
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

    public PlaceOrderRequest prdType(PrdTypeEnum prdType) {
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

    public PlaceOrderRequest qty(Integer qty) {
        this.qty = qty;
        return this;
    }

    /**
     * Get qty
     * minimum: 1
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

    public PlaceOrderRequest disQty(Integer disQty) {
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

    public PlaceOrderRequest lotSize(Integer lotSize) {
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

    public PlaceOrderRequest triggerPrice(Double triggerPrice) {
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

    public PlaceOrderRequest instrument(InstrumentEnum instrument) {
        this.instrument = instrument;
        return this;
    }

    /**
     * Get instrument
     *
     * @return instrument
     **/
    @Schema(description = "")
    public InstrumentEnum getInstrument() {
        return instrument;
    }

    public void setInstrument(InstrumentEnum instrument) {
        this.instrument = instrument;
    }

    public PlaceOrderRequest limitPrice(Double limitPrice) {
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

    public PlaceOrderRequest amo(Boolean amo) {
        this.amo = amo;
        return this;
    }

    /**
     * Get amo
     *
     * @return amo
     **/
    @Schema(required = true, description = "")
    public Boolean isAmo() {
        return amo;
    }

    public void setAmo(Boolean amo) {
        this.amo = amo;
    }

    public PlaceOrderRequest build(String build) {
        this.build = build;
        return this;
    }

    /**
     * Get build
     *
     * @return build
     **/
    @Schema(description = "")
    public String getBuild() {
        return build;
    }

    public void setBuild(String build) {
        this.build = build;
    }

    public PlaceOrderRequest excToken(String excToken) {
        this.excToken = excToken;
        return this;
    }

    /**
     * Get excToken
     *
     * @return excToken
     **/
    @Schema(description = "")
    public String getExcToken() {
        return excToken;
    }

    public void setExcToken(String excToken) {
        this.excToken = excToken;
    }

    public PlaceOrderRequest boStpLoss(Double boStpLoss) {
        this.boStpLoss = boStpLoss;
        return this;
    }

    /**
     * Get boStpLoss
     *
     * @return boStpLoss
     **/
    @Schema(description = "")
    public Double getBoStpLoss() {
        return boStpLoss;
    }

    public void setBoStpLoss(Double boStpLoss) {
        this.boStpLoss = boStpLoss;
    }

    public PlaceOrderRequest boTgtPrice(Double boTgtPrice) {
        this.boTgtPrice = boTgtPrice;
        return this;
    }

    /**
     * Get boTgtPrice
     *
     * @return boTgtPrice
     **/
    @Schema(description = "")
    public Double getBoTgtPrice() {
        return boTgtPrice;
    }

    public void setBoTgtPrice(Double boTgtPrice) {
        this.boTgtPrice = boTgtPrice;
    }

    public PlaceOrderRequest trailingSL(Double trailingSL) {
        this.trailingSL = trailingSL;
        return this;
    }

    /**
     * Get trailingSL
     *
     * @return trailingSL
     **/
    @Schema(description = "")
    public Double getTrailingSL() {
        return trailingSL;
    }

    public void setTrailingSL(Double trailingSL) {
        this.trailingSL = trailingSL;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PlaceOrderRequest placeOrderRequest = (PlaceOrderRequest) o;
        return Objects.equals(this.symbol, placeOrderRequest.symbol) &&
                Objects.equals(this.exc, placeOrderRequest.exc) &&
                Objects.equals(this.ordAction, placeOrderRequest.ordAction) &&
                Objects.equals(this.ordValidity, placeOrderRequest.ordValidity) &&
                Objects.equals(this.ordType, placeOrderRequest.ordType) &&
                Objects.equals(this.prdType, placeOrderRequest.prdType) &&
                Objects.equals(this.qty, placeOrderRequest.qty) &&
                Objects.equals(this.disQty, placeOrderRequest.disQty) &&
                Objects.equals(this.lotSize, placeOrderRequest.lotSize) &&
                Objects.equals(this.triggerPrice, placeOrderRequest.triggerPrice) &&
                Objects.equals(this.instrument, placeOrderRequest.instrument) &&
                Objects.equals(this.limitPrice, placeOrderRequest.limitPrice) &&
                Objects.equals(this.amo, placeOrderRequest.amo) &&
                Objects.equals(this.build, placeOrderRequest.build) &&
                Objects.equals(this.excToken, placeOrderRequest.excToken) &&
                Objects.equals(this.boStpLoss, placeOrderRequest.boStpLoss) &&
                Objects.equals(this.boTgtPrice, placeOrderRequest.boTgtPrice) &&
                Objects.equals(this.trailingSL, placeOrderRequest.trailingSL) &&
                Objects.equals(this.remarks, placeOrderRequest.remarks) &&
                Objects.equals(this.excAlgoId, placeOrderRequest.excAlgoId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol, exc, ordAction, ordValidity, ordType, prdType, qty, disQty, lotSize, triggerPrice, instrument, limitPrice, amo, build, excToken, boStpLoss, boTgtPrice, trailingSL, remarks, excAlgoId);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PlaceOrderRequest {\n");

        sb.append("symbol: ").append(toIndentedString(symbol)).append("\n");
        sb.append("exc: ").append(toIndentedString(exc)).append("\n");
        sb.append("ordAction: ").append(toIndentedString(ordAction)).append("\n");
        sb.append("ordValidity: ").append(toIndentedString(ordValidity)).append("\n");
        sb.append("ordType: ").append(toIndentedString(ordType)).append("\n");
        sb.append("prdType: ").append(toIndentedString(prdType)).append("\n");
        sb.append("qty: ").append(toIndentedString(qty)).append("\n");
        sb.append("disQty: ").append(toIndentedString(disQty)).append("\n");
        sb.append("lotSize: ").append(toIndentedString(lotSize)).append("\n");
        sb.append("triggerPrice: ").append(toIndentedString(triggerPrice)).append("\n");
        sb.append("instrument: ").append(toIndentedString(instrument)).append("\n");
        sb.append("limitPrice: ").append(toIndentedString(limitPrice)).append("\n");
        sb.append("amo: ").append(toIndentedString(amo)).append("\n");
        sb.append("build: ").append(toIndentedString(build)).append("\n");
        sb.append("excToken: ").append(toIndentedString(excToken)).append("\n");
        sb.append("boStpLoss: ").append(toIndentedString(boStpLoss)).append("\n");
        sb.append("boTgtPrice: ").append(toIndentedString(boTgtPrice)).append("\n");
        sb.append("trailingSL: ").append(toIndentedString(trailingSL)).append("\n");
        sb.append("remarks: ").append(toIndentedString(remarks)).append("\n");
        sb.append("excAlgoId: ").append(toIndentedString(excAlgoId)).append("\n");
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
