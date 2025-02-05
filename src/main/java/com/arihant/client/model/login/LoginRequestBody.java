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

    @SerializedName("password")
    private String password = null;


    public LoginRequestBody userId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * The user ID
     *
     * @return userId
     **/
    @Schema(description = "The user ID")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public LoginRequestBody password(String password) {
        this.password = password;
        return this;
    }

    /**
     * The user&#x27;s password
     *
     * @return password
     **/
    @Schema(description = "The user's password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LoginRequestBody loginNormalloginRequestBody = (LoginRequestBody) o;
        return Objects.equals(this.userId, loginNormalloginRequestBody.userId) &&
                Objects.equals(this.password, loginNormalloginRequestBody.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, password);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LoginNormalloginBody {\n");

        sb.append("userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("password: ").append(toIndentedString(password)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return null;
        }
        return o.toString().replace("\n", "\n    ");
    }

}
