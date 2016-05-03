package com.example.steelrooter.nearbyrestaurants.models;

import com.google.gson.annotations.SerializedName;

public class Geometry {

    @SerializedName("location")
    private PlaceLocation location;

    /**
     * 
     * @return
     *     The location
     */
    public PlaceLocation getLocation() {
        return location;
    }

    /**
     * 
     * @param location
     *     The location
     */
    public void setLocation(PlaceLocation location) {
        this.location = location;
    }

}
