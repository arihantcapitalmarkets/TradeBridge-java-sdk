package com.arihant.client.model.portfolio;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.IOException;
import java.util.Objects;

/**
 * Holding
 */
public class Holding {
    @SerializedName("symbol")
    private SymbolDto symbol = null;

    @SerializedName("ltp")
    private Double ltp = null;

    @SerializedName("qty")
    private Integer qty = null;

    @SerializedName("holdingQty")
    private Integer holdingQty = null;

    @SerializedName("usedQty")
    private Integer usedQty = null;

    @SerializedName("btst")
    private Integer btst = null;

    @SerializedName("pledgeQty")
    private Integer pledgeQty = null;

    /**
     * Gets or Sets prdType
     */
    @JsonAdapter(PrdTypeEnum.Adapter.class)
    public enum PrdTypeEnum {
        @SerializedName("CASH")
        CASH("CASH"),
        @SerializedName("MTF")
        MTF("MTF"),
        @SerializedName("INTRADAY")
        INTRADAY("INTRADAY"),
        @SerializedName("MARGIN")
        MARGIN("MARGIN"),
        @SerializedName("SHORTSELL")
        SHORTSELL("SHORTSELL"),
        @SerializedName("COVER_ORDER")
        COVER_ORDER("COVER_ORDER"),
        @SerializedName("BRACKET_ORDER")
        BRACKET_ORDER("BRACKET_ORDER"),
        @SerializedName("NRML")
        NRML("NRML"),
        @SerializedName("TNC")
        TNC("TNC"),
        @SerializedName("DELIVERY")
        DELIVERY("DELIVERY"),
        @SerializedName("NONE")
        NONE("NONE");

        private String value;

        PrdTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static PrdTypeEnum fromValue(String input) {
            for (PrdTypeEnum b : PrdTypeEnum.values()) {
                if (b.value.equals(input)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<PrdTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final PrdTypeEnum enumeration) throws IOException {
                jsonWriter.value(String.valueOf(enumeration.getValue()));
            }

            @Override
            public PrdTypeEnum read(final JsonReader jsonReader) throws IOException {
                Object value = jsonReader.nextString();
                return PrdTypeEnum.fromValue((String) (value));
            }
        }
    }

    @SerializedName("prdType")
    private PrdTypeEnum prdType = null;

    @SerializedName("avgPrice")
    private Double avgPrice = null;

    @SerializedName("invested")
    private Double invested = null;

    @SerializedName("marketValue")
    private Double marketValue = null;

    @SerializedName("pnlPerc")
    private Double pnlPerc = null;

    @SerializedName("unRealizedPnl")
    private Double unRealizedPnl = null;

    @SerializedName("haircut")
    private Double haircut = null;

    @SerializedName("pledgeable")
    private Boolean pledgeable = null;

    @SerializedName("closePrice")
    private Double closePrice = null;

    @SerializedName("freeQty")
    private Integer freeQty = null;

    public Holding symbol(SymbolDto symbol) {
        this.symbol = symbol;
        return this;
    }

    /**
     * Get symbol
     *
     * @return symbol
     **/
    @Schema(description = "")
    public SymbolDto getSymbol() {
        return symbol;
    }

    public void setSymbol(SymbolDto symbol) {
        this.symbol = symbol;
    }

    public Holding ltp(Double ltp) {
        this.ltp = ltp;
        return this;
    }

    /**
     * Get ltp
     *
     * @return ltp
     **/
    @Schema(description = "")
    public Double getLtp() {
        return ltp;
    }

    public void setLtp(Double ltp) {
        this.ltp = ltp;
    }

    public Holding qty(Integer qty) {
        this.qty = qty;
        return this;
    }

    /**
     * Get qty
     *
     * @return qty
     **/
    @Schema(description = "")
    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public Holding holdingQty(Integer holdingQty) {
        this.holdingQty = holdingQty;
        return this;
    }

    /**
     * Get holdingQty
     *
     * @return holdingQty
     **/
    @Schema(description = "")
    public Integer getHoldingQty() {
        return holdingQty;
    }

    public void setHoldingQty(Integer holdingQty) {
        this.holdingQty = holdingQty;
    }

    public Holding usedQty(Integer usedQty) {
        this.usedQty = usedQty;
        return this;
    }

    /**
     * Get usedQty
     *
     * @return usedQty
     **/
    @Schema(description = "")
    public Integer getUsedQty() {
        return usedQty;
    }

    public void setUsedQty(Integer usedQty) {
        this.usedQty = usedQty;
    }

    public Holding btst(Integer btst) {
        this.btst = btst;
        return this;
    }

    /**
     * Get btst
     *
     * @return btst
     **/
    @Schema(description = "")
    public Integer getBtst() {
        return btst;
    }

    public void setBtst(Integer btst) {
        this.btst = btst;
    }

    public Holding pledgeQty(Integer pledgeQty) {
        this.pledgeQty = pledgeQty;
        return this;
    }

    /**
     * Get pledgeQty
     *
     * @return pledgeQty
     **/
    @Schema(description = "")
    public Integer getPledgeQty() {
        return pledgeQty;
    }

    public void setPledgeQty(Integer pledgeQty) {
        this.pledgeQty = pledgeQty;
    }

    public Holding prdType(PrdTypeEnum prdType) {
        this.prdType = prdType;
        return this;
    }

    /**
     * Get prdType
     *
     * @return prdType
     **/
    @Schema(description = "")
    public PrdTypeEnum getPrdType() {
        return prdType;
    }

    public void setPrdType(PrdTypeEnum prdType) {
        this.prdType = prdType;
    }

    public Holding avgPrice(Double avgPrice) {
        this.avgPrice = avgPrice;
        return this;
    }

    /**
     * Get avgPrice
     *
     * @return avgPrice
     **/
    @Schema(description = "")
    public Double getAvgPrice() {
        return avgPrice;
    }

    public void setAvgPrice(Double avgPrice) {
        this.avgPrice = avgPrice;
    }

    public Holding invested(Double invested) {
        this.invested = invested;
        return this;
    }

    /**
     * Get invested
     *
     * @return invested
     **/
    @Schema(description = "")
    public Double getInvested() {
        return invested;
    }

    public void setInvested(Double invested) {
        this.invested = invested;
    }

    public Holding marketValue(Double marketValue) {
        this.marketValue = marketValue;
        return this;
    }

    /**
     * Get marketValue
     *
     * @return marketValue
     **/
    @Schema(description = "")
    public Double getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(Double marketValue) {
        this.marketValue = marketValue;
    }

    public Holding pnlPerc(Double pnlPerc) {
        this.pnlPerc = pnlPerc;
        return this;
    }

    /**
     * Get pnlPerc
     *
     * @return pnlPerc
     **/
    @Schema(description = "")
    public Double getPnlPerc() {
        return pnlPerc;
    }

    public void setPnlPerc(Double pnlPerc) {
        this.pnlPerc = pnlPerc;
    }

    public Holding unRealizedPnl(Double unRealizedPnl) {
        this.unRealizedPnl = unRealizedPnl;
        return this;
    }

    /**
     * Get unRealizedPnl
     *
     * @return unRealizedPnl
     **/
    @Schema(description = "")
    public Double getUnRealizedPnl() {
        return unRealizedPnl;
    }

    public void setUnRealizedPnl(Double unRealizedPnl) {
        this.unRealizedPnl = unRealizedPnl;
    }

    public Holding haircut(Double haircut) {
        this.haircut = haircut;
        return this;
    }

    /**
     * Get haircut
     *
     * @return haircut
     **/
    @Schema(description = "")
    public Double getHaircut() {
        return haircut;
    }

    public void setHaircut(Double haircut) {
        this.haircut = haircut;
    }

    public Holding pledgeable(Boolean pledgeable) {
        this.pledgeable = pledgeable;
        return this;
    }

    /**
     * Get pledgeable
     *
     * @return pledgeable
     **/
    @Schema(description = "")
    public Boolean isPledgeable() {
        return pledgeable;
    }

    public void setPledgeable(Boolean pledgeable) {
        this.pledgeable = pledgeable;
    }

    public Holding closePrice(Double closePrice) {
        this.closePrice = closePrice;
        return this;
    }

    /**
     * Get closePrice
     *
     * @return closePrice
     **/
    @Schema(description = "")
    public Double getClosePrice() {
        return closePrice;
    }

    public void setClosePrice(Double closePrice) {
        this.closePrice = closePrice;
    }

    public Holding freeQty(Integer freeQty) {
        this.freeQty = freeQty;
        return this;
    }

    /**
     * Get freeQty
     *
     * @return freeQty
     **/
    @Schema(description = "")
    public Integer getFreeQty() {
        return freeQty;
    }

    public void setFreeQty(Integer freeQty) {
        this.freeQty = freeQty;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Holding holding = (Holding) o;
        return Objects.equals(this.symbol, holding.symbol) &&
                Objects.equals(this.ltp, holding.ltp) &&
                Objects.equals(this.qty, holding.qty) &&
                Objects.equals(this.holdingQty, holding.holdingQty) &&
                Objects.equals(this.usedQty, holding.usedQty) &&
                Objects.equals(this.btst, holding.btst) &&
                Objects.equals(this.pledgeQty, holding.pledgeQty) &&
                Objects.equals(this.prdType, holding.prdType) &&
                Objects.equals(this.avgPrice, holding.avgPrice) &&
                Objects.equals(this.invested, holding.invested) &&
                Objects.equals(this.marketValue, holding.marketValue) &&
                Objects.equals(this.pnlPerc, holding.pnlPerc) &&
                Objects.equals(this.unRealizedPnl, holding.unRealizedPnl) &&
                Objects.equals(this.haircut, holding.haircut) &&
                Objects.equals(this.pledgeable, holding.pledgeable) &&
                Objects.equals(this.closePrice, holding.closePrice) &&
                Objects.equals(this.freeQty, holding.freeQty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol, ltp, qty, holdingQty, usedQty, btst, pledgeQty, prdType, avgPrice, invested, marketValue, pnlPerc, unRealizedPnl, haircut, pledgeable, closePrice, freeQty);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Holding {\n");

        sb.append("symbol: ").append(toIndentedString(symbol)).append("\n");
        sb.append("ltp: ").append(toIndentedString(ltp)).append("\n");
        sb.append("qty: ").append(toIndentedString(qty)).append("\n");
        sb.append("holdingQty: ").append(toIndentedString(holdingQty)).append("\n");
        sb.append("usedQty: ").append(toIndentedString(usedQty)).append("\n");
        sb.append("btst: ").append(toIndentedString(btst)).append("\n");
        sb.append("pledgeQty: ").append(toIndentedString(pledgeQty)).append("\n");
        sb.append("prdType: ").append(toIndentedString(prdType)).append("\n");
        sb.append("avgPrice: ").append(toIndentedString(avgPrice)).append("\n");
        sb.append("invested: ").append(toIndentedString(invested)).append("\n");
        sb.append("marketValue: ").append(toIndentedString(marketValue)).append("\n");
        sb.append("pnlPerc: ").append(toIndentedString(pnlPerc)).append("\n");
        sb.append("unRealizedPnl: ").append(toIndentedString(unRealizedPnl)).append("\n");
        sb.append("haircut: ").append(toIndentedString(haircut)).append("\n");
        sb.append("pledgeable: ").append(toIndentedString(pledgeable)).append("\n");
        sb.append("closePrice: ").append(toIndentedString(closePrice)).append("\n");
        sb.append("freeQty: ").append(toIndentedString(freeQty)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return null;
        }
        return o.toString().replace("\n", "\n    ");
    }

}
