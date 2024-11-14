package com.arihant.client.model.orders;


import java.util.Objects;

/**
 * BrokerageCharge
 */

public class BrokerageCharge {
    private String externalCharges;
    private String ipft;
    private String gst;
    private String taxes;
    private String stt;
    private String stampDuty;
    private String sebiFee;
    private String price;
    private String qty;
    private String tot;
    private String brokeragePrice;
    private String totalCharges;
    private String ipf;

    public BrokerageCharge(String externalCharges, String ipft, String gst, String taxes, String stt, String stampDuty, String sebiFee, String price, String qty, String tot, String brokeragePrice, String totalCharges, String ipf) {
        this.externalCharges = externalCharges;
        this.ipft = ipft;
        this.gst = gst;
        this.taxes = taxes;
        this.stt = stt;
        this.stampDuty = stampDuty;
        this.sebiFee = sebiFee;
        this.price = price;
        this.qty = qty;
        this.tot = tot;
        this.brokeragePrice = brokeragePrice;
        this.totalCharges = totalCharges;
        this.ipf = ipf;
    }

    public String getExternalCharges() {
        return externalCharges;
    }

    public void setExternalCharges(String externalCharges) {
        this.externalCharges = externalCharges;
    }

    public String getIpft() {
        return ipft;
    }

    public void setIpft(String ipft) {
        this.ipft = ipft;
    }

    public String getGst() {
        return gst;
    }

    public void setGst(String gst) {
        this.gst = gst;
    }

    public String getTaxes() {
        return taxes;
    }

    public void setTaxes(String taxes) {
        this.taxes = taxes;
    }

    public String getStt() {
        return stt;
    }

    public void setStt(String stt) {
        this.stt = stt;
    }

    public String getStampDuty() {
        return stampDuty;
    }

    public void setStampDuty(String stampDuty) {
        this.stampDuty = stampDuty;
    }

    public String getSebiFee() {
        return sebiFee;
    }

    public void setSebiFee(String sebiFee) {
        this.sebiFee = sebiFee;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public String getTot() {
        return tot;
    }

    public void setTot(String tot) {
        this.tot = tot;
    }

    public String getBrokeragePrice() {
        return brokeragePrice;
    }

    public void setBrokeragePrice(String brokeragePrice) {
        this.brokeragePrice = brokeragePrice;
    }

    public String getTotalCharges() {
        return totalCharges;
    }

    public void setTotalCharges(String totalCharges) {
        this.totalCharges = totalCharges;
    }

    public String getIpf() {
        return ipf;
    }

    public void setIpf(String ipf) {
        this.ipf = ipf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BrokerageCharge that = (BrokerageCharge) o;
        return Objects.equals(externalCharges, that.externalCharges) && Objects.equals(ipft, that.ipft) && Objects.equals(gst, that.gst) && Objects.equals(taxes, that.taxes) && Objects.equals(stt, that.stt) && Objects.equals(stampDuty, that.stampDuty) && Objects.equals(sebiFee, that.sebiFee) && Objects.equals(price, that.price) && Objects.equals(qty, that.qty) && Objects.equals(tot, that.tot) && Objects.equals(brokeragePrice, that.brokeragePrice) && Objects.equals(totalCharges, that.totalCharges) && Objects.equals(ipf, that.ipf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(externalCharges, ipft, gst, taxes, stt, stampDuty, sebiFee, price, qty, tot, brokeragePrice, totalCharges, ipf);
    }

    @Override
    public String toString() {
        return "BrokerageCharge{" +
                "externalCharges='" + externalCharges + '\'' +
                ", ipft='" + ipft + '\'' +
                ", gst='" + gst + '\'' +
                ", taxes='" + taxes + '\'' +
                ", stt='" + stt + '\'' +
                ", stampDuty='" + stampDuty + '\'' +
                ", sebiFee='" + sebiFee + '\'' +
                ", price='" + price + '\'' +
                ", qty='" + qty + '\'' +
                ", tot='" + tot + '\'' +
                ", brokeragePrice='" + brokeragePrice + '\'' +
                ", totalCharges='" + totalCharges + '\'' +
                ", ipf='" + ipf + '\'' +
                '}';
    }
}
