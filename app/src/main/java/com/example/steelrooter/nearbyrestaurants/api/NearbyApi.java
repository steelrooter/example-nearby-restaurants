package com.example.steelrooter.nearbyrestaurants.api;

import com.example.steelrooter.nearbyrestaurants.models.NearbyApiResponse;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 *
 * <p/>
 * Created by Sachin on 02/05/16.
 */
public interface NearbyApi {
    //https://maps.googleapis.com/maps/api/?location=12.9754,77.6361

    @GET("place/nearbysearch/json?type=restaurant")
    Observable<NearbyApiResponse> getNearbyRestaurants(
            @Query("location") String location,
            @Query("radius") int radius,
            @Query("key") String key);

}
