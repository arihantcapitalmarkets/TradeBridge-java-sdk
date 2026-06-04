package com.arihant.client.model.details;

import java.util.List;
import java.util.Objects;

public class TradeHistoryRequest {
    private String frmDte = null;
    private String toDte = null;
    private List<TradeHistoryMultiFilter> multiFilters = null;

    public String getFrmDte() {
        return frmDte;
    }

    public void setFrmDte(String frmDte) {
        this.frmDte = frmDte;
    }

    public String getToDte() {
        return toDte;
    }

    public void setToDte(String toDte) {
        this.toDte = toDte;
    }

    public List<TradeHistoryMultiFilter> getMultiFilters() {
        return multiFilters;
    }

    public void setMultiFilters(List<TradeHistoryMultiFilter> multiFilters) {
        this.multiFilters = multiFilters;
    }

    @Override
    public String toString() {
        return "TradeHistoryRequest{" +
                "frmDte='" + frmDte + '\'' +
                ", toDte='" + toDte + '\'' +
                ", multiFilters=" + multiFilters +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        TradeHistoryRequest that = (TradeHistoryRequest) o;
        return Objects.equals(frmDte, that.frmDte) && Objects.equals(toDte, that.toDte) && Objects.equals(multiFilters, that.multiFilters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(frmDte, toDte, multiFilters);
    }
}
