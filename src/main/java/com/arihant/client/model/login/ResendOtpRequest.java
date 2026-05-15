package com.arihant.client.model.login;

import java.util.Objects;

public class ResendOtpRequest {
    private String userId;
    private String txnId;

    public ResendOtpRequest(String userId, String txnId) {
        this.userId = userId;
        this.txnId = txnId;
    }

    public ResendOtpRequest() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResendOtpRequest that = (ResendOtpRequest) o;
        return Objects.equals(userId, that.userId) && Objects.equals(txnId, that.txnId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, txnId);
    }

    @Override
    public String toString() {
        return "ResendOtpRequest{" +
                "userId='" + userId + '\'' +
                ", txnId='" + txnId + '\'' +
                '}';
    }
}
