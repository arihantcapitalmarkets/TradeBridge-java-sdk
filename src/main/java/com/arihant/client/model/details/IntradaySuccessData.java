package com.arihant.client.model.details;

import java.util.List;
import java.util.Objects;

/**
 * IntradaySuccessData
 */

public class IntradaySuccessData {
    private List<List<Object>> dataPoints = null;

    public IntradaySuccessData(List<List<Object>> dataPoints) {
        this.dataPoints = dataPoints;
    }

    public List<List<Object>> getDataPoints() {
        return dataPoints;
    }

    public void setDataPoints(List<List<Object>> dataPoints) {
        this.dataPoints = dataPoints;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IntradaySuccessData that = (IntradaySuccessData) o;
        return Objects.equals(dataPoints, that.dataPoints);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dataPoints);
    }

    @Override
    public String toString() {
        return "IntradaySuccessData{" +
                "dataPoints=" + dataPoints +
                '}';
    }
}
