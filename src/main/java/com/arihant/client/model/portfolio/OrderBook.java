package com.arihant.client.model.portfolio;

import com.arihant.client.enums.*;
import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * OrderBook
 */
public class OrderBook {
    @SerializedName("symbol")
    private SymbolDto symbol = null;

    @SerializedName("ordId")
    private String ordId = null;

    @SerializedName("exchOrdId")
    private String exchOrdId = null;

    @SerializedName("parOrdId")
    private String parOrdId = null;

    @SerializedName("status")
    private OrdStatusEnum status = null;

    @SerializedName("ordAction")
    private OrdActionEnum ordAction = null;

    @SerializedName("ordType")
    private OrdTypeEnum ordType = null;

    @SerializedName("prdType")
    private PrdTypeEnum prdType = null;

    @SerializedName("ordValidity")
    private OrdValidityEnum ordValidity = null;

    @SerializedName("modifiedBy")
    private String modifiedBy = null;

    @SerializedName("price")
    private Double price = null;

    @SerializedName("triggerPrice")
    private Double triggerPrice = null;

    @SerializedName("avgPrice")
    private Double avgPrice = null;

    @SerializedName("remarks")
    private String remarks = null;

    @SerializedName("rejReason")
    private String rejReason = null;

    @SerializedName("ordDate")
    private String ordDate = null;

    @SerializedName("excOrdTime")
    private String excOrdTime = null;

    @SerializedName("boOrdStatus")
    private String boOrdStatus = null;

    @SerializedName("exitable")
    private String exitable = null;

    @SerializedName("qty")
    private Integer qty = null;

    @SerializedName("disQty")
    private Integer disQty = null;

    @SerializedName("tradedQty")
    private Integer tradedQty = null;

    @SerializedName("remainQty")
    private Integer remainQty = null;

    @SerializedName("cancelledQty")
    private Integer cancelledQty = null;

    @SerializedName("mktPro")
    private String mktPro = null;

    @SerializedName("undAsset")
    private String undAsset = null;

    @SerializedName("amo")
    private Boolean amo = null;

    @SerializedName("modifiable")
    private Boolean modifiable = null;

    @SerializedName("cancellable")
    private Boolean cancellable = null;

    @SerializedName("excAlgoId")
    private String excAlgoId = null;

    public String getExcAlgoId() {
        return excAlgoId;
    }

    public void setExcAlgoId(String excAlgoId) {
        this.excAlgoId = excAlgoId;
    }

    public OrderBook symbol(SymbolDto symbol) {
        this.symbol = symbol;
        return this;
    }

    /**
     * Get symbol
     *
     * @return symbol
     **/
    @Schema(description = "")
    public SymbolDto getSymbol() {
        return symbol;
    }

    public void setSymbol(SymbolDto symbol) {
        this.symbol = symbol;
    }

    public OrderBook ordId(String ordId) {
        this.ordId = ordId;
        return this;
    }

    /**
     * Get ordId
     *
     * @return ordId
     **/
    @Schema(description = "")
    public String getOrdId() {
        return ordId;
    }

    public void setOrdId(String ordId) {
        this.ordId = ordId;
    }

    public OrderBook exchOrdId(String exchOrdId) {
        this.exchOrdId = exchOrdId;
        return this;
    }

    /**
     * Get exchOrdId
     *
     * @return exchOrdId
     **/
    @Schema(description = "")
    public String getExchOrdId() {
        return exchOrdId;
    }

    public void setExchOrdId(String exchOrdId) {
        this.exchOrdId = exchOrdId;
    }

    public OrderBook parOrdId(String parOrdId) {
        this.parOrdId = parOrdId;
        return this;
    }

    /**
     * Get parOrdId
     *
     * @return parOrdId
     **/
    @Schema(description = "")
    public String getParOrdId() {
        return parOrdId;
    }

    public void setParOrdId(String parOrdId) {
        this.parOrdId = parOrdId;
    }

    public OrderBook status(OrdStatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     **/
    @Schema(description = "")
    public OrdStatusEnum getStatus() {
        return status;
    }

    public void setStatus(OrdStatusEnum status) {
        this.status = status;
    }

    public OrderBook ordAction(OrdActionEnum ordAction) {
        this.ordAction = ordAction;
        return this;
    }

    /**
     * Get ordAction
     *
     * @return ordAction
     **/
    @Schema(description = "")
    public OrdActionEnum getOrdAction() {
        return ordAction;
    }

    public void setOrdAction(OrdActionEnum ordAction) {
        this.ordAction = ordAction;
    }

    public OrderBook ordType(OrdTypeEnum ordType) {
        this.ordType = ordType;
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

    public void setOrdType(OrdTypeEnum ordType) {
        this.ordType = ordType;
    }

    public OrderBook prdType(PrdTypeEnum prdType) {
        this.prdType = prdType;
        return this;
    }

    /**
     * Get prdType
     *
     * @return prdType
     **/
    @Schema(description = "")
    public PrdTypeEnum getPrdType() {
        return prdType;
    }

    public void setPrdType(PrdTypeEnum prdType) {
        this.prdType = prdType;
    }

    public OrderBook ordValidity(OrdValidityEnum ordValidity) {
        this.ordValidity = ordValidity;
        return this;
    }

    /**
     * Get ordValidity
     *
     * @return ordValidity
     **/
    @Schema(description = "")
    public OrdValidityEnum getOrdValidity() {
        return ordValidity;
    }

    public void setOrdValidity(OrdValidityEnum ordValidity) {
        this.ordValidity = ordValidity;
    }

    public OrderBook modifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }

    /**
     * Get modifiedBy
     *
     * @return modifiedBy
     **/
    @Schema(description = "")
    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public OrderBook price(Double price) {
        this.price = price;
        return this;
    }

    /**
     * Get price
     *
     * @return price
     **/
    @Schema(description = "")
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public OrderBook triggerPrice(Double triggerPrice) {
        this.triggerPrice = triggerPrice;
        return this;
    }

    /**
     * Get triggerPrice
     *
     * @return triggerPrice
     **/
    @Schema(description = "")
    public Double getTriggerPrice() {
        return triggerPrice;
    }

    public void setTriggerPrice(Double triggerPrice) {
        this.triggerPrice = triggerPrice;
    }

    public OrderBook avgPrice(Double avgPrice) {
        this.avgPrice = avgPrice;
        return this;
    }

    /**
     * Get avgPrice
     *
     * @return avgPrice
     **/
    @Schema(description = "")
    public Double getAvgPrice() {
        return avgPrice;
    }

    public void setAvgPrice(Double avgPrice) {
        this.avgPrice = avgPrice;
    }

    public OrderBook remarks(String remarks) {
        this.remarks = remarks;
        return this;
    }

    /**
     * Get remarks
     *
     * @return remarks
     **/
    @Schema(description = "")
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public OrderBook rejReason(String rejReason) {
        this.rejReason = rejReason;
        return this;
    }

    /**
     * Get rejReason
     *
     * @return rejReason
     **/
    @Schema(description = "")
    public String getRejReason() {
        return rejReason;
    }

    public void setRejReason(String rejReason) {
        this.rejReason = rejReason;
    }

    public OrderBook ordDate(String ordDate) {
        this.ordDate = ordDate;
        return this;
    }

    /**
     * Get ordDate
     *
     * @return ordDate
     **/
    @Schema(description = "")
    public String getOrdDate() {
        return ordDate;
    }

    public void setOrdDate(String ordDate) {
        this.ordDate = ordDate;
    }

    public OrderBook excOrdTime(String excOrdTime) {
        this.excOrdTime = excOrdTime;
        return this;
    }

    /**
     * Get excOrdTime
     *
     * @return excOrdTime
     **/
    @Schema(description = "")
    public String getExcOrdTime() {
        return excOrdTime;
    }

    public void setExcOrdTime(String excOrdTime) {
        this.excOrdTime = excOrdTime;
    }

    public OrderBook boOrdStatus(String boOrdStatus) {
        this.boOrdStatus = boOrdStatus;
        return this;
    }

    /**
     * Get boOrdStatus
     *
     * @return boOrdStatus
     **/
    @Schema(description = "")
    public String getBoOrdStatus() {
        return boOrdStatus;
    }

    public void setBoOrdStatus(String boOrdStatus) {
        this.boOrdStatus = boOrdStatus;
    }

    public OrderBook exitable(String exitable) {
        this.exitable = exitable;
        return this;
    }

    /**
     * Get exitable
     *
     * @return exitable
     **/
    @Schema(description = "")
    public String getExitable() {
        return exitable;
    }

    public void setExitable(String exitable) {
        this.exitable = exitable;
    }

    public OrderBook qty(Integer qty) {
        this.qty = qty;
        return this;
    }

    /**
     * Get qty
     *
     * @return qty
     **/
    @Schema(description = "")
    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public OrderBook disQty(Integer disQty) {
        this.disQty = disQty;
        return this;
    }

    /**
     * Get disQty
     *
     * @return disQty
     **/
    @Schema(description = "")
    public Integer getDisQty() {
        return disQty;
    }

    public void setDisQty(Integer disQty) {
        this.disQty = disQty;
    }

    public OrderBook tradedQty(Integer tradedQty) {
        this.tradedQty = tradedQty;
        return this;
    }

    /**
     * Get tradedQty
     *
     * @return tradedQty
     **/
    @Schema(description = "")
    public Integer getTradedQty() {
        return tradedQty;
    }

    public void setTradedQty(Integer tradedQty) {
        this.tradedQty = tradedQty;
    }

    public OrderBook remainQty(Integer remainQty) {
        this.remainQty = remainQty;
        return this;
    }

    /**
     * Get remainQty
     *
     * @return remainQty
     **/
    @Schema(description = "")
    public Integer getRemainQty() {
        return remainQty;
    }

    public void setRemainQty(Integer remainQty) {
        this.remainQty = remainQty;
    }

    public OrderBook cancelledQty(Integer cancelledQty) {
        this.cancelledQty = cancelledQty;
        return this;
    }

    /**
     * Get cancelledQty
     *
     * @return cancelledQty
     **/
    @Schema(description = "")
    public Integer getCancelledQty() {
        return cancelledQty;
    }

    public void setCancelledQty(Integer cancelledQty) {
        this.cancelledQty = cancelledQty;
    }

    public OrderBook mktPro(String mktPro) {
        this.mktPro = mktPro;
        return this;
    }

    /**
     * Get mktPro
     *
     * @return mktPro
     **/
    @Schema(description = "")
    public String getMktPro() {
        return mktPro;
    }

    public void setMktPro(String mktPro) {
        this.mktPro = mktPro;
    }

    public OrderBook undAsset(String undAsset) {
        this.undAsset = undAsset;
        return this;
    }

    /**
     * Get undAsset
     *
     * @return undAsset
     **/
    @Schema(description = "")
    public String getUndAsset() {
        return undAsset;
    }

    public void setUndAsset(String undAsset) {
        this.undAsset = undAsset;
    }

    public OrderBook amo(Boolean amo) {
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

    public OrderBook modifiable(Boolean modifiable) {
        this.modifiable = modifiable;
        return this;
    }

    /**
     * Get modifiable
     *
     * @return modifiable
     **/
    @Schema(description = "")
    public Boolean isModifiable() {
        return modifiable;
    }

    public void setModifiable(Boolean modifiable) {
        this.modifiable = modifiable;
    }

    public OrderBook cancellable(Boolean cancellable) {
        this.cancellable = cancellable;
        return this;
    }

    /**
     * Get cancellable
     *
     * @return cancellable
     **/
    @Schema(description = "")
    public Boolean isCancellable() {
        return cancellable;
    }

    public void setCancellable(Boolean cancellable) {
        this.cancellable = cancellable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrderBook orderBook = (OrderBook) o;
        return Objects.equals(this.symbol, orderBook.symbol) &&
                Objects.equals(this.ordId, orderBook.ordId) &&
                Objects.equals(this.exchOrdId, orderBook.exchOrdId) &&
                Objects.equals(this.parOrdId, orderBook.parOrdId) &&
                Objects.equals(this.status, orderBook.status) &&
                Objects.equals(this.ordAction, orderBook.ordAction) &&
                Objects.equals(this.ordType, orderBook.ordType) &&
                Objects.equals(this.prdType, orderBook.prdType) &&
                Objects.equals(this.ordValidity, orderBook.ordValidity) &&
                Objects.equals(this.modifiedBy, orderBook.modifiedBy) &&
                Objects.equals(this.price, orderBook.price) &&
                Objects.equals(this.triggerPrice, orderBook.triggerPrice) &&
                Objects.equals(this.avgPrice, orderBook.avgPrice) &&
                Objects.equals(this.remarks, orderBook.remarks) &&
                Objects.equals(this.rejReason, orderBook.rejReason) &&
                Objects.equals(this.ordDate, orderBook.ordDate) &&
                Objects.equals(this.excOrdTime, orderBook.excOrdTime) &&
                Objects.equals(this.boOrdStatus, orderBook.boOrdStatus) &&
                Objects.equals(this.exitable, orderBook.exitable) &&
                Objects.equals(this.qty, orderBook.qty) &&
                Objects.equals(this.disQty, orderBook.disQty) &&
                Objects.equals(this.tradedQty, orderBook.tradedQty) &&
                Objects.equals(this.remainQty, orderBook.remainQty) &&
                Objects.equals(this.cancelledQty, orderBook.cancelledQty) &&
                Objects.equals(this.mktPro, orderBook.mktPro) &&
                Objects.equals(this.undAsset, orderBook.undAsset) &&
                Objects.equals(this.amo, orderBook.amo) &&
                Objects.equals(this.modifiable, orderBook.modifiable) &&
                Objects.equals(this.cancellable, orderBook.cancellable) &&
                Objects.equals(this.excAlgoId, orderBook.excAlgoId);

    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol, ordId, exchOrdId, parOrdId, status, ordAction, ordType, prdType, ordValidity, modifiedBy, price, triggerPrice, avgPrice, remarks, rejReason, ordDate, excOrdTime, boOrdStatus, exitable, qty, disQty, tradedQty, remainQty, cancelledQty, mktPro, undAsset, amo, modifiable, cancellable, excAlgoId);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderBook {\n");

        sb.append("symbol: ").append(toIndentedString(symbol)).append("\n");
        sb.append("ordId: ").append(toIndentedString(ordId)).append("\n");
        sb.append("exchOrdId: ").append(toIndentedString(exchOrdId)).append("\n");
        sb.append("parOrdId: ").append(toIndentedString(parOrdId)).append("\n");
        sb.append("status: ").append(toIndentedString(status)).append("\n");
        sb.append("ordAction: ").append(toIndentedString(ordAction)).append("\n");
        sb.append("ordType: ").append(toIndentedString(ordType)).append("\n");
        sb.append("prdType: ").append(toIndentedString(prdType)).append("\n");
        sb.append("ordValidity: ").append(toIndentedString(ordValidity)).append("\n");
        sb.append("modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
        sb.append("price: ").append(toIndentedString(price)).append("\n");
        sb.append("triggerPrice: ").append(toIndentedString(triggerPrice)).append("\n");
        sb.append("avgPrice: ").append(toIndentedString(avgPrice)).append("\n");
        sb.append("remarks: ").append(toIndentedString(remarks)).append("\n");
        sb.append("rejReason: ").append(toIndentedString(rejReason)).append("\n");
        sb.append("ordDate: ").append(toIndentedString(ordDate)).append("\n");
        sb.append("excOrdTime: ").append(toIndentedString(excOrdTime)).append("\n");
        sb.append("boOrdStatus: ").append(toIndentedString(boOrdStatus)).append("\n");
        sb.append("exitable: ").append(toIndentedString(exitable)).append("\n");
        sb.append("qty: ").append(toIndentedString(qty)).append("\n");
        sb.append("disQty: ").append(toIndentedString(disQty)).append("\n");
        sb.append("tradedQty: ").append(toIndentedString(tradedQty)).append("\n");
        sb.append("remainQty: ").append(toIndentedString(remainQty)).append("\n");
        sb.append("cancelledQty: ").append(toIndentedString(cancelledQty)).append("\n");
        sb.append("mktPro: ").append(toIndentedString(mktPro)).append("\n");
        sb.append("undAsset: ").append(toIndentedString(undAsset)).append("\n");
        sb.append("amo: ").append(toIndentedString(amo)).append("\n");
        sb.append("modifiable: ").append(toIndentedString(modifiable)).append("\n");
        sb.append("cancellable: ").append(toIndentedString(cancellable)).append("\n");
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
