package com.arihant.client.api.details;

import com.arihant.client.*;
import com.arihant.client.constants.Constants;
import com.arihant.client.model.details.ProfitLossCashReportRequest;
import com.arihant.client.model.details.ProfitLossCashReportResponse;
import com.arihant.client.model.details.ProfitLossFoReportRequest;
import com.arihant.client.model.details.ProfitLossFoReportResponse;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProfitLossReportApi {
    private final Constants constants;
    private ApiClient apiClient;

    public ProfitLossReportApi(Constants constants) {
        this(constants, Configuration.getDefaultApiClient());
    }

    public ProfitLossReportApi(Constants constants, ApiClient apiClient) {
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
     * Build call for profitLossReport
     *
     * @param body (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call profitLossCashReportCall(ProfitLossCashReportRequest body, Map<String, String> propertiesMap) throws ApiException {

        // create path and map variables
        String localVarPath = constants.getEndPoints().get("profitLossCashReport");

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

    private com.squareup.okhttp.Call profitLossCashReportValidateBeforeCall(ProfitLossCashReportRequest body, Map<String, String> propertiesMap) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling profitLossCashReport(Async)");
        }

        return profitLossCashReportCall(body, propertiesMap);
    }

    /**
     * ProfitLossReportAPI
     *
     * @param body (required)
     * @return ProfitLossSuccess
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ProfitLossCashReportResponse profitLossCashReport(ProfitLossCashReportRequest body, Map<String, String> propertiesMap) throws ApiException {
        ApiResponse<ProfitLossCashReportResponse> resp = profitLossCashReportWithHttpInfo(body, propertiesMap);
        return resp.getData();
    }

    /**
     * ProfitLossReportAPI
     *
     * @param body (required)
     * @return ApiResponse&lt;ProfitLossSuccess&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ProfitLossCashReportResponse> profitLossCashReportWithHttpInfo(ProfitLossCashReportRequest body, Map<String, String> propertiesMap) throws ApiException {
        com.squareup.okhttp.Call call = profitLossCashReportValidateBeforeCall(body, propertiesMap);
        Type localVarReturnType = new TypeToken<ProfitLossCashReportResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    //ProfitLossFoReport
    public com.squareup.okhttp.Call profitLossFoReportCall(ProfitLossFoReportRequest body, Map<String, String> propertiesMap) throws ApiException {

        // create path and map variables
        String localVarPath = constants.getEndPoints().get("profitLossFoReport");

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

    private com.squareup.okhttp.Call profitLossFoReportValidateBeforeCall(ProfitLossFoReportRequest body, Map<String, String> propertiesMap) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling profitLossFoReport(Async)");
        }
        return profitLossFoReportCall(body, propertiesMap);
    }

    /**
     * ProfitLossReportAPI
     *
     * @param body (required)
     * @return ProfitLossSuccess
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ProfitLossFoReportResponse profitLossFoReport(ProfitLossFoReportRequest body, Map<String, String> propertiesMap) throws ApiException {
        ApiResponse<ProfitLossFoReportResponse> resp = profitLossFoReportWithHttpInfo(body, propertiesMap);
        return resp.getData();
    }

    /**
     * ProfitLossReportAPI
     *
     * @param body (required)
     * @return ApiResponse&lt;ProfitLossSuccess&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ProfitLossFoReportResponse> profitLossFoReportWithHttpInfo(ProfitLossFoReportRequest body, Map<String, String> propertiesMap) throws ApiException {
        com.squareup.okhttp.Call call = profitLossFoReportValidateBeforeCall(body, propertiesMap);
        Type localVarReturnType = new TypeToken<ProfitLossFoReportResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }
}
