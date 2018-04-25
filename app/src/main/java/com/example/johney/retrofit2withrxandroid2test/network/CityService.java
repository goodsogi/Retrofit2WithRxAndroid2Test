package com.example.johney.retrofit2withrxandroid2test.network;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by johney on 2018-04-25.
 */

public interface CityService {

    @GET("citiesJSON")
    Single<CityResponse> queryGeonames(@Query("north") double north, @Query("south") double south,
                                                       @Query("east") double east,
                                                       @Query("west") double west,
                                                       @Query("lang") String lang);
}
