package com.arihant.client.model.details;

import java.util.List;
import java.util.Objects;

public class ProfitLossFoReportRequest {
    private List<ReportFilters> filters = null;

    public ProfitLossFoReportRequest(List<ReportFilters> filters) {
        this.filters = filters;
    }

    public ProfitLossFoReportRequest() {
    }

    public List<ReportFilters> getFilters() {
        return filters;
    }

    public void setFilters(List<ReportFilters> filters) {
        this.filters = filters;
    }

    @Override
    public String toString() {
        return "ProfitLossFoReportRequest{" +
                "filters=" + filters +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProfitLossFoReportRequest that = (ProfitLossFoReportRequest) o;
        return Objects.equals(filters, that.filters);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(filters);
    }
}
