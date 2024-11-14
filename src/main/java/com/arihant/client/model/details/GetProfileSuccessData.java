package com.arihant.client.model.details;

import java.util.List;
import java.util.Objects;

/**
 * GetProfileSuccessData
 */

public class GetProfileSuccessData {
    private List<ProfileBankDtl> bankDtls = null;
    private List<ProfileClientDtl> clientDtls = null;
    private List<Object> nomineeContactDtls = null;
    private List<Object> nomineeNsdl = null;
    private List<Object> nomineeCdsl = null;

    public GetProfileSuccessData(List<ProfileBankDtl> bankDtls, List<ProfileClientDtl> clientDtls, List<Object> nomineeContactDtls, List<Object> nomineeNsdl, List<Object> nomineeCdsl) {
        this.bankDtls = bankDtls;
        this.clientDtls = clientDtls;
        this.nomineeContactDtls = nomineeContactDtls;
        this.nomineeNsdl = nomineeNsdl;
        this.nomineeCdsl = nomineeCdsl;
    }

    public List<ProfileBankDtl> getBankDtls() {
        return bankDtls;
    }

    public void setBankDtls(List<ProfileBankDtl> bankDtls) {
        this.bankDtls = bankDtls;
    }

    public List<ProfileClientDtl> getClientDtls() {
        return clientDtls;
    }

    public void setClientDtls(List<ProfileClientDtl> clientDtls) {
        this.clientDtls = clientDtls;
    }

    public List<Object> getNomineeContactDtls() {
        return nomineeContactDtls;
    }

    public void setNomineeContactDtls(List<Object> nomineeContactDtls) {
        this.nomineeContactDtls = nomineeContactDtls;
    }

    public List<Object> getNomineeNsdl() {
        return nomineeNsdl;
    }

    public void setNomineeNsdl(List<Object> nomineeNsdl) {
        this.nomineeNsdl = nomineeNsdl;
    }

    public List<Object> getNomineeCdsl() {
        return nomineeCdsl;
    }

    public void setNomineeCdsl(List<Object> nomineeCdsl) {
        this.nomineeCdsl = nomineeCdsl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetProfileSuccessData that = (GetProfileSuccessData) o;
        return Objects.equals(bankDtls, that.bankDtls) && Objects.equals(clientDtls, that.clientDtls) && Objects.equals(nomineeContactDtls, that.nomineeContactDtls) && Objects.equals(nomineeNsdl, that.nomineeNsdl) && Objects.equals(nomineeCdsl, that.nomineeCdsl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bankDtls, clientDtls, nomineeContactDtls, nomineeNsdl, nomineeCdsl);
    }

    @Override
    public String toString() {
        return "GetProfileSuccessData{" +
                "bankDtls=" + bankDtls +
                ", clientDtls=" + clientDtls +
                ", nomineeContactDtls=" + nomineeContactDtls +
                ", nomineeNsdl=" + nomineeNsdl +
                ", nomineeCdsl=" + nomineeCdsl +
                '}';
    }
}
