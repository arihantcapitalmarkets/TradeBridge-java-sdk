package com.arihant.client.model.details;

import java.util.List;
import java.util.Objects;

public class TaxPnLFoRequest {
    private List<ReportFilters> filters = null;

    public List<ReportFilters> getFilters() {
        return filters;
    }

    public void setFilters(List<ReportFilters> filters) {
        this.filters = filters;
    }

    @Override
    public String toString() {
        return "TaxPnLFoRequest{" +
                "filters=" + filters +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        TaxPnLFoRequest that = (TaxPnLFoRequest) o;
        return Objects.equals(filters, that.filters);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(filters);
    }
}
