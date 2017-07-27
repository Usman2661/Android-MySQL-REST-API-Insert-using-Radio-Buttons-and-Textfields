package com.example.usmanali.samplemarker;

import retrofit.Callback;
import retrofit.client.Response;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

/**
 * Created by Belal on 11/5/2015.
 */
public interface RegisterAPI {
    @FormUrlEncoded
    @POST("/mysqlrest/SafeStatus.php")
    public void insertUser(
            @Field("event") String event,
            @Field("status") String status,
            @Field("notes") String notes,
            Callback<Response> callback);
}




