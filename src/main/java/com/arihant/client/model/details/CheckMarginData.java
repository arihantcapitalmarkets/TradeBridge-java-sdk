package com.arihant.client.model.details;

import java.util.Objects;

public class CheckMarginData {
    private String availableCash;
    private String marginUsed;
    private String availableMargin;
    private String orderMargin;


    public CheckMarginData(String availableCash, String marginUsed, String availableMargin, String orderMargin) {
        this.availableCash = availableCash;
        this.marginUsed = marginUsed;
        this.availableMargin = availableMargin;
        this.orderMargin = orderMargin;
    }

    public CheckMarginData() {
    }

    public String getAvailableCash() {
        return availableCash;
    }

    public void setAvailableCash(String availableCash) {
        this.availableCash = availableCash;
    }

    public String getMarginUsed() {
        return marginUsed;
    }

    public void setMarginUsed(String marginUsed) {
        this.marginUsed = marginUsed;
    }

    public String getAvailableMargin() {
        return availableMargin;
    }

    public void setAvailableMargin(String availableMargin) {
        this.availableMargin = availableMargin;
    }

    public String getOrderMargin() {
        return orderMargin;
    }

    public void setOrderMargin(String orderMargin) {
        this.orderMargin = orderMargin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CheckMarginData that = (CheckMarginData) o;
        return Objects.equals(availableCash, that.availableCash) && Objects.equals(marginUsed, that.marginUsed) && Objects.equals(availableMargin, that.availableMargin) && Objects.equals(orderMargin, that.orderMargin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(availableCash, marginUsed, availableMargin, orderMargin);
    }

    @Override
    public String toString() {
        return "CheckMarginData{" +
                "availableCash='" + availableCash + '\'' +
                ", marginUsed='" + marginUsed + '\'' +
                ", availableMargin='" + availableMargin + '\'' +
                ", orderMargin='" + orderMargin + '\'' +
                '}';
    }
}
