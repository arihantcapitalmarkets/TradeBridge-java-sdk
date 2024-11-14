package com.arihant.client.model.details;

import java.util.Objects;

public class ProfileBankDtl {
    private String bankBranch = null;
    private String isPrimary = null;
    private String bankName = null;
    private String bankAccNo = null;
    private String ifsc = null;

    public ProfileBankDtl(String bankBranch, String isPrimary, String bankName, String bankAccNo, String ifsc) {
        this.bankBranch = bankBranch;
        this.isPrimary = isPrimary;
        this.bankName = bankName;
        this.bankAccNo = bankAccNo;
        this.ifsc = ifsc;
    }

    public String getBankBranch() {
        return bankBranch;
    }

    public void setBankBranch(String bankBranch) {
        this.bankBranch = bankBranch;
    }

    public String getIsPrimary() {
        return isPrimary;
    }

    public void setIsPrimary(String isPrimary) {
        this.isPrimary = isPrimary;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankAccNo() {
        return bankAccNo;
    }

    public void setBankAccNo(String bankAccNo) {
        this.bankAccNo = bankAccNo;
    }

    public String getIfsc() {
        return ifsc;
    }

    public void setIfsc(String ifsc) {
        this.ifsc = ifsc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProfileBankDtl that = (ProfileBankDtl) o;
        return Objects.equals(bankBranch, that.bankBranch) && Objects.equals(isPrimary, that.isPrimary) && Objects.equals(bankName, that.bankName) && Objects.equals(bankAccNo, that.bankAccNo) && Objects.equals(ifsc, that.ifsc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bankBranch, isPrimary, bankName, bankAccNo, ifsc);
    }

    @Override
    public String toString() {
        return "ProfileBankDtl{" +
                "bankBranch='" + bankBranch + '\'' +
                ", isPrimary='" + isPrimary + '\'' +
                ", bankName='" + bankName + '\'' +
                ", bankAccNo='" + bankAccNo + '\'' +
                ", ifsc='" + ifsc + '\'' +
                '}';
    }
}
