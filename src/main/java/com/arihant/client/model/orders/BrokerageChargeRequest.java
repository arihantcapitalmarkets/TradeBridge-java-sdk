package com.arihant.client.model.orders;

import com.arihant.client.enums.*;
import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * BrokerageChargeRequest
 */
public class BrokerageChargeRequest {
    @SerializedName("symbol")
    private String symbol = null;

    @SerializedName("ordAction")
    private OrdActionEnum ordAction = null;

    @SerializedName("excToken")
    private String excToken = null;

    @SerializedName("exc")
    private ExcEnum exc = null;

    @SerializedName("qty")
    private String qty = null;

    @SerializedName("price")
    private String price = null;

    @SerializedName("prdType")
    private PrdTypeEnum prdType = null;

    @SerializedName("triggerPrice")
    private String triggerPrice = null;

    @SerializedName("instrument")
    private InstrumentEnum instrument = null;

    @SerializedName("ordType")
    private OrdTypeEnum ordType = null;

    public BrokerageChargeRequest symbol(String symbol) {
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

    public BrokerageChargeRequest orderAction(OrdActionEnum orderAction) {
        this.ordAction = orderAction;
        return this;
    }

    /**
     * Get orderAction
     *
     * @return orderAction
     **/
    @Schema(required = true, description = "")
    public OrdActionEnum getOrdAction() {
        return ordAction;
    }

    public void setOrdAction(OrdActionEnum ordAction) {
        this.ordAction = ordAction;
    }

    public BrokerageChargeRequest orderType(OrdTypeEnum orderType) {
        this.ordType = orderType;
        return this;
    }

    /**
     * Get ordType
     *
     * @return ordType
     **/
    @Schema(description = "")
    public OrdTypeEnum getOrdType() {
        return ordType;
    }

    public void setOrdType(OrdTypeEnum orderType) {
        this.ordType = orderType;
    }


    public BrokerageChargeRequest excToken(String excToken) {
        this.excToken = excToken;
        return this;
    }

    /**
     * Get excToken
     *
     * @return excToken
     **/
    @Schema(required = true, description = "")
    public String getExcToken() {
        return excToken;
    }

    public void setExcToken(String excToken) {
        this.excToken = excToken;
    }

    public BrokerageChargeRequest exc(ExcEnum exc) {
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

    public BrokerageChargeRequest qty(String qty) {
        this.qty = qty;
        return this;
    }

    /**
     * Get qty
     *
     * @return qty
     **/
    @Schema(required = true, description = "")
    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public BrokerageChargeRequest price(String price) {
        this.price = price;
        return this;
    }

    /**
     * Get price
     *
     * @return price
     **/
    @Schema(required = true, description = "")
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public BrokerageChargeRequest product(PrdTypeEnum product) {
        this.prdType = product;
        return this;
    }

    /**
     * Get product
     *
     * @return product
     **/
    @Schema(required = true, description = "")
    public PrdTypeEnum getPrdType() {
        return prdType;
    }

    public void setPrdType(PrdTypeEnum prdType) {
        this.prdType = prdType;
    }

    public BrokerageChargeRequest triggerPrice(String triggerPrice) {
        this.triggerPrice = triggerPrice;
        return this;
    }

    /**
     * Get triggerPrice
     *
     * @return triggerPrice
     **/
    @Schema(required = true, description = "")
    public String getTriggerPrice() {
        return triggerPrice;
    }

    public void setTriggerPrice(String triggerPrice) {
        this.triggerPrice = triggerPrice;
    }

    public BrokerageChargeRequest instrument(InstrumentEnum instrument) {
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


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BrokerageChargeRequest brokerageChargeRequest = (BrokerageChargeRequest) o;
        return Objects.equals(this.symbol, brokerageChargeRequest.symbol) &&
                Objects.equals(this.ordAction, brokerageChargeRequest.ordAction) &&
                Objects.equals(this.excToken, brokerageChargeRequest.excToken) &&
                Objects.equals(this.exc, brokerageChargeRequest.exc) &&
                Objects.equals(this.qty, brokerageChargeRequest.qty) &&
                Objects.equals(this.price, brokerageChargeRequest.price) &&
                Objects.equals(this.prdType, brokerageChargeRequest.prdType) &&
                Objects.equals(this.ordType, brokerageChargeRequest.ordType) &&
                Objects.equals(this.triggerPrice, brokerageChargeRequest.triggerPrice) &&
                Objects.equals(this.instrument, brokerageChargeRequest.instrument);
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol, ordAction, excToken, exc, qty, ordType, price, prdType, triggerPrice, instrument);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BrokerageChargeRequest {\n");

        sb.append("symbol: ").append(toIndentedString(symbol)).append("\n");
        sb.append("ordAction: ").append(toIndentedString(ordAction)).append("\n");
        sb.append("excToken: ").append(toIndentedString(excToken)).append("\n");
        sb.append("exc: ").append(toIndentedString(exc)).append("\n");
        sb.append("qty: ").append(toIndentedString(qty)).append("\n");
        sb.append("price: ").append(toIndentedString(price)).append("\n");
        sb.append("prdType: ").append(toIndentedString(prdType)).append("\n");
        sb.append("ordType: ").append(toIndentedString(ordType)).append("\n");
        sb.append("triggerPrice: ").append(toIndentedString(triggerPrice)).append("\n");
        sb.append("instrument: ").append(toIndentedString(instrument)).append("\n");
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
