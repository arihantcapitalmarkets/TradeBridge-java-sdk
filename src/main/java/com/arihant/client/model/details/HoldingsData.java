package com.arihant.client.model.details;

import java.util.List;
import java.util.Objects;

public class HoldingsData {
    private HoldingsBasicDtls basicDtls = null;
    private List<HoldingsEquity> equity = null;
    private List<Object> bonds = null;
    private List<Object> mutualFunds = null;

    public HoldingsBasicDtls getBasicDtls() {
        return basicDtls;
    }

    public void setBasicDtls(HoldingsBasicDtls basicDtls) {
        this.basicDtls = basicDtls;
    }

    public List<HoldingsEquity> getEquity() {
        return equity;
    }

    public void setEquity(List<HoldingsEquity> equity) {
        this.equity = equity;
    }

    public List<Object> getBonds() {
        return bonds;
    }

    public void setBonds(List<Object> bonds) {
        this.bonds = bonds;
    }

    public List<Object> getMutualFunds() {
        return mutualFunds;
    }

    public void setMutualFunds(List<Object> mutualFunds) {
        this.mutualFunds = mutualFunds;
    }

    @Override
    public String toString() {
        return "HoldingsData{" +
                "basicDtls=" + basicDtls +
                ", equity=" + equity +
                ", bonds=" + bonds +
                ", mutualFunds=" + mutualFunds +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        HoldingsData that = (HoldingsData) o;
        return Objects.equals(basicDtls, that.basicDtls) && Objects.equals(equity, that.equity) && Objects.equals(bonds, that.bonds) && Objects.equals(mutualFunds, that.mutualFunds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(basicDtls, equity, bonds, mutualFunds);
    }
}
