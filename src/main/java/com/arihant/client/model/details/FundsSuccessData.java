package com.arihant.client.model.details;

import java.util.Objects;

/**
 * FundsSuccessData
 */

public class FundsSuccessData {
    private FundsView funds = null;

    public FundsSuccessData(FundsView funds) {
        this.funds = funds;
    }

    public FundsView getFunds() {
        return funds;
    }

    public void setFunds(FundsView funds) {
        this.funds = funds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FundsSuccessData that = (FundsSuccessData) o;
        return Objects.equals(funds, that.funds);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(funds);
    }

    @Override
    public String toString() {
        return "FundsSuccessData{" +
                "funds=" + funds +
                '}';
    }
}
