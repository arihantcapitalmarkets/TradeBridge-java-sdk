package com.arihant.client.model.portfolio;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.LocalDate;

import java.io.IOException;
import java.util.Objects;
import java.util.Set;

/**
 * SymbolDto
 */

public class SymbolDto {
    @SerializedName("symbol")
    private String symbol = null;

    @SerializedName("dispSym")
    private String dispSym = null;

    /**
     * Gets or Sets instrument
     */
    @JsonAdapter(InstrumentEnum.Adapter.class)
    public enum InstrumentEnum {
        @SerializedName("STK")
        STK("STK"),
        @SerializedName("ETF")
        ETF("ETF"),
        @SerializedName("IDX")
        IDX("IDX"),
        @SerializedName("COM")
        COM("COM"),
        @SerializedName("UNDCUR")
        UNDCUR("UNDCUR"),
        @SerializedName("CUR")
        CUR("CUR"),
        @SerializedName("FUTIVX")
        FUTIVX("FUTIVX"),
        @SerializedName("FUTSTK")
        FUTSTK("FUTSTK"),
        @SerializedName("FUTIDX")
        FUTIDX("FUTIDX"),
        @SerializedName("FUTCUR")
        FUTCUR("FUTCUR"),
        @SerializedName("FUTIRD")
        FUTIRD("FUTIRD"),
        @SerializedName("FUTIRC")
        FUTIRC("FUTIRC"),
        @SerializedName("FUTIRT")
        FUTIRT("FUTIRT"),
        @SerializedName("FUTIRF")
        FUTIRF("FUTIRF"),
        @SerializedName("FUTCOM")
        FUTCOM("FUTCOM"),
        @SerializedName("FUTBLN")
        FUTBLN("FUTBLN"),
        @SerializedName("FUTENR")
        FUTENR("FUTENR"),
        @SerializedName("FUTMET")
        FUTMET("FUTMET"),
        @SerializedName("FUTAGR")
        FUTAGR("FUTAGR"),
        @SerializedName("OPTIDX")
        OPTIDX("OPTIDX"),
        @SerializedName("OPTSTK")
        OPTSTK("OPTSTK"),
        @SerializedName("OPTCOM")
        OPTCOM("OPTCOM"),
        @SerializedName("OPTBLN")
        OPTBLN("OPTBLN"),
        @SerializedName("OPTENR")
        OPTENR("OPTENR"),
        @SerializedName("OPTAGR")
        OPTAGR("OPTAGR"),
        @SerializedName("OPTCUR")
        OPTCUR("OPTCUR"),
        @SerializedName("OPTIRC")
        OPTIRC("OPTIRC"),
        @SerializedName("OPTIRD")
        OPTIRD("OPTIRD"),
        @SerializedName("UNDCOM")
        UNDCOM("UNDCOM"),
        @SerializedName("AUCSO")
        AUCSO("AUCSO"),
        @SerializedName("FUTIDXSPR")
        FUTIDXSPR("FUTIDXSPR"),
        @SerializedName("FUTSTKSPR")
        FUTSTKSPR("FUTSTKSPR"),
        @SerializedName("FUTCURSPR")
        FUTCURSPR("FUTCURSPR"),
        @SerializedName("FUTIRTSPR")
        FUTIRTSPR("FUTIRTSPR"),
        @SerializedName("FUTIRCSPR")
        FUTIRCSPR("FUTIRCSPR"),
        @SerializedName("FUTIRDSPR")
        FUTIRDSPR("FUTIRDSPR"),
        @SerializedName("OPTCURSPR")
        OPTCURSPR("OPTCURSPR"),
        @SerializedName("OPTIRCSPR")
        OPTIRCSPR("OPTIRCSPR"),
        @SerializedName("FUTCOMSPR")
        FUTCOMSPR("FUTCOMSPR"),
        @SerializedName("OPTCOMSPR")
        OPTCOMSPR("OPTCOMSPR"),
        @SerializedName("UNDIRC")
        UNDIRC("UNDIRC"),
        @SerializedName("UNDIRD")
        UNDIRD("UNDIRD"),
        @SerializedName("UNDIRT")
        UNDIRT("UNDIRT"),
        @SerializedName("NONE")
        NONE("NONE");

        private String value;

        InstrumentEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static InstrumentEnum fromValue(String input) {
            for (InstrumentEnum b : InstrumentEnum.values()) {
                if (b.value.equals(input)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<InstrumentEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final InstrumentEnum enumeration) throws IOException {
                jsonWriter.value(String.valueOf(enumeration.getValue()));
            }

            @Override
            public InstrumentEnum read(final JsonReader jsonReader) throws IOException {
                Object value = jsonReader.nextString();
                return InstrumentEnum.fromValue((String) (value));
            }
        }
    }

    @SerializedName("instrument")
    private InstrumentEnum instrument = null;

    @SerializedName("baseSym")
    private String baseSym = null;

    @SerializedName("companyName")
    private String companyName = null;

    @SerializedName("isin")
    private String isin = null;

    /**
     * Gets or Sets exc
     */
    @JsonAdapter(ExcEnum.Adapter.class)
    public enum ExcEnum {
        @SerializedName("NSE")
        NSE("NSE"),
        @SerializedName("BSE")
        BSE("BSE"),
        @SerializedName("NFO")
        NFO("NFO"),
        @SerializedName("BFO")
        BFO("BFO"),
        @SerializedName("CDS")
        CDS("CDS"),
        @SerializedName("BCD")
        BCD("BCD"),
        @SerializedName("MCXSX")
        MCXSX("MCXSX"),
        @SerializedName("MCX")
        MCX("MCX"),
        @SerializedName("NCO")
        NCO("NCO"),
        @SerializedName("BCO")
        BCO("BCO"),
        @SerializedName("ICEX")
        ICEX("ICEX");

        private String value;

        ExcEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static ExcEnum fromValue(String input) {
            for (ExcEnum b : ExcEnum.values()) {
                if (b.value.equals(input)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<ExcEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final ExcEnum enumeration) throws IOException {
                jsonWriter.value(String.valueOf(enumeration.getValue()));
            }

            @Override
            public ExcEnum read(final JsonReader jsonReader) throws IOException {
                Object value = jsonReader.nextString();
                return ExcEnum.fromValue((String) (value));
            }
        }
    }

    @SerializedName("exc")
    private ExcEnum exc = null;

    @SerializedName("excTkn")
    private Integer excTkn = null;

    @SerializedName("series")
    private String series = null;

    @SerializedName("lotSize")
    private Integer lotSize = null;

    @SerializedName("tickSize")
    private String tickSize = null;

    @SerializedName("expiryDate")
    private LocalDate expiryDate = null;

    @SerializedName("optionType")
    private String optionType = null;

    @SerializedName("strikePrice")
    private Double strikePrice = null;

    @SerializedName("streamSym")
    private String streamSym = null;

    /**
     * Gets or Sets segment
     */
    @JsonAdapter(SegmentEnum.Adapter.class)
    public enum SegmentEnum {
        @SerializedName("equity")
        EQUITY("equity"),
        @SerializedName("derivative")
        DERIVATIVE("derivative"),
        @SerializedName("derivative")
        DERIVATIVE_2("derivative"),
        @SerializedName("index")
        INDEX("index"),
        @SerializedName("commodity")
        COMMODITY("commodity"),
        @SerializedName("currency")
        CURRENCY("currency"),
        @SerializedName("spread")
        SPREAD("spread"),
        @SerializedName("derivative")
        DERIVATIVE_7("derivative"),
        @SerializedName("none")
        NONE("none");

        private String value;

        SegmentEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static SegmentEnum fromValue(String input) {
            for (SegmentEnum b : SegmentEnum.values()) {
                if (b.value.equals(input)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<SegmentEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final SegmentEnum enumeration) throws IOException {
                jsonWriter.value(String.valueOf(enumeration.getValue()));
            }

            @Override
            public SegmentEnum read(final JsonReader jsonReader) throws IOException {
                Object value = jsonReader.nextString();
                return SegmentEnum.fromValue((String) (value));
            }
        }
    }

    @SerializedName("segment")
    private SegmentEnum segment = null;

    @SerializedName("fno")
    private Boolean fno = null;

    @SerializedName("mtf")
    private Boolean mtf = null;

    @SerializedName("multiplier")
    private String multiplier = null;

    @SerializedName("freezeQty")
    private String freezeQty = null;

    public Set<String> getOtherExc() {
        return otherExc;
    }

    public void setOtherExc(Set<String> otherExc) {
        this.otherExc = otherExc;
    }

    public String getTradingSymbol() {
        return tradingSymbol;
    }

    public void setTradingSymbol(String tradingSymbol) {
        this.tradingSymbol = tradingSymbol;
    }

    @SerializedName("tradingSymbol")
    private String tradingSymbol = null;
    @SerializedName("otherExc")
    private Set<String> otherExc = null;

    public SymbolDto symbol(String symbol) {
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

    public SymbolDto dispSym(String dispSym) {
        this.dispSym = dispSym;
        return this;
    }

    /**
     * Get dispSym
     *
     * @return dispSym
     **/
    @Schema(description = "")
    public String getDispSym() {
        return dispSym;
    }

    public void setDispSym(String dispSym) {
        this.dispSym = dispSym;
    }

    public SymbolDto instrument(InstrumentEnum instrument) {
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

    public SymbolDto baseSym(String baseSym) {
        this.baseSym = baseSym;
        return this;
    }

    /**
     * Get baseSym
     *
     * @return baseSym
     **/
    @Schema(description = "")
    public String getBaseSym() {
        return baseSym;
    }

    public void setBaseSym(String baseSym) {
        this.baseSym = baseSym;
    }

    public SymbolDto companyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    /**
     * Get companyName
     *
     * @return companyName
     **/
    @Schema(description = "")
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public SymbolDto isin(String isin) {
        this.isin = isin;
        return this;
    }

    /**
     * Get isin
     *
     * @return isin
     **/
    @Schema(description = "")
    public String getIsin() {
        return isin;
    }

    public void setIsin(String isin) {
        this.isin = isin;
    }

    public SymbolDto exc(ExcEnum exc) {
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

    public SymbolDto excTkn(Integer excTkn) {
        this.excTkn = excTkn;
        return this;
    }

    /**
     * Get excTkn
     *
     * @return excTkn
     **/
    @Schema(description = "")
    public Integer getExcTkn() {
        return excTkn;
    }

    public void setExcTkn(Integer excTkn) {
        this.excTkn = excTkn;
    }

    public SymbolDto series(String series) {
        this.series = series;
        return this;
    }

    /**
     * Get series
     *
     * @return series
     **/
    @Schema(description = "")
    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public SymbolDto lotSize(Integer lotSize) {
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

    public SymbolDto tickSize(String tickSize) {
        this.tickSize = tickSize;
        return this;
    }

    /**
     * Get tickSize
     *
     * @return tickSize
     **/
    @Schema(description = "")
    public String getTickSize() {
        return tickSize;
    }

    public void setTickSize(String tickSize) {
        this.tickSize = tickSize;
    }

    public SymbolDto expiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
        return this;
    }

    /**
     * Get expiryDate
     *
     * @return expiryDate
     **/
    @Schema(description = "")
    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public SymbolDto optionType(String optionType) {
        this.optionType = optionType;
        return this;
    }

    /**
     * Get optionType
     *
     * @return optionType
     **/
    @Schema(description = "")
    public String getOptionType() {
        return optionType;
    }

    public void setOptionType(String optionType) {
        this.optionType = optionType;
    }

    public SymbolDto strikePrice(Double strikePrice) {
        this.strikePrice = strikePrice;
        return this;
    }

    /**
     * Get strikePrice
     *
     * @return strikePrice
     **/
    @Schema(description = "")
    public Double getStrikePrice() {
        return strikePrice;
    }

    public void setStrikePrice(Double strikePrice) {
        this.strikePrice = strikePrice;
    }

    public SymbolDto streamSym(String streamSym) {
        this.streamSym = streamSym;
        return this;
    }

    /**
     * Get streamSym
     *
     * @return streamSym
     **/
    @Schema(description = "")
    public String getStreamSym() {
        return streamSym;
    }

    public void setStreamSym(String streamSym) {
        this.streamSym = streamSym;
    }

    public SymbolDto segment(SegmentEnum segment) {
        this.segment = segment;
        return this;
    }

    /**
     * Get segment
     *
     * @return segment
     **/
    @Schema(description = "")
    public SegmentEnum getSegment() {
        return segment;
    }

    public void setSegment(SegmentEnum segment) {
        this.segment = segment;
    }

    public SymbolDto fno(Boolean fno) {
        this.fno = fno;
        return this;
    }

    /**
     * Get fno
     *
     * @return fno
     **/
    @Schema(description = "")
    public Boolean isFno() {
        return fno;
    }

    public void setFno(Boolean fno) {
        this.fno = fno;
    }

    public SymbolDto mtf(Boolean mtf) {
        this.mtf = mtf;
        return this;
    }

    /**
     * Get mtf
     *
     * @return mtf
     **/
    @Schema(description = "")
    public Boolean isMtf() {
        return mtf;
    }

    public void setMtf(Boolean mtf) {
        this.mtf = mtf;
    }

    public SymbolDto multiplier(String multiplier) {
        this.multiplier = multiplier;
        return this;
    }

    /**
     * Get multiplier
     *
     * @return multiplier
     **/
    @Schema(description = "")
    public String getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(String multiplier) {
        this.multiplier = multiplier;
    }

    public SymbolDto freezeQty(String freezeQty) {
        this.freezeQty = freezeQty;
        return this;
    }

    /**
     * Get freezeQty
     *
     * @return freezeQty
     **/
    @Schema(description = "")
    public String getFreezeQty() {
        return freezeQty;
    }

    public void setFreezeQty(String freezeQty) {
        this.freezeQty = freezeQty;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SymbolDto symbolDto = (SymbolDto) o;
        return Objects.equals(this.symbol, symbolDto.symbol) &&
                Objects.equals(this.dispSym, symbolDto.dispSym) &&
                Objects.equals(this.instrument, symbolDto.instrument) &&
                Objects.equals(this.baseSym, symbolDto.baseSym) &&
                Objects.equals(this.companyName, symbolDto.companyName) &&
                Objects.equals(this.isin, symbolDto.isin) &&
                Objects.equals(this.exc, symbolDto.exc) &&
                Objects.equals(this.excTkn, symbolDto.excTkn) &&
                Objects.equals(this.series, symbolDto.series) &&
                Objects.equals(this.lotSize, symbolDto.lotSize) &&
                Objects.equals(this.tickSize, symbolDto.tickSize) &&
                Objects.equals(this.expiryDate, symbolDto.expiryDate) &&
                Objects.equals(this.optionType, symbolDto.optionType) &&
                Objects.equals(this.strikePrice, symbolDto.strikePrice) &&
                Objects.equals(this.streamSym, symbolDto.streamSym) &&
                Objects.equals(this.segment, symbolDto.segment) &&
                Objects.equals(this.fno, symbolDto.fno) &&
                Objects.equals(this.mtf, symbolDto.mtf) &&
                Objects.equals(this.multiplier, symbolDto.multiplier) &&
                Objects.equals(this.freezeQty, symbolDto.freezeQty) &&
                Objects.equals(this.tradingSymbol, symbolDto.tradingSymbol) &&
                Objects.equals(this.otherExc, symbolDto.otherExc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol, dispSym, instrument, baseSym, companyName, isin, exc, excTkn, series, lotSize, tickSize, expiryDate, optionType, strikePrice, streamSym, segment, fno, mtf, multiplier, freezeQty);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SymbolDto {\n");

        sb.append("symbol: ").append(toIndentedString(symbol)).append("\n");
        sb.append("dispSym: ").append(toIndentedString(dispSym)).append("\n");
        sb.append("instrument: ").append(toIndentedString(instrument)).append("\n");
        sb.append("baseSym: ").append(toIndentedString(baseSym)).append("\n");
        sb.append("companyName: ").append(toIndentedString(companyName)).append("\n");
        sb.append("isin: ").append(toIndentedString(isin)).append("\n");
        sb.append("exc: ").append(toIndentedString(exc)).append("\n");
        sb.append("excTkn: ").append(toIndentedString(excTkn)).append("\n");
        sb.append("series: ").append(toIndentedString(series)).append("\n");
        sb.append("lotSize: ").append(toIndentedString(lotSize)).append("\n");
        sb.append("tickSize: ").append(toIndentedString(tickSize)).append("\n");
        sb.append("expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
        sb.append("optionType: ").append(toIndentedString(optionType)).append("\n");
        sb.append("strikePrice: ").append(toIndentedString(strikePrice)).append("\n");
        sb.append("streamSym: ").append(toIndentedString(streamSym)).append("\n");
        sb.append("segment: ").append(toIndentedString(segment)).append("\n");
        sb.append("fno: ").append(toIndentedString(fno)).append("\n");
        sb.append("mtf: ").append(toIndentedString(mtf)).append("\n");
        sb.append("multiplier: ").append(toIndentedString(multiplier)).append("\n");
        sb.append("freezeQty: ").append(toIndentedString(freezeQty)).append("\n");
        sb.append("tradingSymbol: ").append(toIndentedString(tradingSymbol)).append("\n");
        sb.append("otherExc: ").append(toIndentedString(otherExc)).append("\n");
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
