package com.arihant.client.api.marginCalculator;

import com.arihant.client.*;
import com.arihant.client.constants.Constants;
import com.arihant.client.model.marginCalculator.MarginCalculatorRequest;
import com.arihant.client.model.marginCalculator.MarginCalculatorResponse;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MarginCalculatorApi {
    private final Constants constants;
    private final ApiClient apiClient;

    public MarginCalculatorApi(Constants constants, ApiClient apiClient) {
        this.constants = constants;
        this.apiClient = apiClient;
    }

    public MarginCalculatorApi(Constants constants) {
        this(constants, Configuration.getDefaultApiClient());
    }

    public com.squareup.okhttp.Call marginCalculatorCall(MarginCalculatorRequest body, Map<String, String> propertiesMap) throws ApiException {

        // create path and map variables
        String localVarPath = constants.getEndPoints().get("marginCalculator");

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

    private com.squareup.okhttp.Call marginCalculatorValidateBeforeCall(MarginCalculatorRequest body, Map<String, String> propertiesMap) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling marginCalculator(Async)");
        }
        return marginCalculatorCall(body, propertiesMap);
    }


    public MarginCalculatorResponse marginCalculator(MarginCalculatorRequest body, Map<String, String> propertiesMap) throws ApiException {
        ApiResponse<MarginCalculatorResponse> resp = marginCalculatorWithHttpInfo(body, propertiesMap);
        return resp.getData();
    }


    public ApiResponse<MarginCalculatorResponse> marginCalculatorWithHttpInfo(MarginCalculatorRequest body, Map<String, String> propertiesMap) throws ApiException {
        com.squareup.okhttp.Call call = marginCalculatorValidateBeforeCall(body, propertiesMap);
        Type localVarReturnType = new TypeToken<MarginCalculatorResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }
}
