package com.arihant.client.example;

import com.arihant.client.ApiException;
import com.arihant.client.Pair;
import com.arihant.client.api.details.ChartApi;
import com.arihant.client.api.details.FundsApi;
import com.arihant.client.api.details.LoginProfileApi;
import com.arihant.client.api.details.ProfitLossReportApi;
import com.arihant.client.api.login.LoginApi;
import com.arihant.client.api.order.OrderControllerApi;
import com.arihant.client.api.portfolio.PositionControllerApi;
import com.arihant.client.api.portfolio.TradeBookApi;
import com.arihant.client.constants.Constants;
import com.arihant.client.model.details.*;
import com.arihant.client.model.login.LoginBody;
import com.arihant.client.model.login.LoginResponse;
import com.arihant.client.model.login.RefreshTokenRequest;
import com.arihant.client.model.orders.*;
import com.arihant.client.model.portfolio.OrderTrailRequest;
import com.arihant.client.model.portfolio.PositionConversionRequest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class Example {
    private static final String CONFIG_FILE_PATH = "src/main/resources/application.properties";

    private static Constants constants = new Constants();
    private String orderId;
    private String refreshToken;

    public String getParOrderId() {
        return parOrderId;
    }

    public void setParOrderId(String parOrderId) {
        this.parOrderId = parOrderId;
    }

    private String parOrderId;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Example(Constants constants) {
        Example.constants = constants;
    }

    public static Map<String, String> readProperties(String filePath) {
        Properties properties = new Properties();
        Map<String, String> propertyMap = new HashMap<>();

        try (FileInputStream fileInputStream = new FileInputStream(filePath)) {
            properties.load(fileInputStream);

            // Iterate through each property and add it to the map
            for (String key : properties.stringPropertyNames()) {
                String value = properties.getProperty(key);
                propertyMap.put(key, value);
            }
        } catch (IOException e) {
            System.out.println("exception : " + e);
        }

        return propertyMap;
    }

    public void login(LoginApi defaultAPI, Map<String, String> properties) throws ApiException {
        LoginBody body = new LoginBody();
        body.setPassword("Abcd@12341");
        body.setUserId("NEST8003");
        body.setMobileNumber("9642229195");

        constants.setApiKey("XNVFuVAF4ZTh39lVeH");
        LoginResponse loginResponse = defaultAPI.loginPost(body, properties, constants.apiKey);

        System.out.println("LoginResponse: " + loginResponse);
        String accessToken = loginResponse.getData().getAccessToken();
        refreshToken = loginResponse.getData().getRefreshToken();

        constants.setAuthString(accessToken);
    }

    public void refreshToken(LoginApi defaultAPI, Map<String, String> properties) throws ApiException {
        RefreshTokenRequest body = new RefreshTokenRequest();
        body.setRefreshToken(refreshToken);

        System.out.println("\n\nRefreshTokenResponse:  " + defaultAPI.refreshToken(body, properties));
    }


    public void getProfile(LoginProfileApi loginProfileApi, Map<String, String> properties) throws ApiException {
        GetProfileRequest request = new GetProfileRequest();
        GetProfileRequestData data = new GetProfileRequestData();
        request.setData(data);
        request.setAppID("1");

        System.out.println("\n\nGetProfileResponse: " + loginProfileApi.getProfile(request, properties));
    }

    public void funds(FundsApi fundsApi, Map<String, String> properties) throws ApiException {
        System.out.println("\n\nFundsResponse: " + fundsApi.fundView(properties));
    }

    public void placeOrder(OrderControllerApi orderApi, Map<String, String> properties) throws ApiException {
        PlaceOrderRequest body = new PlaceOrderRequest();
        body.setSymbol("ACC-EQ");
        body.setExcToken("532540");
        body.setOrdAction(PlaceOrderRequest.OrdActionEnum.BUY);
        body.setOrdValidity(PlaceOrderRequest.OrdValidityEnum.DAY);
        body.setOrdType(PlaceOrderRequest.OrdTypeEnum.MARKET);
        body.setPrdType(PlaceOrderRequest.PrdTypeEnum.DELIVERY);
        body.setQty(1);
        body.setTriggerPrice(0.0);
        body.setLimitPrice(0.0);
        body.setDisQty(0);
        body.setInstrument(PlaceOrderRequest.InstrumentEnum.STK);
        body.setExc(PlaceOrderRequest.ExcEnum.NSE);
        body.setLotSize(1);
        body.setAmo(false);
        body.setBuild("MOB");
        body.setBoStpLoss(0);
        body.setBoTgtPrice(0);
        body.setTrailingSL(0.0);

        String latitude = "5.666";
        String longitude = "";

        PlaceOrderResponse response = orderApi.placeOrder(body, properties, latitude, longitude);
        System.out.println("\n\nPlaceOrderResponse: " + response);
        orderId = response.getRespnseData().getOrdId();
    }

    public void brokerageChargeResponse(OrderControllerApi orderApi, Map<String, String> properties) throws ApiException {
        BrokerageChargeRequest requestBody = new BrokerageChargeRequest();
        requestBody.setSymbol("STK_TCS_EQ_NSE");
        requestBody.setExc(BrokerageChargeRequest.ExcEnum.NSE);
        requestBody.setProduct(BrokerageChargeRequest.ProductEnum.INTRADAY);
        requestBody.setTriggerPrice("");
        requestBody.setPrice("3489.80");
        requestBody.setQty("10000000");
        requestBody.setInstrument(BrokerageChargeRequest.InstrumentEnum.STK);
        requestBody.setOrderAction(BrokerageChargeRequest.OrderActionEnum.SELL);
        requestBody.setExcToken("11536");
        requestBody.setOrdType(BrokerageChargeRequest.OrdTypeEnum.fromValue("Market"));

        System.out.println("\n\nBrokerageChargesResponse: " + orderApi.brokerageCharges(requestBody, properties));
    }

    public void modifyOrder(OrderControllerApi orderApi, Map<String, String> properties) throws ApiException {
        ModifyOrderRequest requestBody = new ModifyOrderRequest();
        requestBody.setTriggerPrice(0.0);
        requestBody.setOrdType(ModifyOrderRequest.OrdTypeEnum.MARKET);
        requestBody.setPrdType(ModifyOrderRequest.PrdTypeEnum.CASH);
        requestBody.setInstrument(ModifyOrderRequest.InstrumentEnum.STK);
        requestBody.setExc(ModifyOrderRequest.ExcEnum.NSE);
        requestBody.setQty(5);
        requestBody.setLotSize(0);
        requestBody.setSymbol("ACC-EQ");
        requestBody.setOrdId(orderId);
        requestBody.setOrdAction(ModifyOrderRequest.OrdActionEnum.BUY);
        requestBody.limitPrice(192.55);
        requestBody.setDisQty(0);
        requestBody.setOrdValidity(ModifyOrderRequest.OrdValidityEnum.DAY);
        requestBody.setTradedQty(0);
        requestBody.setOrdValidityDays(0);
        requestBody.setExchangeToken("13528");
        requestBody.setAmo(false);

        String latitude = "4";
        String longitude = "9.888";
        System.out.println("\n\nModifyOrderResponse: " + orderApi.modifyOrder(requestBody, properties, latitude, longitude));
    }

    public void cancelOrder(OrderControllerApi orderApi, Map<String, String> properties) throws ApiException {
        CancelOrderRequest requestBody = new CancelOrderRequest();
        requestBody.setSymbol("ACC-EQ");
        requestBody.setOrdId(orderId);
        requestBody.setExc(CancelOrderRequest.ExcEnum.NSE);

        String latitude = "";
        String longitude = "0.77";

        System.out.println("\n\nCancelOrderResponse: " + orderApi.cancelOrder(requestBody, properties, latitude, longitude));
    }

    public void exitOrder(OrderControllerApi orderApi, Map<String, String> properties) throws ApiException {
        ExitOrderRequest requestBody = new ExitOrderRequest();
        requestBody.setBoOrdStatus("complete");
        requestBody.setSymbol("ACC-EQ");
        requestBody.setOrdId(orderId);
        requestBody.setParOrdId(orderId);
        requestBody.setExc(ExitOrderRequest.ExcEnum.NSE);
        requestBody.setPrdType(ExitOrderRequest.PrdTypeEnum.COVER_ORDER);

        String latitude = "3.22";
        String longitude = "1.6666";
        System.out.println("\n\nExitOrderResponse: " + orderApi.exitOrder(requestBody, properties, latitude, longitude));
    }

    public void getTradeBook(TradeBookApi tradeBookApi, Map<String, String> properties) throws ApiException {
        System.out.println("\n\nTradeBookResponse: " + tradeBookApi.tradeBook(properties));
    }

    public void getOrderBook(TradeBookApi tradeBookAPI, Map<String, String> properties) throws ApiException {
        System.out.println("\n\nOrderBookResponse: " + tradeBookAPI.getOrderBook(properties));
    }

    public void orderTrail(TradeBookApi tradeBookApi, Map<String, String> properties) throws ApiException {
        OrderTrailRequest requestBody = new OrderTrailRequest();
        requestBody.setInstrument(OrderTrailRequest.InstrumentEnum.valueOf("STK"));
        requestBody.setOrdId("241114000000083");

        System.out.println("\n\nOrderTrailResponse: " + tradeBookApi.orderTrail(requestBody, properties));
    }

    public void orderStatus(TradeBookApi tradeBookApi, Map<String, String> properties) throws ApiException {
        OrderTrailRequest request = new OrderTrailRequest();
        request.setInstrument(OrderTrailRequest.InstrumentEnum.STK);
        request.setOrdId("241114000000083");

        System.out.println("\n\nOrderStatusResponse: " + tradeBookApi.orderStatus(request, properties));
    }

    public void getPositionBook(PositionControllerApi positionControllerApi, Map<String, String> properties) throws ApiException {
        List<Pair> query = new ArrayList<>();
        query.add(new Pair("type", "net"));
        System.out.println("\n\nPositionBookResponse: " + positionControllerApi.getPositionBook(query, properties));
    }

    public void convertPosition(PositionControllerApi positionControllerApi, Map<String, String> properties) throws ApiException {
        PositionConversionRequest req = new PositionConversionRequest();
        req.setExc(PositionConversionRequest.ExcEnum.BSE);
        req.setExcToken("308");
        req.setInstrument(PositionConversionRequest.InstrumentEnum.OPTSTK);
        req.setId("STK_BAJAJHIND_EQ_NSE");
        req.setQty(2589);
        req.setSymbol("STK_BAJAJHIND_EQ_NSE");
        req.setLotSize(1);
        req.setOrdAction(PositionConversionRequest.OrdActionEnum.valueOf("SELL"));
        req.setPrdType(PositionConversionRequest.PrdTypeEnum.valueOf("DELIVERY"));
        req.setToPrdType(PositionConversionRequest.ToPrdTypeEnum.valueOf("INTRADAY"));
        req.setType("DAY1");
        System.out.println("\n\nConvertPositionResponse: " + positionControllerApi.convertPosition(req, properties));
    }


    public void doHoldings(PositionControllerApi positionControllerApi, Map<String, String> properties) throws ApiException {
        System.out.println("\n\nHoldingsResponse: " + positionControllerApi.doHoldings(properties));
    }

    public void profitLossCashReport(ProfitLossReportApi profitLossReportApi, Map<String, String> properties) throws ApiException {
        ProfitLossCashReportRequest requestBody = new ProfitLossCashReportRequest();
        List<ReportFilters> filters = new ArrayList<>();
        filters.add(new ReportFilters("date", "14/10/2024-14/11/2024"));
        filters.add(new ReportFilters("charges", "incCharges"));
        requestBody.setFilters(filters);

        System.out.println("\n\nProfitLossCashReportResponse:" + profitLossReportApi.profitLossCashReport(requestBody, properties));
    }

    public void profitLossFoReport(ProfitLossReportApi profitLossReportApi, Map<String, String> properties) throws ApiException {
        ProfitLossFoReportRequest requestBody = new ProfitLossFoReportRequest();
        List<ReportFilters> filters = new ArrayList<>();
        filters.add(new ReportFilters("date", "13/10/2024-13/11/2024"));
        filters.add(new ReportFilters("charges", "incCharges"));
        filters.add(new ReportFilters("exc", "ALL"));
        filters.add(new ReportFilters("finYear", "2023-2024"));
        requestBody.setFilters(filters);

        System.out.println("\n\nProfitLossFoResponse" + profitLossReportApi.profitLossFoReport(requestBody, properties));
    }

    public void historicalCandleData(ChartApi chartApi, Map<String, String> properties) throws ApiException {
        System.out.println("\n\nHistoricalCandleDataResponse :  " +
                chartApi.historicalData("STK_INOXGREEN_BE_NSE",
                        "1day",
                        "2023-02-01T17:55:00.000",
                        "2024-02-01T17:55:00.000",
                        OrderTrailRequest.InstrumentEnum.STK,
                        "NSE",
                        "12193_NSE",
                        properties
                )
        );

    }

    public void intradayCandleData(ChartApi chartApi, Map<String, String> properties) throws ApiException {
        IntradayCandleDataRequest request = new IntradayCandleDataRequest();
        IntradayData data = new IntradayData();
        data.setSymbol("STK_JIOFIN_EQ_NSE");
        data.setResolution("1day");
        data.setExchange(ModifyOrderRequest.ExcEnum.NSE);
        data.setInstrument(PlaceOrderRequest.InstrumentEnum.STK);
        data.setStartTime("2024-09-02T00:00:00.000");
        data.setEndTime("2024-09-02T15:00:00.000");
        request.setData(data);

        System.out.println("\n\nIntradayCandleDataResponse: " + chartApi.intraday(request, properties));
    }


    public static void main(String[] args) throws ApiException {
        System.out.println("started");
        Map<String, String> properties = readProperties(CONFIG_FILE_PATH);

        System.out.println("logging in");
        Example obj = new Example(constants);

        LoginApi loginApi = new LoginApi(constants);
        OrderControllerApi orderApi = new OrderControllerApi(constants);
        TradeBookApi tradeBookApi = new TradeBookApi(constants);
        PositionControllerApi positionControllerApi = new PositionControllerApi(constants);
        ProfitLossReportApi profitLossReportApi = new ProfitLossReportApi(constants);
        ChartApi chartApi = new ChartApi(constants);
        LoginProfileApi loginProfileApi = new LoginProfileApi(constants);
        FundsApi fundsApi = new FundsApi(constants);
        System.out.println("object created");

        // login
        obj.login(loginApi, properties);

        //refresh Token
        //obj.refreshToken(loginApi, properties);

        //get profile
        //obj.getProfile(loginProfileApi,properties);

        //funds
        //obj.funds(fundsApi,properties);

        // place order
        //obj.placeOrder(orderApi, properties);

        // modify Order
        //obj.modifyOrder(orderApi, properties);

        // cancel order
        //obj.cancelOrder(orderApi, properties);

        // exit order
        // obj.exitOrder(orderApi,properties);

        //Brokerage Charges
        //obj.brokerageChargeResponse(orderApi,properties);

        // trade book
        //obj.getTradeBook(tradeBookApi, properties);

        // order book
        //obj.getOrderBook(tradeBookApi, properties);

        //order trail
        //obj.orderTrail(tradeBookApi, properties);

        //order Status
        // obj.orderStatus(tradeBookApi,properties);

        // Holdings
        //obj.doHoldings(positionControllerApi,properties);

        // position book
        //obj.getPositionBook(positionControllerApi, properties);

        // convert position
        //obj.convertPosition(positionControllerApi,properties);

        // profit loss cash report
        // obj.profitLossCashReport(profitLossReportApi,properties);

        //profit loss fo report
        //obj.profitLossFoReport(profitLossReportApi,properties);

        //historical Data
        //obj.historicalCandleData(chartApi,properties);

        //Intraday Data
        //obj.intradayCandleData(chartApi,properties);
    }
}
