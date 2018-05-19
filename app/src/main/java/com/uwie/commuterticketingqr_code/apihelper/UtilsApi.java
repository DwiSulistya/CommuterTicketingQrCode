package com.uwie.commuterticketingqr_code.apihelper;

public class UtilsApi {
    // 127.0.0.1 ini adalah localhost.
    public static final String BASE_URL_API = "http://127.0.0.1/app/";

    // Mendeklarasikan Interface BaseApiService
    public static BaseApiService getAPIService(){
        return RetrofitClient.getClient(BASE_URL_API).create(BaseApiService.class);
    }
}
