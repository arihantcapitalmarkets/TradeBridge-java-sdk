package com.arihant.client.constants;

import com.arihant.client.interfaces.ConstantsInterface;

import java.util.HashMap;
import java.util.Map;

public class Constants implements ConstantsInterface {
    public Map<String, String> headers = new HashMap<>();

    public Map<String, String> getHeaders() {
        if (!getApiKey().isEmpty() && !getAuthString().isEmpty() && !getSource().isEmpty()) {
            this.headers.put("api-key", getApiKey());
            this.headers.put("Authorization", "Bearer " + getAuthString());
            this.headers.put("source", getSource());
        }
        return headers;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

    public Map<String, String> endPoints = new HashMap<>();

    public Map<String, String> getEndPoints() {
        return endPoints;
    }

    public String source = "";

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String authString = "";

    public String getAuthString() {
        return authString;
    }

    public void setAuthString(String authString) {
        this.authString = authString;
    }

    public String apiKey = "";

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }


    public Constants() {
        // End Points
        this.endPoints.put("login", "/auth-services/api/auth/v1/login");
        this.endPoints.put("verify-otp", "/auth-services/api/auth/v1/verify-otp");
        this.endPoints.put("resend-otp", "/auth-services/api/auth/v1/resend-otp");
        this.endPoints.put("refreshToken", "/auth-services/api/auth/v1/refresh-token");
        this.endPoints.put("logout", "/auth-services/api/auth/v1/logout");

        this.endPoints.put("contractMaster", "/wrapper-service/api/symbol/v1/master/cache");
        this.endPoints.put("getProfile", "/wrapper-service/api/user/v1/get-profile");
        this.endPoints.put("funds", "/wrapper-service/api/funds/v1/get-funds");

        this.endPoints.put("placeOrder", "/wrapper-service/api/order/v1/place-order");
        this.endPoints.put("modifyOrder", "/wrapper-service/api/order/v1/modify-order");
        this.endPoints.put("exitOrder", "/wrapper-service/api/order/v1/exit-order");
        this.endPoints.put("cancelOrder", "/wrapper-service/api/order/v1/cancel-order");

        this.endPoints.put("brokerageCharges", "/wrapper-service/api/trade/v1/brokerage");
        this.endPoints.put("marginCalculator", "/wrapper-service/api/trade/v1/marginCalculator");

        this.endPoints.put("orderBook", "/wrapper-service/api/order/v1/order-book");
        this.endPoints.put("tradeBook", "/wrapper-service/api/order/v1/trade-book");
        this.endPoints.put("orderTrail", "/wrapper-service/api/order/v1/order-trail");
        this.endPoints.put("orderStatus", "/wrapper-service/api/order/v1/order-status");

        this.endPoints.put("positionBook", "/wrapper-service/api/portfolio/v1/position-book");
        this.endPoints.put("convertPosition", "/wrapper-service/api/portfolio/v1/convert-position");
        this.endPoints.put("doHoldings", "/wrapper-service/api/portfolio/v1/holdings");

        this.endPoints.put("profitLossCashReport", "/wrapper-service/api/trade/v1/profit-loss-report");
        this.endPoints.put("profitLossFoReport", "/wrapper-service/api/trade/v1/profit-loss-fo-report");

        this.endPoints.put("historicalData", "/wrapper-service/api/chart/v1/historical-candle-data");
        this.endPoints.put("intradayData", "/wrapper-service/api/chart/v1/intraday-candle-data");

    }
}
