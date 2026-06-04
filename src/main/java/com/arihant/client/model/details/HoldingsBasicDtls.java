package com.arihant.client.model.details;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class HoldingsBasicDtls {
    @SerializedName("Client ID")
    private String ClientID;
    @SerializedName("Client Name")
    private String clientName;
    @SerializedName("Date")
    private String date;

    public String getClientID() {
        return ClientID;
    }

    public void setClientID(String clientID) {
        ClientID = clientID;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "HoldingsBasicDtls{" +
                "Client ID='" + ClientID + '\'' +
                ", Client Name='" + clientName + '\'' +
                ", Date='" + date + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        HoldingsBasicDtls that = (HoldingsBasicDtls) o;
        return Objects.equals(ClientID, that.ClientID) && Objects.equals(clientName, that.clientName) && Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ClientID, clientName, date);
    }
}
