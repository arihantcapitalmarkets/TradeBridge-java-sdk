package com.arihant.client.model.contractMaster;

import java.util.List;
import java.util.Objects;

public class SurvSymbols {
    private List<String> dispSym = null;
    private List<String> excToken = null;

    public List<String> getDispSym() {
        return dispSym;
    }

    public void setDispSym(List<String> dispSym) {
        this.dispSym = dispSym;
    }

    public List<String> getExcToken() {
        return excToken;
    }

    public void setExcToken(List<String> excToken) {
        this.excToken = excToken;
    }

    @Override
    public String toString() {
        return "SurvSymbols{" +
                "dispSym=" + dispSym +
                ", excToken=" + excToken +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SurvSymbols that = (SurvSymbols) o;
        return Objects.equals(dispSym, that.dispSym) && Objects.equals(excToken, that.excToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dispSym, excToken);
    }
}
