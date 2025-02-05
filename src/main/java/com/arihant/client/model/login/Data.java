package com.arihant.client.model.login;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.chrono.IsoChronology;
import org.threeten.bp.format.DateTimeFormatter;
import org.threeten.bp.format.DateTimeFormatterBuilder;
import org.threeten.bp.format.ResolverStyle;
import org.threeten.bp.temporal.ChronoField;

import java.io.IOException;

public class Data {
    private String accessToken;
    private String refreshToken;
    private String expiryTime;
    private Boolean ddpi;
    private String poaFlag;
    private String intellectJwtToken;
    private String mobileNumber;
    private Boolean mpinEnabled;
    private String userName;
    private String appId;
    private String redirectUrl;
    @JsonAdapter(LocalDateTimeAdapter.class)
    private LocalDateTime tokenExpiry;

    public LocalDateTime getTokenExpiry() {
        return tokenExpiry;
    }

    public void setTokenExpiry(LocalDateTime tokenExpiry) {
        this.tokenExpiry = tokenExpiry;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public String getExpiryTime() {
        return expiryTime;
    }

    public void setExpiryTime(String expiryTime) {
        this.expiryTime = expiryTime;
    }

    public Boolean getMpinEnabled() {
        return mpinEnabled;
    }

    public void setMpinEnabled(Boolean mpinEnabled) {
        this.mpinEnabled = mpinEnabled;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getIntellectJwtToken() {
        return intellectJwtToken;
    }

    public void setIntellectJwtToken(String intellectJwtToken) {
        this.intellectJwtToken = intellectJwtToken;
    }

    public String getPoaFlag() {
        return poaFlag;
    }

    public void setPoaFlag(String poaFlag) {
        this.poaFlag = poaFlag;
    }

    public Boolean getDdpi() {
        return ddpi;
    }

    public void setDdpi(Boolean ddpi) {
        this.ddpi = ddpi;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getRedirectUrl() {
        return redirectUrl;
    }

    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    public static class LocalDateTimeAdapter extends TypeAdapter<LocalDateTime> {

        private static final DateTimeFormatter FORMATTER = new DateTimeFormatterBuilder()
                .parseCaseInsensitive()
                .append(DateTimeFormatter.ISO_LOCAL_DATE)
                .appendLiteral('T')
                .append(DateTimeFormatter.ISO_LOCAL_TIME)
                .appendFraction(ChronoField.NANO_OF_SECOND, 0, 9, true)
                .toFormatter()
                .withResolverStyle(ResolverStyle.STRICT)
                .withChronology(IsoChronology.INSTANCE);

        @Override
        public void write(JsonWriter out, LocalDateTime value) throws IOException {
            if (value != null) {
                out.value(FORMATTER.format(value));
            } else {
                out.nullValue();
            }
        }

        @Override
        public LocalDateTime read(JsonReader in) throws IOException {
            String dateTimeString = in.nextString();
            return LocalDateTime.parse(dateTimeString, FORMATTER);
        }
    }
}
