package com.arihant.client.model.details;

import java.util.List;
import java.util.Objects;

/**
 * GetProfileSuccessData
 */

public class GetProfileSuccessData {
    private List<ProfileClientDtl> clientDtls = null;

    public List<ProfileClientDtl> getClientDtls() {
        return clientDtls;
    }

    public void setClientDtls(List<ProfileClientDtl> clientDtls) {
        this.clientDtls = clientDtls;
    }

    @Override
    public String toString() {
        return "GetProfileSuccessData{" +
                "clientDtls=" + clientDtls +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        GetProfileSuccessData that = (GetProfileSuccessData) o;
        return Objects.equals(clientDtls, that.clientDtls);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(clientDtls);
    }
}
