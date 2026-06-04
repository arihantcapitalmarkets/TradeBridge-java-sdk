package com.arihant.client.model.contractMaster;

import com.arihant.client.model.portfolio.SymbolDto;
import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Objects;

public class ContractMasterData {
    @SerializedName("symbols")
    private List<SymbolDto> symbols = null;

    public List<SymbolDto> getSymbols() {
        return symbols;
    }

    public void setSymbols(List<SymbolDto> symbols) {
        this.symbols = symbols;
    }

    @Override
    public String toString() {
        return "ContractMasterData{" +
                "symbols=" + symbols +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ContractMasterData that = (ContractMasterData) o;
        return Objects.equals(symbols, that.symbols);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(symbols);
    }
}
