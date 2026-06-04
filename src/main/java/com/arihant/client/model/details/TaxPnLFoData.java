package com.arihant.client.model.details;

import java.util.List;
import java.util.Objects;

public class TaxPnLFoData {
    private TaxFoSummary summary = null;
    private BasicDtls basicDtls = null;
    private List<TaxPnLFo> pnlFo = null;

    public TaxFoSummary getSummary() {
        return summary;
    }

    public void setSummary(TaxFoSummary summary) {
        this.summary = summary;
    }

    public BasicDtls getBasicDtls() {
        return basicDtls;
    }

    public void setBasicDtls(BasicDtls basicDtls) {
        this.basicDtls = basicDtls;
    }

    public List<TaxPnLFo> getPnlFo() {
        return pnlFo;
    }

    public void setPnlFo(List<TaxPnLFo> pnlFo) {
        this.pnlFo = pnlFo;
    }

    @Override
    public String toString() {
        return "TaxPnLFoData{" +
                "summary=" + summary +
                ", basicDtls=" + basicDtls +
                ", pnlFo=" + pnlFo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        TaxPnLFoData that = (TaxPnLFoData) o;
        return Objects.equals(summary, that.summary) && Objects.equals(basicDtls, that.basicDtls) && Objects.equals(pnlFo, that.pnlFo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(summary, basicDtls, pnlFo);
    }
}
