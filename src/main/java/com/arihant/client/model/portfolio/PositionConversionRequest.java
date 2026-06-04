package com.arihant.client.model.portfolio;

import com.arihant.client.enums.ExcEnum;
import com.arihant.client.enums.InstrumentEnum;
import com.arihant.client.enums.OrdActionEnum;
import com.arihant.client.enums.PrdTypeEnum;
import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * PositionConversionRequest
 */
public class PositionConversionRequest {
    @SerializedName("type")
    private String type = null;

    @SerializedName("ordAction")
    private OrdActionEnum ordAction = null;

    @SerializedName("prdType")
    private PrdTypeEnum prdType = null;

    @SerializedName("toPrdType")
    private PrdTypeEnum toPrdType = null;

    @SerializedName("qty")
    private Integer qty = null;

    @SerializedName("symbol")
    private String symbol = null;

    @SerializedName("excToken")
    private String excToken = null;

    @SerializedName("exc")
    private ExcEnum exc = null;

    @SerializedName("lotSize")
    private Integer lotSize = null;

    @SerializedName("instrument")
    private InstrumentEnum instrument = null;


    public PositionConversionRequest type(String type) {
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

    public PositionConversionRequest ordAction(OrdActionEnum ordAction) {
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

    public PositionConversionRequest prdType(PrdTypeEnum prdType) {
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

    public PositionConversionRequest toPrdType(PrdTypeEnum toPrdType) {
        this.toPrdType = toPrdType;
        return this;
    }

    /**
     * Get toPrdType
     *
     * @return toPrdType
     **/
    @Schema(description = "")
    public PrdTypeEnum getToPrdType() {
        return toPrdType;
    }

    public void setToPrdType(PrdTypeEnum toPrdType) {
        this.toPrdType = toPrdType;
    }

    public PositionConversionRequest qty(Integer qty) {
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

    public PositionConversionRequest symbol(String symbol) {
        this.symbol = symbol;
        return this;
    }

    /**
     * Get symbol
     *
     * @return symbol
     **/
    @Schema(description = "")
    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public PositionConversionRequest excToken(String excToken) {
        this.excToken = excToken;
        return this;
    }

    /**
     * Get excToken
     *
     * @return excToken
     **/
    @Schema(description = "")
    public String getExcToken() {
        return excToken;
    }

    public void setExcToken(String excToken) {
        this.excToken = excToken;
    }

    public PositionConversionRequest exc(ExcEnum exc) {
        this.exc = exc;
        return this;
    }

    /**
     * Get exc
     *
     * @return exc
     **/
    @Schema(description = "")
    public ExcEnum getExc() {
        return exc;
    }

    public void setExc(ExcEnum exc) {
        this.exc = exc;
    }

    public PositionConversionRequest lotSize(Integer lotSize) {
        this.lotSize = lotSize;
        return this;
    }

    /**
     * Get lotSize
     *
     * @return lotSize
     **/
    @Schema(description = "")
    public Integer getLotSize() {
        return lotSize;
    }

    public void setLotSize(Integer lotSize) {
        this.lotSize = lotSize;
    }

    public PositionConversionRequest instrument(InstrumentEnum instrument) {
        this.instrument = instrument;
        return this;
    }

    /**
     * Get instrument
     *
     * @return instrument
     **/
    @Schema(description = "")
    public InstrumentEnum getInstrument() {
        return instrument;
    }

    public void setInstrument(InstrumentEnum instrument) {
        this.instrument = instrument;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PositionConversionRequest positionConversionRequest = (PositionConversionRequest) o;
        return Objects.equals(this.type, positionConversionRequest.type) &&
                Objects.equals(this.ordAction, positionConversionRequest.ordAction) &&
                Objects.equals(this.prdType, positionConversionRequest.prdType) &&
                Objects.equals(this.toPrdType, positionConversionRequest.toPrdType) &&
                Objects.equals(this.qty, positionConversionRequest.qty) &&
                Objects.equals(this.symbol, positionConversionRequest.symbol) &&
                Objects.equals(this.excToken, positionConversionRequest.excToken) &&
                Objects.equals(this.exc, positionConversionRequest.exc) &&
                Objects.equals(this.lotSize, positionConversionRequest.lotSize) &&
                Objects.equals(this.instrument, positionConversionRequest.instrument);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, ordAction, prdType, toPrdType, qty, symbol, excToken, exc, lotSize, instrument);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PositionConversionRequest {\n");

        sb.append("type: ").append(toIndentedString(type)).append("\n");
        sb.append("ordAction: ").append(toIndentedString(ordAction)).append("\n");
        sb.append("prdType: ").append(toIndentedString(prdType)).append("\n");
        sb.append("toPrdType: ").append(toIndentedString(toPrdType)).append("\n");
        sb.append("qty: ").append(toIndentedString(qty)).append("\n");
        sb.append("symbol: ").append(toIndentedString(symbol)).append("\n");
        sb.append("excToken: ").append(toIndentedString(excToken)).append("\n");
        sb.append("exc: ").append(toIndentedString(exc)).append("\n");
        sb.append("lotSize: ").append(toIndentedString(lotSize)).append("\n");
        sb.append("instrument: ").append(toIndentedString(instrument)).append("\n");
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
