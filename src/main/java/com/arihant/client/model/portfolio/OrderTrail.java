package com.arihant.client.model.portfolio;

import com.arihant.client.enums.ExcEnum;
import com.arihant.client.enums.OrdStatusEnum;
import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * OrderTrail
 */

public class OrderTrail {
    @SerializedName("limitPrice")
    private Double limitPrice = null;

    @SerializedName("lupdateDateTime")
    private String lupdateDateTime = null;

    @SerializedName("modifiedBy")
    private String modifiedBy = null;

    @SerializedName("status")
    private OrdStatusEnum status = null;

    @SerializedName("rejReason")
    private String rejReason = null;

    @SerializedName("avgPrice")
    private Double avgPrice = null;

    @SerializedName("qty")
    private Integer qty = null;

    @SerializedName("pendingQty")
    private Integer pendingQty = null;

    @SerializedName("disQty")
    private Integer disQty = null;

    @SerializedName("exc")
    private ExcEnum exc = null;

    @SerializedName("tradedQty")
    private Integer tradedQty = null;

    @SerializedName("orderUpdatedAt")
    private String orderUpdatedAt =  null;

    public OrderTrail orderUpdatedAt(String orderUpdatedAt) {
        this.orderUpdatedAt = orderUpdatedAt;
        return this;
    }

    @Schema(description = "")
    public String getOrderUpdatedAt() {
        return orderUpdatedAt;
    }

    public void setOrderUpdatedAt(String orderUpdatedAt) {
        this.orderUpdatedAt = orderUpdatedAt;
    }

    public OrderTrail limitPrice(Double limitPrice) {
        this.limitPrice = limitPrice;
        return this;
    }

    /**
     * Get limitPrice
     *
     * @return limitPrice
     **/
    @Schema(description = "")
    public Double getLimitPrice() {
        return limitPrice;
    }

    public void setLimitPrice(Double limitPrice) {
        this.limitPrice = limitPrice;
    }

    public OrderTrail lupdateDateTime(String lupdateDateTime) {
        this.lupdateDateTime = lupdateDateTime;
        return this;
    }

    /**
     * Get lupdateDateTime
     *
     * @return lupdateDateTime
     **/
    @Schema(description = "")
    public String getLupdateDateTime() {
        return lupdateDateTime;
    }

    public void setLupdateDateTime(String lupdateDateTime) {
        this.lupdateDateTime = lupdateDateTime;
    }

    public OrderTrail modifiedBy(String modifiedBy) {
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

    public OrderTrail status(OrdStatusEnum status) {
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

    public OrderTrail rejReason(String rejReason) {
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

    public OrderTrail avgPrice(Double avgPrice) {
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

    public OrderTrail qty(Integer qty) {
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

    public OrderTrail pendingQty(Integer pendingQty) {
        this.pendingQty = pendingQty;
        return this;
    }

    /**
     * Get pendingQty
     *
     * @return pendingQty
     **/
    @Schema(description = "")
    public Integer getPendingQty() {
        return pendingQty;
    }

    public void setPendingQty(Integer pendingQty) {
        this.pendingQty = pendingQty;
    }

    public OrderTrail disQty(Integer disQty) {
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

    public OrderTrail exc(ExcEnum exc) {
        this.exc = exc;
        return this;
    }

    /**
     * Get exc
     *
     * @return exc
     **/
    @Schema(description = "")
    public ExcEnum getExc() {
        return exc;
    }

    public void setExc(ExcEnum exc) {
        this.exc = exc;
    }

    public OrderTrail tradedQty(Integer tradedQty) {
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


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrderTrail orderTrail = (OrderTrail) o;
        return Objects.equals(this.limitPrice, orderTrail.limitPrice) &&
                Objects.equals(this.lupdateDateTime, orderTrail.lupdateDateTime) &&
                Objects.equals(this.modifiedBy, orderTrail.modifiedBy) &&
                Objects.equals(this.status, orderTrail.status) &&
                Objects.equals(this.rejReason, orderTrail.rejReason) &&
                Objects.equals(this.avgPrice, orderTrail.avgPrice) &&
                Objects.equals(this.qty, orderTrail.qty) &&
                Objects.equals(this.pendingQty, orderTrail.pendingQty) &&
                Objects.equals(this.disQty, orderTrail.disQty) &&
                Objects.equals(this.exc, orderTrail.exc) &&
                Objects.equals(this.tradedQty, orderTrail.tradedQty) &&
                Objects.equals(this.orderUpdatedAt, orderTrail.orderUpdatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limitPrice, lupdateDateTime, modifiedBy, status, rejReason, avgPrice, qty, pendingQty, disQty, exc, tradedQty, orderUpdatedAt);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderTrail {\n");

        sb.append("limitPrice: ").append(toIndentedString(limitPrice)).append("\n");
        sb.append("lupdateDateTime: ").append(toIndentedString(lupdateDateTime)).append("\n");
        sb.append("modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
        sb.append("status: ").append(toIndentedString(status)).append("\n");
        sb.append("rejReason: ").append(toIndentedString(rejReason)).append("\n");
        sb.append("avgPrice: ").append(toIndentedString(avgPrice)).append("\n");
        sb.append("qty: ").append(toIndentedString(qty)).append("\n");
        sb.append("pendingQty: ").append(toIndentedString(pendingQty)).append("\n");
        sb.append("disQty: ").append(toIndentedString(disQty)).append("\n");
        sb.append("exc: ").append(toIndentedString(exc)).append("\n");
        sb.append("tradedQty: ").append(toIndentedString(tradedQty)).append("\n");
        sb.append("orderUpdatedAt: ").append(toIndentedString(orderUpdatedAt)).append("\n");
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
