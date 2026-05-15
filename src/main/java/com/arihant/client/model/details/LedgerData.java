package com.arihant.client.model.details;

import java.util.Objects;

public class LedgerData {
    private String date = null;
    private String settlementNo = null;
    private String bankName = null;
    private String balance = null;
    private String transDte = null;
    private String exch = null;
    private String accountNo = null;
    private String ledgerType = null;
    private String from = null;
    private String refId = null;
    private String debit = null;
    private String credit = null;
    private String desc = null;
    private String bookType = null;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSettlementNo() {
        return settlementNo;
    }

    public void setSettlementNo(String settlementNo) {
        this.settlementNo = settlementNo;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getTransDte() {
        return transDte;
    }

    public void setTransDte(String transDte) {
        this.transDte = transDte;
    }

    public String getExch() {
        return exch;
    }

    public void setExch(String exch) {
        this.exch = exch;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getLedgerType() {
        return ledgerType;
    }

    public void setLedgerType(String ledgerType) {
        this.ledgerType = ledgerType;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getRefId() {
        return refId;
    }

    public void setRefId(String refId) {
        this.refId = refId;
    }

    public String getDebit() {
        return debit;
    }

    public void setDebit(String debit) {
        this.debit = debit;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    @Override
    public String toString() {
        return "LedgerData{" +
                "date='" + date + '\'' +
                ", settlementNo='" + settlementNo + '\'' +
                ", bankName='" + bankName + '\'' +
                ", balance='" + balance + '\'' +
                ", transDte='" + transDte + '\'' +
                ", exch='" + exch + '\'' +
                ", accountNo='" + accountNo + '\'' +
                ", ledgerType='" + ledgerType + '\'' +
                ", from='" + from + '\'' +
                ", refId='" + refId + '\'' +
                ", debit='" + debit + '\'' +
                ", credit='" + credit + '\'' +
                ", desc='" + desc + '\'' +
                ", bookType='" + bookType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        LedgerData that = (LedgerData) o;
        return Objects.equals(date, that.date) && Objects.equals(settlementNo, that.settlementNo) && Objects.equals(bankName, that.bankName) && Objects.equals(balance, that.balance) && Objects.equals(transDte, that.transDte) && Objects.equals(exch, that.exch) && Objects.equals(accountNo, that.accountNo) && Objects.equals(ledgerType, that.ledgerType) && Objects.equals(from, that.from) && Objects.equals(refId, that.refId) && Objects.equals(debit, that.debit) && Objects.equals(credit, that.credit) && Objects.equals(desc, that.desc) && Objects.equals(bookType, that.bookType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, settlementNo, bankName, balance, transDte, exch, accountNo, ledgerType, from, refId, debit, credit, desc, bookType);
    }
}
