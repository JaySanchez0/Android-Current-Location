package com.locationapp

import android.location.Location
import android.location.LocationListener
import android.os.Bundle

class MeLocationListener:LocationListener{

    private var activity:MainActivity?

    constructor(activity:MainActivity?){
        this.activity = activity
    }

    override fun onLocationChanged(location: Location) {
        println("----------------- Location ----------"+location.longitude.toString()+" "+location.latitude.toString())
        activity?.setLocation("----------------- Location ----------"+location.longitude.toString()+" "+location.latitude.toString())
    }

    override fun onStatusChanged(provider: String?, status: Int, extras: Bundle?) {

    }

    @Override
    override fun onProviderEnabled(provider: String) {

    }

    override fun onProviderDisabled(provider: String) {

    }
}