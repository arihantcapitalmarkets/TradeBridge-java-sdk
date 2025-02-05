package com.arihant.client.api.login;

import com.arihant.client.*;
import com.arihant.client.constants.Constants;
import com.arihant.client.model.login.*;
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
    private Call loginPostCall(LoginRequestBody body, Map<String, String> propertiesMap) throws ApiException {

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
        localVarHeaderParams.put("api-key", constants.apiKey);
        localVarHeaderParams.put("source", constants.source);

        String[] localVarAuthNames = new String[]{};
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, body, localVarHeaderParams, localVarFormParams, localVarAuthNames, null);
    }

    private Call loginPostValidateBeforeCall(LoginRequestBody body, Map<String, String> propertiesMap) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling authApiV1LoginNormalLoginPost(Async)");
        }

        return loginPostCall(body, propertiesMap);
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
            LoginRequestBody body,
            Map<String, String> propertiesMap
    ) throws ApiException {
        ApiResponse<LoginResponse> resp = loginPostWithHttpInfo(body, propertiesMap);
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
            LoginRequestBody body,
            Map<String, String> propertiesMap
    ) throws ApiException {
        Call call = loginPostValidateBeforeCall(body, propertiesMap);
        Type localVarReturnType = new TypeToken<LoginResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    //Verify-Otp
    public VerifyOtpResponse verifyOtp(VerifyOtpRequest body, Map<String, String> propertiesMap) throws ApiException {
        ApiResponse<VerifyOtpResponse> resp = verifyOtpWithHttpInfo(body, propertiesMap);
        return resp.getData();
    }


    public ApiResponse<VerifyOtpResponse> verifyOtpWithHttpInfo(VerifyOtpRequest body, Map<String, String> propertiesMap) throws ApiException {
        com.squareup.okhttp.Call call = verifyOtpValidateBeforeCall(body, propertiesMap);
        Type localVarReturnType = new TypeToken<VerifyOtpResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    private com.squareup.okhttp.Call verifyOtpValidateBeforeCall(VerifyOtpRequest body, Map<String, String> propertiesMap) throws ApiException {
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling verifyOtp(Async)");
        }
        return verifyOtpCall(body, propertiesMap);
    }

    public com.squareup.okhttp.Call verifyOtpCall(VerifyOtpRequest body, Map<String, String> propertiesMap) throws ApiException {
        // create path and map variables
        String localVarPath = constants.getEndPoints().get("verify-otp");

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
        localVarHeaderParams.put("api-key", constants.apiKey);
        localVarHeaderParams.put("source", constants.source);

        String[] localVarAuthNames = new String[]{};
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, body, localVarHeaderParams, localVarFormParams, localVarAuthNames, null);
    }

    //Resend-Otp
    public LoginResponse resendOtp(ResendOtpRequest body, Map<String, String> propertiesMap) throws ApiException {
        ApiResponse<LoginResponse> resp = resendOtpWithHttpInfo(body, propertiesMap);
        return resp.getData();
    }


    public ApiResponse<LoginResponse> resendOtpWithHttpInfo(ResendOtpRequest body, Map<String, String> propertiesMap) throws ApiException {
        com.squareup.okhttp.Call call = resendOtpValidateBeforeCall(body, propertiesMap);
        Type localVarReturnType = new TypeToken<LoginResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    private com.squareup.okhttp.Call resendOtpValidateBeforeCall(ResendOtpRequest body, Map<String, String> propertiesMap) throws ApiException {
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling resendOtp(Async)");
        }
        return resendOtpCall(body, propertiesMap);
    }

    public com.squareup.okhttp.Call resendOtpCall(ResendOtpRequest body, Map<String, String> propertiesMap) throws ApiException {
        // create path and map variables
        String localVarPath = constants.getEndPoints().get("resend-otp");

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
        localVarHeaderParams.put("api-key", constants.apiKey);
        localVarHeaderParams.put("source", constants.source);

        String[] localVarAuthNames = new String[]{};
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, body, localVarHeaderParams, localVarFormParams, localVarAuthNames, null);
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
        localVarHeaderParams.put("api-key", constants.apiKey);
        localVarHeaderParams.put("source", constants.source);

        String[] localVarAuthNames = new String[]{};
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, body, localVarHeaderParams, localVarFormParams, localVarAuthNames, null);
    }

    //Logout
    public SuccessResponse logout(Map<String, String> propertiesMap) throws ApiException {
        ApiResponse<SuccessResponse> resp = logoutWithHttpInfo(propertiesMap);
        return resp.getData();
    }


    public ApiResponse<SuccessResponse> logoutWithHttpInfo(Map<String, String> propertiesMap) throws ApiException {
        com.squareup.okhttp.Call call = logoutValidateBeforeCall(propertiesMap);
        Type localVarReturnType = new TypeToken<SuccessResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    private com.squareup.okhttp.Call logoutValidateBeforeCall(Map<String, String> propertiesMap) throws ApiException {
        return logoutCall(propertiesMap);
    }

    public com.squareup.okhttp.Call logoutCall(Map<String, String> propertiesMap) throws ApiException {
        // create path and map variables
        String localVarPath = constants.getEndPoints().get("logout");

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

}
