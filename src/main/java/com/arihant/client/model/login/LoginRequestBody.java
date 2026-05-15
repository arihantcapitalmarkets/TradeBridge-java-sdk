package com.arihant.client.model.login;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * LoginBody
 */

public class LoginRequestBody {
    @SerializedName("userId")
    private String userId = null;

    @SerializedName("mobNo")
    private String mobNo = null;

    @SerializedName("email")
    private String email = null;

    @SerializedName("password")
    private String password = null;

    public LoginRequestBody() {
    }

    public LoginRequestBody(String userId, String email, String mobNo, String password) {
        this.userId = userId;
        this.email = email;
        this.mobNo = mobNo;
        this.password = password;
    }


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LoginRequestBody that = (LoginRequestBody) o;
        return Objects.equals(userId, that.userId) && Objects.equals(mobNo, that.mobNo) && Objects.equals(email, that.email) && Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, mobNo, email, password);
    }

    @Override
    public String toString() {
        return "LoginRequestBody{" +
                "userId='" + userId + '\'' +
                ", mobNo='" + mobNo + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
