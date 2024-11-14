package com.arihant.client.api.login;

import com.arihant.client.*;
import com.arihant.client.constants.Constants;
import com.arihant.client.model.login.LoginBody;
import com.arihant.client.model.login.LoginResponse;
import com.arihant.client.model.login.RefreshTokenRequest;
import com.arihant.client.model.login.RefreshTokenResponse;
import com.google.gson.reflect.TypeToken;
import com.squareup.okhttp.Call;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoginApi {
    private final Constants constants;
    private final ApiClient apiClient;

    public LoginApi(Constants constants) {
        this(constants, Configuration.getDefaultApiClient());
    }

    public LoginApi(Constants constants, ApiClient apiClient) {
        this.constants = constants;
        this.apiClient = apiClient;
    }

    /**
     * Build call for authApiV1LoginNormalLoginPost
     *
     * @param body (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call loginPostCall(LoginBody body, Map<String, String> propertiesMap, String apiKey) throws ApiException {

        // create path and map variables
        String localVarPath = constants.getEndPoints().get("login");
        apiClient.setBasePath(propertiesMap.get("baseURL"));

        if (apiClient.getBasePath() == null) {
            throw new ApiException("Properties file issue");
        }

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

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
        localVarHeaderParams.put("api-key", apiKey);
        localVarHeaderParams.put("source", "javasdk");

        String[] localVarAuthNames = new String[]{};
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, body, localVarHeaderParams, localVarFormParams, localVarAuthNames, null);
    }

    private Call loginPostValidateBeforeCall(LoginBody body, Map<String, String> propertiesMap, String apiKey) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling authApiV1LoginNormalLoginPost(Async)");
        }

        return loginPostCall(body, propertiesMap, apiKey);
    }

    /**
     * User Login
     * Endpoint to authenticate users
     *
     * @param body (required)
     * @return LoginResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LoginResponse loginPost(
            LoginBody body,
            Map<String, String> propertiesMap,
            String apiKey
    ) throws ApiException {
        ApiResponse<LoginResponse> resp = loginPostWithHttpInfo(body, propertiesMap, apiKey);
        return resp.getData();
    }

    /**
     * User Login
     * Endpoint to authenticate users
     *
     * @param body (required)
     * @return ApiResponse&lt;InlineResponse200&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    private ApiResponse<LoginResponse> loginPostWithHttpInfo(
            LoginBody body,
            Map<String, String> propertiesMap,
            String apiKey
    ) throws ApiException {
        Call call = loginPostValidateBeforeCall(body, propertiesMap, apiKey);
        Type localVarReturnType = new TypeToken<LoginResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    //RefreshToken

    public RefreshTokenResponse refreshToken(RefreshTokenRequest body, Map<String, String> propertiesMap) throws ApiException {
        ApiResponse<RefreshTokenResponse> resp = refreshTokenWithHttpInfo(body, propertiesMap);
        return resp.getData();
    }


    public ApiResponse<RefreshTokenResponse> refreshTokenWithHttpInfo(RefreshTokenRequest body, Map<String, String> propertiesMap) throws ApiException {
        com.squareup.okhttp.Call call = refreshTokenValidateBeforeCall(body, propertiesMap);
        Type localVarReturnType = new TypeToken<RefreshTokenResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    private com.squareup.okhttp.Call refreshTokenValidateBeforeCall(RefreshTokenRequest body, Map<String, String> propertiesMap) throws ApiException {
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling refreshToken(Async)");
        }

        return refreshTokenCall(body, propertiesMap);
    }

    public com.squareup.okhttp.Call refreshTokenCall(RefreshTokenRequest body, Map<String, String> propertiesMap) throws ApiException {
        // create path and map variables
        String localVarPath = constants.getEndPoints().get("refreshToken");

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
        localVarHeaderParams.put("source", "javasdk");

        String[] localVarAuthNames = new String[]{};
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, body, localVarHeaderParams, localVarFormParams, localVarAuthNames, null);
    }

}
