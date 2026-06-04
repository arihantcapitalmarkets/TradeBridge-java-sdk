package com.arihant.client.model.details;

import java.util.List;
import java.util.Objects;

public class TradeHistoryMultiFilter {
    private String key = null;
    private List<String> value = null;

    public TradeHistoryMultiFilter(String key, List<String> value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public List<String> getValue() {
        return value;
    }

    public void setValue(List<String> value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "TradeHistoryMultiFilter{" +
                "key='" + key + '\'' +
                ", value=" + value +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        TradeHistoryMultiFilter that = (TradeHistoryMultiFilter) o;
        return Objects.equals(key, that.key) && Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }
}
