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
 * Position
 */
public class Position {
    @SerializedName("symbol")
    private SymbolDto symbol = null;

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

    @SerializedName("type")
    private String type = null;

    @SerializedName("ltp")
    private Double ltp = null;

    @SerializedName("bookedPnl")
    private String bookedPnl = null;

    @SerializedName("unRealizedPnl")
    private String unRealizedPnl = null;

    @SerializedName("pnlPerc")
    private Double pnlPerc = null;

    @SerializedName("netPnl")
    private Double netPnl = null;

    @SerializedName("prevPos")
    private Integer prevPos = null;

    @SerializedName("prevAvgPrice")
    private Double prevAvgPrice = null;

    @SerializedName("currPos")
    private Integer currPos = null;

    @SerializedName("currAvgPrice")
    private Double currAvgPrice = null;

    @SerializedName("netQty")
    private Integer netQty = null;

    @SerializedName("buyQty")
    private Integer buyQty = null;

    @SerializedName("sellQty")
    private Integer sellQty = null;

    @SerializedName("dayBuyQty")
    private Integer dayBuyQty = null;

    @SerializedName("daySellQty")
    private Integer daySellQty = null;

    @SerializedName("cfBuyQty")
    private Integer cfBuyQty = null;

    @SerializedName("cfSellQty")
    private Integer cfSellQty = null;

    @SerializedName("buyAvgPrice")
    private Double buyAvgPrice = null;

    @SerializedName("sellAvgPrice")
    private Double sellAvgPrice = null;

    @SerializedName("dayBuyAvgPrice")
    private Double dayBuyAvgPrice = null;

    @SerializedName("daySellAvgPrice")
    private Double daySellAvgPrice = null;

    @SerializedName("cfBuyAvgPrice")
    private Double cfBuyAvgPrice = null;

    @SerializedName("cfSellAvgPrice")
    private Double cfSellAvgPrice = null;

    @SerializedName("buyAmt")
    private Double buyAmt = null;

    @SerializedName("sellAmt")
    private Double sellAmt = null;

    @SerializedName("cfBuyAmt")
    private Double cfBuyAmt = null;

    @SerializedName("cfSellAmt")
    private Double cfSellAmt = null;

    @SerializedName("avgPrice")
    private Double avgPrice = null;

    @SerializedName("undAsset")
    private String undAsset = null;

    @SerializedName("squareOff")
    private Boolean squareOff = null;

    @SerializedName("transferable")
    private Boolean transferable = null;

    /**
     * Gets or Sets ordAction
     */
    @JsonAdapter(OrdActionEnum.Adapter.class)
    public enum OrdActionEnum {
        @SerializedName("BUY")
        BUY("BUY"),
        @SerializedName("SELL")
        SELL("SELL"),
        @SerializedName("SHORT")
        SHORT("SHORT"),
        @SerializedName("NONE")
        NONE("NONE");

        private String value;

        OrdActionEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static OrdActionEnum fromValue(String input) {
            for (OrdActionEnum b : OrdActionEnum.values()) {
                if (b.value.equals(input)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<OrdActionEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final OrdActionEnum enumeration) throws IOException {
                jsonWriter.value(String.valueOf(enumeration.getValue()));
            }

            @Override
            public OrdActionEnum read(final JsonReader jsonReader) throws IOException {
                Object value = jsonReader.nextString();
                return OrdActionEnum.fromValue((String) (value));
            }
        }
    }

    @SerializedName("ordAction")
    private OrdActionEnum ordAction = null;

    public Position symbol(SymbolDto symbol) {
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

    public Position prdType(PrdTypeEnum prdType) {
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

    public Position type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     **/
    @Schema(description = "")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Position ltp(Double ltp) {
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

    public Position bookedPnl(String bookedPnl) {
        this.bookedPnl = bookedPnl;
        return this;
    }

    /**
     * Get bookedPnl
     *
     * @return bookedPnl
     **/
    @Schema(description = "")
    public String getBookedPnl() {
        return bookedPnl;
    }

    public void setBookedPnl(String bookedPnl) {
        this.bookedPnl = bookedPnl;
    }

    public Position unRealizedPnl(String unRealizedPnl) {
        this.unRealizedPnl = unRealizedPnl;
        return this;
    }

    /**
     * Get unRealizedPnl
     *
     * @return unRealizedPnl
     **/
    @Schema(description = "")
    public String getUnRealizedPnl() {
        return unRealizedPnl;
    }

    public void setUnRealizedPnl(String unRealizedPnl) {
        this.unRealizedPnl = unRealizedPnl;
    }

    public Position pnlPerc(Double pnlPerc) {
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

    public Position netPnl(Double netPnl) {
        this.netPnl = netPnl;
        return this;
    }

    /**
     * Get netPnl
     *
     * @return netPnl
     **/
    @Schema(description = "")
    public Double getNetPnl() {
        return netPnl;
    }

    public void setNetPnl(Double netPnl) {
        this.netPnl = netPnl;
    }

    public Position prevPos(Integer prevPos) {
        this.prevPos = prevPos;
        return this;
    }

    /**
     * Get prevPos
     *
     * @return prevPos
     **/
    @Schema(description = "")
    public Integer getPrevPos() {
        return prevPos;
    }

    public void setPrevPos(Integer prevPos) {
        this.prevPos = prevPos;
    }

    public Position prevAvgPrice(Double prevAvgPrice) {
        this.prevAvgPrice = prevAvgPrice;
        return this;
    }

    /**
     * Get prevAvgPrice
     *
     * @return prevAvgPrice
     **/
    @Schema(description = "")
    public Double getPrevAvgPrice() {
        return prevAvgPrice;
    }

    public void setPrevAvgPrice(Double prevAvgPrice) {
        this.prevAvgPrice = prevAvgPrice;
    }

    public Position currPos(Integer currPos) {
        this.currPos = currPos;
        return this;
    }

    /**
     * Get currPos
     *
     * @return currPos
     **/
    @Schema(description = "")
    public Integer getCurrPos() {
        return currPos;
    }

    public void setCurrPos(Integer currPos) {
        this.currPos = currPos;
    }

    public Position currAvgPrice(Double currAvgPrice) {
        this.currAvgPrice = currAvgPrice;
        return this;
    }

    /**
     * Get currAvgPrice
     *
     * @return currAvgPrice
     **/
    @Schema(description = "")
    public Double getCurrAvgPrice() {
        return currAvgPrice;
    }

    public void setCurrAvgPrice(Double currAvgPrice) {
        this.currAvgPrice = currAvgPrice;
    }

    public Position netQty(Integer netQty) {
        this.netQty = netQty;
        return this;
    }

    /**
     * Get netQty
     *
     * @return netQty
     **/
    @Schema(description = "")
    public Integer getNetQty() {
        return netQty;
    }

    public void setNetQty(Integer netQty) {
        this.netQty = netQty;
    }

    public Position buyQty(Integer buyQty) {
        this.buyQty = buyQty;
        return this;
    }

    /**
     * Get buyQty
     *
     * @return buyQty
     **/
    @Schema(description = "")
    public Integer getBuyQty() {
        return buyQty;
    }

    public void setBuyQty(Integer buyQty) {
        this.buyQty = buyQty;
    }

    public Position sellQty(Integer sellQty) {
        this.sellQty = sellQty;
        return this;
    }

    /**
     * Get sellQty
     *
     * @return sellQty
     **/
    @Schema(description = "")
    public Integer getSellQty() {
        return sellQty;
    }

    public void setSellQty(Integer sellQty) {
        this.sellQty = sellQty;
    }

    public Position dayBuyQty(Integer dayBuyQty) {
        this.dayBuyQty = dayBuyQty;
        return this;
    }

    /**
     * Get dayBuyQty
     *
     * @return dayBuyQty
     **/
    @Schema(description = "")
    public Integer getDayBuyQty() {
        return dayBuyQty;
    }

    public void setDayBuyQty(Integer dayBuyQty) {
        this.dayBuyQty = dayBuyQty;
    }

    public Position daySellQty(Integer daySellQty) {
        this.daySellQty = daySellQty;
        return this;
    }

    /**
     * Get daySellQty
     *
     * @return daySellQty
     **/
    @Schema(description = "")
    public Integer getDaySellQty() {
        return daySellQty;
    }

    public void setDaySellQty(Integer daySellQty) {
        this.daySellQty = daySellQty;
    }

    public Position cfBuyQty(Integer cfBuyQty) {
        this.cfBuyQty = cfBuyQty;
        return this;
    }

    /**
     * Get cfBuyQty
     *
     * @return cfBuyQty
     **/
    @Schema(description = "")
    public Integer getCfBuyQty() {
        return cfBuyQty;
    }

    public void setCfBuyQty(Integer cfBuyQty) {
        this.cfBuyQty = cfBuyQty;
    }

    public Position cfSellQty(Integer cfSellQty) {
        this.cfSellQty = cfSellQty;
        return this;
    }

    /**
     * Get cfSellQty
     *
     * @return cfSellQty
     **/
    @Schema(description = "")
    public Integer getCfSellQty() {
        return cfSellQty;
    }

    public void setCfSellQty(Integer cfSellQty) {
        this.cfSellQty = cfSellQty;
    }

    public Position buyAvgPrice(Double buyAvgPrice) {
        this.buyAvgPrice = buyAvgPrice;
        return this;
    }

    /**
     * Get buyAvgPrice
     *
     * @return buyAvgPrice
     **/
    @Schema(description = "")
    public Double getBuyAvgPrice() {
        return buyAvgPrice;
    }

    public void setBuyAvgPrice(Double buyAvgPrice) {
        this.buyAvgPrice = buyAvgPrice;
    }

    public Position sellAvgPrice(Double sellAvgPrice) {
        this.sellAvgPrice = sellAvgPrice;
        return this;
    }

    /**
     * Get sellAvgPrice
     *
     * @return sellAvgPrice
     **/
    @Schema(description = "")
    public Double getSellAvgPrice() {
        return sellAvgPrice;
    }

    public void setSellAvgPrice(Double sellAvgPrice) {
        this.sellAvgPrice = sellAvgPrice;
    }

    public Position dayBuyAvgPrice(Double dayBuyAvgPrice) {
        this.dayBuyAvgPrice = dayBuyAvgPrice;
        return this;
    }

    /**
     * Get dayBuyAvgPrice
     *
     * @return dayBuyAvgPrice
     **/
    @Schema(description = "")
    public Double getDayBuyAvgPrice() {
        return dayBuyAvgPrice;
    }

    public void setDayBuyAvgPrice(Double dayBuyAvgPrice) {
        this.dayBuyAvgPrice = dayBuyAvgPrice;
    }

    public Position daySellAvgPrice(Double daySellAvgPrice) {
        this.daySellAvgPrice = daySellAvgPrice;
        return this;
    }

    /**
     * Get daySellAvgPrice
     *
     * @return daySellAvgPrice
     **/
    @Schema(description = "")
    public Double getDaySellAvgPrice() {
        return daySellAvgPrice;
    }

    public void setDaySellAvgPrice(Double daySellAvgPrice) {
        this.daySellAvgPrice = daySellAvgPrice;
    }

    public Position cfBuyAvgPrice(Double cfBuyAvgPrice) {
        this.cfBuyAvgPrice = cfBuyAvgPrice;
        return this;
    }

    /**
     * Get cfBuyAvgPrice
     *
     * @return cfBuyAvgPrice
     **/
    @Schema(description = "")
    public Double getCfBuyAvgPrice() {
        return cfBuyAvgPrice;
    }

    public void setCfBuyAvgPrice(Double cfBuyAvgPrice) {
        this.cfBuyAvgPrice = cfBuyAvgPrice;
    }

    public Position cfSellAvgPrice(Double cfSellAvgPrice) {
        this.cfSellAvgPrice = cfSellAvgPrice;
        return this;
    }

    /**
     * Get cfSellAvgPrice
     *
     * @return cfSellAvgPrice
     **/
    @Schema(description = "")
    public Double getCfSellAvgPrice() {
        return cfSellAvgPrice;
    }

    public void setCfSellAvgPrice(Double cfSellAvgPrice) {
        this.cfSellAvgPrice = cfSellAvgPrice;
    }

    public Position buyAmt(Double buyAmt) {
        this.buyAmt = buyAmt;
        return this;
    }

    /**
     * Get buyAmt
     *
     * @return buyAmt
     **/
    @Schema(description = "")
    public Double getBuyAmt() {
        return buyAmt;
    }

    public void setBuyAmt(Double buyAmt) {
        this.buyAmt = buyAmt;
    }

    public Position sellAmt(Double sellAmt) {
        this.sellAmt = sellAmt;
        return this;
    }

    /**
     * Get sellAmt
     *
     * @return sellAmt
     **/
    @Schema(description = "")
    public Double getSellAmt() {
        return sellAmt;
    }

    public void setSellAmt(Double sellAmt) {
        this.sellAmt = sellAmt;
    }

    public Position cfBuyAmt(Double cfBuyAmt) {
        this.cfBuyAmt = cfBuyAmt;
        return this;
    }

    /**
     * Get cfBuyAmt
     *
     * @return cfBuyAmt
     **/
    @Schema(description = "")
    public Double getCfBuyAmt() {
        return cfBuyAmt;
    }

    public void setCfBuyAmt(Double cfBuyAmt) {
        this.cfBuyAmt = cfBuyAmt;
    }

    public Position cfSellAmt(Double cfSellAmt) {
        this.cfSellAmt = cfSellAmt;
        return this;
    }

    /**
     * Get cfSellAmt
     *
     * @return cfSellAmt
     **/
    @Schema(description = "")
    public Double getCfSellAmt() {
        return cfSellAmt;
    }

    public void setCfSellAmt(Double cfSellAmt) {
        this.cfSellAmt = cfSellAmt;
    }

    public Position avgPrice(Double avgPrice) {
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

    public Position undAsset(String undAsset) {
        this.undAsset = undAsset;
        return this;
    }

    /**
     * Get undAsset
     *
     * @return undAsset
     **/
    @Schema(description = "")
    public String getUndAsset() {
        return undAsset;
    }

    public void setUndAsset(String undAsset) {
        this.undAsset = undAsset;
    }

    public Position squareOff(Boolean squareOff) {
        this.squareOff = squareOff;
        return this;
    }

    /**
     * Get squareOff
     *
     * @return squareOff
     **/
    @Schema(description = "")
    public Boolean isSquareOff() {
        return squareOff;
    }

    public void setSquareOff(Boolean squareOff) {
        this.squareOff = squareOff;
    }

    public Position transferable(Boolean transferable) {
        this.transferable = transferable;
        return this;
    }

    /**
     * Get transferable
     *
     * @return transferable
     **/
    @Schema(description = "")
    public Boolean isTransferable() {
        return transferable;
    }

    public void setTransferable(Boolean transferable) {
        this.transferable = transferable;
    }

    public Position ordAction(OrdActionEnum ordAction) {
        this.ordAction = ordAction;
        return this;
    }

    /**
     * Get ordAction
     *
     * @return ordAction
     **/
    @Schema(description = "")
    public OrdActionEnum getOrdAction() {
        return ordAction;
    }

    public void setOrdAction(OrdActionEnum ordAction) {
        this.ordAction = ordAction;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Position position = (Position) o;
        return Objects.equals(this.symbol, position.symbol) &&
                Objects.equals(this.prdType, position.prdType) &&
                Objects.equals(this.type, position.type) &&
                Objects.equals(this.ltp, position.ltp) &&
                Objects.equals(this.bookedPnl, position.bookedPnl) &&
                Objects.equals(this.unRealizedPnl, position.unRealizedPnl) &&
                Objects.equals(this.pnlPerc, position.pnlPerc) &&
                Objects.equals(this.netPnl, position.netPnl) &&
                Objects.equals(this.prevPos, position.prevPos) &&
                Objects.equals(this.prevAvgPrice, position.prevAvgPrice) &&
                Objects.equals(this.currPos, position.currPos) &&
                Objects.equals(this.currAvgPrice, position.currAvgPrice) &&
                Objects.equals(this.netQty, position.netQty) &&
                Objects.equals(this.buyQty, position.buyQty) &&
                Objects.equals(this.sellQty, position.sellQty) &&
                Objects.equals(this.dayBuyQty, position.dayBuyQty) &&
                Objects.equals(this.daySellQty, position.daySellQty) &&
                Objects.equals(this.cfBuyQty, position.cfBuyQty) &&
                Objects.equals(this.cfSellQty, position.cfSellQty) &&
                Objects.equals(this.buyAvgPrice, position.buyAvgPrice) &&
                Objects.equals(this.sellAvgPrice, position.sellAvgPrice) &&
                Objects.equals(this.dayBuyAvgPrice, position.dayBuyAvgPrice) &&
                Objects.equals(this.daySellAvgPrice, position.daySellAvgPrice) &&
                Objects.equals(this.cfBuyAvgPrice, position.cfBuyAvgPrice) &&
                Objects.equals(this.cfSellAvgPrice, position.cfSellAvgPrice) &&
                Objects.equals(this.buyAmt, position.buyAmt) &&
                Objects.equals(this.sellAmt, position.sellAmt) &&
                Objects.equals(this.cfBuyAmt, position.cfBuyAmt) &&
                Objects.equals(this.cfSellAmt, position.cfSellAmt) &&
                Objects.equals(this.avgPrice, position.avgPrice) &&
                Objects.equals(this.undAsset, position.undAsset) &&
                Objects.equals(this.squareOff, position.squareOff) &&
                Objects.equals(this.transferable, position.transferable) &&
                Objects.equals(this.ordAction, position.ordAction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol, prdType, type, ltp, bookedPnl, unRealizedPnl, pnlPerc, netPnl, prevPos, prevAvgPrice, currPos, currAvgPrice, netQty, buyQty, sellQty, dayBuyQty, daySellQty, cfBuyQty, cfSellQty, buyAvgPrice, sellAvgPrice, dayBuyAvgPrice, daySellAvgPrice, cfBuyAvgPrice, cfSellAvgPrice, buyAmt, sellAmt, cfBuyAmt, cfSellAmt, avgPrice, undAsset, squareOff, transferable, ordAction);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Position {\n");

        sb.append("symbol: ").append(toIndentedString(symbol)).append("\n");
        sb.append("prdType: ").append(toIndentedString(prdType)).append("\n");
        sb.append("type: ").append(toIndentedString(type)).append("\n");
        sb.append("ltp: ").append(toIndentedString(ltp)).append("\n");
        sb.append("bookedPnl: ").append(toIndentedString(bookedPnl)).append("\n");
        sb.append("unRealizedPnl: ").append(toIndentedString(unRealizedPnl)).append("\n");
        sb.append("pnlPerc: ").append(toIndentedString(pnlPerc)).append("\n");
        sb.append("netPnl: ").append(toIndentedString(netPnl)).append("\n");
        sb.append("prevPos: ").append(toIndentedString(prevPos)).append("\n");
        sb.append("prevAvgPrice: ").append(toIndentedString(prevAvgPrice)).append("\n");
        sb.append("currPos: ").append(toIndentedString(currPos)).append("\n");
        sb.append("currAvgPrice: ").append(toIndentedString(currAvgPrice)).append("\n");
        sb.append("netQty: ").append(toIndentedString(netQty)).append("\n");
        sb.append("buyQty: ").append(toIndentedString(buyQty)).append("\n");
        sb.append("sellQty: ").append(toIndentedString(sellQty)).append("\n");
        sb.append("dayBuyQty: ").append(toIndentedString(dayBuyQty)).append("\n");
        sb.append("daySellQty: ").append(toIndentedString(daySellQty)).append("\n");
        sb.append("cfBuyQty: ").append(toIndentedString(cfBuyQty)).append("\n");
        sb.append("cfSellQty: ").append(toIndentedString(cfSellQty)).append("\n");
        sb.append("buyAvgPrice: ").append(toIndentedString(buyAvgPrice)).append("\n");
        sb.append("sellAvgPrice: ").append(toIndentedString(sellAvgPrice)).append("\n");
        sb.append("dayBuyAvgPrice: ").append(toIndentedString(dayBuyAvgPrice)).append("\n");
        sb.append("daySellAvgPrice: ").append(toIndentedString(daySellAvgPrice)).append("\n");
        sb.append("cfBuyAvgPrice: ").append(toIndentedString(cfBuyAvgPrice)).append("\n");
        sb.append("cfSellAvgPrice: ").append(toIndentedString(cfSellAvgPrice)).append("\n");
        sb.append("buyAmt: ").append(toIndentedString(buyAmt)).append("\n");
        sb.append("sellAmt: ").append(toIndentedString(sellAmt)).append("\n");
        sb.append("cfBuyAmt: ").append(toIndentedString(cfBuyAmt)).append("\n");
        sb.append("cfSellAmt: ").append(toIndentedString(cfSellAmt)).append("\n");
        sb.append("avgPrice: ").append(toIndentedString(avgPrice)).append("\n");
        sb.append("undAsset: ").append(toIndentedString(undAsset)).append("\n");
        sb.append("squareOff: ").append(toIndentedString(squareOff)).append("\n");
        sb.append("transferable: ").append(toIndentedString(transferable)).append("\n");
        sb.append("ordAction: ").append(toIndentedString(ordAction)).append("\n");
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
