package com.arihant.client.model.details;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class BasicDtls {
    @SerializedName("Client ID")
    private String ClientID;
    @SerializedName("To")
    private String to;
    @SerializedName("Date")
    private String date;

    public BasicDtls(String clientID, String to, String date) {
        ClientID = clientID;
        to = to;
        this.date = date;
    }

    public String getClientID() {
        return ClientID;
    }

    public void setClientID(String clientID) {
        ClientID = clientID;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        to = to;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BasicDtls basicDtls = (BasicDtls) o;
        return Objects.equals(ClientID, basicDtls.ClientID) && Objects.equals(to, basicDtls.to) && Objects.equals(date, basicDtls.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ClientID, to, date);
    }

    @Override
    public String toString() {
        return "BasicDtls{" +
                "Client ID='" + ClientID + '\'' +
                ", To='" + to + '\'' +
                ", Date='" + date + '\'' +
                '}';
    }
}
