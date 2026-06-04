# TradeBridge Java SDK

The TradeBridge Java SDK provides a simple way to integrate with TradeBridge APIs and access authentication, portfolio, order, reports, chart, margin calculator, funds, and contract master services.

---

# Prerequisites

Before using the SDK, ensure you have:

- Java 8 or later installed
- Maven installed
- A valid TradeBridge API Key
- Valid Client Credentials
- Internet connectivity to access TradeBridge APIs

---

# Installation

Clone the repository and build the project:

```bash
mvn clean install
```

---

# SDK Configuration

Open the example file:

```text
src/main/java/com/arihant/client/example/Example.java
```

Update the API configuration:

```java
constants.setApiKey("YOUR_API_KEY");
constants.setSource("SDK");
constants.setAuthString("YOUR_ACCESS_TOKEN");
```

Replace:

```text
YOUR_API_KEY
```

with the API Key provided by Arihant.

---

# Authentication

Most APIs require a valid Access Token.

## Step 1: Login

Open:

```text
src/main/java/com/arihant/client/example/Example.java
```

Update your credentials:

```java
body.setUserId("YOUR_CLIENT_ID");
body.setPassword("YOUR_PASSWORD");
```

Enable:

```java
obj.loginAPI(loginApi, properties);
```

Run the application.

The response will contain:

```text
txnId
```

Copy the `txnId`.

---

## Step 2: Verify OTP

Update the Verify OTP request with:

```java
body.setUserId("YOUR_CLIENT_ID");
body.setTxnId("YOUR_TXN_ID");
body.setOtp("YOUR_OTP");
```

Enable:

```java
obj.verifyOtp(loginApi, properties);
```

Run the application.

The response will contain:

```text
accessToken
refreshToken
```

Copy the Access Token.

---

## Step 3: Configure Access Token

Update:

```java
constants.setAuthString("YOUR_ACCESS_TOKEN");
```

Replace:

```text
YOUR_ACCESS_TOKEN
```

with the token received from OTP verification.

Authenticated APIs require a valid access token before execution.

---

# Running API Examples

All API examples are available in:

```text
src/main/java/com/arihant/client/example/Example.java
```

Open the example file and update the required credentials and request parameters.

To test an API:

1. Uncomment the API method call.
2. Update the request parameters if required.
3. Run the application.

Example:

```java
obj.doHoldings(positionControllerApi, properties);
```

The response will be printed in the console using:

```java
System.out.println("\n\nHoldingsResponse:  " +
        positionControllerApi.doHoldings(properties));
```

---

# Running the Example

Run from your IDE or using Maven:

```bash
mvn clean compile
```

or

```bash
mvn exec:java
```

You can also run:

```text
src/main/java/com/arihant/client/example/Example.java
```

directly from IntelliJ IDEA.

---

# Updating Request Parameters

Before running an API, update the request parameters according to your account and use case.

Common parameters include:

```text
userId
password
otp
txnId
accessToken
refreshToken
symbol
exchange
instrument
excToken
quantity
price
orderId
fromDate
toDate
```

Refer to the corresponding API example in:

```text
src/main/java/com/arihant/client/example/Example.java
```

---

# Typical Usage Flow

```text
1. Configure API Key
2. Open src/main/java/com/arihant/client/example/Example.java
3. Run Login API
4. Copy txnId
5. Run Verify OTP API
6. Copy accessToken
7. Update constants.setAuthString(accessToken)
8. Uncomment the API you want to test
9. Run the application
10. The response will be printed in the console
```

---

# Notes

- Ensure a valid Access Token is configured before calling authenticated APIs.
- Access Tokens may expire and need to be regenerated using Login and OTP verification.
- All request and response examples are available in:

```text
src/main/java/com/arihant/client/example/Example.java
```

- Update request values before execution based on your trading account and requirements.
