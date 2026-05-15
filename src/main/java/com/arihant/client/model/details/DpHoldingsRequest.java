package com.arihant.client.model.details;

import java.util.Objects;

public class DpHoldingsRequest {
    private String date = null;
    private String dpName = null;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDpName() {
        return dpName;
    }

    public void setDpName(String dpName) {
        this.dpName = dpName;
    }

    @Override
    public String toString() {
        return "DpHoldingsRequest{" +
                "date='" + date + '\'' +
                ", dpName='" + dpName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        DpHoldingsRequest that = (DpHoldingsRequest) o;
        return Objects.equals(date, that.date) && Objects.equals(dpName, that.dpName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, dpName);
    }
}
