package com.arihant.client.model.details;

import java.util.List;
import java.util.Objects;

public class TaxPnLEquityRequest {
    private List<ReportFilters> filters = null;

    public List<ReportFilters> getFilters() {
        return filters;
    }

    public void setFilters(List<ReportFilters> filters) {
        this.filters = filters;
    }

    @Override
    public String toString() {
        return "TaxPnLEquityRequest{" +
                "filters=" + filters +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        TaxPnLEquityRequest that = (TaxPnLEquityRequest) o;
        return Objects.equals(filters, that.filters);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(filters);
    }
}
