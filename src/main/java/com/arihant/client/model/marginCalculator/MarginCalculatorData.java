package com.arihant.client.model.marginCalculator;

import java.util.Objects;

public class MarginCalculatorData {
    private String spanReq;
    private String sprdBenefit;
    private String totalReq;
    private String expMarginPrst;

    public MarginCalculatorData(String spanReq, String sprdBenefit, String totalReq, String expMarginPrst) {
        this.spanReq = spanReq;
        this.sprdBenefit = sprdBenefit;
        this.totalReq = totalReq;
        this.expMarginPrst = expMarginPrst;
    }

    public MarginCalculatorData() {
    }

    public String getSpanReq() {
        return spanReq;
    }

    public void setSpanReq(String spanReq) {
        this.spanReq = spanReq;
    }

    public String getSprdBenefit() {
        return sprdBenefit;
    }

    public void setSprdBenefit(String sprdBenefit) {
        this.sprdBenefit = sprdBenefit;
    }

    public String getTotalReq() {
        return totalReq;
    }

    public void setTotalReq(String totalReq) {
        this.totalReq = totalReq;
    }

    public String getExpMarginPrst() {
        return expMarginPrst;
    }

    public void setExpMarginPrst(String expMarginPrst) {
        this.expMarginPrst = expMarginPrst;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MarginCalculatorData that = (MarginCalculatorData) o;
        return Objects.equals(spanReq, that.spanReq) && Objects.equals(sprdBenefit, that.sprdBenefit) && Objects.equals(totalReq, that.totalReq) && Objects.equals(expMarginPrst, that.expMarginPrst);
    }

    @Override
    public int hashCode() {
        return Objects.hash(spanReq, sprdBenefit, totalReq, expMarginPrst);
    }

    @Override
    public String toString() {
        return "MarginCalculatorData{" +
                "spanReq='" + spanReq + '\'' +
                ", sprdBenefit='" + sprdBenefit + '\'' +
                ", totalReq='" + totalReq + '\'' +
                ", expMarginPrst='" + expMarginPrst + '\'' +
                '}';
    }
}
