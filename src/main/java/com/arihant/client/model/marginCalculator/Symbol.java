package com.arihant.client.model.marginCalculator;

import com.arihant.client.model.orders.BrokerageChargeRequest;
import com.arihant.client.model.orders.ModifyOrderRequest;
import com.arihant.client.model.orders.PlaceOrderRequest;

import java.util.List;
import java.util.Objects;

public class Symbol {
    private String symbol;
    private int netQty;
    private int lotSize;
    private PlaceOrderRequest.InstrumentEnum instrument;
    private String streamSym;
    private String excToken;
    private ModifyOrderRequest.ExcEnum exc;
    private BrokerageChargeRequest.ProductEnum prdType;
    private List<String> brand;


    public Symbol(String symbol, int netQty, int lotSize, PlaceOrderRequest.InstrumentEnum instrument, String streamSym, String excToken, ModifyOrderRequest.ExcEnum exc, BrokerageChargeRequest.ProductEnum prdType, List<String> brand) {
        this.symbol = symbol;
        this.netQty = netQty;
        this.lotSize = lotSize;
        this.instrument = instrument;
        this.streamSym = streamSym;
        this.excToken = excToken;
        this.exc = exc;
        this.prdType = prdType;
        this.brand = brand;
    }

    public Symbol() {
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getNetQty() {
        return netQty;
    }

    public void setNetQty(int netQty) {
        this.netQty = netQty;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    public PlaceOrderRequest.InstrumentEnum getInstrument() {
        return instrument;
    }

    public void setInstrument(PlaceOrderRequest.InstrumentEnum instrument) {
        this.instrument = instrument;
    }

    public String getStreamSym() {
        return streamSym;
    }

    public void setStreamSym(String streamSym) {
        this.streamSym = streamSym;
    }

    public String getExcToken() {
        return excToken;
    }

    public void setExcToken(String excToken) {
        this.excToken = excToken;
    }

    public ModifyOrderRequest.ExcEnum getExc() {
        return exc;
    }

    public void setExc(ModifyOrderRequest.ExcEnum exc) {
        this.exc = exc;
    }

    public BrokerageChargeRequest.ProductEnum getPrdType() {
        return prdType;
    }

    public void setPrdType(BrokerageChargeRequest.ProductEnum prdType) {
        this.prdType = prdType;
    }

    public List<String> getBrand() {
        return brand;
    }

    public void setBrand(List<String> brand) {
        this.brand = brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Symbol symbol1 = (Symbol) o;
        return netQty == symbol1.netQty && lotSize == symbol1.lotSize && Objects.equals(symbol, symbol1.symbol) && instrument == symbol1.instrument && Objects.equals(streamSym, symbol1.streamSym) && Objects.equals(excToken, symbol1.excToken) && exc == symbol1.exc && prdType == symbol1.prdType && Objects.equals(brand, symbol1.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol, netQty, lotSize, instrument, streamSym, excToken, exc, prdType, brand);
    }

    @Override
    public String toString() {
        return "Symbol{" +
                "symbol='" + symbol + '\'' +
                ", netQty=" + netQty +
                ", lotSize=" + lotSize +
                ", instrument=" + instrument +
                ", streamSym='" + streamSym + '\'' +
                ", excToken='" + excToken + '\'' +
                ", exc=" + exc +
                ", prdType=" + prdType +
                ", brand=" + brand +
                '}';
    }
}
