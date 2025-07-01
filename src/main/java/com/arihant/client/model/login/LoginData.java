package com.arihant.client.model.login;

import java.util.Objects;

public class LoginData {
    private String msxtendInfo;
    private String message  ;
    private String txnId ;
    private String otpExpiryTime ;
    private TwoFAType twoFAType;

    public enum TwoFAType {
        SMS, TOTP
    }

    public LoginData() {
    }

    public LoginData(String msxtendInfo, String message, String txnId, String otpExpiryTime, TwoFAType twoFAType) {
        this.msxtendInfo = msxtendInfo;
        this.message = message;
        this.txnId = txnId;
        this.otpExpiryTime = otpExpiryTime;
        this.twoFAType = twoFAType;
    }

    public String getMsxtendInfo() {
        return msxtendInfo;
    }

    public void setMsxtendInfo(String msxtendInfo) {
        this.msxtendInfo = msxtendInfo;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTxnId() {
        return txnId;
    }

    public void setTxnId(String txnId) {
        this.txnId = txnId;
    }

    public String getOtpExpiryTime() {
        return otpExpiryTime;
    }

    public void setOtpExpiryTime(String otpExpiryTime) {
        this.otpExpiryTime = otpExpiryTime;
    }

    public TwoFAType getTwoFAType() {
        return twoFAType;
    }

    public void setTwoFAType(TwoFAType twoFAType) {
        this.twoFAType = twoFAType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LoginData loginData = (LoginData) o;
        return Objects.equals(msxtendInfo, loginData.msxtendInfo) && Objects.equals(message, loginData.message) && Objects.equals(txnId, loginData.txnId) && Objects.equals(otpExpiryTime, loginData.otpExpiryTime) && twoFAType == loginData.twoFAType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(msxtendInfo, message, txnId, otpExpiryTime, twoFAType);
    }

    @Override
    public String toString() {
        return "LoginData{" +
                "msxtendInfo='" + msxtendInfo + '\'' +
                ", message='" + message + '\'' +
                ", txnId='" + txnId + '\'' +
                ", otpExpiryTime='" + otpExpiryTime + '\'' +
                ", twoFAType=" + twoFAType +
                '}';
    }

}
