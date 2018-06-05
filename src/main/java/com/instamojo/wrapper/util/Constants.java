package com.instamojo.wrapper.util;

/**
 * The Class Constants.
 */
public class Constants {

    /**
     * Instantiates a new constants.
     */
    private Constants() {
    }

    /**
     * The Constant INSTAMOJO_API_ENDPOINT. Every API request is made to a
     * method on top of this base URL. HTTPS is mandatory.
     */
    public static final String INSTAMOJO_LIVE_API_ENDPOINT = "https://www.instamojo.com/v2/";

    public static final String INSTAMOJO_TEST_API_ENDPOINT = "https://test.instamojo.com/v2/";

    /**
     * The constant INSTAMOJO_AUTH_ENDPOINT.
     */
    public static final String INSTAMOJO_LIVE_AUTH_ENDPOINT = "https://www.instamojo.com/oauth2/token/";

    public static final String INSTAMOJO_TEST_AUTH_ENDPOINT = "https://test.instamojo.com/oauth2/token/";

    /**
     * The constant CLIENT_ID.
     */
    public static final String CLIENT_ID = "client_id";

    /**
     * The constant CLIENT_SECRET.
     */
    public static final String CLIENT_SECRET = "client_secret";

    /**
     * The constant GRANT_TYPE.
     */
    public static final String GRANT_TYPE = "grant_type";

    /**
     * The constant GRANT_TYPE.
     */
    public static final String REFRESH_TOKEN = "refresh_token";

    /**
     * The constant CLIENT_CREDENTIALS.
     */
    public static final String CLIENT_CREDENTIALS = "client_credentials";

    /**
     * The constant REFRESH_TOKEN.
     */
    public static final String GRAND_REFRESH_TOKEN = "refresh_token";

    /**
     * The constant AUTHORIZATION.
     */
    public static final String AUTHORIZATION = "Authorization";

    /**
     * The constant PAYMENT_ORDER_API_PATH.
     */
    public static final String PAYMENT_ORDER_API_PATH = "gateway/orders/";

    /**
     * The constant REFUND_API_PATH.
     */
    public static final String REFUND_API_PATH = "payments/";

    public static final String INVOICE_API_PATH = "invoices/";

    public static final String PAYOUT_API_PATH = "payouts/";

    public static final String PAYMENT_REQUEST_API_PATH = "payment_requests/";

    public static final String BULK_PAYMENT_REQUEST_API_PATH = "bulk-payment-requests/";
}
