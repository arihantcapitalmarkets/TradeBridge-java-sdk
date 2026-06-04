package com.arihant.client.model.details;

import java.util.List;
import java.util.Objects;

public class TradeReportData {
    private List<TradeReport> reportList = null;

    public List<TradeReport> getReportList() {
        return reportList;
    }

    public void setReportList(List<TradeReport> reportList) {
        this.reportList = reportList;
    }

    @Override
    public String toString() {
        return "TradeReportData{" +
                "reportList=" + reportList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        TradeReportData that = (TradeReportData) o;
        return Objects.equals(reportList, that.reportList);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(reportList);
    }
}
