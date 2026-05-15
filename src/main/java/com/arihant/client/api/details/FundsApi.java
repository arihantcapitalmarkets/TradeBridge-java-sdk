package com.arihant.client.api.details;

import com.arihant.client.*;
import com.arihant.client.constants.Constants;
import com.arihant.client.model.details.*;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FundsApi {
    private final Constants constants;
    private ApiClient apiClient;

    public FundsApi(Constants constants) {
        this(constants, Configuration.getDefaultApiClient());
    }

    public FundsApi(Constants constants, ApiClient apiClient) {
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
     * Build call for fundView
     *
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call fundViewCall(Map<String, String> propertiesMap) throws ApiException {
        // create path and map variables
        String localVarPath = constants.getEndPoints().get("funds");

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

        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.putAll(constants.getHeaders());

        localVarQueryParams.add(new Pair("segment", "ALL"));

        String[] localVarAuthNames = new String[]{};
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, null, localVarHeaderParams, localVarFormParams, localVarAuthNames, null);
    }

    private com.squareup.okhttp.Call fundViewValidateBeforeCall(Map<String, String> propertiesMap) throws ApiException {
        return fundViewCall(propertiesMap);
    }

    /**
     * FundViewAPI
     *
     * @return FundsSuccess
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FundsSuccess fundView(Map<String, String> propertiesMap) throws ApiException {
        ApiResponse<FundsSuccess> resp = fundViewWithHttpInfo(propertiesMap);
        return resp.getData();
    }

    /**
     * FundViewAPI
     *
     * @return ApiResponse&lt;FundsSuccess&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<FundsSuccess> fundViewWithHttpInfo(Map<String, String> propertiesMap) throws ApiException {
        com.squareup.okhttp.Call call = fundViewValidateBeforeCall(propertiesMap);
        Type localVarReturnType = new TypeToken<FundsSuccess>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    //CheckMargin
    public com.squareup.okhttp.Call checkMarginCall(CheckMarginRequest body, Map<String, String> propertiesMap) throws ApiException {

        // create path and map variables
        String localVarPath = constants.getEndPoints().get("checkMargin");

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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, body, localVarHeaderParams, localVarFormParams, localVarAuthNames, null);
    }

    private com.squareup.okhttp.Call checkMarginValidateBeforeCall(CheckMarginRequest body, Map<String, String> propertiesMap) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling checkMargin(Async)");
        }

        return checkMarginCall(body, propertiesMap);
    }


    public CheckMarginResponse checkMargin(CheckMarginRequest body, Map<String, String> propertiesMap) throws ApiException {
        ApiResponse<CheckMarginResponse> resp = checkMarginWithHttpInfo(body, propertiesMap);
        return resp.getData();
    }


    public ApiResponse<CheckMarginResponse> checkMarginWithHttpInfo(CheckMarginRequest body, Map<String, String> propertiesMap) throws ApiException {
        com.squareup.okhttp.Call call = checkMarginValidateBeforeCall(body, propertiesMap);
        Type localVarReturnType = new TypeToken<CheckMarginResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

}
