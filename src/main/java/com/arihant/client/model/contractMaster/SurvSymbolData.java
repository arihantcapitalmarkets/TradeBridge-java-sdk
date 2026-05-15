package com.arihant.client.model.contractMaster;

import java.util.Objects;

public class SurvSymbolData {
   private SurvSymbols symbols = null;

    public SurvSymbols getSymbols() {
        return symbols;
    }

    public void setSymbols(SurvSymbols symbols) {
        this.symbols = symbols;
    }

    @Override
    public String toString() {
        return "SurvSymbolData{" +
                "symbols=" + symbols +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SurvSymbolData that = (SurvSymbolData) o;
        return Objects.equals(symbols, that.symbols);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(symbols);
    }
}
