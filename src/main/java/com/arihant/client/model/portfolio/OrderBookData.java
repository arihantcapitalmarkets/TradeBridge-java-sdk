package com.arihant.client.model.portfolio;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * OrderBookData
 */

public class OrderBookData {
    @SerializedName("orders")
    private List<OrderBook> orders = null;

    public OrderBookData orders(List<OrderBook> orders) {
        this.orders = orders;
        return this;
    }

    public OrderBookData addOrdersItem(OrderBook ordersItem) {
        if (this.orders == null) {
            this.orders = new ArrayList<OrderBook>();
        }
        this.orders.add(ordersItem);
        return this;
    }

    /**
     * Get orders
     *
     * @return orders
     **/
    @Schema(description = "")
    public List<OrderBook> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderBook> orders) {
        this.orders = orders;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrderBookData orderBookData = (OrderBookData) o;
        return Objects.equals(this.orders, orderBookData.orders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orders);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderBookData {\n");

        sb.append("orders: ").append(toIndentedString(orders)).append("\n");
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
