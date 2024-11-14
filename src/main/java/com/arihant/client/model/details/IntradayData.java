package com.arihant.client.model.details;

import com.arihant.client.model.orders.ModifyOrderRequest;
import com.arihant.client.model.orders.PlaceOrderRequest;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * IntradayData
 */

public class IntradayData {
    @SerializedName("symbol")
    private String symbol = null;

    @SerializedName("resolution")
    private String resolution = null;

    @SerializedName("instrument")
    private PlaceOrderRequest.InstrumentEnum instrument = null;

    @SerializedName("exchange")
    private ModifyOrderRequest.ExcEnum exchange = null;

    @SerializedName("startTime")
    private String startTime = null;

    @SerializedName("endTime")
    private String endTime = null;


    public IntradayData(String symbol, String resolution, PlaceOrderRequest.InstrumentEnum instrument, ModifyOrderRequest.ExcEnum exchange, String startTime, String endTime) {
        this.symbol = symbol;
        this.resolution = resolution;
        this.instrument = instrument;
        this.exchange = exchange;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public IntradayData() {

    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public PlaceOrderRequest.InstrumentEnum getInstrument() {
        return instrument;
    }

    public void setInstrument(PlaceOrderRequest.InstrumentEnum instrument) {
        this.instrument = instrument;
    }

    public ModifyOrderRequest.ExcEnum getExchange() {
        return exchange;
    }

    public void setExchange(ModifyOrderRequest.ExcEnum exchange) {
        this.exchange = exchange;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IntradayData that = (IntradayData) o;
        return Objects.equals(symbol, that.symbol) && Objects.equals(resolution, that.resolution) && instrument == that.instrument && exchange == that.exchange && Objects.equals(startTime, that.startTime) && Objects.equals(endTime, that.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol, resolution, instrument, exchange, startTime, endTime);
    }

    @Override
    public String toString() {
        return "IntradayData{" +
                "symbol='" + symbol + '\'' +
                ", resolution='" + resolution + '\'' +
                ", instrument=" + instrument +
                ", exchange=" + exchange +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                '}';
    }
}
