package com.arihant.client.model.details;

import java.util.List;
import java.util.Objects;

public class ProfitLossFoData {
    private Summary summary = null;
    private BasicDtls basicDtls = null;
    private List<PnlFo> pnlFo = null;

    public ProfitLossFoData(Summary summary, BasicDtls basicDtls, List<PnlFo> pnlFo) {
        this.summary = summary;
        this.basicDtls = basicDtls;
        this.pnlFo = pnlFo;
    }

    public Summary getSummary() {
        return summary;
    }

    public void setSummary(Summary summary) {
        this.summary = summary;
    }

    public BasicDtls getBasicDtls() {
        return basicDtls;
    }

    public void setBasicDtls(BasicDtls basicDtls) {
        this.basicDtls = basicDtls;
    }

    public List<PnlFo> getPnlFo() {
        return pnlFo;
    }

    public void setPnlFo(List<PnlFo> pnlFo) {
        this.pnlFo = pnlFo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProfitLossFoData that = (ProfitLossFoData) o;
        return Objects.equals(summary, that.summary) && Objects.equals(basicDtls, that.basicDtls) && Objects.equals(pnlFo, that.pnlFo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(summary, basicDtls, pnlFo);
    }

    @Override
    public String toString() {
        return "ProfitLossFoData{" +
                "summary=" + summary +
                ", basicDtls=" + basicDtls +
                ", pnlFo=" + pnlFo +
                '}';
    }
}
