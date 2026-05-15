package com.arihant.client.model.details;

import java.util.List;
import java.util.Objects;

public class LedgerDataWrapper {
    private List<LedgerData> ledgerData = null;
    private String availableFunds = null;
    private String cashMarClosingBal = null;
    private String openingBal = null;
    private BasicDtls basicDtls = null;
    private String closingBal = null;
    private String regClosingBal = null;
    private String comClosingBal = null;
    private String isMTFSetOff = null;
    private String mtfClosingBal = null;

    public String getComClosingBal() {
        return comClosingBal;
    }

    public void setComClosingBal(String comClosingBal) {
        this.comClosingBal = comClosingBal;
    }

    public List<LedgerData> getLedgerData() {
        return ledgerData;
    }

    public void setLedgerData(List<LedgerData> ledgerData) {
        this.ledgerData = ledgerData;
    }

    public String getAvailableFunds() {
        return availableFunds;
    }

    public void setAvailableFunds(String availableFunds) {
        this.availableFunds = availableFunds;
    }

    public String getCashMarClosingBal() {
        return cashMarClosingBal;
    }

    public void setCashMarClosingBal(String cashMarClosingBal) {
        this.cashMarClosingBal = cashMarClosingBal;
    }

    public String getOpeningBal() {
        return openingBal;
    }

    public void setOpeningBal(String openingBal) {
        this.openingBal = openingBal;
    }

    public BasicDtls getBasicDtls() {
        return basicDtls;
    }

    public void setBasicDtls(BasicDtls basicDtls) {
        this.basicDtls = basicDtls;
    }

    public String getClosingBal() {
        return closingBal;
    }

    public void setClosingBal(String closingBal) {
        this.closingBal = closingBal;
    }

    public String getRegClosingBal() {
        return regClosingBal;
    }

    public void setRegClosingBal(String regClosingBal) {
        this.regClosingBal = regClosingBal;
    }

    public String getIsMTFSetOff() {
        return isMTFSetOff;
    }

    public void setIsMTFSetOff(String isMTFSetOff) {
        this.isMTFSetOff = isMTFSetOff;
    }

    public String getMtfClosingBal() {
        return mtfClosingBal;
    }

    public void setMtfClosingBal(String mtfClosingBal) {
        this.mtfClosingBal = mtfClosingBal;
    }

    @Override
    public String toString() {
        return "LedgerDataWrapper{" +
                "ledgerData=" + ledgerData +
                ", availableFunds='" + availableFunds + '\'' +
                ", cashMarClosingBal='" + cashMarClosingBal + '\'' +
                ", openingBal='" + openingBal + '\'' +
                ", basicDtls=" + basicDtls +
                ", closingBal='" + closingBal + '\'' +
                ", regClosingBal='" + regClosingBal + '\'' +
                ", comClosingBal='" + comClosingBal + '\'' +
                ", isMTFSetOff='" + isMTFSetOff + '\'' +
                ", mtfClosingBal='" + mtfClosingBal + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        LedgerDataWrapper that = (LedgerDataWrapper) o;
        return Objects.equals(ledgerData, that.ledgerData) && Objects.equals(availableFunds, that.availableFunds) && Objects.equals(cashMarClosingBal, that.cashMarClosingBal) && Objects.equals(openingBal, that.openingBal) && Objects.equals(basicDtls, that.basicDtls) && Objects.equals(closingBal, that.closingBal) && Objects.equals(regClosingBal, that.regClosingBal) && Objects.equals(comClosingBal, that.comClosingBal) && Objects.equals(isMTFSetOff, that.isMTFSetOff) && Objects.equals(mtfClosingBal, that.mtfClosingBal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ledgerData, availableFunds, cashMarClosingBal, openingBal, basicDtls, closingBal, regClosingBal, comClosingBal, isMTFSetOff, mtfClosingBal);
    }
}
