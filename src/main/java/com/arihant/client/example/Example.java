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
import com.arihant.client.enums.*;
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

    public void loginAPI(LoginApi defaultAPI, Map<String, String> properties) throws ApiException {
        LoginRequestBody body = new LoginRequestBody();
        body.setUserId("nest**3");
        body.setPassword("aaa***11");

        System.out.println("\n\nLoginResponse: " + defaultAPI.loginPost(body, properties));

    }

    public void verifyOtp(LoginApi defaultAPI, Map<String, String> properties) throws ApiException {
        VerifyOtpRequest body = new VerifyOtpRequest();
        body.setUserId("nest**3");
        body.setTxnId("667febc8-89da-4655-8c93-4247646c785f");
        body.setOtp("434489");

        VerifyOtpResponse verifyOtpResponse = defaultAPI.verifyOtp(body, properties);
        System.out.println("\n\nVerifyOtpResponse:   " +verifyOtpResponse);
    }

    public void resendOtp(LoginApi defaultAPI, Map<String,String> properties) throws ApiException{
        ResendOtpRequest body = new ResendOtpRequest();
        body.setUserId("nest**3");
        body.setTxnId("667febc8-89da-4655-8c93-4247646c785f");

        System.out.println("\n\nResendOtpResponse:  " + defaultAPI.resendOtp(body, properties));
    }

    public void refreshToken(LoginApi defaultAPI, Map<String, String> properties) throws ApiException {
        RefreshTokenRequest body = new RefreshTokenRequest();
        body.setUserId("nest**3");
        body.setRefreshToken("b553167f53d04cabbb4471d41f60a810a107a23264a24741b8962c39fb851829");

        System.out.println("\n\nRefreshTokenResponse:  " + defaultAPI.refreshToken(body, properties));
    }

    public void logout(LoginApi defaultAPI, Map<String, String> properties) throws ApiException {
        System.out.println("\n\nLogoutResponse: " + defaultAPI.logout(properties));
    }

    public void contractMaster(ContractMasterApi symbolMasterAPI, Map<String, String> properties) throws ApiException {
        String exch = "NSE";
        System.out.println("\n\nContractMasterResponse: " + symbolMasterAPI.contractMaster(properties, exch));

    }

    public void surveillanceSymbols(ContractMasterApi symbolMasterAPI, Map<String, String> properties) throws ApiException {
        System.out.println("\n\nSurveillanceSymbolsResponse: " + symbolMasterAPI.survSymbols(properties));
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
        body.setOrdAction(OrdActionEnum.BUY);
        body.setAmo(false);
        body.setTriggerPrice(0.0);
        body.setLimitPrice(3200.0);
        body.setLotSize(1);
        body.setBoStpLoss(0.0);
        body.setBoTgtPrice(0.0);
        body.setInstrument(InstrumentEnum.STK);
        body.setOrdValidity(OrdValidityEnum.DAY);
        body.setExcToken("11536");
        body.setExc(ExcEnum.NSE);
        body.setPrdType(PrdTypeEnum.DELIVERY);
        body.setQty(5);
        body.setOrdType(OrdTypeEnum.LIMIT);

        System.out.println("\n\nCheckMarginResponse: " + fundsApi.checkMargin(body, properties));
    }

    public void placeOrder(OrderControllerApi orderApi, Map<String, String> properties) throws ApiException {
        PlaceOrderRequest body = new PlaceOrderRequest();
        body.setSymbol("TCS-EQ");
        body.setExcToken("11536");
        body.setOrdAction(OrdActionEnum.BUY);
        body.setOrdValidity(OrdValidityEnum.DAY);
        body.setOrdType(OrdTypeEnum.MARKET);
        body.setPrdType(PrdTypeEnum.DELIVERY);
        body.setQty(1);
        body.setTriggerPrice(0.0);
        body.setLimitPrice(0.0);
        body.setDisQty(0);
        body.setInstrument(InstrumentEnum.STK);
        body.setExc(ExcEnum.NSE);
        body.setLotSize(1);
        body.setAmo(false);
        body.setBuild("MOB");
        body.setBoStpLoss(0.0);
        body.setBoTgtPrice(0.0);
        body.setTrailingSL(0.0);
        body.setRemarks("place-order");
        body.setExcAlgoId("");

        String latitude = "5.666";
        String longitude = "";

        PlaceOrderResponse response = orderApi.placeOrder(body, properties, latitude, longitude);
        System.out.println("\n\nPlaceOrderResponse: " + response);
        orderId = response.getRespnseData().getOrdId();
    }

    public void modifyOrder(OrderControllerApi orderApi, Map<String, String> properties) throws ApiException {
        ModifyOrderRequest requestBody = new ModifyOrderRequest();
        requestBody.setTriggerPrice(0.0);
        requestBody.setOrdType(OrdTypeEnum.MARKET);
        requestBody.setPrdType(PrdTypeEnum.CASH);
        requestBody.setInstrument(InstrumentEnum.STK);
        requestBody.setExc(ExcEnum.NSE);
        requestBody.setQty(5);
        requestBody.setLotSize(0);
        requestBody.setSymbol("TCS-EQ");
        requestBody.setOrdId("260514000000155");
        requestBody.setOrdAction(OrdActionEnum.BUY);
        requestBody.limitPrice(192.55);
        requestBody.setDisQty(0);
        requestBody.setOrdValidity(OrdValidityEnum.DAY);
        requestBody.setTradedQty(0);
        requestBody.setOrdValidityDays(0);
        requestBody.setExchangeToken("11536");
        requestBody.setAmo(false);

        String latitude = "4";
        String longitude = "9.888";
        System.out.println("\n\nModifyOrderResponse: " + orderApi.modifyOrder(requestBody, properties, latitude, longitude));
    }

    public void cancelOrder(OrderControllerApi orderApi, Map<String, String> properties) throws ApiException {
        CancelOrderRequest requestBody = new CancelOrderRequest();
        requestBody.setSymbol("TCS-EQ");
        requestBody.setOrdId("260514000000155");
        requestBody.setExc(ExcEnum.NSE);

        String latitude = "";
        String longitude = "0.77";

        System.out.println("\n\nCancelOrderResponse: " + orderApi.cancelOrder(requestBody, properties, latitude, longitude));
    }

    public void exitOrder(OrderControllerApi orderApi, Map<String, String> properties) throws ApiException {
        ExitOrderRequest requestBody = new ExitOrderRequest();
        requestBody.setBoOrdStatus("complete");
        requestBody.setSymbol("TCS-EQ");
        requestBody.setOrdId("260514000000155");
        requestBody.setParOrdId("260514000000155");
        requestBody.setExc(ExcEnum.NSE);
        requestBody.setPrdType(PrdTypeEnum.COVER_ORDER);

        String latitude = "3.22";
        String longitude = "1.6666";
        System.out.println("\n\nExitOrderResponse: " + orderApi.exitOrder(requestBody, properties, latitude, longitude));
    }

    public void brokerageChargeResponse(OrderControllerApi orderApi, Map<String, String> properties) throws ApiException {
        BrokerageChargeRequest requestBody = new BrokerageChargeRequest();
        requestBody.setSymbol("TCS-EQ");
        requestBody.setExc(ExcEnum.NSE);
        requestBody.setPrdType(PrdTypeEnum.INTRADAY);
        requestBody.setTriggerPrice("");
        requestBody.setPrice("3489.80");
        requestBody.setQty("10");
        requestBody.setInstrument(InstrumentEnum.STK);
        requestBody.setOrdAction(OrdActionEnum.SELL);
        requestBody.setExcToken("11536");
        requestBody.setOrdType(OrdTypeEnum.MARKET);

        System.out.println("\n\nBrokerageChargesResponse: " + orderApi.brokerageCharges(requestBody, properties));
    }

    public void marginCalculator(MarginCalculatorApi marginCalculatorApi, Map<String,String> properties) throws ApiException{
        Symbol symbol = new Symbol();
        symbol.setSymbol("BANKNIFTY26JUL70100CE");
        symbol.setNetQty(1);
        symbol.setLotSize(1);
        symbol.setInstrument(InstrumentEnum.OPTIDX);
        symbol.setStreamSym("62278_NFO");
        symbol.setExcToken("62278");
        symbol.setExc(ExcEnum.NFO);
        symbol.setPrdType(PrdTypeEnum.DELIVERY);
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
        requestBody.setInstrument(InstrumentEnum.STK);
        requestBody.setOrdId("260515000000004");

        System.out.println("\n\nOrderTrailResponse: " + portfolioApi.orderTrail(requestBody, properties));
    }

    public void orderStatus(PortfolioApi portfolioApi, Map<String, String> properties) throws ApiException {
        OrderTrailRequest request = new OrderTrailRequest();
        request.setInstrument(InstrumentEnum.STK);
        request.setOrdId("260515000000004");

        System.out.println("\n\nOrderStatusResponse: " + portfolioApi.orderStatus(request, properties));
    }

    public void getPositionBook(PositionControllerApi positionControllerApi, Map<String, String> properties) throws ApiException {
        List<Pair> query = new ArrayList<>();
        query.add(new Pair("type", "net"));
        System.out.println("\n\nPositionBookResponse: " + positionControllerApi.getPositionBook(query, properties));
    }

    public void convertPosition(PositionControllerApi positionControllerApi, Map<String, String> properties) throws ApiException {
        PositionConversionRequest req = new PositionConversionRequest();
        req.setExc(ExcEnum.NSE);
        req.setExcToken("11536");
        req.setInstrument(InstrumentEnum.STK);
        req.setQty(1);
        req.setSymbol("TCS-EQ");
        req.setLotSize(1);
        req.setOrdAction(OrdActionEnum.SELL);
        req.setPrdType(PrdTypeEnum.INTRADAY);
        req.setToPrdType(PrdTypeEnum.DELIVERY);
        req.setType("DAY1");
        System.out.println("\n\nConvertPositionResponse: " + positionControllerApi.convertPosition(req, properties));
    }


    public void doHoldings(PositionControllerApi positionControllerApi, Map<String, String> properties) throws ApiException {
        System.out.println("\n\nHoldingsResponse:  " + positionControllerApi.doHoldings(properties));
    }

    public void profitLossCashReport(ProfitLossReportApi profitLossReportApi, Map<String, String> properties) throws ApiException {
        ProfitLossCashReportRequest requestBody = new ProfitLossCashReportRequest();
        List<ReportFilters> filters = new ArrayList<>();
        filters.add(new ReportFilters("date", "13/04/2026-15/04/2026"));
        filters.add(new ReportFilters("charges", "incCharges"));
        filters.add(new ReportFilters("finYear", "2026-2027"));
        requestBody.setFilters(filters);

        System.out.println("\n\nProfitLossCashReportResponse:  " + profitLossReportApi.profitLossCashReport(requestBody, properties));
    }

    public void profitLossFoReport(ProfitLossReportApi profitLossReportApi, Map<String, String> properties) throws ApiException {
        ProfitLossFoReportRequest requestBody = new ProfitLossFoReportRequest();
        List<ReportFilters> filters = new ArrayList<>();
        filters.add(new ReportFilters("date", "01/01/2026-13/04/2026"));
        filters.add(new ReportFilters("charges", "incCharges"));
        filters.add(new ReportFilters("exc", "ALL"));
        filters.add(new ReportFilters("finYear", "2025-2026"));
        requestBody.setFilters(filters);

        System.out.println("\n\nProfitLossFoResponse:  " + profitLossReportApi.profitLossFoReport(requestBody, properties));
    }

    public void ledgerReport(ProfitLossReportApi profitLossReportApi, Map<String, String> properties) throws ApiException {
        LedgerReportRequest requestBody = new LedgerReportRequest();
        List<ReportFilters> filters = new ArrayList<>();
        filters.add(new ReportFilters("date", "22/03/2026-22/04/2026"));
        filters.add(new ReportFilters("prdtCd", "10"));
        filters.add(new ReportFilters("finYear", "2026-2027"));
        requestBody.setFilters(filters);

        System.out.println("\n\nLedgerReportResponse:  " + profitLossReportApi.ledgerReport(requestBody, properties));
    }

    public void taxPnLEquityReport(ProfitLossReportApi profitLossReportApi, Map<String, String> properties) throws ApiException {
        TaxPnLEquityRequest requestBody = new TaxPnLEquityRequest();
        List<ReportFilters> filters = new ArrayList<>();
        filters.add(new ReportFilters("date", "01/04/2025-31/03/2026"));
        filters.add(new ReportFilters("charges", "incCharges"));
        filters.add(new ReportFilters("finYear", "2026-2027"));
        requestBody.setFilters(filters);

        System.out.println("\n\nTaxPnLEquityReportResponse:  " + profitLossReportApi.taxPnLEquityReport(requestBody, properties));
    }

    public void taxPnLFoReport(ProfitLossReportApi profitLossReportApi, Map<String, String> properties) throws ApiException {
        TaxPnLFoRequest requestBody = new TaxPnLFoRequest();
        List<ReportFilters> filters = new ArrayList<>();
        filters.add(new ReportFilters("date", "01/04/2025-31/03/2026"));
        filters.add(new ReportFilters("charges", "incCharges"));
        filters.add(new ReportFilters("finYear", "2026-2027"));
        filters.add(new ReportFilters("exc", "ALL"));
        requestBody.setFilters(filters);

        System.out.println("\n\nTaxPnLFoReportResponse:  " + profitLossReportApi.taxPnLFoReport(requestBody, properties));
    }

    public void dpHoldings(ProfitLossReportApi profitLossReportApi, Map<String, String> properties) throws ApiException {
        DpHoldingsRequest requestBody = new DpHoldingsRequest();
        requestBody.setDate("22/04/2026");
        requestBody.setDpName("NSDL");

        System.out.println("\n\nDpHoldingsResponse:  " + profitLossReportApi.dpHoldings(requestBody, properties));
    }

    public void tradeHistory(ProfitLossReportApi profitLossReportApi, Map<String, String> properties) throws ApiException {
        TradeHistoryRequest requestBody = new TradeHistoryRequest();
        List<TradeHistoryMultiFilter> multiFilters = new ArrayList<>();
        multiFilters.add(new TradeHistoryMultiFilter("actualExc", Arrays.asList("NSE", "CDS", "BFO")));
        multiFilters.add(new TradeHistoryMultiFilter("ordAction", Arrays.asList("BUY", "SELL")));
        requestBody.setFrmDte("01/05/2026");
        requestBody.setToDte("08/05/2026");
        requestBody.setMultiFilters(multiFilters);
        System.out.println("\n\nTradeHistoryResponse:  " + profitLossReportApi.tradeHistory(requestBody, properties));
    }

    public void historicalCandleData(ChartApi chartApi, Map<String, String> properties) throws ApiException {
        constants.setApiKey("EkXn*******UKfCC");

        System.out.println("\n\nHistoricalCandleDataResponse :  " +
                chartApi.historicalData("TCS-EQ",
                        "1day",
                        "2023-02-01T17:55:00.000",
                        "2024-02-01T17:55:00.000",
                        InstrumentEnum.STK,
                        "NSE",
                        "12193_NSE",
                        properties
                )
        );

    }

    public void intradayCandleData(ChartApi chartApi, Map<String, String> properties) throws ApiException {
        constants.setApiKey("EkXn*******UKfCC");

        IntradayCandleDataRequest data = new IntradayCandleDataRequest();
        data.setSymbol("JIOFIN-EQ");
        data.setResolution("1day");
        data.setExc(ExcEnum.NSE);
        data.setInstrument(InstrumentEnum.STK);
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

        constants.setApiKey("1QSa*****z8JbOe");
        constants.setSource("SDK");
        constants.setAuthString("eyJhbGciOiJIUzUxM*****************-oPJg2Bw");


        // login API
        obj.loginAPI(loginApi, properties);

        //verify-otp
        //obj.verifyOtp(loginApi, properties);

        //resend-otp
        //obj.resendOtp(loginApi, properties);

        //refresh-Token
        //obj.refreshToken(loginApi, properties);

        //logout
        //obj.logout(loginApi, properties);

        //contractMaster
        //obj.contractMaster(contractMasterApi, properties);

        //Surveillance Symbols
        //obj.surveillanceSymbols(contractMasterApi, properties);

        //get-profile
        //obj.getProfile(loginProfileApi, properties);

        //funds
        //obj.funds(fundsApi, properties);

        //checkMargin
        //obj.checkMargin(fundsApi, properties);

        // place order
        //obj.placeOrder(orderApi, properties);

        // modify Order
        //obj.modifyOrder(orderApi, properties);

        // cancel order
        //obj.cancelOrder(orderApi, properties);

        // exit order
        //obj.exitOrder(orderApi, properties);

        //Brokerage Charges
        //obj.brokerageChargeResponse(orderApi, properties);

        //Margin Calculator
        //obj.marginCalculator(marginCalculatorApi, properties);

        // order book
        //obj.getOrderBook(portfolioApi, properties);

        //order trail
        //obj.orderTrail(portfolioApi, properties);

        //order Status
         //obj.orderStatus(portfolioApi, properties);

        // Holdings
        //obj.doHoldings(positionControllerApi, properties);

        // position book
        //obj.getPositionBook(positionControllerApi, properties);

        // convert position
        //obj.convertPosition(positionControllerApi, properties);

        // profit loss cash report
        //obj.profitLossCashReport(profitLossReportApi, properties);

        //profit loss fo report
        //obj.profitLossFoReport(profitLossReportApi, properties);

        //Ledger Report
        //obj.ledgerReport(profitLossReportApi, properties);

        //Tax Profit and Loss Equity Report
        //obj.taxPnLEquityReport(profitLossReportApi, properties);

        //Tax Profit and Loss Fo Report
        //obj.taxPnLFoReport(profitLossReportApi, properties);

        //Dp Holdings
        //obj.dpHoldings(profitLossReportApi, properties);

        //Trade History
        //obj.tradeHistory(profitLossReportApi, properties);

        //Historical Data
        //obj.historicalCandleData(chartApi, properties);

        //Intraday Data
        //obj.intradayCandleData(chartApi, properties);

    }
}
