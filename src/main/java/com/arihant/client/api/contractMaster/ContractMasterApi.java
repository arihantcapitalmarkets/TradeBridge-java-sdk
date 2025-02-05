package com.arihant.client.api.contractMaster;

import com.arihant.client.*;
import com.arihant.client.constants.Constants;
import com.arihant.client.model.login.SuccessResponse;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContractMasterApi {
    private final Constants constants;
    private final ApiClient apiClient;

    public ContractMasterApi(Constants constants, ApiClient apiClient) {
        this.constants = constants;
        this.apiClient = apiClient;
    }

    public ContractMasterApi(Constants constants) {
        this(constants, Configuration.getDefaultApiClient());
    }

    public com.squareup.okhttp.Call contractMasterCall(Map<String, String> propertiesMap, String exch) throws ApiException {
        // create path and map variables
        String localVarPath = constants.getEndPoints().get("contractMaster");

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

        localVarQueryParams.add(new Pair("exch", exch));

        String[] localVarAuthNames = new String[]{};
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, null, localVarHeaderParams, localVarFormParams, localVarAuthNames, null);
    }

    private com.squareup.okhttp.Call contractMasterValidateBeforeCall(Map<String, String> propertiesMap, String exch) throws ApiException {
        return contractMasterCall(propertiesMap, exch);
    }

    /**
     * FundViewAPI
     *
     * @return FundsSuccess
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SuccessResponse contractMaster(Map<String, String> propertiesMap, String exch) throws ApiException {
        ApiResponse<SuccessResponse> resp = contractMasterWithHttpInfo(propertiesMap, exch);
        return resp.getData();
    }

    /**
     * FundViewAPI
     *
     * @return ApiResponse&lt;FundsSuccess&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SuccessResponse> contractMasterWithHttpInfo(Map<String, String> propertiesMap, String exch) throws ApiException {
        com.squareup.okhttp.Call call = contractMasterValidateBeforeCall(propertiesMap, exch);
        Type localVarReturnType = new TypeToken<SuccessResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

}
