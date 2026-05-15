package com.arihant.client.model.marginCalculator;

import java.util.List;
import java.util.Objects;

public class MarginCalculatorRequest {
    private List<Symbol> symbols;


    public MarginCalculatorRequest(List<Symbol> symbols) {
        this.symbols = symbols;
    }

    public MarginCalculatorRequest() {
    }

    public List<Symbol> getSymbols() {
        return symbols;
    }

    public void setSymbols(List<Symbol> symbols) {
        this.symbols = symbols;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MarginCalculatorRequest that = (MarginCalculatorRequest) o;
        return Objects.equals(symbols, that.symbols);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(symbols);
    }

    @Override
    public String toString() {
        return "MarginCalculatorRequest{" +
                "symbols=" + symbols +
                '}';
    }
}
