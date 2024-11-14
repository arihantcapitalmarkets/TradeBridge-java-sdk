package com.arihant.client.api.portfolio;

import com.arihant.client.*;
import com.arihant.client.constants.Constants;
import com.arihant.client.model.portfolio.OrderBookResponse;
import com.arihant.client.model.portfolio.OrderTrailRequest;
import com.arihant.client.model.portfolio.OrderTrailResponse;
import com.arihant.client.model.portfolio.TradeBookResponse;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TradeBookApi {
    private ApiClient apiClient;
    private final Constants constants;

    public TradeBookApi(Constants constants) {
        this(Configuration.getDefaultApiClient(), constants);
    }

    public TradeBookApi(ApiClient apiClient, Constants constants) {
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
     * Build call for getOrderBook
     *
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getOrderBookCall(Map<String, String> propertiesMap) throws ApiException {
        // create path and map variables
        String localVarPath = constants.getEndPoints().get("orderBook");

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

    private com.squareup.okhttp.Call getOrderBookValidateBeforeCall(Map<String, String> propertiesMap) throws ApiException {

        return getOrderBookCall(propertiesMap);
    }

    /**
     * Get orders
     * This endpoint allows users view orders
     *
     * @return OrderBookResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public OrderBookResponse getOrderBook(Map<String, String> propertiesMap) throws ApiException {
        ApiResponse<OrderBookResponse> resp = getOrderBookWithHttpInfo(propertiesMap);
        return resp.getData();
    }

    /**
     * Get orders
     * This endpoint allows users view orders
     *
     * @return ApiResponse&lt;OrderBookResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<OrderBookResponse> getOrderBookWithHttpInfo(Map<String, String> propertiesMap) throws ApiException {
        com.squareup.okhttp.Call call = getOrderBookValidateBeforeCall(propertiesMap);
        Type localVarReturnType = new TypeToken<OrderBookResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Build call for tradeBook
     *
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call tradeBookCall(Map<String, String> propertiesMap) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = constants.getEndPoints().get("tradeBook");

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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, null);
    }

    private com.squareup.okhttp.Call tradeBookValidateBeforeCall(Map<String, String> propertiesMap) throws ApiException {
        return tradeBookCall(propertiesMap);
    }

    /**
     * Trades
     * This endpoint allows users to view trades
     *
     * @return TradeBookResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TradeBookResponse tradeBook(Map<String, String> propertiesMap) throws ApiException {
        ApiResponse<TradeBookResponse> resp = tradeBookWithHttpInfo(propertiesMap);
        return resp.getData();
    }

    /**
     * Trades
     * This endpoint allows users to view trades
     * * @return ApiResponse&lt;TradeBookResponse&gt;
     *
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TradeBookResponse> tradeBookWithHttpInfo(Map<String, String> propertiesMap) throws ApiException {
        com.squareup.okhttp.Call call = tradeBookValidateBeforeCall(propertiesMap);
        Type localVarReturnType = new TypeToken<TradeBookResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    //Order Trail
    public OrderTrailResponse orderTrail(OrderTrailRequest body, Map<String, String> propertiesMap) throws ApiException {
        ApiResponse<OrderTrailResponse> resp = orderTrailWithHttpInfo(body, propertiesMap);
        return resp.getData();
    }


    public ApiResponse<OrderTrailResponse> orderTrailWithHttpInfo(OrderTrailRequest body, Map<String, String> propertiesMap) throws ApiException {
        com.squareup.okhttp.Call call = orderTrailValidateBeforeCall(body, propertiesMap);
        Type localVarReturnType = new TypeToken<OrderTrailResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    private com.squareup.okhttp.Call orderTrailValidateBeforeCall(OrderTrailRequest body, Map<String, String> propertiesMap) throws ApiException {
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling orderTrail(Async)");
        }
        return orderTrailCall(body, propertiesMap);
    }

    public com.squareup.okhttp.Call orderTrailCall(OrderTrailRequest body, Map<String, String> propertiesMap) throws ApiException {
        // create path and map variables
        String localVarPath = constants.getEndPoints().get("orderTrail");

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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, body, localVarHeaderParams, localVarFormParams, localVarAuthNames, null);
    }

    //Order Status
    public OrderTrailResponse orderStatus(OrderTrailRequest body, Map<String, String> propertiesMap) throws ApiException {
        ApiResponse<OrderTrailResponse> resp = orderStatusWithHttpInfo(body, propertiesMap);
        return resp.getData();
    }


    public ApiResponse<OrderTrailResponse> orderStatusWithHttpInfo(OrderTrailRequest body, Map<String, String> propertiesMap) throws ApiException {
        com.squareup.okhttp.Call call = orderStatusValidateBeforeCall(body, propertiesMap);
        Type localVarReturnType = new TypeToken<OrderTrailResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    private com.squareup.okhttp.Call orderStatusValidateBeforeCall(OrderTrailRequest body, Map<String, String> propertiesMap) throws ApiException {
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling orderStatus(Async)");
        }

        return orderStatusCall(body, propertiesMap);
    }

    public com.squareup.okhttp.Call orderStatusCall(OrderTrailRequest body, Map<String, String> propertiesMap) throws ApiException {
        // create path and map variables
        String localVarPath = constants.getEndPoints().get("orderStatus");

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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, body, localVarHeaderParams, localVarFormParams, localVarAuthNames, null);
    }
}
