package com.arihant.client.model.details;

import java.util.List;
import java.util.Objects;

public class ProfileClientDtl {
    private String name = null;
    private String mobNo = null;
    private String email = null;
    private String clientCode = null;
    private List<String> exc = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClientCode() {
        return clientCode;
    }

    public void setClientCode(String clientCode) {
        this.clientCode = clientCode;
    }

    public List<String> getExc() {
        return exc;
    }

    public void setExc(List<String> exc) {
        this.exc = exc;
    }

    @Override
    public String toString() {
        return "ProfileClientDtl{" +
                "name='" + name + '\'' +
                ", mobNo='" + mobNo + '\'' +
                ", email='" + email + '\'' +
                ", clientCode='" + clientCode + '\'' +
                ", exc=" + exc +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ProfileClientDtl that = (ProfileClientDtl) o;
        return Objects.equals(name, that.name) && Objects.equals(mobNo, that.mobNo) && Objects.equals(email, that.email) && Objects.equals(clientCode, that.clientCode) && Objects.equals(exc, that.exc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mobNo, email, clientCode, exc);
    }
}
