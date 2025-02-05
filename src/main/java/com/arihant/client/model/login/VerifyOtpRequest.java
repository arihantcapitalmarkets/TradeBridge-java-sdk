package com.arihant.client.model.login;

import java.util.Objects;

public class VerifyOtpRequest {
    private String userId;
    private String txnId;
    private String otp;

    public VerifyOtpRequest() {
    }

    public VerifyOtpRequest(String userId, String txnId, String otp) {
        this.userId = userId;
        this.txnId = txnId;
        this.otp = otp;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTxnId() {
        return txnId;
    }

    public void setTxnId(String txnId) {
        this.txnId = txnId;
    }

    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VerifyOtpRequest that = (VerifyOtpRequest) o;
        return Objects.equals(userId, that.userId) && Objects.equals(txnId, that.txnId) && Objects.equals(otp, that.otp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, txnId, otp);
    }

    @Override
    public String toString() {
        return "VerifyOtpRequest{" +
                "userId='" + userId + '\'' +
                ", txnId='" + txnId + '\'' +
                ", otp='" + otp + '\'' +
                '}';
    }
}
