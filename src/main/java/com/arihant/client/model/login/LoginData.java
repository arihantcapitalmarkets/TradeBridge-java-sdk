package com.arihant.client.model.login;

import java.util.Objects;


public class LoginData {
    private String message;
    private String txnId;
    private String otpExpiryTime;


    public LoginData() {
    }

    public LoginData(String message, String txnId, String otpExpiryTime) {
        this.message = message;
        this.txnId = txnId;
        this.otpExpiryTime = otpExpiryTime;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LoginData loginData = (LoginData) o;
        return Objects.equals(message, loginData.message) && Objects.equals(txnId, loginData.txnId) && Objects.equals(otpExpiryTime, loginData.otpExpiryTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, txnId, otpExpiryTime);
    }

    @Override
    public String toString() {
        return "LoginData{" +
                "message='" + message + '\'' +
                ", txnId='" + txnId + '\'' +
                ", otpExpiryTime='" + otpExpiryTime + '\'' +
                '}';
    }
}
