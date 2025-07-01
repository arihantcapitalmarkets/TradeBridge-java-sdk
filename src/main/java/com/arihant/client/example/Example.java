package com.arihant.client.example;

import com.arihant.client.ApiException;
import com.arihant.client.Pair;
import com.arihant.client.api.contractMaster.ContractMasterApi;
import com.arihant.client.api.details.ChartApi;
import com.arihant.client.api.details.FundsApi;
import com.arihant.client.api.details.LoginProfileApi;
import com.arihant.client.api.details.ProfitLossReportApi;
import com.arihant.client.api.login.LoginApi;
import com.arihant.client.api.marginCalculator.MarginCalculatorApi;
import com.arihant.client.api.order.OrderControllerApi;
import com.arihant.client.api.portfolio.PositionControllerApi;
import com.arihant.client.api.portfolio.PortfolioApi;
import com.arihant.client.constants.Constants;
import com.arihant.client.model.details.*;
import com.arihant.client.model.login.*;
import com.arihant.client.model.marginCalculator.MarginCalculatorRequest;
import com.arihant.client.model.marginCalculator.Symbol;
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
        LoginRequestBody body = new LoginRequestBody();
        body.setMobNo("9642229195");
        body.setPassword("Abcd@1818");

        System.out.println("\n\nLoginResponse: " + defaultAPI.loginPost(body, properties));

    }

    public void verifyOtp(LoginApi defaultAPI, Map<String, String> properties) throws ApiException {
        VerifyOtpRequest body = new VerifyOtpRequest();
        body.setUserId("nest8003");
        body.setTxnId("91abf5d1-4d9f-459d-b4f6-c4f076c7a5cb");
        body.setOtp("8620");

        VerifyOtpResponse verifyOtpResponse = defaultAPI.verifyOtp(body, properties);
        System.out.println("\n\nVerifyOtpResponse:   " +verifyOtpResponse);
    }

    public void resendOtp(LoginApi defaultAPI, Map<String,String> properties) throws ApiException{
        ResendOtpRequest body = new ResendOtpRequest();
        body.setUserId("nest8003");
        body.setTxnId("ca3963d8-693d-48f8-8d30-6f62943209f2");

        System.out.println("\n\nResendOtpResponse:  " + defaultAPI.resendOtp(body, properties));
    }

    public void refreshToken(LoginApi defaultAPI, Map<String, String> properties) throws ApiException {
        RefreshTokenRequest body = new RefreshTokenRequest();
        body.setUserId("nest8003");
        body.setRefreshToken("48098d0f8e494f9797147e974de682174f6f1d54515045ea84fd6fd5aee10969");

        System.out.println("\n\nRefreshTokenResponse:  " + defaultAPI.refreshToken(body, properties));
    }

    public void logout(LoginApi defaultAPI, Map<String, String> properties) throws ApiException {
        System.out.println("\n\nLogoutResponse: " + defaultAPI.logout(properties));
    }

    public void contractMaster(ContractMasterApi symbolMasterAPI, Map<String, String> properties) throws ApiException {
        String exch = "NSE";
        System.out.println("\n\nContractMasterResponse: " + symbolMasterAPI.contractMaster(properties, exch));

    }

    public void getProfile(LoginProfileApi loginProfileApi, Map<String, String> properties) throws ApiException {
        System.out.println("\n\nGetProfileResponse: " + loginProfileApi.getProfile(properties));
    }

    public void funds(FundsApi fundsApi, Map<String, String> properties) throws ApiException {
        System.out.println("\n\nFundsResponse: " + fundsApi.fundView(properties));
    }

    public void checkMargin(FundsApi fundsApi, Map<String, String> properties) throws ApiException{
        CheckMarginRequest body = new CheckMarginRequest();
        body.setSymbol("TCS-EQ");
        body.setOrdAction(CheckMarginRequest.OrdActionEnum.BUY);
        body.setAmo(false);
        body.setTriggerPrice(0.0);
        body.setLimitPrice(3200.0);
        body.setLotSize(1);
        body.setBoStpLoss(0.0);
        body.setBoTgtPrice(0.0);
        body.setInstrument(CheckMarginRequest.InstrumentEnum.STK);
        body.setOrdValidity(CheckMarginRequest.OrdValidityEnum.DAY);
        body.setExcToken("11536");
        body.setExc(CheckMarginRequest.ExcEnum.NSE);
        body.setPrdType(CheckMarginRequest.PrdTypeEnum.DELIVERY);
        body.setQty(5);
        body.setOrdType(CheckMarginRequest.OrdTypeEnum.LIMIT);

        System.out.println("\n\nCheckMarginResponse: " + fundsApi.checkMargin(body, properties));
    }

    public void placeOrder(OrderControllerApi orderApi, Map<String, String> properties) throws ApiException {
        PlaceOrderRequest body = new PlaceOrderRequest();
        body.setSymbol("TCS-EQ");
        body.setExcToken("11536");
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
        body.setBoStpLoss(0.0);
        body.setBoTgtPrice(0.0);
        body.setTrailingSL(0.0);
        body.setRemarks("place-order");

        String latitude = "5.666";
        String longitude = "";

        PlaceOrderResponse response = orderApi.placeOrder(body, properties, latitude, longitude);
        System.out.println("\n\nPlaceOrderResponse: " + response);
        orderId = response.getRespnseData().getOrdId();
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
        requestBody.setSymbol("TCS-EQ");
        requestBody.setOrdId(orderId);
        requestBody.setOrdAction(ModifyOrderRequest.OrdActionEnum.BUY);
        requestBody.limitPrice(192.55);
        requestBody.setDisQty(0);
        requestBody.setOrdValidity(ModifyOrderRequest.OrdValidityEnum.DAY);
        requestBody.setTradedQty(0);
        requestBody.setOrdValidityDays(0);
        requestBody.setExchangeToken("13528");
        requestBody.setAmo(false);
        requestBody.setRemarks("modify-order");

        String latitude = "4";
        String longitude = "9.888";
        System.out.println("\n\nModifyOrderResponse: " + orderApi.modifyOrder(requestBody, properties, latitude, longitude));
    }

    public void cancelOrder(OrderControllerApi orderApi, Map<String, String> properties) throws ApiException {
        CancelOrderRequest requestBody = new CancelOrderRequest();
        requestBody.setSymbol("TCS-EQ");
        requestBody.setOrdId(orderId);
        requestBody.setExc(CancelOrderRequest.ExcEnum.NSE);
        requestBody.setRemarks("cancel-order");

        String latitude = "";
        String longitude = "0.77";

        System.out.println("\n\nCancelOrderResponse: " + orderApi.cancelOrder(requestBody, properties, latitude, longitude));
    }

    public void exitOrder(OrderControllerApi orderApi, Map<String, String> properties) throws ApiException {
        ExitOrderRequest requestBody = new ExitOrderRequest();
        requestBody.setBoOrdStatus("complete");
        requestBody.setSymbol("TCS-EQ");
        requestBody.setOrdId(orderId);
        requestBody.setParOrdId(orderId);
        requestBody.setExc(ExitOrderRequest.ExcEnum.NSE);
        requestBody.setPrdType(ExitOrderRequest.PrdTypeEnum.COVER_ORDER);
        requestBody.setRemarks("exit-order");

        String latitude = "3.22";
        String longitude = "1.6666";
        System.out.println("\n\nExitOrderResponse: " + orderApi.exitOrder(requestBody, properties, latitude, longitude));
    }

    public void brokerageChargeResponse(OrderControllerApi orderApi, Map<String, String> properties) throws ApiException {
        BrokerageChargeRequest requestBody = new BrokerageChargeRequest();
        requestBody.setSymbol("TCS-EQ");
        requestBody.setExc(BrokerageChargeRequest.ExcEnum.NSE);
        requestBody.setPrdType(BrokerageChargeRequest.ProductEnum.INTRADAY);
        requestBody.setTriggerPrice("");
        requestBody.setPrice("3489.80");
        requestBody.setQty("10000000");
        requestBody.setInstrument(BrokerageChargeRequest.InstrumentEnum.STK);
        requestBody.setOrdAction(BrokerageChargeRequest.OrderActionEnum.SELL);
        requestBody.setExcToken("11536");
        requestBody.setOrdType(BrokerageChargeRequest.OrdTypeEnum.MARKET);

        System.out.println("\n\nBrokerageChargesResponse: " + orderApi.brokerageCharges(requestBody, properties));
    }

    public void marginCalculator(MarginCalculatorApi marginCalculatorApi, Map<String,String> properties) throws ApiException{
        Symbol symbol = new Symbol();
        symbol.setSymbol("BANKNIFTY25MARFUT");
        symbol.setNetQty(1);
        symbol.setLotSize(1);
        symbol.setInstrument(PlaceOrderRequest.InstrumentEnum.FUTIDX);
        symbol.setStreamSym("58958_NFO");
        symbol.setExcToken("58958");
        symbol.setExc(ModifyOrderRequest.ExcEnum.NFO);
        symbol.setPrdType(BrokerageChargeRequest.ProductEnum.DELIVERY);
        symbol.setBrand(new ArrayList<>());

        MarginCalculatorRequest request = new MarginCalculatorRequest();
        List<Symbol> symbolList = new ArrayList<>();
        symbolList.add(symbol);
        request.setSymbols(symbolList);

        System.out.println("\n\nMarginCalculatorResponse: " + marginCalculatorApi.marginCalculator(request, properties));
    }

    public void getOrderBook(PortfolioApi portfolioAPI, Map<String, String> properties) throws ApiException {
        System.out.println("\n\nOrderBookResponse: " + portfolioAPI.getOrderBook(properties));
    }

    public void orderTrail(PortfolioApi portfolioApi, Map<String, String> properties) throws ApiException {
        OrderTrailRequest requestBody = new OrderTrailRequest();
        requestBody.setInstrument(OrderTrailRequest.InstrumentEnum.STK);
        requestBody.setOrdId("25050900000002");

        System.out.println("\n\nOrderTrailResponse: " + portfolioApi.orderTrail(requestBody, properties));
    }

    public void orderStatus(PortfolioApi portfolioApi, Map<String, String> properties) throws ApiException {
        OrderTrailRequest request = new OrderTrailRequest();
        request.setInstrument(OrderTrailRequest.InstrumentEnum.STK);
        request.setOrdId("25050900000002");

        System.out.println("\n\nOrderStatusResponse: " + portfolioApi.orderStatus(request, properties));
    }

    public void getPositionBook(PositionControllerApi positionControllerApi, Map<String, String> properties) throws ApiException {
        List<Pair> query = new ArrayList<>();
        query.add(new Pair("type", "net"));
        System.out.println("\n\nPositionBookResponse: " + positionControllerApi.getPositionBook(query, properties));
    }

    public void convertPosition(PositionControllerApi positionControllerApi, Map<String, String> properties) throws ApiException {
        PositionConversionRequest req = new PositionConversionRequest();
        req.setExc(PositionConversionRequest.ExcEnum.NSE);
        req.setExcToken("11536");
        req.setInstrument(PositionConversionRequest.InstrumentEnum.STK);
        req.setQty(1);
        req.setSymbol("TCS-EQ");
        req.setLotSize(1);
        req.setOrdAction(PositionConversionRequest.OrdActionEnum.SELL);
        req.setPrdType(PositionConversionRequest.PrdTypeEnum.INTRADAY);
        req.setToPrdType(PositionConversionRequest.ToPrdTypeEnum.DELIVERY);
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
        constants.setApiKey("yXAtQFJQSL4tKLdHSo");

        System.out.println("\n\nHistoricalCandleDataResponse :  " +
                chartApi.historicalData("TCS-EQ",
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
        constants.setApiKey("yXAtQFJQSL4tKLdHSo");

        IntradayCandleDataRequest data = new IntradayCandleDataRequest();
        data.setSymbol("JIOFIN-EQ");
        data.setResolution("1day");
        data.setExc(ModifyOrderRequest.ExcEnum.NSE);
        data.setInstrument(PlaceOrderRequest.InstrumentEnum.STK);
        data.setStartTime("2025-04-04T00:00:00.000");
        data.setEndTime("2025-04-04T15:00:00.000");

        System.out.println("\n\nIntradayCandleDataResponse: " + chartApi.intraday(data, properties));
    }


    public static void main(String[] args) throws ApiException {
        Map<String, String> properties = readProperties(CONFIG_FILE_PATH);

        Example obj = new Example(constants);

        LoginApi loginApi = new LoginApi(constants);
        OrderControllerApi orderApi = new OrderControllerApi(constants);
        PortfolioApi portfolioApi = new PortfolioApi(constants);
        PositionControllerApi positionControllerApi = new PositionControllerApi(constants);
        ProfitLossReportApi profitLossReportApi = new ProfitLossReportApi(constants);
        ChartApi chartApi = new ChartApi(constants);
        LoginProfileApi loginProfileApi = new LoginProfileApi(constants);
        FundsApi fundsApi = new FundsApi(constants);
        ContractMasterApi contractMasterApi = new ContractMasterApi(constants);
        MarginCalculatorApi marginCalculatorApi =  new MarginCalculatorApi(constants);

        constants.setApiKey("iGD1BESV8CXS71NeYj");
        constants.setSource("SDK");

        constants.setAuthString("eyJhbGciOiJIUzUxMiJ9.eyJhcHAtaWQiOiIwMTNkODI3Zi0xMjllLTRiNTMtYWM0Ni1lMzU2MjVmMDNmZjkiLCJsaW1pdCI6IkJBU0lDIiwic291cmNlIjoiU0RLIiwic3ViIjoiTkVTVDgwMDMiLCJpYXQiOjE3NDcwMzI0MzQsImV4cCI6MTc0NzA2MTIzNH0.8FeHO3pXyjb124UDlmMM64jGzYbgVK2DOqtL9VzVvWJjMqsfF3581ZoFx_v7SurgkH_ToNASJFGWXckbtpHuyA");

        // login
        obj.login(loginApi, properties);

        //verify-otp
       //obj.verifyOtp(loginApi, properties);

        //resend-otp
       // obj.resendOtp(loginApi, properties);

        //refresh-Token
        //obj.refreshToken(loginApi, properties);

        //logout
        //obj.logout(loginApi, properties);

        //contractMaster
        //obj.contractMaster(contractMasterApi, properties);

        //get-profile
        //obj.getProfile(loginProfileApi,properties);

        //funds
       //obj.funds(fundsApi,properties);

        //checkMargin
        //obj.checkMargin(fundsApi, properties);

        // place order
        //obj.placeOrder(orderApi, properties);

        // modify Order
        //obj.modifyOrder(orderApi, properties);

        // cancel order
        //obj.cancelOrder(orderApi, properties);

        // exit order
        //obj.exitOrder(orderApi,properties);

        //Brokerage Charges
        //obj.brokerageChargeResponse(orderApi,properties);

        //Margin Calculator
        //obj.marginCalculator(marginCalculatorApi, properties);

        // order book
        //obj.getOrderBook(portfolioApi, properties);

        //order trail
        //obj.orderTrail(portfolioApi, properties);

        //order Status
         //obj.orderStatus(portfolioApi,properties);

        // Holdings
        //obj.doHoldings(positionControllerApi,properties);

        // position book
        //obj.getPositionBook(positionControllerApi, properties);

        // convert position
        //obj.convertPosition(positionControllerApi,properties);

        // profit loss cash report
        //obj.profitLossCashReport(profitLossReportApi,properties);

        //profit loss fo report
        //obj.profitLossFoReport(profitLossReportApi,properties);

        //historical Data
        //obj.historicalCandleData(chartApi,properties);

        //Intraday Data
        //obj.intradayCandleData(chartApi,properties);

    }
}
