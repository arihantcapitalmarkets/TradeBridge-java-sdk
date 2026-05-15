package com.arihant.client.api.contractMaster;

import com.arihant.client.*;
import com.arihant.client.constants.Constants;
import com.arihant.client.model.contractMaster.ContractMasterResponse;
import com.arihant.client.model.contractMaster.SurvSymbolsResponse;
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

    public ContractMasterApi(Constants constants) {this(constants, Configuration.getDefaultApiClient());
    }

    public com.squareup.okhttp.Call contractMasterCall(Map<String, String> propertiesMap,  String exch) throws ApiException {
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

        localVarQueryParams.add(new Pair("exch", exch));

        String[] localVarAuthNames = new String[]{};
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, null, localVarHeaderParams, localVarFormParams, localVarAuthNames, null);
    }

    private com.squareup.okhttp.Call contractMasterValidateBeforeCall(Map<String, String> propertiesMap, String exch) throws ApiException {
        return contractMasterCall(propertiesMap, exch);
    }

    public ContractMasterResponse contractMaster(Map<String, String> propertiesMap, String exch) throws ApiException {
        ApiResponse<ContractMasterResponse> resp = contractMasterWithHttpInfo(propertiesMap, exch);
        return resp.getData();
    }

    public ApiResponse<ContractMasterResponse> contractMasterWithHttpInfo(Map<String, String> propertiesMap, String exch) throws ApiException {
        com.squareup.okhttp.Call call = contractMasterValidateBeforeCall(propertiesMap, exch);
        Type localVarReturnType = new TypeToken<ContractMasterResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }


    //Surveillance Symbols
    public com.squareup.okhttp.Call survSymbolsCall(Map<String, String> propertiesMap) throws ApiException {
        // create path and map variables
        String localVarPath = constants.getEndPoints().get("surveillanceSymbols");

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

        String[] localVarAuthNames = new String[]{};
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, null, localVarHeaderParams, localVarFormParams, localVarAuthNames, null);
    }

    private com.squareup.okhttp.Call survSymbolsBeforeCall(Map<String, String> propertiesMap) throws ApiException {
        return survSymbolsCall(propertiesMap);
    }

    public SurvSymbolsResponse survSymbols(Map<String, String> propertiesMap) throws ApiException {
        ApiResponse<SurvSymbolsResponse> resp = survSymbolsWithHttpInfo(propertiesMap);
        return resp.getData();
    }

    public ApiResponse<SurvSymbolsResponse> survSymbolsWithHttpInfo(Map<String, String> propertiesMap) throws ApiException {
        com.squareup.okhttp.Call call = survSymbolsBeforeCall(propertiesMap);
        Type localVarReturnType = new TypeToken<SurvSymbolsResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }
}
