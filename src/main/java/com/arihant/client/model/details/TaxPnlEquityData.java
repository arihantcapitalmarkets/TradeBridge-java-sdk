package com.arihant.client.model.details;

import java.util.List;
import java.util.Objects;

public class TaxPnlEquityData {
    private List<TaxPnLCash> pnlCash = null;
    private TaxEquitySummary summary = null;
    private BasicDtls basicDtls = null;

    public List<TaxPnLCash> getPnlCash() {
        return pnlCash;
    }

    public void setPnlCash(List<TaxPnLCash> pnlCash) {
        this.pnlCash = pnlCash;
    }

    public TaxEquitySummary getSummary() {
        return summary;
    }

    public void setSummary(TaxEquitySummary summary) {
        this.summary = summary;
    }

    public BasicDtls getBasicDtls() {
        return basicDtls;
    }

    public void setBasicDtls(BasicDtls basicDtls) {
        this.basicDtls = basicDtls;
    }

    @Override
    public String toString() {
        return "TaxPnlEquityData{" +
                "pnlCash=" + pnlCash +
                ", summary=" + summary +
                ", basicDtls=" + basicDtls +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        TaxPnlEquityData that = (TaxPnlEquityData) o;
        return Objects.equals(pnlCash, that.pnlCash) && Objects.equals(summary, that.summary) && Objects.equals(basicDtls, that.basicDtls);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pnlCash, summary, basicDtls);
    }
}
