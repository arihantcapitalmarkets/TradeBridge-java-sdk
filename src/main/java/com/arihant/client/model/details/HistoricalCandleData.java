package com.arihant.client.model.details;

import java.util.List;
import java.util.Objects;

public class HistoricalCandleData {
    private List<List<String>> dataPoints = null;

    public HistoricalCandleData(List<List<String>> dataPoints) {
        this.dataPoints = dataPoints;
    }

    public List<List<String>> getDataPoints() {
        return dataPoints;
    }

    public void setDataPoints(List<List<String>> dataPoints) {
        this.dataPoints = dataPoints;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HistoricalCandleData that = (HistoricalCandleData) o;
        return Objects.equals(dataPoints, that.dataPoints);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dataPoints);
    }

    @Override
    public String toString() {
        return "HistoricalCandleData{" +
                "dataPoints=" + dataPoints +
                '}';
    }
}
