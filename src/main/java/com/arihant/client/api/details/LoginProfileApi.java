package com.arihant.client.api.details;

import com.arihant.client.*;
import com.arihant.client.constants.Constants;
import com.arihant.client.model.details.GetProfileRequest;
import com.arihant.client.model.details.GetProfileSuccess;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoginProfileApi {
    private final Constants constants;
    private ApiClient apiClient;

    public LoginProfileApi(Constants constants) {
        this(constants, Configuration.getDefaultApiClient());
    }

    public LoginProfileApi(Constants constants, ApiClient apiClient) {
        this.constants = constants;
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getProfile
     *
     * @param body (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getProfileCall(GetProfileRequest body, Map<String, String> propertiesMap) throws ApiException {
        // create path and map variables
        String localVarPath = constants.getEndPoints().get("getProfile");

        apiClient.setBasePath(propertiesMap.get("baseURL"));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
                "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
                "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.putAll(constants.getHeaders());

        String[] localVarAuthNames = new String[]{};
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, body, localVarHeaderParams, localVarFormParams, localVarAuthNames, null);
    }

    private com.squareup.okhttp.Call getProfileValidateBeforeCall(GetProfileRequest body, Map<String, String> propertiesMap) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling getProfile(Async)");
        }

        return getProfileCall(body, propertiesMap);
    }

    /**
     * Get ProfileAPI
     *
     * @param body (required)
     * @return GetProfileSuccess
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetProfileSuccess getProfile(GetProfileRequest body, Map<String, String> propertiesMap) throws ApiException {
        ApiResponse<GetProfileSuccess> resp = getProfileWithHttpInfo(body, propertiesMap);
        return resp.getData();
    }

    /**
     * Get ProfileAPI
     *
     * @param body (required)
     * @return ApiResponse&lt;GetProfileSuccess &gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetProfileSuccess> getProfileWithHttpInfo(GetProfileRequest body, Map<String, String> propertiesMap) throws ApiException {
        com.squareup.okhttp.Call call = getProfileValidateBeforeCall(body, propertiesMap);
        Type localVarReturnType = new TypeToken<GetProfileSuccess>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }
}
