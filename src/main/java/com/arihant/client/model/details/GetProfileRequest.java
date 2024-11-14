package com.arihant.client.model.details;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * GetProfileRequest
 */

public class GetProfileRequest {
    @SerializedName("data")
    private GetProfileRequestData data = null;

    @SerializedName("appID")
    private String appID = null;

    public GetProfileRequest data(GetProfileRequestData data) {
        this.data = data;
        return this;
    }

    /**
     * Get data
     *
     * @return data
     **/
    @Schema(description = "")
    public GetProfileRequestData getData() {
        return data;
    }

    public void setData(GetProfileRequestData data) {
        this.data = data;
    }

    public GetProfileRequest appID(String appID) {
        this.appID = appID;
        return this;
    }

    /**
     * Get appID
     *
     * @return appID
     **/
    @Schema(example = "2354365476768", description = "")
    public String getAppID() {
        return appID;
    }

    public void setAppID(String appID) {
        this.appID = appID;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetProfileRequest getProfileRequest = (GetProfileRequest) o;
        return Objects.equals(this.data, getProfileRequest.data) &&
                Objects.equals(this.appID, getProfileRequest.appID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, appID);
    }


    @Override
    public String toString() {

        return "class GetProfileRequest {\n" +
                "    data: " + toIndentedString(data) + "\n" +
                "    appID: " + toIndentedString(appID) + "\n" +
                "}";
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
