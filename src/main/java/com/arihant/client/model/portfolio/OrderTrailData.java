package com.arihant.client.model.portfolio;

import com.google.gson.annotations.SerializedName;

import java.util.List;


/**
 * OrderTrailData
 */

public class OrderTrailData {
    @SerializedName("trails")
    private List<OrderTrail> trails = null;
    @SerializedName("symbol")
    private SymbolDto symbol = null;
    @SerializedName("orderDetails")
    private OrderDetails orderDetails = null;


    public OrderTrailData(List<OrderTrail> trails, SymbolDto symbol, OrderDetails orderDetails) {
        this.trails = trails;
        this.symbol = symbol;
        this.orderDetails = orderDetails;
    }

    public List<OrderTrail> getTrails() {
        return trails;
    }

    public void setTrails(List<OrderTrail> trails) {
        this.trails = trails;
    }

    public SymbolDto getSymbol() {
        return symbol;
    }

    public void setSymbol(SymbolDto symbol) {
        this.symbol = symbol;
    }

    public OrderDetails getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(OrderDetails orderDetails) {
        this.orderDetails = orderDetails;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OrderTrailData {\n");
        sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
        sb.append("    orderDetails: ").append(toIndentedString(orderDetails)).append("\n");
        sb.append("    trails: ").append(toIndentedString(trails)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
