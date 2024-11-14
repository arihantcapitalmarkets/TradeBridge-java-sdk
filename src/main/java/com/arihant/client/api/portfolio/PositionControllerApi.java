package com.arihant.client.api.portfolio;

import com.arihant.client.*;
import com.arihant.client.constants.Constants;
import com.arihant.client.model.portfolio.HoldingResponse;
import com.arihant.client.model.portfolio.PositionBookResponse;
import com.arihant.client.model.portfolio.PositionConversionRequest;
import com.arihant.client.model.portfolio.PositionConversionResponse;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PositionControllerApi {
    private ApiClient apiClient;
    private final Constants constants;

    public PositionControllerApi(Constants constants) {
        this(Configuration.getDefaultApiClient(), constants);
    }

    public PositionControllerApi(ApiClient apiClient, Constants constants) {
        this.apiClient = apiClient;
        this.constants = constants;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for convertPosition
     *
     * @param body (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call convertPositionCall(PositionConversionRequest body, Map<String, String> propertiesMap) throws ApiException {

        // create path and map variables
        String localVarPath = constants.getEndPoints().get("convertPosition");

        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath(propertiesMap.get("baseURL"));

        if (localVarPath == null || apiClient.getBasePath() == null) {
            throw new ApiException("Properties file issue");
        }

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

    private com.squareup.okhttp.Call convertPositionValidateBeforeCall(PositionConversionRequest body, Map<String, String> propertiesMap) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling convertPosition(Async)");
        }
        return convertPositionCall(body, propertiesMap);
    }

    /**
     * Position Conversion
     * This endpoint allow user to convert positions
     *
     * @param body (required)
     * @return PositionConversionResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PositionConversionResponse convertPosition(PositionConversionRequest body, Map<String, String> propertiesMap) throws ApiException {
        ApiResponse<PositionConversionResponse> resp = convertPositionWithHttpInfo(body, propertiesMap);
        return resp.getData();
    }

    /**
     * Position Conversion
     * This endpoint allow user to convert positions
     *
     * @param body (required)
     * @return ApiResponse&lt;PositionConversionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PositionConversionResponse> convertPositionWithHttpInfo(PositionConversionRequest body, Map<String, String> propertiesMap) throws ApiException {
        com.squareup.okhttp.Call call = convertPositionValidateBeforeCall(body, propertiesMap);
        Type localVarReturnType = new TypeToken<PositionConversionResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Build call for doHoldings
     *
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call doHoldingsCall(Map<String, String> propertiesMap) throws ApiException {
        // create path and map variables
        String localVarPath = constants.getEndPoints().get("doHoldings");

        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath(propertiesMap.get("baseURL"));

        if (localVarPath == null || apiClient.getBasePath() == null) {
            throw new ApiException("Properties file issue");
        }

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

        String[] localVarAuthNames = new String[]{};
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, null, localVarHeaderParams, localVarFormParams, localVarAuthNames, null);
    }

    private com.squareup.okhttp.Call doHoldingsValidateBeforeCall(Map<String, String> propertiesMap) throws ApiException {

        return doHoldingsCall(propertiesMap);
    }

    /**
     * Holdings
     * This endpoint allow user to view holdings
     *
     * @return HoldingResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public HoldingResponse doHoldings(Map<String, String> propertiesMap) throws ApiException {
        ApiResponse<HoldingResponse> resp = doHoldingsWithHttpInfo(propertiesMap);
        return resp.getData();
    }

    /**
     * Holdings
     * This endpoint allow user to view holdings
     *
     * @return ApiResponse&lt;HoldingResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<HoldingResponse> doHoldingsWithHttpInfo(Map<String, String> propertiesMap) throws ApiException {
        com.squareup.okhttp.Call call = doHoldingsValidateBeforeCall(propertiesMap);
        Type localVarReturnType = new TypeToken<HoldingResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Build call for getPositionBook
     *
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getPositionBookCall(List<Pair> queryParams, Map<String, String> propertiesMap) throws ApiException {
        // create path and map variables
        String localVarPath = constants.getEndPoints().get("positionBook");

        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath(propertiesMap.get("baseURL"));

        if (localVarPath == null || apiClient.getBasePath() == null) {
            throw new ApiException("Properties file issue");
        }

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

        String[] localVarAuthNames = new String[]{};
        return apiClient.buildCall(localVarPath, "GET", queryParams, localVarCollectionQueryParams, null, localVarHeaderParams, localVarFormParams, localVarAuthNames, null);
    }

    private com.squareup.okhttp.Call getPositionBookValidateBeforeCall(List<Pair> queryParams, Map<String, String> propertiesMap) throws ApiException {

        return getPositionBookCall(queryParams, propertiesMap);
    }

    /**
     * Position Book
     * This endpoint allow user to view positions
     *
     * @return PositionBookResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PositionBookResponse getPositionBook(List<Pair> queryParams, Map<String, String> propertiesMap) throws ApiException {
        ApiResponse<PositionBookResponse> resp = getPositionBookWithHttpInfo(queryParams, propertiesMap);
        return resp.getData();
    }

    /**
     * Position Book
     * This endpoint allow user to view positions
     *
     * @return ApiResponse&lt;PositionBookResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PositionBookResponse> getPositionBookWithHttpInfo(List<Pair> queryParams, Map<String, String> propertiesMap) throws ApiException {
        com.squareup.okhttp.Call call = getPositionBookValidateBeforeCall(queryParams, propertiesMap);
        Type localVarReturnType = new TypeToken<PositionBookResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }
}
