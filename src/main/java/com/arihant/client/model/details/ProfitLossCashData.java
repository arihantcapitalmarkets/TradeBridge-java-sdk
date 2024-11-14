package com.arihant.client.model.details;

import java.util.List;
import java.util.Objects;

/**
 * ProfitLossSuccessData
 */

public class ProfitLossCashData {
    private List<PnlCash> pnlCash = null;
    private String charges = null;
    private BasicDtls basicDtls = null;

    public ProfitLossCashData(List<PnlCash> pnlCash, String charges, BasicDtls basicDtls) {
        this.pnlCash = pnlCash;
        this.charges = charges;
        this.basicDtls = basicDtls;
    }

    public List<PnlCash> getPnlCash() {
        return pnlCash;
    }

    public void setPnlCash(List<PnlCash> pnlCash) {
        this.pnlCash = pnlCash;
    }

    public String getCharges() {
        return charges;
    }

    public void setCharges(String charges) {
        this.charges = charges;
    }

    public BasicDtls getBasicDtls() {
        return basicDtls;
    }

    public void setBasicDtls(BasicDtls basicDtls) {
        this.basicDtls = basicDtls;
    }

    @Override
    public String toString() {
        return "ProfitLossCashData{" +
                "pnlCash=" + pnlCash +
                ", charges='" + charges + '\'' +
                ", basicDtls=" + basicDtls +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProfitLossCashData that = (ProfitLossCashData) o;
        return Objects.equals(pnlCash, that.pnlCash) && Objects.equals(charges, that.charges) && Objects.equals(basicDtls, that.basicDtls);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pnlCash, charges, basicDtls);
    }
}
