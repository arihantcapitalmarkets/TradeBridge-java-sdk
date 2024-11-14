package com.arihant.client.model.login;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * LoginResponse Body
 */

public class LoginResponse {
    @SerializedName("infoID")
    private String infoID = null;

    @SerializedName("infoMsg")
    private String infoMsg = null;

    @SerializedName("data")
    private Data data = null;

    @SerializedName("timestamp")
    private Long timestamp = null;

    public LoginResponse infoID(String infoID) {
        this.infoID = infoID;
        return this;
    }

    /**
     * Status code
     *
     * @return code
     **/
    @Schema(description = "Status code")
    public String getInfoID() {
        return infoID;
    }

    public void setInfoID(String infoID) {
        this.infoID = infoID;
    }

    public LoginResponse infoMsg(String infoMsg) {
        this.infoMsg = infoMsg;
        return this;
    }

    /**
     * Message indicating the status of the request
     *
     * @return message
     **/
    @Schema(description = "Message indicating the status of the request")
    public String getInfoMsg() {
        return infoMsg;
    }

    public void setInfoMsg(String infoMsg) {
        this.infoMsg = infoMsg;
    }

    public LoginResponse data(Data data) {
        this.data = data;
        return this;
    }

    /**
     * Data returned after successful login
     *
     * @return data
     **/
    @Schema(description = "Data returned after successful login")
    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public LoginResponse timestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Timestamp of the response
     *
     * @return timestamp
     **/
    @Schema(description = "Timestamp of the response")
    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LoginResponse inlineResponse200 = (LoginResponse) o;
        return Objects.equals(this.infoID, inlineResponse200.infoID) &&
                Objects.equals(this.infoMsg, inlineResponse200.infoMsg) &&
                Objects.equals(this.data, inlineResponse200.data) &&
                Objects.equals(this.timestamp, inlineResponse200.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(infoID, infoMsg, data, timestamp);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LoginResponse {\n");

        sb.append("infoID: ").append(toIndentedString(infoID)).append("\n");
        sb.append("infoMsg: ").append(toIndentedString(infoMsg)).append("\n");
        sb.append("timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append(" data: ").append("{").append("\n");
        sb.append("   accessToken: ").append(toIndentedString(data.getAccessToken())).append("\n");
        sb.append("   userName: ").append(toIndentedString(data.getUserName())).append("\n");
        sb.append("   appId: ").append(toIndentedString(data.getAppId())).append("\n");
        sb.append("   redirectUrl: ").append(toIndentedString(data.getRedirectUrl())).append("\n");
        sb.append("   refreshToken: ").append(toIndentedString(data.getRefreshToken())).append("\n");
        sb.append("   tokenExpiry: ").append(toIndentedString(data.getTokenExpiry())).append("\n");
        sb.append(" }").append("\n");
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
